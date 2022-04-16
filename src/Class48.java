// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import sign.signlink;

public class Class48 {

    public static final char[] aCharArray794 = {
            '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
            't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2',
            '3', '4', '5', '6', '7', '8', '9'
    };
    public static boolean aBoolean788 = true;
    public static int anInt789 = 618;
    public static final int anInt790 = 7;
    public static byte aByte791 = 7;
    public static int anInt792 = -407;
    public static int anInt793 = 1;

    public static long method547(String s) {
        long l = 0L;
        for (int i = 0; i < s.length() && i < 12; i++) {
            char c = s.charAt(i);
            l *= 37L;
            if (c >= 'A' && c <= 'Z')
                l += (1 + c) - 65;
            else if (c >= 'a' && c <= 'z')
                l += (1 + c) - 97;
            else if (c >= '0' && c <= '9')
                l += (27 + c) - 48;
        }

        for (; l % 37L == 0L && l != 0L; l /= 37L) ;
        return l;
    }

    public static String method548(int i, long l) {
        try {
            if (l <= 0L || l >= 0x5b5b57f8a98a5dd1L)
                return "invalid_name";
            if (l % 37L == 0L)
                return "invalid_name";
            int j = 0;
            if (i != 0)
                throw new NullPointerException();
            char[] ac = new char[12];
            while (l != 0L) {
                long l1 = l;
                l /= 37L;
                ac[11 - j++] = aCharArray794[(int) (l1 - l * 37L)];
            }
            return new String(ac, 12 - j, j);
        } catch (RuntimeException runtimeexception) {
            signlink.reporterror("19920, " + i + ", " + l + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public static long method549(int i, String s) {
        s = s.toUpperCase();
        if (i < anInt790 || i > anInt790)
            aBoolean788 = !aBoolean788;
        long l = 0L;
        for (int j = 0; j < s.length(); j++) {
            l = (l * 61L + (long) s.charAt(j)) - 32L;
            l = l + (l >> 56) & 0xffffffffffffffL;
        }

        return l;
    }

    public static String method550(byte byte0, int i) {
        if (byte0 != 94)
            throw new NullPointerException();
        else
            return (i >> 24 & 0xff) + "." + (i >> 16 & 0xff) + "." + (i >> 8 & 0xff) + "." + (i & 0xff);
    }

    public static String method551(int i, String s) {
        if (i <= 0)
            throw new NullPointerException();
        if (s.length() > 0) {
            char[] ac = s.toCharArray();
            for (int j = 0; j < ac.length; j++)
                if (ac[j] == '_') {
                    ac[j] = ' ';
                    if (j + 1 < ac.length && ac[j + 1] >= 'a' && ac[j + 1] <= 'z')
                        ac[j + 1] = (char) ((ac[j + 1] + 65) - 97);
                }

            if (ac[0] >= 'a' && ac[0] <= 'z')
                ac[0] = (char) ((ac[0] + 65) - 97);
            return new String(ac);
        } else {
            return s;
        }
    }

    public static String method552(String s, int i) {
        s = s.toLowerCase();
        char[] ac = s.toCharArray();
        int j = ac.length;
        boolean flag = true;
        if (i >= 0)
            anInt793 = 111;
        for (int k = 0; k < j; k++) {
            char c = ac[k];
            if (flag && c >= 'a' && c <= 'z') {
                ac[k] += '\uFFE0';
                flag = false;
            }
            if (c == '.' || c == '!')
                flag = true;
        }

        return new String(ac);
    }

    public static String method553(String s, boolean flag) {
        if (flag)
            throw new NullPointerException();
        StringBuilder stringbuffer = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
            stringbuffer.append("*");

        return stringbuffer.toString();
    }

}
