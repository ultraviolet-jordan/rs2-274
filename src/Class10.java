// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class10
        implements Runnable {

    public boolean aBoolean257;
    public final client aClient258;
    public boolean aBoolean259;
    public final Object anObject260;
    public int anInt261;
    public final int[] anIntArray262;
    public final int[] anIntArray263;
    public Class10(int i, client client1) {
        aBoolean257 = true;
        aBoolean259 = true;
        anObject260 = new Object();
        anIntArray262 = new int[500];
        anIntArray263 = new int[500];
        aClient258 = client1;
        if (i != -39788)
            aBoolean257 = !aBoolean257;
    }

    public void run() {
        while (aBoolean259) {
            synchronized (anObject260) {
                if (anInt261 < 500) {
                    anIntArray262[anInt261] = aClient258.anInt22;
                    anIntArray263[anInt261] = aClient258.anInt23;
                    anInt261++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception ignored) {
            }
        }
    }
}
