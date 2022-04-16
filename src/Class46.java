// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class46 {

    public int anInt772;
    public int[] anIntArray773;
    public int[] anIntArray774;
    public int anInt775;
    public int anInt776;
    public int anInt777;
    public Class46(boolean flag, int[] ai) {
        if (!flag)
            throw new NullPointerException();
        anIntArray774 = new int[256];
        anIntArray773 = new int[256];
        System.arraycopy(ai, 0, anIntArray773, 0, ai.length);

        method544();
    }

    public int method542() {
        if (anInt772-- == 0) {
            method543();
            anInt772 = 255;
        }
        return anIntArray773[anInt772];
    }

    public void method543() {
        anInt776 += ++anInt777;
        for (int i = 0; i < 256; i++) {
            int j = anIntArray774[i];
            switch (i & 3) {
                case 0: // '\0'
                    anInt775 ^= anInt775 << 13;
                    break;

                case 1: // '\001'
                    anInt775 ^= anInt775 >>> 6;
                    break;

                case 2: // '\002'
                    anInt775 ^= anInt775 << 2;
                    break;

                case 3: // '\003'
                    anInt775 ^= anInt775 >>> 16;
                    break;
            }
            anInt775 += anIntArray774[i + 128 & 0xff];
            int k;
            anIntArray774[i] = k = anIntArray774[(j & 0x3fc) >> 2] + anInt775 + anInt776;
            anIntArray773[i] = anInt776 = anIntArray774[(k >> 8 & 0x3fc) >> 2] + j;
        }

    }

    public void method544() {
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l = i1 = j1 = k1 = l1 = i2 = j2 = k2 = 0x9e3779b9;
        for (int i = 0; i < 4; i++) {
            l ^= i1 << 11;
            k1 += l;
            i1 += j1;
            i1 ^= j1 >>> 2;
            l1 += i1;
            j1 += k1;
            j1 ^= k1 << 8;
            i2 += j1;
            k1 += l1;
            k1 ^= l1 >>> 16;
            j2 += k1;
            l1 += i2;
            l1 ^= i2 << 10;
            k2 += l1;
            i2 += j2;
            i2 ^= j2 >>> 4;
            l += i2;
            j2 += k2;
            j2 ^= k2 << 8;
            i1 += j2;
            k2 += l;
            k2 ^= l >>> 9;
            j1 += k2;
            l += i1;
        }

        for (int j = 0; j < 256; j += 8) {
            l += anIntArray773[j];
            i1 += anIntArray773[j + 1];
            j1 += anIntArray773[j + 2];
            k1 += anIntArray773[j + 3];
            l1 += anIntArray773[j + 4];
            i2 += anIntArray773[j + 5];
            j2 += anIntArray773[j + 6];
            k2 += anIntArray773[j + 7];
            l ^= i1 << 11;
            k1 += l;
            i1 += j1;
            i1 ^= j1 >>> 2;
            l1 += i1;
            j1 += k1;
            j1 ^= k1 << 8;
            i2 += j1;
            k1 += l1;
            k1 ^= l1 >>> 16;
            j2 += k1;
            l1 += i2;
            l1 ^= i2 << 10;
            k2 += l1;
            i2 += j2;
            i2 ^= j2 >>> 4;
            l += i2;
            j2 += k2;
            j2 ^= k2 << 8;
            i1 += j2;
            k2 += l;
            k2 ^= l >>> 9;
            j1 += k2;
            l += i1;
            anIntArray774[j] = l;
            anIntArray774[j + 1] = i1;
            anIntArray774[j + 2] = j1;
            anIntArray774[j + 3] = k1;
            anIntArray774[j + 4] = l1;
            anIntArray774[j + 5] = i2;
            anIntArray774[j + 6] = j2;
            anIntArray774[j + 7] = k2;
        }

        for (int k = 0; k < 256; k += 8) {
            l += anIntArray774[k];
            i1 += anIntArray774[k + 1];
            j1 += anIntArray774[k + 2];
            k1 += anIntArray774[k + 3];
            l1 += anIntArray774[k + 4];
            i2 += anIntArray774[k + 5];
            j2 += anIntArray774[k + 6];
            k2 += anIntArray774[k + 7];
            l ^= i1 << 11;
            k1 += l;
            i1 += j1;
            i1 ^= j1 >>> 2;
            l1 += i1;
            j1 += k1;
            j1 ^= k1 << 8;
            i2 += j1;
            k1 += l1;
            k1 ^= l1 >>> 16;
            j2 += k1;
            l1 += i2;
            l1 ^= i2 << 10;
            k2 += l1;
            i2 += j2;
            i2 ^= j2 >>> 4;
            l += i2;
            j2 += k2;
            j2 ^= k2 << 8;
            i1 += j2;
            k2 += l;
            k2 ^= l >>> 9;
            j1 += k2;
            l += i1;
            anIntArray774[k] = l;
            anIntArray774[k + 1] = i1;
            anIntArray774[k + 2] = j1;
            anIntArray774[k + 3] = k1;
            anIntArray774[k + 4] = l1;
            anIntArray774[k + 5] = i2;
            anIntArray774[k + 6] = j2;
            anIntArray774[k + 7] = k2;
        }

        method543();
        anInt772 = 256;
    }
}
