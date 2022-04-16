// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.util.Random;

public class Class44_Sub3_Sub1_Sub4 extends Class44_Sub3_Sub1 {

    public int anInt1453;
    public final int anInt1454;
    public int anInt1455;
    public boolean aBoolean1456;
    public int anInt1457;
    public final byte[][] aByteArrayArray1458;
    public final int[] anIntArray1459;
    public final int[] anIntArray1460;
    public final int[] anIntArray1461;
    public final int[] anIntArray1462;
    public final int[] anIntArray1463;
    public int anInt1464;
    public final Random aRandom1465;
    public boolean aBoolean1466;
    public Class44_Sub3_Sub1_Sub4(Class47 class47, boolean flag, String s, byte byte0) {
        anInt1454 = 436;
        anInt1455 = 436;
        aBoolean1456 = false;
        aByteArrayArray1458 = new byte[256][];
        anIntArray1459 = new int[256];
        anIntArray1460 = new int[256];
        anIntArray1461 = new int[256];
        anIntArray1462 = new int[256];
        anIntArray1463 = new int[256];
        aRandom1465 = new Random();
        aBoolean1466 = false;
        Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(class47.method546(s + ".dat", null), (byte) 1);
        Class44_Sub3_Sub2 class44_sub3_sub2_1 = new Class44_Sub3_Sub2(class47.method546("index.dat", null), (byte) 1);
        byte byte1 = -1;
        class44_sub3_sub2_1.anInt1374 = class44_sub3_sub2.get2() + 4;
        int j = class44_sub3_sub2_1.get1();
        if (j > 0)
            class44_sub3_sub2_1.anInt1374 += 3 * (j - 1);
        for (int k = 0; k < 256; k++) {
            int i = k;
            anIntArray1461[k] = class44_sub3_sub2_1.get1();
            anIntArray1462[k] = class44_sub3_sub2_1.get1();
            int l = anIntArray1459[k] = class44_sub3_sub2_1.get2();
            int i1 = anIntArray1460[k] = class44_sub3_sub2_1.get2();
            int j1 = class44_sub3_sub2_1.get1();
            int k1 = l * i1;
            aByteArrayArray1458[k] = new byte[k1];
            if (j1 == 0) {
                for (int l1 = 0; l1 < k1; l1++)
                    aByteArrayArray1458[k][l1] = class44_sub3_sub2.get1Signed();

            } else if (j1 == 1) {
                for (int i2 = 0; i2 < l; i2++) {
                    for (int k2 = 0; k2 < i1; k2++)
                        aByteArrayArray1458[k][i2 + k2 * l] = class44_sub3_sub2.get1Signed();

                }

            }
            if (i1 > anInt1464 && k < 128)
                anInt1464 = i1;
            anIntArray1461[k] = 1;
            anIntArray1463[k] = l + 2;
            int j2 = 0;
            for (int l2 = i1 / 7; l2 < i1; l2++)
                j2 += aByteArrayArray1458[k][l2 * l];

            if (j2 <= i1 / 7) {
                anIntArray1463[k]--;
                anIntArray1461[k] = 0;
            }
            j2 = 0;
            for (int i3 = i1 / 7; i3 < i1; i3++)
                j2 += aByteArrayArray1458[k][(l - 1) + i3 * l];

            if (j2 <= i1 / 7)
                anIntArray1463[k]--;
        }

        if (byte0 == 0)
            byte0 = 0;
        else
            aBoolean1456 = !aBoolean1456;
        if (flag) {
            anIntArray1463[32] = anIntArray1463[73];
        } else {
            anIntArray1463[32] = anIntArray1463[105];
        }
    }

    public void method455(int i, int j, int k, String s, boolean flag) {
        method458(i - method457(-43341, s) / 2, s, k, j, true);
        if (flag)
            aBoolean1456 = !aBoolean1456;
    }

    public void method456(int i, int j, int k, String s, int l, boolean flag) {
        if (i != 0)
            aBoolean1456 = !aBoolean1456;
        method460(s, anInt1454, flag, k, j - method457(-43341, s) / 2, l);
    }

    public int method457(int i, String s) {
        if (s == null)
            return 0;
        int j = 0;
        for (int k = 0; k < s.length(); k++)
            if (s.charAt(k) == '@' && k + 4 < s.length() && s.charAt(k + 4) == '@')
                k += 4;
            else
                j += anIntArray1463[s.charAt(k)];

        if (i != -43341)
            return anInt1454;
        else
            return j;
    }

    public void method458(int i, String s, int j, int k, boolean flag) {
        if (s == null)
            return;
        k -= anInt1464;
        for (int l = 0; l < s.length(); l++) {
            char c = s.charAt(l);
            if (c != ' ')
                method463(aByteArrayArray1458[c], i + anIntArray1461[c], k + anIntArray1462[c], anIntArray1459[c], anIntArray1460[c], j);
            i += anIntArray1463[c];
        }

        if (!flag)
            anInt1453 = -157;
    }

