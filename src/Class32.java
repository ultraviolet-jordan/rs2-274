// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class32 {

    public static int anInt546;
    public static Class32[] aClass32Array547;
    public static Class39 aClass39_559 = new Class39(30, 0);
    public boolean aBoolean545;
    public int anInt548;
    public int anInt549;
    public int anInt550;
    public Class26 aClass26_551;
    public final int[] anIntArray552;
    public final int[] anIntArray553;
    public int anInt554;
    public int anInt555;
    public int anInt556;
    public int anInt557;
    public int anInt558;
    public Class32() {
        aBoolean545 = false;
        anInt550 = -1;
        anIntArray552 = new int[6];
        anIntArray553 = new int[6];
        anInt554 = 128;
        anInt555 = 128;
    }

    public static void method269(boolean flag, Class47 class47) {
        Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(class47.method546("spotanim.dat", null), (byte) 1);
        anInt546 = class44_sub3_sub2.get2();
        if (aClass32Array547 == null)
            aClass32Array547 = new Class32[anInt546];
        for (int i = 0; i < anInt546; i++) {
            if (aClass32Array547[i] == null)
                aClass32Array547[i] = new Class32();
            aClass32Array547[i].anInt548 = i;
            aClass32Array547[i].method270((byte) 2, class44_sub3_sub2);
        }

        if (!flag) ;
    }

    public void method270(byte byte0, Class44_Sub3_Sub2 class44_sub3_sub2) {
        if (byte0 == 2)
            byte0 = 0;
        else
            aBoolean545 = !aBoolean545;
        do {
            int i = class44_sub3_sub2.get1();
            if (i == 0)
                return;
            if (i == 1)
                anInt549 = class44_sub3_sub2.get2();
            else if (i == 2) {
                anInt550 = class44_sub3_sub2.get2();
                if (Class26.aClass26Array497 != null)
                    aClass26_551 = Class26.aClass26Array497[anInt550];
            } else if (i == 4)
                anInt554 = class44_sub3_sub2.get2();
            else if (i == 5)
                anInt555 = class44_sub3_sub2.get2();
            else if (i == 6)
                anInt556 = class44_sub3_sub2.get2();
            else if (i == 7)
                anInt557 = class44_sub3_sub2.get1();
            else if (i == 8)
                anInt558 = class44_sub3_sub2.get1();
            else if (i >= 40 && i < 50)
                anIntArray552[i - 40] = class44_sub3_sub2.get2();
            else if (i >= 50 && i < 60)
                anIntArray553[i - 50] = class44_sub3_sub2.get2();
            else
                System.out.println("Error unrecognised spotanim config code: " + i);
        } while (true);
    }

    public Class44_Sub3_Sub4_Sub4 method271() {
        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = (Class44_Sub3_Sub4_Sub4) aClass39_559.method339(anInt548);
        if (class44_sub3_sub4_sub4 != null)
            return class44_sub3_sub4_sub4;
        class44_sub3_sub4_sub4 = Class44_Sub3_Sub4_Sub4.method503(anInt549, 6);
        if (class44_sub3_sub4_sub4 == null)
            return null;
        for (int i = 0; i < 6; i++)
            if (anIntArray552[0] != 0)
                class44_sub3_sub4_sub4.method517(anIntArray552[i], anIntArray553[i]);

        aClass39_559.method340(201, anInt548, class44_sub3_sub4_sub4);
        return class44_sub3_sub4_sub4;
    }

}
