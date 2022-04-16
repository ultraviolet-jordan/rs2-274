// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class49 {

    public static final char[] aCharArray795 = new char[100];
    public static final char[] aCharArray796 = {
            ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r',
            'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p',
            'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2',
            '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?',
            '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\',
            '\'', '@', '#', '+', '=', '\243', '$', '%', '"', '[',
            ']'
    };

    public static String method554(byte byte0, int i, Class44_Sub3_Sub2 class44_sub3_sub2) {
        int j = 0;
        int k = -1;
        for (int l = 0; l < i; l++) {
            int i1 = class44_sub3_sub2.get1();
            int j1 = i1 >> 4 & 0xf;
            if (k == -1) {
                if (j1 < 13)
                    aCharArray795[j++] = aCharArray796[j1];
                else
                    k = j1;
            } else {
                aCharArray795[j++] = aCharArray796[((k << 4) + j1) - 195];
                k = -1;
            }
            j1 = i1 & 0xf;
            if (k == -1) {
                if (j1 < 13)
                    aCharArray795[j++] = aCharArray796[j1];
                else
                    k = j1;
            } else {
                aCharArray795[j++] = aCharArray796[((k << 4) + j1) - 195];
                k = -1;
            }
        }

        if (byte0 == 8)
            byte0 = 0;
        else
            throw new NullPointerException();
        boolean flag = true;
        for (int k1 = 0; k1 < j; k1++) {
            char c = aCharArray795[k1];
            if (flag && c >= 'a' && c <= 'z') {
                aCharArray795[k1] += '\uFFE0';
                flag = false;
            }
            if (c == '.' || c == '!')
                flag = true;
        }

        return new String(aCharArray795, 0, j);
    }

    public static void method555(String s, byte byte0, Class44_Sub3_Sub2 class44_sub3_sub2) {
        if (s.length() > 80)
            s = s.substring(0, 80);
        s = s.toLowerCase();
        if (byte0 != 126) {
            for (int i = 1; i > 0; i++) ;
        }
        int j = -1;
        for (int k = 0; k < s.length(); k++) {
            char c = s.charAt(k);
            int l = 0;
            for (int i1 = 0; i1 < aCharArray796.length; i1++) {
                if (c != aCharArray796[i1])
                    continue;
                l = i1;
                break;
            }

            if (l > 12)
                l += 195;
            if (j == -1) {
                if (l < 13)
                    j = l;
                else
                    class44_sub3_sub2.put1(l);
            } else if (l < 13) {
                class44_sub3_sub2.put1((j << 4) + l);
                j = -1;
            } else {
                class44_sub3_sub2.put1((j << 4) + (l >> 4));
                j = l & 0xf;
            }
        }

        if (j != -1)
            class44_sub3_sub2.put1(j << 4);
    }

}
