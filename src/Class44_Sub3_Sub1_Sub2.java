// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.awt.*;
import java.awt.image.PixelGrabber;

public class Class44_Sub3_Sub1_Sub2 extends Class44_Sub3_Sub1 {

    public int anInt1421;
    public boolean aBoolean1422;
    public final byte aByte1423;
    public final int anInt1424;
    public final int anInt1425;
    public int anInt1426;
    public final byte aByte1427;
    public final int anInt1428;
    public boolean aBoolean1429;
    public boolean aBoolean1430;
    public int[] anIntArray1431;
    public int anInt1432;
    public int anInt1433;
    public int anInt1434;
    public int anInt1435;
    public int anInt1436;
    public int anInt1437;
    public Class44_Sub3_Sub1_Sub2(int i, int j) {
        anInt1421 = -407;
        aBoolean1422 = true;
        aByte1423 = -65;
        anInt1424 = 35961;
        anInt1425 = -676;
        aByte1427 = 3;
        anInt1428 = -582;
        aBoolean1429 = false;
        aBoolean1430 = false;
        anIntArray1431 = new int[i * j];
        anInt1432 = anInt1436 = i;
        anInt1433 = anInt1437 = j;
        anInt1434 = anInt1435 = 0;
    }
    public Class44_Sub3_Sub1_Sub2(byte[] abyte0, Component component) {
        anInt1421 = -407;
        aBoolean1422 = true;
        aByte1423 = -65;
        anInt1424 = 35961;
        anInt1425 = -676;
        aByte1427 = 3;
        anInt1428 = -582;
        aBoolean1429 = false;
        aBoolean1430 = false;
        try {
            Image image = Toolkit.getDefaultToolkit().createImage(abyte0);
            MediaTracker mediatracker = new MediaTracker(component);
            mediatracker.addImage(image, 0);
            mediatracker.waitForAll();
            anInt1432 = image.getWidth(component);
            anInt1433 = image.getHeight(component);
            anInt1436 = anInt1432;
            anInt1437 = anInt1433;
            anInt1434 = 0;
            anInt1435 = 0;
            anIntArray1431 = new int[anInt1432 * anInt1433];
            PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1432, anInt1433, anIntArray1431, 0, anInt1432);
            pixelgrabber.grabPixels();
        } catch (Exception _ex) {
            System.out.println("Error converting jpg");
        }
    }
    public Class44_Sub3_Sub1_Sub2(Class47 class47, String s, int i) {
        anInt1421 = -407;
        aBoolean1422 = true;
        aByte1423 = -65;
        anInt1424 = 35961;
        anInt1425 = -676;
        aByte1427 = 3;
        anInt1428 = -582;
        aBoolean1429 = false;
        aBoolean1430 = false;
        Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(class47.method546(s + ".dat", null), (byte) 1);
        Class44_Sub3_Sub2 class44_sub3_sub2_1 = new Class44_Sub3_Sub2(class47.method546("index.dat", null), (byte) 1);
        class44_sub3_sub2_1.anInt1374 = class44_sub3_sub2.get2();
        anInt1436 = class44_sub3_sub2_1.get2();
        anInt1437 = class44_sub3_sub2_1.get2();
        int j = class44_sub3_sub2_1.get1();
        int[] ai = new int[j];
        for (int k = 0; k < j - 1; k++) {
            ai[k + 1] = class44_sub3_sub2_1.get3();
            if (ai[k + 1] == 0)
                ai[k + 1] = 1;
        }

        for (int l = 0; l < i; l++) {
            class44_sub3_sub2_1.anInt1374 += 2;
            class44_sub3_sub2.anInt1374 += class44_sub3_sub2_1.get2() * class44_sub3_sub2_1.get2();
            class44_sub3_sub2_1.anInt1374++;
        }

        anInt1434 = class44_sub3_sub2_1.get1();
        anInt1435 = class44_sub3_sub2_1.get1();
        anInt1432 = class44_sub3_sub2_1.get2();
        anInt1433 = class44_sub3_sub2_1.get2();
        int i1 = class44_sub3_sub2_1.get1();
        int j1 = anInt1432 * anInt1433;
        anIntArray1431 = new int[j1];
        if (i1 == 0) {
            for (int k1 = 0; k1 < j1; k1++)
                anIntArray1431[k1] = ai[class44_sub3_sub2.get1()];

            return;
        }
        if (i1 == 1) {
            for (int l1 = 0; l1 < anInt1432; l1++) {
                for (int i2 = 0; i2 < anInt1433; i2++)
                    anIntArray1431[l1 + i2 * anInt1432] = ai[class44_sub3_sub2.get1()];

            }

        }
    }

    public void method435(boolean flag) {
        if (!flag)
            anInt1421 = 192;
        Class44_Sub3_Sub1.method406(anInt1432, anInt1433, anIntArray1431, 9);
    }

    public void method436(int i, int j, int k, int l) {
        if (j != 6) {
            for (int i1 = 1; i1 > 0; i1++) ;
        }
        for (int j1 = 0; j1 < anIntArray1431.length; j1++) {
            int k1 = anIntArray1431[j1];
            if (k1 != 0) {
                int l1 = k1 >> 16 & 0xff;
                l1 += k;
                if (l1 < 1)
                    l1 = 1;
                else if (l1 > 255)
                    l1 = 255;
                int i2 = k1 >> 8 & 0xff;
                i2 += l;
                if (i2 < 1)
                    i2 = 1;
                else if (i2 > 255)
                    i2 = 255;
                int j2 = k1 & 0xff;
                j2 += i;
                if (j2 < 1)
                    j2 = 1;
                else if (j2 > 255)
                    j2 = 255;
                anIntArray1431[j1] = (l1 << 16) + (i2 << 8) + j2;
            }
        }

    }

    public void method437(byte byte0) {
        int[] ai = new int[anInt1436 * anInt1437];
        for (int i = 0; i < anInt1433; i++) {
            if (anInt1432 >= 0)
                System.arraycopy(anIntArray1431, i * anInt1432, ai, (i + anInt1435) * anInt1436 + (anInt1434), anInt1432);

        }

        if (byte0 == 3)
            byte0 = 0;
        else
            aBoolean1429 = !aBoolean1429;
        anIntArray1431 = ai;
        anInt1432 = anInt1436;
        anInt1433 = anInt1437;
        anInt1434 = 0;
        anInt1435 = 0;
    }

    public void method438(int i, boolean flag, int j) {
        j += anInt1434;
        i += anInt1435;
        int k = j + i * Class44_Sub3_Sub1.anInt1352;
        int l = 0;
        if (flag)
            return;
        int i1 = anInt1433;
        int j1 = anInt1432;
        int k1 = Class44_Sub3_Sub1.anInt1352 - j1;
        int l1 = 0;
        if (i < Class44_Sub3_Sub1.anInt1354) {
            int i2 = Class44_Sub3_Sub1.anInt1354 - i;
            i1 -= i2;
            i = Class44_Sub3_Sub1.anInt1354;
            l += i2 * j1;
            k += i2 * Class44_Sub3_Sub1.anInt1352;
        }
        if (i + i1 > Class44_Sub3_Sub1.anInt1355)
            i1 -= (i + i1) - Class44_Sub3_Sub1.anInt1355;
        if (j < Class44_Sub3_Sub1.anInt1356) {
            int j2 = Class44_Sub3_Sub1.anInt1356 - j;
            j1 -= j2;
            j = Class44_Sub3_Sub1.anInt1356;
            l += j2;
            k += j2;
            l1 += j2;
            k1 += j2;
        }
        if (j + j1 > Class44_Sub3_Sub1.anInt1357) {
            int k2 = (j + j1) - Class44_Sub3_Sub1.anInt1357;
            j1 -= k2;
            l1 += k2;
            k1 += k2;
        }
        if (j1 <= 0 || i1 <= 0) {
        } else {
            method439(l1, l, anIntArray1431, aBoolean1422, i1, j1, k1, k, Class44_Sub3_Sub1.anIntArray1351);
        }
    }

    public void method439(int i, int j, int[] ai, boolean flag, int k, int l, int i1,
                          int j1, int[] ai1) {
        int k1 = -(l >> 2);
        if (!flag)
            anInt1421 = 362;
        l = -(l & 3);
        for (int l1 = -k; l1 < 0; l1++) {
            for (int i2 = k1; i2 < 0; i2++) {
                ai1[j1++] = ai[j++];
                ai1[j1++] = ai[j++];
                ai1[j1++] = ai[j++];
                ai1[j1++] = ai[j++];
            }

            for (int j2 = l; j2 < 0; j2++)
                ai1[j1++] = ai[j++];

            j1 += i1;
            j += i;
        }

    }

    public void method440(byte byte0, int i, int j) {
        i += anInt1434;
        j += anInt1435;
        int k = i + j * Class44_Sub3_Sub1.anInt1352;
        int l = 0;
        if (byte0 != 7) {
            for (int i1 = 1; i1 > 0; i1++) ;
        }
        int j1 = anInt1433;
        int k1 = anInt1432;
        int l1 = Class44_Sub3_Sub1.anInt1352 - k1;
        int i2 = 0;
        if (j < Class44_Sub3_Sub1.anInt1354) {
            int j2 = Class44_Sub3_Sub1.anInt1354 - j;
            j1 -= j2;
            j = Class44_Sub3_Sub1.anInt1354;
            l += j2 * k1;
            k += j2 * Class44_Sub3_Sub1.anInt1352;
        }
        if (j + j1 > Class44_Sub3_Sub1.anInt1355)
            j1 -= (j + j1) - Class44_Sub3_Sub1.anInt1355;
        if (i < Class44_Sub3_Sub1.anInt1356) {
            int k2 = Class44_Sub3_Sub1.anInt1356 - i;
            k1 -= k2;
            i = Class44_Sub3_Sub1.anInt1356;
            l += k2;
            k += k2;
            i2 += k2;
            l1 += k2;
        }
        if (i + k1 > Class44_Sub3_Sub1.anInt1357) {
            int l2 = (i + k1) - Class44_Sub3_Sub1.anInt1357;
            k1 -= l2;
            i2 += l2;
            l1 += l2;
        }
        if (k1 <= 0 || j1 <= 0) {
        } else {
            method441(Class44_Sub3_Sub1.anIntArray1351, anIntArray1431, 0, l, k, k1, j1, l1, i2);
        }
    }

    public void method441(int[] ai, int[] ai1, int i, int j, int k, int l, int i1,
                          int j1, int k1) {
        int l1 = -(l >> 2);
        l = -(l & 3);
        for (int i2 = -i1; i2 < 0; i2++) {
            for (int j2 = l1; j2 < 0; j2++) {
                i = ai1[j++];
                if (i != 0)
                    ai[k++] = i;
                else
                    k++;
                i = ai1[j++];
                if (i != 0)
                    ai[k++] = i;
                else
                    k++;
                i = ai1[j++];
                if (i != 0)
                    ai[k++] = i;
                else
                    k++;
                i = ai1[j++];
                if (i != 0)
                    ai[k++] = i;
                else
                    k++;
            }

            for (int k2 = l; k2 < 0; k2++) {
                i = ai1[j++];
                if (i != 0)
                    ai[k++] = i;
                else
                    k++;
            }

            k += j1;
            j += k1;
        }

    }

    public void method442(int i, int j, int k, int l) {
        while (k >= 0)
            aBoolean1422 = !aBoolean1422;
        j += anInt1434;
        i += anInt1435;
        int i1 = j + i * Class44_Sub3_Sub1.anInt1352;
        int j1 = 0;
        int k1 = anInt1433;
        int l1 = anInt1432;
        int i2 = Class44_Sub3_Sub1.anInt1352 - l1;
        int j2 = 0;
        if (i < Class44_Sub3_Sub1.anInt1354) {
            int k2 = Class44_Sub3_Sub1.anInt1354 - i;
            k1 -= k2;
            i = Class44_Sub3_Sub1.anInt1354;
            j1 += k2 * l1;
            i1 += k2 * Class44_Sub3_Sub1.anInt1352;
        }
        if (i + k1 > Class44_Sub3_Sub1.anInt1355)
            k1 -= (i + k1) - Class44_Sub3_Sub1.anInt1355;
        if (j < Class44_Sub3_Sub1.anInt1356) {
            int l2 = Class44_Sub3_Sub1.anInt1356 - j;
            l1 -= l2;
            j = Class44_Sub3_Sub1.anInt1356;
            j1 += l2;
            i1 += l2;
            j2 += l2;
            i2 += l2;
        }
        if (j + l1 > Class44_Sub3_Sub1.anInt1357) {
            int i3 = (j + l1) - Class44_Sub3_Sub1.anInt1357;
            l1 -= i3;
            j2 += i3;
            i2 += i3;
        }
        if (l1 <= 0 || k1 <= 0) {
        } else {
            method443(i2, j2, l, l1, Class44_Sub3_Sub1.anIntArray1351, 0, i1, anInt1426, j1, k1, anIntArray1431);
        }
    }

    public void method443(int i, int j, int k, int l, int[] ai, int i1, int j1,
                          int k1, int l1, int i2, int[] ai1) {
        int j2 = 256 - k;
        if (k1 != 0)
            aBoolean1430 = !aBoolean1430;
        for (int k2 = -i2; k2 < 0; k2++) {
            for (int l2 = -l; l2 < 0; l2++) {
                i1 = ai1[l1++];
                if (i1 != 0) {
                    int i3 = ai[j1];
                    ai[j1++] = ((i1 & 0xff00ff) * k + (i3 & 0xff00ff) * j2 & 0xff00ff00) + ((i1 & 0xff00) * k + (i3 & 0xff00) * j2 & 0xff0000) >> 8;
                } else {
                    j1++;
                }
            }

            j1 += i;
            l1 += j;
        }

    }

    public void method444(int i, int j, int k, int l, int i1, int[] ai, int j1,
                          int[] ai1, int k1, int l1, int i2) {
        if (k1 >= 0)
            return;
        try {
            int j2 = -k / 2;
            int k2 = -l / 2;
            int l2 = (int) (Math.sin((double) l1 / 326.11000000000001D) * 65536D);
            int i3 = (int) (Math.cos((double) l1 / 326.11000000000001D) * 65536D);
            l2 = l2 * i >> 8;
            i3 = i3 * i >> 8;
            int j3 = (j << 16) + (k2 * l2 + j2 * i3);
            int k3 = (j1 << 16) + (k2 * i3 - j2 * l2);
            int l3 = i1 + i2 * Class44_Sub3_Sub1.anInt1352;
            for (i2 = 0; i2 < l; i2++) {
                int i4 = ai1[i2];
                int j4 = l3 + i4;
                int k4 = j3 + i3 * i4;
                int l4 = k3 - l2 * i4;
                for (i1 = -ai[i2]; i1 < 0; i1++) {
                    Class44_Sub3_Sub1.anIntArray1351[j4++] = anIntArray1431[(k4 >> 16) + (l4 >> 16) * anInt1432];
                    k4 += i3;
                    l4 -= l2;
                }

                j3 += l2;
                k3 += i3;
                l3 += Class44_Sub3_Sub1.anInt1352;
            }

        } catch (Exception _ex) {
        }
    }

    public void method445(int i, int j, int k, int l, double d, int i1,
                          byte byte0, int j1, int k1) {
        if (byte0 != -32)
            aBoolean1430 = !aBoolean1430;
        try {
            int l1 = -k1 / 2;
            int i2 = -j / 2;
            int j2 = (int) (Math.sin(d) * 65536D);
            int k2 = (int) (Math.cos(d) * 65536D);
            j2 = j2 * i1 >> 8;
            k2 = k2 * i1 >> 8;
            int l2 = (i << 16) + (i2 * j2 + l1 * k2);
            int i3 = (j1 << 16) + (i2 * k2 - l1 * j2);
            int j3 = k + l * Class44_Sub3_Sub1.anInt1352;
            for (l = 0; l < j; l++) {
                int k3 = j3;
                int l3 = l2;
                int i4 = i3;
                for (k = -k1; k < 0; k++) {
                    int j4 = anIntArray1431[(l3 >> 16) + (i4 >> 16) * anInt1432];
                    if (j4 != 0)
                        Class44_Sub3_Sub1.anIntArray1351[k3++] = j4;
                    else
                        k3++;
                    l3 += k2;
                    i4 -= j2;
                }

                l2 += j2;
                i3 += k2;
                j3 += Class44_Sub3_Sub1.anInt1352;
            }

        } catch (Exception _ex) {
        }
    }

    public void method446(int i, int j, Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3, int k) {
        if (i <= 0) {
            for (int l = 1; l > 0; l++) ;
        }
        j += anInt1434;
        k += anInt1435;
        int i1 = j + k * Class44_Sub3_Sub1.anInt1352;
        int j1 = 0;
        int k1 = anInt1433;
        int l1 = anInt1432;
        int i2 = Class44_Sub3_Sub1.anInt1352 - l1;
        int j2 = 0;
        if (k < Class44_Sub3_Sub1.anInt1354) {
            int k2 = Class44_Sub3_Sub1.anInt1354 - k;
            k1 -= k2;
            k = Class44_Sub3_Sub1.anInt1354;
            j1 += k2 * l1;
            i1 += k2 * Class44_Sub3_Sub1.anInt1352;
        }
        if (k + k1 > Class44_Sub3_Sub1.anInt1355)
            k1 -= (k + k1) - Class44_Sub3_Sub1.anInt1355;
        if (j < Class44_Sub3_Sub1.anInt1356) {
            int l2 = Class44_Sub3_Sub1.anInt1356 - j;
            l1 -= l2;
            j = Class44_Sub3_Sub1.anInt1356;
            j1 += l2;
            i1 += l2;
            j2 += l2;
            i2 += l2;
        }
        if (j + l1 > Class44_Sub3_Sub1.anInt1357) {
            int i3 = (j + l1) - Class44_Sub3_Sub1.anInt1357;
            l1 -= i3;
            j2 += i3;
            i2 += i3;
        }
        if (l1 <= 0 || k1 <= 0) {
        } else {
            method447(Class44_Sub3_Sub1.anIntArray1351, i1, j1, k1, 5, j2, l1, 0, class44_sub3_sub1_sub3.aByteArray1445, i2, anIntArray1431);
        }
    }

    public void method447(int[] ai, int i, int j, int k, int l, int i1, int j1,
                          int k1, byte[] abyte0, int l1, int[] ai1) {
        int i2 = -(j1 >> 2);
        j1 = -(j1 & 3);
        if (l != 5)
            aBoolean1429 = !aBoolean1429;
        for (int j2 = -k; j2 < 0; j2++) {
            for (int k2 = i2; k2 < 0; k2++) {
                k1 = ai1[j++];
                if (k1 != 0 && abyte0[i] == 0)
                    ai[i++] = k1;
                else
                    i++;
                k1 = ai1[j++];
                if (k1 != 0 && abyte0[i] == 0)
                    ai[i++] = k1;
                else
                    i++;
                k1 = ai1[j++];
                if (k1 != 0 && abyte0[i] == 0)
                    ai[i++] = k1;
                else
                    i++;
                k1 = ai1[j++];
                if (k1 != 0 && abyte0[i] == 0)
                    ai[i++] = k1;
                else
                    i++;
            }

            for (int l2 = j1; l2 < 0; l2++) {
                k1 = ai1[j++];
                if (k1 != 0 && abyte0[i] == 0)
                    ai[i++] = k1;
                else
                    i++;
            }

            i += l1;
            j += i1;
        }

    }
}
