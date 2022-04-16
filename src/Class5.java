// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class5 {

    public static boolean aBoolean101;
    public static int anInt102;
    public static Class5[] aClass5Array103;
    public static final Class39 aClass39_165 = new Class39(30, 0);
    public static Class39 aClass39_166;
    public int[] anIntArray104;
    public int[] anIntArray105;
    public int anInt106;
    public int anInt107;
    public int anInt108;
    public int anInt109;
    public int anInt110;
    public int anInt111;
    public int anInt112;
    public int anInt113;
    public int anInt114;
    public byte aByte115;
    public int anInt116;
    public int anInt117;
    public int[][] anIntArrayArray118;
    public int[] anIntArray119;
    public int[] anIntArray120;
    public int anInt121;
    public int anInt122;
    public int anInt123;
    public boolean aBoolean124;
    public int[] anIntArray125;
    public int[] anIntArray126;
    public int[] anIntArray127;
    public int anInt128;
    public boolean aBoolean129;
    public boolean aBoolean130;
    public boolean aBoolean131;
    public boolean aBoolean132;
    public boolean aBoolean133;
    public int anInt134;
    public int anInt135;
    public Class44_Sub3_Sub1_Sub2[] aClass44_Sub3_Sub1_Sub2Array136;
    public int[] anIntArray137;
    public int[] anIntArray138;
    public String[] aStringArray139;
    public boolean aBoolean140;
    public boolean aBoolean141;
    public boolean aBoolean142;
    public Class44_Sub3_Sub1_Sub4 aClass44_Sub3_Sub1_Sub4_143;
    public String aString144;
    public String aString145;
    public int anInt146;
    public int anInt147;
    public int anInt148;
    public int anInt149;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_150;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_151;
    public int anInt152;
    public int anInt153;
    public int anInt154;
    public int anInt155;
    public int anInt156;
    public int anInt157;
    public int anInt158;
    public int anInt159;
    public int anInt160;
    public String aString161;
    public String aString162;
    public int anInt163;
    public String aString164;
    public Class5() {
    }

    public static void method181(Class47 class47, Class47 class47_1, Class44_Sub3_Sub1_Sub4[] aclass44_sub3_sub1_sub4, int i) {
        aClass39_166 = new Class39(50000, 0);
        Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(class47.method546("data", null), (byte) 1);
        int j;
        for (j = -1; i >= 0; )
            return;

        int k = class44_sub3_sub2.get2();
        aClass5Array103 = new Class5[k];
        while (class44_sub3_sub2.anInt1374 < class44_sub3_sub2.aByteArray1373.length) {
            int l = class44_sub3_sub2.get2();
            if (l == 65535) {
                j = class44_sub3_sub2.get2();
                l = class44_sub3_sub2.get2();
            }
            Class5 class5 = aClass5Array103[l] = new Class5();
            class5.anInt108 = l;
            class5.anInt109 = j;
            class5.anInt110 = class44_sub3_sub2.get1();
            class5.anInt111 = class44_sub3_sub2.get1();
            class5.anInt112 = class44_sub3_sub2.get2();
            class5.anInt113 = class44_sub3_sub2.get2();
            class5.anInt114 = class44_sub3_sub2.get2();
            class5.aByte115 = (byte) class44_sub3_sub2.get1();
            class5.anInt121 = class44_sub3_sub2.get1();
            if (class5.anInt121 != 0)
                class5.anInt121 = (class5.anInt121 - 1 << 8) + class44_sub3_sub2.get1();
            else
                class5.anInt121 = -1;
            int j1 = class44_sub3_sub2.get1();
            if (j1 > 0) {
                class5.anIntArray119 = new int[j1];
                class5.anIntArray120 = new int[j1];
                for (int k1 = 0; k1 < j1; k1++) {
                    class5.anIntArray119[k1] = class44_sub3_sub2.get1();
                    class5.anIntArray120[k1] = class44_sub3_sub2.get2();
                }

            }
            int l1 = class44_sub3_sub2.get1();
            if (l1 > 0) {
                class5.anIntArrayArray118 = new int[l1][];
                for (int i2 = 0; i2 < l1; i2++) {
                    int j3 = class44_sub3_sub2.get2();
                    class5.anIntArrayArray118[i2] = new int[j3];
                    for (int i5 = 0; i5 < j3; i5++)
                        class5.anIntArrayArray118[i2][i5] = class44_sub3_sub2.get2();

                }

            }
            if (class5.anInt110 == 0) {
                class5.anInt122 = class44_sub3_sub2.get2();
                class5.aBoolean124 = class44_sub3_sub2.get1() == 1;
                int j2 = class44_sub3_sub2.get2();
                class5.anIntArray125 = new int[j2];
                class5.anIntArray126 = new int[j2];
                class5.anIntArray127 = new int[j2];
                for (int k3 = 0; k3 < j2; k3++) {
                    class5.anIntArray125[k3] = class44_sub3_sub2.get2();
                    class5.anIntArray126[k3] = class44_sub3_sub2.get2Signed();
                    class5.anIntArray127[k3] = class44_sub3_sub2.get2Signed();
                }

            }
            if (class5.anInt110 == 1) {
                class5.anInt128 = class44_sub3_sub2.get2();
                class5.aBoolean129 = class44_sub3_sub2.get1() == 1;
            }
            if (class5.anInt110 == 2) {
                class5.anIntArray104 = new int[class5.anInt113 * class5.anInt114];
                class5.anIntArray105 = new int[class5.anInt113 * class5.anInt114];
                class5.aBoolean130 = class44_sub3_sub2.get1() == 1;
                class5.aBoolean131 = class44_sub3_sub2.get1() == 1;
                class5.aBoolean132 = class44_sub3_sub2.get1() == 1;
                class5.aBoolean133 = class44_sub3_sub2.get1() == 1;
                class5.anInt134 = class44_sub3_sub2.get1();
                class5.anInt135 = class44_sub3_sub2.get1();
                class5.anIntArray137 = new int[20];
                class5.anIntArray138 = new int[20];
                class5.aClass44_Sub3_Sub1_Sub2Array136 = new Class44_Sub3_Sub1_Sub2[20];
                for (int k2 = 0; k2 < 20; k2++) {
                    int l3 = class44_sub3_sub2.get1();
                    if (l3 == 1) {
                        class5.anIntArray137[k2] = class44_sub3_sub2.get2Signed();
                        class5.anIntArray138[k2] = class44_sub3_sub2.get2Signed();
                        String s1 = class44_sub3_sub2.getString();
                        if (class47_1 != null && s1.length() > 0) {
                            int j5 = s1.lastIndexOf(",");
                            class5.aClass44_Sub3_Sub1_Sub2Array136[k2] = method186(Integer.parseInt(s1.substring(j5 + 1)), true, s1.substring(0, j5), class47_1);
                        }
                    }
                }

                class5.aStringArray139 = new String[5];
                for (int i4 = 0; i4 < 5; i4++) {
                    class5.aStringArray139[i4] = class44_sub3_sub2.getString();
                    if (class5.aStringArray139[i4].length() == 0)
                        class5.aStringArray139[i4] = null;
                }

            }
            if (class5.anInt110 == 3)
                class5.aBoolean140 = class44_sub3_sub2.get1() == 1;
            if (class5.anInt110 == 4 || class5.anInt110 == 1) {
                class5.aBoolean141 = class44_sub3_sub2.get1() == 1;
                int l2 = class44_sub3_sub2.get1();
                if (aclass44_sub3_sub1_sub4 != null)
                    class5.aClass44_Sub3_Sub1_Sub4_143 = aclass44_sub3_sub1_sub4[l2];
                class5.aBoolean142 = class44_sub3_sub2.get1() == 1;
            }
            if (class5.anInt110 == 4) {
                class5.aString144 = class44_sub3_sub2.getString();
                class5.aString145 = class44_sub3_sub2.getString();
            }
            if (class5.anInt110 == 1 || class5.anInt110 == 3 || class5.anInt110 == 4)
                class5.anInt146 = class44_sub3_sub2.get4();
            if (class5.anInt110 == 3 || class5.anInt110 == 4) {
                class5.anInt147 = class44_sub3_sub2.get4();
                class5.anInt148 = class44_sub3_sub2.get4();
                class5.anInt149 = class44_sub3_sub2.get4();
            }
            if (class5.anInt110 == 5) {
                String s = class44_sub3_sub2.getString();
                if (class47_1 != null && s.length() > 0) {
                    int j4 = s.lastIndexOf(",");
                    class5.aClass44_Sub3_Sub1_Sub2_150 = method186(Integer.parseInt(s.substring(j4 + 1)), true, s.substring(0, j4), class47_1);
                }
                s = class44_sub3_sub2.getString();
                if (class47_1 != null && s.length() > 0) {
                    int k4 = s.lastIndexOf(",");
                    class5.aClass44_Sub3_Sub1_Sub2_151 = method186(Integer.parseInt(s.substring(k4 + 1)), true, s.substring(0, k4), class47_1);
                }
            }
            if (class5.anInt110 == 6) {
                int i1 = class44_sub3_sub2.get1();
                if (i1 != 0) {
                    class5.anInt152 = 1;
                    class5.anInt153 = (i1 - 1 << 8) + class44_sub3_sub2.get1();
                }
                i1 = class44_sub3_sub2.get1();
                if (i1 != 0) {
                    class5.anInt154 = 1;
                    class5.anInt155 = (i1 - 1 << 8) + class44_sub3_sub2.get1();
                }
                i1 = class44_sub3_sub2.get1();
                if (i1 != 0)
                    class5.anInt156 = (i1 - 1 << 8) + class44_sub3_sub2.get1();
                else
                    class5.anInt156 = -1;
                i1 = class44_sub3_sub2.get1();
                if (i1 != 0)
                    class5.anInt157 = (i1 - 1 << 8) + class44_sub3_sub2.get1();
                else
                    class5.anInt157 = -1;
                class5.anInt158 = class44_sub3_sub2.get2();
                class5.anInt159 = class44_sub3_sub2.get2();
                class5.anInt160 = class44_sub3_sub2.get2();
            }
            if (class5.anInt110 == 7) {
                class5.anIntArray104 = new int[class5.anInt113 * class5.anInt114];
                class5.anIntArray105 = new int[class5.anInt113 * class5.anInt114];
                class5.aBoolean141 = class44_sub3_sub2.get1() == 1;
                int i3 = class44_sub3_sub2.get1();
                if (aclass44_sub3_sub1_sub4 != null)
                    class5.aClass44_Sub3_Sub1_Sub4_143 = aclass44_sub3_sub1_sub4[i3];
                class5.aBoolean142 = class44_sub3_sub2.get1() == 1;
                class5.anInt146 = class44_sub3_sub2.get4();
                class5.anInt134 = class44_sub3_sub2.get2Signed();
                class5.anInt135 = class44_sub3_sub2.get2Signed();
                class5.aBoolean131 = class44_sub3_sub2.get1() == 1;
                class5.aStringArray139 = new String[5];
                for (int l4 = 0; l4 < 5; l4++) {
                    class5.aStringArray139[l4] = class44_sub3_sub2.getString();
                    if (class5.aStringArray139[l4].length() == 0)
                        class5.aStringArray139[l4] = null;
                }

            }
            if (class5.anInt111 == 2 || class5.anInt110 == 2) {
                class5.aString161 = class44_sub3_sub2.getString();
                class5.aString162 = class44_sub3_sub2.getString();
                class5.anInt163 = class44_sub3_sub2.get2();
            }
            if (class5.anInt111 == 1 || class5.anInt111 == 4 || class5.anInt111 == 5 || class5.anInt111 == 6) {
                class5.aString164 = class44_sub3_sub2.getString();
                if (class5.aString164.length() == 0) {
                    if (class5.anInt111 == 1)
                        class5.aString164 = "Ok";
                    if (class5.anInt111 == 4)
                        class5.aString164 = "Select";
                    if (class5.anInt111 == 5)
                        class5.aString164 = "Select";
                    if (class5.anInt111 == 6)
                        class5.aString164 = "Continue";
                }
            }
        }
        aClass39_166 = null;
    }

    public static void method185(int i, int j, Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4, int k) {
        aClass39_165.method341();
        if (i != 0)
            anInt102 = 86;
        if (class44_sub3_sub4_sub4 != null && k != 4)
            aClass39_165.method340(201, (k << 16) + j, class44_sub3_sub4_sub4);
    }

    public static Class44_Sub3_Sub1_Sub2 method186(int i, boolean flag, String s, Class47 class47) {
        long l = (Class48.method549(7, s) << 8) + (long) i;
        if (!flag)
            aBoolean101 = !aBoolean101;
        Class44_Sub3_Sub1_Sub2 class44_sub3_sub1_sub2 = (Class44_Sub3_Sub1_Sub2) aClass39_166.method339(l);
        if (class44_sub3_sub1_sub2 != null)
            return class44_sub3_sub1_sub2;
        try {
            class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(class47, s, i);
            aClass39_166.method340(201, l, class44_sub3_sub1_sub2);
        } catch (Exception _ex) {
            return null;
        }
        return class44_sub3_sub1_sub2;
    }

    public void method182(int i, int j, int k) {
        int l = anIntArray104[i];
        anIntArray104[i] = anIntArray104[j];
        anIntArray104[j] = l;
        l = anIntArray105[i];
        k = 66 / k;
        anIntArray105[i] = anIntArray105[j];
        anIntArray105[j] = l;
    }

    public Class44_Sub3_Sub4_Sub4 method183(int i, int j, int k, boolean flag) {
        if (k <= 0)
            throw new NullPointerException();
        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4;
        if (flag)
            class44_sub3_sub4_sub4 = method184(anInt154, anInt155);
        else
            class44_sub3_sub4_sub4 = method184(anInt152, anInt153);
        if (class44_sub3_sub4_sub4 == null)
            return null;
        if (i == -1 && j == -1 && class44_sub3_sub4_sub4.anIntArray1536 == null)
            return class44_sub3_sub4_sub4;
        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4_1 = new Class44_Sub3_Sub4_Sub4(true, Class11.method211(i, 0) & Class11.method211(j, 0), class44_sub3_sub4_sub4, true, false);
        if (i != -1 || j != -1)
            class44_sub3_sub4_sub4_1.method510(9);
        if (i != -1)
            class44_sub3_sub4_sub4_1.method511(i, -284);
        if (j != -1)
            class44_sub3_sub4_sub4_1.method511(j, -284);
        class44_sub3_sub4_sub4_1.method520(64, 768, -50, -10, -50, true);
        return class44_sub3_sub4_sub4_1;
    }

    public Class44_Sub3_Sub4_Sub4 method184(int i, int j) {
        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = (Class44_Sub3_Sub4_Sub4) aClass39_165.method339((i << 16) + j);
        if (class44_sub3_sub4_sub4 != null)
            return class44_sub3_sub4_sub4;
        if (i == 1)
            class44_sub3_sub4_sub4 = Class44_Sub3_Sub4_Sub4.method503(j, 6);
        if (i == 2)
            class44_sub3_sub4_sub4 = Class12.method214(j).method217((byte) 0);
        if (i == 3)
            class44_sub3_sub4_sub4 = client.aClass44_Sub3_Sub4_Sub6_Sub1_1252.method536(true);
        if (i == 4)
            class44_sub3_sub4_sub4 = Class14.method220(j).method225((byte) 7, 50);
        if (i == 5)
            class44_sub3_sub4_sub4 = null;
        if (class44_sub3_sub4_sub4 != null)
            aClass39_165.method340(201, (i << 16) + j, class44_sub3_sub4_sub4);
        return class44_sub3_sub4_sub4;
    }

}
