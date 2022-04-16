// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import sign.signlink;

public class Class39 {

    public final int anInt674;
    public final boolean aBoolean675;
    public boolean aBoolean676;
    public int anInt677;
    public int anInt678;
    public final Class44_Sub3 aClass44_Sub3_679;
    public final int anInt680;
    public int anInt681;
    public final Class42 aClass42_682;
    public final Class31 aClass31_683;
    public Class39(int i, int j) {
        anInt674 = 7228;
        aBoolean675 = false;
        aBoolean676 = false;
        aClass44_Sub3_679 = new Class44_Sub3();
        aClass31_683 = new Class31((byte) 8);
        anInt680 = i;
        anInt681 = i;
        if (j != 0)
            aBoolean676 = !aBoolean676;
        aClass42_682 = new Class42(1024, anInt674);
    }

    public Class44_Sub3 method339(long l) {
        Class44_Sub3 class44_sub3 = (Class44_Sub3) aClass42_682.method380(l);
        if (class44_sub3 != null) {
            aClass31_683.method264(class44_sub3);
            anInt678++;
        } else {
            anInt677++;
        }
        return class44_sub3;
    }

    public void method340(int i, long l, Class44_Sub3 class44_sub3) {
        try {
            i = 72 / i;
            if (anInt681 == 0) {
                Class44_Sub3 class44_sub3_1 = aClass31_683.method265();
                class44_sub3_1.method404();
                class44_sub3_1.method405();
                if (class44_sub3_1 == aClass44_Sub3_679) {
                    Class44_Sub3 class44_sub3_2 = aClass31_683.method265();
                    class44_sub3_2.method404();
                    class44_sub3_2.method405();
                }
            } else {
                anInt681--;
            }
            aClass42_682.method381(true, l, class44_sub3);
            aClass31_683.method264(class44_sub3);
            return;
        } catch (RuntimeException runtimeexception) {
            signlink.reporterror("40450, " + i + ", " + l + ", " + class44_sub3 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method341() {
        do {
            Class44_Sub3 class44_sub3 = aClass31_683.method265();
            if (class44_sub3 != null) {
                class44_sub3.method404();
                class44_sub3.method405();
            } else {
                anInt681 = anInt680;
                return;
            }
        } while (true);
    }
}
