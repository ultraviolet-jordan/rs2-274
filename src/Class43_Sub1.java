// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import sign.signlink;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;

public class Class43_Sub1 extends Class43
        implements Runnable {

    public boolean aBoolean1267;
    public int anInt1268;
    public final byte aByte1269;
    public int anInt1270;
    public final int[][] anIntArrayArray1271;
    public final int[][] anIntArrayArray1272;
    public final byte[][] aByteArrayArray1273;
    public int anInt1274;
    public byte[] aByteArray1275;
    public int[] anIntArray1276;
    public int[] anIntArray1277;
    public int[] anIntArray1278;
    public int[] anIntArray1279;
    public int[] anIntArray1280;
    public int[] anIntArray1281;
    public boolean aBoolean1282;
    public client aClient1283;
    public final CRC32 aCRC32_1284;
    public boolean aBoolean1285;
    public int anInt1286;
    public int anInt1287;
    public final Class31 aClass31_1288;
    public final Class28 aClass28_1289;
    public final Class28 aClass28_1290;
    public final Class28 aClass28_1291;
    public final Class28 aClass28_1292;
    public final Class28 aClass28_1293;
    public String aString1294;
    public int anInt1295;
    public int anInt1296;
    public Socket aSocket1297;
    public InputStream anInputStream1298;
    public OutputStream anOutputStream1299;
    public int anInt1300;
    public Class44_Sub3_Sub3 aClass44_Sub3_Sub3_1301;
    public int anInt1302;
    public int anInt1303;
    public final byte[] aByteArray1304;
    public final byte[] aByteArray1305;
    public int anInt1306;
    public int anInt1307;
    public long aLong1308;
    public int anInt1309;
    public Class43_Sub1() {
        aBoolean1267 = true;
        aByte1269 = 0;
        anInt1270 = 477;
        anIntArrayArray1271 = new int[4][];
        anIntArrayArray1272 = new int[4][];
        aByteArrayArray1273 = new byte[4][];
        aBoolean1282 = true;
        aCRC32_1284 = new CRC32();
        aBoolean1285 = false;
        aClass31_1288 = new Class31((byte) 8);
        aClass28_1289 = new Class28(-822);
        aClass28_1290 = new Class28(-822);
        aClass28_1291 = new Class28(-822);
        aClass28_1292 = new Class28(-822);
        aClass28_1293 = new Class28(-822);
        aString1294 = "";
        aByteArray1304 = new byte[500];
        aByteArray1305 = new byte[65000];
    }

    public void method383(Class47 class47, client client1) {
        String[] as = {
                "model_version", "anim_version", "midi_version", "map_version"
        };
        for (int i = 0; i < 4; i++) {
            byte[] abyte0 = class47.method546(as[i], null);
            int j = abyte0.length / 2;
            Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(abyte0, (byte) 1);
            anIntArrayArray1271[i] = new int[j];
            aByteArrayArray1273[i] = new byte[j];
            for (int l = 0; l < j; l++)
                anIntArrayArray1271[i][l] = class44_sub3_sub2.get2();

        }

        String[] as1 = {
                "model_crc", "anim_crc", "midi_crc", "map_crc"
        };
        for (int k = 0; k < 4; k++) {
            byte[] abyte1 = class47.method546(as1[k], null);
            int i1 = abyte1.length / 4;
            Class44_Sub3_Sub2 class44_sub3_sub2_1 = new Class44_Sub3_Sub2(abyte1, (byte) 1);
            anIntArrayArray1272[k] = new int[i1];
            for (int l1 = 0; l1 < i1; l1++)
                anIntArrayArray1272[k][l1] = class44_sub3_sub2_1.get4();

        }

        byte[] abyte2 = class47.method546("model_index", null);
        int j1 = anIntArrayArray1271[0].length;
        aByteArray1275 = new byte[j1];
        for (int k1 = 0; k1 < j1; k1++)
            if (k1 < abyte2.length)
                aByteArray1275[k1] = abyte2[k1];
            else
                aByteArray1275[k1] = 0;

        abyte2 = class47.method546("map_index", null);
        Class44_Sub3_Sub2 class44_sub3_sub2_2 = new Class44_Sub3_Sub2(abyte2, (byte) 1);
        j1 = abyte2.length / 7;
        anIntArray1276 = new int[j1];
        anIntArray1277 = new int[j1];
        anIntArray1278 = new int[j1];
        anIntArray1279 = new int[j1];
        for (int i2 = 0; i2 < j1; i2++) {
            anIntArray1276[i2] = class44_sub3_sub2_2.get2();
            anIntArray1277[i2] = class44_sub3_sub2_2.get2();
            anIntArray1278[i2] = class44_sub3_sub2_2.get2();
            anIntArray1279[i2] = class44_sub3_sub2_2.get1();
        }

        abyte2 = class47.method546("anim_index", null);
        class44_sub3_sub2_2 = new Class44_Sub3_Sub2(abyte2, (byte) 1);
        j1 = abyte2.length / 2;
        anIntArray1280 = new int[j1];
        for (int j2 = 0; j2 < j1; j2++)
            anIntArray1280[j2] = class44_sub3_sub2_2.get2();

        abyte2 = class47.method546("midi_index", null);
        class44_sub3_sub2_2 = new Class44_Sub3_Sub2(abyte2, (byte) 1);
        j1 = abyte2.length;
        anIntArray1281 = new int[j1];
        for (int k2 = 0; k2 < j1; k2++)
            anIntArray1281[k2] = class44_sub3_sub2_2.get1();

        aClient1283 = client1;
        aBoolean1282 = true;
        aClient1283.method12(this, 2);
    }

    public void method384() {
        aBoolean1282 = false;
    }

    public int method385(int i, int j) {
        if (i != 0)
            aBoolean1267 = !aBoolean1267;
        return anIntArrayArray1271[j].length;
    }

    public int method386(int i) {
        if (i <= 0)
            return anInt1270;
        else
            return anIntArray1280.length;
    }

    public int method387(int i, int j, boolean flag, int k) {
        int l = (j << 8) + k;
        for (int i1 = 0; i1 < anIntArray1276.length; i1++)
            if (anIntArray1276[i1] == l)
                if (i == 0)
                    return anIntArray1277[i1];
                else
                    return anIntArray1278[i1];

        if (flag)
            aBoolean1267 = !aBoolean1267;
        return -1;
    }

    public void method388(boolean flag, int i) {
        if (i >= 0)
            return;
        int j = anIntArray1276.length;
        for (int k = 0; k < j; k++)
            if (flag || anIntArray1279[k] != 0) {
                method395((byte) 5, anIntArray1278[k], 3, (byte) 2);
                method395((byte) 5, anIntArray1277[k], 3, (byte) 2);
            }

    }

    public boolean method389(int i, int j) {
        if (j != 1) {
            for (int k = 1; k > 0; k++) ;
        }
        for (int l = 0; l < anIntArray1276.length; l++)
            if (anIntArray1278[l] == i)
                return true;

        return false;
    }

    public int method390(int i, byte byte0) {
        if (byte0 == 9)
            byte0 = 0;
        else
            anInt1268 = 154;
        return aByteArray1275[i] & 0xff;
    }

    public boolean method391(int i, boolean flag) {
        if (flag)
            anInt1268 = -117;
        return anIntArray1281[i] == 1;
    }

    public void method382(int i) {
        method392(0, i);
    }

    public void method392(int i, int j) {
        if (i < 0 || i > anIntArrayArray1271.length || j < 0 || j > anIntArrayArray1271[i].length)
            return;
        if (anIntArrayArray1271[i][j] == 0)
            return;
        synchronized (aClass31_1288) {
            for (Class44_Sub3_Sub3 class44_sub3_sub3 = (Class44_Sub3_Sub3) aClass31_1288.method266(); class44_sub3_sub3 != null; class44_sub3_sub3 = (Class44_Sub3_Sub3) aClass31_1288.method267(aByte1269))
                if (class44_sub3_sub3.anInt1387 == i && class44_sub3_sub3.anInt1388 == j)
                    return;

            Class44_Sub3_Sub3 class44_sub3_sub3_1 = new Class44_Sub3_Sub3();
            class44_sub3_sub3_1.anInt1387 = i;
            class44_sub3_sub3_1.anInt1388 = j;
            class44_sub3_sub3_1.aBoolean1391 = true;
            synchronized (aClass28_1289) {
                aClass28_1289.method256(class44_sub3_sub3_1);
            }
            aClass31_1288.method264(class44_sub3_sub3_1);
        }
    }

    public int method393() {
        synchronized (aClass31_1288) {
            int i = aClass31_1288.method268();
            return i;
        }
    }

    public Class44_Sub3_Sub3 method394() {
        Class44_Sub3_Sub3 class44_sub3_sub3;
        synchronized (aClass28_1292) {
            class44_sub3_sub3 = (Class44_Sub3_Sub3) aClass28_1292.method258();
        }
        if (class44_sub3_sub3 == null)
            return null;
        synchronized (aClass31_1288) {
            class44_sub3_sub3.method405();
        }
        if (class44_sub3_sub3.aByteArray1389 == null)
            return class44_sub3_sub3;
        int i = 0;
        try {
            GZIPInputStream gzipinputstream = new GZIPInputStream(new ByteArrayInputStream(class44_sub3_sub3.aByteArray1389));
            do {
                if (i == aByteArray1305.length)
                    throw new RuntimeException("buffer overflow!");
                int k = gzipinputstream.read(aByteArray1305, i, aByteArray1305.length - i);
                if (k == -1)
                    break;
                i += k;
            } while (true);
        } catch (IOException _ex) {
            throw new RuntimeException("error unzipping");
        }
        class44_sub3_sub3.aByteArray1389 = new byte[i];
        System.arraycopy(aByteArray1305, 0, class44_sub3_sub3.aByteArray1389, 0, i);

        return class44_sub3_sub3;
    }

    public void method395(byte byte0, int i, int j, byte byte1) {
        if (byte0 != 5) {
            for (int k = 1; k > 0; k++) ;
        }
        if (aClient1283.aClass45Array1225[0] == null)
            return;
        if (anIntArrayArray1271[j][i] == 0)
            return;
        byte[] abyte0 = aClient1283.aClass45Array1225[j + 1].method538((byte) 2, i);
        if (method402((byte) 103, anIntArrayArray1272[j][i], anIntArrayArray1271[j][i], abyte0))
            return;
        aByteArrayArray1273[j][i] = byte1;
        if (byte1 > anInt1274)
            anInt1274 = byte1;
        anInt1296++;
    }

    public void method396(byte byte0) {
        if (byte0 != 41)
            aBoolean1267 = !aBoolean1267;
        synchronized (aClass28_1293) {
            aClass28_1293.method263();
        }
    }

    public void method397(int i, int j, int k) {
        if (aClient1283.aClass45Array1225[0] == null)
            return;
        if (anIntArrayArray1271[j][k] == 0)
            return;
        if (aByteArrayArray1273[j][k] == 0)
            return;
        if (anInt1274 == 0)
            return;
        Class44_Sub3_Sub3 class44_sub3_sub3 = new Class44_Sub3_Sub3();
        class44_sub3_sub3.anInt1387 = j;
        class44_sub3_sub3.anInt1388 = k;
        class44_sub3_sub3.aBoolean1391 = false;
        synchronized (aClass28_1293) {
            aClass28_1293.method256(class44_sub3_sub3);
        }
        if (i != -21322)
            anInt1270 = 454;
    }

    public void run() {
        try {
            while (aBoolean1282) {
                anInt1309++;
                int i = 20;
                if (anInt1274 == 0 && aClient1283.aClass45Array1225[0] != null)
                    i = 50;
                try {
                    Thread.sleep(i);
                } catch (Exception ignored) {
                }
                aBoolean1285 = true;
                for (int j = 0; j < 100; j++) {
                    if (!aBoolean1285)
                        break;
                    aBoolean1285 = false;
                    method398((byte) 7);
                    method399(false);
                    if (anInt1286 == 0 && j >= 5)
                        break;
                    method400(0);
                    if (anInputStream1298 != null)
                        method401(-194);
                }

                boolean flag = false;
                for (Class44_Sub3_Sub3 class44_sub3_sub3 = (Class44_Sub3_Sub3) aClass28_1291.method259(); class44_sub3_sub3 != null; class44_sub3_sub3 = (Class44_Sub3_Sub3) aClass28_1291.method261(aByte1269))
                    if (class44_sub3_sub3.aBoolean1391) {
                        flag = true;
                        class44_sub3_sub3.anInt1390++;
                        if (class44_sub3_sub3.anInt1390 > 50) {
                            class44_sub3_sub3.anInt1390 = 0;
                            method403(class44_sub3_sub3, 295);
                        }
                    }

                if (!flag) {
                    for (Class44_Sub3_Sub3 class44_sub3_sub3_1 = (Class44_Sub3_Sub3) aClass28_1291.method259(); class44_sub3_sub3_1 != null; class44_sub3_sub3_1 = (Class44_Sub3_Sub3) aClass28_1291.method261(aByte1269)) {
                        flag = true;
                        class44_sub3_sub3_1.anInt1390++;
                        if (class44_sub3_sub3_1.anInt1390 > 50) {
                            class44_sub3_sub3_1.anInt1390 = 0;
                            method403(class44_sub3_sub3_1, 295);
                        }
                    }

                }
                if (flag) {
                    anInt1306++;
                    if (anInt1306 > 750) {
                        try {
                            aSocket1297.close();
                        } catch (Exception ignored) {
                        }
                        aSocket1297 = null;
                        anInputStream1298 = null;
                        anOutputStream1299 = null;
                        anInt1303 = 0;
                    }
                } else {
                    anInt1306 = 0;
                    aString1294 = "";
                }
                if (aClient1283.aBoolean905 && aSocket1297 != null && anOutputStream1299 != null && (anInt1274 > 0 || aClient1283.aClass45Array1225[0] == null)) {
                    anInt1307++;
                    if (anInt1307 > 500) {
                        anInt1307 = 0;
                        aByteArray1304[0] = 0;
                        aByteArray1304[1] = 0;
                        aByteArray1304[2] = 0;
                        aByteArray1304[3] = 10;
                        try {
                            anOutputStream1299.write(aByteArray1304, 0, 4);
                        } catch (IOException _ex) {
                            anInt1306 = 5000;
                        }
                    }
                }
            }
        } catch (Exception exception) {
            signlink.reporterror("od_ex " + exception.getMessage());
        }
    }

    public void method398(byte byte0) {
        if (byte0 == 7)
            byte0 = 0;
        else
            return;
        Class44_Sub3_Sub3 class44_sub3_sub3;
        synchronized (aClass28_1289) {
            class44_sub3_sub3 = (Class44_Sub3_Sub3) aClass28_1289.method258();
        }
        while (class44_sub3_sub3 != null) {
            aBoolean1285 = true;
            byte[] abyte0 = null;
            if (aClient1283.aClass45Array1225[0] != null)
                abyte0 = aClient1283.aClass45Array1225[class44_sub3_sub3.anInt1387 + 1].method538((byte) 2, class44_sub3_sub3.anInt1388);
            if (!method402((byte) 103, anIntArrayArray1272[class44_sub3_sub3.anInt1387][class44_sub3_sub3.anInt1388], anIntArrayArray1271[class44_sub3_sub3.anInt1387][class44_sub3_sub3.anInt1388], abyte0))
                abyte0 = null;
            synchronized (aClass28_1289) {
                if (abyte0 == null) {
                    aClass28_1290.method256(class44_sub3_sub3);
                } else {
                    class44_sub3_sub3.aByteArray1389 = abyte0;
                    synchronized (aClass28_1292) {
                        aClass28_1292.method256(class44_sub3_sub3);
                    }
                }
                class44_sub3_sub3 = (Class44_Sub3_Sub3) aClass28_1289.method258();
            }
        }
    }

    public void method399(boolean flag) {
        anInt1286 = 0;
        anInt1287 = 0;
        Class44_Sub3_Sub3 class44_sub3_sub3 = (Class44_Sub3_Sub3) aClass28_1291.method259();
        if (flag) {
            for (int i = 1; i > 0; i++) ;
        }
        for (; class44_sub3_sub3 != null; class44_sub3_sub3 = (Class44_Sub3_Sub3) aClass28_1291.method261(aByte1269))
            if (class44_sub3_sub3.aBoolean1391)
                anInt1286++;
            else
                anInt1287++;

        while (anInt1286 < 10) {
            Class44_Sub3_Sub3 class44_sub3_sub3_1 = (Class44_Sub3_Sub3) aClass28_1290.method258();
            if (class44_sub3_sub3_1 == null)
                break;
            if (aByteArrayArray1273[class44_sub3_sub3_1.anInt1387][class44_sub3_sub3_1.anInt1388] != 0)
                anInt1295++;
            aByteArrayArray1273[class44_sub3_sub3_1.anInt1387][class44_sub3_sub3_1.anInt1388] = 0;
            aClass28_1291.method256(class44_sub3_sub3_1);
            anInt1286++;
            method403(class44_sub3_sub3_1, 295);
            aBoolean1285 = true;
        }
    }

    public void method400(int i) {
        if (i != 0)
            return;
        while (anInt1286 == 0 && anInt1287 < 10) {
            if (anInt1274 == 0)
                break;
            Class44_Sub3_Sub3 class44_sub3_sub3;
            synchronized (aClass28_1293) {
                class44_sub3_sub3 = (Class44_Sub3_Sub3) aClass28_1293.method258();
            }
            while (class44_sub3_sub3 != null) {
                if (aByteArrayArray1273[class44_sub3_sub3.anInt1387][class44_sub3_sub3.anInt1388] != 0) {
                    aByteArrayArray1273[class44_sub3_sub3.anInt1387][class44_sub3_sub3.anInt1388] = 0;
                    aClass28_1291.method256(class44_sub3_sub3);
                    method403(class44_sub3_sub3, 295);
                    aBoolean1285 = true;
                    if (anInt1295 < anInt1296)
                        anInt1295++;
                    aString1294 = "Loading extra files - " + (anInt1295 * 100) / anInt1296 + "%";
                    anInt1287++;
                    if (anInt1287 == 10)
                        return;
                }
                synchronized (aClass28_1293) {
                    class44_sub3_sub3 = (Class44_Sub3_Sub3) aClass28_1293.method258();
                }
            }
            for (int j = 0; j < 4; j++) {
                byte[] abyte0 = aByteArrayArray1273[j];
                int k = abyte0.length;
                for (int l = 0; l < k; l++)
                    if (abyte0[l] == anInt1274) {
                        abyte0[l] = 0;
                        Class44_Sub3_Sub3 class44_sub3_sub3_1 = new Class44_Sub3_Sub3();
                        class44_sub3_sub3_1.anInt1387 = j;
                        class44_sub3_sub3_1.anInt1388 = l;
                        class44_sub3_sub3_1.aBoolean1391 = false;
                        aClass28_1291.method256(class44_sub3_sub3_1);
                        method403(class44_sub3_sub3_1, 295);
                        aBoolean1285 = true;
                        if (anInt1295 < anInt1296)
                            anInt1295++;
                        aString1294 = "Loading extra files - " + (anInt1295 * 100) / anInt1296 + "%";
                        anInt1287++;
                        if (anInt1287 == 10)
                            return;
                    }

            }

            anInt1274--;
        }
    }

    public void method401(int i) {
        if (i >= 0)
            return;
        try {
            int j = anInputStream1298.available();
            if (anInt1303 == 0 && j >= 6) {
                aBoolean1285 = true;
                for (int k = 0; k < 6; k += anInputStream1298.read(aByteArray1304, k, 6 - k)) ;
                int l = aByteArray1304[0] & 0xff;
                int j1 = ((aByteArray1304[1] & 0xff) << 8) + (aByteArray1304[2] & 0xff);
                int l1 = ((aByteArray1304[3] & 0xff) << 8) + (aByteArray1304[4] & 0xff);
                int i2 = aByteArray1304[5] & 0xff;
                aClass44_Sub3_Sub3_1301 = null;
                for (Class44_Sub3_Sub3 class44_sub3_sub3 = (Class44_Sub3_Sub3) aClass28_1291.method259(); class44_sub3_sub3 != null; class44_sub3_sub3 = (Class44_Sub3_Sub3) aClass28_1291.method261(aByte1269)) {
                    if (class44_sub3_sub3.anInt1387 == l && class44_sub3_sub3.anInt1388 == j1)
                        aClass44_Sub3_Sub3_1301 = class44_sub3_sub3;
                    if (aClass44_Sub3_Sub3_1301 != null)
                        class44_sub3_sub3.anInt1390 = 0;
                }

                if (aClass44_Sub3_Sub3_1301 != null) {
                    anInt1306 = 0;
                    if (l1 == 0) {
                        signlink.reporterror("Rej: " + l + "," + j1);
                        aClass44_Sub3_Sub3_1301.aByteArray1389 = null;
                        if (aClass44_Sub3_Sub3_1301.aBoolean1391)
                            synchronized (aClass28_1292) {
                                aClass28_1292.method256(aClass44_Sub3_Sub3_1301);
                            }
                        else
                            aClass44_Sub3_Sub3_1301.method404();
                        aClass44_Sub3_Sub3_1301 = null;
                    } else {
                        if (aClass44_Sub3_Sub3_1301.aByteArray1389 == null && i2 == 0)
                            aClass44_Sub3_Sub3_1301.aByteArray1389 = new byte[l1];
                        if (aClass44_Sub3_Sub3_1301.aByteArray1389 == null && i2 != 0)
                            throw new IOException("missing start of file");
                    }
                }
                anInt1302 = i2 * 500;
                anInt1303 = 500;
                if (anInt1303 > l1 - i2 * 500)
                    anInt1303 = l1 - i2 * 500;
            }
            if (anInt1303 > 0 && j >= anInt1303) {
                aBoolean1285 = true;
                byte[] abyte0 = aByteArray1304;
                int i1 = 0;
                if (aClass44_Sub3_Sub3_1301 != null) {
                    abyte0 = aClass44_Sub3_Sub3_1301.aByteArray1389;
                    i1 = anInt1302;
                }
                for (int k1 = 0; k1 < anInt1303; k1 += anInputStream1298.read(abyte0, k1 + i1, anInt1303 - k1)) ;
                if (anInt1303 + anInt1302 >= abyte0.length && aClass44_Sub3_Sub3_1301 != null) {
                    if (aClient1283.aClass45Array1225[0] != null)
                        aClient1283.aClass45Array1225[aClass44_Sub3_Sub3_1301.anInt1387 + 1].method539(abyte0.length, aClass44_Sub3_Sub3_1301.anInt1388, abyte0, (byte) 8);
                    if (!aClass44_Sub3_Sub3_1301.aBoolean1391 && aClass44_Sub3_Sub3_1301.anInt1387 == 3) {
                        aClass44_Sub3_Sub3_1301.aBoolean1391 = true;
                        aClass44_Sub3_Sub3_1301.anInt1387 = 93;
                    }
                    if (aClass44_Sub3_Sub3_1301.aBoolean1391)
                        synchronized (aClass28_1292) {
                            aClass28_1292.method256(aClass44_Sub3_Sub3_1301);
                        }
                    else
                        aClass44_Sub3_Sub3_1301.method404();
                }
                anInt1303 = 0;
            }
        } catch (IOException ioexception) {
            try {
                aSocket1297.close();
            } catch (Exception ignored) {
            }
            aSocket1297 = null;
            anInputStream1298 = null;
            anOutputStream1299 = null;
            anInt1303 = 0;
        }
    }

    public boolean method402(byte byte0, int i, int j, byte[] abyte0) {
        if (abyte0 == null || abyte0.length < 2)
            return false;
        int k = abyte0.length - 2;
        int l = ((abyte0[k] & 0xff) << 8) + (abyte0[k + 1] & 0xff);
        if (byte0 != 103) {
            for (int i1 = 1; i1 > 0; i1++) ;
        }
        aCRC32_1284.reset();
        aCRC32_1284.update(abyte0, 0, k);
        int j1 = (int) aCRC32_1284.getValue();
        if (l != j)
            return false;
        return j1 == i;
    }

    public void method403(Class44_Sub3_Sub3 class44_sub3_sub3, int i) {
        if (i <= 0)
            aBoolean1267 = !aBoolean1267;
        try {
            if (aSocket1297 == null) {
                long l = System.currentTimeMillis();
                if (l - aLong1308 < 4000L)
                    return;
                aLong1308 = l;
                aSocket1297 = aClient1283.method72(43594 + client.anInt1238);
                anInputStream1298 = aSocket1297.getInputStream();
                anOutputStream1299 = aSocket1297.getOutputStream();
                anOutputStream1299.write(15);
                for (int j = 0; j < 8; j++)
                    anInputStream1298.read();

                anInt1306 = 0;
            }
            aByteArray1304[0] = (byte) class44_sub3_sub3.anInt1387;
            aByteArray1304[1] = (byte) (class44_sub3_sub3.anInt1388 >> 8);
            aByteArray1304[2] = (byte) class44_sub3_sub3.anInt1388;
            if (class44_sub3_sub3.aBoolean1391)
                aByteArray1304[3] = 2;
            else if (!aClient1283.aBoolean905)
                aByteArray1304[3] = 1;
            else
                aByteArray1304[3] = 0;
            anOutputStream1299.write(aByteArray1304, 0, 4);
            anInt1307 = 0;
            anInt1300 = -10000;
            return;
        } catch (IOException ignored) {
        }
        try {
            aSocket1297.close();
        } catch (Exception ignored) {
        }
        aSocket1297 = null;
        anInputStream1298 = null;
        anOutputStream1299 = null;
        anInt1303 = 0;
        anInt1300++;
    }
}
