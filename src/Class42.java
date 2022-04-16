// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import sign.signlink;

public class Class42 {

    public int anInt753;
    public final int anInt754;
    public final byte aByte755;
    public final boolean aBoolean756;
    public final int anInt757;
    public final Class44[] aClass44Array758;
    public Class42(int i, int j) {
        anInt753 = 7;
        anInt754 = 7228;
        aByte755 = 0;
        aBoolean756 = false;
        anInt757 = i;
        if (j != anInt754)
            anInt753 = 236;
        aClass44Array758 = new Class44[i];
        for (int k = 0; k < i; k++) {
            Class44 class44 = aClass44Array758[k] = new Class44();
            class44.aClass44_761 = class44;
            class44.aClass44_762 = class44;
        }

    }

    public Class44 method380(long l) {
        Class44 class44 = aClass44Array758[(int) (l & (long) (anInt757 - 1))];
        for (Class44 class44_1 = class44.aClass44_761; class44_1 != class44; class44_1 = class44_1.aClass44_761)
            if (class44_1.aLong760 == l)
                return class44_1;

        return null;
    }

    public void method381(boolean flag, long l, Class44 class44) {
        try {
            if (!flag)
                return;
            if (class44.aClass44_762 != null)
                class44.method404();
            Class44 class44_1 = aClass44Array758[(int) (l & (long) (anInt757 - 1))];
            class44.aClass44_762 = class44_1.aClass44_762;
            class44.aClass44_761 = class44_1;
            class44.aClass44_762.aClass44_761 = class44;
            class44.aClass44_761.aClass44_762 = class44;
            class44.aLong760 = l;
            return;
        } catch (RuntimeException runtimeexception) {
            signlink.reporterror("89767, " + flag + ", " + l + ", " + class44 + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }
}
