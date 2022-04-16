// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class20 {

    public static int anInt422;
    public static Class20[] aClass20Array423;
    public boolean aBoolean420;
    public final int anInt421;
    public int anInt424;
    public int anInt425;
    public boolean aBoolean426;
    public boolean aBoolean427;
    public String aString428;
    public int anInt429;
    public int anInt430;
    public int anInt431;
    public int anInt432;
    public int anInt433;
    public int anInt434;
    public Class20() {
        aBoolean420 = true;
        anInt421 = -186;
        anInt425 = -1;
        aBoolean426 = false;
        aBoolean427 = true;
    }

    public static void method243(boolean flag, Class47 class47) {
        Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(class47.method546("flo.dat", null), (byte) 1);
        anInt422 = class44_sub3_sub2.get2();
        if (aClass20Array423 == null)
            aClass20Array423 = new Class20[anInt422];
        for (int i = 0; i < anInt422; i++) {
            if (aClass20Array423[i] == null)
                aClass20Array423[i] = new Class20();
            aClass20Array423[i].method244((byte) 2, class44_sub3_sub2);
        }

        if (!flag) ;
    }

    public void method244(byte byte0, Class44_Sub3_Sub2 class44_sub3_sub2) {
        if (byte0 != 2)
            throw new NullPointerException();
        do {
            int i = class44_sub3_sub2.get1();
            if (i == 0)
                return;
            if (i == 1) {
                anInt424 = class44_sub3_sub2.get3();
                method245(anInt424, -186);
            } else if (i == 2)
                anInt425 = class44_sub3_sub2.get1();
            else if (i == 3)
                aBoolean426 = true;
            else if (i == 5)
                aBoolean427 = false;
            else if (i == 6)
                aString428 = class44_sub3_sub2.getString();
            else
                System.out.println("Error unrecognised config code: " + i);
        } while (true);
    }

    public void method245(int i, int j) {
        double d = (double) (i >> 16 & 0xff) / 256D;
        double d1 = (double) (i >> 8 & 0xff) / 256D;
        double d2 = (double) (i & 0xff) / 256D;
        double d3 = d;
        if (d1 < d3)
            d3 = d1;
        if (d2 < d3)
            d3 = d2;
        double d4 = d;
        if (d1 > d4)
            d4 = d1;
        if (d2 > d4)
            d4 = d2;
        double d5 = 0.0D;
        double d6 = 0.0D;
        double d7 = (d3 + d4) / 2D;
        if (d3 != d4) {
            if (d7 < 0.5D)
                d6 = (d4 - d3) / (d4 + d3);
            if (d7 >= 0.5D)
                d6 = (d4 - d3) / (2D - d4 - d3);
            if (d == d4)
                d5 = (d1 - d2) / (d4 - d3);
            else if (d1 == d4)
                d5 = 2D + (d2 - d) / (d4 - d3);
            else if (d2 == d4)
                d5 = 4D + (d - d1) / (d4 - d3);
        }
        d5 /= 6D;
        anInt429 = (int) (d5 * 256D);
        anInt430 = (int) (d6 * 256D);
        anInt431 = (int) (d7 * 256D);
        if (anInt430 < 0)
            anInt430 = 0;
        else if (anInt430 > 255)
            anInt430 = 255;
        if (anInt431 < 0)
            anInt431 = 0;
        else if (anInt431 > 255)
            anInt431 = 255;
        if (d7 > 0.5D)
            anInt433 = (int) ((1.0D - d7) * d6 * 512D);
        else
            anInt433 = (int) (d7 * d6 * 512D);
        if (anInt433 < 1)
            anInt433 = 1;
        anInt432 = (int) (d5 * (double) anInt433);
        int k = (anInt429 + (int) (Math.random() * 16D)) - 8;
        if (j >= 0)
            aBoolean420 = !aBoolean420;
        if (k < 0)
            k = 0;
        else if (k > 255)
            k = 255;
        int l = (anInt430 + (int) (Math.random() * 48D)) - 24;
        if (l < 0)
            l = 0;
        else if (l > 255)
            l = 255;
        int i1 = (anInt431 + (int) (Math.random() * 48D)) - 24;
        if (i1 < 0)
            i1 = 0;
        else if (i1 > 255)
            i1 = 255;
        anInt434 = method246(k, l, i1);
    }

    public int method246(int i, int j, int k) {
        if (k > 179)
            j /= 2;
        if (k > 192)
            j /= 2;
        if (k > 217)
            j /= 2;
        if (k > 243)
            j /= 2;
        int l = (i / 4 << 10) + (j / 32 << 7) + k / 2;
        return l;
    }
}
