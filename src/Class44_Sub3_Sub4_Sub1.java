// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class44_Sub3_Sub4_Sub1 extends Class44_Sub3_Sub4 {

    public int anInt1467;
    public boolean aBoolean1468;
    public final int anInt1469;
    public final int anInt1470;
    public final int anInt1471;
    public final int anInt1472;
    public final int anInt1473;
    public final int anInt1474;
    public final int anInt1475;
    public Class26 aClass26_1476;
    public int anInt1477;
    public int anInt1478;
    public Class44_Sub3_Sub4_Sub1(int i, int j, int k, int l, int i1, int j1, boolean flag,
                                  int k1, int l1, int i2) {
        aBoolean1468 = false;
        anInt1469 = l;
        anInt1470 = i;
        anInt1471 = j;
        anInt1472 = i2;
        anInt1473 = k1;
        anInt1474 = i1;
        anInt1475 = l1;
        aClass26_1476 = Class26.aClass26Array497[k];
        anInt1477 = 0;
        anInt1478 = client.anInt802;
        if (j1 != 0)
            anInt1467 = 429;
        if (flag && aClass26_1476.anInt502 != -1) {
            anInt1477 = (int) (Math.random() * (double) aClass26_1476.anInt498);
            anInt1478 -= (int) (Math.random() * (double) aClass26_1476.method254(anInt1477, 41645));
        }
    }

    public Class44_Sub3_Sub4_Sub4 method496(boolean flag) {
        if (aClass26_1476 != null) {
            int i = client.anInt802 - anInt1478;
            if (i > 100 && aClass26_1476.anInt502 > 0)
                i = 100;
            while (i > aClass26_1476.method254(anInt1477, 41645)) {
                i -= aClass26_1476.method254(anInt1477, 41645);
                anInt1477++;
                if (anInt1477 < aClass26_1476.anInt498)
                    continue;
                anInt1477 -= aClass26_1476.anInt502;
                if (anInt1477 >= 0 && anInt1477 < aClass26_1476.anInt498)
                    continue;
                aClass26_1476 = null;
                break;
            }
            anInt1478 = client.anInt802 - i;
        }
        int j = -1;
        if (flag)
            aBoolean1468 = !aBoolean1468;
        if (aClass26_1476 != null)
            j = aClass26_1476.anIntArray499[anInt1477];
        Class8 class8 = Class8.method199(anInt1469);
        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = class8.method205(anInt1470, anInt1471, anInt1472, anInt1473, anInt1474, anInt1475, j);
        return class44_sub3_sub4_sub4;
    }
}
