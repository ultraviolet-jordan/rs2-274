// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class44_Sub3_Sub1_Sub1 extends Class44_Sub3_Sub1 {

    public static boolean aBoolean1396;
    public static int anInt1397 = -593;
    public static boolean aBoolean1398 = true;
    public static boolean aBoolean1399;
    public static boolean aBoolean1400;
    public static boolean aBoolean1401 = true;
    public static int anInt1402;
    public static int anInt1403;
    public static int anInt1404;
    public static int[] anIntArray1405;
    public static final int[] anIntArray1406;
    public static int[] anIntArray1407;
    public static int[] anIntArray1408;
    public static int[] anIntArray1409;
    public static int anInt1410;
    public static Class44_Sub3_Sub1_Sub3[] aClass44_Sub3_Sub1_Sub3Array1411 = new Class44_Sub3_Sub1_Sub3[50];
    public static boolean[] aBooleanArray1412 = new boolean[50];
    public static int[] anIntArray1413 = new int[50];
    public static int anInt1414;
    public static int[][] anIntArrayArray1415;
    public static int[][] anIntArrayArray1416 = new int[50][];
    public static int[] anIntArray1417 = new int[50];
    public static int anInt1418;
    public static int[] anIntArray1419 = new int[0x10000];
    public static int[][] anIntArrayArray1420 = new int[50][];

    static {
        anIntArray1405 = new int[512];
        anIntArray1406 = new int[2048];
        anIntArray1407 = new int[2048];
        anIntArray1408 = new int[2048];
        for (int i = 1; i < 512; i++)
            anIntArray1405[i] = 32768 / i;

        for (int j = 1; j < 2048; j++)
            anIntArray1406[j] = 0x10000 / j;

        for (int k = 0; k < 2048; k++) {
            anIntArray1407[k] = (int) (65536D * Math.sin((double) k * 0.0030679614999999999D));
            anIntArray1408[k] = (int) (65536D * Math.cos((double) k * 0.0030679614999999999D));
        }

    }

    public static void method418(byte byte0) {
        anIntArray1405 = null;
        anIntArray1405 = null;
        anIntArray1407 = null;
        anIntArray1408 = null;
        anIntArray1409 = null;
        aClass44_Sub3_Sub1_Sub3Array1411 = null;
        aBooleanArray1412 = null;
        anIntArray1413 = null;
        anIntArrayArray1415 = null;
        anIntArrayArray1416 = null;
        anIntArray1417 = null;
        if (byte0 == 1) {
            byte0 = 0;
        } else {
            for (int i = 1; i > 0; i++) ;
        }
        anIntArray1419 = null;
        anIntArrayArray1420 = null;
    }

    public static void method419(boolean flag) {
        anIntArray1409 = new int[Class44_Sub3_Sub1.anInt1353];
        if (flag)
            anInt1397 = 465;
        for (int i = 0; i < Class44_Sub3_Sub1.anInt1353; i++)
            anIntArray1409[i] = Class44_Sub3_Sub1.anInt1352 * i;

        anInt1403 = Class44_Sub3_Sub1.anInt1352 / 2;
        anInt1404 = Class44_Sub3_Sub1.anInt1353 / 2;
    }

    public static void method420(int i, int j, int k) {
        anIntArray1409 = new int[k];
        if (j != 6487)
            return;
        for (int l = 0; l < k; l++)
            anIntArray1409[l] = i * l;

        anInt1403 = i / 2;
        anInt1404 = k / 2;
    }

    public static void method421(int i) {
        anIntArrayArray1415 = null;
        if (i != -18849) {
            for (int j = 1; j > 0; j++) ;
        }
        for (int k = 0; k < 50; k++)
            anIntArrayArray1416[k] = null;

    }

    public static void method422(int i, int j) {
        if (j != 2972) {
            for (int k = 1; k > 0; k++) ;
        }
        if (anIntArrayArray1415 == null) {
            anInt1414 = i;
            if (aBoolean1398)
                anIntArrayArray1415 = new int[anInt1414][16384];
            else
                anIntArrayArray1415 = new int[anInt1414][0x10000];
            for (int l = 0; l < 50; l++)
                anIntArrayArray1416[l] = null;

        }
    }

    public static void method423(Class47 class47, int i) {
        if (i != 0)
            return;
        anInt1410 = 0;
        for (int j = 0; j < 50; j++)
            try {
                aClass44_Sub3_Sub1_Sub3Array1411[j] = new Class44_Sub3_Sub1_Sub3(class47, String.valueOf(j), 0);
                if (aBoolean1398 && aClass44_Sub3_Sub1_Sub3Array1411[j].anInt1451 == 128)
                    aClass44_Sub3_Sub1_Sub3Array1411[j].method448((byte) 9);
                else
                    aClass44_Sub3_Sub1_Sub3Array1411[j].method449(0);
                anInt1410++;
            } catch (Exception ignored) {
            }

    }

    public static int method424(boolean flag, int i) {
        if (anIntArray1413[i] != 0)
            return anIntArray1413[i];
        int j = 0;
        int k = 0;
        int l = 0;
        int i1 = anIntArrayArray1420[i].length;
        for (int j1 = 0; j1 < i1; j1++) {
            j += anIntArrayArray1420[i][j1] >> 16 & 0xff;
            k += anIntArrayArray1420[i][j1] >> 8 & 0xff;
            l += anIntArrayArray1420[i][j1] & 0xff;
        }

        if (flag)
            aBoolean1396 = !aBoolean1396;
        int k1 = (j / i1 << 16) + (k / i1 << 8) + l / i1;
        k1 = method428(k1, 1.3999999999999999D);
        if (k1 == 0)
            k1 = 1;
        anIntArray1413[i] = k1;
        return k1;
    }

    public static void method425(int i, boolean flag) {
        if (anIntArrayArray1416[i] == null)
            return;
        anIntArrayArray1415[anInt1414++] = anIntArrayArray1416[i];
        if (!flag) {
        } else {
            anIntArrayArray1416[i] = null;
        }
    }

    public static int[] method426(int i) {
        anIntArray1417[i] = anInt1418++;
        if (anIntArrayArray1416[i] != null)
            return anIntArrayArray1416[i];
        int[] ai;
        if (anInt1414 > 0) {
            ai = anIntArrayArray1415[--anInt1414];
            anIntArrayArray1415[anInt1414] = null;
        } else {
            int j = 0;
            int k = -1;
            for (int l = 0; l < anInt1410; l++)
                if (anIntArrayArray1416[l] != null && (anIntArray1417[l] < j || k == -1)) {
                    j = anIntArray1417[l];
                    k = l;
                }

            ai = anIntArrayArray1416[k];
            anIntArrayArray1416[k] = null;
        }
        anIntArrayArray1416[i] = ai;
        Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3 = aClass44_Sub3_Sub1_Sub3Array1411[i];
        int[] ai1 = anIntArrayArray1420[i];
        if (aBoolean1398) {
            aBooleanArray1412[i] = false;
            for (int i1 = 0; i1 < 4096; i1++) {
                int i2 = ai[i1] = ai1[class44_sub3_sub1_sub3.aByteArray1445[i1]] & 0xf8f8ff;
                if (i2 == 0)
                    aBooleanArray1412[i] = true;
                ai[4096 + i1] = i2 - (i2 >>> 3) & 0xf8f8ff;
                ai[8192 + i1] = i2 - (i2 >>> 2) & 0xf8f8ff;
                ai[12288 + i1] = i2 - (i2 >>> 2) - (i2 >>> 3) & 0xf8f8ff;
            }

        } else {
            if (class44_sub3_sub1_sub3.anInt1447 == 64) {
                for (int j1 = 0; j1 < 128; j1++) {
                    for (int j2 = 0; j2 < 128; j2++)
                        ai[j2 + (j1 << 7)] = ai1[class44_sub3_sub1_sub3.aByteArray1445[(j2 >> 1) + ((j1 >> 1) << 6)]];

                }

            } else {
                for (int k1 = 0; k1 < 16384; k1++)
                    ai[k1] = ai1[class44_sub3_sub1_sub3.aByteArray1445[k1]];

            }
            aBooleanArray1412[i] = false;
            for (int l1 = 0; l1 < 16384; l1++) {
                ai[l1] &= 0xf8f8ff;
                int k2 = ai[l1];
                if (k2 == 0)
                    aBooleanArray1412[i] = true;
                ai[16384 + l1] = k2 - (k2 >>> 3) & 0xf8f8ff;
                ai[32768 + l1] = k2 - (k2 >>> 2) & 0xf8f8ff;
                ai[49152 + l1] = k2 - (k2 >>> 2) - (k2 >>> 3) & 0xf8f8ff;
            }

        }
        return ai;
    }

    public static void method427(int i, double d) {
        if (i != -42222)
            return;
        d += Math.random() * 0.029999999999999999D - 0.014999999999999999D;
        int j = 0;
        for (int k = 0; k < 512; k++) {
            double d1 = (double) (k / 8) / 64D + 0.0078125D;
            double d2 = (double) (k & 7) / 8D + 0.0625D;
            for (int k1 = 0; k1 < 128; k1++) {
                double d3 = (double) k1 / 128D;
                double d4 = d3;
                double d5 = d3;
                double d6 = d3;
                if (d2 != 0.0D) {
                    double d7;
                    if (d3 < 0.5D)
                        d7 = d3 * (1.0D + d2);
                    else
                        d7 = (d3 + d2) - d3 * d2;
                    double d8 = 2D * d3 - d7;
                    double d9 = d1 + 0.33333333333333331D;
                    if (d9 > 1.0D)
                        d9--;
                    double d10 = d1;
                    double d11 = d1 - 0.33333333333333331D;
                    if (d11 < 0.0D)
                        d11++;
                    if (6D * d9 < 1.0D)
                        d4 = d8 + (d7 - d8) * 6D * d9;
                    else if (2D * d9 < 1.0D)
                        d4 = d7;
                    else if (3D * d9 < 2D)
                        d4 = d8 + (d7 - d8) * (0.66666666666666663D - d9) * 6D;
                    else
                        d4 = d8;
                    if (6D * d10 < 1.0D)
                        d5 = d8 + (d7 - d8) * 6D * d10;
                    else if (2D * d10 < 1.0D)
                        d5 = d7;
                    else if (3D * d10 < 2D)
                        d5 = d8 + (d7 - d8) * (0.66666666666666663D - d10) * 6D;
                    else
                        d5 = d8;
                    if (6D * d11 < 1.0D)
                        d6 = d8 + (d7 - d8) * 6D * d11;
                    else if (2D * d11 < 1.0D)
                        d6 = d7;
                    else if (3D * d11 < 2D)
                        d6 = d8 + (d7 - d8) * (0.66666666666666663D - d11) * 6D;
                    else
                        d6 = d8;
                }
                int l1 = (int) (d4 * 256D);
                int i2 = (int) (d5 * 256D);
                int j2 = (int) (d6 * 256D);
                int k2 = (l1 << 16) + (i2 << 8) + j2;
                k2 = method428(k2, d);
                anIntArray1419[j++] = k2;
            }

        }

        for (int l = 0; l < 50; l++)
            if (aClass44_Sub3_Sub1_Sub3Array1411[l] != null) {
                int[] ai = aClass44_Sub3_Sub1_Sub3Array1411[l].anIntArray1446;
                anIntArrayArray1420[l] = new int[ai.length];
                for (int j1 = 0; j1 < ai.length; j1++) {
                    anIntArrayArray1420[l][j1] = method428(ai[j1], d);
                    if ((anIntArrayArray1420[l][j1] & 0xf8f8ff) == 0 && j1 != 0)
                        anIntArrayArray1420[l][j1] = 1;
                }

            }

        for (int i1 = 0; i1 < 50; i1++)
            method425(i1, true);

    }

    public static int method428(int i, double d) {
        double d1 = (double) (i >> 16) / 256D;
        double d2 = (double) (i >> 8 & 0xff) / 256D;
        double d3 = (double) (i & 0xff) / 256D;
        d1 = Math.pow(d1, d);
        d2 = Math.pow(d2, d);
        d3 = Math.pow(d3, d);
        int j = (int) (d1 * 256D);
        int k = (int) (d2 * 256D);
        int l = (int) (d3 * 256D);
        return (j << 16) + (k << 8) + l;
    }

    public static void method429(int i, int j, int k, int l, int i1, int j1, int k1, int l1,
                                 int i2) {
        int j2 = 0;
        int k2 = 0;
        if (j != i) {
            j2 = (i1 - l << 16) / (j - i);
            k2 = (l1 - k1 << 15) / (j - i);
        }
        int l2 = 0;
        int i3 = 0;
        if (k != j) {
            l2 = (j1 - i1 << 16) / (k - j);
            i3 = (i2 - l1 << 15) / (k - j);
        }
        int j3 = 0;
        int k3 = 0;
        if (k != i) {
            j3 = (l - j1 << 16) / (i - k);
            k3 = (k1 - i2 << 15) / (i - k);
        }
        if (i <= j && i <= k) {
            if (i >= Class44_Sub3_Sub1.anInt1355)
                return;
            if (j > Class44_Sub3_Sub1.anInt1355)
                j = Class44_Sub3_Sub1.anInt1355;
            if (k > Class44_Sub3_Sub1.anInt1355)
                k = Class44_Sub3_Sub1.anInt1355;
            if (j < k) {
                j1 = l <<= 16;
                i2 = k1 <<= 15;
                if (i < 0) {
                    j1 -= j3 * i;
                    l -= j2 * i;
                    i2 -= k3 * i;
                    k1 -= k2 * i;
                    i = 0;
                }
                i1 <<= 16;
                l1 <<= 15;
                if (j < 0) {
                    i1 -= l2 * j;
                    l1 -= i3 * j;
                    j = 0;
                }
                if (i != j && j3 < j2 || i == j && j3 > l2) {
                    k -= j;
                    j -= i;
                    for (i = anIntArray1409[i]; --j >= 0; i += Class44_Sub3_Sub1.anInt1352) {
                        method430(Class44_Sub3_Sub1.anIntArray1351, i, 0, 0, j1 >> 16, l >> 16, i2 >> 7, k1 >> 7);
                        j1 += j3;
                        l += j2;
                        i2 += k3;
                        k1 += k2;
                    }

                    while (--k >= 0) {
                        method430(Class44_Sub3_Sub1.anIntArray1351, i, 0, 0, j1 >> 16, i1 >> 16, i2 >> 7, l1 >> 7);
                        j1 += j3;
                        i1 += l2;
                        i2 += k3;
                        l1 += i3;
                        i += Class44_Sub3_Sub1.anInt1352;
                    }
                    return;
                }
                k -= j;
                j -= i;
                for (i = anIntArray1409[i]; --j >= 0; i += Class44_Sub3_Sub1.anInt1352) {
                    method430(Class44_Sub3_Sub1.anIntArray1351, i, 0, 0, l >> 16, j1 >> 16, k1 >> 7, i2 >> 7);
                    j1 += j3;
                    l += j2;
                    i2 += k3;
                    k1 += k2;
                }

                while (--k >= 0) {
                    method430(Class44_Sub3_Sub1.anIntArray1351, i, 0, 0, i1 >> 16, j1 >> 16, l1 >> 7, i2 >> 7);
                    j1 += j3;
                    i1 += l2;
                    i2 += k3;
                    l1 += i3;
                    i += Class44_Sub3_Sub1.anInt1352;
                }
                return;
            }
            i1 = l <<= 16;
            l1 = k1 <<= 15;
            if (i < 0) {
                i1 -= j3 * i;
                l -= j2 * i;
                l1 -= k3 * i;
                k1 -= k2 * i;
                i = 0;
            }
            j1 <<= 16;
            i2 <<= 15;
            if (k < 0) {
                j1 -= l2 * k;
                i2 -= i3 * k;
                k = 0;
            }
            if (i != k && j3 < j2 || i == k && l2 > j2) {
                j -= k;
                k -= i;
                for (i = anIntArray1409[i]; --k >= 0; i += Class44_Sub3_Sub1.anInt1352) {
                    method430(Class44_Sub3_Sub1.anIntArray1351, i, 0, 0, i1 >> 16, l >> 16, l1 >> 7, k1 >> 7);
                    i1 += j3;
                    l += j2;
                    l1 += k3;
                    k1 += k2;
                }

                while (--j >= 0) {
                    method430(Class44_Sub3_Sub1.anIntArray1351, i, 0, 0, j1 >> 16, l >> 16, i2 >> 7, k1 >> 7);
                    j1 += l2;
                    l += j2;
                    i2 += i3;
                    k1 += k2;
                    i += Class44_Sub3_Sub1.anInt1352;
                }
                return;
            }
            j -= k;
            k -= i;
            for (i = anIntArray1409[i]; --k >= 0; i += Class44_Sub3_Sub1.anInt1352) {
                method430(Class44_Sub3_Sub1.anIntArray1351, i, 0, 0, l >> 16, i1 >> 16, k1 >> 7, l1 >> 7);
                i1 += j3;
                l += j2;
                l1 += k3;
                k1 += k2;
            }

            while (--j >= 0) {
                method430(Class44_Sub3_Sub1.anIntArray1351, i, 0, 0, l >> 16, j1 >> 16, k1 >> 7, i2 >> 7);
                j1 += l2;
                l += j2;
                i2 += i3;
                k1 += k2;
                i += Class44_Sub3_Sub1.anInt1352;
            }
            return;
        }
        if (j <= k) {
            if (j >= Class44_Sub3_Sub1.anInt1355)
                return;
            if (k > Class44_Sub3_Sub1.anInt1355)
                k = Class44_Sub3_Sub1.anInt1355;
            if (i > Class44_Sub3_Sub1.anInt1355)
                i = Class44_Sub3_Sub1.anInt1355;
            if (k < i) {
                l = i1 <<= 16;
                k1 = l1 <<= 15;
                if (j < 0) {
                    l -= j2 * j;
                    i1 -= l2 * j;
                    k1 -= k2 * j;
                    l1 -= i3 * j;
                    j = 0;
                }
                j1 <<= 16;
                i2 <<= 15;
                if (k < 0) {
                    j1 -= j3 * k;
                    i2 -= k3 * k;
                    k = 0;
                }
                if (j != k && j2 < l2 || j == k && j2 > j3) {
                    i -= k;
                    k -= j;
                    for (j = anIntArray1409[j]; --k >= 0; j += Class44_Sub3_Sub1.anInt1352) {
                        method430(Class44_Sub3_Sub1.anIntArray1351, j, 0, 0, l >> 16, i1 >> 16, k1 >> 7, l1 >> 7);
                        l += j2;
                        i1 += l2;
                        k1 += k2;
                        l1 += i3;
                    }

                    while (--i >= 0) {
                        method430(Class44_Sub3_Sub1.anIntArray1351, j, 0, 0, l >> 16, j1 >> 16, k1 >> 7, i2 >> 7);
                        l += j2;
                        j1 += j3;
                        k1 += k2;
                        i2 += k3;
                        j += Class44_Sub3_Sub1.anInt1352;
                    }
                    return;
                }
                i -= k;
                k -= j;
                for (j = anIntArray1409[j]; --k >= 0; j += Class44_Sub3_Sub1.anInt1352) {
                    method430(Class44_Sub3_Sub1.anIntArray1351, j, 0, 0, i1 >> 16, l >> 16, l1 >> 7, k1 >> 7);
                    l += j2;
                    i1 += l2;
                    k1 += k2;
                    l1 += i3;
                }

                while (--i >= 0) {
                    method430(Class44_Sub3_Sub1.anIntArray1351, j, 0, 0, j1 >> 16, l >> 16, i2 >> 7, k1 >> 7);
                    l += j2;
                    j1 += j3;
                    k1 += k2;
                    i2 += k3;
                    j += Class44_Sub3_Sub1.anInt1352;
                }
                return;
            }
            j1 = i1 <<= 16;
            i2 = l1 <<= 15;
            if (j < 0) {
                j1 -= j2 * j;
                i1 -= l2 * j;
                i2 -= k2 * j;
                l1 -= i3 * j;
                j = 0;
            }
            l <<= 16;
            k1 <<= 15;
            if (i < 0) {
                l -= j3 * i;
                k1 -= k3 * i;
                i = 0;
            }
            if (j2 < l2) {
                k -= i;
                i -= j;
                for (j = anIntArray1409[j]; --i >= 0; j += Class44_Sub3_Sub1.anInt1352) {
                    method430(Class44_Sub3_Sub1.anIntArray1351, j, 0, 0, j1 >> 16, i1 >> 16, i2 >> 7, l1 >> 7);
                    j1 += j2;
                    i1 += l2;
                    i2 += k2;
                    l1 += i3;
                }

                while (--k >= 0) {
                    method430(Class44_Sub3_Sub1.anIntArray1351, j, 0, 0, l >> 16, i1 >> 16, k1 >> 7, l1 >> 7);
                    l += j3;
                    i1 += l2;
                    k1 += k3;
                    l1 += i3;
                    j += Class44_Sub3_Sub1.anInt1352;
                }
                return;
            }
            k -= i;
            i -= j;
            for (j = anIntArray1409[j]; --i >= 0; j += Class44_Sub3_Sub1.anInt1352) {
                method430(Class44_Sub3_Sub1.anIntArray1351, j, 0, 0, i1 >> 16, j1 >> 16, l1 >> 7, i2 >> 7);
                j1 += j2;
                i1 += l2;
                i2 += k2;
                l1 += i3;
            }

            while (--k >= 0) {
                method430(Class44_Sub3_Sub1.anIntArray1351, j, 0, 0, i1 >> 16, l >> 16, l1 >> 7, k1 >> 7);
                l += j3;
                i1 += l2;
                k1 += k3;
                l1 += i3;
                j += Class44_Sub3_Sub1.anInt1352;
            }
            return;
        }
        if (k >= Class44_Sub3_Sub1.anInt1355)
            return;
        if (i > Class44_Sub3_Sub1.anInt1355)
            i = Class44_Sub3_Sub1.anInt1355;
        if (j > Class44_Sub3_Sub1.anInt1355)
            j = Class44_Sub3_Sub1.anInt1355;
        if (i < j) {
            i1 = j1 <<= 16;
            l1 = i2 <<= 15;
            if (k < 0) {
                i1 -= l2 * k;
                j1 -= j3 * k;
                l1 -= i3 * k;
                i2 -= k3 * k;
                k = 0;
            }
            l <<= 16;
            k1 <<= 15;
            if (i < 0) {
                l -= j2 * i;
                k1 -= k2 * i;
                i = 0;
            }
            if (l2 < j3) {
                j -= i;
                i -= k;
                for (k = anIntArray1409[k]; --i >= 0; k += Class44_Sub3_Sub1.anInt1352) {
                    method430(Class44_Sub3_Sub1.anIntArray1351, k, 0, 0, i1 >> 16, j1 >> 16, l1 >> 7, i2 >> 7);
                    i1 += l2;
                    j1 += j3;
                    l1 += i3;
                    i2 += k3;
                }

                while (--j >= 0) {
                    method430(Class44_Sub3_Sub1.anIntArray1351, k, 0, 0, i1 >> 16, l >> 16, l1 >> 7, k1 >> 7);
                    i1 += l2;
                    l += j2;
                    l1 += i3;
                    k1 += k2;
                    k += Class44_Sub3_Sub1.anInt1352;
                }
                return;
            }
            j -= i;
            i -= k;
            for (k = anIntArray1409[k]; --i >= 0; k += Class44_Sub3_Sub1.anInt1352) {
                method430(Class44_Sub3_Sub1.anIntArray1351, k, 0, 0, j1 >> 16, i1 >> 16, i2 >> 7, l1 >> 7);
                i1 += l2;
                j1 += j3;
                l1 += i3;
                i2 += k3;
            }

            while (--j >= 0) {
                method430(Class44_Sub3_Sub1.anIntArray1351, k, 0, 0, l >> 16, i1 >> 16, k1 >> 7, l1 >> 7);
                i1 += l2;
                l += j2;
                l1 += i3;
                k1 += k2;
                k += Class44_Sub3_Sub1.anInt1352;
            }
            return;
        }
        l = j1 <<= 16;
        k1 = i2 <<= 15;
        if (k < 0) {
            l -= l2 * k;
            j1 -= j3 * k;
            k1 -= i3 * k;
            i2 -= k3 * k;
            k = 0;
        }
        i1 <<= 16;
        l1 <<= 15;
        if (j < 0) {
            i1 -= j2 * j;
            l1 -= k2 * j;
            j = 0;
        }
        if (l2 < j3) {
            i -= j;
            j -= k;
            for (k = anIntArray1409[k]; --j >= 0; k += Class44_Sub3_Sub1.anInt1352) {
                method430(Class44_Sub3_Sub1.anIntArray1351, k, 0, 0, l >> 16, j1 >> 16, k1 >> 7, i2 >> 7);
                l += l2;
                j1 += j3;
                k1 += i3;
                i2 += k3;
            }

            while (--i >= 0) {
                method430(Class44_Sub3_Sub1.anIntArray1351, k, 0, 0, i1 >> 16, j1 >> 16, l1 >> 7, i2 >> 7);
                i1 += j2;
                j1 += j3;
                l1 += k2;
                i2 += k3;
                k += Class44_Sub3_Sub1.anInt1352;
            }
            return;
        }
        i -= j;
        j -= k;
        for (k = anIntArray1409[k]; --j >= 0; k += Class44_Sub3_Sub1.anInt1352) {
            method430(Class44_Sub3_Sub1.anIntArray1351, k, 0, 0, j1 >> 16, l >> 16, i2 >> 7, k1 >> 7);
            l += l2;
            j1 += j3;
            k1 += i3;
            i2 += k3;
        }

        while (--i >= 0) {
            method430(Class44_Sub3_Sub1.anIntArray1351, k, 0, 0, j1 >> 16, i1 >> 16, i2 >> 7, l1 >> 7);
            i1 += j2;
            j1 += j3;
            l1 += k2;
            i2 += k3;
            k += Class44_Sub3_Sub1.anInt1352;
        }
    }

    public static void method430(int[] ai, int i, int j, int k, int l, int i1, int j1, int k1) {
        if (aBoolean1401) {
            int l1;
            if (aBoolean1399) {
                if (i1 - l > 3)
                    l1 = (k1 - j1) / (i1 - l);
                else
                    l1 = 0;
                if (i1 > Class44_Sub3_Sub1.anInt1358)
                    i1 = Class44_Sub3_Sub1.anInt1358;
                if (l < 0) {
                    j1 -= l * l1;
                    l = 0;
                }
                if (l >= i1)
                    return;
                i += l;
                k = i1 - l >> 2;
                l1 <<= 2;
            } else {
                if (l >= i1)
                    return;
                i += l;
                k = i1 - l >> 2;
                if (k > 0)
                    l1 = (k1 - j1) * anIntArray1405[k] >> 15;
                else
                    l1 = 0;
            }
            if (anInt1402 == 0) {
                while (--k >= 0) {
                    j = anIntArray1419[j1 >> 8];
                    j1 += l1;
                    ai[i++] = j;
                    ai[i++] = j;
                    ai[i++] = j;
                    ai[i++] = j;
                }
                k = i1 - l & 3;
                if (k > 0) {
                    j = anIntArray1419[j1 >> 8];
                    do
                        ai[i++] = j;
                    while (--k > 0);
                    return;
                }
            } else {
                int j2 = anInt1402;
                int l2 = 256 - anInt1402;
                while (--k >= 0) {
                    j = anIntArray1419[j1 >> 8];
                    j1 += l1;
                    j = ((j & 0xff00ff) * l2 >> 8 & 0xff00ff) + ((j & 0xff00) * l2 >> 8 & 0xff00);
                    ai[i++] = j + ((ai[i] & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j2 >> 8 & 0xff00);
                    ai[i++] = j + ((ai[i] & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j2 >> 8 & 0xff00);
                    ai[i++] = j + ((ai[i] & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j2 >> 8 & 0xff00);
                    ai[i++] = j + ((ai[i] & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j2 >> 8 & 0xff00);
                }
                k = i1 - l & 3;
                if (k > 0) {
                    j = anIntArray1419[j1 >> 8];
                    j = ((j & 0xff00ff) * l2 >> 8 & 0xff00ff) + ((j & 0xff00) * l2 >> 8 & 0xff00);
                    do
                        ai[i++] = j + ((ai[i] & 0xff00ff) * j2 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j2 >> 8 & 0xff00);
                    while (--k > 0);
                }
            }
            return;
        }
        if (l >= i1)
            return;
        int i2 = (k1 - j1) / (i1 - l);
        if (aBoolean1399) {
            if (i1 > Class44_Sub3_Sub1.anInt1358)
                i1 = Class44_Sub3_Sub1.anInt1358;
            if (l < 0) {
                j1 -= l * i2;
                l = 0;
            }
            if (l >= i1)
                return;
        }
        i += l;
        k = i1 - l;
        if (anInt1402 == 0) {
            do {
                ai[i++] = anIntArray1419[j1 >> 8];
                j1 += i2;
            } while (--k > 0);
            return;
        }
        int k2 = anInt1402;
        int i3 = 256 - anInt1402;
        do {
            j = anIntArray1419[j1 >> 8];
            j1 += i2;
            j = ((j & 0xff00ff) * i3 >> 8 & 0xff00ff) + ((j & 0xff00) * i3 >> 8 & 0xff00);
            ai[i++] = j + ((ai[i] & 0xff00ff) * k2 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * k2 >> 8 & 0xff00);
        } while (--k > 0);
    }

    public static void method431(int i, int j, int k, int l, int i1, int j1, int k1) {
        int l1 = 0;
        if (j != i)
            l1 = (i1 - l << 16) / (j - i);
        int i2 = 0;
        if (k != j)
            i2 = (j1 - i1 << 16) / (k - j);
        int j2 = 0;
        if (k != i)
            j2 = (l - j1 << 16) / (i - k);
        if (i <= j && i <= k) {
            if (i >= Class44_Sub3_Sub1.anInt1355)
                return;
            if (j > Class44_Sub3_Sub1.anInt1355)
                j = Class44_Sub3_Sub1.anInt1355;
            if (k > Class44_Sub3_Sub1.anInt1355)
                k = Class44_Sub3_Sub1.anInt1355;
            if (j < k) {
                j1 = l <<= 16;
                if (i < 0) {
                    j1 -= j2 * i;
                    l -= l1 * i;
                    i = 0;
                }
                i1 <<= 16;
                if (j < 0) {
                    i1 -= i2 * j;
                    j = 0;
                }
                if (i != j && j2 < l1 || i == j && j2 > i2) {
                    k -= j;
                    j -= i;
                    for (i = anIntArray1409[i]; --j >= 0; i += Class44_Sub3_Sub1.anInt1352) {
                        method432(Class44_Sub3_Sub1.anIntArray1351, i, k1, 0, j1 >> 16, l >> 16);
                        j1 += j2;
                        l += l1;
                    }

                    while (--k >= 0) {
                        method432(Class44_Sub3_Sub1.anIntArray1351, i, k1, 0, j1 >> 16, i1 >> 16);
                        j1 += j2;
                        i1 += i2;
                        i += Class44_Sub3_Sub1.anInt1352;
                    }
                    return;
                }
                k -= j;
                j -= i;
                for (i = anIntArray1409[i]; --j >= 0; i += Class44_Sub3_Sub1.anInt1352) {
                    method432(Class44_Sub3_Sub1.anIntArray1351, i, k1, 0, l >> 16, j1 >> 16);
                    j1 += j2;
                    l += l1;
                }

                while (--k >= 0) {
                    method432(Class44_Sub3_Sub1.anIntArray1351, i, k1, 0, i1 >> 16, j1 >> 16);
                    j1 += j2;
                    i1 += i2;
                    i += Class44_Sub3_Sub1.anInt1352;
                }
                return;
            }
            i1 = l <<= 16;
            if (i < 0) {
                i1 -= j2 * i;
                l -= l1 * i;
                i = 0;
            }
            j1 <<= 16;
            if (k < 0) {
                j1 -= i2 * k;
                k = 0;
            }
            if (i != k && j2 < l1 || i == k && i2 > l1) {
                j -= k;
                k -= i;
                for (i = anIntArray1409[i]; --k >= 0; i += Class44_Sub3_Sub1.anInt1352) {
                    method432(Class44_Sub3_Sub1.anIntArray1351, i, k1, 0, i1 >> 16, l >> 16);
                    i1 += j2;
                    l += l1;
                }

                while (--j >= 0) {
                    method432(Class44_Sub3_Sub1.anIntArray1351, i, k1, 0, j1 >> 16, l >> 16);
                    j1 += i2;
                    l += l1;
                    i += Class44_Sub3_Sub1.anInt1352;
                }
                return;
            }
            j -= k;
            k -= i;
            for (i = anIntArray1409[i]; --k >= 0; i += Class44_Sub3_Sub1.anInt1352) {
                method432(Class44_Sub3_Sub1.anIntArray1351, i, k1, 0, l >> 16, i1 >> 16);
                i1 += j2;
                l += l1;
            }

            while (--j >= 0) {
                method432(Class44_Sub3_Sub1.anIntArray1351, i, k1, 0, l >> 16, j1 >> 16);
                j1 += i2;
                l += l1;
                i += Class44_Sub3_Sub1.anInt1352;
            }
            return;
        }
        if (j <= k) {
            if (j >= Class44_Sub3_Sub1.anInt1355)
                return;
            if (k > Class44_Sub3_Sub1.anInt1355)
                k = Class44_Sub3_Sub1.anInt1355;
            if (i > Class44_Sub3_Sub1.anInt1355)
                i = Class44_Sub3_Sub1.anInt1355;
            if (k < i) {
                l = i1 <<= 16;
                if (j < 0) {
                    l -= l1 * j;
                    i1 -= i2 * j;
                    j = 0;
                }
                j1 <<= 16;
                if (k < 0) {
                    j1 -= j2 * k;
                    k = 0;
                }
                if (j != k && l1 < i2 || j == k && l1 > j2) {
                    i -= k;
                    k -= j;
                    for (j = anIntArray1409[j]; --k >= 0; j += Class44_Sub3_Sub1.anInt1352) {
                        method432(Class44_Sub3_Sub1.anIntArray1351, j, k1, 0, l >> 16, i1 >> 16);
                        l += l1;
                        i1 += i2;
                    }

                    while (--i >= 0) {
                        method432(Class44_Sub3_Sub1.anIntArray1351, j, k1, 0, l >> 16, j1 >> 16);
                        l += l1;
                        j1 += j2;
                        j += Class44_Sub3_Sub1.anInt1352;
                    }
                    return;
                }
                i -= k;
                k -= j;
                for (j = anIntArray1409[j]; --k >= 0; j += Class44_Sub3_Sub1.anInt1352) {
                    method432(Class44_Sub3_Sub1.anIntArray1351, j, k1, 0, i1 >> 16, l >> 16);
                    l += l1;
                    i1 += i2;
                }

                while (--i >= 0) {
                    method432(Class44_Sub3_Sub1.anIntArray1351, j, k1, 0, j1 >> 16, l >> 16);
                    l += l1;
                    j1 += j2;
                    j += Class44_Sub3_Sub1.anInt1352;
                }
                return;
            }
            j1 = i1 <<= 16;
            if (j < 0) {
                j1 -= l1 * j;
                i1 -= i2 * j;
                j = 0;
            }
            l <<= 16;
            if (i < 0) {
                l -= j2 * i;
                i = 0;
            }
            if (l1 < i2) {
                k -= i;
                i -= j;
                for (j = anIntArray1409[j]; --i >= 0; j += Class44_Sub3_Sub1.anInt1352) {
                    method432(Class44_Sub3_Sub1.anIntArray1351, j, k1, 0, j1 >> 16, i1 >> 16);
                    j1 += l1;
                    i1 += i2;
                }

                while (--k >= 0) {
                    method432(Class44_Sub3_Sub1.anIntArray1351, j, k1, 0, l >> 16, i1 >> 16);
                    l += j2;
                    i1 += i2;
                    j += Class44_Sub3_Sub1.anInt1352;
                }
                return;
            }
            k -= i;
            i -= j;
            for (j = anIntArray1409[j]; --i >= 0; j += Class44_Sub3_Sub1.anInt1352) {
                method432(Class44_Sub3_Sub1.anIntArray1351, j, k1, 0, i1 >> 16, j1 >> 16);
                j1 += l1;
                i1 += i2;
            }

            while (--k >= 0) {
                method432(Class44_Sub3_Sub1.anIntArray1351, j, k1, 0, i1 >> 16, l >> 16);
                l += j2;
                i1 += i2;
                j += Class44_Sub3_Sub1.anInt1352;
            }
            return;
        }
        if (k >= Class44_Sub3_Sub1.anInt1355)
            return;
        if (i > Class44_Sub3_Sub1.anInt1355)
            i = Class44_Sub3_Sub1.anInt1355;
        if (j > Class44_Sub3_Sub1.anInt1355)
            j = Class44_Sub3_Sub1.anInt1355;
        if (i < j) {
            i1 = j1 <<= 16;
            if (k < 0) {
                i1 -= i2 * k;
                j1 -= j2 * k;
                k = 0;
            }
            l <<= 16;
            if (i < 0) {
                l -= l1 * i;
                i = 0;
            }
            if (i2 < j2) {
                j -= i;
                i -= k;
                for (k = anIntArray1409[k]; --i >= 0; k += Class44_Sub3_Sub1.anInt1352) {
                    method432(Class44_Sub3_Sub1.anIntArray1351, k, k1, 0, i1 >> 16, j1 >> 16);
                    i1 += i2;
                    j1 += j2;
                }

                while (--j >= 0) {
                    method432(Class44_Sub3_Sub1.anIntArray1351, k, k1, 0, i1 >> 16, l >> 16);
                    i1 += i2;
                    l += l1;
                    k += Class44_Sub3_Sub1.anInt1352;
                }
                return;
            }
            j -= i;
            i -= k;
            for (k = anIntArray1409[k]; --i >= 0; k += Class44_Sub3_Sub1.anInt1352) {
                method432(Class44_Sub3_Sub1.anIntArray1351, k, k1, 0, j1 >> 16, i1 >> 16);
                i1 += i2;
                j1 += j2;
            }

            while (--j >= 0) {
                method432(Class44_Sub3_Sub1.anIntArray1351, k, k1, 0, l >> 16, i1 >> 16);
                i1 += i2;
                l += l1;
                k += Class44_Sub3_Sub1.anInt1352;
            }
            return;
        }
        l = j1 <<= 16;
        if (k < 0) {
            l -= i2 * k;
            j1 -= j2 * k;
            k = 0;
        }
        i1 <<= 16;
        if (j < 0) {
            i1 -= l1 * j;
            j = 0;
        }
        if (i2 < j2) {
            i -= j;
            j -= k;
            for (k = anIntArray1409[k]; --j >= 0; k += Class44_Sub3_Sub1.anInt1352) {
                method432(Class44_Sub3_Sub1.anIntArray1351, k, k1, 0, l >> 16, j1 >> 16);
                l += i2;
                j1 += j2;
            }

            while (--i >= 0) {
                method432(Class44_Sub3_Sub1.anIntArray1351, k, k1, 0, i1 >> 16, j1 >> 16);
                i1 += l1;
                j1 += j2;
                k += Class44_Sub3_Sub1.anInt1352;
            }
            return;
        }
        i -= j;
        j -= k;
        for (k = anIntArray1409[k]; --j >= 0; k += Class44_Sub3_Sub1.anInt1352) {
            method432(Class44_Sub3_Sub1.anIntArray1351, k, k1, 0, j1 >> 16, l >> 16);
            l += i2;
            j1 += j2;
        }

        while (--i >= 0) {
            method432(Class44_Sub3_Sub1.anIntArray1351, k, k1, 0, j1 >> 16, i1 >> 16);
            i1 += l1;
            j1 += j2;
            k += Class44_Sub3_Sub1.anInt1352;
        }
    }

    public static void method432(int[] ai, int i, int j, int k, int l, int i1) {
        if (aBoolean1399) {
            if (i1 > Class44_Sub3_Sub1.anInt1358)
                i1 = Class44_Sub3_Sub1.anInt1358;
            if (l < 0)
                l = 0;
        }
        if (l >= i1)
            return;
        i += l;
        k = i1 - l >> 2;
        if (anInt1402 == 0) {
            while (--k >= 0) {
                ai[i++] = j;
                ai[i++] = j;
                ai[i++] = j;
                ai[i++] = j;
            }
            for (k = i1 - l & 3; --k >= 0; )
                ai[i++] = j;

            return;
        }
        int j1 = anInt1402;
        int k1 = 256 - anInt1402;
        j = ((j & 0xff00ff) * k1 >> 8 & 0xff00ff) + ((j & 0xff00) * k1 >> 8 & 0xff00);
        while (--k >= 0) {
            ai[i++] = j + ((ai[i] & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j1 >> 8 & 0xff00);
            ai[i++] = j + ((ai[i] & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j1 >> 8 & 0xff00);
            ai[i++] = j + ((ai[i] & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j1 >> 8 & 0xff00);
            ai[i++] = j + ((ai[i] & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j1 >> 8 & 0xff00);
        }
        for (k = i1 - l & 3; --k >= 0; )
            ai[i++] = j + ((ai[i] & 0xff00ff) * j1 >> 8 & 0xff00ff) + ((ai[i] & 0xff00) * j1 >> 8 & 0xff00);

    }

    public static void method433(int i, int j, int k, int l, int i1, int j1, int k1, int l1,
                                 int i2, int j2, int k2, int l2, int i3, int j3, int k3,
                                 int l3, int i4, int j4, int k4) {
        int[] ai = method426(k4);
        aBoolean1400 = !aBooleanArray1412[k4];
        k2 = j2 - k2;
        j3 = i3 - j3;
        i4 = l3 - i4;
        l2 -= j2;
        k3 -= i3;
        j4 -= l3;
        int l4 = l2 * i3 - k3 * j2 << 14;
        int i5 = k3 * l3 - j4 * i3 << 8;
        int j5 = j4 * j2 - l2 * l3 << 5;
        int k5 = k2 * i3 - j3 * j2 << 14;
        int l5 = j3 * l3 - i4 * i3 << 8;
        int i6 = i4 * j2 - k2 * l3 << 5;
        int j6 = j3 * l2 - k2 * k3 << 14;
        int k6 = i4 * k3 - j3 * j4 << 8;
        int l6 = k2 * j4 - i4 * l2 << 5;
        int i7 = 0;
        int j7 = 0;
        if (j != i) {
            i7 = (i1 - l << 16) / (j - i);
            j7 = (l1 - k1 << 16) / (j - i);
        }
        int k7 = 0;
        int l7 = 0;
        if (k != j) {
            k7 = (j1 - i1 << 16) / (k - j);
            l7 = (i2 - l1 << 16) / (k - j);
        }
        int i8 = 0;
        int j8 = 0;
        if (k != i) {
            i8 = (l - j1 << 16) / (i - k);
            j8 = (k1 - i2 << 16) / (i - k);
        }
        if (i <= j && i <= k) {
            if (i >= Class44_Sub3_Sub1.anInt1355)
                return;
            if (j > Class44_Sub3_Sub1.anInt1355)
                j = Class44_Sub3_Sub1.anInt1355;
            if (k > Class44_Sub3_Sub1.anInt1355)
                k = Class44_Sub3_Sub1.anInt1355;
            if (j < k) {
                j1 = l <<= 16;
                i2 = k1 <<= 16;
                if (i < 0) {
                    j1 -= i8 * i;
                    l -= i7 * i;
                    i2 -= j8 * i;
                    k1 -= j7 * i;
                    i = 0;
                }
                i1 <<= 16;
                l1 <<= 16;
                if (j < 0) {
                    i1 -= k7 * j;
                    l1 -= l7 * j;
                    j = 0;
                }
                int k8 = i - anInt1404;
                l4 += j5 * k8;
                k5 += i6 * k8;
                j6 += l6 * k8;
                if (i != j && i8 < i7 || i == j && i8 > k7) {
                    k -= j;
                    j -= i;
                    i = anIntArray1409[i];
                    while (--j >= 0) {
                        method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, i, j1 >> 16, l >> 16, i2 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
                        j1 += i8;
                        l += i7;
                        i2 += j8;
                        k1 += j7;
                        i += Class44_Sub3_Sub1.anInt1352;
                        l4 += j5;
                        k5 += i6;
                        j6 += l6;
                    }
                    while (--k >= 0) {
                        method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, i, j1 >> 16, i1 >> 16, i2 >> 8, l1 >> 8, l4, k5, j6, i5, l5, k6);
                        j1 += i8;
                        i1 += k7;
                        i2 += j8;
                        l1 += l7;
                        i += Class44_Sub3_Sub1.anInt1352;
                        l4 += j5;
                        k5 += i6;
                        j6 += l6;
                    }
                    return;
                }
                k -= j;
                j -= i;
                i = anIntArray1409[i];
                while (--j >= 0) {
                    method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, i, l >> 16, j1 >> 16, k1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
                    j1 += i8;
                    l += i7;
                    i2 += j8;
                    k1 += j7;
                    i += Class44_Sub3_Sub1.anInt1352;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                }
                while (--k >= 0) {
                    method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, i, i1 >> 16, j1 >> 16, l1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
                    j1 += i8;
                    i1 += k7;
                    i2 += j8;
                    l1 += l7;
                    i += Class44_Sub3_Sub1.anInt1352;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                }
                return;
            }
            i1 = l <<= 16;
            l1 = k1 <<= 16;
            if (i < 0) {
                i1 -= i8 * i;
                l -= i7 * i;
                l1 -= j8 * i;
                k1 -= j7 * i;
                i = 0;
            }
            j1 <<= 16;
            i2 <<= 16;
            if (k < 0) {
                j1 -= k7 * k;
                i2 -= l7 * k;
                k = 0;
            }
            int l8 = i - anInt1404;
            l4 += j5 * l8;
            k5 += i6 * l8;
            j6 += l6 * l8;
            if (i != k && i8 < i7 || i == k && k7 > i7) {
                j -= k;
                k -= i;
                i = anIntArray1409[i];
                while (--k >= 0) {
                    method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, i, i1 >> 16, l >> 16, l1 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
                    i1 += i8;
                    l += i7;
                    l1 += j8;
                    k1 += j7;
                    i += Class44_Sub3_Sub1.anInt1352;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                }
                while (--j >= 0) {
                    method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, i, j1 >> 16, l >> 16, i2 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
                    j1 += k7;
                    l += i7;
                    i2 += l7;
                    k1 += j7;
                    i += Class44_Sub3_Sub1.anInt1352;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                }
                return;
            }
            j -= k;
            k -= i;
            i = anIntArray1409[i];
            while (--k >= 0) {
                method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, i, l >> 16, i1 >> 16, k1 >> 8, l1 >> 8, l4, k5, j6, i5, l5, k6);
                i1 += i8;
                l += i7;
                l1 += j8;
                k1 += j7;
                i += Class44_Sub3_Sub1.anInt1352;
                l4 += j5;
                k5 += i6;
                j6 += l6;
            }
            while (--j >= 0) {
                method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, i, l >> 16, j1 >> 16, k1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
                j1 += k7;
                l += i7;
                i2 += l7;
                k1 += j7;
                i += Class44_Sub3_Sub1.anInt1352;
                l4 += j5;
                k5 += i6;
                j6 += l6;
            }
            return;
        }
        if (j <= k) {
            if (j >= Class44_Sub3_Sub1.anInt1355)
                return;
            if (k > Class44_Sub3_Sub1.anInt1355)
                k = Class44_Sub3_Sub1.anInt1355;
            if (i > Class44_Sub3_Sub1.anInt1355)
                i = Class44_Sub3_Sub1.anInt1355;
            if (k < i) {
                l = i1 <<= 16;
                k1 = l1 <<= 16;
                if (j < 0) {
                    l -= i7 * j;
                    i1 -= k7 * j;
                    k1 -= j7 * j;
                    l1 -= l7 * j;
                    j = 0;
                }
                j1 <<= 16;
                i2 <<= 16;
                if (k < 0) {
                    j1 -= i8 * k;
                    i2 -= j8 * k;
                    k = 0;
                }
                int i9 = j - anInt1404;
                l4 += j5 * i9;
                k5 += i6 * i9;
                j6 += l6 * i9;
                if (j != k && i7 < k7 || j == k && i7 > i8) {
                    i -= k;
                    k -= j;
                    j = anIntArray1409[j];
                    while (--k >= 0) {
                        method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, j, l >> 16, i1 >> 16, k1 >> 8, l1 >> 8, l4, k5, j6, i5, l5, k6);
                        l += i7;
                        i1 += k7;
                        k1 += j7;
                        l1 += l7;
                        j += Class44_Sub3_Sub1.anInt1352;
                        l4 += j5;
                        k5 += i6;
                        j6 += l6;
                    }
                    while (--i >= 0) {
                        method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, j, l >> 16, j1 >> 16, k1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
                        l += i7;
                        j1 += i8;
                        k1 += j7;
                        i2 += j8;
                        j += Class44_Sub3_Sub1.anInt1352;
                        l4 += j5;
                        k5 += i6;
                        j6 += l6;
                    }
                    return;
                }
                i -= k;
                k -= j;
                j = anIntArray1409[j];
                while (--k >= 0) {
                    method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, j, i1 >> 16, l >> 16, l1 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
                    l += i7;
                    i1 += k7;
                    k1 += j7;
                    l1 += l7;
                    j += Class44_Sub3_Sub1.anInt1352;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                }
                while (--i >= 0) {
                    method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, j, j1 >> 16, l >> 16, i2 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
                    l += i7;
                    j1 += i8;
                    k1 += j7;
                    i2 += j8;
                    j += Class44_Sub3_Sub1.anInt1352;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                }
                return;
            }
            j1 = i1 <<= 16;
            i2 = l1 <<= 16;
            if (j < 0) {
                j1 -= i7 * j;
                i1 -= k7 * j;
                i2 -= j7 * j;
                l1 -= l7 * j;
                j = 0;
            }
            l <<= 16;
            k1 <<= 16;
            if (i < 0) {
                l -= i8 * i;
                k1 -= j8 * i;
                i = 0;
            }
            int j9 = j - anInt1404;
            l4 += j5 * j9;
            k5 += i6 * j9;
            j6 += l6 * j9;
            if (i7 < k7) {
                k -= i;
                i -= j;
                j = anIntArray1409[j];
                while (--i >= 0) {
                    method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, j, j1 >> 16, i1 >> 16, i2 >> 8, l1 >> 8, l4, k5, j6, i5, l5, k6);
                    j1 += i7;
                    i1 += k7;
                    i2 += j7;
                    l1 += l7;
                    j += Class44_Sub3_Sub1.anInt1352;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                }
                while (--k >= 0) {
                    method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, j, l >> 16, i1 >> 16, k1 >> 8, l1 >> 8, l4, k5, j6, i5, l5, k6);
                    l += i8;
                    i1 += k7;
                    k1 += j8;
                    l1 += l7;
                    j += Class44_Sub3_Sub1.anInt1352;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                }
                return;
            }
            k -= i;
            i -= j;
            j = anIntArray1409[j];
            while (--i >= 0) {
                method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, j, i1 >> 16, j1 >> 16, l1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
                j1 += i7;
                i1 += k7;
                i2 += j7;
                l1 += l7;
                j += Class44_Sub3_Sub1.anInt1352;
                l4 += j5;
                k5 += i6;
                j6 += l6;
            }
            while (--k >= 0) {
                method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, j, i1 >> 16, l >> 16, l1 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
                l += i8;
                i1 += k7;
                k1 += j8;
                l1 += l7;
                j += Class44_Sub3_Sub1.anInt1352;
                l4 += j5;
                k5 += i6;
                j6 += l6;
            }
            return;
        }
        if (k >= Class44_Sub3_Sub1.anInt1355)
            return;
        if (i > Class44_Sub3_Sub1.anInt1355)
            i = Class44_Sub3_Sub1.anInt1355;
        if (j > Class44_Sub3_Sub1.anInt1355)
            j = Class44_Sub3_Sub1.anInt1355;
        if (i < j) {
            i1 = j1 <<= 16;
            l1 = i2 <<= 16;
            if (k < 0) {
                i1 -= k7 * k;
                j1 -= i8 * k;
                l1 -= l7 * k;
                i2 -= j8 * k;
                k = 0;
            }
            l <<= 16;
            k1 <<= 16;
            if (i < 0) {
                l -= i7 * i;
                k1 -= j7 * i;
                i = 0;
            }
            int k9 = k - anInt1404;
            l4 += j5 * k9;
            k5 += i6 * k9;
            j6 += l6 * k9;
            if (k7 < i8) {
                j -= i;
                i -= k;
                k = anIntArray1409[k];
                while (--i >= 0) {
                    method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, k, i1 >> 16, j1 >> 16, l1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
                    i1 += k7;
                    j1 += i8;
                    l1 += l7;
                    i2 += j8;
                    k += Class44_Sub3_Sub1.anInt1352;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                }
                while (--j >= 0) {
                    method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, k, i1 >> 16, l >> 16, l1 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
                    i1 += k7;
                    l += i7;
                    l1 += l7;
                    k1 += j7;
                    k += Class44_Sub3_Sub1.anInt1352;
                    l4 += j5;
                    k5 += i6;
                    j6 += l6;
                }
                return;
            }
            j -= i;
            i -= k;
            k = anIntArray1409[k];
            while (--i >= 0) {
                method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, k, j1 >> 16, i1 >> 16, i2 >> 8, l1 >> 8, l4, k5, j6, i5, l5, k6);
                i1 += k7;
                j1 += i8;
                l1 += l7;
                i2 += j8;
                k += Class44_Sub3_Sub1.anInt1352;
                l4 += j5;
                k5 += i6;
                j6 += l6;
            }
            while (--j >= 0) {
                method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, k, l >> 16, i1 >> 16, k1 >> 8, l1 >> 8, l4, k5, j6, i5, l5, k6);
                i1 += k7;
                l += i7;
                l1 += l7;
                k1 += j7;
                k += Class44_Sub3_Sub1.anInt1352;
                l4 += j5;
                k5 += i6;
                j6 += l6;
            }
            return;
        }
        l = j1 <<= 16;
        k1 = i2 <<= 16;
        if (k < 0) {
            l -= k7 * k;
            j1 -= i8 * k;
            k1 -= l7 * k;
            i2 -= j8 * k;
            k = 0;
        }
        i1 <<= 16;
        l1 <<= 16;
        if (j < 0) {
            i1 -= i7 * j;
            l1 -= j7 * j;
            j = 0;
        }
        int l9 = k - anInt1404;
        l4 += j5 * l9;
        k5 += i6 * l9;
        j6 += l6 * l9;
        if (k7 < i8) {
            i -= j;
            j -= k;
            k = anIntArray1409[k];
            while (--j >= 0) {
                method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, k, l >> 16, j1 >> 16, k1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
                l += k7;
                j1 += i8;
                k1 += l7;
                i2 += j8;
                k += Class44_Sub3_Sub1.anInt1352;
                l4 += j5;
                k5 += i6;
                j6 += l6;
            }
            while (--i >= 0) {
                method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, k, i1 >> 16, j1 >> 16, l1 >> 8, i2 >> 8, l4, k5, j6, i5, l5, k6);
                i1 += i7;
                j1 += i8;
                l1 += j7;
                i2 += j8;
                k += Class44_Sub3_Sub1.anInt1352;
                l4 += j5;
                k5 += i6;
                j6 += l6;
            }
            return;
        }
        i -= j;
        j -= k;
        k = anIntArray1409[k];
        while (--j >= 0) {
            method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, k, j1 >> 16, l >> 16, i2 >> 8, k1 >> 8, l4, k5, j6, i5, l5, k6);
            l += k7;
            j1 += i8;
            k1 += l7;
            i2 += j8;
            k += Class44_Sub3_Sub1.anInt1352;
            l4 += j5;
            k5 += i6;
            j6 += l6;
        }
        while (--i >= 0) {
            method434(Class44_Sub3_Sub1.anIntArray1351, ai, 0, 0, k, j1 >> 16, i1 >> 16, i2 >> 8, l1 >> 8, l4, k5, j6, i5, l5, k6);
            i1 += i7;
            j1 += i8;
            l1 += j7;
            i2 += j8;
            k += Class44_Sub3_Sub1.anInt1352;
            l4 += j5;
            k5 += i6;
            j6 += l6;
        }
    }

    public static void method434(int[] ai, int[] ai1, int i, int j, int k, int l, int i1, int j1,
                                 int k1, int l1, int i2, int j2, int k2, int l2, int i3) {
        if (l >= i1)
            return;
        int j3;
        int k3;
        if (aBoolean1399) {
            j3 = (k1 - j1) / (i1 - l);
            if (i1 > Class44_Sub3_Sub1.anInt1358)
                i1 = Class44_Sub3_Sub1.anInt1358;
            if (l < 0) {
                j1 -= l * j3;
                l = 0;
            }
            if (l >= i1)
                return;
            k3 = i1 - l >> 3;
            j3 <<= 12;
            j1 <<= 9;
        } else {
            if (i1 - l > 7) {
                k3 = i1 - l >> 3;
                j3 = (k1 - j1) * anIntArray1405[k3] >> 6;
            } else {
                k3 = 0;
                j3 = 0;
            }
            j1 <<= 9;
        }
        k += l;
        if (aBoolean1398) {
            int i4 = 0;
            int k4 = 0;
            int k6 = l - anInt1403;
            l1 += (k2 >> 3) * k6;
            i2 += (l2 >> 3) * k6;
            j2 += (i3 >> 3) * k6;
            int i5 = j2 >> 12;
            if (i5 != 0) {
                i = l1 / i5;
                j = i2 / i5;
                if (i < 0)
                    i = 0;
                else if (i > 4032)
                    i = 4032;
            }
            l1 += k2;
            i2 += l2;
            j2 += i3;
            i5 = j2 >> 12;
            if (i5 != 0) {
                i4 = l1 / i5;
                k4 = i2 / i5;
                if (i4 < 7)
                    i4 = 7;
                else if (i4 > 4032)
                    i4 = 4032;
            }
            int i7 = i4 - i >> 3;
            int k7 = k4 - j >> 3;
            i += (j1 & 0x600000) >> 3;
            int i8 = j1 >> 23;
            if (aBoolean1400) {
                while (k3-- > 0) {
                    ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
                    i += i7;
                    j += k7;
                    ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
                    i += i7;
                    j += k7;
                    ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
                    i += i7;
                    j += k7;
                    ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
                    i += i7;
                    j += k7;
                    ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
                    i += i7;
                    j += k7;
                    ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
                    i += i7;
                    j += k7;
                    ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
                    i += i7;
                    j += k7;
                    ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
                    i = i4;
                    j = k4;
                    l1 += k2;
                    i2 += l2;
                    j2 += i3;
                    int j5 = j2 >> 12;
                    if (j5 != 0) {
                        i4 = l1 / j5;
                        k4 = i2 / j5;
                        if (i4 < 7)
                            i4 = 7;
                        else if (i4 > 4032)
                            i4 = 4032;
                    }
                    i7 = i4 - i >> 3;
                    k7 = k4 - j >> 3;
                    j1 += j3;
                    i += (j1 & 0x600000) >> 3;
                    i8 = j1 >> 23;
                }
                for (k3 = i1 - l & 7; k3-- > 0; ) {
                    ai[k++] = ai1[(j & 0xfc0) + (i >> 6)] >>> i8;
                    i += i7;
                    j += k7;
                }

                return;
            }
            while (k3-- > 0) {
                int k8;
                if ((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0)
                    ai[k] = k8;
                k++;
                i += i7;
                j += k7;
                if ((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0)
                    ai[k] = k8;
                k++;
                i += i7;
                j += k7;
                if ((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0)
                    ai[k] = k8;
                k++;
                i += i7;
                j += k7;
                if ((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0)
                    ai[k] = k8;
                k++;
                i += i7;
                j += k7;
                if ((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0)
                    ai[k] = k8;
                k++;
                i += i7;
                j += k7;
                if ((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0)
                    ai[k] = k8;
                k++;
                i += i7;
                j += k7;
                if ((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0)
                    ai[k] = k8;
                k++;
                i += i7;
                j += k7;
                if ((k8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0)
                    ai[k] = k8;
                k++;
                i = i4;
                j = k4;
                l1 += k2;
                i2 += l2;
                j2 += i3;
                int k5 = j2 >> 12;
                if (k5 != 0) {
                    i4 = l1 / k5;
                    k4 = i2 / k5;
                    if (i4 < 7)
                        i4 = 7;
                    else if (i4 > 4032)
                        i4 = 4032;
                }
                i7 = i4 - i >> 3;
                k7 = k4 - j >> 3;
                j1 += j3;
                i += (j1 & 0x600000) >> 3;
                i8 = j1 >> 23;
            }
            for (k3 = i1 - l & 7; k3-- > 0; ) {
                int l8;
                if ((l8 = ai1[(j & 0xfc0) + (i >> 6)] >>> i8) != 0)
                    ai[k] = l8;
                k++;
                i += i7;
                j += k7;
            }

            return;
        }
        int j4 = 0;
        int l4 = 0;
        int l6 = l - anInt1403;
        l1 += (k2 >> 3) * l6;
        i2 += (l2 >> 3) * l6;
        j2 += (i3 >> 3) * l6;
        int l5 = j2 >> 14;
        if (l5 != 0) {
            i = l1 / l5;
            j = i2 / l5;
            if (i < 0)
                i = 0;
            else if (i > 16256)
                i = 16256;
        }
        l1 += k2;
        i2 += l2;
        j2 += i3;
        l5 = j2 >> 14;
        if (l5 != 0) {
            j4 = l1 / l5;
            l4 = i2 / l5;
            if (j4 < 7)
                j4 = 7;
            else if (j4 > 16256)
                j4 = 16256;
        }
        int j7 = j4 - i >> 3;
        int l7 = l4 - j >> 3;
        i += j1 & 0x600000;
        int j8 = j1 >> 23;
        if (aBoolean1400) {
            while (k3-- > 0) {
                ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
                i += j7;
                j += l7;
                ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
                i += j7;
                j += l7;
                ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
                i += j7;
                j += l7;
                ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
                i += j7;
                j += l7;
                ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
                i += j7;
                j += l7;
                ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
                i += j7;
                j += l7;
                ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
                i += j7;
                j += l7;
                ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
                i = j4;
                j = l4;
                l1 += k2;
                i2 += l2;
                j2 += i3;
                int i6 = j2 >> 14;
                if (i6 != 0) {
                    j4 = l1 / i6;
                    l4 = i2 / i6;
                    if (j4 < 7)
                        j4 = 7;
                    else if (j4 > 16256)
                        j4 = 16256;
                }
                j7 = j4 - i >> 3;
                l7 = l4 - j >> 3;
                j1 += j3;
                i += j1 & 0x600000;
                j8 = j1 >> 23;
            }
            for (k3 = i1 - l & 7; k3-- > 0; ) {
                ai[k++] = ai1[(j & 0x3f80) + (i >> 7)] >>> j8;
                i += j7;
                j += l7;
            }

            return;
        }
        while (k3-- > 0) {
            int i9;
            if ((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0)
                ai[k] = i9;
            k++;
            i += j7;
            j += l7;
            if ((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0)
                ai[k] = i9;
            k++;
            i += j7;
            j += l7;
            if ((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0)
                ai[k] = i9;
            k++;
            i += j7;
            j += l7;
            if ((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0)
                ai[k] = i9;
            k++;
            i += j7;
            j += l7;
            if ((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0)
                ai[k] = i9;
            k++;
            i += j7;
            j += l7;
            if ((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0)
                ai[k] = i9;
            k++;
            i += j7;
            j += l7;
            if ((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0)
                ai[k] = i9;
            k++;
            i += j7;
            j += l7;
            if ((i9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0)
                ai[k] = i9;
            k++;
            i = j4;
            j = l4;
            l1 += k2;
            i2 += l2;
            j2 += i3;
            int j6 = j2 >> 14;
            if (j6 != 0) {
                j4 = l1 / j6;
                l4 = i2 / j6;
                if (j4 < 7)
                    j4 = 7;
                else if (j4 > 16256)
                    j4 = 16256;
            }
            j7 = j4 - i >> 3;
            l7 = l4 - j >> 3;
            j1 += j3;
            i += j1 & 0x600000;
            j8 = j1 >> 23;
        }
        for (int l3 = i1 - l & 7; l3-- > 0; ) {
            int j9;
            if ((j9 = ai1[(j & 0x3f80) + (i >> 7)] >>> j8) != 0)
                ai[k] = j9;
            k++;
            i += j7;
            j += l7;
        }

    }
}
