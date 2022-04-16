// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class38 {

    public static int anInt657 = -643;
    public static final byte aByte658 = 6;
    public static int anInt659;
    public static Class38[] aClass38Array660;
    public static int anInt661;
    public static int[] anIntArray662;
    public String aString663;
    public int anInt664;
    public int anInt665;
    public boolean aBoolean666;
    public boolean aBoolean667;
    public int anInt668;
    public boolean aBoolean669;
    public int anInt670;
    public int anInt671;
    public boolean aBoolean672;
    public int anInt673;
    public Class38() {
        aBoolean666 = false;
        aBoolean667 = true;
        aBoolean669 = false;
        aBoolean672 = false;
        anInt673 = -1;
    }

    public static void method337(boolean flag, Class47 class47) {
        Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(class47.method546("varp.dat", null), (byte) 1);
        anInt661 = 0;
        anInt659 = class44_sub3_sub2.get2();
        if (aClass38Array660 == null)
            aClass38Array660 = new Class38[anInt659];
        if (anIntArray662 == null)
            anIntArray662 = new int[anInt659];
        for (int i = 0; i < anInt659; i++) {
            if (aClass38Array660[i] == null)
                aClass38Array660[i] = new Class38();
            aClass38Array660[i].method338(class44_sub3_sub2, aByte658, i);
        }

        if (flag)
            anInt657 = 293;
        if (class44_sub3_sub2.anInt1374 != class44_sub3_sub2.aByteArray1373.length)
            System.out.println("varptype load mismatch");
    }

    public void method338(Class44_Sub3_Sub2 class44_sub3_sub2, byte byte0, int i) {
        if (byte0 == 6) {
            byte0 = 0;
        } else {
            for (int j = 1; j > 0; j++) ;
        }
        do {
            int k = class44_sub3_sub2.get1();
            if (k == 0)
                return;
            if (k == 1)
                anInt664 = class44_sub3_sub2.get1();
            else if (k == 2)
                anInt665 = class44_sub3_sub2.get1();
            else if (k == 3) {
                aBoolean666 = true;
                anIntArray662[anInt661++] = i;
            } else if (k == 4)
                aBoolean667 = false;
            else if (k == 5)
                anInt668 = class44_sub3_sub2.get2();
            else if (k == 6)
                aBoolean669 = true;
            else if (k == 7)
                anInt670 = class44_sub3_sub2.get4();
            else if (k == 8) {
                anInt671 = 1;
                aBoolean672 = true;
            } else if (k == 10)
                aString663 = class44_sub3_sub2.getString();
            else if (k == 11)
                aBoolean672 = true;
            else if (k == 12)
                anInt673 = class44_sub3_sub2.get4();
            else if (k == 13)
                anInt671 = 2;
            else
                System.out.println("Error unrecognised config code: " + k);
        } while (true);
    }

}
