// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class4 {

    public static boolean aBoolean93;
    public static final Class4[] aClass4Array94 = new Class4[1000];
    public static final int[] anIntArray95 = new int[1000];
    public static byte[] aByteArray96;
    public static Class44_Sub3_Sub2 aClass44_Sub3_Sub2_97;
    public int anInt91;
    public final byte aByte92;
    public final Class6[] aClass6Array98;
    public int anInt99;
    public int anInt100;
    public Class4(int i) {
        aByte92 = 5;
        aClass6Array98 = new Class6[10];
        if (i != -46900)
            anInt91 = 126;
    }

    public static void method175(boolean flag, Class44_Sub3_Sub2 class44_sub3_sub2) {
        if (flag)
            aBoolean93 = !aBoolean93;
        aByteArray96 = new byte[0x6baa8];
        aClass44_Sub3_Sub2_97 = new Class44_Sub3_Sub2(aByteArray96, (byte) 1);
        Class6.method187();
        do {
            int i = class44_sub3_sub2.get2();
            if (i == 65535)
                return;
            aClass4Array94[i] = new Class4(-46900);
            aClass4Array94[i].method177((byte) 2, class44_sub3_sub2);
            anIntArray95[i] = aClass4Array94[i].method178(788);
        } while (true);
    }

    public static Class44_Sub3_Sub2 method176(int i, int j, byte byte0) {
        if (byte0 != 5) {
            for (int k = 1; k > 0; k++) ;
        }
        if (aClass4Array94[i] != null) {
            Class4 class4 = aClass4Array94[i];
            return class4.method179(j, (byte) 5);
        } else {
            return null;
        }
    }

    public void method177(byte byte0, Class44_Sub3_Sub2 class44_sub3_sub2) {
        for (int i = 0; i < 10; i++) {
            int j = class44_sub3_sub2.get1();
            if (j != 0) {
                class44_sub3_sub2.anInt1374--;
                aClass6Array98[i] = new Class6();
                aClass6Array98[i].method190((byte) 2, class44_sub3_sub2);
            }
        }

        if (byte0 == 2)
            byte0 = 0;
        else
            anInt91 = -185;
        anInt99 = class44_sub3_sub2.get2();
        anInt100 = class44_sub3_sub2.get2();
    }

    public int method178(int i) {
        if (i <= 0) {
            for (int j = 1; j > 0; j++) ;
        }
        int k = 0x98967f;
        for (int l = 0; l < 10; l++)
            if (aClass6Array98[l] != null && aClass6Array98[l].anInt185 / 20 < k)
                k = aClass6Array98[l].anInt185 / 20;

        if (anInt99 < anInt100 && anInt99 / 20 < k)
            k = anInt99 / 20;
        if (k == 0x98967f || k == 0)
            return 0;
        for (int i1 = 0; i1 < 10; i1++)
            if (aClass6Array98[i1] != null)
                aClass6Array98[i1].anInt185 -= k * 20;

        if (anInt99 < anInt100) {
            anInt99 -= k * 20;
            anInt100 -= k * 20;
        }
        return k;
    }

    public Class44_Sub3_Sub2 method179(int i, byte byte0) {
        int j = method180(i);
        aClass44_Sub3_Sub2_97.anInt1374 = 0;
        aClass44_Sub3_Sub2_97.put4(0x52494646);
        aClass44_Sub3_Sub2_97.put4LE(true, 36 + j);
        aClass44_Sub3_Sub2_97.put4(0x57415645);
        aClass44_Sub3_Sub2_97.put4(0x666d7420);
        aClass44_Sub3_Sub2_97.put4LE(true, 16);
        aClass44_Sub3_Sub2_97.put2LE(false, 1);
        aClass44_Sub3_Sub2_97.put2LE(false, 1);
        aClass44_Sub3_Sub2_97.put4LE(true, 22050);
        aClass44_Sub3_Sub2_97.put4LE(true, 22050);
        aClass44_Sub3_Sub2_97.put2LE(false, 1);
        aClass44_Sub3_Sub2_97.put2LE(false, 8);
        aClass44_Sub3_Sub2_97.put4(0x64617461);
        aClass44_Sub3_Sub2_97.put4LE(true, j);
        if (byte0 != aByte92) {
            throw new NullPointerException();
        } else {
            aClass44_Sub3_Sub2_97.anInt1374 += j;
            return aClass44_Sub3_Sub2_97;
        }
    }

    public int method180(int i) {
        int j = 0;
        for (int k = 0; k < 10; k++)
            if (aClass6Array98[k] != null && aClass6Array98[k].anInt184 + aClass6Array98[k].anInt185 > j)
                j = aClass6Array98[k].anInt184 + aClass6Array98[k].anInt185;

        if (j == 0)
            return 0;
        int l = (22050 * j) / 1000;
        int i1 = (22050 * anInt99) / 1000;
        int j1 = (22050 * anInt100) / 1000;
        if (i1 < 0 || j1 < 0 || j1 > l || i1 >= j1)
            i = 0;
        int k1 = l + (j1 - i1) * (i - 1);
        for (int l1 = 44; l1 < k1 + 44; l1++)
            aByteArray96[l1] = -128;

        for (int i2 = 0; i2 < 10; i2++)
            if (aClass6Array98[i2] != null) {
                int j2 = (aClass6Array98[i2].anInt184 * 22050) / 1000;
                int i3 = (aClass6Array98[i2].anInt185 * 22050) / 1000;
                int[] ai = aClass6Array98[i2].method188(j2, aClass6Array98[i2].anInt184);
                for (int l3 = 0; l3 < j2; l3++)
                    aByteArray96[l3 + i3 + 44] += (byte) (ai[l3] >> 8);

            }

        if (i > 1) {
            i1 += 44;
            j1 += 44;
            l += 44;
            int k2 = (k1 += 44) - l;
            if (l - j1 >= 0) System.arraycopy(aByteArray96, j1, aByteArray96, j1 + k2, l - j1);

            for (int k3 = 1; k3 < i; k3++) {
                int l2 = (j1 - i1) * k3;
                if (j1 - i1 >= 0) System.arraycopy(aByteArray96, i1, aByteArray96, i1 + l2, j1 - i1);

            }

            k1 -= 44;
        }
        return k1;
    }

}
