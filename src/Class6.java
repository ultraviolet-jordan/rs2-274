// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class6 {

    public static int[] anIntArray186;
    public static int[] anIntArray187;
    public static int[] anIntArray188;
    public static final int[] anIntArray189 = new int[5];
    public static final int[] anIntArray190 = new int[5];
    public static final int[] anIntArray191 = new int[5];
    public static final int[] anIntArray192 = new int[5];
    public static final int[] anIntArray193 = new int[5];
    public final byte aByte167;
    public int anInt168;
    public Class1 aClass1_169;
    public Class1 aClass1_170;
    public Class1 aClass1_171;
    public Class1 aClass1_172;
    public Class1 aClass1_173;
    public Class1 aClass1_174;
    public Class1 aClass1_175;
    public Class1 aClass1_176;
    public final int[] anIntArray177;
    public final int[] anIntArray178;
    public final int[] anIntArray179;
    public int anInt180;
    public int anInt181;
    public Class2 aClass2_182;
    public Class1 aClass1_183;
    public int anInt184;
    public int anInt185;
    public Class6() {
        aByte167 = 6;
        anIntArray177 = new int[5];
        anIntArray178 = new int[5];
        anIntArray179 = new int[5];
        anInt181 = 100;
        anInt184 = 500;
    }

    public static void method187() {
        anIntArray187 = new int[32768];
        for (int i = 0; i < 32768; i++)
            if (Math.random() > 0.5D)
                anIntArray187[i] = 1;
            else
                anIntArray187[i] = -1;

        anIntArray188 = new int[32768];
        for (int j = 0; j < 32768; j++)
            anIntArray188[j] = (int) (Math.sin((double) j / 5215.1903000000002D) * 16384D);

        anIntArray186 = new int[0x35d54];
    }

    public int[] method188(int i, int j) {
        for (int k = 0; k < i; k++)
            anIntArray186[k] = 0;

        if (j < 10)
            return anIntArray186;
        double d = (double) i / ((double) j + 0.0D);
        aClass1_169.method150(0);
        aClass1_170.method150(0);
        int l = 0;
        int i1 = 0;
        int j1 = 0;
        if (aClass1_171 != null) {
            aClass1_171.method150(0);
            aClass1_172.method150(0);
            l = (int) (((double) (aClass1_171.anInt44 - aClass1_171.anInt43) * 32.768000000000001D) / d);
            i1 = (int) (((double) aClass1_171.anInt43 * 32.768000000000001D) / d);
        }
        int k1 = 0;
        int l1 = 0;
        int i2 = 0;
        if (aClass1_173 != null) {
            aClass1_173.method150(0);
            aClass1_174.method150(0);
            k1 = (int) (((double) (aClass1_173.anInt44 - aClass1_173.anInt43) * 32.768000000000001D) / d);
            l1 = (int) (((double) aClass1_173.anInt43 * 32.768000000000001D) / d);
        }
        for (int j2 = 0; j2 < 5; j2++)
            if (anIntArray177[j2] != 0) {
                anIntArray189[j2] = 0;
                anIntArray190[j2] = (int) ((double) anIntArray179[j2] * d);
                anIntArray191[j2] = (anIntArray177[j2] << 14) / 100;
                anIntArray192[j2] = (int) (((double) (aClass1_169.anInt44 - aClass1_169.anInt43) * 32.768000000000001D * Math.pow(1.0057929410678534D, anIntArray178[j2])) / d);
                anIntArray193[j2] = (int) (((double) aClass1_169.anInt43 * 32.768000000000001D) / d);
            }

        for (int k2 = 0; k2 < i; k2++) {
            int l2 = aClass1_169.method151((byte) -7, i);
            int j4 = aClass1_170.method151((byte) -7, i);
            if (aClass1_171 != null) {
                int j5 = aClass1_171.method151((byte) -7, i);
                int j6 = aClass1_172.method151((byte) -7, i);
                l2 += method189(-339, aClass1_171.anInt45, j1, j6) >> 1;
                j1 += (j5 * l >> 16) + i1;
            }
            if (aClass1_173 != null) {
                int k5 = aClass1_173.method151((byte) -7, i);
                int k6 = aClass1_174.method151((byte) -7, i);
                j4 = j4 * ((method189(-339, aClass1_173.anInt45, i2, k6) >> 1) + 32768) >> 15;
                i2 += (k5 * k1 >> 16) + l1;
            }
            for (int l5 = 0; l5 < 5; l5++)
                if (anIntArray177[l5] != 0) {
                    int l6 = k2 + anIntArray190[l5];
                    if (l6 < i) {
                        anIntArray186[l6] += method189(-339, aClass1_169.anInt45, anIntArray189[l5], j4 * anIntArray191[l5] >> 15);
                        anIntArray189[l5] += (l2 * anIntArray192[l5] >> 16) + anIntArray193[l5];
                    }
                }

        }

        if (aClass1_175 != null) {
            aClass1_175.method150(0);
            aClass1_176.method150(0);
            int i3 = 0;
            boolean flag = false;
            boolean flag1 = true;
            for (int i7 = 0; i7 < i; i7++) {
                int k7 = aClass1_175.method151((byte) -7, i);
                int i8 = aClass1_176.method151((byte) -7, i);
                int k4;
                if (flag1)
                    k4 = aClass1_175.anInt43 + ((aClass1_175.anInt44 - aClass1_175.anInt43) * k7 >> 8);
                else
                    k4 = aClass1_175.anInt43 + ((aClass1_175.anInt44 - aClass1_175.anInt43) * i8 >> 8);
                if ((i3 += 256) >= k4) {
                    i3 = 0;
                    flag1 = !flag1;
                }
                if (flag1)
                    anIntArray186[i7] = 0;
            }

        }
        if (anInt180 > 0 && anInt181 > 0) {
            int j3 = (int) ((double) anInt180 * d);
            for (int l4 = j3; l4 < i; l4++)
                anIntArray186[l4] += (anIntArray186[l4 - j3] * anInt181) / 100;

        }
        if (aClass2_182.anIntArray55[0] > 0 || aClass2_182.anIntArray55[1] > 0) {
            aClass1_183.method150(0);
            int k3 = aClass1_183.method151((byte) -7, i + 1);
            int i5 = aClass2_182.method155(0, (float) k3 / 65536F, (byte) 1);
            int i6 = aClass2_182.method155(1, (float) k3 / 65536F, (byte) 1);
            if (i >= i5 + i6) {
                int j7 = 0;
                int l7 = i6;
                if (l7 > i - i5)
                    l7 = i - i5;
                for (; j7 < l7; j7++) {
                    int j8 = (int) ((long) anIntArray186[j7 + i5] * (long) Class2.anInt62 >> 16);
                    for (int k8 = 0; k8 < i5; k8++)
                        j8 += (int) ((long) anIntArray186[(j7 + i5) - 1 - k8] * (long) Class2.anIntArrayArray60[0][k8] >> 16);

                    for (int j9 = 0; j9 < j7; j9++)
                        j8 -= (int) ((long) anIntArray186[j7 - 1 - j9] * (long) Class2.anIntArrayArray60[1][j9] >> 16);

                    anIntArray186[j7] = j8;
                    k3 = aClass1_183.method151((byte) -7, i + 1);
                }

                char c = '\200';
                l7 = c;
                do {
                    if (l7 > i - i5)
                        l7 = i - i5;
                    for (; j7 < l7; j7++) {
                        int l8 = (int) ((long) anIntArray186[j7 + i5] * (long) Class2.anInt62 >> 16);
                        for (int k9 = 0; k9 < i5; k9++)
                            l8 += (int) ((long) anIntArray186[(j7 + i5) - 1 - k9] * (long) Class2.anIntArrayArray60[0][k9] >> 16);

                        for (int i10 = 0; i10 < i6; i10++)
                            l8 -= (int) ((long) anIntArray186[j7 - 1 - i10] * (long) Class2.anIntArrayArray60[1][i10] >> 16);

                        anIntArray186[j7] = l8;
                        k3 = aClass1_183.method151((byte) -7, i + 1);
                    }

                    if (j7 >= i - i5)
                        break;
                    i5 = aClass2_182.method155(0, (float) k3 / 65536F, (byte) 1);
                    i6 = aClass2_182.method155(1, (float) k3 / 65536F, (byte) 1);
                    l7 += c;
                } while (true);
                for (; j7 < i; j7++) {
                    int i9 = 0;
                    for (int l9 = (j7 + i5) - i; l9 < i5; l9++)
                        i9 += (int) ((long) anIntArray186[(j7 + i5) - 1 - l9] * (long) Class2.anIntArrayArray60[0][l9] >> 16);

                    for (int j10 = 0; j10 < i6; j10++)
                        i9 -= (int) ((long) anIntArray186[j7 - 1 - j10] * (long) Class2.anIntArrayArray60[1][j10] >> 16);

                    anIntArray186[j7] = i9;
                    int l3 = aClass1_183.method151((byte) -7, i + 1);
                }

            }
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (anIntArray186[i4] < -32768)
                anIntArray186[i4] = -32768;
            if (anIntArray186[i4] > 32767)
                anIntArray186[i4] = 32767;
        }

        return anIntArray186;
    }

    public int method189(int i, int j, int k, int l) {
        while (i >= 0)
            anInt168 = 47;
        if (j == 1)
            if ((k & 0x7fff) < 16384)
                return l;
            else
                return -l;
        if (j == 2)
            return anIntArray188[k & 0x7fff] * l >> 14;
        if (j == 3)
            return ((k & 0x7fff) * l >> 14) - l;
        if (j == 4)
            return anIntArray187[k / 2607 & 0x7fff] * l;
        else
            return 0;
    }

    public void method190(byte byte0, Class44_Sub3_Sub2 class44_sub3_sub2) {
        aClass1_169 = new Class1();
        aClass1_169.method148((byte) 2, class44_sub3_sub2);
        aClass1_170 = new Class1();
        aClass1_170.method148((byte) 2, class44_sub3_sub2);
        int i = class44_sub3_sub2.get1();
        if (i != 0) {
            class44_sub3_sub2.anInt1374--;
            aClass1_171 = new Class1();
            aClass1_171.method148((byte) 2, class44_sub3_sub2);
            aClass1_172 = new Class1();
            aClass1_172.method148((byte) 2, class44_sub3_sub2);
        }
        i = class44_sub3_sub2.get1();
        if (i != 0) {
            class44_sub3_sub2.anInt1374--;
            aClass1_173 = new Class1();
            aClass1_173.method148((byte) 2, class44_sub3_sub2);
            aClass1_174 = new Class1();
            aClass1_174.method148((byte) 2, class44_sub3_sub2);
        }
        i = class44_sub3_sub2.get1();
        if (i != 0) {
            class44_sub3_sub2.anInt1374--;
            aClass1_175 = new Class1();
            aClass1_175.method148((byte) 2, class44_sub3_sub2);
            aClass1_176 = new Class1();
            aClass1_176.method148((byte) 2, class44_sub3_sub2);
        }
        for (int j = 0; j < 10; j++) {
            int k = class44_sub3_sub2.method493();
            if (k == 0)
                break;
            anIntArray177[j] = k;
            anIntArray178[j] = class44_sub3_sub2.method492();
            anIntArray179[j] = class44_sub3_sub2.method493();
        }

        anInt180 = class44_sub3_sub2.method493();
        anInt181 = class44_sub3_sub2.method493();
        anInt184 = class44_sub3_sub2.get2();
        anInt185 = class44_sub3_sub2.get2();
        aClass2_182 = new Class2();
        aClass1_183 = new Class1();
        if (byte0 != 2) {
            throw new NullPointerException();
        } else {
            aClass2_182.method156(class44_sub3_sub2, aByte167, aClass1_183);
        }
    }

}
