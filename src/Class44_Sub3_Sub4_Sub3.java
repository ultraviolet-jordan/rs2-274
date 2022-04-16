// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class44_Sub3_Sub4_Sub3 extends Class44_Sub3_Sub4 {

    public int anInt1482;
    public boolean aBoolean1483;
    public final Class32 aClass32_1484;
    public final int anInt1485;
    public final int anInt1486;
    public final int anInt1487;
    public final int anInt1488;
    public final int anInt1489;
    public final int anInt1490;
    public final int anInt1491;
    public final int anInt1492;
    public final int anInt1493;
    public final int anInt1494;
    public boolean aBoolean1495;
    public double aDouble1496;
    public double aDouble1497;
    public double aDouble1498;
    public double aDouble1499;
    public double aDouble1500;
    public double aDouble1501;
    public double aDouble1502;
    public double aDouble1503;
    public int anInt1504;
    public int anInt1505;
    public int anInt1506;
    public int anInt1507;
    public Class44_Sub3_Sub4_Sub3(int i, int j, int k, int l, int i1, int j1, int k1,
                                  int l1, boolean flag, int i2, int j2, int k2) {
        aBoolean1483 = false;
        aBoolean1495 = false;
        aClass32_1484 = Class32.aClass32Array547[l1];
        anInt1485 = k1;
        anInt1486 = i;
        anInt1487 = k2;
        anInt1488 = i2;
        anInt1490 = j1;
        anInt1491 = l;
        anInt1492 = i1;
        anInt1493 = j;
        anInt1494 = j2;
        anInt1489 = k;
        aBoolean1495 = false;
        if (!flag)
            aBoolean1483 = !aBoolean1483;
    }

    public void method497(int i, int j, int k, byte byte0, int l) {
        if (!aBoolean1495) {
            double d = k - anInt1486;
            double d2 = l - anInt1487;
            double d3 = Math.sqrt(d * d + d2 * d2);
            aDouble1496 = (double) anInt1486 + (d * (double) anInt1493) / d3;
            aDouble1497 = (double) anInt1487 + (d2 * (double) anInt1493) / d3;
            aDouble1498 = anInt1488;
        }
        double d1 = (anInt1491 + 1) - i;
        aDouble1499 = ((double) k - aDouble1496) / d1;
        if (byte0 != 7)
            return;
        aDouble1500 = ((double) l - aDouble1497) / d1;
        aDouble1501 = Math.sqrt(aDouble1499 * aDouble1499 + aDouble1500 * aDouble1500);
        if (!aBoolean1495)
            aDouble1502 = -aDouble1501 * Math.tan((double) anInt1492 * 0.02454369D);
        aDouble1503 = (2D * ((double) j - aDouble1498 - aDouble1502 * d1)) / (d1 * d1);
    }

    public void method498(int i, boolean flag) {
        aBoolean1495 = true;
        aDouble1496 += aDouble1499 * (double) i;
        aDouble1497 += aDouble1500 * (double) i;
        aDouble1498 += aDouble1502 * (double) i + 0.5D * aDouble1503 * (double) i * (double) i;
        aDouble1502 += aDouble1503 * (double) i;
        anInt1504 = (int) (Math.atan2(aDouble1499, aDouble1500) * 325.94900000000001D) + 1024 & 0x7ff;
        if (!flag) {
            for (int j = 1; j > 0; j++) ;
        }
        anInt1505 = (int) (Math.atan2(aDouble1502, aDouble1501) * 325.94900000000001D) & 0x7ff;
        if (aClass32_1484.aClass26_551 != null)
            for (anInt1507 += i; anInt1507 > aClass32_1484.aClass26_551.method254(anInt1506, 41645); ) {
                anInt1507 -= aClass32_1484.aClass26_551.method254(anInt1506, 41645) + 1;
                anInt1506++;
                if (anInt1506 >= aClass32_1484.aClass26_551.anInt498)
                    anInt1506 = 0;
            }

    }

    public Class44_Sub3_Sub4_Sub4 method496(boolean flag) {
        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = aClass32_1484.method271();
        if (flag)
            anInt1482 = 341;
        if (class44_sub3_sub4_sub4 == null)
            return null;
        int i = -1;
        if (aClass32_1484.aClass26_551 != null)
            i = aClass32_1484.aClass26_551.anIntArray499[anInt1506];
        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4_1 = new Class44_Sub3_Sub4_Sub4(true, Class11.method211(i, 0), class44_sub3_sub4_sub4, true, false);
        if (i != -1) {
            class44_sub3_sub4_sub4_1.method510(9);
            class44_sub3_sub4_sub4_1.method511(i, -284);
            class44_sub3_sub4_sub4_1.anIntArrayArray1554 = null;
            class44_sub3_sub4_sub4_1.anIntArrayArray1553 = null;
        }
        if (aClass32_1484.anInt554 != 128 || aClass32_1484.anInt555 != 128)
            class44_sub3_sub4_sub4_1.method519(9, aClass32_1484.anInt554, aClass32_1484.anInt554, aClass32_1484.anInt555);
        class44_sub3_sub4_sub4_1.method515((byte) -44, anInt1505);
        class44_sub3_sub4_sub4_1.method520(64 + aClass32_1484.anInt557, 850 + aClass32_1484.anInt558, -30, -50, -30, true);
        return class44_sub3_sub4_sub4_1;
    }
}
