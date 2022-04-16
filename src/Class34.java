// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.awt.*;
import java.awt.image.*;

public class Class34
        implements ImageProducer, ImageObserver {

    public final boolean aBoolean569;
    public final int anInt570;
    public final int[] anIntArray571;
    public final int anInt572;
    public final int anInt573;
    public final ColorModel aColorModel574;
    public ImageConsumer anImageConsumer575;
    public final Image anImage576;

    public Class34(int i, int j, int k, Component component) {
        aBoolean569 = true;
        anInt570 = 2;
        anInt572 = k;
        anInt573 = i;
        anIntArray571 = new int[k * i];
        aColorModel574 = new DirectColorModel(32, 0xff0000, 65280, 255);
        if (j < anInt570 || j > anInt570) {
            for (int l = 1; l > 0; l++) ;
        }
        anImage576 = component.createImage(this);
        method274();
        component.prepareImage(anImage576, this);
        method274();
        component.prepareImage(anImage576, this);
        method274();
        component.prepareImage(anImage576, this);
        method272(aBoolean569);
    }

    public void method272(boolean flag) {
        if (!flag) {
            for (int i = 1; i > 0; i++) ;
        }
        Class44_Sub3_Sub1.method406(anInt572, anInt573, anIntArray571, 9);
    }

    public void method273(int i, Graphics g, byte byte0, int j) {
        method274();
        g.drawImage(anImage576, i, j, this);
        if (byte0 == 76) ;
    }

    public synchronized void addConsumer(ImageConsumer imageconsumer) {
        anImageConsumer575 = imageconsumer;
        imageconsumer.setDimensions(anInt572, anInt573);
        imageconsumer.setProperties(null);
        imageconsumer.setColorModel(aColorModel574);
        imageconsumer.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer imageconsumer) {
        return anImageConsumer575 == imageconsumer;
    }

    public synchronized void removeConsumer(ImageConsumer imageconsumer) {
        if (anImageConsumer575 == imageconsumer)
            anImageConsumer575 = null;
    }

    public void startProduction(ImageConsumer imageconsumer) {
        addConsumer(imageconsumer);
    }

    public void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
        System.out.println("TDLR");
    }

    public synchronized void method274() {
        if (anImageConsumer575 == null) {
        } else {
            anImageConsumer575.setPixels(0, 0, anInt572, anInt573, aColorModel574, anIntArray571, 0, anInt572);
            anImageConsumer575.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image image, int i, int j, int k, int l, int i1) {
        return true;
    }
}
