// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import sign.signlink;

import java.math.BigInteger;

public class Class44_Sub3_Sub2 extends Class44_Sub3 {

    public static final int[] anIntArray1377 = {
            0, 1, 3, 7, 15, 31, 63, 127, 255, 511,
            1023, 2047, 4095, 8191, 16383, 32767, 65535, 0x1ffff, 0x3ffff, 0x7ffff,
            0xfffff, 0x1fffff, 0x3fffff, 0x7fffff, 0xffffff, 0x1ffffff, 0x3ffffff, 0x7ffffff, 0xfffffff, 0x1fffffff,
            0x3fffffff, 0x7fffffff, -1
    };
    public static final int[] anIntArray1376;
    public static int anInt1379;
    public static int anInt1380;
    public static int anInt1381;
    public static final Class28 aClass28_1382 = new Class28(-822);
    public static final Class28 aClass28_1383 = new Class28(-822);
    public static final Class28 aClass28_1384 = new Class28(-822);
    public static int anInt1386;

    static {
        anIntArray1376 = new int[256];
        for (int j = 0; j < 256; j++) {
            int i = j;
            for (int k = 0; k < 8; k++)
                if ((i & 1) == 1)
                    i = i >>> 1 ^ 0xedb88320;
                else
                    i >>>= 1;

            anIntArray1376[j] = i;
        }

    }

