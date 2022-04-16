// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class14 {

    public static final byte aByte316 = 7;
    public static int anInt317 = 5;
    public static int anInt319;
    public static int[] anIntArray320;
    public static Class44_Sub3_Sub2 aClass44_Sub3_Sub2_321;
    public static Class14[] aClass14Array322;
    public static int anInt323;
    public static boolean aBoolean324 = true;
    public static Class39 aClass39_364 = new Class39(50, 0);
    public static Class39 aClass39_365 = new Class39(100, 0);
    public final int anInt315;
    public boolean aBoolean318;
    public int anInt325;
    public int anInt326;
    public String aString327;
    public byte[] aByteArray328;
    public int[] anIntArray329;
    public int[] anIntArray330;
    public int anInt331;
    public int anInt332;
    public int anInt333;
    public int anInt334;
    public int anInt335;
    public int anInt336;
    public int anInt337;
    public boolean aBoolean338;
    public int anInt339;
    public boolean aBoolean340;
    public String[] aStringArray341;
    public String[] aStringArray342;
    public int anInt343;
    public int anInt344;
    public byte aByte345;
    public int anInt346;
    public int anInt347;
    public byte aByte348;
    public int anInt349;
    public int anInt350;
    public int anInt351;
    public int anInt352;
    public int anInt353;
    public int anInt354;
    public int[] anIntArray355;
    public int[] anIntArray356;
    public int anInt357;
    public int anInt358;
    public int anInt359;
    public int anInt360;
    public int anInt361;
    public int anInt362;
    public int anInt363;
    public Class14() {
        anInt315 = -32952;
        aBoolean318 = true;
        anInt325 = -1;
    }

    public static void method218(Class47 class47) {
        aClass44_Sub3_Sub2_321 = new Class44_Sub3_Sub2(class47.method546("obj.dat", null), (byte) 1);
        Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(class47.method546("obj.idx", null), (byte) 1);
        anInt319 = class44_sub3_sub2.get2();
        anIntArray320 = new int[anInt319];
        int i = 2;
        for (int j = 0; j < anInt319; j++) {
            anIntArray320[j] = i;
            i += class44_sub3_sub2.get2();
        }

        aClass14Array322 = new Class14[10];
        for (int k = 0; k < 10; k++)
            aClass14Array322[k] = new Class14();

    }

    public static void method219(byte byte0) {
        aClass39_364 = null;
        aClass39_365 = null;
        anIntArray320 = null;
        if (byte0 != 1)
            anInt317 = -53;
        aClass14Array322 = null;
        aClass44_Sub3_Sub2_321 = null;
    }

    public static Class14 method220(int i) {
        for (int j = 0; j < 10; j++)
            if (aClass14Array322[j].anInt325 == i)
                return aClass14Array322[j];

        anInt323 = (anInt323 + 1) % 10;
        Class14 class14 = aClass14Array322[anInt323];
        aClass44_Sub3_Sub2_321.anInt1374 = anIntArray320[i];
        class14.anInt325 = i;
        class14.method221();
        class14.method222((byte) 2, aClass44_Sub3_Sub2_321);
        if (class14.anInt358 != -1)
            class14.method223(false);
        if (!aBoolean324 && class14.aBoolean340) {
            class14.aString327 = "Members Object";
            class14.aByteArray328 = "Login to a members' server to use this object.".getBytes();
            class14.aStringArray341 = null;
            class14.aStringArray342 = null;
        }
        return class14;
    }

    public static Class44_Sub3_Sub1_Sub2 method226(int i, int j, int k, int l) {
        if (j == 0) {
            Class44_Sub3_Sub1_Sub2 class44_sub3_sub1_sub2 = (Class44_Sub3_Sub1_Sub2) aClass39_365.method339(i);
            if (class44_sub3_sub1_sub2 != null && class44_sub3_sub1_sub2.anInt1437 != l && class44_sub3_sub1_sub2.anInt1437 != -1) {
                class44_sub3_sub1_sub2.method404();
                class44_sub3_sub1_sub2 = null;
            }
            if (class44_sub3_sub1_sub2 != null)
                return class44_sub3_sub1_sub2;
        }
        Class14 class14 = method220(i);
        if (class14.anIntArray355 == null)
            l = -1;
        if (l > 1) {
            int i1 = -1;
            for (int j1 = 0; j1 < 10; j1++)
                if (l >= class14.anIntArray356[j1] && class14.anIntArray356[j1] != 0)
                    i1 = class14.anIntArray355[j1];

            if (i1 != -1)
                class14 = method220(i1);
        }
        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = class14.method224(1);
        if (class44_sub3_sub4_sub4 == null)
            return null;
        Class44_Sub3_Sub1_Sub2 class44_sub3_sub1_sub2_2 = null;
        if (class14.anInt358 != -1) {
            class44_sub3_sub1_sub2_2 = method226(class14.anInt357, -1, 45926, 10);
            if (class44_sub3_sub1_sub2_2 == null)
                return null;
        }
        Class44_Sub3_Sub1_Sub2 class44_sub3_sub1_sub2_1 = new Class44_Sub3_Sub1_Sub2(32, 32);
        int k1 = Class44_Sub3_Sub1_Sub1.anInt1403;
        int l1 = Class44_Sub3_Sub1_Sub1.anInt1404;
        int[] ai = Class44_Sub3_Sub1_Sub1.anIntArray1409;
        int[] ai1 = Class44_Sub3_Sub1.anIntArray1351;
        int i2 = Class44_Sub3_Sub1.anInt1352;
        int j2 = Class44_Sub3_Sub1.anInt1353;
        int k2 = Class44_Sub3_Sub1.anInt1356;
        int l2 = Class44_Sub3_Sub1.anInt1357;
        int i3 = Class44_Sub3_Sub1.anInt1354;
        int j3 = Class44_Sub3_Sub1.anInt1355;
        if (k != 45926)
            throw new NullPointerException();
        Class44_Sub3_Sub1_Sub1.aBoolean1401 = false;
        Class44_Sub3_Sub1.method406(32, 32, class44_sub3_sub1_sub2_1.anIntArray1431, 9);
        Class44_Sub3_Sub1.method411(32, 0, 32, 0, 0, 0);
        Class44_Sub3_Sub1_Sub1.method419(false);
        int k3 = class14.anInt331;
        if (j == -1)
            k3 = (int) ((double) k3 * 1.5D);
        if (j > 0)
            k3 = (int) ((double) k3 * 1.04D);
        int l3 = Class44_Sub3_Sub1_Sub1.anIntArray1407[class14.anInt332] * k3 >> 16;
        int i4 = Class44_Sub3_Sub1_Sub1.anIntArray1408[class14.anInt332] * k3 >> 16;
        class44_sub3_sub4_sub4.method523(0, class14.anInt333, class14.anInt334, class14.anInt332, class14.anInt335, l3 + class44_sub3_sub4_sub4.anInt1394 / 2 + class14.anInt336, i4 + class14.anInt336);
        for (int i5 = 31; i5 >= 0; i5--) {
            for (int j4 = 31; j4 >= 0; j4--)
                if (class44_sub3_sub1_sub2_1.anIntArray1431[i5 + j4 * 32] == 0)
                    if (i5 > 0 && class44_sub3_sub1_sub2_1.anIntArray1431[(i5 - 1) + j4 * 32] > 1)
                        class44_sub3_sub1_sub2_1.anIntArray1431[i5 + j4 * 32] = 1;
                    else if (j4 > 0 && class44_sub3_sub1_sub2_1.anIntArray1431[i5 + (j4 - 1) * 32] > 1)
                        class44_sub3_sub1_sub2_1.anIntArray1431[i5 + j4 * 32] = 1;
                    else if (i5 < 31 && class44_sub3_sub1_sub2_1.anIntArray1431[i5 + 1 + j4 * 32] > 1)
                        class44_sub3_sub1_sub2_1.anIntArray1431[i5 + j4 * 32] = 1;
                    else if (j4 < 31 && class44_sub3_sub1_sub2_1.anIntArray1431[i5 + (j4 + 1) * 32] > 1)
                        class44_sub3_sub1_sub2_1.anIntArray1431[i5 + j4 * 32] = 1;

        }

        if (j > 0) {
            for (int j5 = 31; j5 >= 0; j5--) {
                for (int k4 = 31; k4 >= 0; k4--)
                    if (class44_sub3_sub1_sub2_1.anIntArray1431[j5 + k4 * 32] == 0)
                        if (j5 > 0 && class44_sub3_sub1_sub2_1.anIntArray1431[(j5 - 1) + k4 * 32] == 1)
                            class44_sub3_sub1_sub2_1.anIntArray1431[j5 + k4 * 32] = j;
                        else if (k4 > 0 && class44_sub3_sub1_sub2_1.anIntArray1431[j5 + (k4 - 1) * 32] == 1)
                            class44_sub3_sub1_sub2_1.anIntArray1431[j5 + k4 * 32] = j;
                        else if (j5 < 31 && class44_sub3_sub1_sub2_1.anIntArray1431[j5 + 1 + k4 * 32] == 1)
                            class44_sub3_sub1_sub2_1.anIntArray1431[j5 + k4 * 32] = j;
                        else if (k4 < 31 && class44_sub3_sub1_sub2_1.anIntArray1431[j5 + (k4 + 1) * 32] == 1)
                            class44_sub3_sub1_sub2_1.anIntArray1431[j5 + k4 * 32] = j;

            }

        } else if (j == 0) {
            for (int k5 = 31; k5 >= 0; k5--) {
                for (int l4 = 31; l4 >= 0; l4--)
                    if (class44_sub3_sub1_sub2_1.anIntArray1431[k5 + l4 * 32] == 0 && k5 > 0 && l4 > 0 && class44_sub3_sub1_sub2_1.anIntArray1431[(k5 - 1) + (l4 - 1) * 32] > 0)
                        class44_sub3_sub1_sub2_1.anIntArray1431[k5 + l4 * 32] = 0x302020;

            }

        }
        if (class14.anInt358 != -1) {
            int l5 = class44_sub3_sub1_sub2_2.anInt1436;
            int i6 = class44_sub3_sub1_sub2_2.anInt1437;
            class44_sub3_sub1_sub2_2.anInt1436 = 32;
            class44_sub3_sub1_sub2_2.anInt1437 = 32;
            class44_sub3_sub1_sub2_2.method440(aByte316, 0, 0);
            class44_sub3_sub1_sub2_2.anInt1436 = l5;
            class44_sub3_sub1_sub2_2.anInt1437 = i6;
        }
        if (j == 0)
            aClass39_365.method340(201, i, class44_sub3_sub1_sub2_1);
        Class44_Sub3_Sub1.method406(i2, j2, ai1, 9);
        Class44_Sub3_Sub1.method408(5, j3, l2, k2, i3);
        Class44_Sub3_Sub1_Sub1.anInt1403 = k1;
        Class44_Sub3_Sub1_Sub1.anInt1404 = l1;
        Class44_Sub3_Sub1_Sub1.anIntArray1409 = ai;
        Class44_Sub3_Sub1_Sub1.aBoolean1401 = true;
        if (class14.aBoolean338)
            class44_sub3_sub1_sub2_1.anInt1436 = 33;
        else
            class44_sub3_sub1_sub2_1.anInt1436 = 32;
        class44_sub3_sub1_sub2_1.anInt1437 = l;
        return class44_sub3_sub1_sub2_1;
    }

    public void method221() {
        anInt326 = 0;
        aString327 = null;
        aByteArray328 = null;
        anIntArray329 = null;
        anIntArray330 = null;
        anInt331 = 2000;
        anInt332 = 0;
        anInt333 = 0;
        anInt334 = 0;
        anInt335 = 0;
        anInt336 = 0;
        anInt337 = -1;
        aBoolean338 = false;
        anInt339 = 1;
        aBoolean340 = false;
        aStringArray341 = null;
        aStringArray342 = null;
        anInt343 = -1;
        anInt344 = -1;
        aByte345 = 0;
        anInt346 = -1;
        anInt347 = -1;
        aByte348 = 0;
        anInt349 = -1;
        anInt350 = -1;
        anInt351 = -1;
        anInt352 = -1;
        anInt353 = -1;
        anInt354 = -1;
        anIntArray355 = null;
        anIntArray356 = null;
        anInt357 = -1;
        anInt358 = -1;
        anInt359 = 128;
        anInt360 = 128;
        anInt361 = 128;
        anInt362 = 0;
        anInt363 = 0;
    }

    public void method222(byte byte0, Class44_Sub3_Sub2 class44_sub3_sub2) {
        if (byte0 != 2)
            aBoolean318 = !aBoolean318;
        do {
            int i = class44_sub3_sub2.get1();
            if (i == 0)
                return;
            if (i == 1)
                anInt326 = class44_sub3_sub2.get2();
            else if (i == 2)
                aString327 = class44_sub3_sub2.getString();
            else if (i == 3)
                aByteArray328 = class44_sub3_sub2.getStringArray(anInt315);
            else if (i == 4)
                anInt331 = class44_sub3_sub2.get2();
            else if (i == 5)
                anInt332 = class44_sub3_sub2.get2();
            else if (i == 6)
                anInt333 = class44_sub3_sub2.get2();
            else if (i == 7) {
                anInt335 = class44_sub3_sub2.get2();
                if (anInt335 > 32767)
                    anInt335 -= 0x10000;
            } else if (i == 8) {
                anInt336 = class44_sub3_sub2.get2();
                if (anInt336 > 32767)
                    anInt336 -= 0x10000;
            } else if (i == 10)
                anInt337 = class44_sub3_sub2.get2();
            else if (i == 11)
                aBoolean338 = true;
            else if (i == 12)
                anInt339 = class44_sub3_sub2.get4();
            else if (i == 16)
                aBoolean340 = true;
            else if (i == 23) {
                anInt343 = class44_sub3_sub2.get2();
                aByte345 = class44_sub3_sub2.get1Signed();
            } else if (i == 24)
                anInt344 = class44_sub3_sub2.get2();
            else if (i == 25) {
                anInt346 = class44_sub3_sub2.get2();
                aByte348 = class44_sub3_sub2.get1Signed();
            } else if (i == 26)
                anInt347 = class44_sub3_sub2.get2();
            else if (i >= 30 && i < 35) {
                if (aStringArray341 == null)
                    aStringArray341 = new String[5];
                aStringArray341[i - 30] = class44_sub3_sub2.getString();
                if (aStringArray341[i - 30].equalsIgnoreCase("hidden"))
                    aStringArray341[i - 30] = null;
            } else if (i >= 35 && i < 40) {
                if (aStringArray342 == null)
                    aStringArray342 = new String[5];
                aStringArray342[i - 35] = class44_sub3_sub2.getString();
            } else if (i == 40) {
                int j = class44_sub3_sub2.get1();
                anIntArray329 = new int[j];
                anIntArray330 = new int[j];
                for (int k = 0; k < j; k++) {
                    anIntArray329[k] = class44_sub3_sub2.get2();
                    anIntArray330[k] = class44_sub3_sub2.get2();
                }

            } else if (i == 78)
                anInt349 = class44_sub3_sub2.get2();
            else if (i == 79)
                anInt350 = class44_sub3_sub2.get2();
            else if (i == 90)
                anInt351 = class44_sub3_sub2.get2();
            else if (i == 91)
                anInt353 = class44_sub3_sub2.get2();
            else if (i == 92)
                anInt352 = class44_sub3_sub2.get2();
            else if (i == 93)
                anInt354 = class44_sub3_sub2.get2();
            else if (i == 95)
                anInt334 = class44_sub3_sub2.get2();
            else if (i == 97)
                anInt357 = class44_sub3_sub2.get2();
            else if (i == 98)
                anInt358 = class44_sub3_sub2.get2();
            else if (i >= 100 && i < 110) {
                if (anIntArray355 == null) {
                    anIntArray355 = new int[10];
                    anIntArray356 = new int[10];
                }
                anIntArray355[i - 100] = class44_sub3_sub2.get2();
                anIntArray356[i - 100] = class44_sub3_sub2.get2();
            } else if (i == 110)
                anInt359 = class44_sub3_sub2.get2();
            else if (i == 111)
                anInt360 = class44_sub3_sub2.get2();
            else if (i == 112)
                anInt361 = class44_sub3_sub2.get2();
            else if (i == 113)
                anInt362 = class44_sub3_sub2.get1Signed();
            else if (i == 114)
                anInt363 = class44_sub3_sub2.get1Signed() * 5;
        } while (true);
    }

    public void method223(boolean flag) {
        Class14 class14 = method220(anInt358);
        anInt326 = class14.anInt326;
        anInt331 = class14.anInt331;
        anInt332 = class14.anInt332;
        anInt333 = class14.anInt333;
        anInt334 = class14.anInt334;
        anInt335 = class14.anInt335;
        anInt336 = class14.anInt336;
        if (flag)
            aBoolean318 = !aBoolean318;
        anIntArray329 = class14.anIntArray329;
        anIntArray330 = class14.anIntArray330;
        Class14 class14_1 = method220(anInt357);
        aString327 = class14_1.aString327;
        aBoolean340 = class14_1.aBoolean340;
        anInt339 = class14_1.anInt339;
        String s = "a";
        char c = class14_1.aString327.charAt(0);
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            s = "an";
        aByteArray328 = ("Swap this note at any bank for " + s + " " + class14_1.aString327 + ".").getBytes();
        aBoolean338 = true;
    }

    public Class44_Sub3_Sub4_Sub4 method224(int i) {
        if (anIntArray355 != null && i > 1) {
            int j = -1;
            for (int k = 0; k < 10; k++)
                if (i >= anIntArray356[k] && anIntArray356[k] != 0)
                    j = anIntArray355[k];

            if (j != -1)
                return method220(j).method224(1);
        }
        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = (Class44_Sub3_Sub4_Sub4) aClass39_364.method339(anInt325);
        if (class44_sub3_sub4_sub4 != null)
            return class44_sub3_sub4_sub4;
        class44_sub3_sub4_sub4 = Class44_Sub3_Sub4_Sub4.method503(anInt326, 6);
        if (class44_sub3_sub4_sub4 == null)
            return null;
        if (anInt359 != 128 || anInt360 != 128 || anInt361 != 128)
            class44_sub3_sub4_sub4.method519(9, anInt361, anInt359, anInt360);
        if (anIntArray329 != null) {
            for (int l = 0; l < anIntArray329.length; l++)
                class44_sub3_sub4_sub4.method517(anIntArray329[l], anIntArray330[l]);

        }
        class44_sub3_sub4_sub4.method520(64 + anInt362, 768 + anInt363, -50, -10, -50, true);
        class44_sub3_sub4_sub4.aBoolean1555 = true;
        aClass39_364.method340(201, anInt325, class44_sub3_sub4_sub4);
        return class44_sub3_sub4_sub4;
    }

    public Class44_Sub3_Sub4_Sub4 method225(byte byte0, int i) {
        if (anIntArray355 != null && i > 1) {
            int j = -1;
            for (int k = 0; k < 10; k++)
                if (i >= anIntArray356[k] && anIntArray356[k] != 0)
                    j = anIntArray355[k];

            if (j != -1)
                return method220(j).method225((byte) 7, 1);
        }
        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = Class44_Sub3_Sub4_Sub4.method503(anInt326, 6);
        if (byte0 == 7)
            byte0 = 0;
        else
            throw new NullPointerException();
        if (class44_sub3_sub4_sub4 == null)
            return null;
        if (anIntArray329 != null) {
            for (int l = 0; l < anIntArray329.length; l++)
                class44_sub3_sub4_sub4.method517(anIntArray329[l], anIntArray330[l]);

        }
        return class44_sub3_sub4_sub4;
    }

    public boolean method227(int i, int j) {
        int k = anInt343;
        int l = anInt344;
        int i1 = anInt349;
        if (j != 0)
            throw new NullPointerException();
        if (i == 1) {
            k = anInt346;
            l = anInt347;
            i1 = anInt350;
        }
        if (k == -1)
            return true;
        boolean flag = Class44_Sub3_Sub4_Sub4.method504(k);
        if (l != -1 && !Class44_Sub3_Sub4_Sub4.method504(l))
            flag = false;
        if (i1 != -1 && !Class44_Sub3_Sub4_Sub4.method504(i1))
            flag = false;
        return flag;
    }

    public Class44_Sub3_Sub4_Sub4 method228(int i, int j) {
        int k = anInt343;
        int l = anInt344;
        int i1 = anInt349;
        if (i >= 0)
            aBoolean318 = !aBoolean318;
        if (j == 1) {
            k = anInt346;
            l = anInt347;
            i1 = anInt350;
        }
        if (k == -1)
            return null;
        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = Class44_Sub3_Sub4_Sub4.method503(k, 6);
        if (l != -1)
            if (i1 != -1) {
                Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4_1 = Class44_Sub3_Sub4_Sub4.method503(l, 6);
                Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4_3 = Class44_Sub3_Sub4_Sub4.method503(i1, 6);
                Class44_Sub3_Sub4_Sub4[] aclass44_sub3_sub4_sub4_1 = {
                        class44_sub3_sub4_sub4, class44_sub3_sub4_sub4_1, class44_sub3_sub4_sub4_3
                };
                class44_sub3_sub4_sub4 = new Class44_Sub3_Sub4_Sub4(3, -643, aclass44_sub3_sub4_sub4_1);
            } else {
                Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4_2 = Class44_Sub3_Sub4_Sub4.method503(l, 6);
                Class44_Sub3_Sub4_Sub4[] aclass44_sub3_sub4_sub4 = {
                        class44_sub3_sub4_sub4, class44_sub3_sub4_sub4_2
                };
                class44_sub3_sub4_sub4 = new Class44_Sub3_Sub4_Sub4(2, -643, aclass44_sub3_sub4_sub4);
            }
        if (j == 0 && aByte345 != 0)
            class44_sub3_sub4_sub4.method516(0, aByte345, (byte) 10, 0);
        if (j == 1 && aByte348 != 0)
            class44_sub3_sub4_sub4.method516(0, aByte348, (byte) 10, 0);
        if (anIntArray329 != null) {
            for (int j1 = 0; j1 < anIntArray329.length; j1++)
                class44_sub3_sub4_sub4.method517(anIntArray329[j1], anIntArray330[j1]);

        }
        return class44_sub3_sub4_sub4;
    }

    public boolean method229(int i, byte byte0) {
        int j = anInt351;
        int k = anInt352;
        if (i == 1) {
            j = anInt353;
            k = anInt354;
        }
        if (j == -1)
            return true;
        boolean flag = true;
        if (byte0 == 1)
            byte0 = 0;
        else
            throw new NullPointerException();
        if (!Class44_Sub3_Sub4_Sub4.method504(j))
            flag = false;
        if (k != -1 && !Class44_Sub3_Sub4_Sub4.method504(k))
            flag = false;
        return flag;
    }

    public Class44_Sub3_Sub4_Sub4 method230(boolean flag, int i) {
        int j = anInt351;
        int k = anInt352;
        if (flag)
            throw new NullPointerException();
        if (i == 1) {
            j = anInt353;
            k = anInt354;
        }
        if (j == -1)
            return null;
        Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = Class44_Sub3_Sub4_Sub4.method503(j, 6);
        if (k != -1) {
            Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4_1 = Class44_Sub3_Sub4_Sub4.method503(k, 6);
            Class44_Sub3_Sub4_Sub4[] aclass44_sub3_sub4_sub4 = {
                    class44_sub3_sub4_sub4, class44_sub3_sub4_sub4_1
            };
            class44_sub3_sub4_sub4 = new Class44_Sub3_Sub4_Sub4(2, -643, aclass44_sub3_sub4_sub4);
        }
        if (anIntArray329 != null) {
            for (int l = 0; l < anIntArray329.length; l++)
                class44_sub3_sub4_sub4.method517(anIntArray329[l], anIntArray330[l]);

        }
        return class44_sub3_sub4_sub4;
    }

}
