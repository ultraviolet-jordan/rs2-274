// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class18 {

    public int anInt400;
    public int anInt401;
    public final int anInt402;
    public final boolean aBoolean403;
    public final int anInt404;
    public boolean aBoolean405;
    public boolean aBoolean406;
    public int anInt407;
    public int anInt408;
    public int anInt409;
    public int anInt410;
    public int[][] anIntArrayArray411;

    public Class18(int i, int j, boolean flag) {
        anInt400 = 701;
        anInt401 = 1;
        anInt402 = 1;
        aBoolean403 = false;
        anInt404 = 1;
        aBoolean405 = false;
        aBoolean406 = false;
        if (!flag) {
            throw new NullPointerException();
        } else {
            anInt407 = 0;
            anInt408 = 0;
            anInt409 = j;
            anInt410 = i;
            anIntArrayArray411 = new int[anInt409][anInt410];
            method231((byte) 5);
        }
    }

    public void method231(byte byte0) {
        for (int i = 0; i < anInt409; i++) {
            for (int j = 0; j < anInt410; j++)
                if (i == 0 || j == 0 || i == anInt409 - 1 || j == anInt410 - 1)
                    anIntArrayArray411[i][j] = 0xffffff;
                else
                    anIntArrayArray411[i][j] = 0;

        }

        if (byte0 == 5) {
            byte0 = 0;
            return;
        }
        for (int k = 1; k > 0; k++) ;
    }

    public void method232(int i, int j, boolean flag, int k, byte byte0, int l) {
        l -= anInt407;
        k -= anInt408;
        if (byte0 != 25)
            return;
        if (j == 0) {
            if (i == 0) {
                method235(l, k, 128);
                method235(l - 1, k, 8);
            }
            if (i == 1) {
                method235(l, k, 2);
                method235(l, k + 1, 32);
            }
            if (i == 2) {
                method235(l, k, 8);
                method235(l + 1, k, 128);
            }
            if (i == 3) {
                method235(l, k, 32);
                method235(l, k - 1, 2);
            }
        }
        if (j == 1 || j == 3) {
            if (i == 0) {
                method235(l, k, 1);
                method235(l - 1, k + 1, 16);
            }
            if (i == 1) {
                method235(l, k, 4);
                method235(l + 1, k + 1, 64);
            }
            if (i == 2) {
                method235(l, k, 16);
                method235(l + 1, k - 1, 1);
            }
            if (i == 3) {
                method235(l, k, 64);
                method235(l - 1, k - 1, 4);
            }
        }
        if (j == 2) {
            if (i == 0) {
                method235(l, k, 130);
                method235(l - 1, k, 8);
                method235(l, k + 1, 32);
            }
            if (i == 1) {
                method235(l, k, 10);
                method235(l, k + 1, 32);
                method235(l + 1, k, 128);
            }
            if (i == 2) {
                method235(l, k, 40);
                method235(l + 1, k, 128);
                method235(l, k - 1, 2);
            }
            if (i == 3) {
                method235(l, k, 160);
                method235(l, k - 1, 2);
                method235(l - 1, k, 8);
            }
        }
        if (flag) {
            if (j == 0) {
                if (i == 0) {
                    method235(l, k, 0x10000);
                    method235(l - 1, k, 4096);
                }
                if (i == 1) {
                    method235(l, k, 1024);
                    method235(l, k + 1, 16384);
                }
                if (i == 2) {
                    method235(l, k, 4096);
                    method235(l + 1, k, 0x10000);
                }
                if (i == 3) {
                    method235(l, k, 16384);
                    method235(l, k - 1, 1024);
                }
            }
            if (j == 1 || j == 3) {
                if (i == 0) {
                    method235(l, k, 512);
                    method235(l - 1, k + 1, 8192);
                }
                if (i == 1) {
                    method235(l, k, 2048);
                    method235(l + 1, k + 1, 32768);
                }
                if (i == 2) {
                    method235(l, k, 8192);
                    method235(l + 1, k - 1, 512);
                }
                if (i == 3) {
                    method235(l, k, 32768);
                    method235(l - 1, k - 1, 2048);
                }
            }
            if (j == 2) {
                if (i == 0) {
                    method235(l, k, 0x10400);
                    method235(l - 1, k, 4096);
                    method235(l, k + 1, 16384);
                }
                if (i == 1) {
                    method235(l, k, 5120);
                    method235(l, k + 1, 16384);
                    method235(l + 1, k, 0x10000);
                }
                if (i == 2) {
                    method235(l, k, 20480);
                    method235(l + 1, k, 0x10000);
                    method235(l, k - 1, 1024);
                }
                if (i == 3) {
                    method235(l, k, 0x14000);
                    method235(l, k - 1, 1024);
                    method235(l - 1, k, 4096);
                }
            }
        }
    }

    public void method233(int i, int j, int k, int l, int i1, boolean flag, int j1) {
        int k1 = 256;
        if (flag)
            k1 += 0x20000;
        j -= anInt407;
        if (j1 != 9)
            anInt400 = -131;
        l -= anInt408;
        if (i1 == 1 || i1 == 3) {
            int l1 = i;
            i = k;
            k = l1;
        }
        for (int i2 = j; i2 < j + i; i2++)
            if (i2 >= 0 && i2 < anInt409) {
                for (int j2 = l; j2 < l + k; j2++)
                    if (j2 >= 0 && j2 < anInt410)
                        method235(i2, j2, k1);

            }

    }

    public void method234(boolean flag, int i, int j) {
        i -= anInt407;
        if (!flag) {
        } else {
            j -= anInt408;
            anIntArrayArray411[i][j] |= 0x200000;
        }
    }

    public void method235(int i, int j, int k) {
        anIntArrayArray411[i][j] |= k;
    }

    public void method236(byte byte0, int i, boolean flag, int j, int k, int l) {
        l -= anInt407;
        k -= anInt408;
        if (byte0 != 3)
            aBoolean406 = !aBoolean406;
        if (i == 0) {
            if (j == 0) {
                method238(k, anInt401, 128, l);
                method238(k, anInt401, 8, l - 1);
            }
            if (j == 1) {
                method238(k, anInt401, 2, l);
                method238(k + 1, anInt401, 32, l);
            }
            if (j == 2) {
                method238(k, anInt401, 8, l);
                method238(k, anInt401, 128, l + 1);
            }
            if (j == 3) {
                method238(k, anInt401, 32, l);
                method238(k - 1, anInt401, 2, l);
            }
        }
        if (i == 1 || i == 3) {
            if (j == 0) {
                method238(k, anInt401, 1, l);
                method238(k + 1, anInt401, 16, l - 1);
            }
            if (j == 1) {
                method238(k, anInt401, 4, l);
                method238(k + 1, anInt401, 64, l + 1);
            }
            if (j == 2) {
                method238(k, anInt401, 16, l);
                method238(k - 1, anInt401, 1, l + 1);
            }
            if (j == 3) {
                method238(k, anInt401, 64, l);
                method238(k - 1, anInt401, 4, l - 1);
            }
        }
        if (i == 2) {
            if (j == 0) {
                method238(k, anInt401, 130, l);
                method238(k, anInt401, 8, l - 1);
                method238(k + 1, anInt401, 32, l);
            }
            if (j == 1) {
                method238(k, anInt401, 10, l);
                method238(k + 1, anInt401, 32, l);
                method238(k, anInt401, 128, l + 1);
            }
            if (j == 2) {
                method238(k, anInt401, 40, l);
                method238(k, anInt401, 128, l + 1);
                method238(k - 1, anInt401, 2, l);
            }
            if (j == 3) {
                method238(k, anInt401, 160, l);
                method238(k - 1, anInt401, 2, l);
                method238(k, anInt401, 8, l - 1);
            }
        }
        if (flag) {
            if (i == 0) {
                if (j == 0) {
                    method238(k, anInt401, 0x10000, l);
                    method238(k, anInt401, 4096, l - 1);
                }
                if (j == 1) {
                    method238(k, anInt401, 1024, l);
                    method238(k + 1, anInt401, 16384, l);
                }
                if (j == 2) {
                    method238(k, anInt401, 4096, l);
                    method238(k, anInt401, 0x10000, l + 1);
                }
                if (j == 3) {
                    method238(k, anInt401, 16384, l);
                    method238(k - 1, anInt401, 1024, l);
                }
            }
            if (i == 1 || i == 3) {
                if (j == 0) {
                    method238(k, anInt401, 512, l);
                    method238(k + 1, anInt401, 8192, l - 1);
                }
                if (j == 1) {
                    method238(k, anInt401, 2048, l);
                    method238(k + 1, anInt401, 32768, l + 1);
                }
                if (j == 2) {
                    method238(k, anInt401, 8192, l);
                    method238(k - 1, anInt401, 512, l + 1);
                }
                if (j == 3) {
                    method238(k, anInt401, 32768, l);
                    method238(k - 1, anInt401, 2048, l - 1);
                }
            }
            if (i == 2) {
                if (j == 0) {
                    method238(k, anInt401, 0x10400, l);
                    method238(k, anInt401, 4096, l - 1);
                    method238(k + 1, anInt401, 16384, l);
                }
                if (j == 1) {
                    method238(k, anInt401, 5120, l);
                    method238(k + 1, anInt401, 16384, l);
                    method238(k, anInt401, 0x10000, l + 1);
                }
                if (j == 2) {
                    method238(k, anInt401, 20480, l);
                    method238(k, anInt401, 0x10000, l + 1);
                    method238(k - 1, anInt401, 1024, l);
                }
                if (j == 3) {
                    method238(k, anInt401, 0x14000, l);
                    method238(k - 1, anInt401, 1024, l);
                    method238(k, anInt401, 4096, l - 1);
                }
            }
        }
    }

    public void method237(int i, int j, int k, int l, int i1, boolean flag, int j1) {
        int k1 = 256;
        if (i >= 0)
            return;
        if (flag)
            k1 += 0x20000;
        k -= anInt407;
        l -= anInt408;
        if (i1 == 1 || i1 == 3) {
            int l1 = j;
            j = j1;
            j1 = l1;
        }
        for (int i2 = k; i2 < k + j; i2++)
            if (i2 >= 0 && i2 < anInt409) {
                for (int j2 = l; j2 < l + j1; j2++)
                    if (j2 >= 0 && j2 < anInt410)
                        method238(j2, anInt401, k1, i2);

            }

    }

    public void method238(int i, int j, int k, int l) {
        anIntArrayArray411[l][i] &= 0xffffff - k;
        if (j >= anInt402)
            if (j <= anInt402) ;
    }

    public void method239(int i, int j, int k) {
        i -= anInt407;
        k -= anInt408;
        if (j != 0)
            aBoolean405 = !aBoolean405;
        anIntArrayArray411[i][k] &= 0xdfffff;
    }

    public boolean method240(boolean flag, int i, int j, int k, int l, int i1, int j1) {
        if (i == k && j1 == l)
            return true;
        i -= anInt407;
        j1 -= anInt408;
        k -= anInt407;
        if (flag)
            throw new NullPointerException();
        l -= anInt408;
        if (i1 == 0)
            if (j == 0) {
                if (i == k - 1 && j1 == l)
                    return true;
                if (i == k && j1 == l + 1 && (anIntArrayArray411[i][j1] & 0x280120) == 0)
                    return true;
                if (i == k && j1 == l - 1 && (anIntArrayArray411[i][j1] & 0x280102) == 0)
                    return true;
            } else if (j == 1) {
                if (i == k && j1 == l + 1)
                    return true;
                if (i == k - 1 && j1 == l && (anIntArrayArray411[i][j1] & 0x280108) == 0)
                    return true;
                if (i == k + 1 && j1 == l && (anIntArrayArray411[i][j1] & 0x280180) == 0)
                    return true;
            } else if (j == 2) {
                if (i == k + 1 && j1 == l)
                    return true;
                if (i == k && j1 == l + 1 && (anIntArrayArray411[i][j1] & 0x280120) == 0)
                    return true;
                if (i == k && j1 == l - 1 && (anIntArrayArray411[i][j1] & 0x280102) == 0)
                    return true;
            } else if (j == 3) {
                if (i == k && j1 == l - 1)
                    return true;
                if (i == k - 1 && j1 == l && (anIntArrayArray411[i][j1] & 0x280108) == 0)
                    return true;
                if (i == k + 1 && j1 == l && (anIntArrayArray411[i][j1] & 0x280180) == 0)
                    return true;
            }
        if (i1 == 2)
            if (j == 0) {
                if (i == k - 1 && j1 == l)
                    return true;
                if (i == k && j1 == l + 1)
                    return true;
                if (i == k + 1 && j1 == l && (anIntArrayArray411[i][j1] & 0x280180) == 0)
                    return true;
                if (i == k && j1 == l - 1 && (anIntArrayArray411[i][j1] & 0x280102) == 0)
                    return true;
            } else if (j == 1) {
                if (i == k - 1 && j1 == l && (anIntArrayArray411[i][j1] & 0x280108) == 0)
                    return true;
                if (i == k && j1 == l + 1)
                    return true;
                if (i == k + 1 && j1 == l)
                    return true;
                if (i == k && j1 == l - 1 && (anIntArrayArray411[i][j1] & 0x280102) == 0)
                    return true;
            } else if (j == 2) {
                if (i == k - 1 && j1 == l && (anIntArrayArray411[i][j1] & 0x280108) == 0)
                    return true;
                if (i == k && j1 == l + 1 && (anIntArrayArray411[i][j1] & 0x280120) == 0)
                    return true;
                if (i == k + 1 && j1 == l)
                    return true;
                if (i == k && j1 == l - 1)
                    return true;
            } else if (j == 3) {
                if (i == k - 1 && j1 == l)
                    return true;
                if (i == k && j1 == l + 1 && (anIntArrayArray411[i][j1] & 0x280120) == 0)
                    return true;
                if (i == k + 1 && j1 == l && (anIntArrayArray411[i][j1] & 0x280180) == 0)
                    return true;
                if (i == k && j1 == l - 1)
                    return true;
            }
        if (i1 == 9) {
            if (i == k && j1 == l + 1 && (anIntArrayArray411[i][j1] & 0x20) == 0)
                return true;
            if (i == k && j1 == l - 1 && (anIntArrayArray411[i][j1] & 2) == 0)
                return true;
            if (i == k - 1 && j1 == l && (anIntArrayArray411[i][j1] & 8) == 0)
                return true;
            return i == k + 1 && j1 == l && (anIntArrayArray411[i][j1] & 0x80) == 0;
        }
        return false;
    }

    public boolean method241(int i, int j, int k, int l, int i1, int j1, int k1) {
        if (k == i && j1 == j)
            return true;
        k -= anInt407;
        j1 -= anInt408;
        if (k1 != 6)
            anInt401 = -116;
        i -= anInt407;
        j -= anInt408;
        if (l == 6 || l == 7) {
            if (l == 7)
                i1 = i1 + 2 & 3;
            if (i1 == 0) {
                if (k == i + 1 && j1 == j && (anIntArrayArray411[k][j1] & 0x80) == 0)
                    return true;
                if (k == i && j1 == j - 1 && (anIntArrayArray411[k][j1] & 2) == 0)
                    return true;
            } else if (i1 == 1) {
                if (k == i - 1 && j1 == j && (anIntArrayArray411[k][j1] & 8) == 0)
                    return true;
                if (k == i && j1 == j - 1 && (anIntArrayArray411[k][j1] & 2) == 0)
                    return true;
            } else if (i1 == 2) {
                if (k == i - 1 && j1 == j && (anIntArrayArray411[k][j1] & 8) == 0)
                    return true;
                if (k == i && j1 == j + 1 && (anIntArrayArray411[k][j1] & 0x20) == 0)
                    return true;
            } else if (i1 == 3) {
                if (k == i + 1 && j1 == j && (anIntArrayArray411[k][j1] & 0x80) == 0)
                    return true;
                if (k == i && j1 == j + 1 && (anIntArrayArray411[k][j1] & 0x20) == 0)
                    return true;
            }
        }
        if (l == 8) {
            if (k == i && j1 == j + 1 && (anIntArrayArray411[k][j1] & 0x20) == 0)
                return true;
            if (k == i && j1 == j - 1 && (anIntArrayArray411[k][j1] & 2) == 0)
                return true;
            if (k == i - 1 && j1 == j && (anIntArrayArray411[k][j1] & 8) == 0)
                return true;
            return k == i + 1 && j1 == j && (anIntArrayArray411[k][j1] & 0x80) == 0;
        }
        return false;
    }

    public boolean method242(int i, int j, int k, int l, int i1, int j1, int k1,
                             int l1) {
        if (l != anInt404) {
            for (int i2 = 1; i2 > 0; i2++) ;
        }
        int j2 = (i + j) - 1;
        int k2 = (i1 + l1) - 1;
        if (k1 >= i && k1 <= j2 && j1 >= i1 && j1 <= k2)
            return true;
        if (k1 == i - 1 && j1 >= i1 && j1 <= k2 && (anIntArrayArray411[k1 - anInt407][j1 - anInt408] & 8) == 0 && (k & 8) == 0)
            return true;
        if (k1 == j2 + 1 && j1 >= i1 && j1 <= k2 && (anIntArrayArray411[k1 - anInt407][j1 - anInt408] & 0x80) == 0 && (k & 2) == 0)
            return true;
        if (j1 == i1 - 1 && k1 >= i && k1 <= j2 && (anIntArrayArray411[k1 - anInt407][j1 - anInt408] & 2) == 0 && (k & 4) == 0)
            return true;
        return j1 == k2 + 1 && k1 >= i && k1 <= j2 && (anIntArrayArray411[k1 - anInt407][j1 - anInt408] & 0x20) == 0 && (k & 1) == 0;
    }
}
