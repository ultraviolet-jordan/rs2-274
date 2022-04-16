// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class12 {

    public static boolean aBoolean274 = true;
    public static int anInt275;
    public static int[] anIntArray276;
    public static Class44_Sub3_Sub2 aClass44_Sub3_Sub2_277;
    public static Class12[] aClass12Array278;
    public static int anInt279;
    public static Class39 aClass39_306 = new Class39(30, 0);
    public final int anInt273;
    public long aLong280;
    public String aString281;
    public byte[] aByteArray282;
    public byte aByte283;
    public int[] anIntArray284;
    public int[] anIntArray285;
    public int anInt286;
    public int anInt287;
    public int anInt288;
    public int anInt289;
    public int anInt290;
    public int[] anIntArray291;
    public int[] anIntArray292;
    public String[] aStringArray293;
    public int anInt294;
    public int anInt295;
    public int anInt296;
    public boolean aBoolean297;
    public int anInt298;
    public int anInt299;
    public int anInt300;
    public boolean aBoolean301;
    public int anInt302;
    public int anInt303;
    public int anInt304;
    public int anInt305;
    public Class12() {
        anInt273 = -32952;
        aLong280 = -1L;
        aByte283 = 1;
        anInt286 = -1;
        anInt287 = -1;
        anInt288 = -1;
        anInt289 = -1;
        anInt290 = -1;
        anInt294 = -1;
        anInt295 = -1;
        anInt296 = -1;
        aBoolean297 = true;
        anInt298 = -1;
        anInt299 = 128;
        anInt300 = 128;
        aBoolean301 = false;
        anInt304 = -1;
        anInt305 = 32;
    }

    public static void method212(Class47 class47) {
        aClass44_Sub3_Sub2_277 = new Class44_Sub3_Sub2(class47.method546("npc.dat", null), (byte) 1);
        Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(class47.method546("npc.idx", null), (byte) 1);
        anInt275 = class44_sub3_sub2.get2();
        anIntArray276 = new int[anInt275];
        int i = 2;
        for (int j = 0; j < anInt275; j++) {
            anIntArray276[j] = i;
            i += class44_sub3_sub2.get2();
        }

        aClass12Array278 = new Class12[20];
        for (int k = 0; k < 20; k++)
            aClass12Array278[k] = new Class12();

    }

    public static void method213(byte byte0) {
        aClass39_306 = null;
        anIntArray276 = null;
        aClass12Array278 = null;
        aClass44_Sub3_Sub2_277 = null;
        if (byte0 == 1) {
            byte0 = 0;
        } else {
            aBoolean274 = !aBoolean274;
        }
    }

    public static Class12 method214(int i) {
        for (int j = 0; j < 20; j++)
            if (aClass12Array278[j].aLong280 == (long) i)
                return aClass12Array278[j];

        anInt279 = (anInt279 + 1) % 20;
        Class12 class12 = aClass12Array278[anInt279] = new Class12();
        aClass44_Sub3_Sub2_277.anInt1374 = anIntArray276[i];
        class12.aLong280 = i;
        class12.method215((byte) 2, aClass44_Sub3_Sub2_277);
        return class12;
    }

    public void method215(byte byte0, Class44_Sub3_Sub2 class44_sub3_sub2) {
        if (byte0 == 2) {
            byte0 = 0;
        } else {
            for (int i = 1; i > 0; i++) ;
        }
        do {
            int j = class44_sub3_sub2.get1();
            if (j == 0)
                return;
            if (j == 1) {
                int k = class44_sub3_sub2.get1();
                anIntArray284 = new int[k];
                for (int j1 = 0; j1 < k; j1++)
                    anIntArray284[j1] = class44_sub3_sub2.get2();

            } else if (j == 2)
                aString281 = class44_sub3_sub2.getString();
            else if (j == 3)
                aByteArray282 = class44_sub3_sub2.getStringArray(anInt273);
            else if (j == 12)
                aByte283 = class44_sub3_sub2.get1Signed();
            else if (j == 13)
                anInt286 = class44_sub3_sub2.get2();
            else if (j == 14)
                anInt287 = class44_sub3_sub2.get2();
            else if (j == 17) {
                anInt287 = class44_sub3_sub2.get2();
                anInt288 = class44_sub3_sub2.get2();
                anInt289 = class44_sub3_sub2.get2();
                anInt290 = class44_sub3_sub2.get2();
            } else if (j >= 30 && j < 40) {
                if (aStringArray293 == null)
                    aStringArray293 = new String[5];
                aStringArray293[j - 30] = class44_sub3_sub2.getString();
                if (aStringArray293[j - 30].equalsIgnoreCase("hidden"))
                    aStringArray293[j - 30] = null;
            } else if (j == 40) {
                int l = class44_sub3_sub2.get1();
                anIntArray291 = new int[l];
                anIntArray292 = new int[l];
                for (int k1 = 0; k1 < l; k1++) {
                    anIntArray291[k1] = class44_sub3_sub2.get2();
                    anIntArray292[k1] = class44_sub3_sub2.get2();
                }

            } else if (j == 60) {
                int i1 = class44_sub3_sub2.get1();
                anIntArray285 = new int[i1];
                for (int l1 = 0; l1 < i1; l1++)
                    anIntArray285[l1] = class44_sub3_sub2.get2();

            } else if (j == 90)
                anInt294 = class44_sub3_sub2.get2();
            else if (j == 91)
                anInt295 = class44_sub3_sub2.get2();
            else if (j == 92)
                anInt296 = class44_sub3_sub2.get2();
            else if (j == 93)
                aBoolean297 = false;
            else if (j == 95)
                anInt298 = class44_sub3_sub2.get2();
            else if (j == 97)
                anInt299 = class44_sub3_sub2.get2();
            else if (j == 98)
                anInt300 = class44_sub3_sub2.get2();
            else if (j == 99)
                aBoolean301 = true;
            else if (j == 100)
                anInt302 = class44_sub3_sub2.get1Signed();
            else if (j == 101)
                anInt303 = class44_sub3_sub2.get1Signed() * 5;
            else if (j == 102)
                anInt304 = class44_sub3_sub2.get2();
            else if (j == 103)
                anInt305 = class44_sub3_sub2.get2();
        } while (true);
    }

    public Class44_Sub3_Sub4_Sub4 method216(int i, int j, int k, int[] ai) {
        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = (Class44_Sub3_Sub4_Sub4) aClass39_306.method339(aLong280);
        if (class44_sub3_sub4_sub4 == null) {
            boolean flag = false;
            for (int value : anIntArray284)
                if (!Class44_Sub3_Sub4_Sub4.method504(value))
                    flag = true;

            if (flag)
                return null;
            Class44_Sub3_Sub4_Sub4[] aclass44_sub3_sub4_sub4 = new Class44_Sub3_Sub4_Sub4[anIntArray284.length];
            for (int i1 = 0; i1 < anIntArray284.length; i1++)
                aclass44_sub3_sub4_sub4[i1] = Class44_Sub3_Sub4_Sub4.method503(anIntArray284[i1], 6);

            if (aclass44_sub3_sub4_sub4.length == 1)
                class44_sub3_sub4_sub4 = aclass44_sub3_sub4_sub4[0];
            else
                class44_sub3_sub4_sub4 = new Class44_Sub3_Sub4_Sub4(aclass44_sub3_sub4_sub4.length, -643, aclass44_sub3_sub4_sub4);
            if (anIntArray291 != null) {
                for (int j1 = 0; j1 < anIntArray291.length; j1++)
                    class44_sub3_sub4_sub4.method517(anIntArray291[j1], anIntArray292[j1]);

            }
            class44_sub3_sub4_sub4.method510(9);
            class44_sub3_sub4_sub4.method520(64 + anInt302, 850 + anInt303, -30, -50, -30, true);
            aClass39_306.method340(201, aLong280, class44_sub3_sub4_sub4);
        }
        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4_1 = Class44_Sub3_Sub4_Sub4.aClass44_Sub3_Sub4_Sub4_1517;
        k = 62 / k;
        class44_sub3_sub4_sub4_1.method505(0, class44_sub3_sub4_sub4, Class11.method211(i, 0) & Class11.method211(j, 0));
        if (i != -1 && j != -1)
            class44_sub3_sub4_sub4_1.method512(-32031, ai, i, j);
        else if (i != -1)
            class44_sub3_sub4_sub4_1.method511(i, -284);
        if (anInt299 != 128 || anInt300 != 128)
            class44_sub3_sub4_sub4_1.method519(9, anInt299, anInt299, anInt300);
        class44_sub3_sub4_sub4_1.method507(486);
        class44_sub3_sub4_sub4_1.anIntArrayArray1554 = null;
        class44_sub3_sub4_sub4_1.anIntArrayArray1553 = null;
        if (aByte283 == 1)
            class44_sub3_sub4_sub4_1.aBoolean1555 = true;
        return class44_sub3_sub4_sub4_1;
    }

    public Class44_Sub3_Sub4_Sub4 method217(byte byte0) {
        if (byte0 != 0) {
            for (int i = 1; i > 0; i++) ;
        }
        if (anIntArray285 == null)
            return null;
        boolean flag = false;
        for (int i : anIntArray285)
            if (!Class44_Sub3_Sub4_Sub4.method504(i))
                flag = true;

        if (flag)
            return null;
        Class44_Sub3_Sub4_Sub4[] aclass44_sub3_sub4_sub4 = new Class44_Sub3_Sub4_Sub4[anIntArray285.length];
        for (int k = 0; k < anIntArray285.length; k++)
            aclass44_sub3_sub4_sub4[k] = Class44_Sub3_Sub4_Sub4.method503(anIntArray285[k], 6);

        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4;
        if (aclass44_sub3_sub4_sub4.length == 1)
            class44_sub3_sub4_sub4 = aclass44_sub3_sub4_sub4[0];
        else
            class44_sub3_sub4_sub4 = new Class44_Sub3_Sub4_Sub4(aclass44_sub3_sub4_sub4.length, -643, aclass44_sub3_sub4_sub4);
        if (anIntArray291 != null) {
            for (int l = 0; l < anIntArray291.length; l++)
                class44_sub3_sub4_sub4.method517(anIntArray291[l], anIntArray292[l]);

        }
        return class44_sub3_sub4_sub4;
    }

}
