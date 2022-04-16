// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class11 {

    public static Class11[] aClass11Array264;
    public static boolean[] aBooleanArray272;
    public int anInt265;
    public Class9 aClass9_266;
    public int anInt267;
    public int[] anIntArray268;
    public int[] anIntArray269;
    public int[] anIntArray270;
    public int[] anIntArray271;
    public Class11() {
    }

    public static void method207(int i) {
        aClass11Array264 = new Class11[i + 1];
        aBooleanArray272 = new boolean[i + 1];
        for (int j = 0; j < i + 1; j++)
            aBooleanArray272[j] = true;

    }

    public static void method208(int i, byte[] abyte0) {
        Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(abyte0, (byte) 1);
        if (i >= 0)
            return;
        class44_sub3_sub2.anInt1374 = abyte0.length - 8;
        int j = class44_sub3_sub2.get2();
        int k = class44_sub3_sub2.get2();
        int l = class44_sub3_sub2.get2();
        int i1 = class44_sub3_sub2.get2();
        int j1 = 0;
        Class44_Sub3_Sub2 class44_sub3_sub2_1 = new Class44_Sub3_Sub2(abyte0, (byte) 1);
        class44_sub3_sub2_1.anInt1374 = j1;
        j1 += j + 2;
        Class44_Sub3_Sub2 class44_sub3_sub2_2 = new Class44_Sub3_Sub2(abyte0, (byte) 1);
        class44_sub3_sub2_2.anInt1374 = j1;
        j1 += k;
        Class44_Sub3_Sub2 class44_sub3_sub2_3 = new Class44_Sub3_Sub2(abyte0, (byte) 1);
        class44_sub3_sub2_3.anInt1374 = j1;
        j1 += l;
        Class44_Sub3_Sub2 class44_sub3_sub2_4 = new Class44_Sub3_Sub2(abyte0, (byte) 1);
        class44_sub3_sub2_4.anInt1374 = j1;
        j1 += i1;
        Class44_Sub3_Sub2 class44_sub3_sub2_5 = new Class44_Sub3_Sub2(abyte0, (byte) 1);
        class44_sub3_sub2_5.anInt1374 = j1;
        Class9 class9 = new Class9(10470, class44_sub3_sub2_5);
        int k1 = class44_sub3_sub2_1.get2();
        int[] ai = new int[500];
        int[] ai1 = new int[500];
        int[] ai2 = new int[500];
        int[] ai3 = new int[500];
        for (int l1 = 0; l1 < k1; l1++) {
            int i2 = class44_sub3_sub2_1.get2();
            Class11 class11 = aClass11Array264[i2] = new Class11();
            class11.anInt265 = class44_sub3_sub2_4.get1();
            class11.aClass9_266 = class9;
            int j2 = class44_sub3_sub2_1.get1();
            int k2 = -1;
            int l2 = 0;
            for (int i3 = 0; i3 < j2; i3++) {
                int j3 = class44_sub3_sub2_2.get1();
                if (j3 > 0) {
                    if (class9.anIntArray255[i3] != 0) {
                        for (int l3 = i3 - 1; l3 > k2; l3--) {
                            if (class9.anIntArray255[l3] != 0)
                                continue;
                            ai[l2] = l3;
                            ai1[l2] = 0;
                            ai2[l2] = 0;
                            ai3[l2] = 0;
                            l2++;
                            break;
                        }

                    }
                    ai[l2] = i3;
                    char c = '\0';
                    if (class9.anIntArray255[i3] == 3)
                        c = '\200';
                    if ((j3 & 1) != 0)
                        ai1[l2] = class44_sub3_sub2_3.method492();
                    else
                        ai1[l2] = c;
                    if ((j3 & 2) != 0)
                        ai2[l2] = class44_sub3_sub2_3.method492();
                    else
                        ai2[l2] = c;
                    if ((j3 & 4) != 0)
                        ai3[l2] = class44_sub3_sub2_3.method492();
                    else
                        ai3[l2] = c;
                    k2 = i3;
                    l2++;
                    if (class9.anIntArray255[i3] == 5)
                        aBooleanArray272[i2] = false;
                }
            }

            class11.anInt267 = l2;
            class11.anIntArray268 = new int[l2];
            class11.anIntArray269 = new int[l2];
            class11.anIntArray270 = new int[l2];
            class11.anIntArray271 = new int[l2];
            for (int k3 = 0; k3 < l2; k3++) {
                class11.anIntArray268[k3] = ai[k3];
                class11.anIntArray269[k3] = ai1[k3];
                class11.anIntArray270[k3] = ai2[k3];
                class11.anIntArray271[k3] = ai3[k3];
            }

        }

    }

    public static void method209(byte byte0) {
        if (byte0 != 1) {
        } else {
            aClass11Array264 = null;
        }
    }

    public static Class11 method210(int i, int j) {
        if (j != 6)
            throw new NullPointerException();
        if (aClass11Array264 == null)
            return null;
        else
            return aClass11Array264[i];
    }

    public static boolean method211(int i, int j) {
        if (j != 0) {
            for (int k = 1; k > 0; k++) ;
        }
        return i == -1;
    }
}
