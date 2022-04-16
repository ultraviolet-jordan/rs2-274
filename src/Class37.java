// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class37 {

    public static final Class40 aClass40_656 = new Class40();

    public static void method329(byte[] abyte0, int i, byte[] abyte1, int j, int k) {
        synchronized (aClass40_656) {
            aClass40_656.aByteArray693 = abyte1;
            aClass40_656.anInt694 = k;
            aClass40_656.aByteArray698 = abyte0;
            aClass40_656.anInt699 = 0;
            aClass40_656.anInt695 = j;
            aClass40_656.anInt700 = i;
            aClass40_656.anInt707 = 0;
            aClass40_656.anInt706 = 0;
            aClass40_656.anInt696 = 0;
            aClass40_656.anInt697 = 0;
            aClass40_656.anInt701 = 0;
            aClass40_656.anInt702 = 0;
            aClass40_656.anInt709 = 0;
            method331(aClass40_656);
            i -= aClass40_656.anInt700;
            int l = i;
        }
    }

    public static void method330(Class40 class40) {
        byte byte4 = class40.aByte703;
        int i = class40.anInt704;
        int j = class40.anInt714;
        int k = class40.anInt712;
        int[] ai = Class40.anIntArray717;
        int l = class40.anInt711;
        byte[] abyte0 = class40.aByteArray698;
        int i1 = class40.anInt699;
        int j1 = class40.anInt700;
        int k1 = j1;
        int l1 = class40.anInt731 + 1;
        label0:
        do {
            if (i > 0) {
                do {
                    if (j1 == 0)
                        break label0;
                    if (i == 1)
                        break;
                    abyte0[i1] = byte4;
                    i--;
                    i1++;
                    j1--;
                } while (true);
                if (j1 == 0) {
                    i = 1;
                    break;
                }
                abyte0[i1] = byte4;
                i1++;
                j1--;
            }
            boolean flag = true;
            while (flag) {
                flag = false;
                if (j == l1) {
                    i = 0;
                    break label0;
                }
                byte4 = (byte) k;
                l = ai[l];
                byte byte0 = (byte) (l & 0xff);
                l >>= 8;
                j++;
                if (byte0 != k) {
                    k = byte0;
                    if (j1 == 0) {
                        i = 1;
                    } else {
                        abyte0[i1] = byte4;
                        i1++;
                        j1--;
                        flag = true;
                        continue;
                    }
                    break label0;
                }
                if (j != l1)
                    continue;
                if (j1 == 0) {
                    i = 1;
                    break label0;
                }
                abyte0[i1] = byte4;
                i1++;
                j1--;
                flag = true;
            }
            i = 2;
            l = ai[l];
            byte byte1 = (byte) (l & 0xff);
            l >>= 8;
            if (++j != l1)
                if (byte1 != k) {
                    k = byte1;
                } else {
                    i = 3;
                    l = ai[l];
                    byte byte2 = (byte) (l & 0xff);
                    l >>= 8;
                    if (++j != l1)
                        if (byte2 != k) {
                            k = byte2;
                        } else {
                            l = ai[l];
                            byte byte3 = (byte) (l & 0xff);
                            l >>= 8;
                            j++;
                            i = (byte3 & 0xff) + 4;
                            l = ai[l];
                            k = (byte) (l & 0xff);
                            l >>= 8;
                            j++;
                        }
                }
        } while (true);
        int i2 = class40.anInt701;
        class40.anInt701 += k1 - j1;
        if (class40.anInt701 < i2)
            class40.anInt702++;
        class40.aByte703 = byte4;
        class40.anInt704 = i;
        class40.anInt714 = j;
        class40.anInt712 = k;
        Class40.anIntArray717 = ai;
        class40.anInt711 = l;
        class40.aByteArray698 = abyte0;
        class40.anInt699 = i1;
        class40.anInt700 = j1;
    }

    public static void method331(Class40 class40) {
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        boolean flag6 = false;
        boolean flag7 = false;
        boolean flag8 = false;
        boolean flag9 = false;
        boolean flag10 = false;
        boolean flag11 = false;
        boolean flag12 = false;
        boolean flag13 = false;
        boolean flag14 = false;
        boolean flag15 = false;
        boolean flag16 = false;
        boolean flag17 = false;
        boolean flag18 = false;
        int k8 = 0;
        int[] ai = null;
        int[] ai1 = null;
        int[] ai2 = null;
        class40.anInt708 = 1;
        if (Class40.anIntArray717 == null)
            Class40.anIntArray717 = new int[class40.anInt708 * 0x186a0];
        boolean flag19 = true;
        while (flag19) {
            byte byte0 = method332(class40);
            if (byte0 == 23)
                return;
            byte0 = method332(class40);
            byte0 = method332(class40);
            byte0 = method332(class40);
            byte0 = method332(class40);
            byte0 = method332(class40);
            class40.anInt709++;
            byte0 = method332(class40);
            byte0 = method332(class40);
            byte0 = method332(class40);
            byte0 = method332(class40);
            byte0 = method333(class40);
            class40.aBoolean705 = byte0 != 0;
            if (class40.aBoolean705)
                System.out.println("PANIC! RANDOMISED BLOCK!");
            class40.anInt710 = 0;
            byte0 = method332(class40);
            class40.anInt710 = class40.anInt710 << 8 | byte0 & 0xff;
            byte0 = method332(class40);
            class40.anInt710 = class40.anInt710 << 8 | byte0 & 0xff;
            byte0 = method332(class40);
            class40.anInt710 = class40.anInt710 << 8 | byte0 & 0xff;
            for (int j = 0; j < 16; j++) {
                byte byte1 = method333(class40);
                class40.aBooleanArray720[j] = byte1 == 1;
            }

            for (int k = 0; k < 256; k++)
                class40.aBooleanArray719[k] = false;

            for (int l = 0; l < 16; l++)
                if (class40.aBooleanArray720[l]) {
                    for (int i3 = 0; i3 < 16; i3++) {
                        byte byte2 = method333(class40);
                        if (byte2 == 1)
                            class40.aBooleanArray719[l * 16 + i3] = true;
                    }

                }

            method335(class40);
            int i4 = class40.anInt718 + 2;
            int j4 = method334(3, class40);
            int k4 = method334(15, class40);
            for (int i1 = 0; i1 < k4; i1++) {
                int j3 = 0;
                do {
                    byte byte3 = method333(class40);
                    if (byte3 == 0)
                        break;
                    j3++;
                } while (true);
                class40.aByteArray725[i1] = (byte) j3;
            }

            byte[] abyte0 = new byte[6];
            for (byte byte16 = 0; byte16 < j4; byte16++)
                abyte0[byte16] = byte16;

            for (int j1 = 0; j1 < k4; j1++) {
                byte byte17 = class40.aByteArray725[j1];
                byte byte15 = abyte0[byte17];
                for (; byte17 > 0; byte17--)
                    abyte0[byte17] = abyte0[byte17 - 1];

                abyte0[0] = byte15;
                class40.aByteArray724[j1] = byte15;
            }

            for (int k3 = 0; k3 < j4; k3++) {
                int l6 = method334(5, class40);
                for (int k1 = 0; k1 < i4; k1++) {
                    do {
                        byte byte4 = method333(class40);
                        if (byte4 == 0)
                            break;
                        byte4 = method333(class40);
                        if (byte4 == 0)
                            l6++;
                        else
                            l6--;
                    } while (true);
                    class40.aByteArrayArray726[k3][k1] = (byte) l6;
                }

            }

            for (int l3 = 0; l3 < j4; l3++) {
                byte byte8 = 32;
                int i = 0;
                for (int l1 = 0; l1 < i4; l1++) {
                    if (class40.aByteArrayArray726[l3][l1] > i)
                        i = class40.aByteArrayArray726[l3][l1];
                    if (class40.aByteArrayArray726[l3][l1] < byte8)
                        byte8 = class40.aByteArrayArray726[l3][l1];
                }

                method336(class40.anIntArrayArray727[l3], class40.anIntArrayArray728[l3], class40.anIntArrayArray729[l3], class40.aByteArrayArray726[l3], byte8, i, i4);
                class40.anIntArray730[l3] = byte8;
            }

            int l4 = class40.anInt718 + 1;
            int l5 = 0x186a0 * class40.anInt708;
            int i5 = -1;
            int j5 = 0;
            for (int i2 = 0; i2 <= 255; i2++)
                class40.anIntArray713[i2] = 0;

            int j9 = 4095;
            for (int l8 = 15; l8 >= 0; l8--) {
                for (int i9 = 15; i9 >= 0; i9--) {
                    class40.aByteArray722[j9] = (byte) (l8 * 16 + i9);
                    j9--;
                }

                class40.anIntArray723[l8] = j9 + 1;
            }

            int i6 = 0;
            if (j5 == 0) {
                i5++;
                j5 = 50;
                byte byte12 = class40.aByteArray724[i5];
                k8 = class40.anIntArray730[byte12];
                ai = class40.anIntArrayArray727[byte12];
                ai2 = class40.anIntArrayArray729[byte12];
                ai1 = class40.anIntArrayArray728[byte12];
            }
            j5--;
            int i7 = k8;
            int l7;
            byte byte9;
            for (l7 = method334(i7, class40); l7 > ai[i7]; l7 = l7 << 1 | byte9) {
                i7++;
                byte9 = method333(class40);
            }

            for (int k5 = ai2[l7 - ai1[i7]]; k5 != l4; )
                if (k5 == 0 || k5 == 1) {
                    int j6 = -1;
                    int k6 = 1;
                    do {
                        if (k5 == 0)
                            j6 += k6;
                        else if (k5 == 1)
                            j6 += 2 * k6;
                        k6 *= 2;
                        if (j5 == 0) {
                            i5++;
                            j5 = 50;
                            byte byte13 = class40.aByteArray724[i5];
                            k8 = class40.anIntArray730[byte13];
                            ai = class40.anIntArrayArray727[byte13];
                            ai2 = class40.anIntArrayArray729[byte13];
                            ai1 = class40.anIntArrayArray728[byte13];
                        }
                        j5--;
                        int j7 = k8;
                        int i8;
                        byte byte10;
                        for (i8 = method334(j7, class40); i8 > ai[j7]; i8 = i8 << 1 | byte10) {
                            j7++;
                            byte10 = method333(class40);
                        }

                        k5 = ai2[i8 - ai1[j7]];
                    } while (k5 == 0 || k5 == 1);
                    j6++;
                    byte byte5 = class40.aByteArray721[class40.aByteArray722[class40.anIntArray723[0]] & 0xff];
                    class40.anIntArray713[byte5 & 0xff] += j6;
                    for (; j6 > 0; j6--) {
                        Class40.anIntArray717[i6] = byte5 & 0xff;
                        i6++;
                    }

                } else {
                    int j11 = k5 - 1;
                    byte byte6;
                    if (j11 < 16) {
                        int j10 = class40.anIntArray723[0];
                        byte6 = class40.aByteArray722[j10 + j11];
                        for (; j11 > 3; j11 -= 4) {
                            int k11 = j10 + j11;
                            class40.aByteArray722[k11] = class40.aByteArray722[k11 - 1];
                            class40.aByteArray722[k11 - 1] = class40.aByteArray722[k11 - 2];
                            class40.aByteArray722[k11 - 2] = class40.aByteArray722[k11 - 3];
                            class40.aByteArray722[k11 - 3] = class40.aByteArray722[k11 - 4];
                        }

                        for (; j11 > 0; j11--)
                            class40.aByteArray722[j10 + j11] = class40.aByteArray722[(j10 + j11) - 1];

                        class40.aByteArray722[j10] = byte6;
                    } else {
                        int l10 = j11 / 16;
                        int i11 = j11 % 16;
                        int k10 = class40.anIntArray723[l10] + i11;
                        byte6 = class40.aByteArray722[k10];
                        for (; k10 > class40.anIntArray723[l10]; k10--)
                            class40.aByteArray722[k10] = class40.aByteArray722[k10 - 1];

                        class40.anIntArray723[l10]++;
                        for (; l10 > 0; l10--) {
                            class40.anIntArray723[l10]--;
                            class40.aByteArray722[class40.anIntArray723[l10]] = class40.aByteArray722[(class40.anIntArray723[l10 - 1] + 16) - 1];
                        }

                        class40.anIntArray723[0]--;
                        class40.aByteArray722[class40.anIntArray723[0]] = byte6;
                        if (class40.anIntArray723[0] == 0) {
                            int i10 = 4095;
                            for (int k9 = 15; k9 >= 0; k9--) {
                                for (int l9 = 15; l9 >= 0; l9--) {
                                    class40.aByteArray722[i10] = class40.aByteArray722[class40.anIntArray723[k9] + l9];
                                    i10--;
                                }

                                class40.anIntArray723[k9] = i10 + 1;
                            }

                        }
                    }
                    class40.anIntArray713[class40.aByteArray721[byte6 & 0xff] & 0xff]++;
                    Class40.anIntArray717[i6] = class40.aByteArray721[byte6 & 0xff] & 0xff;
                    i6++;
                    if (j5 == 0) {
                        i5++;
                        j5 = 50;
                        byte byte14 = class40.aByteArray724[i5];
                        k8 = class40.anIntArray730[byte14];
                        ai = class40.anIntArrayArray727[byte14];
                        ai2 = class40.anIntArrayArray729[byte14];
                        ai1 = class40.anIntArrayArray728[byte14];
                    }
                    j5--;
                    int k7 = k8;
                    int j8;
                    byte byte11;
                    for (j8 = method334(k7, class40); j8 > ai[k7]; j8 = j8 << 1 | byte11) {
                        k7++;
                        byte11 = method333(class40);
                    }

                    k5 = ai2[j8 - ai1[k7]];
                }

            class40.anInt704 = 0;
            class40.aByte703 = 0;
            class40.anIntArray715[0] = 0;
            System.arraycopy(class40.anIntArray713, 0, class40.anIntArray715, 1, 256);

            for (int k2 = 1; k2 <= 256; k2++)
                class40.anIntArray715[k2] += class40.anIntArray715[k2 - 1];

            for (int l2 = 0; l2 < i6; l2++) {
                byte byte7 = (byte) (Class40.anIntArray717[l2] & 0xff);
                Class40.anIntArray717[class40.anIntArray715[byte7 & 0xff]] |= l2 << 8;
                class40.anIntArray715[byte7 & 0xff]++;
            }

            class40.anInt711 = Class40.anIntArray717[class40.anInt710] >> 8;
            class40.anInt714 = 0;
            class40.anInt711 = Class40.anIntArray717[class40.anInt711];
            class40.anInt712 = (byte) (class40.anInt711 & 0xff);
            class40.anInt711 >>= 8;
            class40.anInt714++;
            class40.anInt731 = i6;
            method330(class40);
            flag19 = class40.anInt714 == class40.anInt731 + 1 && class40.anInt704 == 0;
        }
    }

    public static byte method332(Class40 class40) {
        return (byte) method334(8, class40);
    }

    public static byte method333(Class40 class40) {
        return (byte) method334(1, class40);
    }

    public static int method334(int i, Class40 class40) {
        int j;
        do {
            if (class40.anInt707 >= i) {
                int k = class40.anInt706 >> class40.anInt707 - i & (1 << i) - 1;
                class40.anInt707 -= i;
                j = k;
                break;
            }
            class40.anInt706 = class40.anInt706 << 8 | class40.aByteArray693[class40.anInt694] & 0xff;
            class40.anInt707 += 8;
            class40.anInt694++;
            class40.anInt695--;
            class40.anInt696++;
            if (class40.anInt696 == 0)
                class40.anInt697++;
        } while (true);
        return j;
    }

    public static void method335(Class40 class40) {
        class40.anInt718 = 0;
        for (int i = 0; i < 256; i++)
            if (class40.aBooleanArray719[i]) {
                class40.aByteArray721[class40.anInt718] = (byte) i;
                class40.anInt718++;
            }

    }

    public static void method336(int[] ai, int[] ai1, int[] ai2, byte[] abyte0, int i, int j, int k) {
        int l = 0;
        for (int i1 = i; i1 <= j; i1++) {
            for (int l2 = 0; l2 < k; l2++)
                if (abyte0[l2] == i1) {
                    ai2[l] = l2;
                    l++;
                }

        }

        for (int j1 = 0; j1 < 23; j1++)
            ai1[j1] = 0;

        for (int k1 = 0; k1 < k; k1++)
            ai1[abyte0[k1] + 1]++;

        for (int l1 = 1; l1 < 23; l1++)
            ai1[l1] += ai1[l1 - 1];

        for (int i2 = 0; i2 < 23; i2++)
            ai[i2] = 0;

        int i3 = 0;
        for (int j2 = i; j2 <= j; j2++) {
            i3 += ai1[j2 + 1] - ai1[j2];
            ai[j2] = i3 - 1;
            i3 <<= 1;
        }

        for (int k2 = i + 1; k2 <= j; k2++)
            ai1[k2] = (ai[k2 - 1] + 1 << 1) - ai1[k2];

    }

}