    public void method459(String s, int i, int j, int k, int l, int i1) {
        if (s == null)
            return;
        j -= method457(-43341, s) / 2;
        if (l != 6)
            anInt1457 = -147;
        i -= anInt1464;
        for (int j1 = 0; j1 < s.length(); j1++) {
            char c = s.charAt(j1);
            if (c != ' ')
                method463(aByteArrayArray1458[c], j + anIntArray1461[c], i + anIntArray1462[c] + (int) (Math.sin((double) j1 / 2D + (double) i1 / 5D) * 5D), anIntArray1459[c], anIntArray1460[c], k);
            j += anIntArray1463[c];
        }

    }

    public void method460(String s, int i, boolean flag, int j, int k, int l) {
        aBoolean1466 = false;
        int i1 = k;
        if (s == null)
            return;
        j -= anInt1464;
        for (int j1 = 0; j1 < s.length(); j1++)
            if (s.charAt(j1) == '@' && j1 + 4 < s.length() && s.charAt(j1 + 4) == '@') {
                int k1 = method462(s.substring(j1 + 1, j1 + 4), -13619);
                if (k1 != -1)
                    l = k1;
                j1 += 4;
            } else {
                char c = s.charAt(j1);
                if (c != ' ') {
                    if (flag)
                        method463(aByteArrayArray1458[c], k + anIntArray1461[c] + 1, j + anIntArray1462[c] + 1, anIntArray1459[c], anIntArray1460[c], 0);
                    method463(aByteArrayArray1458[c], k + anIntArray1461[c], j + anIntArray1462[c], anIntArray1459[c], anIntArray1460[c], l);
                }
                k += anIntArray1463[c];
            }

        if (i <= 0)
            return;
        if (aBoolean1466)
            Class44_Sub3_Sub1.method414(k - i1, 0x800000, i1, (byte) 125, j + (int) ((double) anInt1464 * 0.69999999999999996D));
    }

    public void method461(int i, int j, String s, int k, int l, int i1, boolean flag) {
        if (s == null)
            return;
        aRandom1465.setSeed(i1);
        int j1 = 192 + (aRandom1465.nextInt() & 0x1f);
        k -= anInt1464;
        for (int k1 = 0; k1 < s.length(); k1++)
            if (s.charAt(k1) == '@' && k1 + 4 < s.length() && s.charAt(k1 + 4) == '@') {
                int l1 = method462(s.substring(k1 + 1, k1 + 4), -13619);
                if (l1 != -1)
                    l = l1;
                k1 += 4;
            } else {
                char c = s.charAt(k1);
                if (c != ' ') {
                    if (flag)
                        method465(k + anIntArray1462[c] + 1, aByteArrayArray1458[c], j + anIntArray1461[c] + 1, 0, anIntArray1460[c], false, 192, anIntArray1459[c]);
                    method465(k + anIntArray1462[c], aByteArrayArray1458[c], j + anIntArray1461[c], l, anIntArray1460[c], false, j1, anIntArray1459[c]);
                }
                j += anIntArray1463[c];
                if ((aRandom1465.nextInt() & 3) == 0)
                    j++;
            }

        if (i == 12122) ;
    }

    public int method462(String s, int i) {
        if (i != -13619)
            return anInt1454;
        if (s.equals("red"))
            return 0xff0000;
        if (s.equals("gre"))
            return 65280;
        if (s.equals("blu"))
            return 255;
        if (s.equals("yel"))
            return 0xffff00;
        if (s.equals("cya"))
            return 65535;
        if (s.equals("mag"))
            return 0xff00ff;
        if (s.equals("whi"))
            return 0xffffff;
        if (s.equals("bla"))
            return 0;
        if (s.equals("lre"))
            return 0xff9040;
        if (s.equals("dre"))
            return 0x800000;
        if (s.equals("dbl"))
            return 128;
        if (s.equals("or1"))
            return 0xffb000;
        if (s.equals("or2"))
            return 0xff7000;
        if (s.equals("or3"))
            return 0xff3000;
        if (s.equals("gr1"))
            return 0xc0ff00;
        if (s.equals("gr2"))
            return 0x80ff00;
        if (s.equals("gr3"))
            return 0x40ff00;
        if (s.equals("str"))
            aBoolean1466 = true;
        return -1;
    }

