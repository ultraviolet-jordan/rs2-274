// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class35 {

    public static final byte aByte577 = 6;
    public static boolean aBoolean578 = true;
    public static int anInt579;
    public static Class35[] aClass35Array580;
    public String aString581;
    public int anInt582;
    public int anInt583;
    public int anInt584;
    public Class35() {
    }

    public static void method275(boolean flag, Class47 class47) {
        Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(class47.method546("varbit.dat", null), (byte) 1);
        anInt579 = class44_sub3_sub2.get2();
        if (flag)
            aBoolean578 = !aBoolean578;
        if (aClass35Array580 == null)
            aClass35Array580 = new Class35[anInt579];
        for (int i = 0; i < anInt579; i++) {
            if (aClass35Array580[i] == null)
                aClass35Array580[i] = new Class35();
            aClass35Array580[i].method276(class44_sub3_sub2, aByte577, i);
        }

        if (class44_sub3_sub2.anInt1374 != class44_sub3_sub2.aByteArray1373.length)
            System.out.println("varbit load mismatch");
    }

    public void method276(Class44_Sub3_Sub2 class44_sub3_sub2, byte byte0, int i) {
        if (byte0 != 6) {
            for (int j = 1; j > 0; j++) ;
        }
        do {
            int k = class44_sub3_sub2.get1();
            if (k == 0)
                return;
            if (k == 1) {
                anInt582 = class44_sub3_sub2.get2();
                anInt583 = class44_sub3_sub2.get1();
                anInt584 = class44_sub3_sub2.get1();
            } else if (k == 10)
                aString581 = class44_sub3_sub2.getString();
            else
                System.out.println("Error unrecognised config code: " + k);
        } while (true);
    }

}
