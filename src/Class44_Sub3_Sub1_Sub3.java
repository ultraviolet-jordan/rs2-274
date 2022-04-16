// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class44_Sub3_Sub1_Sub3 extends Class44_Sub3_Sub1 {

    public int anInt1438;
    public final boolean aBoolean1439;
    public final int anInt1440;
    public final int anInt1441;
    public final byte aByte1442;
    public final boolean aBoolean1443;
    public int anInt1444;
    public byte[] aByteArray1445;
    public final int[] anIntArray1446;
    public int anInt1447;
    public int anInt1448;
    public int anInt1449;
    public int anInt1450;
    public int anInt1451;
    public int anInt1452;
    public Class44_Sub3_Sub1_Sub3(Class47 class47, String s, int i) {
        anInt1438 = -41441;
        aBoolean1439 = true;
        anInt1440 = 35961;
        anInt1441 = -676;
        aByte1442 = 9;
        aBoolean1443 = true;
        Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(class47.method546(s + ".dat", null), (byte) 1);
        Class44_Sub3_Sub2 class44_sub3_sub2_1 = new Class44_Sub3_Sub2(class47.method546("index.dat", null), (byte) 1);
        class44_sub3_sub2_1.anInt1374 = class44_sub3_sub2.get2();
        anInt1451 = class44_sub3_sub2_1.get2();
        anInt1452 = class44_sub3_sub2_1.get2();
        int j = class44_sub3_sub2_1.get1();
        anIntArray1446 = new int[j];
        for (int k = 0; k < j - 1; k++)
            anIntArray1446[k + 1] = class44_sub3_sub2_1.get3();

        for (int l = 0; l < i; l++) {
            class44_sub3_sub2_1.anInt1374 += 2;
            class44_sub3_sub2.anInt1374 += class44_sub3_sub2_1.get2() * class44_sub3_sub2_1.get2();
            class44_sub3_sub2_1.anInt1374++;
        }

        anInt1449 = class44_sub3_sub2_1.get1();
        anInt1450 = class44_sub3_sub2_1.get1();
        anInt1447 = class44_sub3_sub2_1.get2();
        anInt1448 = class44_sub3_sub2_1.get2();
        int i1 = class44_sub3_sub2_1.get1();
        int j1 = anInt1447 * anInt1448;
        aByteArray1445 = new byte[j1];
        if (i1 == 0) {
            for (int k1 = 0; k1 < j1; k1++)
                aByteArray1445[k1] = class44_sub3_sub2.get1Signed();

            return;
        }
        if (i1 == 1) {
            for (int l1 = 0; l1 < anInt1447; l1++) {
                for (int i2 = 0; i2 < anInt1448; i2++)
                    aByteArray1445[l1 + i2 * anInt1447] = class44_sub3_sub2.get1Signed();

            }

        }
    }

    public void method448(byte byte0) {
        anInt1451 /= 2;
        anInt1452 /= 2;
        byte[] abyte0 = new byte[anInt1451 * anInt1452];
        int i = 0;
        for (int j = 0; j < anInt1448; j++) {
            for (int k = 0; k < anInt1447; k++)
                abyte0[(k + anInt1449 >> 1) + (j + anInt1450 >> 1) * anInt1451] = aByteArray1445[i++];

        }

        aByteArray1445 = abyte0;
        anInt1447 = anInt1451;
        anInt1448 = anInt1452;
        anInt1449 = 0;
        if (byte0 == aByte1442)
            byte0 = 0;
        else
            return;
        anInt1450 = 0;
    }

    public void method449(int i) {
        if (i != 0)
            anInt1444 = 243;
        if (anInt1447 == anInt1451 && anInt1448 == anInt1452)
            return;
        byte[] abyte0 = new byte[anInt1451 * anInt1452];
        int j = 0;
        for (int k = 0; k < anInt1448; k++) {
            for (int l = 0; l < anInt1447; l++)
                abyte0[l + anInt1449 + (k + anInt1450) * anInt1451] = aByteArray1445[j++];

        }

        aByteArray1445 = abyte0;
        anInt1447 = anInt1451;
        anInt1448 = anInt1452;
        anInt1449 = 0;
        anInt1450 = 0;
    }

    public void method450(int i) {
        byte[] abyte0 = new byte[anInt1447 * anInt1448];
        int j = 0;
        for (int k = 0; k < anInt1448; k++) {
            for (int l = anInt1447 - 1; l >= 0; l--)
                abyte0[j++] = aByteArray1445[l + k * anInt1447];

        }

        aByteArray1445 = abyte0;
        if (i != 2)
            anInt1444 = 97;
        anInt1449 = anInt1451 - anInt1447 - anInt1449;
    }

    public void method451(byte byte0) {
        byte[] abyte0 = new byte[anInt1447 * anInt1448];
        int i = 0;
        for (int j = anInt1448 - 1; j >= 0; j--) {
            for (int k = 0; k < anInt1447; k++)
                abyte0[i++] = aByteArray1445[k + j * anInt1447];

        }

        if (byte0 != -36) {
        } else {
            aByteArray1445 = abyte0;
            anInt1450 = anInt1452 - anInt1448 - anInt1450;
        }
    }

    public void method452(int i, int j, int k, int l) {
        for (int i1 = 0; i1 < anIntArray1446.length; i1++) {
            int j1 = anIntArray1446[i1] >> 16 & 0xff;
            j1 += k;
            if (j1 < 0)
                j1 = 0;
            else if (j1 > 255)
                j1 = 255;
            int k1 = anIntArray1446[i1] >> 8 & 0xff;
            k1 += l;
            if (k1 < 0)
                k1 = 0;
            else if (k1 > 255)
                k1 = 255;
            int l1 = anIntArray1446[i1] & 0xff;
            l1 += i;
            if (l1 < 0)
                l1 = 0;
            else if (l1 > 255)
                l1 = 255;
            anIntArray1446[i1] = (j1 << 16) + (k1 << 8) + l1;
        }

        if (j == 6) ;
    }

    public void method453(byte byte0, int i, int j) {
        i += anInt1449;
        j += anInt1450;
        int k = i + j * Class44_Sub3_Sub1.anInt1352;
        int l = 0;
        int i1 = anInt1448;
        int j1 = anInt1447;
        int k1 = Class44_Sub3_Sub1.anInt1352 - j1;
        int l1 = 0;
        if (j < Class44_Sub3_Sub1.anInt1354) {
            int i2 = Class44_Sub3_Sub1.anInt1354 - j;
            i1 -= i2;
            j = Class44_Sub3_Sub1.anInt1354;
            l += i2 * j1;
            k += i2 * Class44_Sub3_Sub1.anInt1352;
        }
        if (j + i1 > Class44_Sub3_Sub1.anInt1355)
            i1 -= (j + i1) - Class44_Sub3_Sub1.anInt1355;
        if (i < Class44_Sub3_Sub1.anInt1356) {
            int j2 = Class44_Sub3_Sub1.anInt1356 - i;
            j1 -= j2;
            i = Class44_Sub3_Sub1.anInt1356;
            l += j2;
            k += j2;
            l1 += j2;
            k1 += j2;
        }
        if (i + j1 > Class44_Sub3_Sub1.anInt1357) {
            int k2 = (i + j1) - Class44_Sub3_Sub1.anInt1357;
            j1 -= k2;
            l1 += k2;
            k1 += k2;
        }
        if (j1 <= 0 || i1 <= 0)
            return;
        method454(l1, (byte) -55, k1, l, i1, j1, Class44_Sub3_Sub1.anIntArray1351, aByteArray1445, k, anIntArray1446);
        if (byte0 != 7)
            anInt1438 = -485;
    }

    public void method454(int i, byte byte0, int j, int k, int l, int i1, int[] ai,
                          byte[] abyte0, int j1, int[] ai1) {
        int k1 = -(i1 >> 2);
        i1 = -(i1 & 3);
        if (byte0 != -55)
            return;
        for (int l1 = -l; l1 < 0; l1++) {
            for (int i2 = k1; i2 < 0; i2++) {
                byte byte1 = abyte0[k++];
                if (byte1 != 0)
                    ai[j1++] = ai1[byte1 & 0xff];
                else
                    j1++;
                byte1 = abyte0[k++];
                if (byte1 != 0)
                    ai[j1++] = ai1[byte1 & 0xff];
                else
                    j1++;
                byte1 = abyte0[k++];
                if (byte1 != 0)
                    ai[j1++] = ai1[byte1 & 0xff];
                else
                    j1++;
                byte1 = abyte0[k++];
                if (byte1 != 0)
                    ai[j1++] = ai1[byte1 & 0xff];
                else
                    j1++;
            }

            for (int j2 = i1; j2 < 0; j2++) {
                byte byte2 = abyte0[k++];
                if (byte2 != 0)
                    ai[j1++] = ai1[byte2 & 0xff];
                else
                    j1++;
            }

            j1 += j;
            k += i;
        }

    }
}
