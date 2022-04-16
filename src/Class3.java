public class Class3 {

    public static final int[] anIntArray85 = new int[]{1, 2, 4, 8};
    public static final int[] anIntArray86 = new int[]{16, 32, 64, 128};
    public static final int[] anIntArray87 = new int[]{1, 0, -1, 0};
    public static final int[] anIntArray88 = new int[]{0, -1, 0, 1};
    public static int anInt66;
    public static boolean aBoolean67 = true;
    public static int anInt68;
    public static int anInt89 = (int) (Math.random() * 17.0D) - 8;
    public static int anInt90 = (int) (Math.random() * 33.0D) - 16;
    public final int anInt63 = 618;
    public int anInt64 = 587;
    public boolean aBoolean65 = false;
    public final int anInt69;
    public final int anInt70;
    public final int[][][] anIntArrayArrayArray71;
    public final byte[][][] aByteArrayArrayArray72;
    public final byte[][][] aByteArrayArrayArray73;
    public final byte[][][] aByteArrayArrayArray74;
    public final byte[][][] aByteArrayArrayArray75;
    public byte[][][] aByteArrayArrayArray76;
    public byte[][][] aByteArrayArrayArray77;
    public int[][] anIntArrayArray78;
    public int[] anIntArray79;
    public int[] anIntArray80;
    public int[] anIntArray81;
    public int[] anIntArray82;
    public int[] anIntArray83;
    public int[][][] anIntArrayArrayArray84;


    public Class3(int var1, int[][][] var2, int var3, int var4, byte[][][] var5) {
        this.anInt69 = var1;
        this.anInt70 = var3;
        this.anIntArrayArrayArray71 = var2;
        this.aByteArrayArrayArray72 = var5;
        this.aByteArrayArrayArray73 = new byte[4][this.anInt69][this.anInt70];
        this.aByteArrayArrayArray74 = new byte[4][this.anInt69][this.anInt70];
        this.aByteArrayArrayArray75 = new byte[4][this.anInt69][this.anInt70];
        if (var4 < 0) {
            this.aByteArrayArrayArray76 = new byte[4][this.anInt69][this.anInt70];
            this.anIntArrayArrayArray84 = new int[4][this.anInt69 + 1][this.anInt70 + 1];
            this.aByteArrayArrayArray77 = new byte[4][this.anInt69 + 1][this.anInt70 + 1];
            this.anIntArrayArray78 = new int[this.anInt69 + 1][this.anInt70 + 1];
            this.anIntArray79 = new int[this.anInt70];
            this.anIntArray80 = new int[this.anInt70];
            this.anIntArray81 = new int[this.anInt70];
            this.anIntArray82 = new int[this.anInt70];
            this.anIntArray83 = new int[this.anInt70];
        } else {
            throw new NullPointerException();
        }
    }

    public static boolean method159(byte var0, byte[] var1, int var2, int var3) {
        boolean var4 = true;
        Class44_Sub3_Sub2 var5 = new Class44_Sub3_Sub2(var1, (byte) 1);
        int var6 = -1;
        if (var0 != 106) {
            throw new NullPointerException();
        } else {
            while (true) {
                int var7 = var5.method493();
                if (var7 == 0) {
                    return var4;
                }

                var6 += var7;
                int var8 = 0;
                boolean var9 = false;

                while (true) {
                    int var10;
                    if (var9) {
                        var10 = var5.method493();
                        if (var10 == 0) {
                            break;
                        }

                        var5.get1();
                    } else {
                        var10 = var5.method493();
                        if (var10 == 0) {
                            break;
                        }

                        var8 += var10 - 1;
                        int var11 = var8 & 63;
                        int var12 = var8 >> 6 & 63;
                        int var13 = var5.get1() >> 2;
                        int var14 = var12 + var3;
                        int var15 = var11 + var2;
                        if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                            Class8 var16 = Class8.method199(var6);
                            if (var13 != 22 || !aBoolean67 || var16.aBoolean229 || var16.aBoolean249) {
                                var4 &= var16.method203(true);
                                var9 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void method160(byte var0, Class44_Sub3_Sub2 var1, Class43_Sub1 var2) {
        int var3;
        if (var0 != -47) {
            for (var3 = 1; var3 > 0; ++var3) {
            }
        }

        var3 = -1;

        while (true) {
            int var4 = var1.method493();
            if (var4 == 0) {
                return;
            }

            var3 += var4;
            Class8 var5 = Class8.method199(var3);
            var5.method204((byte) 0, var2);

            while (true) {
                int var6 = var1.method493();
                if (var6 == 0) {
                    break;
                }

                var1.get1();
            }
        }
    }

    public static int method165(int var0, int var1) {
        int var2 = method166(var0 + '\ub135', var1 + 91923, 4) - 128 + (method166(var0 + 10294, var1 + '\u93bd', 2) - 128 >> 1) + (method166(var0, var1, 1) - 128 >> 2);
        var2 = (int) ((double) var2 * 0.3D) + 35;
        if (var2 < 10) {
            var2 = 10;
        } else if (var2 > 60) {
            var2 = 60;
        }

        return var2;
    }

    public static int method166(int var0, int var1, int var2) {
        int var3 = var0 / var2;
        int var4 = var0 & var2 - 1;
        int var5 = var1 / var2;
        int var6 = var1 & var2 - 1;
        int var7 = method168(var3, var5);
        int var8 = method168(var3 + 1, var5);
        int var9 = method168(var3, var5 + 1);
        int var10 = method168(var3 + 1, var5 + 1);
        int var11 = method167(var7, var8, var4, var2);
        int var12 = method167(var9, var10, var4, var2);
        return method167(var11, var12, var6, var2);
    }

    public static int method167(int var0, int var1, int var2, int var3) {
        int var4 = 65536 - Class44_Sub3_Sub1_Sub1.anIntArray1408[var2 * 1024 / var3] >> 1;
        return (var0 * (65536 - var4) >> 16) + (var1 * var4 >> 16);
    }

    public static int method168(int var0, int var1) {
        int var2 = method169(var0 - 1, var1 - 1) + method169(var0 + 1, var1 - 1) + method169(var0 - 1, var1 + 1) + method169(var0 + 1, var1 + 1);
        int var3 = method169(var0 - 1, var1) + method169(var0 + 1, var1) + method169(var0, var1 - 1) + method169(var0, var1 + 1);
        int var4 = method169(var0, var1);
        return var2 / 16 + var3 / 8 + var4 / 4;
    }

    public static int method169(int var0, int var1) {
        int var2 = var0 + var1 * 57;
        var2 ^= var2 << 13;
        int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
        return var3 >> 19 & 255;
    }

    public static int method170(int var0, int var1) {
        if (var0 == -1) {
            return 12345678;
        } else {
            var1 = var1 * (var0 & 127) / 128;
            if (var1 < 2) {
                var1 = 2;
            } else if (var1 > 126) {
                var1 = 126;
            }

            return (var0 & '\uff80') + var1;
        }
    }

    public static boolean method173(int var0, int var1, int var2) {
        if (var2 <= 0) {
            throw new NullPointerException();
        } else {
            Class8 var3 = Class8.method199(var0);
            if (var1 == 11) {
                var1 = 10;
            }

            if (var1 >= 5 && var1 <= 8) {
                var1 = 4;
            }

            return var3.method202(0, var1);
        }
    }

    public static void method174(Class36 var0, int var1, int var2, boolean var3, int var4, int var5, int var6, Class18 var7, int[][][] var8, int var9, int var10) {
        int var11 = var8[var1][var10][var9];
        int var12 = var8[var1][var10 + 1][var9];
        int var13 = var8[var1][var10 + 1][var9 + 1];
        int var14 = var8[var1][var10][var9 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        if (var3) {
            Class8 var16 = Class8.method199(var4);
            int var17 = var10 + (var9 << 7) + (var4 << 14) + 1073741824;
            if (!var16.aBoolean229) {
                var17 += Integer.MIN_VALUE;
            }

            byte var18 = (byte) ((var6 << 6) + var5);
            Class44_Sub3_Sub4 var19;
            if (var5 == 22) {
                if (var16.anInt233 == -1) {
                    var19 = var16.method205(22, var6, var11, var12, var13, var14, -1);
                } else {
                    var19 = new Class44_Sub3_Sub4_Sub1(22, var6, var16.anInt233, var4, var13, anInt66, true, var12, var14, var11);
                }

                var0.method284(var15, var19, var10, var2, var17, true, var18, var9);
                if (var16.aBoolean227 && var16.aBoolean229) {
                    var7.method234(true, var10, var9);
                }

            } else {
                int var20;
                if (var5 != 10 && var5 != 11) {
                    if (var5 >= 12) {
                        if (var16.anInt233 == -1) {
                            var19 = var16.method205(var5, var6, var11, var12, var13, var14, -1);
                        } else {
                            var19 = new Class44_Sub3_Sub4_Sub1(var5, var6, var16.anInt233, var4, var13, anInt66, true, var12, var14, var11);
                        }

                        var0.method288(-323, var10, var9, 1, var2, var15, var19, var18, 1, 0, var17);
                        if (var16.aBoolean227) {
                            var7.method233(var16.anInt225, var10, var16.anInt226, var9, var6, var16.aBoolean228, 9);
                        }

                    } else if (var5 == 0) {
                        if (var16.anInt233 == -1) {
                            var19 = var16.method205(0, var6, var11, var12, var13, var14, -1);
                        } else {
                            var19 = new Class44_Sub3_Sub4_Sub1(0, var6, var16.anInt233, var4, var13, anInt66, true, var12, var14, var11);
                        }

                        var0.method286(anIntArray85[var6], null, var15, var10, var2, var18, -30992, 0, var17, var19, var9);
                        if (var16.aBoolean227) {
                            var7.method232(var6, var5, var16.aBoolean228, var9, (byte) 25, var10);
                        }

                    } else if (var5 == 1) {
                        if (var16.anInt233 == -1) {
                            var19 = var16.method205(1, var6, var11, var12, var13, var14, -1);
                        } else {
                            var19 = new Class44_Sub3_Sub4_Sub1(1, var6, var16.anInt233, var4, var13, anInt66, true, var12, var14, var11);
                        }

                        var0.method286(anIntArray86[var6], null, var15, var10, var2, var18, -30992, 0, var17, var19, var9);
                        if (var16.aBoolean227) {
                            var7.method232(var6, var5, var16.aBoolean228, var9, (byte) 25, var10);
                        }

                    } else {
                        int var23;
                        Class44_Sub3_Sub4 var25;
                        if (var5 == 2) {
                            var23 = var6 + 1 & 3;
                            Class44_Sub3_Sub4 var24;
                            if (var16.anInt233 == -1) {
                                var24 = var16.method205(2, 4 + var6, var11, var12, var13, var14, -1);
                                var25 = var16.method205(2, var23, var11, var12, var13, var14, -1);
                            } else {
                                var24 = new Class44_Sub3_Sub4_Sub1(2, 4 + var6, var16.anInt233, var4, var13, anInt66, true, var12, var14, var11);
                                var25 = new Class44_Sub3_Sub4_Sub1(2, var23, var16.anInt233, var4, var13, anInt66, true, var12, var14, var11);
                            }

                            var0.method286(anIntArray85[var6], var25, var15, var10, var2, var18, -30992, anIntArray85[var23], var17, var24, var9);
                            if (var16.aBoolean227) {
                                var7.method232(var6, var5, var16.aBoolean228, var9, (byte) 25, var10);
                            }

                        } else if (var5 == 3) {
                            if (var16.anInt233 == -1) {
                                var19 = var16.method205(3, var6, var11, var12, var13, var14, -1);
                            } else {
                                var19 = new Class44_Sub3_Sub4_Sub1(3, var6, var16.anInt233, var4, var13, anInt66, true, var12, var14, var11);
                            }

                            var0.method286(anIntArray86[var6], null, var15, var10, var2, var18, -30992, 0, var17, var19, var9);
                            if (var16.aBoolean227) {
                                var7.method232(var6, var5, var16.aBoolean228, var9, (byte) 25, var10);
                            }

                        } else if (var5 == 9) {
                            if (var16.anInt233 == -1) {
                                var19 = var16.method205(var5, var6, var11, var12, var13, var14, -1);
                            } else {
                                var19 = new Class44_Sub3_Sub4_Sub1(var5, var6, var16.anInt233, var4, var13, anInt66, true, var12, var14, var11);
                            }

                            var0.method288(-323, var10, var9, 1, var2, var15, var19, var18, 1, 0, var17);
                            if (var16.aBoolean227) {
                                var7.method233(var16.anInt225, var10, var16.anInt226, var9, var6, var16.aBoolean228, 9);
                            }

                        } else {
                            if (var16.aBoolean230) {
                                if (var6 == 1) {
                                    var23 = var14;
                                    var14 = var13;
                                    var13 = var12;
                                    var12 = var11;
                                    var11 = var23;
                                } else if (var6 == 2) {
                                    var23 = var14;
                                    var14 = var12;
                                    var12 = var23;
                                    var23 = var13;
                                    var13 = var11;
                                    var11 = var23;
                                } else if (var6 == 3) {
                                    var23 = var14;
                                    var14 = var11;
                                    var11 = var12;
                                    var12 = var13;
                                    var13 = var23;
                                }
                            }

                            if (var5 == 4) {
                                if (var16.anInt233 == -1) {
                                    var19 = var16.method205(4, 0, var11, var12, var13, var14, -1);
                                } else {
                                    var19 = new Class44_Sub3_Sub4_Sub1(4, 0, var16.anInt233, var4, var13, anInt66, true, var12, var14, var11);
                                }

                                var0.method287(anIntArray85[var6], var19, var18, var9, var15, 0, (byte) -18, var6 * 512, var2, var10, 0, var17);
                            } else if (var5 == 5) {
                                var23 = 16;
                                var20 = var0.method304(var2, var10, var9);
                                if (var20 > 0) {
                                    var23 = Class8.method199(var20 >> 14 & 32767).anInt234;
                                }

                                if (var16.anInt233 == -1) {
                                    var25 = var16.method205(4, 0, var11, var12, var13, var14, -1);
                                } else {
                                    var25 = new Class44_Sub3_Sub4_Sub1(4, 0, var16.anInt233, var4, var13, anInt66, true, var12, var14, var11);
                                }

                                var0.method287(anIntArray85[var6], var25, var18, var9, var15, anIntArray87[var6] * var23, (byte) -18, var6 * 512, var2, var10, anIntArray88[var6] * var23, var17);
                            } else if (var5 == 6) {
                                if (var16.anInt233 == -1) {
                                    var19 = var16.method205(4, 0, var11, var12, var13, var14, -1);
                                } else {
                                    var19 = new Class44_Sub3_Sub4_Sub1(4, 0, var16.anInt233, var4, var13, anInt66, true, var12, var14, var11);
                                }

                                var0.method287(256, var19, var18, var9, var15, 0, (byte) -18, var6, var2, var10, 0, var17);
                            } else if (var5 == 7) {
                                if (var16.anInt233 == -1) {
                                    var19 = var16.method205(4, 0, var11, var12, var13, var14, -1);
                                } else {
                                    var19 = new Class44_Sub3_Sub4_Sub1(4, 0, var16.anInt233, var4, var13, anInt66, true, var12, var14, var11);
                                }

                                var0.method287(512, var19, var18, var9, var15, 0, (byte) -18, var6, var2, var10, 0, var17);
                            } else {
                                if (var5 == 8) {
                                    if (var16.anInt233 == -1) {
                                        var19 = var16.method205(4, 0, var11, var12, var13, var14, -1);
                                    } else {
                                        var19 = new Class44_Sub3_Sub4_Sub1(4, 0, var16.anInt233, var4, var13, anInt66, true, var12, var14, var11);
                                    }

                                    var0.method287(768, var19, var18, var9, var15, 0, (byte) -18, var6, var2, var10, 0, var17);
                                }

                            }
                        }
                    }
                } else {
                    if (var16.anInt233 == -1) {
                        var19 = var16.method205(10, var6, var11, var12, var13, var14, -1);
                    } else {
                        var19 = new Class44_Sub3_Sub4_Sub1(10, var6, var16.anInt233, var4, var13, anInt66, true, var12, var14, var11);
                    }

                    if (var19 != null) {
                        int var22 = 0;
                        if (var5 == 11) {
                            var22 += 256;
                        }

                        int var21;
                        if (var6 != 1 && var6 != 3) {
                            var20 = var16.anInt225;
                            var21 = var16.anInt226;
                        } else {
                            var20 = var16.anInt226;
                            var21 = var16.anInt225;
                        }

                        var0.method288(-323, var10, var9, var21, var2, var15, var19, var18, var20, var22, var17);
                    }

                    if (var16.aBoolean227) {
                        var7.method233(var16.anInt225, var10, var16.anInt226, var9, var6, var16.aBoolean228, 9);
                    }

                }
            }
        }
    }

    public void method157(int var1, int var2, int var3, int var4, int var5) {
        int var6;
        if (var3 <= 0) {
            for (var6 = 1; var6 > 0; ++var6) {
            }
        }

        for (var6 = var1; var6 <= var1 + var5; ++var6) {
            for (int var7 = var2; var7 <= var2 + var4; ++var7) {
                if (var7 >= 0 && var7 < this.anInt69 && var6 >= 0 && var6 < this.anInt70) {
                    this.aByteArrayArrayArray77[0][var7][var6] = 127;
                    if (var7 == var2 && var7 > 0) {
                        this.anIntArrayArrayArray71[0][var7][var6] = this.anIntArrayArrayArray71[0][var7 - 1][var6];
                    }

                    if (var7 == var2 + var4 && var7 < this.anInt69 - 1) {
                        this.anIntArrayArrayArray71[0][var7][var6] = this.anIntArrayArrayArray71[0][var7 + 1][var6];
                    }

                    if (var6 == var1 && var6 > 0) {
                        this.anIntArrayArrayArray71[0][var7][var6] = this.anIntArrayArrayArray71[0][var7][var6 - 1];
                    }

                    if (var6 == var1 + var5 && var6 < this.anInt70 - 1) {
                        this.anIntArrayArrayArray71[0][var7][var6] = this.anIntArrayArrayArray71[0][var7][var6 + 1];
                    }
                }
            }
        }

    }

    public void method158(boolean var1, int var2, byte[] var3, int var4, int var5, int var6) {
        if (!var1) {
            Class44_Sub3_Sub2 var7 = new Class44_Sub3_Sub2(var3, (byte) 1);

            for (int var8 = 0; var8 < 4; ++var8) {
                for (int var9 = 0; var9 < 64; ++var9) {
                    for (int var10 = 0; var10 < 64; ++var10) {
                        int var11 = var9 + var6;
                        int var12 = var10 + var4;
                        int var13;
                        if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
                            this.aByteArrayArrayArray72[var8][var11][var12] = 0;

                            while (true) {
                                var13 = var7.get1();
                                if (var13 == 0) {
                                    if (var8 == 0) {
                                        this.anIntArrayArrayArray71[0][var11][var12] = -method165(932731 + var11 + var2, 556238 + var12 + var5) * 8;
                                    } else {
                                        this.anIntArrayArrayArray71[var8][var11][var12] = this.anIntArrayArrayArray71[var8 - 1][var11][var12] - 240;
                                    }
                                    break;
                                }

                                if (var13 == 1) {
                                    int var14 = var7.get1();
                                    if (var14 == 1) {
                                        var14 = 0;
                                    }

                                    if (var8 == 0) {
                                        this.anIntArrayArrayArray71[0][var11][var12] = -var14 * 8;
                                    } else {
                                        this.anIntArrayArrayArray71[var8][var11][var12] = this.anIntArrayArrayArray71[var8 - 1][var11][var12] - var14 * 8;
                                    }
                                    break;
                                }

                                if (var13 <= 49) {
                                    this.aByteArrayArrayArray74[var8][var11][var12] = var7.get1Signed();
                                    this.aByteArrayArrayArray75[var8][var11][var12] = (byte) ((var13 - 2) / 4);
                                    this.aByteArrayArrayArray76[var8][var11][var12] = (byte) (var13 - 2 & 3);
                                } else if (var13 <= 81) {
                                    this.aByteArrayArrayArray72[var8][var11][var12] = (byte) (var13 - 49);
                                } else {
                                    this.aByteArrayArrayArray73[var8][var11][var12] = (byte) (var13 - 81);
                                }
                            }
                        } else {
                            while (true) {
                                var13 = var7.get1();
                                if (var13 == 0) {
                                    break;
                                }

                                if (var13 == 1) {
                                    var7.get1();
                                    break;
                                }

                                if (var13 <= 49) {
                                    var7.get1();
                                }
                            }
                        }
                    }
                }
            }

        }
    }

    public void method161(int var1, byte[] var2, boolean var3, Class36 var4, int var5, Class18[] var6) {
        Class44_Sub3_Sub2 var7 = new Class44_Sub3_Sub2(var2, (byte) 1);
        int var8 = -1;
        if (var3) {
            this.aBoolean65 = !this.aBoolean65;
        }

        while (true) {
            int var9 = var7.method493();
            if (var9 == 0) {
                return;
            }

            var8 += var9;
            int var10 = 0;

            while (true) {
                int var11 = var7.method493();
                if (var11 == 0) {
                    break;
                }

                var10 += var11 - 1;
                int var12 = var10 & 63;
                int var13 = var10 >> 6 & 63;
                int var14 = var10 >> 12;
                int var15 = var7.get1();
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = var13 + var5;
                int var19 = var12 + var1;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.aByteArrayArrayArray72[1][var18][var19] & 2) == 2) {
                        var20 = var14 - 1;
                    }

                    Class18 var21 = null;
                    if (var20 >= 0) {
                        var21 = var6[var20];
                    }

                    this.method162(8, var14, var21, var17, var16, var19, var4, var8, var18);
                }
            }
        }
    }

    public void method162(int var1, int var2, Class18 var3, int var4, int var5, int var6, Class36 var7, int var8, int var9) {
        if (aBoolean67) {
            if ((this.aByteArrayArrayArray72[var2][var9][var6] & 16) != 0) {
                return;
            }

            if (this.method164(var2, var6, 11451, var9) != anInt68) {
                return;
            }
        }

        int var10 = this.anIntArrayArrayArray71[var2][var9][var6];
        int var11 = this.anIntArrayArrayArray71[var2][var9 + 1][var6];
        int var12 = this.anIntArrayArrayArray71[var2][var9 + 1][var6 + 1];
        int var13 = this.anIntArrayArrayArray71[var2][var9][var6 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        Class8 var15 = Class8.method199(var8);
        if (var1 == 8) {
            int var16 = var9 + (var6 << 7) + (var8 << 14) + 1073741824;
            if (!var15.aBoolean229) {
                var16 += Integer.MIN_VALUE;
            }

            byte var17 = (byte) ((var4 << 6) + var5);
            Class44_Sub3_Sub4 var18;
            if (var5 == 22) {
                if (!aBoolean67 || var15.aBoolean229 || var15.aBoolean249) {
                    if (var15.anInt233 == -1) {
                        var18 = var15.method205(22, var4, var10, var11, var12, var13, -1);
                    } else {
                        var18 = new Class44_Sub3_Sub4_Sub1(22, var4, var15.anInt233, var8, var12, anInt66, true, var11, var13, var10);
                    }

                    var7.method284(var14, var18, var9, var2, var16, true, var17, var6);
                    if (var15.aBoolean227 && var15.aBoolean229 && var3 != null) {
                        var3.method234(true, var9, var6);
                    }

                }
            } else {
                int var19;
                if (var5 != 10 && var5 != 11) {
                    if (var5 >= 12) {
                        if (var15.anInt233 == -1) {
                            var18 = var15.method205(var5, var4, var10, var11, var12, var13, -1);
                        } else {
                            var18 = new Class44_Sub3_Sub4_Sub1(var5, var4, var15.anInt233, var8, var12, anInt66, true, var11, var13, var10);
                        }

                        var7.method288(-323, var9, var6, 1, var2, var14, var18, var17, 1, 0, var16);
                        if (var5 >= 12 && var5 <= 17 && var5 != 13 && var2 > 0) {
                            this.anIntArrayArrayArray84[var2][var9][var6] |= 2340;
                        }

                        if (var15.aBoolean227 && var3 != null) {
                            var3.method233(var15.anInt225, var9, var15.anInt226, var6, var4, var15.aBoolean228, 9);
                        }

                    } else if (var5 == 0) {
                        if (var15.anInt233 == -1) {
                            var18 = var15.method205(0, var4, var10, var11, var12, var13, -1);
                        } else {
                            var18 = new Class44_Sub3_Sub4_Sub1(0, var4, var15.anInt233, var8, var12, anInt66, true, var11, var13, var10);
                        }

                        var7.method286(anIntArray85[var4], null, var14, var9, var2, var17, -30992, 0, var16, var18, var6);
                        if (var4 == 0) {
                            if (var15.aBoolean241) {
                                this.aByteArrayArrayArray77[var2][var9][var6] = 50;
                                this.aByteArrayArrayArray77[var2][var9][var6 + 1] = 50;
                            }

                            if (var15.aBoolean232) {
                                this.anIntArrayArrayArray84[var2][var9][var6] |= 585;
                            }
                        } else if (var4 == 1) {
                            if (var15.aBoolean241) {
                                this.aByteArrayArrayArray77[var2][var9][var6 + 1] = 50;
                                this.aByteArrayArrayArray77[var2][var9 + 1][var6 + 1] = 50;
                            }

                            if (var15.aBoolean232) {
                                this.anIntArrayArrayArray84[var2][var9][var6 + 1] |= 1170;
                            }
                        } else if (var4 == 2) {
                            if (var15.aBoolean241) {
                                this.aByteArrayArrayArray77[var2][var9 + 1][var6] = 50;
                                this.aByteArrayArrayArray77[var2][var9 + 1][var6 + 1] = 50;
                            }

                            if (var15.aBoolean232) {
                                this.anIntArrayArrayArray84[var2][var9 + 1][var6] |= 585;
                            }
                        } else if (var4 == 3) {
                            if (var15.aBoolean241) {
                                this.aByteArrayArrayArray77[var2][var9][var6] = 50;
                                this.aByteArrayArrayArray77[var2][var9 + 1][var6] = 50;
                            }

                            if (var15.aBoolean232) {
                                this.anIntArrayArrayArray84[var2][var9][var6] |= 1170;
                            }
                        }

                        if (var15.aBoolean227 && var3 != null) {
                            var3.method232(var4, var5, var15.aBoolean228, var6, (byte) 25, var9);
                        }

                        if (var15.anInt234 != 16) {
                            var7.method294(false, var9, var6, var2, var15.anInt234);
                        }

                    } else if (var5 == 1) {
                        if (var15.anInt233 == -1) {
                            var18 = var15.method205(1, var4, var10, var11, var12, var13, -1);
                        } else {
                            var18 = new Class44_Sub3_Sub4_Sub1(1, var4, var15.anInt233, var8, var12, anInt66, true, var11, var13, var10);
                        }

                        var7.method286(anIntArray86[var4], null, var14, var9, var2, var17, -30992, 0, var16, var18, var6);
                        if (var15.aBoolean241) {
                            if (var4 == 0) {
                                this.aByteArrayArrayArray77[var2][var9][var6 + 1] = 50;
                            } else if (var4 == 1) {
                                this.aByteArrayArrayArray77[var2][var9 + 1][var6 + 1] = 50;
                            } else if (var4 == 2) {
                                this.aByteArrayArrayArray77[var2][var9 + 1][var6] = 50;
                            } else if (var4 == 3) {
                                this.aByteArrayArrayArray77[var2][var9][var6] = 50;
                            }
                        }

                        if (var15.aBoolean227 && var3 != null) {
                            var3.method232(var4, var5, var15.aBoolean228, var6, (byte) 25, var9);
                        }

                    } else {
                        int var26;
                        Class44_Sub3_Sub4 var28;
                        if (var5 == 2) {
                            var26 = var4 + 1 & 3;
                            Class44_Sub3_Sub4 var27;
                            if (var15.anInt233 == -1) {
                                var27 = var15.method205(2, 4 + var4, var10, var11, var12, var13, -1);
                                var28 = var15.method205(2, var26, var10, var11, var12, var13, -1);
                            } else {
                                var27 = new Class44_Sub3_Sub4_Sub1(2, 4 + var4, var15.anInt233, var8, var12, anInt66, true, var11, var13, var10);
                                var28 = new Class44_Sub3_Sub4_Sub1(2, var26, var15.anInt233, var8, var12, anInt66, true, var11, var13, var10);
                            }

                            var7.method286(anIntArray85[var4], var28, var14, var9, var2, var17, -30992, anIntArray85[var26], var16, var27, var6);
                            if (var15.aBoolean232) {
                                if (var4 == 0) {
                                    this.anIntArrayArrayArray84[var2][var9][var6] |= 585;
                                    this.anIntArrayArrayArray84[var2][var9][var6 + 1] |= 1170;
                                } else if (var4 == 1) {
                                    this.anIntArrayArrayArray84[var2][var9][var6 + 1] |= 1170;
                                    this.anIntArrayArrayArray84[var2][var9 + 1][var6] |= 585;
                                } else if (var4 == 2) {
                                    this.anIntArrayArrayArray84[var2][var9 + 1][var6] |= 585;
                                    this.anIntArrayArrayArray84[var2][var9][var6] |= 1170;
                                } else if (var4 == 3) {
                                    this.anIntArrayArrayArray84[var2][var9][var6] |= 1170;
                                    this.anIntArrayArrayArray84[var2][var9][var6] |= 585;
                                }
                            }

                            if (var15.aBoolean227 && var3 != null) {
                                var3.method232(var4, var5, var15.aBoolean228, var6, (byte) 25, var9);
                            }

                            if (var15.anInt234 != 16) {
                                var7.method294(false, var9, var6, var2, var15.anInt234);
                            }

                        } else if (var5 == 3) {
                            if (var15.anInt233 == -1) {
                                var18 = var15.method205(3, var4, var10, var11, var12, var13, -1);
                            } else {
                                var18 = new Class44_Sub3_Sub4_Sub1(3, var4, var15.anInt233, var8, var12, anInt66, true, var11, var13, var10);
                            }

                            var7.method286(anIntArray86[var4], null, var14, var9, var2, var17, -30992, 0, var16, var18, var6);
                            if (var15.aBoolean241) {
                                if (var4 == 0) {
                                    this.aByteArrayArrayArray77[var2][var9][var6 + 1] = 50;
                                } else if (var4 == 1) {
                                    this.aByteArrayArrayArray77[var2][var9 + 1][var6 + 1] = 50;
                                } else if (var4 == 2) {
                                    this.aByteArrayArrayArray77[var2][var9 + 1][var6] = 50;
                                } else if (var4 == 3) {
                                    this.aByteArrayArrayArray77[var2][var9][var6] = 50;
                                }
                            }

                            if (var15.aBoolean227 && var3 != null) {
                                var3.method232(var4, var5, var15.aBoolean228, var6, (byte) 25, var9);
                            }

                        } else if (var5 == 9) {
                            if (var15.anInt233 == -1) {
                                var18 = var15.method205(var5, var4, var10, var11, var12, var13, -1);
                            } else {
                                var18 = new Class44_Sub3_Sub4_Sub1(var5, var4, var15.anInt233, var8, var12, anInt66, true, var11, var13, var10);
                            }

                            var7.method288(-323, var9, var6, 1, var2, var14, var18, var17, 1, 0, var16);
                            if (var15.aBoolean227 && var3 != null) {
                                var3.method233(var15.anInt225, var9, var15.anInt226, var6, var4, var15.aBoolean228, 9);
                            }

                        } else {
                            if (var15.aBoolean230) {
                                if (var4 == 1) {
                                    var26 = var13;
                                    var13 = var12;
                                    var12 = var11;
                                    var11 = var10;
                                    var10 = var26;
                                } else if (var4 == 2) {
                                    var26 = var13;
                                    var13 = var11;
                                    var11 = var26;
                                    var26 = var12;
                                    var12 = var10;
                                    var10 = var26;
                                } else if (var4 == 3) {
                                    var26 = var13;
                                    var13 = var10;
                                    var10 = var11;
                                    var11 = var12;
                                    var12 = var26;
                                }
                            }

                            if (var5 == 4) {
                                if (var15.anInt233 == -1) {
                                    var18 = var15.method205(4, 0, var10, var11, var12, var13, -1);
                                } else {
                                    var18 = new Class44_Sub3_Sub4_Sub1(4, 0, var15.anInt233, var8, var12, anInt66, true, var11, var13, var10);
                                }

                                var7.method287(anIntArray85[var4], var18, var17, var6, var14, 0, (byte) -18, var4 * 512, var2, var9, 0, var16);
                            } else if (var5 == 5) {
                                var26 = 16;
                                var19 = var7.method304(var2, var9, var6);
                                if (var19 > 0) {
                                    var26 = Class8.method199(var19 >> 14 & 32767).anInt234;
                                }

                                if (var15.anInt233 == -1) {
                                    var28 = var15.method205(4, 0, var10, var11, var12, var13, -1);
                                } else {
                                    var28 = new Class44_Sub3_Sub4_Sub1(4, 0, var15.anInt233, var8, var12, anInt66, true, var11, var13, var10);
                                }

                                var7.method287(anIntArray85[var4], var28, var17, var6, var14, anIntArray87[var4] * var26, (byte) -18, var4 * 512, var2, var9, anIntArray88[var4] * var26, var16);
                            } else if (var5 == 6) {
                                if (var15.anInt233 == -1) {
                                    var18 = var15.method205(4, 0, var10, var11, var12, var13, -1);
                                } else {
                                    var18 = new Class44_Sub3_Sub4_Sub1(4, 0, var15.anInt233, var8, var12, anInt66, true, var11, var13, var10);
                                }

                                var7.method287(256, var18, var17, var6, var14, 0, (byte) -18, var4, var2, var9, 0, var16);
                            } else if (var5 == 7) {
                                if (var15.anInt233 == -1) {
                                    var18 = var15.method205(4, 0, var10, var11, var12, var13, -1);
                                } else {
                                    var18 = new Class44_Sub3_Sub4_Sub1(4, 0, var15.anInt233, var8, var12, anInt66, true, var11, var13, var10);
                                }

                                var7.method287(512, var18, var17, var6, var14, 0, (byte) -18, var4, var2, var9, 0, var16);
                            } else {
                                if (var5 == 8) {
                                    if (var15.anInt233 == -1) {
                                        var18 = var15.method205(4, 0, var10, var11, var12, var13, -1);
                                    } else {
                                        var18 = new Class44_Sub3_Sub4_Sub1(4, 0, var15.anInt233, var8, var12, anInt66, true, var11, var13, var10);
                                    }

                                    var7.method287(768, var18, var17, var6, var14, 0, (byte) -18, var4, var2, var9, 0, var16);
                                }

                            }
                        }
                    }
                } else {
                    if (var15.anInt233 == -1) {
                        var18 = var15.method205(10, var4, var10, var11, var12, var13, -1);
                    } else {
                        var18 = new Class44_Sub3_Sub4_Sub1(10, var4, var15.anInt233, var8, var12, anInt66, true, var11, var13, var10);
                    }

                    if (var18 != null) {
                        int var21 = 0;
                        if (var5 == 11) {
                            var21 += 256;
                        }

                        int var20;
                        if (var4 != 1 && var4 != 3) {
                            var19 = var15.anInt225;
                            var20 = var15.anInt226;
                        } else {
                            var19 = var15.anInt226;
                            var20 = var15.anInt225;
                        }

                        if (var7.method288(-323, var9, var6, var20, var2, var14, var18, var17, var19, var21, var16) && var15.aBoolean241) {
                            Class44_Sub3_Sub4_Sub4 var22;
                            if (var18 instanceof Class44_Sub3_Sub4_Sub4) {
                                var22 = (Class44_Sub3_Sub4_Sub4) var18;
                            } else {
                                var22 = var15.method205(10, var4, var10, var11, var12, var13, -1);
                            }

                            if (var22 != null) {
                                for (int var23 = 0; var23 <= var19; ++var23) {
                                    for (int var24 = 0; var24 <= var20; ++var24) {
                                        int var25 = var22.anInt1546 / 4;
                                        if (var25 > 30) {
                                            var25 = 30;
                                        }

                                        if (var25 > this.aByteArrayArrayArray77[var2][var9 + var23][var6 + var24]) {
                                            this.aByteArrayArrayArray77[var2][var9 + var23][var6 + var24] = (byte) var25;
                                        }
                                    }
                                }
                            }
                        }
                    }

                    if (var15.aBoolean227 && var3 != null) {
                        var3.method233(var15.anInt225, var9, var15.anInt226, var6, var4, var15.aBoolean228, 9);
                    }

                }
            }
        }
    }

    public void method163(Class18[] var1, boolean var2, Class36 var3) {
        int var5;
        int var6;
        int var7;
        for (int var4 = 0; var4 < 4; ++var4) {
            for (var5 = 0; var5 < 104; ++var5) {
                for (var6 = 0; var6 < 104; ++var6) {
                    if ((this.aByteArrayArrayArray72[var4][var5][var6] & 1) == 1) {
                        var7 = var4;
                        if ((this.aByteArrayArrayArray72[1][var5][var6] & 2) == 2) {
                            var7 = var4 - 1;
                        }

                        if (var7 >= 0) {
                            var1[var7].method234(true, var5, var6);
                        }
                    }
                }
            }
        }

        anInt89 += (int) (Math.random() * 5.0D) - 2;
        if (!var2) {
            if (anInt89 < -8) {
                anInt89 = -8;
            }

            if (anInt89 > 8) {
                anInt89 = 8;
            }

            anInt90 += (int) (Math.random() * 5.0D) - 2;
            if (anInt90 < -16) {
                anInt90 = -16;
            }

            if (anInt90 > 16) {
                anInt90 = 16;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            int var23;
            for (var5 = 0; var5 < 4; ++var5) {
                byte[][] var45 = this.aByteArrayArrayArray77[var5];
                byte var46 = 96;
                short var8 = 768;
                byte var9 = -50;
                byte var10 = -10;
                byte var11 = -50;
                var12 = (int) Math.sqrt(var9 * var9 + var10 * var10 + var11 * var11);
                var13 = var8 * var12 >> 8;

                for (var14 = 1; var14 < this.anInt70 - 1; ++var14) {
                    for (var15 = 1; var15 < this.anInt69 - 1; ++var15) {
                        var16 = this.anIntArrayArrayArray71[var5][var15 + 1][var14] - this.anIntArrayArrayArray71[var5][var15 - 1][var14];
                        var17 = this.anIntArrayArrayArray71[var5][var15][var14 + 1] - this.anIntArrayArrayArray71[var5][var15][var14 - 1];
                        var18 = (int) Math.sqrt(var16 * var16 + 65536 + var17 * var17);
                        var19 = (var16 << 8) / var18;
                        var20 = 65536 / var18;
                        var21 = (var17 << 8) / var18;
                        var22 = var46 + (var9 * var19 + var10 * var20 + var11 * var21) / var13;
                        var23 = (var45[var15 - 1][var14] >> 2) + (var45[var15 + 1][var14] >> 3) + (var45[var15][var14 - 1] >> 2) + (var45[var15][var14 + 1] >> 3) + (var45[var15][var14] >> 1);
                        this.anIntArrayArray78[var15][var14] = var22 - var23;
                    }
                }

                for (var15 = 0; var15 < this.anInt70; ++var15) {
                    this.anIntArray79[var15] = 0;
                    this.anIntArray80[var15] = 0;
                    this.anIntArray81[var15] = 0;
                    this.anIntArray82[var15] = 0;
                    this.anIntArray83[var15] = 0;
                }

                for (var16 = -5; var16 < this.anInt69 + 5; ++var16) {
                    for (var17 = 0; var17 < this.anInt70; ++var17) {
                        var18 = var16 + 5;
                        if (var18 >= 0 && var18 < this.anInt69) {
                            var19 = this.aByteArrayArrayArray73[var5][var18][var17] & 255;
                            if (var19 > 0) {
                                Class20 var51 = Class20.aClass20Array423[var19 - 1];
                                this.anIntArray79[var17] += var51.anInt432;
                                this.anIntArray80[var17] += var51.anInt430;
                                this.anIntArray81[var17] += var51.anInt431;
                                this.anIntArray82[var17] += var51.anInt433;
                                ++this.anIntArray83[var17];
                            }
                        }

                        var19 = var16 - 5;
                        if (var19 >= 0 && var19 < this.anInt69) {
                            var20 = this.aByteArrayArrayArray73[var5][var19][var17] & 255;
                            if (var20 > 0) {
                                Class20 var52 = Class20.aClass20Array423[var20 - 1];
                                this.anIntArray79[var17] -= var52.anInt432;
                                this.anIntArray80[var17] -= var52.anInt430;
                                this.anIntArray81[var17] -= var52.anInt431;
                                this.anIntArray82[var17] -= var52.anInt433;
                                --this.anIntArray83[var17];
                            }
                        }
                    }

                    if (var16 >= 1 && var16 < this.anInt69 - 1) {
                        var18 = 0;
                        var19 = 0;
                        var20 = 0;
                        var21 = 0;
                        var22 = 0;

                        for (var23 = -5; var23 < this.anInt70 + 5; ++var23) {
                            int var24 = var23 + 5;
                            if (var24 >= 0 && var24 < this.anInt70) {
                                var18 += this.anIntArray79[var24];
                                var19 += this.anIntArray80[var24];
                                var20 += this.anIntArray81[var24];
                                var21 += this.anIntArray82[var24];
                                var22 += this.anIntArray83[var24];
                            }

                            int var25 = var23 - 5;
                            if (var25 >= 0 && var25 < this.anInt70) {
                                var18 -= this.anIntArray79[var25];
                                var19 -= this.anIntArray80[var25];
                                var20 -= this.anIntArray81[var25];
                                var21 -= this.anIntArray82[var25];
                                var22 -= this.anIntArray83[var25];
                            }

                            if (var23 >= 1 && var23 < this.anInt70 - 1 && (!aBoolean67 || (this.aByteArrayArrayArray72[var5][var16][var23] & 16) == 0 && this.method164(var5, var23, 11451, var16) == anInt68)) {
                                int var26 = this.aByteArrayArrayArray73[var5][var16][var23] & 255;
                                int var27 = this.aByteArrayArrayArray74[var5][var16][var23] & 255;
                                if (var26 > 0 || var27 > 0) {
                                    int var28 = this.anIntArrayArrayArray71[var5][var16][var23];
                                    int var29 = this.anIntArrayArrayArray71[var5][var16 + 1][var23];
                                    int var30 = this.anIntArrayArrayArray71[var5][var16 + 1][var23 + 1];
                                    int var31 = this.anIntArrayArrayArray71[var5][var16][var23 + 1];
                                    int var32 = this.anIntArrayArray78[var16][var23];
                                    int var33 = this.anIntArrayArray78[var16 + 1][var23];
                                    int var34 = this.anIntArrayArray78[var16 + 1][var23 + 1];
                                    int var35 = this.anIntArrayArray78[var16][var23 + 1];
                                    int var36 = -1;
                                    int var37 = -1;
                                    int var38;
                                    int var39;
                                    if (var26 > 0) {
                                        var38 = var18 * 256 / var21;
                                        var39 = var19 / var22;
                                        int var40 = var20 / var22;
                                        var36 = this.method172(var38, var39, var40);
                                        var38 = var38 + anInt89 & 255;
                                        var40 += anInt90;
                                        if (var40 < 0) {
                                            var40 = 0;
                                        } else if (var40 > 255) {
                                            var40 = 255;
                                        }

                                        var37 = this.method172(var38, var39, var40);
                                    }

                                    if (var5 > 0) {
                                        boolean var54 = var26 != 0 || this.aByteArrayArrayArray75[var5][var16][var23] == 0;

                                        if (var27 > 0 && !Class20.aClass20Array423[var27 - 1].aBoolean427) {
                                            var54 = false;
                                        }

                                        if (var54 && var28 == var29 && var28 == var30 && var28 == var31) {
                                            this.anIntArrayArrayArray84[var5][var16][var23] |= 2340;
                                        }
                                    }

                                    var38 = 0;
                                    if (var36 != -1) {
                                        var38 = Class44_Sub3_Sub1_Sub1.anIntArray1419[method170(var37, 96)];
                                    }

                                    if (var27 == 0) {
                                        var3.method283(var5, var16, var23, 0, 0, -1, var28, var29, var30, var31, method170(var36, var32), method170(var36, var33), method170(var36, var34), method170(var36, var35), 0, 0, 0, 0, var38, 0);
                                    } else {
                                        var39 = this.aByteArrayArrayArray75[var5][var16][var23] + 1;
                                        byte var55 = this.aByteArrayArrayArray76[var5][var16][var23];
                                        Class20 var41 = Class20.aClass20Array423[var27 - 1];
                                        int var42 = var41.anInt425;
                                        int var43;
                                        int var44;
                                        if (var42 >= 0) {
                                            var44 = Class44_Sub3_Sub1_Sub1.method424(false, var42);
                                            var43 = -1;
                                        } else if (var41.anInt424 == 16711935) {
                                            var44 = 0;
                                            var43 = -2;
                                            var42 = -1;
                                        } else {
                                            var43 = this.method172(var41.anInt429, var41.anInt430, var41.anInt431);
                                            var44 = Class44_Sub3_Sub1_Sub1.anIntArray1419[this.method171(var41.anInt434, 96)];
                                        }

                                        var3.method283(var5, var16, var23, var39, var55, var42, var28, var29, var30, var31, method170(var36, var32), method170(var36, var33), method170(var36, var34), method170(var36, var35), this.method171(var43, var32), this.method171(var43, var33), this.method171(var43, var34), this.method171(var43, var35), var38, var44);
                                    }
                                }
                            }
                        }
                    }
                }

                for (var17 = 1; var17 < this.anInt70 - 1; ++var17) {
                    for (var18 = 1; var18 < this.anInt69 - 1; ++var18) {
                        var3.method282(var5, var18, var17, this.method164(var5, var17, 11451, var18));
                    }
                }
            }

            var3.method309(-50, 64, -10, -52, -50, 768);

            for (var6 = 0; var6 < this.anInt69; ++var6) {
                for (var7 = 0; var7 < this.anInt70; ++var7) {
                    if ((this.aByteArrayArrayArray72[1][var6][var7] & 2) == 2) {
                        var3.method280((byte) -28, var6, var7);
                    }
                }
            }

            var7 = 1;
            int var47 = 2;
            int var48 = 4;

            for (int var49 = 0; var49 < 4; ++var49) {
                if (var49 > 0) {
                    var7 <<= 3;
                    var47 <<= 3;
                    var48 <<= 3;
                }

                for (int var50 = 0; var50 <= var49; ++var50) {
                    for (var12 = 0; var12 <= this.anInt70; ++var12) {
                        for (var13 = 0; var13 <= this.anInt69; ++var13) {
                            short var53;
                            if ((this.anIntArrayArrayArray84[var50][var13][var12] & var7) != 0) {
                                var14 = var12;
                                var15 = var12;
                                var16 = var50;

                                for (var17 = var50; var14 > 0 && (this.anIntArrayArrayArray84[var50][var13][var14 - 1] & var7) != 0; --var14) {
                                }

                                while (var15 < this.anInt70 && (this.anIntArrayArrayArray84[var50][var13][var15 + 1] & var7) != 0) {
                                    ++var15;
                                }

                                label422:
                                while (var16 > 0) {
                                    for (var18 = var14; var18 <= var15; ++var18) {
                                        if ((this.anIntArrayArrayArray84[var16 - 1][var13][var18] & var7) == 0) {
                                            break label422;
                                        }
                                    }

                                    --var16;
                                }

                                label411:
                                while (var17 < var49) {
                                    for (var18 = var14; var18 <= var15; ++var18) {
                                        if ((this.anIntArrayArrayArray84[var17 + 1][var13][var18] & var7) == 0) {
                                            break label411;
                                        }
                                    }

                                    ++var17;
                                }

                                var18 = (var17 + 1 - var16) * (var15 - var14 + 1);
                                if (var18 >= 8) {
                                    var53 = 240;
                                    var20 = this.anIntArrayArrayArray71[var17][var13][var14] - var53;
                                    var21 = this.anIntArrayArrayArray71[var16][var13][var14];
                                    Class36.method281(var49, var20, var15 * 128 + 128, (byte) 0, var13 * 128, var13 * 128, var14 * 128, var21, 1);

                                    for (var22 = var16; var22 <= var17; ++var22) {
                                        for (var23 = var14; var23 <= var15; ++var23) {
                                            this.anIntArrayArrayArray84[var22][var13][var23] &= ~var7;
                                        }
                                    }
                                }
                            }

                            if ((this.anIntArrayArrayArray84[var50][var13][var12] & var47) != 0) {
                                var14 = var13;
                                var15 = var13;
                                var16 = var50;

                                for (var17 = var50; var14 > 0 && (this.anIntArrayArrayArray84[var50][var14 - 1][var12] & var47) != 0; --var14) {
                                }

                                while (var15 < this.anInt69 && (this.anIntArrayArrayArray84[var50][var15 + 1][var12] & var47) != 0) {
                                    ++var15;
                                }

                                label371:
                                while (var16 > 0) {
                                    for (var18 = var14; var18 <= var15; ++var18) {
                                        if ((this.anIntArrayArrayArray84[var16 - 1][var18][var12] & var47) == 0) {
                                            break label371;
                                        }
                                    }

                                    --var16;
                                }

                                label360:
                                while (var17 < var49) {
                                    for (var18 = var14; var18 <= var15; ++var18) {
                                        if ((this.anIntArrayArrayArray84[var17 + 1][var18][var12] & var47) == 0) {
                                            break label360;
                                        }
                                    }

                                    ++var17;
                                }

                                var18 = (var17 + 1 - var16) * (var15 - var14 + 1);
                                if (var18 >= 8) {
                                    var53 = 240;
                                    var20 = this.anIntArrayArrayArray71[var17][var14][var12] - var53;
                                    var21 = this.anIntArrayArrayArray71[var16][var14][var12];
                                    Class36.method281(var49, var20, var12 * 128, (byte) 0, var14 * 128, var15 * 128 + 128, var12 * 128, var21, 2);

                                    for (var22 = var16; var22 <= var17; ++var22) {
                                        for (var23 = var14; var23 <= var15; ++var23) {
                                            this.anIntArrayArrayArray84[var22][var23][var12] &= ~var47;
                                        }
                                    }
                                }
                            }

                            if ((this.anIntArrayArrayArray84[var50][var13][var12] & var48) != 0) {
                                var14 = var13;
                                var15 = var13;
                                var16 = var12;

                                for (var17 = var12; var16 > 0 && (this.anIntArrayArrayArray84[var50][var13][var16 - 1] & var48) != 0; --var16) {
                                }

                                while (var17 < this.anInt70 && (this.anIntArrayArrayArray84[var50][var13][var17 + 1] & var48) != 0) {
                                    ++var17;
                                }

                                label320:
                                while (var14 > 0) {
                                    for (var18 = var16; var18 <= var17; ++var18) {
                                        if ((this.anIntArrayArrayArray84[var50][var14 - 1][var18] & var48) == 0) {
                                            break label320;
                                        }
                                    }

                                    --var14;
                                }

                                label309:
                                while (var15 < this.anInt69) {
                                    for (var18 = var16; var18 <= var17; ++var18) {
                                        if ((this.anIntArrayArrayArray84[var50][var15 + 1][var18] & var48) == 0) {
                                            break label309;
                                        }
                                    }

                                    ++var15;
                                }

                                if ((var15 - var14 + 1) * (var17 - var16 + 1) >= 4) {
                                    var18 = this.anIntArrayArrayArray71[var50][var14][var16];
                                    Class36.method281(var49, var18, var17 * 128 + 128, (byte) 0, var14 * 128, var15 * 128 + 128, var16 * 128, var18, 4);

                                    for (var19 = var14; var19 <= var15; ++var19) {
                                        for (var20 = var16; var20 <= var17; ++var20) {
                                            this.anIntArrayArrayArray84[var50][var19][var20] &= ~var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
    }

    public int method164(int var1, int var2, int var3, int var4) {
        return var3 != 11451 ? this.anInt63 : ((this.aByteArrayArrayArray72[var1][var4][var2] & 8) != 0 ? 0 : (var1 > 0 && (this.aByteArrayArrayArray72[1][var4][var2] & 2) != 0 ? var1 - 1 : var1));
    }

    public int method171(int var1, int var2) {
        if (var1 == -2) {
            return 12345678;
        } else if (var1 == -1) {
            if (var2 < 0) {
                var2 = 0;
            } else if (var2 > 127) {
                var2 = 127;
            }

            var2 = 127 - var2;
            return var2;
        } else {
            var2 = var2 * (var1 & 127) / 128;
            if (var2 < 2) {
                var2 = 2;
            } else if (var2 > 126) {
                var2 = 126;
            }

            return (var1 & '\uff80') + var2;
        }
    }

    public int method172(int var1, int var2, int var3) {
        if (var3 > 179) {
            var2 /= 2;
        }

        if (var3 > 192) {
            var2 /= 2;
        }

        if (var3 > 217) {
            var2 /= 2;
        }

        if (var3 > 243) {
            var2 /= 2;
        }

        int var4 = (var1 / 4 << 10) + (var2 / 32 << 7) + var3 / 2;
        return var4;
    }

}
