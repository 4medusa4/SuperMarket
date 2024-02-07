package com.cart.view;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class Camera extends javax.swing.JDialog implements Runnable, ThreadFactory {
    
    public Camera(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initializeWebcam();
        running = true;
    }
    
    public void initializeWebcam() {
        Dimension size = WebcamResolution.QVGA.getSize();
        cam = Webcam.getWebcams().get(0);
        cam.setViewSize(size);
        panel = new WebcamPanel(cam);
        panel.setPreferredSize(size);
        panel.setFPSDisplayed(true);
        pnl_camera.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 250));
        executor.execute(this);
    }
    
    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep(200);
                Result result;
                BufferedImage image;
                if (cam.isOpen() && (image = cam.getImage()) != null) {
                    LuminanceSource source = new BufferedImageLuminanceSource(image);
                    BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
                    result = new MultiFormatReader().decode(bitmap);
                    if (result != null) {
                        this.setCode(result.getText());
                        this.dispose();
                    }
                }
            } catch (NotFoundException | NullPointerException | InterruptedException e) {}
        }
    }
    
    private void stop() {
        running = false;
    }
    
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r, "td_Camera");
        thread.setDaemon(true);
        return thread;
    }

    private void setCode(String code) {
        this.code =  code;
    }

    public String getCode() {
        return code;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_camera = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Camera");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(320, 250));
        setResizable(false);
        setSize(new java.awt.Dimension(320, 250));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pnl_camera.setMinimumSize(new java.awt.Dimension(320, 250));
        pnl_camera.setPreferredSize(new java.awt.Dimension(320, 250));
        pnl_camera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(pnl_camera);

        setBounds(0, 0, 336, 289);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if(cam.isOpen())
            cam.close();
        stop();
    }//GEN-LAST:event_formWindowClosed

    private WebcamPanel panel = null;
    private Webcam cam = null;
    private static final long serialVersionUID = 6441489157408381878L;
    private final Executor executor = Executors.newSingleThreadExecutor(this);
    private boolean running;

    private String code;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnl_camera;
    // End of variables declaration//GEN-END:variables
}
