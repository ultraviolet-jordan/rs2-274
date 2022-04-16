// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class22 {

    public static int anInt454;
    public static Class22[] aClass22Array455;
    public final byte aByte452;
    public boolean aBoolean453;
    public int anInt456;
    public int[] anIntArray457;
    public final int[] anIntArray458;
    public final int[] anIntArray459;
    public final int[] anIntArray460 = {
            -1, -1, -1, -1, -1
    };
    public boolean aBoolean461;
    public Class22() {
        aByte452 = 0;
        aBoolean453 = false;
        anInt456 = -1;
        anIntArray458 = new int[6];
        anIntArray459 = new int[6];
        aBoolean461 = false;
    }

    public static void method247(boolean flag, Class47 class47) {
        Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(class47.method546("idk.dat", null), (byte) 1);
        if (flag)
            return;
        anInt454 = class44_sub3_sub2.get2();
        if (aClass22Array455 == null)
            aClass22Array455 = new Class22[anInt454];
        for (int i = 0; i < anInt454; i++) {
            if (aClass22Array455[i] == null)
                aClass22Array455[i] = new Class22();
            aClass22Array455[i].method248((byte) 2, class44_sub3_sub2);
        }

    }

    public void method248(byte byte0, Class44_Sub3_Sub2 class44_sub3_sub2) {
        if (byte0 != 2)
            throw new NullPointerException();
        do {
            int i = class44_sub3_sub2.get1();
            if (i == 0)
                return;
            if (i == 1)
                anInt456 = class44_sub3_sub2.get1();
            else if (i == 2) {
                int j = class44_sub3_sub2.get1();
                anIntArray457 = new int[j];
                for (int k = 0; k < j; k++)
                    anIntArray457[k] = class44_sub3_sub2.get2();

            } else if (i == 3)
                aBoolean461 = true;
            else if (i >= 40 && i < 50)
                anIntArray458[i - 40] = class44_sub3_sub2.get2();
            else if (i >= 50 && i < 60)
                anIntArray459[i - 50] = class44_sub3_sub2.get2();
            else if (i >= 60 && i < 70)
                anIntArray460[i - 60] = class44_sub3_sub2.get2();
            else
                System.out.println("Error unrecognised config code: " + i);
        } while (true);
    }

    public boolean method249(int i) {
        if (anIntArray457 == null)
            return true;
        boolean flag = true;
        if (i != 3)
            throw new NullPointerException();
        for (int k : anIntArray457)
            if (!Class44_Sub3_Sub4_Sub4.method504(k))
                flag = false;

        return flag;
    }

    public Class44_Sub3_Sub4_Sub4 method250(byte byte0) {
        if (byte0 != aByte452)
            aBoolean453 = !aBoolean453;
        if (anIntArray457 == null)
            return null;
        Class44_Sub3_Sub4_Sub4[] aclass44_sub3_sub4_sub4 = new Class44_Sub3_Sub4_Sub4[anIntArray457.length];
        for (int i = 0; i < anIntArray457.length; i++)
            aclass44_sub3_sub4_sub4[i] = Class44_Sub3_Sub4_Sub4.method503(anIntArray457[i], 6);

        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4;
        if (aclass44_sub3_sub4_sub4.length == 1)
            class44_sub3_sub4_sub4 = aclass44_sub3_sub4_sub4[0];
        else
            class44_sub3_sub4_sub4 = new Class44_Sub3_Sub4_Sub4(aclass44_sub3_sub4_sub4.length, -643, aclass44_sub3_sub4_sub4);
        for (int j = 0; j < 6; j++) {
            if (anIntArray458[j] == 0)
                break;
            class44_sub3_sub4_sub4.method517(anIntArray458[j], anIntArray459[j]);
        }

        return class44_sub3_sub4_sub4;
    }

    public boolean method251(int i) {
        boolean flag = true;
        for (int j = 0; j < 5; j++)
            if (anIntArray460[j] != -1 && !Class44_Sub3_Sub4_Sub4.method504(anIntArray460[j]))
                flag = false;

        if (i != 0) {
            for (int k = 1; k > 0; k++) ;
        }
        return flag;
    }

    public Class44_Sub3_Sub4_Sub4 method252(byte byte0) {
        Class44_Sub3_Sub4_Sub4[] aclass44_sub3_sub4_sub4 = new Class44_Sub3_Sub4_Sub4[5];
        int i = 0;
        if (byte0 == 7)
            byte0 = 0;
        else
            throw new NullPointerException();
        for (int j = 0; j < 5; j++)
            if (anIntArray460[j] != -1)
                aclass44_sub3_sub4_sub4[i++] = Class44_Sub3_Sub4_Sub4.method503(anIntArray460[j], 6);

        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = new Class44_Sub3_Sub4_Sub4(i, -643, aclass44_sub3_sub4_sub4);
        for (int k = 0; k < 6; k++) {
            if (anIntArray458[k] == 0)
                break;
            class44_sub3_sub4_sub4.method517(anIntArray458[k], anIntArray459[k]);
        }

        return class44_sub3_sub4_sub4;
    }
}
