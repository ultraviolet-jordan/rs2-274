// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class41 {

    public static final String[] aStringArray751 = {
            "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs"
    };
    public static boolean aBoolean732;
    public static int anInt733 = -226;
    public static int anInt734;
    public static boolean aBoolean735 = true;
    public static int anInt736;
    public static final int anInt737 = -484;
    public static boolean aBoolean738;
    public static final int anInt739 = 9;
    public static int anInt740;
    public static final byte aByte741 = -17;
    public static int anInt742 = 5;
    public static boolean aBoolean743;
    public static int anInt744 = 443;
    public static int[] anIntArray745;
    public static char[][] aCharArrayArray746;
    public static byte[][][] aByteArrayArrayArray747;
    public static char[][] aCharArrayArray748;
    public static char[][] aCharArrayArray749;
    public static int[] anIntArray750;
    public static int anInt752;

    public static void method342(Class47 class47) {
        Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(class47.method546("fragmentsenc.txt", null), (byte) 1);
        Class44_Sub3_Sub2 class44_sub3_sub2_1 = new Class44_Sub3_Sub2(class47.method546("badenc.txt", null), (byte) 1);
        Class44_Sub3_Sub2 class44_sub3_sub2_2 = new Class44_Sub3_Sub2(class47.method546("domainenc.txt", null), (byte) 1);
        Class44_Sub3_Sub2 class44_sub3_sub2_3 = new Class44_Sub3_Sub2(class47.method546("tldlist.txt", null), (byte) 1);
        method343(class44_sub3_sub2, class44_sub3_sub2_1, class44_sub3_sub2_2, class44_sub3_sub2_3);
    }

    public static void method343(Class44_Sub3_Sub2 class44_sub3_sub2, Class44_Sub3_Sub2 class44_sub3_sub2_1, Class44_Sub3_Sub2 class44_sub3_sub2_2, Class44_Sub3_Sub2 class44_sub3_sub2_3) {
        method345(804, class44_sub3_sub2_1);
        method346(class44_sub3_sub2_2, false);
        method347(-534, class44_sub3_sub2);
        method344(class44_sub3_sub2_3, (byte) 14);
    }

    public static void method344(Class44_Sub3_Sub2 class44_sub3_sub2, byte byte0) {
        int i = class44_sub3_sub2.get4();
        if (byte0 != 14)
            anInt744 = 297;
        aCharArrayArray749 = new char[i][];
        anIntArray750 = new int[i];
        for (int j = 0; j < i; j++) {
            anIntArray750[j] = class44_sub3_sub2.get1();
            char[] ac = new char[class44_sub3_sub2.get1()];
            for (int k = 0; k < ac.length; k++)
                ac[k] = (char) class44_sub3_sub2.get1();

            aCharArrayArray749[j] = ac;
        }

    }

    public static void method345(int i, Class44_Sub3_Sub2 class44_sub3_sub2) {
        int j = class44_sub3_sub2.get4();
        aCharArrayArray746 = new char[j][];
        aByteArrayArrayArray747 = new byte[j][][];
        i = 88 / i;
        method348(class44_sub3_sub2, aByteArrayArrayArray747, aCharArrayArray746, false);
    }

    public static void method346(Class44_Sub3_Sub2 class44_sub3_sub2, boolean flag) {
        if (flag)
            aBoolean743 = !aBoolean743;
        int i = class44_sub3_sub2.get4();
        aCharArrayArray748 = new char[i][];
        method349(false, aCharArrayArray748, class44_sub3_sub2);
    }

    public static void method347(int i, Class44_Sub3_Sub2 class44_sub3_sub2) {
        if (i >= 0) {
            for (int j = 1; j > 0; j++) ;
        }
        anIntArray745 = new int[class44_sub3_sub2.get4()];
        for (int k = 0; k < anIntArray745.length; k++)
            anIntArray745[k] = class44_sub3_sub2.get2();

    }

    public static void method348(Class44_Sub3_Sub2 class44_sub3_sub2, byte[][][] abyte0, char[][] ac, boolean flag) {
        for (int i = 0; i < ac.length; i++) {
            char[] ac1 = new char[class44_sub3_sub2.get1()];
            for (int j = 0; j < ac1.length; j++)
                ac1[j] = (char) class44_sub3_sub2.get1();

            ac[i] = ac1;
            byte[][] abyte1 = new byte[class44_sub3_sub2.get1()][2];
            for (int k = 0; k < abyte1.length; k++) {
                abyte1[k][0] = (byte) class44_sub3_sub2.get1();
                abyte1[k][1] = (byte) class44_sub3_sub2.get1();
            }

            if (abyte1.length > 0)
                abyte0[i] = abyte1;
        }

        if (!flag) ;
    }

    public static void method349(boolean flag, char[][] ac, Class44_Sub3_Sub2 class44_sub3_sub2) {
        for (int i = 0; i < ac.length; i++) {
            char[] ac1 = new char[class44_sub3_sub2.get1()];
            for (int j = 0; j < ac1.length; j++)
                ac1[j] = (char) class44_sub3_sub2.get1();

            ac[i] = ac1;
        }

        if (flag)
            anInt744 = 35;
    }

    public static void method350(char[] ac, int i) {
        int j = 0;
        for (int k = 0; k < ac.length; k++) {
            if (method351(ac[k], 0))
                ac[j] = ac[k];
            else
                ac[j] = ' ';
            if (j == 0 || ac[j] != ' ' || ac[j - 1] != ' ')
                j++;
        }

        while (i >= 0)
            aBoolean735 = !aBoolean735;
        for (int l = j; l < ac.length; l++)
            ac[l] = ' ';

    }

    public static boolean method351(char c, int i) {
        if (i != 0)
            aBoolean735 = !aBoolean735;
        return c >= ' ' && c <= '\177' || c == ' ' || c == '\n' || c == '\t' || c == '\243' || c == '\u20AC';
    }

    public static String method352(byte byte0, String s) {
        long l = System.currentTimeMillis();
        char[] ac = s.toCharArray();
        method350(ac, -59);
        String s1 = (new String(ac)).trim();
        ac = s1.toLowerCase().toCharArray();
        String s2 = s1.toLowerCase();
        method360(true, ac);
        method355(ac, (byte) 6);
        if (byte0 != 3)
            anInt736 = -446;
        method356(ac, (byte) 5);
        method369(ac, 9);
        for (String value : aStringArray751) {
            for (int j = -1; (j = s2.indexOf(value, j + 1)) != -1; ) {
                char[] ac1 = value.toCharArray();
                System.arraycopy(ac1, 0, ac, j, ac1.length);

            }

        }

        method353(ac, s1.toCharArray(), -51);
        method354((byte) 7, ac);
        long l1 = System.currentTimeMillis();
        return (new String(ac)).trim();
    }

    public static void method353(char[] ac, char[] ac1, int i) {
        if (i >= 0)
            return;
        for (int j = 0; j < ac1.length; j++)
            if (ac[j] != '*' && method377(anInt742, ac1[j]))
                ac[j] = ac1[j];

    }

    public static void method354(byte byte0, char[] ac) {
        boolean flag = true;
        if (byte0 == 7) {
            byte0 = 0;
        } else {
            for (int i = 1; i > 0; i++) ;
        }
        for (int j = 0; j < ac.length; j++) {
            char c = ac[j];
            if (method374(aByte741, c)) {
                if (flag) {
                    if (method376(0, c))
                        flag = false;
                } else if (method377(anInt742, c))
                    ac[j] = (char) ((c + 97) - 65);
            } else {
                flag = true;
            }
        }

    }

    public static void method355(char[] ac, byte byte0) {
        for (int i = 0; i < 2; i++) {
            for (int j = aCharArrayArray746.length - 1; j >= 0; j--)
                method364(ac, aCharArrayArray746[j], 3, aByteArrayArrayArray747[j]);

        }

        if (byte0 == 6) {
            byte0 = 0;
            return;
        }
        for (int k = 1; k > 0; k++) ;
    }

    public static void method356(char[] ac, byte byte0) {
        char[] ac1 = ac.clone();
        if (byte0 != 5)
            anInt733 = 219;
        char[] ac2 = {
                '(', 'a', ')'
        };
        method364(ac1, ac2, 3, null);
        char[] ac3 = ac.clone();
        char[] ac4 = {
                'd', 'o', 't'
        };
        method364(ac3, ac4, 3, null);
        for (int i = aCharArrayArray748.length - 1; i >= 0; i--)
            method357(ac1, (byte) 117, aCharArrayArray748[i], ac, ac3);

    }

    public static void method357(char[] ac, byte byte0, char[] ac1, char[] ac2, char[] ac3) {
        if (ac1.length > ac2.length)
            return;
        boolean flag = true;
        int i;
        for (int j = 0; j <= ac2.length - ac1.length; j += i) {
            int k = j;
            int l = 0;
            i = 1;
            while (k < ac2.length) {
                int i1 = 0;
                char c = ac2[k];
                char c1 = '\0';
                if (k + 1 < ac2.length)
                    c1 = ac2[k + 1];
                if (l < ac1.length && (i1 = method366(ac1[l], false, c1, c)) > 0) {
                    k += i1;
                    l++;
                    continue;
                }
                if (l == 0)
                    break;
                if ((i1 = method366(ac1[l - 1], false, c1, c)) > 0) {
                    k += i1;
                    if (l == 1)
                        i++;
                    continue;
                }
                if (l >= ac1.length || !method372(0, c))
                    break;
                k++;
            }
            if (l >= ac1.length) {
                boolean flag1 = false;
                int j1 = method358(ac2, (byte) -8, j, ac);
                int k1 = method359(k - 1, (byte) 7, ac2, ac3);
                if (j1 > 2 || k1 > 2)
                    flag1 = true;
                if (flag1) {
                    for (int l1 = j; l1 < k; l1++)
                        ac2[l1] = '*';

                }
            }
        }

        if (byte0 != 117)
            anInt742 = 9;
    }

    public static int method358(char[] ac, byte byte0, int i, char[] ac1) {
        if (byte0 != -8)
            return 4;
        if (i == 0)
            return 2;
        for (int j = i - 1; j >= 0; j--) {
            if (!method372(0, ac[j]))
                break;
            if (ac[j] == '@')
                return 3;
        }

        int k = 0;
        for (int l = i - 1; l >= 0; l--) {
            if (!method372(0, ac1[l]))
                break;
            if (ac1[l] == '*')
                k++;
        }

        if (k >= 3)
            return 4;
        return !method372(0, ac[i - 1]) ? 0 : 1;
    }

    public static int method359(int i, byte byte0, char[] ac, char[] ac1) {
        if (i + 1 == ac.length)
            return 2;
        for (int j = i + 1; j < ac.length; j++) {
            if (!method372(0, ac[j]))
                break;
            if (ac[j] == '.' || ac[j] == ',')
                return 3;
        }

        if (byte0 != 7)
            anInt744 = 226;
        int k = 0;
        for (int l = i + 1; l < ac.length; l++) {
            if (!method372(0, ac1[l]))
                break;
            if (ac1[l] == '*')
                k++;
        }

        if (k >= 3)
            return 4;
        return !method372(0, ac[i + 1]) ? 0 : 1;
    }

    public static void method360(boolean flag, char[] ac) {
        char[] ac1 = ac.clone();
        char[] ac2 = {
                'd', 'o', 't'
        };
        method364(ac1, ac2, 3, null);
        if (!flag) {
            for (int i = 1; i > 0; i++) ;
        }
        char[] ac3 = ac.clone();
        char[] ac4 = {
                's', 'l', 'a', 's', 'h'
        };
        method364(ac3, ac4, 3, null);
        for (int j = 0; j < aCharArrayArray749.length; j++)
            method361(ac1, anIntArray750[j], ac, ac3, aCharArrayArray749[j], -35561);

    }

    public static void method361(char[] ac, int i, char[] ac1, char[] ac2, char[] ac3, int j) {
        if (j != -35561)
            aBoolean735 = !aBoolean735;
        if (ac3.length > ac1.length)
            return;
        boolean flag = true;
        int k;
        for (int l = 0; l <= ac1.length - ac3.length; l += k) {
            int i1 = l;
            int j1 = 0;
            k = 1;
            while (i1 < ac1.length) {
                int k1 = 0;
                char c = ac1[i1];
                char c1 = '\0';
                if (i1 + 1 < ac1.length)
                    c1 = ac1[i1 + 1];
                if (j1 < ac3.length && (k1 = method366(ac3[j1], false, c1, c)) > 0) {
                    i1 += k1;
                    j1++;
                    continue;
                }
                if (j1 == 0)
                    break;
                if ((k1 = method366(ac3[j1 - 1], false, c1, c)) > 0) {
                    i1 += k1;
                    if (j1 == 1)
                        k++;
                    continue;
                }
                if (j1 >= ac3.length || !method372(0, c))
                    break;
                i1++;
            }
            if (j1 >= ac3.length) {
                boolean flag1 = false;
                int l1 = method362(ac, true, ac1, l);
                int i2 = method363(ac2, i1 - 1, 28750, ac1);
                if (i == 1 && l1 > 0 && i2 > 0)
                    flag1 = true;
                if (i == 2 && (l1 > 2 && i2 > 0 || l1 > 0 && i2 > 2))
                    flag1 = true;
                if (i == 3 && l1 > 0 && i2 > 2)
                    flag1 = true;
                boolean _tmp = i == 3 && l1 > 2 && i2 > 0;
                if (flag1) {
                    int j2 = l;
                    int k2 = i1 - 1;
                    if (l1 > 2) {
                        if (l1 == 4) {
                            boolean flag2 = false;
                            for (int i3 = j2 - 1; i3 >= 0; i3--)
                                if (flag2) {
                                    if (ac[i3] != '*')
                                        break;
                                    j2 = i3;
                                } else if (ac[i3] == '*') {
                                    j2 = i3;
                                    flag2 = true;
                                }

                        }
                        boolean flag3 = false;
                        for (int j3 = j2 - 1; j3 >= 0; j3--)
                            if (flag3) {
                                if (method372(0, ac1[j3]))
                                    break;
                                j2 = j3;
                            } else if (!method372(0, ac1[j3])) {
                                flag3 = true;
                                j2 = j3;
                            }

                    }
                    if (i2 > 2) {
                        if (i2 == 4) {
                            boolean flag4 = false;
                            for (int k3 = k2 + 1; k3 < ac1.length; k3++)
                                if (flag4) {
                                    if (ac2[k3] != '*')
                                        break;
                                    k2 = k3;
                                } else if (ac2[k3] == '*') {
                                    k2 = k3;
                                    flag4 = true;
                                }

                        }
                        boolean flag5 = false;
                        for (int l3 = k2 + 1; l3 < ac1.length; l3++)
                            if (flag5) {
                                if (method372(0, ac1[l3]))
                                    break;
                                k2 = l3;
                            } else if (!method372(0, ac1[l3])) {
                                flag5 = true;
                                k2 = l3;
                            }

                    }
                    for (int l2 = j2; l2 <= k2; l2++)
                        ac1[l2] = '*';

                }
            }
        }

    }

    public static int method362(char[] ac, boolean flag, char[] ac1, int i) {
        if (i == 0)
            return 2;
        for (int j = i - 1; j >= 0; j--) {
            if (!method372(0, ac1[j]))
                break;
            if (ac1[j] == ',' || ac1[j] == '.')
                return 3;
        }

        int k = 0;
        for (int l = i - 1; l >= 0; l--) {
            if (!method372(0, ac[l]))
                break;
            if (ac[l] == '*')
                k++;
        }

        if (!flag)
            anInt742 = 368;
        if (k >= 3)
            return 4;
        return !method372(0, ac1[i - 1]) ? 0 : 1;
    }

    public static int method363(char[] ac, int i, int j, char[] ac1) {
        if (i + 1 == ac1.length)
            return 2;
        for (int k = i + 1; k < ac1.length; k++) {
            if (!method372(0, ac1[k]))
                break;
            if (ac1[k] == '\\' || ac1[k] == '/')
                return 3;
        }

        int l = 0;
        for (int i1 = i + 1; i1 < ac1.length; i1++) {
            if (!method372(0, ac[i1]))
                break;
            if (ac[i1] == '*')
                l++;
        }

        if (j != 28750)
            return anInt744;
        if (l >= 5)
            return 4;
        return !method372(0, ac1[i + 1]) ? 0 : 1;
    }

    public static void method364(char[] ac, char[] ac1, int i, byte[][] abyte0) {
        if (ac1.length > ac.length)
            return;
        boolean flag = true;
        if (i != 3)
            return;
        int j;
        for (int k = 0; k <= ac.length - ac1.length; k += j) {
            int l = k;
            int i1 = 0;
            int j1 = 0;
            j = 1;
            boolean flag1 = false;
            boolean flag2 = false;
            boolean flag3 = false;
            while (l < ac.length && (!flag2 || !flag3)) {
                int k1 = 0;
                char c = ac[l];
                char c2 = '\0';
                if (l + 1 < ac.length)
                    c2 = ac[l + 1];
                if (i1 < ac1.length && (k1 = method367(c, c2, ac1[i1], -726)) > 0) {
                    if (k1 == 1 && method375(636, c))
                        flag2 = true;
                    if (k1 == 2 && (method375(636, c) || method375(636, c2)))
                        flag2 = true;
                    l += k1;
                    i1++;
                    continue;
                }
                if (i1 == 0)
                    break;
                if ((k1 = method367(c, c2, ac1[i1 - 1], -726)) > 0) {
                    l += k1;
                    if (i1 == 1)
                        j++;
                    continue;
                }
                if (i1 >= ac1.length || !method373(c, -972))
                    break;
                if (method372(0, c) && c != '\'')
                    flag1 = true;
                if (method375(636, c))
                    flag3 = true;
                l++;
                if ((++j1 * 100) / (l - k) > 90)
                    break;
            }
            if (i1 >= ac1.length && (!flag2 || !flag3)) {
                boolean flag4 = true;
                if (!flag1) {
                    char c1 = ' ';
                    if (k - 1 >= 0)
                        c1 = ac[k - 1];
                    char c3 = ' ';
                    if (l < ac.length)
                        c3 = ac[l];
                    byte byte0 = method368(c1, 9);
                    byte byte1 = method368(c3, 9);
                    if (abyte0 != null && method365(-484, abyte0, byte0, byte1))
                        flag4 = false;
                } else {
                    boolean flag5 = false;
                    boolean flag6 = false;
                    if (k - 1 < 0 || method372(0, ac[k - 1]) && ac[k - 1] != '\'')
                        flag5 = true;
                    if (l >= ac.length || method372(0, ac[l]) && ac[l] != '\'')
                        flag6 = true;
                    if (!flag5 || !flag6) {
                        boolean flag7 = false;
                        int k2 = k - 2;
                        if (flag5)
                            k2 = k;
                        for (; !flag7 && k2 < l; k2++)
                            if (k2 >= 0 && (!method372(0, ac[k2]) || ac[k2] == '\'')) {
                                char[] ac2 = new char[3];
                                int j3;
                                for (j3 = 0; j3 < 3; j3++) {
                                    if (k2 + j3 >= ac.length || method372(0, ac[k2 + j3]) && ac[k2 + j3] != '\'')
                                        break;
                                    ac2[j3] = ac[k2 + j3];
                                }

                                boolean flag8 = j3 != 0;
                                if (j3 < 3 && k2 - 1 >= 0 && (!method372(0, ac[k2 - 1]) || ac[k2 - 1] == '\''))
                                    flag8 = false;
                                if (flag8 && !method378(ac2, 6))
                                    flag7 = true;
                            }

                        if (!flag7)
                            flag4 = false;
                    }
                }
                if (flag4) {
                    int l1 = 0;
                    int i2 = 0;
                    int j2 = -1;
                    for (int l2 = k; l2 < l; l2++)
                        if (method375(636, ac[l2]))
                            l1++;
                        else if (method374(aByte741, ac[l2])) {
                            i2++;
                            j2 = l2;
                        }

                    if (j2 > -1)
                        l1 -= l - 1 - j2;
                    if (l1 <= i2) {
                        for (int i3 = k; i3 < l; i3++)
                            ac[i3] = '*';

                    } else {
                        j = 1;
                    }
                }
            }
        }

    }

    public static boolean method365(int i, byte[][] abyte0, byte byte0, byte byte1) {
        int j = 0;
        if (abyte0[j][0] == byte0 && abyte0[j][1] == byte1)
            return true;
        int k = abyte0.length - 1;
        if (i >= 0)
            throw new NullPointerException();
        if (abyte0[k][0] == byte0 && abyte0[k][1] == byte1)
            return true;
        do {
            int l = (j + k) / 2;
            if (abyte0[l][0] == byte0 && abyte0[l][1] == byte1)
                return true;
            if (byte0 < abyte0[l][0] || byte0 == abyte0[l][0] && byte1 < abyte0[l][1])
                k = l;
            else
                j = l;
        } while (j != k && j + 1 != k);
        return false;
    }

    public static int method366(char c, boolean flag, char c1, char c2) {
        if (flag)
            return anInt737;
        if (c == c2)
            return 1;
        if (c == 'o' && c2 == '0')
            return 1;
        if (c == 'o' && c2 == '(' && c1 == ')')
            return 2;
        if (c == 'c' && (c2 == '(' || c2 == '<' || c2 == '['))
            return 1;
        if (c == 'e' && c2 == '\u20AC')
            return 1;
        if (c == 's' && c2 == '$')
            return 1;
        return c != 'l' || c2 != 'i' ? 0 : 1;
    }

    public static int method367(char c, char c1, char c2, int i) {
        if (i >= 0) {
            for (int j = 1; j > 0; j++) ;
        }
        if (c2 == c)
            return 1;
        if (c2 >= 'a' && c2 <= 'm') {
            if (c2 == 'a') {
                if (c == '4' || c == '@' || c == '^')
                    return 1;
                return c != '/' || c1 != '\\' ? 0 : 2;
            }
            if (c2 == 'b') {
                if (c == '6' || c == '8')
                    return 1;
                return (c != '1' || c1 != '3') && (c != 'i' || c1 != '3') ? 0 : 2;
            }
            if (c2 == 'c')
                return c != '(' && c != '<' && c != '{' && c != '[' ? 0 : 1;
            if (c2 == 'd')
                return (c != '[' || c1 != ')') && (c != 'i' || c1 != ')') ? 0 : 2;
            if (c2 == 'e')
                return c != '3' && c != '\u20AC' ? 0 : 1;
            if (c2 == 'f') {
                if (c == 'p' && c1 == 'h')
                    return 2;
                return c != '\243' ? 0 : 1;
            }
            if (c2 == 'g')
                return c != '9' && c != '6' && c != 'q' ? 0 : 1;
            if (c2 == 'h')
                return c != '#' ? 0 : 1;
            if (c2 == 'i')
                return c != 'y' && c != 'l' && c != 'j' && c != '1' && c != '!' && c != ':' && c != ';' && c != '|' ? 0 : 1;
            if (c2 == 'j')
                return 0;
            if (c2 == 'k')
                return 0;
            if (c2 == 'l')
                return c != '1' && c != '|' && c != 'i' ? 0 : 1;
            if (c2 == 'm')
                return 0;
        }
        if (c2 >= 'n' && c2 <= 'z') {
            if (c2 == 'n')
                return 0;
            if (c2 == 'o') {
                if (c == '0' || c == '*')
                    return 1;
                return (c != '(' || c1 != ')') && (c != '[' || c1 != ']') && (c != '{' || c1 != '}') && (c != '<' || c1 != '>') ? 0 : 2;
            }
            if (c2 == 'p')
                return 0;
            if (c2 == 'q')
                return 0;
            if (c2 == 'r')
                return 0;
            if (c2 == 's')
                return c != '5' && c != 'z' && c != '$' && c != '2' ? 0 : 1;
            if (c2 == 't')
                return c != '7' && c != '+' ? 0 : 1;
            if (c2 == 'u') {
                if (c == 'v')
                    return 1;
                return (c != '\\' || c1 != '/') && (c != '\\' || c1 != '|') && (c != '|' || c1 != '/') ? 0 : 2;
            }
            if (c2 == 'v')
                return (c != '\\' || c1 != '/') && (c != '\\' || c1 != '|') && (c != '|' || c1 != '/') ? 0 : 2;
            if (c2 == 'w')
                return c != 'v' || c1 != 'v' ? 0 : 2;
            if (c2 == 'x')
                return (c != ')' || c1 != '(') && (c != '}' || c1 != '{') && (c != ']' || c1 != '[') && (c != '>' || c1 != '<') ? 0 : 2;
            if (c2 == 'y')
                return 0;
            if (c2 == 'z')
                return 0;
        }
        if (c2 >= '0' && c2 <= '9') {
            if (c2 == '0') {
                if (c == 'o' || c == 'O')
                    return 1;
                return (c != '(' || c1 != ')') && (c != '{' || c1 != '}') && (c != '[' || c1 != ']') ? 0 : 2;
            }
            if (c2 == '1')
                return c != 'l' ? 0 : 1;
            else
                return 0;
        }
        if (c2 == ',')
            return c != '.' ? 0 : 1;
        if (c2 == '.')
            return c != ',' ? 0 : 1;
        if (c2 == '!')
            return c != 'i' ? 0 : 1;
        else
            return 0;
    }

    public static byte method368(char c, int i) {
        if (i < anInt739 || i > anInt739)
            anInt734 = -479;
        if (c >= 'a' && c <= 'z')
            return (byte) ((c - 97) + 1);
        if (c == '\'')
            return 28;
        if (c >= '0' && c <= '9')
            return (byte) ((c - 48) + 29);
        else
            return 27;
    }

    public static void method369(char[] ac, int i) {
        int j = 0;
        int k = 0;
        int l = 0;
        if (i != 9)
            aBoolean732 = !aBoolean732;
        int i1 = 0;
        while ((j = method370(ac, anInt740, k)) != -1) {
            boolean flag = false;
            for (int j1 = k; j1 >= 0 && j1 < j && !flag; j1++)
                if (!method372(0, ac[j1]) && !method373(ac[j1], -972))
                    flag = true;

            if (flag)
                l = 0;
            if (l == 0)
                i1 = j;
            k = method371(9, ac, j);
            int k1 = 0;
            for (int l1 = j; l1 < k; l1++)
                k1 = (k1 * 10 + ac[l1]) - 48;

            if (k1 > 255 || k - j > 8)
                l = 0;
            else
                l++;
            if (l == 4) {
                for (int i2 = i1; i2 < k; i2++)
                    ac[i2] = '*';

                l = 0;
            }
        }
    }

    public static int method370(char[] ac, int i, int j) {
        if (i != 0)
            anInt744 = 256;
        for (int k = j; k < ac.length && k >= 0; k++)
            if (ac[k] >= '0' && ac[k] <= '9')
                return k;

        return -1;
    }

    public static int method371(int i, char[] ac, int j) {
        for (int k = j; k < ac.length && k >= 0; k++)
            if (ac[k] < '0' || ac[k] > '9')
                return k;

        if (i != 9)
            return anInt737;
        else
            return ac.length;
    }

    public static boolean method372(int i, char c) {
        if (i != 0)
            throw new NullPointerException();
        return !method374(aByte741, c) && !method375(636, c);
    }

    public static boolean method373(char c, int i) {
        if (i >= 0)
            aBoolean735 = !aBoolean735;
        if (c < 'a' || c > 'z')
            return true;
        return c == 'v' || c == 'x' || c == 'j' || c == 'q' || c == 'z';
    }

    public static boolean method374(byte byte0, char c) {
        if (byte0 != -17) {
            for (int i = 1; i > 0; i++) ;
        }
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
    }

    public static boolean method375(int i, char c) {
        i = 8 / i;
        return c >= '0' && c <= '9';
    }

    public static boolean method376(int i, char c) {
        if (i != 0) {
            for (int j = 1; j > 0; j++) ;
        }
        return c >= 'a' && c <= 'z';
    }

    public static boolean method377(int i, char c) {
        if (i != 5)
            throw new NullPointerException();
        return c >= 'A' && c <= 'Z';
    }

    public static boolean method378(char[] ac, int i) {
        boolean flag = true;
        for (char c : ac)
            if (!method375(636, c) && c != 0) {
                flag = false;
                break;
            }

        if (i != 6)
            aBoolean743 = !aBoolean743;
        if (flag)
            return true;
        int k = method379((byte) -119, ac);
        int l = 0;
        int i1 = anIntArray745.length - 1;
        if (k == anIntArray745[l] || k == anIntArray745[i1])
            return true;
        do {
            int j1 = (l + i1) / 2;
            if (k == anIntArray745[j1])
                return true;
            if (k < anIntArray745[j1])
                i1 = j1;
            else
                l = j1;
        } while (l != i1 && l + 1 != i1);
        return false;
    }

    public static int method379(byte byte0, char[] ac) {
        if (ac.length > 6)
            return 0;
        int i = 0;
        for (int j = 0; j < ac.length; j++) {
            char c = ac[ac.length - j - 1];
            if (c >= 'a' && c <= 'z')
                i = i * 38 + ((c - 97) + 1);
            else if (c == '\'')
                i = i * 38 + 27;
            else if (c >= '0' && c <= '9')
                i = i * 38 + ((c - 48) + 28);
            else if (c != 0)
                return 0;
        }

        if (byte0 != -119)
            aBoolean738 = !aBoolean738;
        return i;
    }

}
