// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Class7
        implements Runnable {

    public int anInt194;
    public final int anInt195;
    public boolean aBoolean196;
    public InputStream anInputStream197;
    public OutputStream anOutputStream198;
    public Socket aSocket199;
    public boolean aBoolean200;
    public final Applet_Sub1 anApplet_Sub1_201;
    public byte[] aByteArray202;
    public int anInt203;
    public int anInt204;
    public boolean aBoolean205;
    public boolean aBoolean206;
    public Class7(int i, Socket socket, Applet_Sub1 applet_sub1)
            throws IOException {
        anInt194 = 416;
        anInt195 = -2584;
        aBoolean196 = false;
        aBoolean200 = false;
        aBoolean205 = false;
        aBoolean206 = false;
        anApplet_Sub1_201 = applet_sub1;
        if (i >= 0) {
            throw new NullPointerException();
        } else {
            aSocket199 = socket;
            aSocket199.setSoTimeout(30000);
            aSocket199.setTcpNoDelay(true);
            anInputStream197 = aSocket199.getInputStream();
            anOutputStream198 = aSocket199.getOutputStream();
        }
    }

    public void method191() {
        aBoolean200 = true;
        try {
            if (anInputStream197 != null)
                anInputStream197.close();
            if (anOutputStream198 != null)
                anOutputStream198.close();
            if (aSocket199 != null)
                aSocket199.close();
        } catch (IOException _ex) {
            System.out.println("Error closing stream");
        }
        aBoolean205 = false;
        synchronized (this) {
            notify();
        }
        aByteArray202 = null;
    }

    public int method192()
            throws IOException {
        if (aBoolean200)
            return 0;
        else
            return anInputStream197.read();
    }

    public int method193()
            throws IOException {
        if (aBoolean200)
            return 0;
        else
            return anInputStream197.available();
    }

    public void method194(byte[] abyte0, int i, int j)
            throws IOException {
        if (aBoolean200)
            return;
        int k;
        for (; j > 0; j -= k) {
            k = anInputStream197.read(abyte0, i, j);
            if (k <= 0)
                throw new IOException("EOF");
            i += k;
        }

    }

    public void method195(int i, int j, byte[] abyte0, int k)
            throws IOException {
        if (aBoolean200)
            return;
        if (aBoolean206) {
            aBoolean206 = false;
            throw new IOException("Error in writer thread");
        }
        if (aByteArray202 == null)
            aByteArray202 = new byte[5000];
        synchronized (this) {
            for (int l = 0; l < i; l++) {
                aByteArray202[anInt204] = abyte0[l + k];
                anInt204 = (anInt204 + 1) % 5000;
                if (anInt204 == (anInt203 + 4900) % 5000)
                    throw new IOException("buffer overflow");
            }

            if (!aBoolean205) {
                aBoolean205 = true;
                anApplet_Sub1_201.method12(this, 3);
            }
            notify();
        }
        if (j != anInt195)
            anInt194 = -158;
    }

    public void run() {
        while (aBoolean205) {
            int i;
            int j;
            synchronized (this) {
                if (anInt204 == anInt203)
                    try {
                        wait();
                    } catch (InterruptedException ignored) {
                    }
                if (!aBoolean205)
                    return;
                j = anInt203;
                if (anInt204 >= anInt203)
                    i = anInt204 - anInt203;
                else
                    i = 5000 - anInt203;
            }
            if (i > 0) {
                try {
                    anOutputStream198.write(aByteArray202, j, i);
                } catch (IOException _ex) {
                    aBoolean206 = true;
                }
                anInt203 = (anInt203 + i) % 5000;
                try {
                    if (anInt204 == anInt203)
                        anOutputStream198.flush();
                } catch (IOException _ex) {
                    aBoolean206 = true;
                }
            }
        }
    }

    public void method196(boolean flag) {
        System.out.println("dummy:" + aBoolean200);
        System.out.println("tcycl:" + anInt203);
        System.out.println("tnum:" + anInt204);
        System.out.println("writer:" + aBoolean205);
        System.out.println("ioerror:" + aBoolean206);
        if (!flag)
            aBoolean196 = !aBoolean196;
        try {
            System.out.println("available:" + method193());
        } catch (IOException _ex) {
        }
    }
}
