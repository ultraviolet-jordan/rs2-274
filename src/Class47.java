// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class47 {

    public int anInt778;
    public final int anInt779;
    public boolean aBoolean780;
    public byte[] aByteArray781;
    public int anInt782;
    public int[] anIntArray783;
    public int[] anIntArray784;
    public int[] anIntArray785;
    public int[] anIntArray786;
    public boolean aBoolean787;
    public Class47(int i, byte[] abyte0) {
        anInt778 = 9;
        anInt779 = 29615;
        aBoolean780 = true;
        method545(-6097, abyte0);
        if (i != 0)
            aBoolean780 = !aBoolean780;
    }

    public void method545(int i, byte[] abyte0) {
        Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(abyte0, (byte) 1);
        int j = class44_sub3_sub2.get3();
        int k = class44_sub3_sub2.get3();
        if (k != j) {
            byte[] abyte1 = new byte[j];
            Class37.method329(abyte1, j, abyte0, k, 6);
            aByteArray781 = abyte1;
            class44_sub3_sub2 = new Class44_Sub3_Sub2(aByteArray781, (byte) 1);
            aBoolean787 = true;
        } else {
            aByteArray781 = abyte0;
            aBoolean787 = false;
        }
        anInt782 = class44_sub3_sub2.get2();
        anIntArray783 = new int[anInt782];
        if (i != -6097)
            anInt778 = -36;
        anIntArray784 = new int[anInt782];
        anIntArray785 = new int[anInt782];
        anIntArray786 = new int[anInt782];
        int l = class44_sub3_sub2.anInt1374 + anInt782 * 10;
        for (int i1 = 0; i1 < anInt782; i1++) {
            anIntArray783[i1] = class44_sub3_sub2.get4();
            anIntArray784[i1] = class44_sub3_sub2.get3();
            anIntArray785[i1] = class44_sub3_sub2.get3();
            anIntArray786[i1] = l;
            l += anIntArray785[i1];
        }

    }

    public byte[] method546(String s, byte[] abyte0) {
        int i = 0;
        s = s.toUpperCase();
        for (int j = 0; j < s.length(); j++)
            i = (i * 61 + s.charAt(j)) - 32;

        for (int k = 0; k < anInt782; k++)
            if (anIntArray783[k] == i) {
                if (abyte0 == null)
                    abyte0 = new byte[anIntArray784[k]];
                if (!aBoolean787) {
                    Class37.method329(abyte0, anIntArray784[k], aByteArray781, anIntArray785[k], anIntArray786[k]);
                } else {
                    if (anIntArray784[k] >= 0)
                        System.arraycopy(aByteArray781, anIntArray786[k], abyte0, 0, anIntArray784[k]);

                }
                return abyte0;
            }

        return null;
    }
}