    public boolean aBoolean1362;
    public int anInt1363;
    public int anInt1364;
    public int anInt1365;
    public boolean aBoolean1366;
    public int anInt1367;
    public boolean aBoolean1368;
    public boolean aBoolean1369;
    public boolean aBoolean1370;
    public boolean aBoolean1371;
    public int anInt1372;
    public byte[] aByteArray1373;
    public int anInt1374;
    public int anInt1375;
    public Class46 aClass46_1378;
    public char[] aCharArray1385 = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd',
            'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', '+', '/'
    };

    public Class44_Sub3_Sub2(byte byte0) {
        aBoolean1362 = true;
        anInt1363 = 9;
        anInt1364 = -442;
        anInt1365 = -41441;
        aBoolean1366 = true;
        anInt1367 = 368;
        aBoolean1368 = true;
        aBoolean1369 = true;
        aBoolean1370 = false;
        aBoolean1371 = false;
        anInt1372 = -186;
        if (byte0 != 3)
            throw new NullPointerException();
        else {
        }
    }

    public Class44_Sub3_Sub2(byte[] abyte0, byte byte0) {
        aBoolean1362 = true;
        anInt1363 = 9;
        anInt1364 = -442;
        anInt1365 = -41441;
        aBoolean1366 = true;
        anInt1367 = 368;
        aBoolean1368 = true;
        aBoolean1369 = true;
        aBoolean1370 = false;
        aBoolean1371 = false;
        anInt1372 = -186;
        aByteArray1373 = abyte0;
        anInt1374 = 0;
        if (byte0 != 1) {
            anInt1372 = 309;
        } else {
        }
    }

    public static Class44_Sub3_Sub2 method467(int i, int j) {
        synchronized (aClass28_1383) {
            Class44_Sub3_Sub2 class44_sub3_sub2_2 = null;
            if (j == 0 && anInt1379 > 0) {
                anInt1379--;
                class44_sub3_sub2_2 = (Class44_Sub3_Sub2) aClass28_1382.method258();
            } else if (j == 1 && anInt1380 > 0) {
                anInt1380--;
                class44_sub3_sub2_2 = (Class44_Sub3_Sub2) aClass28_1383.method258();
            } else if (j == 2 && anInt1381 > 0) {
                anInt1381--;
                class44_sub3_sub2_2 = (Class44_Sub3_Sub2) aClass28_1384.method258();
            }
            if (class44_sub3_sub2_2 != null) {
                class44_sub3_sub2_2.anInt1374 = 0;
                Class44_Sub3_Sub2 class44_sub3_sub2 = class44_sub3_sub2_2;
                return class44_sub3_sub2;
            }
        }
        Class44_Sub3_Sub2 class44_sub3_sub2_1 = new Class44_Sub3_Sub2((byte) 3);
        if (i != -7939)
            throw new NullPointerException();
        class44_sub3_sub2_1.anInt1374 = 0;
        if (j == 0)
            class44_sub3_sub2_1.aByteArray1373 = new byte[100];
        else if (j == 1)
            class44_sub3_sub2_1.aByteArray1373 = new byte[5000];
        else
            class44_sub3_sub2_1.aByteArray1373 = new byte[30000];
        return class44_sub3_sub2_1;
    }

    public void putOpcode(int i) {
        aByteArray1373[anInt1374++] = (byte) (i + aClass46_1378.method542());
    }

    public void put1(int i) {
        aByteArray1373[anInt1374++] = (byte) i;
    }

    public void put2(int i) {
        aByteArray1373[anInt1374++] = (byte) (i >> 8);
        aByteArray1373[anInt1374++] = (byte) i;
    }

    public void put2LE(boolean flag, int i) {
        aByteArray1373[anInt1374++] = (byte) i;
        aByteArray1373[anInt1374++] = (byte) (i >> 8);
        if (!flag) ;
    }

    public void put3(int i) {
        aByteArray1373[anInt1374++] = (byte) (i >> 16);
        aByteArray1373[anInt1374++] = (byte) (i >> 8);
        aByteArray1373[anInt1374++] = (byte) i;
    }

    public void put4(int i) {
        aByteArray1373[anInt1374++] = (byte) (i >> 24);
        aByteArray1373[anInt1374++] = (byte) (i >> 16);
        aByteArray1373[anInt1374++] = (byte) (i >> 8);
        aByteArray1373[anInt1374++] = (byte) i;
    }

    public void put4LE(boolean flag, int i) {
        aByteArray1373[anInt1374++] = (byte) i;
        aByteArray1373[anInt1374++] = (byte) (i >> 8);
        aByteArray1373[anInt1374++] = (byte) (i >> 16);
        if (!flag) {
        } else {
            aByteArray1373[anInt1374++] = (byte) (i >> 24);
        }
    }

    public void put8(long l, int i) {
        try {
            if (i != 0)
                anInt1367 = 452;
            aByteArray1373[anInt1374++] = (byte) (int) (l >> 56);
            aByteArray1373[anInt1374++] = (byte) (int) (l >> 48);
            aByteArray1373[anInt1374++] = (byte) (int) (l >> 40);
            aByteArray1373[anInt1374++] = (byte) (int) (l >> 32);
            aByteArray1373[anInt1374++] = (byte) (int) (l >> 24);
            aByteArray1373[anInt1374++] = (byte) (int) (l >> 16);
            aByteArray1373[anInt1374++] = (byte) (int) (l >> 8);
            aByteArray1373[anInt1374++] = (byte) (int) l;
            return;
        } catch (RuntimeException runtimeexception) {
            signlink.reporterror("66663, " + l + ", " + i + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void putString(String s) {
        s.getBytes(0, s.length(), aByteArray1373, anInt1374);
        anInt1374 += s.length();
        aByteArray1373[anInt1374++] = 10;
    }

    public void putArray(byte[] abyte0, boolean flag, int i, int j) {
        if (flag)
            aBoolean1370 = !aBoolean1370;
        for (int k = i; k < i + j; k++)
            aByteArray1373[anInt1374++] = abyte0[k];

    }

    public void putSize(int i, int j) {
        if (j != 0) {
        } else {
            aByteArray1373[anInt1374 - i - 1] = (byte) i;
        }
    }

    public int get1() {
        return aByteArray1373[anInt1374++] & 0xff;
    }

    public byte get1Signed() {
        return aByteArray1373[anInt1374++];
    }

    public int get2() {
        anInt1374 += 2;
        return ((aByteArray1373[anInt1374 - 2] & 0xff) << 8) + (aByteArray1373[anInt1374 - 1] & 0xff);
    }

    public int get2Signed() {
        anInt1374 += 2;
        int i = ((aByteArray1373[anInt1374 - 2] & 0xff) << 8) + (aByteArray1373[anInt1374 - 1] & 0xff);
        if (i > 32767)
            i -= 0x10000;
        return i;
    }

    public int get3() {
        anInt1374 += 3;
        return ((aByteArray1373[anInt1374 - 3] & 0xff) << 16) + ((aByteArray1373[anInt1374 - 2] & 0xff) << 8) + (aByteArray1373[anInt1374 - 1] & 0xff);
    }

    public int get4() {
        anInt1374 += 4;
        return ((aByteArray1373[anInt1374 - 4] & 0xff) << 24) + ((aByteArray1373[anInt1374 - 3] & 0xff) << 16) + ((aByteArray1373[anInt1374 - 2] & 0xff) << 8) + (aByteArray1373[anInt1374 - 1] & 0xff);
    }

    public long get8(int i) {
        long l = (long) get4() & 0xffffffffL;
        long l1 = (long) get4() & 0xffffffffL;
        if (i != 0)
            throw new NullPointerException();
        else
            return (l << 32) + l1;
    }

    public String getString() {
        int i = anInt1374;
        while (aByteArray1373[anInt1374++] != 10) ;
        return new String(aByteArray1373, i, anInt1374 - i - 1);
    }

    public byte[] getStringArray(int i) {
        int j = anInt1374;
        while (aByteArray1373[anInt1374++] != 10) ;
        byte[] abyte0 = new byte[anInt1374 - j - 1];
        if (i != -32952)
            anInt1363 = 127;
        if (anInt1374 - 1 - j >= 0) System.arraycopy(aByteArray1373, j, abyte0, 0, anInt1374 - 1 - j);

        return abyte0;
    }

    public void getArray(int i, byte[] abyte0, int j, int k) {
        if (k != 0) {
            for (int l = 1; l > 0; l++) ;
        }
        for (int i1 = j; i1 < j + i; i1++)
            abyte0[i1] = aByteArray1373[anInt1374++];

    }

    public void accessBits(byte byte0) {
        if (byte0 != 4) {
        } else {
            anInt1375 = anInt1374 * 8;
        }
    }

    public int getBit(int i, byte byte0) {
        int j = anInt1375 >> 3;
        int k = 8 - (anInt1375 & 7);
        int l = 0;
        anInt1375 += i;
        if (byte0 != -96)
            anInt1372 = 0;
        for (; i > k; k = 8) {
            l += (aByteArray1373[j++] & anIntArray1377[k]) << i - k;
            i -= k;
        }

        if (i == k)
            l += aByteArray1373[j] & anIntArray1377[k];
        else
            l += aByteArray1373[j] >> k - i & anIntArray1377[i];
        return l;
    }

    public void accessBytes(int i) {
        anInt1374 = (anInt1375 + 7) / 8;
        i = 88 / i;
    }

    public int method492() {
        int i = aByteArray1373[anInt1374] & 0xff;
        if (i < 128)
            return get1() - 64;
        else
            return get2() - 49152;
    }

    public int method493() {
        int i = aByteArray1373[anInt1374] & 0xff;
        if (i < 128)
            return get1();
        else
            return get2() - 32768;
    }

    public void rsa(BigInteger modulus, BigInteger exponent, int i) {
        int j = anInt1374;
        anInt1374 = 0;
        byte[] abyte0 = new byte[j];
        getArray(j, abyte0, 0, 0);
        BigInteger biginteger2 = new BigInteger(abyte0);
        BigInteger biginteger3 = biginteger2.modPow(exponent, modulus);
        byte[] abyte1 = biginteger3.toByteArray();
        anInt1374 = 0;
        put1(abyte1.length);
        if (i != 4)
            anInt1363 = 380;
        putArray(abyte1, false, 0, abyte1.length);
    }
}
