// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class31 {

    public boolean aBoolean542;
    public final Class44_Sub3 aClass44_Sub3_543;
    public Class44_Sub3 aClass44_Sub3_544;

    public Class31(byte byte0) {
        aBoolean542 = true;
        aClass44_Sub3_543 = new Class44_Sub3();
        if (byte0 == 8)
            byte0 = 0;
        else
            throw new NullPointerException();
        aClass44_Sub3_543.aClass44_Sub3_1345 = aClass44_Sub3_543;
        aClass44_Sub3_543.aClass44_Sub3_1346 = aClass44_Sub3_543;
    }

    public void method264(Class44_Sub3 class44_sub3) {
        if (class44_sub3.aClass44_Sub3_1346 != null)
            class44_sub3.method405();
        class44_sub3.aClass44_Sub3_1346 = aClass44_Sub3_543.aClass44_Sub3_1346;
        class44_sub3.aClass44_Sub3_1345 = aClass44_Sub3_543;
        class44_sub3.aClass44_Sub3_1346.aClass44_Sub3_1345 = class44_sub3;
        class44_sub3.aClass44_Sub3_1345.aClass44_Sub3_1346 = class44_sub3;
    }

    public Class44_Sub3 method265() {
        Class44_Sub3 class44_sub3 = aClass44_Sub3_543.aClass44_Sub3_1345;
        if (class44_sub3 == aClass44_Sub3_543) {
            return null;
        } else {
            class44_sub3.method405();
            return class44_sub3;
        }
    }

    public Class44_Sub3 method266() {
        Class44_Sub3 class44_sub3 = aClass44_Sub3_543.aClass44_Sub3_1345;
        if (class44_sub3 == aClass44_Sub3_543) {
            aClass44_Sub3_544 = null;
            return null;
        } else {
            aClass44_Sub3_544 = class44_sub3.aClass44_Sub3_1345;
            return class44_sub3;
        }
    }

    public Class44_Sub3 method267(byte byte0) {
        Class44_Sub3 class44_sub3 = aClass44_Sub3_544;
        if (class44_sub3 == aClass44_Sub3_543) {
            aClass44_Sub3_544 = null;
            return null;
        }
        aClass44_Sub3_544 = class44_sub3.aClass44_Sub3_1345;
        if (byte0 == 0)
            byte0 = 0;
        else
            aBoolean542 = !aBoolean542;
        return class44_sub3;
    }

    public int method268() {
        int i = 0;
        for (Class44_Sub3 class44_sub3 = aClass44_Sub3_543.aClass44_Sub3_1345; class44_sub3 != aClass44_Sub3_543; class44_sub3 = class44_sub3.aClass44_Sub3_1345)
            i++;

        return i;
    }
}
