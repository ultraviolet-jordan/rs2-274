// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.io.IOException;
import java.io.RandomAccessFile;

public class Class45 {

    public static final byte[] aByteArray767 = new byte[520];
    public boolean aBoolean764;
    public final int anInt765;
    public int anInt766;
    public final RandomAccessFile aRandomAccessFile768;
    public final RandomAccessFile aRandomAccessFile769;
    public final int anInt770;
    public int anInt771;
    public Class45(RandomAccessFile randomaccessfile, int i, RandomAccessFile randomaccessfile1, int j, int k) {
        aBoolean764 = true;
        anInt765 = 29615;
        anInt766 = 7228;
        anInt771 = 65000;
        anInt770 = j;
        aRandomAccessFile768 = randomaccessfile;
        if (i != anInt765) {
            for (int l = 1; l > 0; l++) ;
        }
        aRandomAccessFile769 = randomaccessfile1;
        anInt771 = k;
    }

    public synchronized byte[] method538(byte byte0, int i) {
        if (byte0 == 2)
            byte0 = 0;
        else
            throw new NullPointerException();
        try {
            method541(i * 6, false, aRandomAccessFile769);
            int l;
            for (int j = 0; j < 6; j += l) {
                l = aRandomAccessFile769.read(aByteArray767, j, 6 - j);
                if (l == -1)
                    return null;
            }

            int i1 = ((aByteArray767[0] & 0xff) << 16) + ((aByteArray767[1] & 0xff) << 8) + (aByteArray767[2] & 0xff);
            int j1 = ((aByteArray767[3] & 0xff) << 16) + ((aByteArray767[4] & 0xff) << 8) + (aByteArray767[5] & 0xff);
            if (i1 < 0 || i1 > anInt771)
                return null;
            if (j1 <= 0 || (long) j1 > aRandomAccessFile768.length() / 520L)
                return null;
            byte[] abyte0 = new byte[i1];
            int k1 = 0;
            for (int l1 = 0; k1 < i1; l1++) {
                if (j1 == 0)
                    return null;
                method541(j1 * 520, false, aRandomAccessFile768);
                int k = 0;
                int i2 = i1 - k1;
                if (i2 > 512)
                    i2 = 512;
                int j2;
                for (; k < i2 + 8; k += j2) {
                    j2 = aRandomAccessFile768.read(aByteArray767, k, (i2 + 8) - k);
                    if (j2 == -1)
                        return null;
                }

                int k2 = ((aByteArray767[0] & 0xff) << 8) + (aByteArray767[1] & 0xff);
                int l2 = ((aByteArray767[2] & 0xff) << 8) + (aByteArray767[3] & 0xff);
                int i3 = ((aByteArray767[4] & 0xff) << 16) + ((aByteArray767[5] & 0xff) << 8) + (aByteArray767[6] & 0xff);
                int j3 = aByteArray767[7] & 0xff;
                if (k2 != i || l2 != l1 || j3 != anInt770)
                    return null;
                if (i3 < 0 || (long) i3 > aRandomAccessFile768.length() / 520L)
                    return null;
                for (int k3 = 0; k3 < i2; k3++)
                    abyte0[k1++] = aByteArray767[k3 + 8];

                j1 = i3;
            }

            return abyte0;
        } catch (IOException _ex) {
            return null;
        }
    }

    public synchronized void method539(int i, int j, byte[] abyte0, byte byte0) {
        if (byte0 == 8)
            byte0 = 0;
        else
            throw new NullPointerException();
        boolean flag = method540(true, abyte0, j, i, (byte) -48);
        if (!flag)
            flag = method540(false, abyte0, j, i, (byte) -48);
    }

