// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class26 {

    public static int anInt496;
    public static Class26[] aClass26Array497;
    public static int anInt512;
    public int anInt498;
    public int[] anIntArray499;
    public int[] anIntArray500;
    public int[] anIntArray501;
    public int anInt502;
    public int[] anIntArray503;
    public boolean aBoolean504;
    public int anInt505;
    public int anInt506;
    public int anInt507;
    public int anInt508;
    public int anInt509;
    public int anInt510;
    public int anInt511;
    public Class26() {
        anInt502 = -1;
        aBoolean504 = false;
        anInt505 = 5;
        anInt506 = -1;
        anInt507 = -1;
        anInt508 = 99;
        anInt509 = -1;
        anInt510 = -1;
    }

    public static void method253(boolean flag, Class47 class47) {
        Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(class47.method546("seq.dat", null), (byte) 1);
        anInt496 = class44_sub3_sub2.get2();
        if (flag)
            return;
        if (aClass26Array497 == null)
            aClass26Array497 = new Class26[anInt496];
        for (int i = 0; i < anInt496; i++) {
            if (aClass26Array497[i] == null)
                aClass26Array497[i] = new Class26();
            aClass26Array497[i].method255((byte) 2, class44_sub3_sub2);
        }

    }

    public int method254(int i, int j) {
        if (j != 41645)
            return 4;
        int k = anIntArray501[i];
        if (k == 0) {
            Class11 class11 = Class11.method210(anIntArray499[i], 6);
            if (class11 != null)
                k = anIntArray501[i] = class11.anInt265;
        }
        if (k == 0)
            k = 1;
        return k;
    }

    public void method255(byte byte0, Class44_Sub3_Sub2 class44_sub3_sub2) {
        if (byte0 == 2) {
            byte0 = 0;
        } else {
            for (int i = 1; i > 0; i++) ;
        }
        do {
            int j = class44_sub3_sub2.get1();
            if (j == 0)
                break;
            if (j == 1) {
                anInt498 = class44_sub3_sub2.get1();
                anIntArray499 = new int[anInt498];
                anIntArray500 = new int[anInt498];
                anIntArray501 = new int[anInt498];
                for (int k = 0; k < anInt498; k++) {
                    anIntArray499[k] = class44_sub3_sub2.get2();
                    anIntArray500[k] = class44_sub3_sub2.get2();
                    if (anIntArray500[k] == 65535)
                        anIntArray500[k] = -1;
                    anIntArray501[k] = class44_sub3_sub2.get2();
                }

            } else if (j == 2)
                anInt502 = class44_sub3_sub2.get2();
            else if (j == 3) {
                int l = class44_sub3_sub2.get1();
                anIntArray503 = new int[l + 1];
                for (int i1 = 0; i1 < l; i1++)
                    anIntArray503[i1] = class44_sub3_sub2.get1();

                anIntArray503[l] = 0x98967f;
            } else if (j == 4)
                aBoolean504 = true;
            else if (j == 5)
                anInt505 = class44_sub3_sub2.get1();
            else if (j == 6)
                anInt506 = class44_sub3_sub2.get2();
            else if (j == 7)
                anInt507 = class44_sub3_sub2.get2();
            else if (j == 8)
                anInt508 = class44_sub3_sub2.get1();
            else if (j == 9)
                anInt509 = class44_sub3_sub2.get1();
            else if (j == 10)
                anInt510 = class44_sub3_sub2.get1();
            else if (j == 11)
                anInt511 = class44_sub3_sub2.get1();
            else
                System.out.println("Error unrecognised seq config code: " + j);
        } while (true);
        if (anInt498 == 0) {
            anInt498 = 1;
            anIntArray499 = new int[1];
            anIntArray499[0] = -1;
            anIntArray500 = new int[1];
            anIntArray500[0] = -1;
            anIntArray501 = new int[1];
            anIntArray501[0] = -1;
        }
        if (anInt509 == -1)
            if (anIntArray503 != null)
                anInt509 = 2;
            else
                anInt509 = 0;
        if (anInt510 == -1) {
            if (anIntArray503 != null) {
                anInt510 = 2;
                return;
            }
            anInt510 = 0;
        }
    }
}