    public void method463(byte[] abyte0, int i, int j, int k, int l, int i1) {
        int j1 = i + j * Class44_Sub3_Sub1.anInt1352;
        int k1 = Class44_Sub3_Sub1.anInt1352 - k;
        int l1 = 0;
        int i2 = 0;
        if (j < Class44_Sub3_Sub1.anInt1354) {
            int j2 = Class44_Sub3_Sub1.anInt1354 - j;
            l -= j2;
            j = Class44_Sub3_Sub1.anInt1354;
            i2 += j2 * k;
            j1 += j2 * Class44_Sub3_Sub1.anInt1352;
        }
        if (j + l >= Class44_Sub3_Sub1.anInt1355)
            l -= ((j + l) - Class44_Sub3_Sub1.anInt1355) + 1;
        if (i < Class44_Sub3_Sub1.anInt1356) {
            int k2 = Class44_Sub3_Sub1.anInt1356 - i;
            k -= k2;
            i = Class44_Sub3_Sub1.anInt1356;
            i2 += k2;
            j1 += k2;
            l1 += k2;
            k1 += k2;
        }
        if (i + k >= Class44_Sub3_Sub1.anInt1357) {
            int l2 = ((i + k) - Class44_Sub3_Sub1.anInt1357) + 1;
            k -= l2;
            l1 += l2;
            k1 += l2;
        }
        if (k <= 0 || l <= 0) {
        } else {
            method464(Class44_Sub3_Sub1.anIntArray1351, abyte0, i1, i2, j1, k, l, k1, l1);
        }
    }

    public void method464(int[] ai, byte[] abyte0, int i, int j, int k, int l, int i1,
                          int j1, int k1) {
        int l1 = -(l >> 2);
        l = -(l & 3);
        for (int i2 = -i1; i2 < 0; i2++) {
            for (int j2 = l1; j2 < 0; j2++) {
                if (abyte0[j++] != 0)
                    ai[k++] = i;
                else
                    k++;
                if (abyte0[j++] != 0)
                    ai[k++] = i;
                else
                    k++;
                if (abyte0[j++] != 0)
                    ai[k++] = i;
                else
                    k++;
                if (abyte0[j++] != 0)
                    ai[k++] = i;
                else
                    k++;
            }

            for (int k2 = l; k2 < 0; k2++)
                if (abyte0[j++] != 0)
                    ai[k++] = i;
                else
                    k++;

            k += j1;
            j += k1;
        }

    }

    public void method465(int i, byte[] abyte0, int j, int k, int l, boolean flag, int i1,
                          int j1) {
        int k1 = j + i * Class44_Sub3_Sub1.anInt1352;
        int l1 = Class44_Sub3_Sub1.anInt1352 - j1;
        int i2 = 0;
        int j2 = 0;
        if (i < Class44_Sub3_Sub1.anInt1354) {
            int k2 = Class44_Sub3_Sub1.anInt1354 - i;
            l -= k2;
            i = Class44_Sub3_Sub1.anInt1354;
            j2 += k2 * j1;
            k1 += k2 * Class44_Sub3_Sub1.anInt1352;
        }
        if (i + l >= Class44_Sub3_Sub1.anInt1355)
            l -= ((i + l) - Class44_Sub3_Sub1.anInt1355) + 1;
        if (j < Class44_Sub3_Sub1.anInt1356) {
            int l2 = Class44_Sub3_Sub1.anInt1356 - j;
            j1 -= l2;
            j = Class44_Sub3_Sub1.anInt1356;
            j2 += l2;
            k1 += l2;
            i2 += l2;
            l1 += l2;
        }
        if (j + j1 >= Class44_Sub3_Sub1.anInt1357) {
            int i3 = ((j + j1) - Class44_Sub3_Sub1.anInt1357) + 1;
            j1 -= i3;
            i2 += i3;
            l1 += i3;
        }
        if (j1 <= 0 || l <= 0) {
        } else {
            method466(l, abyte0, k, j1, i2, i1, k1, Class44_Sub3_Sub1.anIntArray1351, -701, j2, l1);
            if (!flag) ;
        }
    }

    public void method466(int i, byte[] abyte0, int j, int k, int l, int i1, int j1,
                          int[] ai, int k1, int l1, int i2) {
        while (k1 >= 0)
            anInt1455 = -187;
        j = ((j & 0xff00ff) * i1 & 0xff00ff00) + ((j & 0xff00) * i1 & 0xff0000) >> 8;
        i1 = 256 - i1;
        for (int j2 = -i; j2 < 0; j2++) {
            for (int k2 = -k; k2 < 0; k2++)
                if (abyte0[l1++] != 0) {
                    int l2 = ai[j1];
                    ai[j1++] = (((l2 & 0xff00ff) * i1 & 0xff00ff00) + ((l2 & 0xff00) * i1 & 0xff0000) >> 8) + j;
                } else {
                    j1++;
                }

            j1 += i2;
            l1 += l;
        }

    }
}