    public synchronized boolean method540(boolean flag, byte[] abyte0, int i, int j, byte byte0) {
        if (byte0 != -48)
            anInt766 = 219;
        try {
            int k;
            if (flag) {
                method541(i * 6, false, aRandomAccessFile769);
                int j1;
                for (int l = 0; l < 6; l += j1) {
                    j1 = aRandomAccessFile769.read(aByteArray767, l, 6 - l);
                    if (j1 == -1)
                        return false;
                }

                k = ((aByteArray767[3] & 0xff) << 16) + ((aByteArray767[4] & 0xff) << 8) + (aByteArray767[5] & 0xff);
                if (k <= 0 || (long) k > aRandomAccessFile768.length() / 520L)
                    return false;
            } else {
                k = (int) ((aRandomAccessFile768.length() + 519L) / 520L);
                if (k == 0)
                    k = 1;
            }
            aByteArray767[0] = (byte) (j >> 16);
            aByteArray767[1] = (byte) (j >> 8);
            aByteArray767[2] = (byte) j;
            aByteArray767[3] = (byte) (k >> 16);
            aByteArray767[4] = (byte) (k >> 8);
            aByteArray767[5] = (byte) k;
            method541(i * 6, false, aRandomAccessFile769);
            aRandomAccessFile769.write(aByteArray767, 0, 6);
            int i1 = 0;
            for (int k1 = 0; i1 < j; k1++) {
                int l1 = 0;
                if (flag) {
                    method541(k * 520, false, aRandomAccessFile768);
                    int i2;
                    int k2;
                    for (i2 = 0; i2 < 8; i2 += k2) {
                        k2 = aRandomAccessFile768.read(aByteArray767, i2, 8 - i2);
                        if (k2 == -1)
                            break;
                    }

                    if (i2 == 8) {
                        int l2 = ((aByteArray767[0] & 0xff) << 8) + (aByteArray767[1] & 0xff);
                        int i3 = ((aByteArray767[2] & 0xff) << 8) + (aByteArray767[3] & 0xff);
                        l1 = ((aByteArray767[4] & 0xff) << 16) + ((aByteArray767[5] & 0xff) << 8) + (aByteArray767[6] & 0xff);
                        int j3 = aByteArray767[7] & 0xff;
                        if (l2 != i || i3 != k1 || j3 != anInt770)
                            return false;
                        if (l1 < 0 || (long) l1 > aRandomAccessFile768.length() / 520L)
                            return false;
                    }
                }
                if (l1 == 0) {
                    flag = false;
                    l1 = (int) ((aRandomAccessFile768.length() + 519L) / 520L);
                    if (l1 == 0)
                        l1++;
                    if (l1 == k)
                        l1++;
                }
                if (j - i1 <= 512)
                    l1 = 0;
                aByteArray767[0] = (byte) (i >> 8);
                aByteArray767[1] = (byte) i;
                aByteArray767[2] = (byte) (k1 >> 8);
                aByteArray767[3] = (byte) k1;
                aByteArray767[4] = (byte) (l1 >> 16);
                aByteArray767[5] = (byte) (l1 >> 8);
                aByteArray767[6] = (byte) l1;
                aByteArray767[7] = (byte) anInt770;
                method541(k * 520, false, aRandomAccessFile768);
                aRandomAccessFile768.write(aByteArray767, 0, 8);
                int j2 = j - i1;
                if (j2 > 512)
                    j2 = 512;
                aRandomAccessFile768.write(abyte0, i1, j2);
                i1 += j2;
                k = l1;
            }

            return true;
        } catch (IOException _ex) {
            return false;
        }
    }

    public synchronized void method541(int i, boolean flag, RandomAccessFile randomaccessfile)
            throws IOException {
        if (flag)
            aBoolean764 = !aBoolean764;
        if (i < 0 || i > 0x3c00000) {
            System.out.println("Badseek - pos:" + i + " len:" + randomaccessfile.length());
            i = 0x3c00000;
            try {
                Thread.sleep(1000L);
            } catch (Exception ignored) {
            }
        }
        randomaccessfile.seek(i);
    }

}
