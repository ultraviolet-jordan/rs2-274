// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class1 {

    public static int anInt51;
    public int anInt38;
    public boolean aBoolean39;
    public int anInt40;
    public int[] anIntArray41;
    public int[] anIntArray42;
    public int anInt43;
    public int anInt44;
    public int anInt45;
    public int anInt46;
    public int anInt47;
    public int anInt48;
    public int anInt49;
    public int anInt50;
    public Class1() {
        anInt38 = 1;
        aBoolean39 = false;
    }

    public void method148(byte byte0, Class44_Sub3_Sub2 class44_sub3_sub2) {
        anInt45 = class44_sub3_sub2.get1();
        if (byte0 == 2)
            byte0 = 0;
        else
            aBoolean39 = !aBoolean39;
        anInt43 = class44_sub3_sub2.get4();
        anInt44 = class44_sub3_sub2.get4();
        method149(class44_sub3_sub2, 9);
    }

    public void method149(Class44_Sub3_Sub2 class44_sub3_sub2, int i) {
        if (i != 9)
            return;
        anInt40 = class44_sub3_sub2.get1();
        anIntArray41 = new int[anInt40];
        anIntArray42 = new int[anInt40];
        for (int j = 0; j < anInt40; j++) {
            anIntArray41[j] = class44_sub3_sub2.get2();
            anIntArray42[j] = class44_sub3_sub2.get2();
        }

    }

    public void method150(int i) {
        anInt46 = 0;
        anInt47 = 0;
        anInt48 = 0;
        anInt49 = 0;
        anInt50 = 0;
        if (i != 0)
            anInt38 = 193;
    }

    public int method151(byte byte0, int i) {
        if (byte0 != -7)
            return anInt38;
        if (anInt50 >= anInt46) {
            anInt49 = anIntArray42[anInt47++] << 15;
            if (anInt47 >= anInt40)
                anInt47 = anInt40 - 1;
            anInt46 = (int) (((double) anIntArray41[anInt47] / 65536D) * (double) i);
            if (anInt46 > anInt50)
                anInt48 = ((anIntArray42[anInt47] << 15) - anInt49) / (anInt46 - anInt50);
        }
        anInt49 += anInt48;
        anInt50++;
        return anInt49 - anInt48 >> 15;
    }
}
