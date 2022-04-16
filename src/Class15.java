// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class15 {

    public static final int[][] anIntArrayArray390 = {
            {
                    1, 3, 5, 7
            }, {
            1, 3, 5, 7
    }, {
            1, 3, 5, 7
    }, {
            1, 3, 5, 7, 6
    }, {
            1, 3, 5, 7, 6
    }, {
            1, 3, 5, 7, 6
    }, {
            1, 3, 5, 7, 6
    }, {
            1, 3, 5, 7, 2, 6
    }, {
            1, 3, 5, 7, 2, 8
    }, {
            1, 3, 5, 7, 2, 8
    }, {
            1, 3, 5, 7, 11, 12
    }, {
            1, 3, 5, 7, 11, 12
    }, {
            1, 3, 5, 7, 13, 14
    }
    };
    public static final int[][] anIntArrayArray391 = {
            {
                    0, 1, 2, 3, 0, 0, 1, 3
            }, {
            1, 1, 2, 3, 1, 0, 1, 3
    }, {
            0, 1, 2, 3, 1, 0, 1, 3
    }, {
            0, 0, 1, 2, 0, 0, 2, 4, 1, 0,
            4, 3
    }, {
            0, 0, 1, 4, 0, 0, 4, 3, 1, 1,
            2, 4
    }, {
            0, 0, 4, 3, 1, 0, 1, 2, 1, 0,
            2, 4
    }, {
            0, 1, 2, 4, 1, 0, 1, 4, 1, 0,
            4, 3
    }, {
            0, 4, 1, 2, 0, 4, 2, 5, 1, 0,
            4, 5, 1, 0, 5, 3
    }, {
            0, 4, 1, 2, 0, 4, 2, 3, 0, 4,
            3, 5, 1, 0, 4, 5
    }, {
            0, 0, 4, 5, 1, 4, 1, 2, 1, 4,
            2, 3, 1, 4, 3, 5
    }, {
            0, 0, 1, 5, 0, 1, 4, 5, 0, 1,
            2, 4, 1, 0, 5, 3, 1, 5, 4, 3,
            1, 4, 2, 3
    }, {
            1, 0, 1, 5, 1, 1, 4, 5, 1, 1,
            2, 4, 0, 0, 5, 3, 0, 5, 4, 3,
            0, 4, 2, 3
    }, {
            1, 0, 5, 4, 1, 0, 1, 5, 0, 0,
            4, 3, 0, 4, 5, 3, 0, 5, 2, 3,
            0, 1, 2, 5
    }
    };
    public static final int[] anIntArray382 = new int[6];
    public static final int[] anIntArray383 = new int[6];
    public static final int[] anIntArray384 = new int[6];
    public static final int[] anIntArray385 = new int[6];
    public static final int[] anIntArray386 = new int[6];
    public static int[] anIntArray387 = {
            1, 0
    };
    public static int[] anIntArray388 = {
            2, 1
    };
    public static int[] anIntArray389 = {
            3, 3
    };
    public boolean aBoolean366;
    public final int[] anIntArray367;
    public final int[] anIntArray368;
    public final int[] anIntArray369;
    public final int[] anIntArray370;
    public final int[] anIntArray371;
    public final int[] anIntArray372;
    public final int[] anIntArray373;
    public final int[] anIntArray374;
    public final int[] anIntArray375;
    public int[] anIntArray376;
    public final boolean aBoolean377;
    public final int anInt378;
    public final int anInt379;
    public final int anInt380;
    public final int anInt381;
    public Class15(int i, int j, int k, int l, int i1, int j1, int k1,
                   int l1, int i2, int j2, int k2, int l2, int i3, int j3,
                   int k3, int l3, int i4, int j4, int k4, int l4) {
        aBoolean366 = true;
        aBoolean377 = j == k3 && j == k && j == j3;
        anInt378 = k1;
        if (j4 >= 0)
            aBoolean366 = !aBoolean366;
        anInt379 = i4;
        anInt380 = i1;
        anInt381 = l1;
        char c = '\200';
        int i5 = c / 2;
        int j5 = c / 4;
        int k5 = (c * 3) / 4;
        int[] ai = anIntArrayArray390[k1];
        int l5 = ai.length;
        anIntArray367 = new int[l5];
        anIntArray368 = new int[l5];
        anIntArray369 = new int[l5];
        int[] ai1 = new int[l5];
        int[] ai2 = new int[l5];
        int i6 = l3 * c;
        int j6 = l2 * c;
        for (int k6 = 0; k6 < l5; k6++) {
            int l6 = ai[k6];
            if ((l6 & 1) == 0 && l6 <= 8)
                l6 = (l6 - i4 - i4 - 1 & 7) + 1;
            if (l6 > 8 && l6 <= 12)
                l6 = (l6 - 9 - i4 & 3) + 9;
            if (l6 > 12 && l6 <= 16)
                l6 = (l6 - 13 - i4 & 3) + 13;
            int i7;
            int k7;
            int i8;
            int k8;
            int j9;
            if (l6 == 1) {
                i7 = i6;
                k7 = j6;
                i8 = j;
                k8 = i2;
                j9 = i;
            } else if (l6 == 2) {
                i7 = i6 + i5;
                k7 = j6;
                i8 = j + k3 >> 1;
                k8 = i2 + j2 >> 1;
                j9 = i + k4 >> 1;
            } else if (l6 == 3) {
                i7 = i6 + c;
                k7 = j6;
                i8 = k3;
                k8 = j2;
                j9 = k4;
            } else if (l6 == 4) {
                i7 = i6 + c;
                k7 = j6 + i5;
                i8 = k3 + k >> 1;
                k8 = j2 + k2 >> 1;
                j9 = k4 + l4 >> 1;
            } else if (l6 == 5) {
                i7 = i6 + c;
                k7 = j6 + c;
                i8 = k;
                k8 = k2;
                j9 = l4;
            } else if (l6 == 6) {
                i7 = i6 + i5;
                k7 = j6 + c;
                i8 = k + j3 >> 1;
                k8 = k2 + i3 >> 1;
                j9 = l4 + l >> 1;
            } else if (l6 == 7) {
                i7 = i6;
                k7 = j6 + c;
                i8 = j3;
                k8 = i3;
                j9 = l;
            } else if (l6 == 8) {
                i7 = i6;
                k7 = j6 + i5;
                i8 = j3 + j >> 1;
                k8 = i3 + i2 >> 1;
                j9 = l + i >> 1;
            } else if (l6 == 9) {
                i7 = i6 + i5;
                k7 = j6 + j5;
                i8 = j + k3 >> 1;
                k8 = i2 + j2 >> 1;
                j9 = i + k4 >> 1;
            } else if (l6 == 10) {
                i7 = i6 + k5;
                k7 = j6 + i5;
                i8 = k3 + k >> 1;
                k8 = j2 + k2 >> 1;
                j9 = k4 + l4 >> 1;
            } else if (l6 == 11) {
                i7 = i6 + i5;
                k7 = j6 + k5;
                i8 = k + j3 >> 1;
                k8 = k2 + i3 >> 1;
                j9 = l4 + l >> 1;
            } else if (l6 == 12) {
                i7 = i6 + j5;
                k7 = j6 + i5;
                i8 = j3 + j >> 1;
                k8 = i3 + i2 >> 1;
                j9 = l + i >> 1;
            } else if (l6 == 13) {
                i7 = i6 + j5;
                k7 = j6 + j5;
                i8 = j;
                k8 = i2;
                j9 = i;
            } else if (l6 == 14) {
                i7 = i6 + k5;
                k7 = j6 + j5;
                i8 = k3;
                k8 = j2;
                j9 = k4;
            } else if (l6 == 15) {
                i7 = i6 + k5;
                k7 = j6 + k5;
                i8 = k;
                k8 = k2;
                j9 = l4;
            } else {
                i7 = i6 + j5;
                k7 = j6 + k5;
                i8 = j3;
                k8 = i3;
                j9 = l;
            }
            anIntArray367[k6] = i7;
            anIntArray368[k6] = i8;
            anIntArray369[k6] = k7;
            ai1[k6] = k8;
            ai2[k6] = j9;
        }

        int[] ai3 = anIntArrayArray391[k1];
        int j7 = ai3.length / 4;
        anIntArray373 = new int[j7];
        anIntArray374 = new int[j7];
        anIntArray375 = new int[j7];
        anIntArray370 = new int[j7];
        anIntArray371 = new int[j7];
        anIntArray372 = new int[j7];
        if (j1 != -1)
            anIntArray376 = new int[j7];
        int l7 = 0;
        for (int j8 = 0; j8 < j7; j8++) {
            int l8 = ai3[l7];
            int k9 = ai3[l7 + 1];
            int i10 = ai3[l7 + 2];
            int j10 = ai3[l7 + 3];
            l7 += 4;
            if (k9 < 4)
                k9 = k9 - i4 & 3;
            if (i10 < 4)
                i10 = i10 - i4 & 3;
            if (j10 < 4)
                j10 = j10 - i4 & 3;
            anIntArray373[j8] = k9;
            anIntArray374[j8] = i10;
            anIntArray375[j8] = j10;
            if (l8 == 0) {
                anIntArray370[j8] = ai1[k9];
                anIntArray371[j8] = ai1[i10];
                anIntArray372[j8] = ai1[j10];
                if (anIntArray376 != null)
                    anIntArray376[j8] = -1;
            } else {
                anIntArray370[j8] = ai2[k9];
                anIntArray371[j8] = ai2[i10];
                anIntArray372[j8] = ai2[j10];
                if (anIntArray376 != null)
                    anIntArray376[j8] = j1;
            }
        }

        int i9 = j;
        int l9 = k3;
        if (k3 < i9)
            i9 = k3;
        if (k3 > l9)
            l9 = k3;
        if (k < i9)
            i9 = k;
        if (k > l9)
            l9 = k;
        if (j3 < i9)
            i9 = j3;
        if (j3 > l9)
            l9 = j3;
        i9 /= 14;
        l9 /= 14;
    }

}
