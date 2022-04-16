// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class44_Sub3_Sub4_Sub6_Sub2 extends Class44_Sub3_Sub4_Sub6 {

    public boolean aBoolean1681;
    public Class12 aClass12_1682;

    public Class44_Sub3_Sub4_Sub6_Sub2() {
        aBoolean1681 = true;
    }

    public Class44_Sub3_Sub4_Sub4 method496(boolean flag) {
        if (flag) {
            for (int i = 1; i > 0; i++) ;
        }
        if (aClass12_1682 == null)
            return null;
        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = method537(true);
        if (class44_sub3_sub4_sub4 == null)
            return null;
        super.anInt1645 = class44_sub3_sub4_sub4.anInt1394;
        if (super.anInt1632 != -1 && super.anInt1633 != -1) {
            Class32 class32 = Class32.aClass32Array547[super.anInt1632];
            Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4_1 = class32.method271();
            if (class44_sub3_sub4_sub4_1 != null) {
                int j = class32.aClass26_551.anIntArray499[super.anInt1633];
                Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4_2 = new Class44_Sub3_Sub4_Sub4(true, Class11.method211(j, 0), class44_sub3_sub4_sub4_1, true, false);
                class44_sub3_sub4_sub4_2.method516(0, -super.anInt1636, (byte) 10, 0);
                class44_sub3_sub4_sub4_2.method510(9);
                class44_sub3_sub4_sub4_2.method511(j, -284);
                class44_sub3_sub4_sub4_2.anIntArrayArray1554 = null;
                class44_sub3_sub4_sub4_2.anIntArrayArray1553 = null;
                if (class32.anInt554 != 128 || class32.anInt555 != 128)
                    class44_sub3_sub4_sub4_2.method519(9, class32.anInt554, class32.anInt554, class32.anInt555);
                class44_sub3_sub4_sub4_2.method520(64 + class32.anInt557, 850 + class32.anInt558, -30, -50, -30, true);
                Class44_Sub3_Sub4_Sub4[] aclass44_sub3_sub4_sub4 = {
                        class44_sub3_sub4_sub4, class44_sub3_sub4_sub4_2
                };
                class44_sub3_sub4_sub4 = new Class44_Sub3_Sub4_Sub4(true, (byte) 72, aclass44_sub3_sub4_sub4, 2);
            }
        }
        if (aClass12_1682.aByte283 == 1)
            class44_sub3_sub4_sub4.aBoolean1555 = true;
        return class44_sub3_sub4_sub4;
    }

    public Class44_Sub3_Sub4_Sub4 method537(boolean flag) {
        if (super.anInt1627 >= 0 && super.anInt1630 == 0) {
            int i = Class26.aClass26Array497[super.anInt1627].anIntArray499[super.anInt1628];
            int k = -1;
            if (super.anInt1624 >= 0 && super.anInt1624 != super.anInt1604)
                k = Class26.aClass26Array497[super.anInt1624].anIntArray499[super.anInt1625];
            return aClass12_1682.method216(i, k, 811, Class26.aClass26Array497[super.anInt1627].anIntArray503);
        }
        int j = -1;
        if (!flag)
            aBoolean1681 = !aBoolean1681;
        if (super.anInt1624 >= 0)
            j = Class26.aClass26Array497[super.anInt1624].anIntArray499[super.anInt1625];
        return aClass12_1682.method216(j, -1, 811, null);
    }

    public boolean method532(int i) {
        if (i != 0)
            throw new NullPointerException();
        return aClass12_1682 != null;
    }
}
