// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class44_Sub3_Sub1 extends Class44_Sub3 {

    public static boolean aBoolean1348 = true;
    public static int anInt1349;
    public static int anInt1350 = 436;
    public static int[] anIntArray1351;
    public static int anInt1352;
    public static int anInt1353;
    public static int anInt1354;
    public static int anInt1355;
    public static int anInt1356;
    public static int anInt1357;
    public static int anInt1358;
    public static int anInt1359;
    public static int anInt1360;
    public static int anInt1361;
    public Class44_Sub3_Sub1() {
    }

    public static void method406(int i, int j, int[] ai, int k) {
        anIntArray1351 = ai;
        anInt1352 = i;
        if (k != 9)
            anInt1350 = 478;
        anInt1353 = j;
        method408(5, j, i, 0, 0);
    }

    public static void method407(boolean flag) {
        anInt1356 = 0;
        anInt1354 = 0;
        anInt1357 = anInt1352;
        if (!flag) {
        } else {
            anInt1355 = anInt1353;
            anInt1358 = anInt1357 - 1;
            anInt1359 = anInt1357 / 2;
        }
    }

    public static void method408(int i, int j, int k, int l, int i1) {
        if (l < 0)
            l = 0;
        if (i1 < 0)
            i1 = 0;
        if (k > anInt1352)
            k = anInt1352;
        if (j > anInt1353)
            j = anInt1353;
        anInt1356 = l;
        anInt1354 = i1;
        anInt1357 = k;
        anInt1355 = j;
        anInt1358 = anInt1357 - 1;
        anInt1359 = anInt1357 / 2;
        if (i != 5) {
        } else {
            anInt1360 = anInt1355 / 2;
        }
    }

    public static void method409(int i) {
        int j = anInt1352 * anInt1353;
        if (i != 8)
            return;
        for (int k = 0; k < j; k++)
            anIntArray1351[k] = 0;

    }

    public static void method410(int i, int j, int k, int l, int i1, int j1, int k1) {
        if (j1 != 0)
            return;
        if (i1 < anInt1356) {
            i -= anInt1356 - i1;
            i1 = anInt1356;
        }
        if (k < anInt1354) {
            j -= anInt1354 - k;
            k = anInt1354;
        }
        if (i1 + i > anInt1357)
            i = anInt1357 - i1;
        if (k + j > anInt1355)
            j = anInt1355 - k;
        int l1 = 256 - k1;
        int i2 = (l >> 16 & 0xff) * k1;
        int j2 = (l >> 8 & 0xff) * k1;
        int k2 = (l & 0xff) * k1;
        int k3 = anInt1352 - i;
        int l3 = i1 + k * anInt1352;
        for (int i4 = 0; i4 < j; i4++) {
            for (int j4 = -i; j4 < 0; j4++) {
                int l2 = (anIntArray1351[l3] >> 16 & 0xff) * l1;
                int i3 = (anIntArray1351[l3] >> 8 & 0xff) * l1;
                int j3 = (anIntArray1351[l3] & 0xff) * l1;
                int k4 = ((i2 + l2 >> 8) << 16) + ((j2 + i3 >> 8) << 8) + (k2 + j3 >> 8);
                anIntArray1351[l3++] = k4;
            }

            l3 += k3;
        }

    }

    public static void method411(int i, int j, int k, int l, int i1, int j1) {
        if (i1 != 0) {
            for (int k1 = 1; k1 > 0; k1++) ;
        }
        if (l < anInt1356) {
            k -= anInt1356 - l;
            l = anInt1356;
        }
        if (j1 < anInt1354) {
            i -= anInt1354 - j1;
            j1 = anInt1354;
        }
        if (l + k > anInt1357)
            k = anInt1357 - l;
        if (j1 + i > anInt1355)
            i = anInt1355 - j1;
        int l1 = anInt1352 - k;
        int i2 = l + j1 * anInt1352;
        for (int j2 = -i; j2 < 0; j2++) {
            for (int k2 = -k; k2 < 0; k2++)
                anIntArray1351[i2++] = j;

            i2 += l1;
        }

    }

    public static void method412(int i, int j, int k, int l, int i1, int j1) {
        method414(i, j, l, (byte) 125, i1);
        if (j1 <= 0) {
        } else {
            method414(i, j, l, (byte) 125, (i1 + k) - 1);
            method416(j, k, l, 384, i1);
            method416(j, k, (l + i) - 1, 384, i1);
        }
    }

    public static void method413(int i, boolean flag, int j, int k, int l, int i1, int j1) {
        if (!flag) {
            for (int k1 = 1; k1 > 0; k1++) ;
        }
        method415(i, j, j1, k, anInt1349, l);
        method415(i, (j + i1) - 1, j1, k, anInt1349, l);
        if (i1 >= 3) {
            method417(k, i1 - 2, j + 1, true, l, j1);
            method417((k + i) - 1, i1 - 2, j + 1, true, l, j1);
        }
    }

    public static void method414(int i, int j, int k, byte byte0, int l) {
        if (l < anInt1354 || l >= anInt1355)
            return;
        if (k < anInt1356) {
            i -= anInt1356 - k;
            k = anInt1356;
        }
        if (k + i > anInt1357)
            i = anInt1357 - k;
        int i1 = k + l * anInt1352;
        if (byte0 != 125)
            return;
        for (int j1 = 0; j1 < i; j1++)
            anIntArray1351[i1 + j1] = j;

    }

    public static void method415(int i, int j, int k, int l, int i1, int j1) {
        if (j < anInt1354 || j >= anInt1355)
            return;
        if (l < anInt1356) {
            i -= anInt1356 - l;
            l = anInt1356;
        }
        if (l + i > anInt1357)
            i = anInt1357 - l;
        int k1 = 256 - k;
        int l1 = (j1 >> 16 & 0xff) * k;
        int i2 = (j1 >> 8 & 0xff) * k;
        int j2 = (j1 & 0xff) * k;
        int j3 = l + j * anInt1352;
        for (int k3 = 0; k3 < i; k3++) {
            int k2 = (anIntArray1351[j3] >> 16 & 0xff) * k1;
            int l2 = (anIntArray1351[j3] >> 8 & 0xff) * k1;
            int i3 = (anIntArray1351[j3] & 0xff) * k1;
            int l3 = ((l1 + k2 >> 8) << 16) + ((i2 + l2 >> 8) << 8) + (j2 + i3 >> 8);
            anIntArray1351[j3++] = l3;
        }

        if (i1 >= 0)
            if (i1 <= 0) ;
    }

    public static void method416(int i, int j, int k, int l, int i1) {
        if (k < anInt1356 || k >= anInt1357)
            return;
        if (i1 < anInt1354) {
            j -= anInt1354 - i1;
            i1 = anInt1354;
        }
        if (i1 + j > anInt1355)
            j = anInt1355 - i1;
        int j1 = k + i1 * anInt1352;
        l = 23 / l;
        for (int k1 = 0; k1 < j; k1++)
            anIntArray1351[j1 + k1 * anInt1352] = i;

    }

    public static void method417(int i, int j, int k, boolean flag, int l, int i1) {
        if (i < anInt1356 || i >= anInt1357)
            return;
        if (k < anInt1354) {
            j -= anInt1354 - k;
            k = anInt1354;
        }
        if (k + j > anInt1355)
            j = anInt1355 - k;
        int j1 = 256 - i1;
        int k1 = (l >> 16 & 0xff) * i1;
        int l1 = (l >> 8 & 0xff) * i1;
        int i2 = (l & 0xff) * i1;
        if (!flag)
            return;
        int i3 = i + k * anInt1352;
        for (int j3 = 0; j3 < j; j3++) {
            int j2 = (anIntArray1351[i3] >> 16 & 0xff) * j1;
            int k2 = (anIntArray1351[i3] >> 8 & 0xff) * j1;
            int l2 = (anIntArray1351[i3] & 0xff) * j1;
            int k3 = ((k1 + j2 >> 8) << 16) + ((l1 + k2 >> 8) << 8) + (i2 + l2 >> 8);
            anIntArray1351[i3] = k3;
            i3 += anInt1352;
        }

    }

}
