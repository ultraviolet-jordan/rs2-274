// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class8 {

    public static int anInt212;
    public static int[] anIntArray213;
    public static Class44_Sub3_Sub2 aClass44_Sub3_Sub2_214;
    public static Class8[] aClass8Array215;
    public static int anInt216;
    public static final Class44_Sub3_Sub4_Sub4[] aClass44_Sub3_Sub4_Sub4Array217 = new Class44_Sub3_Sub4_Sub4[4];
    public static Class39 aClass39_252 = new Class39(500, 0);
    public static Class39 aClass39_253 = new Class39(30, 0);
    public final int anInt207;
    public final boolean aBoolean208;
    public int anInt209;
    public boolean aBoolean210;
    public int anInt211;
    public int anInt218;
    public int[] anIntArray219;
    public int[] anIntArray220;
    public String aString221;
    public byte[] aByteArray222;
    public int[] anIntArray223;
    public int[] anIntArray224;
    public int anInt225;
    public int anInt226;
    public boolean aBoolean227;
    public boolean aBoolean228;
    public boolean aBoolean229;
    public boolean aBoolean230;
    public boolean aBoolean231;
    public boolean aBoolean232;
    public int anInt233;
    public int anInt234;
    public byte aByte235;
    public byte aByte236;
    public String[] aStringArray237;
    public int anInt238;
    public int anInt239;
    public boolean aBoolean240;
    public boolean aBoolean241;
    public int anInt242;
    public int anInt243;
    public int anInt244;
    public int anInt245;
    public int anInt246;
    public int anInt247;
    public int anInt248;
    public boolean aBoolean249;
    public boolean aBoolean250;
    public int anInt251;
    public Class8() {
        anInt207 = -32952;
        aBoolean208 = false;
        aBoolean210 = false;
        anInt218 = -1;
    }

    public static void method197(Class47 class47) {
        aClass44_Sub3_Sub2_214 = new Class44_Sub3_Sub2(class47.method546("loc.dat", null), (byte) 1);
        Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(class47.method546("loc.idx", null), (byte) 1);
        anInt212 = class44_sub3_sub2.get2();
        anIntArray213 = new int[anInt212];
        int i = 2;
        for (int j = 0; j < anInt212; j++) {
            anIntArray213[j] = i;
            i += class44_sub3_sub2.get2();
        }

        aClass8Array215 = new Class8[10];
        for (int k = 0; k < 10; k++)
            aClass8Array215[k] = new Class8();

    }

    public static void method198(byte byte0) {
        aClass39_252 = null;
        aClass39_253 = null;
        anIntArray213 = null;
        aClass8Array215 = null;
        aClass44_Sub3_Sub2_214 = null;
        if (byte0 == 1) {
            byte0 = 0;
            return;
        }
        for (int i = 1; i > 0; i++) ;
    }

    public static Class8 method199(int i) {
        for (int j = 0; j < 10; j++)
            if (aClass8Array215[j].anInt218 == i)
                return aClass8Array215[j];

        anInt216 = (anInt216 + 1) % 10;
        Class8 class8 = aClass8Array215[anInt216];
        aClass44_Sub3_Sub2_214.anInt1374 = anIntArray213[i];
        class8.anInt218 = i;
        class8.method200();
        class8.method201((byte) 2, aClass44_Sub3_Sub2_214);
        return class8;
    }

    public void method200() {
        anIntArray219 = null;
        anIntArray220 = null;
        aString221 = null;
        aByteArray222 = null;
        anIntArray223 = null;
        anIntArray224 = null;
        anInt225 = 1;
        anInt226 = 1;
        aBoolean227 = true;
        aBoolean228 = true;
        aBoolean229 = false;
        aBoolean230 = false;
        aBoolean231 = false;
        aBoolean232 = false;
        anInt233 = -1;
        anInt234 = 16;
        aByte235 = 0;
        aByte236 = 0;
        aStringArray237 = null;
        anInt238 = -1;
        anInt239 = -1;
        aBoolean240 = false;
        aBoolean241 = true;
        anInt242 = 128;
        anInt243 = 128;
        anInt244 = 128;
        anInt248 = 0;
        anInt245 = 0;
        anInt246 = 0;
        anInt247 = 0;
        aBoolean249 = false;
        aBoolean250 = false;
        anInt251 = -1;
    }

    public void method201(byte byte0, Class44_Sub3_Sub2 class44_sub3_sub2) {
        if (byte0 == 2)
            byte0 = 0;
        else
            anInt211 = -350;
        int i = -1;
        do {
            int j = class44_sub3_sub2.get1();
            if (j == 0)
                break;
            if (j == 1) {
                int k = class44_sub3_sub2.get1();
                if (k > 0) {
                    anIntArray220 = new int[k];
                    anIntArray219 = new int[k];
                    for (int j1 = 0; j1 < k; j1++) {
                        anIntArray219[j1] = class44_sub3_sub2.get2();
                        anIntArray220[j1] = class44_sub3_sub2.get1();
                    }

                }
            } else if (j == 2)
                aString221 = class44_sub3_sub2.getString();
            else if (j == 3)
                aByteArray222 = class44_sub3_sub2.getStringArray(anInt207);
            else if (j == 5) {
                int l = class44_sub3_sub2.get1();
                if (l > 0) {
                    anIntArray220 = null;
                    anIntArray219 = new int[l];
                    for (int k1 = 0; k1 < l; k1++)
                        anIntArray219[k1] = class44_sub3_sub2.get2();

                }
            } else if (j == 14)
                anInt225 = class44_sub3_sub2.get1();
            else if (j == 15)
                anInt226 = class44_sub3_sub2.get1();
            else if (j == 17)
                aBoolean227 = false;
            else if (j == 18)
                aBoolean228 = false;
            else if (j == 19) {
                i = class44_sub3_sub2.get1();
                if (i == 1)
                    aBoolean229 = true;
            } else if (j == 21)
                aBoolean230 = true;
            else if (j == 22)
                aBoolean231 = true;
            else if (j == 23)
                aBoolean232 = true;
            else if (j == 24) {
                anInt233 = class44_sub3_sub2.get2();
                if (anInt233 == 65535)
                    anInt233 = -1;
            } else if (j == 28)
                anInt234 = class44_sub3_sub2.get1();
            else if (j == 29)
                aByte235 = class44_sub3_sub2.get1Signed();
            else if (j == 39)
                aByte236 = class44_sub3_sub2.get1Signed();
            else if (j >= 30 && j < 39) {
                if (aStringArray237 == null)
                    aStringArray237 = new String[5];
                aStringArray237[j - 30] = class44_sub3_sub2.getString();
                if (aStringArray237[j - 30].equalsIgnoreCase("hidden"))
                    aStringArray237[j - 30] = null;
            } else if (j == 40) {
                int i1 = class44_sub3_sub2.get1();
                anIntArray223 = new int[i1];
                anIntArray224 = new int[i1];
                for (int l1 = 0; l1 < i1; l1++) {
                    anIntArray223[l1] = class44_sub3_sub2.get2();
                    anIntArray224[l1] = class44_sub3_sub2.get2();
                }

            } else if (j == 60)
                anInt238 = class44_sub3_sub2.get2();
            else if (j == 62)
                aBoolean240 = true;
            else if (j == 64)
                aBoolean241 = false;
            else if (j == 65)
                anInt242 = class44_sub3_sub2.get2();
            else if (j == 66)
                anInt243 = class44_sub3_sub2.get2();
            else if (j == 67)
                anInt244 = class44_sub3_sub2.get2();
            else if (j == 68)
                anInt239 = class44_sub3_sub2.get2();
            else if (j == 69)
                anInt248 = class44_sub3_sub2.get1();
            else if (j == 70)
                anInt245 = class44_sub3_sub2.get2Signed();
            else if (j == 71)
                anInt246 = class44_sub3_sub2.get2Signed();
            else if (j == 72)
                anInt247 = class44_sub3_sub2.get2Signed();
            else if (j == 73)
                aBoolean249 = true;
            else if (j == 74)
                aBoolean250 = true;
            else if (j == 75)
                anInt251 = class44_sub3_sub2.get1();
        } while (true);
        if (i == -1) {
            aBoolean229 = anIntArray219 != null && (anIntArray220 == null || anIntArray220[0] == 10);
            if (aStringArray237 != null)
                aBoolean229 = true;
        }
        if (aBoolean250) {
            aBoolean227 = false;
            aBoolean228 = false;
        }
        if (anInt251 == -1)
            anInt251 = aBoolean227 ? 1 : 0;
    }

    public boolean method202(int i, int j) {
        if (i != 0) {
            for (int k = 1; k > 0; k++) ;
        }
        if (anIntArray220 == null) {
            if (anIntArray219 == null)
                return true;
            if (j != 10)
                return true;
            boolean flag = true;
            for (int k : anIntArray219) flag &= Class44_Sub3_Sub4_Sub4.method504(k & 0xffff);

            return flag;
        }
        for (int l = 0; l < anIntArray220.length; l++)
            if (anIntArray220[l] == j)
                return Class44_Sub3_Sub4_Sub4.method504(anIntArray219[l] & 0xffff);

        return true;
    }

    public boolean method203(boolean flag) {
        if (anIntArray219 == null)
            return true;
        boolean flag1 = true;
        if (!flag)
            anInt209 = 308;
        for (int j : anIntArray219) flag1 &= Class44_Sub3_Sub4_Sub4.method504(j & 0xffff);

        return flag1;
    }

    public void method204(byte byte0, Class43_Sub1 class43_sub1) {
        if (anIntArray219 == null)
            return;
        for (int j : anIntArray219) class43_sub1.method397(-21322, 0, j & 0xffff);

        if (byte0 != 0)
            aBoolean210 = !aBoolean210;
    }

    public Class44_Sub3_Sub4_Sub4 method205(int i, int j, int k, int l, int i1, int j1, int k1) {
        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = method206(j, false, k1, i);
        if (class44_sub3_sub4_sub4 == null)
            return null;
        if (aBoolean230 || aBoolean231)
            class44_sub3_sub4_sub4 = new Class44_Sub3_Sub4_Sub4(aBoolean231, (byte) 72, class44_sub3_sub4_sub4, aBoolean230);
        if (aBoolean230) {
            int l1 = (k + l + i1 + j1) / 4;
            for (int i2 = 0; i2 < class44_sub3_sub4_sub4.anInt1522; i2++) {
                int j2 = class44_sub3_sub4_sub4.anIntArray1523[i2];
                int k2 = class44_sub3_sub4_sub4.anIntArray1525[i2];
                int l2 = k + ((l - k) * (j2 + 64)) / 128;
                int i3 = j1 + ((i1 - j1) * (j2 + 64)) / 128;
                int j3 = l2 + ((i3 - l2) * (k2 + 64)) / 128;
                class44_sub3_sub4_sub4.anIntArray1524[i2] += j3 - l1;
            }

            class44_sub3_sub4_sub4.method508(368);
        }
        return class44_sub3_sub4_sub4;
    }

    public Class44_Sub3_Sub4_Sub4 method206(int i, boolean flag, int j, int k) {
        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = null;
        long l;
        if (anIntArray220 == null) {
            if (k != 10)
                return null;
            l = (long) ((anInt218 << 6) + i) + ((long) (j + 1) << 32);
            Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4_1 = (Class44_Sub3_Sub4_Sub4) aClass39_253.method339(l);
            if (class44_sub3_sub4_sub4_1 != null)
                return class44_sub3_sub4_sub4_1;
            if (anIntArray219 == null)
                return null;
            boolean flag2 = aBoolean240 ^ (i > 3);
            int k1 = anIntArray219.length;
            for (int l1 = 0; l1 < k1; l1++) {
                int k2 = anIntArray219[l1];
                if (flag2)
                    k2 += 0x10000;
                class44_sub3_sub4_sub4 = (Class44_Sub3_Sub4_Sub4) aClass39_252.method339(k2);
                if (class44_sub3_sub4_sub4 == null) {
                    class44_sub3_sub4_sub4 = Class44_Sub3_Sub4_Sub4.method503(k2 & 0xffff, 6);
                    if (class44_sub3_sub4_sub4 == null)
                        return null;
                    if (flag2)
                        class44_sub3_sub4_sub4.method518(2);
                    aClass39_252.method340(201, k2, class44_sub3_sub4_sub4);
                }
                if (k1 > 1)
                    aClass44_Sub3_Sub4_Sub4Array217[l1] = class44_sub3_sub4_sub4;
            }

            if (k1 > 1)
                class44_sub3_sub4_sub4 = new Class44_Sub3_Sub4_Sub4(k1, -643, aClass44_Sub3_Sub4_Sub4Array217);
        } else {
            int i1 = -1;
            for (int j1 = 0; j1 < anIntArray220.length; j1++) {
                if (anIntArray220[j1] != k)
                    continue;
                i1 = j1;
                break;
            }

            if (i1 == -1)
                return null;
            l = (long) ((anInt218 << 6) + (i1 << 3) + i) + ((long) (j + 1) << 32);
            Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4_2 = (Class44_Sub3_Sub4_Sub4) aClass39_253.method339(l);
            if (class44_sub3_sub4_sub4_2 != null)
                return class44_sub3_sub4_sub4_2;
            int i2 = anIntArray219[i1];
            boolean flag4 = aBoolean240 ^ (i > 3);
            if (flag4)
                i2 += 0x10000;
            class44_sub3_sub4_sub4 = (Class44_Sub3_Sub4_Sub4) aClass39_252.method339(i2);
            if (class44_sub3_sub4_sub4 == null) {
                class44_sub3_sub4_sub4 = Class44_Sub3_Sub4_Sub4.method503(i2 & 0xffff, 6);
                if (class44_sub3_sub4_sub4 == null)
                    return null;
                if (flag4)
                    class44_sub3_sub4_sub4.method518(2);
                aClass39_252.method340(201, i2, class44_sub3_sub4_sub4);
            }
        }
        boolean flag1;
        flag1 = anInt242 != 128 || anInt243 != 128 || anInt244 != 128;
        boolean flag3;
        flag3 = anInt245 != 0 || anInt246 != 0 || anInt247 != 0;
        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4_3 = new Class44_Sub3_Sub4_Sub4(anIntArray223 == null, Class11.method211(j, 0), class44_sub3_sub4_sub4, true, i == 0 && j == -1 && !flag1 && !flag3);
        if (j != -1) {
            class44_sub3_sub4_sub4_3.method510(9);
            class44_sub3_sub4_sub4_3.method511(j, -284);
            class44_sub3_sub4_sub4_3.anIntArrayArray1554 = null;
            class44_sub3_sub4_sub4_3.anIntArrayArray1553 = null;
        }
        while (i-- > 0)
            class44_sub3_sub4_sub4_3.method514((byte) 89);
        if (anIntArray223 != null) {
            for (int j2 = 0; j2 < anIntArray223.length; j2++)
                class44_sub3_sub4_sub4_3.method517(anIntArray223[j2], anIntArray224[j2]);

        }
        if (flag1)
            class44_sub3_sub4_sub4_3.method519(9, anInt244, anInt242, anInt243);
        if (flag3)
            class44_sub3_sub4_sub4_3.method516(anInt245, anInt246, (byte) 10, anInt247);
        class44_sub3_sub4_sub4_3.method520(64 + aByte235, 768 + aByte236 * 5, -50, -10, -50, !aBoolean231);
        if (anInt251 == 1)
            class44_sub3_sub4_sub4_3.anInt1550 = class44_sub3_sub4_sub4_3.anInt1394;
        aClass39_253.method340(201, l, class44_sub3_sub4_sub4_3);
        if (flag)
            throw new NullPointerException();
        else
            return class44_sub3_sub4_sub4_3;
    }

}
