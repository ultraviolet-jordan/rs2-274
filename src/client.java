// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import sign.signlink;

import java.applet.AppletContext;
import java.awt.*;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Arrays;
import java.util.zip.CRC32;

public class client extends Applet_Sub1 {

    public static final int[] anIntArray1134 = {
            9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145,
            58654, 5027, 1457, 16565, 34991, 25486
    };
    public static final int[][] anIntArrayArray1241 = {
            {
                    6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433,
                    2983, 54193
            }, {
            8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153,
            56621, 4783, 1341, 16578, 35003, 25239
    }, {
            25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094,
            10153, 56621, 4783, 1341, 16578, 35003
    }, {
            4626, 11146, 6439, 12, 4758, 10270
    }, {
            4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574
    }
    };
    public static int anInt802;
    public static final String aString807 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\243$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    public static final int[] anIntArray809;
    public static int anInt842;
    public static int anInt880;
    public static int anInt900;
    public static int anInt901 = -303;
    public static boolean aBoolean926;
    public static final int anInt940 = 2;
    public static boolean aBoolean960 = true;
    public static int anInt969;
    public static int anInt981;
    public static int anInt996;
    public static int anInt997;
    public static final BigInteger modulus = new BigInteger("162430190928353386882632146152138366556903893421250065905926788305002913598741279965807059909202699204271028147694021897800880828551271056376952563662990058938569757225427782458272909700526404453366129377721860585519615956553971197160213430435103693906642984272798830316856805804216243600587987282455220060791");
    public static int anInt1028;
    public static int anInt1038;
    public static final BigInteger exponent = new BigInteger("65537");
    public static int anInt1052;
    public static int anInt1101;
    public static final byte aByte1102 = 7;
    public static int anInt1132;
    public static int anInt1137;
    public static int anInt1151;
    public static int anInt1157;
    public static boolean aBoolean1167;
    public static int anInt1195;
    public static int anInt1224 = -39788;
    public static int anInt1227;
    public static int anInt1232;
    public static int anInt1235;
    public static final int[] anIntArray1236;
    public static int anInt1237 = 10;
    public static int anInt1238;
    public static boolean aBoolean1239 = true;
    public static boolean aBoolean1240;
    public static Class44_Sub3_Sub4_Sub6_Sub1 aClass44_Sub3_Sub4_Sub6_Sub1_1252;
    public static boolean aBoolean1266;

    static {
        anIntArray809 = new int[32];
        int i = 2;
        for (int j = 0; j < 32; j++) {
            anIntArray809[j] = i - 1;
            i += i;
        }

        anIntArray1236 = new int[99];
        i = 0;
        for (int k = 0; k < 99; k++) {
            int l = k + 1;
            int i1 = (int) ((double) l + 300D * Math.pow(2D, (double) l / 7D));
            i += i1;
            anIntArray1236[k] = i / 4;
        }

    }

    public final int[] anIntArray973 = {
            0, 0, 0, 0, 1, 1, 1, 1, 1, 2,
            2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
            2, 2, 3
    };
    public final int anInt1067 = 100;
    public int anInt797;
    public byte aByte798;
    public String[] aStringArray799;
    public boolean[] aBooleanArray800;
    public int anInt801;
    public int anInt803;
    public int[] anIntArray804;
    public int anInt805;
    public int anInt806;
    public int anInt808;
    public int[] anIntArray810;
    public int anInt811;
    public int anInt812;
    public int anInt813;
    public int anInt814;
    public String aString815;
    public Class28[][][] aClass28ArrayArrayArray816;
    public long[] aLongArray817;
    public int anInt818;
    public boolean aBoolean819;
    public int anInt820;
    public int anInt821;
    public int anInt822;
    public int anInt823;
    public int anInt824;
    public int anInt825;
    public boolean aBoolean826;
    public byte[][][] aByteArrayArrayArray827;
    public String aString828;
    public String aString829;
    public int[] anIntArray830;
    public int[] anIntArray831;
    public int[] anIntArray832;
    public String[] aStringArray833;
    public int anInt834;
    public int anInt835;
    public byte aByte836;
    public int anInt837;
    public int[] anIntArray838;
    public int[] anIntArray839;
    public int anInt840;
    public boolean aBoolean841;
    public Class44_Sub3_Sub2 aClass44_Sub3_Sub2_843;
    public int[] anIntArray844;
    public int anInt845;
    public byte aByte846;
    public int anInt847;
    public int anInt848;
    public int anInt849;
    public int anInt850;
    public boolean aBoolean851;
    public Class34 aClass34_852;
    public Class34 aClass34_853;
    public Class34 aClass34_854;
    public Class34 aClass34_855;
    public Class34 aClass34_856;
    public Class34 aClass34_857;
    public Class34 aClass34_858;
    public Class34 aClass34_859;
    public Class34 aClass34_860;
    public Class5 aClass5_861;
    public Class34 aClass34_862;
    public Class34 aClass34_863;
    public Class34 aClass34_864;
    public Class34 aClass34_865;
    public int anInt866;
    public long aLong867;
    public int anInt868;
    public int anInt869;
    public int anInt870;
    public int anInt871;
    public int anInt872;
    public int anInt873;
    public int anInt874;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_875;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_876;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_877;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_878;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_879;
    public boolean aBoolean881;
    public int anInt882;
    public int[] anIntArray883;
    public int[] anIntArray884;
    public int[] anIntArray885;
    public byte[][] aByteArrayArray886;
    public int anInt887;
    public int anInt888;
    public int anInt889;
    public int anInt890;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_891;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_892;
    public int anInt893;
    public int anInt894;
    public int anInt895;
    public int anInt896;
    public int anInt897;
    public boolean aBoolean898;
    public boolean aBoolean899;
    public byte aByte902;
    public int[] anIntArray903;
    public int[] anIntArray904;
    public boolean aBoolean905;
    public boolean aBoolean906;
    public int anInt907;
    public int anInt908;
    public int anInt909;
    public int anInt910;
    public int anInt911;
    public int anInt912;
    public int anInt913;
    public Class44_Sub3_Sub1_Sub3[] aClass44_Sub3_Sub1_Sub3Array914;
    public Class36 aClass36_915;
    public int anInt916;
    public boolean aBoolean917;
    public int anInt918;
    public int anInt919;
    public int anInt920;
    public int anInt921;
    public int anInt922;
    public int anInt923;
    public Class28 aClass28_924;
    public int anInt925;
    public int anInt927;
    public boolean aBoolean928;
    public int anInt929;
    public boolean aBoolean930;
    public int anInt931;
    public String aString932;
    public String aString933;
    public int anInt934;
    public Class44_Sub3_Sub1_Sub2[] aClass44_Sub3_Sub1_Sub2Array935;
    public int[] anIntArray936;
    public int[] anIntArray937;
    public int[] anIntArray938;
    public int[] anIntArray939;
    public int anInt941;
    public Class47 aClass47_942;
    public Class44_Sub3_Sub1_Sub2[] aClass44_Sub3_Sub1_Sub2Array943;
    public Class46 aClass46_944;
    public boolean aBoolean945;
    public int anInt946;
    public int anInt947;
    public int[] anIntArray948;
    public String[] aStringArray949;
    public String[] aStringArray950;
    public String aString951;
    public Class44_Sub3_Sub1_Sub3[] aClass44_Sub3_Sub1_Sub3Array952;
    public byte[][] aByteArrayArray953;
    public final int[] anIntArray954 = {
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1
    };
    public int anInt955;
    public boolean aBoolean956;
    public int[][][] anIntArrayArrayArray957;
    public byte aByte958;
    public byte aByte959;
    public int anInt961;
    public int anInt962;
    public int anInt963;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_964;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_965;
    public int anInt966;
    public int anInt967;
    public int[] anIntArray968;
    public int anInt970;
    public boolean aBoolean971;
    public int anInt972;
    public boolean aBoolean974;
    public int anInt975;
    public boolean aBoolean976;
    public int[] anIntArray977;
    public int[] anIntArray978;
    public CRC32 aCRC32_979;
    public int anInt980;
    public boolean aBoolean982;
    public int anInt983;
    public String aString984;
    public final int[] anIntArray985 = {
            0xffff00, 0xff0000, 65280, 65535, 0xff00ff, 0xffffff
    };
    public int[][] anIntArrayArray986;
    public int anInt987;
    public int[] anIntArray988;
    public int[] anIntArray989;
    public Class34 aClass34_990;
    public Class34 aClass34_991;
    public Class34 aClass34_992;
    public int anInt993;
    public int anInt994;
    public int anInt995;
    public int[] anIntArray998;
    public int anInt999;
    public int anInt1000;
    public Class44_Sub3_Sub1_Sub2[] aClass44_Sub3_Sub1_Sub2Array1001;
    public boolean aBoolean1002;
    public int anInt1003;
    public Socket aSocket1004;
    public int anInt1005;
    public int anInt1006;
    public int anInt1007;
    public boolean aBoolean1008;
    public String aString1009;
    public int anInt1010;
    public int anInt1011;
    public int anInt1013;
    public byte aByte1014;
    public Class43_Sub1 aClass43_Sub1_1015;
    public int anInt1016;
    public boolean aBoolean1017;
    public Class44_Sub3_Sub1_Sub3[] aClass44_Sub3_Sub1_Sub3Array1018;
    public String aString1019;
    public int[][] anIntArrayArray1020;
    public int anInt1021;
    public int anInt1022;
    public int anInt1023;
    public boolean aBoolean1024;
    public int anInt1025;
    public int anInt1026;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1027;
    public int anInt1029;
    public int anInt1030;
    public int anInt1031;
    public byte aByte1032;
    public int anInt1033;
    public byte aByte1034;
    public boolean aBoolean1035;
    public int anInt1036;
    public int anInt1037;
    public Class34 aClass34_1039;
    public Class34 aClass34_1040;
    public Class34 aClass34_1041;
    public Class34 aClass34_1042;
    public Class34 aClass34_1043;
    public Class34 aClass34_1044;
    public Class34 aClass34_1045;
    public Class34 aClass34_1046;
    public Class34 aClass34_1047;
    public int[] anIntArray1048;
    public int anInt1049;
    public int anInt1051;
    public boolean aBoolean1053;
    public int[] anIntArray1054;
    public int anInt1055;
    public int anInt1056;
    public int anInt1057;
    public int anInt1058;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1059;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1060;
    public int anInt1061;
    public int anInt1062;
    public int anInt1063;
    public int anInt1064;
    public int[] anIntArray1065;
    public int anInt1066;
    public int[] anIntArray1068;
    public boolean aBoolean1069;
    public byte aByte1070;
    public byte aByte1071;
    public int anInt1072;
    public int[] anIntArray1073;
    public int anInt1074;
    public Class44_Sub3_Sub1_Sub4 aClass44_Sub3_Sub1_Sub4_1075;
    public Class44_Sub3_Sub1_Sub4 aClass44_Sub3_Sub1_Sub4_1076;
    public Class44_Sub3_Sub1_Sub4 aClass44_Sub3_Sub1_Sub4_1077;
    public Class44_Sub3_Sub1_Sub4 aClass44_Sub3_Sub1_Sub4_1078;
    public long aLong1079;
    public boolean aBoolean1080;
    public int anInt1081;
    public int anInt1082;
    public int[] anIntArray1083;
    public int[][] anIntArrayArray1084;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1085;
    public int anInt1086;
    public byte aByte1087;
    public byte[] aByteArray1088;
    public int[] anIntArray1089;
    public int anInt1090;
    public int anInt1091;
    public int[] anIntArray1092;
    public int[] anIntArray1093;
    public int[] anIntArray1094;
    public int[] anIntArray1095;
    public int[] anIntArray1096;
    public int[] anIntArray1097;
    public int[] anIntArray1098;
    public String[] aStringArray1099;
    public int anInt1100;
    public int anInt1103;
    public boolean aBoolean1104;
    public Class18[] aClass18Array1105;
    public Class44_Sub3_Sub2 aClass44_Sub3_Sub2_1106;
    public int[] anIntArray1107;
    public Class7 aClass7_1108;
    public boolean aBoolean1109;
    public int anInt1110;
    public int[] anIntArray1111;
    public int[] anIntArray1112;
    public int anInt1113;
    public String[] aStringArray1114;
    public int anInt1115;
    public int anInt1116;
    public byte aByte1117;
    public int anInt1118;
    public int anInt1119;
    public Class44_Sub3_Sub4_Sub6_Sub1[] aClass44_Sub3_Sub4_Sub6_Sub1Array1120;
    public int anInt1121;
    public int[] anIntArray1122;
    public int anInt1123;
    public int[] anIntArray1124;
    public Class44_Sub3_Sub2[] aClass44_Sub3_Sub2Array1125;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1126;
    public long aLong1127;
    public boolean aBoolean1128;
    public int anInt1129;
    public int anInt1130;
    public int anInt1131;
    public int anInt1133;
    public Class44_Sub3_Sub2 aClass44_Sub3_Sub2_1135;
    public int[] anIntArray1136;
    public int anInt1138;
    public int anInt1139;
    public int anInt1140;
    public boolean aBoolean1141;
    public int anInt1142;
    public int anInt1143;
    public int anInt1144;
    public int anInt1145;
    public boolean aBoolean1146;
    public String aString1147;
    public String aString1148;
    public boolean aBoolean1149;
    public int[] anIntArray1150;
    public boolean aBoolean1152;
    public int[] anIntArray1153;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1154;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1155;
    public Class28 aClass28_1156;
    public int anInt1158;
    public long[] aLongArray1159;
    public Class10 aClass10_1160;
    public boolean[] aBooleanArray1161;
    public int anInt1162;
    public int anInt1163;
    public int anInt1164;
    public int anInt1165;
    public int anInt1166;
    public boolean aBoolean1168;
    public boolean aBoolean1169;
    public int anInt1170;
    public int anInt1171;
    public int[] anIntArray1172;
    public int anInt1173;
    public boolean aBoolean1174;
    public boolean aBoolean1175;
    public int anInt1176;
    public int anInt1177;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1178;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1179;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1180;
    public int anInt1181;
    public String aString1182;
    public int anInt1183;
    public boolean aBoolean1184;
    public int anInt1185;
    public int anInt1186;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1187;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1188;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1189;
    public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1190;
    public int[] anIntArray1191;
    public int[] anIntArray1192;
    public int[] anIntArray1193;
    public int[] anIntArray1194;
    public int anInt1196;
    public int anInt1197;
    public int anInt1198;
    public String aString1199;
    public int anInt1200;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1201;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1202;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1203;
    public Class44_Sub3_Sub1_Sub2[] aClass44_Sub3_Sub1_Sub2Array1204;
    public int anInt1205;
    public int anInt1206;
    public int anInt1207;
    public int anInt1208;
    public int anInt1209;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1210;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1211;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1212;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1213;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1214;
    public Class44_Sub3_Sub1_Sub2[] aClass44_Sub3_Sub1_Sub2Array1215;
    public int anInt1216;
    public int anInt1217;
    public int anInt1218;
    public int anInt1219;
    public int anInt1220;
    public int anInt1221;
    public int anInt1222;
    public int anInt1223;
    public Class45[] aClass45Array1225;
    public boolean aBoolean1226;
    public Class28 aClass28_1228;
    public Class44_Sub3_Sub1_Sub3[] aClass44_Sub3_Sub1_Sub3Array1229;
    public long aLong1230;
    public long aLong1231;
    public int anInt1233;
    public int anInt1234;
    public int anInt1242;
    public int[] anIntArray1243;
    public int[] anIntArray1244;
    public int[] anIntArray1245;
    public int anInt1246;
    public int anInt1247;
    public int anInt1248;
    public boolean aBoolean1249;
    public int anInt1250;
    public byte aByte1251;
    public int[] anIntArray1253;
    public int anInt1254;
    public int anInt1255;
    public int anInt1256;
    public int anInt1257;
    public int anInt1258;
    public Class44_Sub3_Sub4_Sub6_Sub2[] aClass44_Sub3_Sub4_Sub6_Sub2Array1259;
    public int anInt1260;
    public int[] anIntArray1261;
    public boolean aBoolean1262;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1263;
    public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1264;
    public boolean aBoolean1265;
    public client() {
        aByte798 = 5;
        aStringArray799 = new String[5];
        aBooleanArray800 = new boolean[5];
        anInt801 = 443;
        anIntArray804 = new int[50];
        anInt806 = 477;
        anIntArray810 = new int[7];
        aClass28ArrayArrayArray816 = new Class28[4][104][104];
        aLongArray817 = new long[100];
        aBoolean819 = false;
        anInt825 = 0x332d25;
        aBoolean826 = false;
        aStringArray833 = new String[200];
        anInt835 = 2;
        aByte836 = 3;
        anIntArray838 = new int[4000];
        anIntArray839 = new int[4000];
        aBoolean841 = false;
        aClass44_Sub3_Sub2_843 = Class44_Sub3_Sub2.method467(-7939, 1);
        anIntArray844 = new int[5];
        anInt845 = -43664;
        aByte846 = -120;
        aBoolean851 = false;
        aClass5_861 = new Class5();
        aBoolean881 = true;
        anIntArray883 = new int[33];
        anIntArray884 = new int[Class29.anInt525];
        anIntArray885 = new int[9];
        anInt889 = 1;
        aBoolean898 = false;
        aBoolean899 = false;
        aByte902 = 90;
        anIntArray903 = new int[256];
        anIntArray904 = new int[5];
        aBoolean905 = false;
        aBoolean906 = false;
        aClass44_Sub3_Sub1_Sub3Array914 = new Class44_Sub3_Sub1_Sub3[2];
        aBoolean917 = false;
        aClass28_924 = new Class28(-822);
        aBoolean928 = false;
        aBoolean930 = true;
        anInt931 = 78;
        aString932 = "";
        aString933 = "";
        anInt934 = -1;
        aClass44_Sub3_Sub1_Sub2Array935 = new Class44_Sub3_Sub1_Sub2[20];
        anInt941 = -501;
        aClass44_Sub3_Sub1_Sub2Array943 = new Class44_Sub3_Sub1_Sub2[100];
        aBoolean945 = true;
        anInt946 = 12122;
        anInt947 = -1;
        anIntArray948 = new int[100];
        aStringArray949 = new String[100];
        aStringArray950 = new String[100];
        aString951 = "";
        aClass44_Sub3_Sub1_Sub3Array952 = new Class44_Sub3_Sub1_Sub3[13];
        aBoolean956 = false;
        aByte958 = 0;
        aByte959 = 86;
        anIntArray968 = new int[5];
        aBoolean971 = false;
        aBoolean974 = false;
        aBoolean976 = false;
        aCRC32_979 = new CRC32();
        aBoolean982 = true;
        aString984 = "";
        anIntArrayArray986 = new int[104][104];
        anIntArray988 = new int[1000];
        anIntArray989 = new int[1000];
        anIntArray998 = new int[5];
        anInt999 = -1;
        anInt1000 = -1;
        aClass44_Sub3_Sub1_Sub2Array1001 = new Class44_Sub3_Sub1_Sub2[20];
        aBoolean1002 = false;
        anInt1003 = 833;
        anInt1007 = 0x4d4233;
        aBoolean1008 = false;
        aString1009 = "";
        anInt1011 = -1;
        anInt1013 = 3;
        aByte1014 = 9;
        aBoolean1017 = false;
        aClass44_Sub3_Sub1_Sub3Array1018 = new Class44_Sub3_Sub1_Sub3[100];
        aString1019 = "";
        anIntArrayArray1020 = new int[104][104];
        aBoolean1024 = false;
        anInt1030 = -1;
        aByte1032 = -123;
        anInt1033 = 436;
        aByte1034 = 111;
        aBoolean1035 = false;
        anInt1036 = -593;
        anInt1037 = -1;
        anIntArray1048 = new int[50];
        aBoolean1053 = false;
        anIntArray1054 = new int[33];
        anIntArray1065 = new int[1000];
        anIntArray1068 = new int[100];
        aBoolean1069 = true;
        aByte1070 = 7;
        aByte1071 = 6;
        anIntArray1073 = new int[200];
        aBoolean1080 = true;
        anInt1081 = -1;
        anIntArray1083 = new int[50];
        anIntArrayArray1084 = new int[104][104];
        aByte1087 = -44;
        aByteArray1088 = new byte[16384];
        anIntArray1089 = new int[5];
        anInt1091 = 50;
        anIntArray1092 = new int[anInt1091];
        anIntArray1093 = new int[anInt1091];
        anIntArray1094 = new int[anInt1091];
        anIntArray1095 = new int[anInt1091];
        anIntArray1096 = new int[anInt1091];
        anIntArray1097 = new int[anInt1091];
        anIntArray1098 = new int[anInt1091];
        aStringArray1099 = new String[anInt1091];
        anInt1103 = -1;
        aBoolean1104 = false;
        aClass18Array1105 = new Class18[4];
        aClass44_Sub3_Sub2_1106 = Class44_Sub3_Sub2.method467(-7939, 1);
        anIntArray1107 = new int[2000];
        aBoolean1109 = false;
        anInt1110 = -1;
        anInt1113 = 5;
        aStringArray1114 = new String[500];
        aByte1117 = 86;
        anInt1118 = 2048;
        anInt1119 = 2047;
        aClass44_Sub3_Sub4_Sub6_Sub1Array1120 = new Class44_Sub3_Sub4_Sub6_Sub1[anInt1118];
        anIntArray1122 = new int[anInt1118];
        anIntArray1124 = new int[anInt1118];
        aClass44_Sub3_Sub2Array1125 = new Class44_Sub3_Sub2[anInt1118];
        aBoolean1128 = false;
        anInt1131 = -1;
        aClass44_Sub3_Sub2_1135 = Class44_Sub3_Sub2.method467(-7939, 1);
        anIntArray1136 = new int[151];
        aBoolean1141 = false;
        aBoolean1146 = false;
        aString1147 = "";
        aString1148 = "";
        aBoolean1149 = true;
        anIntArray1150 = new int[151];
        aBoolean1152 = true;
        anIntArray1153 = new int[Class29.anInt525];
        aClass28_1156 = new Class28(-822);
        anInt1158 = 0x23201b;
        aLongArray1159 = new long[200];
        aBooleanArray1161 = new boolean[5];
        aBoolean1168 = false;
        aBoolean1169 = false;
        anInt1171 = 1;
        anIntArray1172 = new int[2000];
        anInt1173 = -1;
        aBoolean1174 = false;
        aBoolean1175 = false;
        anInt1176 = -48671;
        anInt1177 = 0x766654;
        aString1182 = "";
        aBoolean1184 = true;
        anIntArray1191 = new int[500];
        anIntArray1192 = new int[500];
        anIntArray1193 = new int[500];
        anIntArray1194 = new int[500];
        aClass44_Sub3_Sub1_Sub2Array1204 = new Class44_Sub3_Sub1_Sub2[1000];
        anInt1205 = 128;
        anInt1209 = 814;
        aClass44_Sub3_Sub1_Sub2Array1215 = new Class44_Sub3_Sub1_Sub2[8];
        anInt1216 = -1;
        anInt1218 = 2;
        aClass45Array1225 = new Class45[5];
        aBoolean1226 = true;
        aClass28_1228 = new Class28(-822);
        anInt1242 = -1;
        anInt1247 = 2;
        aBoolean1249 = false;
        aByte1251 = -111;
        anIntArray1253 = new int[Class29.anInt525];
        aClass44_Sub3_Sub4_Sub6_Sub2Array1259 = new Class44_Sub3_Sub4_Sub6_Sub2[16384];
        anIntArray1261 = new int[16384];
        aBoolean1262 = false;
        aBoolean1265 = false;
    }

    public static void main(String[] args) {
        try {
            System.out.println("RS2 user client - release #" + 274);
            if (args.length != 5) {
                anInt1237 = 10;
                anInt1238 = 0;
                aBoolean1239 = true;
                method73(10969);
                signlink.storeid = 0;
                signlink.startpriv(InetAddress.getLocalHost());
                client client1 = new client();
                client1.method1(false, 765, 503);
                return;
            }
            anInt1237 = Integer.parseInt(args[0]);
            anInt1238 = Integer.parseInt(args[1]);
            if (args[2].equals("lowmem"))
                method54(true);
            else if (args[2].equals("highmem")) {
                method73(10969);
            } else {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                return;
            }
            if (args[3].equals("free"))
                aBoolean1239 = false;
            else if (args[3].equals("members")) {
                aBoolean1239 = true;
            } else {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                return;
            }
            signlink.storeid = Integer.parseInt(args[4]);
            signlink.startpriv(InetAddress.getLocalHost());
            client client1 = new client();
            client1.method1(false, 765, 503);
        } catch (Exception exception) {
        }
    }

    public static void method54(boolean flag) {
        Class36.aBoolean593 = true;
        Class44_Sub3_Sub1_Sub1.aBoolean1398 = true;
        if (!flag)
            anInt901 = -73;
        aBoolean1240 = true;
        Class3.aBoolean67 = true;
    }

    public static void method73(int i) {
        Class36.aBoolean593 = false;
        Class44_Sub3_Sub1_Sub1.aBoolean1398 = false;
        aBoolean1240 = false;
        if (i != 10969)
            anInt901 = -278;
        Class3.aBoolean67 = false;
    }

    public static String method77(int i, int j, int k) {
        if (i >= 0)
            throw new NullPointerException();
        int l = k - j;
        if (l < -9)
            return "@red@";
        if (l < -6)
            return "@or3@";
        if (l < -3)
            return "@or2@";
        if (l < 0)
            return "@or1@";
        if (l > 9)
            return "@gre@";
        if (l > 6)
            return "@gr3@";
        if (l > 3)
            return "@gr2@";
        if (l > 0)
            return "@gr1@";
        else
            return "@yel@";
    }

    public static String method97(int i, boolean flag) {
        String s = String.valueOf(i);
        if (flag)
            throw new NullPointerException();
        for (int j = s.length() - 3; j > 0; j -= 3)
            s = s.substring(0, j) + "," + s.substring(j);

        if (s.length() > 8)
            s = "@gre@" + s.substring(0, s.length() - 8) + " million @whi@(" + s + ")";
        else if (s.length() > 4)
            s = "@cya@" + s.substring(0, s.length() - 4) + "K @whi@(" + s + ")";
        return " " + s;
    }

    public static String method110(int i, int j) {
        if (i != 5)
            aBoolean960 = !aBoolean960;
        if (j < 0x186a0)
            return String.valueOf(j);
        if (j < 0x989680)
            return j / 1000 + "K";
        else
            return j / 0xf4240 + "M";
    }

    public boolean method14(int i, int j, int k) {
        j = 43 / j;
        boolean flag = false;
        Class5 class5 = Class5.aClass5Array103[k];
        for (int l = 0; l < class5.anIntArray125.length; l++) {
            if (class5.anIntArray125[l] == -1)
                break;
            Class5 class5_1 = Class5.aClass5Array103[class5.anIntArray125[l]];
            if (class5_1.anInt110 == 1)
                flag |= method14(i, 753, class5_1.anInt108);
            if (class5_1.anInt110 == 6 && (class5_1.anInt156 != -1 || class5_1.anInt157 != -1)) {
                boolean flag1 = method134(class5_1, 717);
                int i1;
                if (flag1)
                    i1 = class5_1.anInt157;
                else
                    i1 = class5_1.anInt156;
                if (i1 != -1) {
                    Class26 class26 = Class26.aClass26Array497[i1];
                    for (class5_1.anInt107 += i; class5_1.anInt107 > class26.method254(class5_1.anInt106, 41645); ) {
                        class5_1.anInt107 -= class26.method254(class5_1.anInt106, 41645) + 1;
                        class5_1.anInt106++;
                        if (class5_1.anInt106 >= class26.anInt498) {
                            class5_1.anInt106 -= class26.anInt502;
                            if (class5_1.anInt106 < 0 || class5_1.anInt106 >= class26.anInt498)
                                class5_1.anInt106 = 0;
                        }
                        flag = true;
                    }

                }
            }
        }

        return flag;
    }

    public void method15(int i) {
        if (i >= 0) {
            for (int j = 1; j > 0; j++) ;
        }
        int k = anInt1255;
        int l = anInt1256;
        int i1 = anInt1257;
        int j1 = anInt1258;
        int k1 = 0x5d5447;
        Class44_Sub3_Sub1.method411(j1, k1, i1, k, 0, l);
        Class44_Sub3_Sub1.method411(16, 0, i1 - 2, k + 1, 0, l + 1);
        Class44_Sub3_Sub1.method412(i1 - 2, 0, j1 - 19, k + 1, l + 18, 394);
        aClass44_Sub3_Sub1_Sub4_1077.method458(k + 3, "Choose Option", k1, l + 14, true);
        int l1 = super.anInt22;
        int i2 = super.anInt23;
        if (anInt1254 == 0) {
            l1 -= 4;
            i2 -= 4;
        }
        if (anInt1254 == 1) {
            l1 -= 553;
            i2 -= 205;
        }
        if (anInt1254 == 2) {
            l1 -= 17;
            i2 -= 357;
        }
        for (int j2 = 0; j2 < anInt980; j2++) {
            int k2 = l + 31 + (anInt980 - 1 - j2) * 15;
            int l2 = 0xffffff;
            if (l1 > k && l1 < k + i1 && i2 > k2 - 13 && i2 < k2 + 3)
                l2 = 0xffff00;
            aClass44_Sub3_Sub1_Sub4_1077.method460(aStringArray1114[j2], anInt1033, true, k2, k + 3, l2);
        }

    }

    public void method16(int i) {
        if (aClass34_1039 != null)
            return;
        super.aClass34_15 = null;
        aClass34_865 = null;
        aClass34_863 = null;
        aClass34_862 = null;
        aClass34_864 = null;
        aClass34_990 = null;
        aClass34_991 = null;
        aClass34_992 = null;
        aClass34_1042 = new Class34(265, anInt940, 128, method11(aByte1102));
        Class44_Sub3_Sub1.method409(8);
        aClass34_1043 = new Class34(265, anInt940, 128, method11(aByte1102));
        Class44_Sub3_Sub1.method409(8);
        aClass34_1039 = new Class34(171, anInt940, 509, method11(aByte1102));
        Class44_Sub3_Sub1.method409(8);
        aClass34_1040 = new Class34(132, anInt940, 360, method11(aByte1102));
        Class44_Sub3_Sub1.method409(8);
        if (i != -43664) {
            for (int j = 1; j > 0; j++) ;
        }
        aClass34_1041 = new Class34(200, anInt940, 360, method11(aByte1102));
        Class44_Sub3_Sub1.method409(8);
        aClass34_1044 = new Class34(238, anInt940, 202, method11(aByte1102));
        Class44_Sub3_Sub1.method409(8);
        aClass34_1045 = new Class34(238, anInt940, 203, method11(aByte1102));
        Class44_Sub3_Sub1.method409(8);
        aClass34_1046 = new Class34(94, anInt940, 74, method11(aByte1102));
        Class44_Sub3_Sub1.method409(8);
        aClass34_1047 = new Class34(94, anInt940, 75, method11(aByte1102));
        Class44_Sub3_Sub1.method409(8);
        if (aClass47_942 != null) {
            method59(0);
            method91(4);
        }
        aBoolean917 = true;
    }

    public void method17(int i, boolean flag, int j, int k, int l, int i1, int j1) {
        int k1 = 2048 - j & 0x7ff;
        int l1 = 2048 - i1 & 0x7ff;
        int i2 = 0;
        int j2 = 0;
        int k2 = j1;
        aBoolean905 &= flag;
        if (k1 != 0) {
            int l2 = Class44_Sub3_Sub4_Sub4.anIntArray1585[k1];
            int j3 = Class44_Sub3_Sub4_Sub4.anIntArray1586[k1];
            int l3 = j2 * j3 - k2 * l2 >> 16;
            k2 = j2 * l2 + k2 * j3 >> 16;
            j2 = l3;
        }
        if (l1 != 0) {
            int i3 = Class44_Sub3_Sub4_Sub4.anIntArray1585[l1];
            int k3 = Class44_Sub3_Sub4_Sub4.anIntArray1586[l1];
            int i4 = k2 * i3 + i2 * k3 >> 16;
            k2 = k2 * k3 - i2 * i3 >> 16;
            i2 = i4;
        }
        anInt820 = l - i2;
        anInt821 = k - j2;
        anInt822 = i - k2;
        anInt823 = j;
        anInt824 = i1;
    }

    public void method18(int i) {
        if (i != 31037)
            aClass44_Sub3_Sub2_843.put1(2);
        method74(3);
        if (anInt1145 == 1)
            aClass44_Sub3_Sub1_Sub2Array1215[anInt1144 / 100].method440(aByte1070, anInt1142 - 8 - 4, anInt1143 - 8 - 4);
        if (anInt1145 == 2) {
            aClass44_Sub3_Sub1_Sub2Array1215[4 + anInt1144 / 100].method440(aByte1070, anInt1142 - 8 - 4, anInt1143 - 8 - 4);
            anInt1101++;
            if (anInt1101 > 57) {
                anInt1101 = 0;
                aClass44_Sub3_Sub2_843.putOpcode(100);
            }
        }
        if (anInt1103 != -1) {
            method14(anInt975, 753, anInt1103);
            method127(0, Class5.aClass5Array103[anInt1103], 0, 0, (byte) 0);
        }
        if (anInt1037 != -1) {
            method14(anInt975, 753, anInt1037);
            method127(0, Class5.aClass5Array103[anInt1037], 0, 0, (byte) 0);
        }
        method107(940);
        if (!aBoolean851) {
            method68(4);
            method31(-303);
        } else if (anInt1254 == 0)
            method15(-593);
        if (anInt818 == 1)
            aClass44_Sub3_Sub1_Sub2Array1001[1].method440(aByte1070, 472, 296);
        if (anInt803 != 0) {
            int j = anInt803 / 50;
            int k = j / 60;
            j %= 60;
            if (j < 10) {
                aClass44_Sub3_Sub1_Sub4_1076.method458(4, "System update in: " + k + ":0" + j, 0xffff00, 329, true);
                return;
            }
            aClass44_Sub3_Sub1_Sub4_1076.method458(4, "System update in: " + k + ":" + j, 0xffff00, 329, true);
        }
    }

    public void method19(byte byte0) {
        try {
            anInt934 = -1;
            aClass28_924.method263();
            aClass28_1156.method263();
            Class44_Sub3_Sub1_Sub1.method421(-18849);
            method125(-501);
            aClass36_915.method278((byte) 52);
            for (int i = 0; i < 4; i++)
                aClass18Array1105[i].method231((byte) 5);

            System.gc();
            Class3 class3 = new Class3(104, anIntArrayArrayArray957, 104, -127, aByteArrayArrayArray827);
            int j1 = aByteArrayArray886.length;
            Class3.aBoolean67 = Class36.aBoolean593;
            for (int i2 = 0; i2 < j1; i2++) {
                int k2 = anIntArray830[i2] >> 8;
                int j3 = anIntArray830[i2] & 0xff;
                if (k2 == 33 && j3 >= 71 && j3 <= 73) {
                    Class3.aBoolean67 = false;
                    break;
                }
            }

            if (Class3.aBoolean67)
                aClass36_915.method279((byte) 4, anInt1062);
            else
                aClass36_915.method279((byte) 4, 0);
            aClass44_Sub3_Sub2_843.putOpcode(120);
            for (int l2 = 0; l2 < j1; l2++) {
                int k3 = (anIntArray830[l2] >> 8) * 64 - anInt1055;
                int j4 = (anIntArray830[l2] & 0xff) * 64 - anInt1056;
                byte[] abyte0 = aByteArrayArray886[l2];
                if (abyte0 != null)
                    class3.method158(false, (anInt922 - 6) * 8, abyte0, j4, (anInt923 - 6) * 8, k3);
            }

            for (int l3 = 0; l3 < j1; l3++) {
                int k4 = (anIntArray830[l3] >> 8) * 64 - anInt1055;
                int j5 = (anIntArray830[l3] & 0xff) * 64 - anInt1056;
                byte[] abyte2 = aByteArrayArray886[l3];
                if (abyte2 == null && anInt923 < 800)
                    class3.method157(j5, k4, 587, 64, 64);
            }

            aClass44_Sub3_Sub2_843.putOpcode(120);
            for (int l4 = 0; l4 < j1; l4++) {
                byte[] abyte1 = aByteArrayArray953[l4];
                if (abyte1 != null) {
                    int i6 = (anIntArray830[l4] >> 8) * 64 - anInt1055;
                    int k6 = (anIntArray830[l4] & 0xff) * 64 - anInt1056;
                    class3.method161(k6, abyte1, false, aClass36_915, i6, aClass18Array1105);
                }
            }

            aClass44_Sub3_Sub2_843.putOpcode(120);
            class3.method163(aClass18Array1105, false, aClass36_915);
            aClass34_864.method272(aBoolean960);
            aClass44_Sub3_Sub2_843.putOpcode(120);
            for (int k5 = 0; k5 < 104; k5++) {
                for (int j6 = 0; j6 < 104; j6++)
                    method52(k5, j6);

            }

            method89((byte) 4);
        } catch (Exception ignored) {
        }
        Class8.aClass39_252.method341();
        if (aBoolean1240 && signlink.cache_dat != null) {
            int j = aClass43_Sub1_1015.method385(anInt1235, 0);
            for (int l = 0; l < j; l++) {
                int k1 = aClass43_Sub1_1015.method390(l, (byte) 9);
                if ((k1 & 0x79) == 0)
                    Class44_Sub3_Sub4_Sub4.method502(l, -6375);
            }

        }
        System.gc();
        Class44_Sub3_Sub1_Sub1.method422(20, 2972);
        aClass43_Sub1_1015.method396((byte) 41);
        int k = (anInt922 - 6) / 8 - 1;
        int i1 = (anInt922 + 6) / 8 + 1;
        int l1 = (anInt923 - 6) / 8 - 1;
        int j2 = (anInt923 + 6) / 8 + 1;
        if (byte0 != 116)
            aClass44_Sub3_Sub2_843.put1(154);
        if (aBoolean1169) {
            k = 49;
            i1 = 50;
            l1 = 49;
            j2 = 50;
        }
        for (int i3 = k; i3 <= i1; i3++) {
            for (int i4 = l1; i4 <= j2; i4++)
                if (i3 == k || i3 == i1 || i4 == l1 || i4 == j2) {
                    int i5 = aClass43_Sub1_1015.method387(0, i3, false, i4);
                    if (i5 != -1)
                        aClass43_Sub1_1015.method397(-21322, 3, i5);
                    int l5 = aClass43_Sub1_1015.method387(1, i3, false, i4);
                    if (l5 != -1)
                        aClass43_Sub1_1015.method397(-21322, 3, l5);
                }

        }

    }

    public void method20(int i, int j) {
        i = 15 / i;
        signlink.wavevol = j;
    }

    public void method21(byte byte0) {
        if (anInt895 != 0)
            return;
        int i = super.anInt28;
        if (byte0 == 1)
            byte0 = 0;
        else
            return;
        if (anInt1196 == 1 && super.anInt29 >= 516 && super.anInt30 >= 160 && super.anInt29 <= 765 && super.anInt30 <= 205)
            i = 0;
        if (aBoolean851) {
            if (i != 1) {
                int j = super.anInt22;
                int i1 = super.anInt23;
                if (anInt1254 == 0) {
                    j -= 4;
                    i1 -= 4;
                }
                if (anInt1254 == 1) {
                    j -= 553;
                    i1 -= 205;
                }
                if (anInt1254 == 2) {
                    j -= 17;
                    i1 -= 357;
                }
                if (j < anInt1255 - 10 || j > anInt1255 + anInt1257 + 10 || i1 < anInt1256 - 10 || i1 > anInt1256 + anInt1258 + 10) {
                    aBoolean851 = false;
                    if (anInt1254 == 1)
                        aBoolean928 = true;
                    if (anInt1254 == 2)
                        aBoolean1109 = true;
                }
            }
            if (i == 1) {
                int k = anInt1255;
                int j1 = anInt1256;
                int l1 = anInt1257;
                int j2 = super.anInt29;
                int k2 = super.anInt30;
                if (anInt1254 == 0) {
                    j2 -= 4;
                    k2 -= 4;
                }
                if (anInt1254 == 1) {
                    j2 -= 553;
                    k2 -= 205;
                }
                if (anInt1254 == 2) {
                    j2 -= 17;
                    k2 -= 357;
                }
                int l2 = -1;
                for (int i3 = 0; i3 < anInt980; i3++) {
                    int j3 = j1 + 31 + (anInt980 - 1 - i3) * 15;
                    if (j2 > k && j2 < k + l1 && k2 > j3 - 13 && k2 < j3 + 3)
                        l2 = i3;
                }

                if (l2 != -1)
                    method60((byte) 6, l2);
                aBoolean851 = false;
                if (anInt1254 == 1)
                    aBoolean928 = true;
                if (anInt1254 == 2) {
                    aBoolean1109 = true;
                }
            }
        } else {
            if (i == 1 && anInt980 > 0) {
                int l = anIntArray1193[anInt980 - 1];
                if (l == 582 || l == 113 || l == 555 || l == 331 || l == 354 || l == 694 || l == 962 || l == 795 || l == 681 || l == 100 || l == 102 || l == 1328) {
                    int k1 = anIntArray1191[anInt980 - 1];
                    int i2 = anIntArray1192[anInt980 - 1];
                    Class5 class5 = Class5.aClass5Array103[i2];
                    if (class5.aBoolean130 || class5.aBoolean133) {
                        aBoolean1146 = false;
                        anInt1250 = 0;
                        anInt893 = i2;
                        anInt894 = k1;
                        anInt895 = 2;
                        anInt896 = super.anInt29;
                        anInt897 = super.anInt30;
                        if (Class5.aClass5Array103[i2].anInt109 == anInt1037)
                            anInt895 = 1;
                        if (Class5.aClass5Array103[i2].anInt109 == anInt1011)
                            anInt895 = 3;
                        return;
                    }
                }
            }
            if (i == 1 && (anInt1049 == 1 || method65(anInt980 - 1, (byte) 9)) && anInt980 > 2)
                i = 2;
            if (i == 1 && anInt980 > 0)
                method60((byte) 6, anInt980 - 1);
            if (i == 2 && anInt980 > 0)
                method95(0);
        }
    }

    public boolean method22(int i, String s) {
        if (s == null)
            return false;
        for (int j = 0; j < anInt1115; j++)
            if (s.equalsIgnoreCase(aStringArray833[j]))
                return true;

        while (i >= 0)
            aClass44_Sub3_Sub2_843.put1(39);
        return s.equalsIgnoreCase(aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1657);
    }

    public void method7(int i) {
        if (aBoolean1035 || aBoolean1174 || aBoolean898)
            return;
        anInt802++;
        if (!aBoolean905)
            method87(3);
        else
            method122(anInt1113);
        method23(0);
        if (i != 0)
            method6();
    }

    public void method23(int i) {
        if (i != 0) {
            for (int j = 1; j > 0; j++) ;
        }
        do {
            Class44_Sub3_Sub3 class44_sub3_sub3;
            do {
                class44_sub3_sub3 = aClass43_Sub1_1015.method394();
                if (class44_sub3_sub3 == null)
                    return;
                if (class44_sub3_sub3.anInt1387 == 0) {
                    Class44_Sub3_Sub4_Sub4.method501(class44_sub3_sub3.anInt1388, class44_sub3_sub3.aByteArray1389, 6);
                    if ((aClass43_Sub1_1015.method390(class44_sub3_sub3.anInt1388, (byte) 9) & 0x62) != 0) {
                        aBoolean928 = true;
                        if (anInt1011 != -1)
                            aBoolean1109 = true;
                    }
                }
                if (class44_sub3_sub3.anInt1387 == 1 && class44_sub3_sub3.aByteArray1389 != null)
                    Class11.method208(-958, class44_sub3_sub3.aByteArray1389);
                if (class44_sub3_sub3.anInt1387 == 2 && class44_sub3_sub3.anInt1388 == anInt1183 && class44_sub3_sub3.aByteArray1389 != null)
                    method76(aBoolean1184, class44_sub3_sub3.aByteArray1389, 7);
                if (class44_sub3_sub3.anInt1387 == 3 && anInt1129 == 1) {
                    for (int k = 0; k < aByteArrayArray886.length; k++) {
                        if (anIntArray831[k] == class44_sub3_sub3.anInt1388) {
                            aByteArrayArray886[k] = class44_sub3_sub3.aByteArray1389;
                            if (class44_sub3_sub3.aByteArray1389 == null)
                                anIntArray831[k] = -1;
                            break;
                        }
                        if (anIntArray832[k] != class44_sub3_sub3.anInt1388)
                            continue;
                        aByteArrayArray953[k] = class44_sub3_sub3.aByteArray1389;
                        if (class44_sub3_sub3.aByteArray1389 == null)
                            anIntArray832[k] = -1;
                        break;
                    }

                }
            } while (class44_sub3_sub3.anInt1387 != 93 || !aClass43_Sub1_1015.method389(class44_sub3_sub3.anInt1388, 1));
            Class3.method160((byte) -47, new Class44_Sub3_Sub2(class44_sub3_sub3.aByteArray1389, (byte) 1), aClass43_Sub1_1015);
        } while (true);
    }

    public boolean method24(Class5 class5, byte byte0) {
        int i = class5.anInt112;
        if (byte0 != 15)
            aClass44_Sub3_Sub2_843.put1(108);
        if (i >= 1 && i <= 200 || i >= 701 && i <= 900) {
            if (i >= 801)
                i -= 701;
            else if (i >= 701)
                i -= 601;
            else if (i >= 101)
                i -= 101;
            else
                i--;
            aStringArray1114[anInt980] = "Remove @whi@" + aStringArray833[i];
            anIntArray1193[anInt980] = 513;
            anInt980++;
            aStringArray1114[anInt980] = "Message @whi@" + aStringArray833[i];
            anIntArray1193[anInt980] = 902;
            anInt980++;
            return true;
        }
        if (i >= 401 && i <= 500) {
            aStringArray1114[anInt980] = "Remove @whi@" + class5.aString144;
            anIntArray1193[anInt980] = 884;
            anInt980++;
            return true;
        } else {
            return false;
        }
    }

    public void method25(int i, Class44_Sub3_Sub2 class44_sub3_sub2, int j) {
        do {
            if (class44_sub3_sub2.anInt1375 + 21 >= j * 8)
                break;
            int k = class44_sub3_sub2.getBit(14, (byte) -96);
            if (k == 16383)
                break;
            if (aClass44_Sub3_Sub4_Sub6_Sub2Array1259[k] == null)
                aClass44_Sub3_Sub4_Sub6_Sub2Array1259[k] = new Class44_Sub3_Sub4_Sub6_Sub2();
            Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1259[k];
            anIntArray1261[anInt1260++] = k;
            class44_sub3_sub4_sub6_sub2.anInt1644 = anInt802;
            class44_sub3_sub4_sub6_sub2.aClass12_1682 = Class12.method214(class44_sub3_sub2.getBit(11, (byte) -96));
            class44_sub3_sub4_sub6_sub2.anInt1603 = class44_sub3_sub4_sub6_sub2.aClass12_1682.aByte283;
            class44_sub3_sub4_sub6_sub2.anInt1647 = class44_sub3_sub4_sub6_sub2.aClass12_1682.anInt305;
            class44_sub3_sub4_sub6_sub2.anInt1606 = class44_sub3_sub4_sub6_sub2.aClass12_1682.anInt287;
            class44_sub3_sub4_sub6_sub2.anInt1607 = class44_sub3_sub4_sub6_sub2.aClass12_1682.anInt288;
            class44_sub3_sub4_sub6_sub2.anInt1608 = class44_sub3_sub4_sub6_sub2.aClass12_1682.anInt289;
            class44_sub3_sub4_sub6_sub2.anInt1609 = class44_sub3_sub4_sub6_sub2.aClass12_1682.anInt290;
            class44_sub3_sub4_sub6_sub2.anInt1604 = class44_sub3_sub4_sub6_sub2.aClass12_1682.anInt286;
            int l = class44_sub3_sub2.getBit(5, (byte) -96);
            if (l > 15)
                l -= 32;
            int i1 = class44_sub3_sub2.getBit(5, (byte) -96);
            if (i1 > 15)
                i1 -= 32;
            int j1 = class44_sub3_sub2.getBit(1, (byte) -96);
            class44_sub3_sub4_sub6_sub2.method529(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0] + l, j1 == 1, false, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0] + i1);
            int k1 = class44_sub3_sub2.getBit(1, (byte) -96);
            if (k1 == 1)
                anIntArray1124[anInt1123++] = k;
        } while (true);
        class44_sub3_sub2.accessBytes(941);
        if (i >= 0)
            anInt1235 = aClass46_944.method542();
    }

    public String method26(byte byte0, int i) {
        if (byte0 != aByte959)
            method6();
        if (i < 0x3b9ac9ff)
            return String.valueOf(i);
        else
            return "*";
    }

    public void method27(int i) {
        for (int j = 0; j < anInt929; j++)
            if (anIntArray1083[j] <= 0) {
                boolean flag = false;
                try {
                    if (anIntArray1048[j] == anInt1242 && anIntArray804[j] == anInt1131) {
                        if (!method46(0))
                            flag = true;
                    } else {
                        Class44_Sub3_Sub2 class44_sub3_sub2 = Class4.method176(anIntArray1048[j], anIntArray804[j], (byte) 5);
                        if (System.currentTimeMillis() + (long) (class44_sub3_sub2.anInt1374 / 22) > aLong1079 + (long) (anInt874 / 22)) {
                            anInt874 = class44_sub3_sub2.anInt1374;
                            aLong1079 = System.currentTimeMillis();
                            if (method146(class44_sub3_sub2.aByteArray1373, class44_sub3_sub2.anInt1374, (byte) 9)) {
                                anInt1242 = anIntArray1048[j];
                                anInt1131 = anIntArray804[j];
                            } else {
                                flag = true;
                            }
                        }
                    }
                } catch (Exception ignored) {
                }
                if (!flag || anIntArray1083[j] == -5) {
                    anInt929--;
                    for (int k = j; k < anInt929; k++) {
                        anIntArray1048[k] = anIntArray1048[k + 1];
                        anIntArray804[k] = anIntArray804[k + 1];
                        anIntArray1083[k] = anIntArray1083[k + 1];
                    }

                    j--;
                } else {
                    anIntArray1083[j] = -5;
                }
            } else {
                anIntArray1083[j]--;
            }

        if (i != 0)
            anInt1220 = -1;
        if (anInt927 > 0) {
            anInt927 -= 20;
            if (anInt927 < 0)
                anInt927 = 0;
            if (anInt927 == 0 && aBoolean1069 && !aBoolean1240) {
                anInt1183 = anInt1030;
                aBoolean1184 = true;
                aClass43_Sub1_1015.method392(2, anInt1183);
            }
        }
    }

    public void method28(int i, int j) {
        while (j >= 0) {
            for (int k = 1; k > 0; k++) ;
        }
        Class5 class5 = Class5.aClass5Array103[i];
        for (int l = 0; l < class5.anIntArray125.length; l++) {
            if (class5.anIntArray125[l] == -1)
                break;
            Class5 class5_1 = Class5.aClass5Array103[class5.anIntArray125[l]];
            if (class5_1.anInt110 == 1)
                method28(class5_1.anInt108, -147);
            class5_1.anInt106 = 0;
            class5_1.anInt107 = 0;
        }

    }

    public void method29(Class44_Sub3_Sub4_Sub6 class44_sub3_sub4_sub6, int i, int j) {
        while (i >= 0)
            method6();
        method30(361, class44_sub3_sub4_sub6.anInt1599, class44_sub3_sub4_sub6.anInt1600, j);
    }

    public void method30(int i, int j, int k, int l) {
        if (i <= 0)
            aClass28ArrayArrayArray816 = null;
        if (j < 128 || k < 128 || j > 13056 || k > 13056) {
            anInt999 = -1;
            anInt1000 = -1;
            return;
        }
        int i1 = method50(j, k, 0, anInt1062) - l;
        j -= anInt820;
        i1 -= anInt821;
        k -= anInt822;
        int j1 = Class44_Sub3_Sub4_Sub4.anIntArray1585[anInt823];
        int k1 = Class44_Sub3_Sub4_Sub4.anIntArray1586[anInt823];
        int l1 = Class44_Sub3_Sub4_Sub4.anIntArray1585[anInt824];
        int i2 = Class44_Sub3_Sub4_Sub4.anIntArray1586[anInt824];
        int j2 = k * l1 + j * i2 >> 16;
        k = k * i2 - j * l1 >> 16;
        j = j2;
        j2 = i1 * k1 - k * j1 >> 16;
        k = i1 * j1 + k * k1 >> 16;
        i1 = j2;
        if (k >= 50) {
            anInt999 = Class44_Sub3_Sub1_Sub1.anInt1403 + (j << 9) / k;
            anInt1000 = Class44_Sub3_Sub1_Sub1.anInt1404 + (i1 << 9) / k;
        } else {
            anInt999 = -1;
            anInt1000 = -1;
        }
    }

    public void method31(int i) {
        if (anInt980 < 2 && anInt811 == 0 && anInt1196 == 0)
            return;
        String s;
        if (anInt811 == 1 && anInt980 < 2)
            s = "Use " + aString815 + " with...";
        else if (anInt1196 == 1 && anInt980 < 2)
            s = aString1199 + "...";
        else
            s = aStringArray1114[anInt980 - 1];
        if (anInt980 > 2)
            s = s + "@whi@ / " + (anInt980 - 2) + " more options";
        aClass44_Sub3_Sub1_Sub4_1077.method461(anInt946, 4, s, 15, 0xffffff, anInt802 / 1000, true);
        while (i >= 0)
            return;
    }

    public void method32(boolean flag, boolean flag1) {
        for (int i = 0; i < anInt1260; i++) {
            Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1259[anIntArray1261[i]];
            int j = 0x20000000 + (anIntArray1261[i] << 14);
            if (class44_sub3_sub4_sub6_sub2 == null || !class44_sub3_sub4_sub6_sub2.method532(0) || class44_sub3_sub4_sub6_sub2.aClass12_1682.aBoolean301 != flag)
                continue;
            int k = class44_sub3_sub4_sub6_sub2.anInt1599 >> 7;
            int l = class44_sub3_sub4_sub6_sub2.anInt1600 >> 7;
            if (k < 0 || k >= 104 || l < 0 || l >= 104)
                continue;
            if (class44_sub3_sub4_sub6_sub2.anInt1603 == 1 && (class44_sub3_sub4_sub6_sub2.anInt1599 & 0x7f) == 64 && (class44_sub3_sub4_sub6_sub2.anInt1600 & 0x7f) == 64) {
                if (anIntArrayArray1020[k][l] == anInt868)
                    continue;
                anIntArrayArray1020[k][l] = anInt868;
            }
            aClass36_915.method289(method50(class44_sub3_sub4_sub6_sub2.anInt1599, class44_sub3_sub4_sub6_sub2.anInt1600, 0, anInt1062), class44_sub3_sub4_sub6_sub2, class44_sub3_sub4_sub6_sub2.anInt1599, j, class44_sub3_sub4_sub6_sub2.anInt1600, (byte) 1, (class44_sub3_sub4_sub6_sub2.anInt1603 - 1) * 64 + 60, class44_sub3_sub4_sub6_sub2.anInt1601, anInt1062, class44_sub3_sub4_sub6_sub2.aBoolean1602);
        }

        aBoolean905 &= flag1;
    }

    public void method33(int i, int j, byte byte0, Class44_Sub3_Sub1_Sub2 class44_sub3_sub1_sub2) {
        if (byte0 != aByte1251)
            aBoolean899 = !aBoolean899;
        int k = anInt1206 + anInt1217 & 0x7ff;
        int l = j * j + i * i;
        if (l > 6400)
            return;
        int i1 = Class44_Sub3_Sub4_Sub4.anIntArray1585[k];
        int j1 = Class44_Sub3_Sub4_Sub4.anIntArray1586[k];
        i1 = (i1 * 256) / (anInt1170 + 256);
        j1 = (j1 * 256) / (anInt1170 + 256);
        int k1 = i * i1 + j * j1 >> 16;
        int l1 = i * j1 - j * i1 >> 16;
        if (l > 2500) {
            class44_sub3_sub1_sub2.method446(945, ((94 + k1) - class44_sub3_sub1_sub2.anInt1436 / 2) + 4, aClass44_Sub3_Sub1_Sub3_1202, 83 - l1 - class44_sub3_sub1_sub2.anInt1437 / 2 - 4);
        } else {
            class44_sub3_sub1_sub2.method440(aByte1070, ((94 + k1) - class44_sub3_sub1_sub2.anInt1436 / 2) + 4, 83 - l1 - class44_sub3_sub1_sub2.anInt1437 / 2 - 4);
        }
    }

    public void method8(int i) {
        signlink.reporterror = false;
        try {
            if (aClass7_1108 != null)
                aClass7_1108.method191();
        } catch (Exception ignored) {
        }
        aClass7_1108 = null;
        method78(33993);
        if (aClass10_1160 != null)
            aClass10_1160.aBoolean259 = false;
        aClass10_1160 = null;
        aClass43_Sub1_1015.method384();
        aClass43_Sub1_1015 = null;
        aClass44_Sub3_Sub2_843 = null;
        aClass44_Sub3_Sub2_1106 = null;
        aClass44_Sub3_Sub2_1135 = null;
        anIntArray830 = null;
        aByteArrayArray886 = null;
        aByteArrayArray953 = null;
        anIntArray831 = null;
        anIntArray832 = null;
        anIntArrayArrayArray957 = null;
        aByteArrayArrayArray827 = null;
        aClass36_915 = null;
        aClass18Array1105 = null;
        anIntArrayArray986 = null;
        anIntArrayArray1084 = null;
        anIntArray838 = null;
        anIntArray839 = null;
        aByteArray1088 = null;
        aClass34_862 = null;
        aClass34_863 = null;
        aClass34_864 = null;
        aClass34_865 = null;
        aClass34_990 = null;
        aClass34_991 = null;
        aClass34_992 = null;
        aClass34_852 = null;
        aClass34_853 = null;
        aClass34_854 = null;
        aClass34_855 = null;
        aClass34_856 = null;
        aClass34_857 = null;
        aClass34_858 = null;
        aClass34_859 = null;
        aClass34_860 = null;
        aClass44_Sub3_Sub1_Sub3_1201 = null;
        aClass44_Sub3_Sub1_Sub3_1202 = null;
        aClass44_Sub3_Sub1_Sub3_1203 = null;
        aClass44_Sub3_Sub1_Sub3_1178 = null;
        aClass44_Sub3_Sub1_Sub3_1179 = null;
        aClass44_Sub3_Sub1_Sub3_1180 = null;
        aClass44_Sub3_Sub1_Sub3Array952 = null;
        aClass44_Sub3_Sub1_Sub3_875 = null;
        aClass44_Sub3_Sub1_Sub3_876 = null;
        aClass44_Sub3_Sub1_Sub3_877 = null;
        aClass44_Sub3_Sub1_Sub3_878 = null;
        aClass44_Sub3_Sub1_Sub3_879 = null;
        aClass44_Sub3_Sub1_Sub3_1210 = null;
        aClass44_Sub3_Sub1_Sub3_1211 = null;
        aClass44_Sub3_Sub1_Sub3_1212 = null;
        aClass44_Sub3_Sub1_Sub3_1213 = null;
        aClass44_Sub3_Sub1_Sub3_1214 = null;
        aClass44_Sub3_Sub1_Sub2_1085 = null;
        aClass44_Sub3_Sub1_Sub2Array935 = null;
        aClass44_Sub3_Sub1_Sub2Array1001 = null;
        aClass44_Sub3_Sub1_Sub2Array1215 = null;
        aClass44_Sub3_Sub1_Sub2_1187 = null;
        aClass44_Sub3_Sub1_Sub2_1188 = null;
        aClass44_Sub3_Sub1_Sub2_1189 = null;
        aClass44_Sub3_Sub1_Sub2_1190 = null;
        aClass44_Sub3_Sub1_Sub3Array1018 = null;
        aClass44_Sub3_Sub1_Sub2Array943 = null;
        anIntArrayArray1020 = null;
        aClass44_Sub3_Sub4_Sub6_Sub1Array1120 = null;
        anIntArray1122 = null;
        anIntArray1124 = null;
        aClass44_Sub3_Sub2Array1125 = null;
        anIntArray1065 = null;
        aClass44_Sub3_Sub4_Sub6_Sub2Array1259 = null;
        anIntArray1261 = null;
        aClass28ArrayArrayArray816 = null;
        aClass28_1228 = null;
        aClass28_1156 = null;
        aClass28_924 = null;
        anIntArray1191 = null;
        if (i != 22257)
            method6();
        anIntArray1192 = null;
        anIntArray1193 = null;
        anIntArray1194 = null;
        aStringArray1114 = null;
        anIntArray1107 = null;
        anIntArray988 = null;
        anIntArray989 = null;
        aClass44_Sub3_Sub1_Sub2Array1204 = null;
        aClass44_Sub3_Sub1_Sub2_1027 = null;
        aStringArray833 = null;
        aLongArray1159 = null;
        anIntArray1073 = null;
        aClass34_1042 = null;
        aClass34_1043 = null;
        aClass34_1039 = null;
        aClass34_1040 = null;
        aClass34_1041 = null;
        aClass34_1044 = null;
        aClass34_1045 = null;
        aClass34_1046 = null;
        aClass34_1047 = null;
        method114(0);
        Class8.method198((byte) 1);
        Class12.method213((byte) 1);
        Class14.method219((byte) 1);
        Class20.aClass20Array423 = null;
        Class22.aClass22Array455 = null;
        Class5.aClass5Array103 = null;
        Class24.aClass24Array480 = null;
        Class26.aClass26Array497 = null;
        Class32.aClass32Array547 = null;
        Class32.aClass39_559 = null;
        Class38.aClass38Array660 = null;
        super.aClass34_15 = null;
        Class44_Sub3_Sub4_Sub6_Sub1.aClass39_1680 = null;
        Class44_Sub3_Sub1_Sub1.method418((byte) 1);
        Class36.method277((byte) 1);
        Class44_Sub3_Sub4_Sub4.method499((byte) 1);
        Class11.method209((byte) 1);
        System.gc();
    }

    public int method34(boolean flag, Class5 class5, int i) {
        aBoolean905 &= flag;
        if (class5.anIntArrayArray118 == null || i >= class5.anIntArrayArray118.length)
            return -2;
        try {
            int[] ai = class5.anIntArrayArray118[i];
            int j = 0;
            int k = 0;
            int l = 0;
            do {
                int i1 = ai[k++];
                int j1 = 0;
                byte byte0 = 0;
                if (i1 == 0)
                    return j;
                if (i1 == 1)
                    j1 = anIntArray884[ai[k++]];
                if (i1 == 2)
                    j1 = anIntArray1153[ai[k++]];
                if (i1 == 3)
                    j1 = anIntArray1253[ai[k++]];
                if (i1 == 4) {
                    Class5 class5_1 = Class5.aClass5Array103[ai[k++]];
                    int j2 = ai[k++];
                    if (j2 >= 0 && j2 < Class14.anInt319 && (!Class14.method220(j2).aBoolean340 || aBoolean1239)) {
                        for (int i3 = 0; i3 < class5_1.anIntArray104.length; i3++)
                            if (class5_1.anIntArray104[i3] == j2 + 1)
                                j1 += class5_1.anIntArray105[i3];

                    }
                }
                if (i1 == 5)
                    j1 = anIntArray1107[ai[k++]];
                if (i1 == 6)
                    j1 = anIntArray1236[anIntArray1153[ai[k++]] - 1];
                if (i1 == 7)
                    j1 = (anIntArray1107[ai[k++]] * 100) / 46875;
                if (i1 == 8)
                    j1 = aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1663;
                if (i1 == 9) {
                    for (int k1 = 0; k1 < Class29.anInt525; k1++)
                        if (Class29.aBooleanArray527[k1])
                            j1 += anIntArray1153[k1];

                }
                if (i1 == 10) {
                    Class5 class5_2 = Class5.aClass5Array103[ai[k++]];
                    int k2 = ai[k++] + 1;
                    if (k2 >= 0 && k2 < Class14.anInt319 && (!Class14.method220(k2).aBoolean340 || aBoolean1239)) {
                        for (int j3 = 0; j3 < class5_2.anIntArray104.length; j3++) {
                            if (class5_2.anIntArray104[j3] != k2)
                                continue;
                            j1 = 0x3b9ac9ff;
                            break;
                        }

                    }
                }
                if (i1 == 11)
                    j1 = anInt840;
                if (i1 == 12)
                    j1 = anInt921;
                if (i1 == 13) {
                    int l1 = anIntArray1107[ai[k++]];
                    int l2 = ai[k++];
                    j1 = (l1 & 1 << l2) == 0 ? 0 : 1;
                }
                if (i1 == 14) {
                    int i2 = ai[k++];
                    Class35 class35 = Class35.aClass35Array580[i2];
                    int k3 = class35.anInt582;
                    int l3 = class35.anInt583;
                    int i4 = class35.anInt584;
                    int j4 = anIntArray809[i4 - l3];
                    j1 = anIntArray1107[k3] >> l3 & j4;
                }
                if (i1 == 15)
                    byte0 = 1;
                if (i1 == 16)
                    byte0 = 2;
                if (i1 == 17)
                    byte0 = 3;
                if (i1 == 18)
                    j1 = (aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 >> 7) + anInt1055;
                if (i1 == 19)
                    j1 = (aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 >> 7) + anInt1056;
                if (i1 == 20)
                    j1 = ai[k++];
                if (byte0 == 0) {
                    if (l == 0)
                        j += j1;
                    if (l == 1)
                        j -= j1;
                    if (l == 2 && j1 != 0)
                        j /= j1;
                    if (l == 3)
                        j *= j1;
                    l = 0;
                } else {
                    l = byte0;
                }
            } while (true);
        } catch (Exception _ex) {
            return -1;
        }
    }

    public void method35(byte byte0, Class5 class5) {
        int i = class5.anInt112;
        if (byte0 != aByte1032)
            return;
        if (i >= 1 && i <= 100 || i >= 701 && i <= 800) {
            if (i == 1 && anInt1116 == 0) {
                class5.aString144 = "Loading friend list";
                class5.anInt111 = 0;
                return;
            }
            if (i == 1 && anInt1116 == 1) {
                class5.aString144 = "Connecting to friendserver";
                class5.anInt111 = 0;
                return;
            }
            if (i == 2 && anInt1116 != 2) {
                class5.aString144 = "Please wait...";
                class5.anInt111 = 0;
                return;
            }
            int j = anInt1115;
            if (anInt1116 != 2)
                j = 0;
            if (i > 700)
                i -= 601;
            else
                i--;
            if (i >= j) {
                class5.aString144 = "";
                class5.anInt111 = 0;
                return;
            } else {
                class5.aString144 = aStringArray833[i];
                class5.anInt111 = 1;
                return;
            }
        }
        if (i >= 101 && i <= 200 || i >= 801 && i <= 900) {
            int k = anInt1115;
            if (anInt1116 != 2)
                k = 0;
            if (i > 800)
                i -= 701;
            else
                i -= 101;
            if (i >= k) {
                class5.aString144 = "";
                class5.anInt111 = 0;
                return;
            }
            if (anIntArray1073[i] == 0)
                class5.aString144 = "@red@Offline";
            else if (anIntArray1073[i] == anInt1237)
                class5.aString144 = "@gre@World-" + (anIntArray1073[i] - 9);
            else
                class5.aString144 = "@yel@World-" + (anIntArray1073[i] - 9);
            class5.anInt111 = 1;
            return;
        }
        if (i == 203) {
            int l = anInt1115;
            if (anInt1116 != 2)
                l = 0;
            class5.anInt122 = l * 15 + 20;
            if (class5.anInt122 <= class5.anInt114)
                class5.anInt122 = class5.anInt114 + 1;
            return;
        }
        if (i >= 401 && i <= 500)
            if ((i -= 401) >= anInt961) {
                class5.aString144 = "";
                class5.anInt111 = 0;
                return;
            } else {
                class5.aString144 = Class48.method551(131, Class48.method548(0, aLongArray817[i]));
                class5.anInt111 = 1;
                return;
            }
        if (i == 503) {
            class5.anInt122 = anInt961 * 15 + 20;
            if (class5.anInt122 <= class5.anInt114)
                class5.anInt122 = class5.anInt114 + 1;
            return;
        }
        if (i == 327) {
            class5.anInt159 = 150;
            class5.anInt160 = (int) (Math.sin((double) anInt802 / 40D) * 256D) & 0x7ff;
            if (aBoolean971) {
                for (int i1 = 0; i1 < 7; i1++) {
                    int j1 = anIntArray810[i1];
                    if (j1 >= 0 && !Class22.aClass22Array455[j1].method249(3))
                        return;
                }

                aBoolean971 = false;
                Class44_Sub3_Sub4_Sub4[] aclass44_sub3_sub4_sub4 = new Class44_Sub3_Sub4_Sub4[7];
                int k1 = 0;
                for (int l1 = 0; l1 < 7; l1++) {
                    int i2 = anIntArray810[l1];
                    if (i2 >= 0)
                        aclass44_sub3_sub4_sub4[k1++] = Class22.aClass22Array455[i2].method250((byte) 0);
                }

                Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = new Class44_Sub3_Sub4_Sub4(k1, -643, aclass44_sub3_sub4_sub4);
                for (int j2 = 0; j2 < 5; j2++)
                    if (anIntArray1089[j2] != 0) {
                        class44_sub3_sub4_sub4.method517(anIntArrayArray1241[j2][0], anIntArrayArray1241[j2][anIntArray1089[j2]]);
                        if (j2 == 1)
                            class44_sub3_sub4_sub4.method517(anIntArray1134[0], anIntArray1134[anIntArray1089[j2]]);
                    }

                class44_sub3_sub4_sub4.method510(9);
                class44_sub3_sub4_sub4.method511(Class26.aClass26Array497[aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1604].anIntArray499[0], -284);
                class44_sub3_sub4_sub4.method520(64, 850, -30, -50, -30, true);
                class5.anInt152 = 5;
                class5.anInt153 = 0;
                Class5.method185(0, 0, class44_sub3_sub4_sub4, 5);
            }
            return;
        }
        if (i == 324) {
            if (aClass44_Sub3_Sub1_Sub2_1059 == null) {
                aClass44_Sub3_Sub1_Sub2_1059 = class5.aClass44_Sub3_Sub1_Sub2_150;
                aClass44_Sub3_Sub1_Sub2_1060 = class5.aClass44_Sub3_Sub1_Sub2_151;
            }
            if (aBoolean982) {
                class5.aClass44_Sub3_Sub1_Sub2_150 = aClass44_Sub3_Sub1_Sub2_1060;
                return;
            } else {
                class5.aClass44_Sub3_Sub1_Sub2_150 = aClass44_Sub3_Sub1_Sub2_1059;
                return;
            }
        }
        if (i == 325) {
            if (aClass44_Sub3_Sub1_Sub2_1059 == null) {
                aClass44_Sub3_Sub1_Sub2_1059 = class5.aClass44_Sub3_Sub1_Sub2_150;
                aClass44_Sub3_Sub1_Sub2_1060 = class5.aClass44_Sub3_Sub1_Sub2_151;
            }
            if (aBoolean982) {
                class5.aClass44_Sub3_Sub1_Sub2_150 = aClass44_Sub3_Sub1_Sub2_1059;
                return;
            } else {
                class5.aClass44_Sub3_Sub1_Sub2_150 = aClass44_Sub3_Sub1_Sub2_1060;
                return;
            }
        }
        if (i == 600) {
            class5.aString144 = aString951;
            if (anInt802 % 20 < 10) {
                class5.aString144 += "|";
                return;
            } else {
                class5.aString144 += " ";
                return;
            }
        }
        if (i == 613)
            if (anInt866 >= 1) {
                if (aBoolean1128) {
                    class5.anInt146 = 0xff0000;
                    class5.aString144 = "Moderator option: Mute player for 48 hours: <ON>";
                } else {
                    class5.anInt146 = 0xffffff;
                    class5.aString144 = "Moderator option: Mute player for 48 hours: <OFF>";
                }
            } else {
                class5.aString144 = "";
            }
        if (i == 650 || i == 655)
            if (anInt970 != 0) {
                String s;
                if (anInt1010 == 0)
                    s = "earlier today";
                else if (anInt1010 == 1)
                    s = "yesterday";
                else
                    s = anInt1010 + " days ago";
                class5.aString144 = "You last logged in " + s + " from: " + signlink.dns;
            } else {
                class5.aString144 = "";
            }
        if (i == 651) {
            if (anInt887 == 0) {
                class5.aString144 = "0 unread messages";
                class5.anInt146 = 0xffff00;
            }
            if (anInt887 == 1) {
                class5.aString144 = "1 unread message";
                class5.anInt146 = 65280;
            }
            if (anInt887 > 1) {
                class5.aString144 = anInt887 + " unread messages";
                class5.anInt146 = 65280;
            }
        }
        if (i == 652)
            if (anInt1029 == 201) {
                if (anInt1100 == 1)
                    class5.aString144 = "@yel@This is a non-members world: @whi@Since you are a member we";
                else
                    class5.aString144 = "";
            } else if (anInt1029 == 200) {
                class5.aString144 = "You have not yet set any password recovery questions.";
            } else {
                String s1;
                if (anInt1029 == 0)
                    s1 = "Earlier today";
                else if (anInt1029 == 1)
                    s1 = "Yesterday";
                else
                    s1 = anInt1029 + " days ago";
                class5.aString144 = s1 + " you changed your recovery questions";
            }
        if (i == 653)
            if (anInt1029 == 201) {
                if (anInt1100 == 1)
                    class5.aString144 = "@whi@recommend you use a members world instead. You may use";
                else
                    class5.aString144 = "";
            } else if (anInt1029 == 200)
                class5.aString144 = "We strongly recommend you do so now to secure your account.";
            else
                class5.aString144 = "If you do not remember making this change then cancel it immediately";
        if (i == 654) {
            if (anInt1029 == 201)
                if (anInt1100 == 1) {
                    class5.aString144 = "@whi@this world but member benefits are unavailable whilst here.";
                    return;
                } else {
                    class5.aString144 = "";
                    return;
                }
            if (anInt1029 == 200) {
                class5.aString144 = "Do this from the 'account management' area on our front webpage";
                return;
            }
            class5.aString144 = "Do this from the 'account management' area on our front webpage";
        }
    }

    public void method36(int i, int j, int k, Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1, boolean flag) {
        if (!flag)
            return;
        if (class44_sub3_sub4_sub6_sub1 == aClass44_Sub3_Sub4_Sub6_Sub1_1252)
            return;
        if (anInt980 >= 400)
            return;
        String s;
        if (class44_sub3_sub4_sub6_sub1.anInt1664 == 0)
            s = class44_sub3_sub4_sub6_sub1.aString1657 + method77(-684, class44_sub3_sub4_sub6_sub1.anInt1663, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1663) + " (level-" + class44_sub3_sub4_sub6_sub1.anInt1663 + ")";
        else
            s = class44_sub3_sub4_sub6_sub1.aString1657 + " (skill-" + class44_sub3_sub4_sub6_sub1.anInt1664 + ")";
        if (anInt811 == 1) {
            aStringArray1114[anInt980] = "Use " + aString815 + " with @whi@" + s;
            anIntArray1193[anInt980] = 275;
            anIntArray1194[anInt980] = j;
            anIntArray1191[anInt980] = i;
            anIntArray1192[anInt980] = k;
            anInt980++;
        } else if (anInt1196 == 1) {
            if ((anInt1198 & 8) == 8) {
                aStringArray1114[anInt980] = aString1199 + " @whi@" + s;
                anIntArray1193[anInt980] = 131;
                anIntArray1194[anInt980] = j;
                anIntArray1191[anInt980] = i;
                anIntArray1192[anInt980] = k;
                anInt980++;
            }
        } else {
            for (int l = 4; l >= 0; l--)
                if (aStringArray799[l] != null) {
                    aStringArray1114[anInt980] = aStringArray799[l] + " @whi@" + s;
                    char c = '\0';
                    if (aStringArray799[l].equalsIgnoreCase("attack")) {
                        if (class44_sub3_sub4_sub6_sub1.anInt1663 > aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1663)
                            c = '\u07D0';
                    } else if (aBooleanArray800[l])
                        c = '\u07D0';
                    if (l == 0)
                        anIntArray1193[anInt980] = 639 + c;
                    if (l == 1)
                        anIntArray1193[anInt980] = 499 + c;
                    if (l == 2)
                        anIntArray1193[anInt980] = 27 + c;
                    if (l == 3)
                        anIntArray1193[anInt980] = 387 + c;
                    if (l == 4)
                        anIntArray1193[anInt980] = 185 + c;
                    anIntArray1194[anInt980] = j;
                    anIntArray1191[anInt980] = i;
                    anIntArray1192[anInt980] = k;
                    anInt980++;
                }

        }
        for (int i1 = 0; i1 < anInt980; i1++)
            if (anIntArray1193[i1] == 718) {
                aStringArray1114[i1] = "Walk here @whi@" + s;
                return;
            }

    }

    public void method37(int i) {
        anInt868++;
        method105(0, true);
        method32(true, true);
        method105(0, false);
        method32(false, true);
        method55(aBoolean1152);
        method70(false);
        if (!aBoolean1008) {
            int j = anInt1205;
            if (anInt1072 / 256 > j)
                j = anInt1072 / 256;
            if (aBooleanArray1161[4] && anIntArray904[4] + 128 > j)
                j = anIntArray904[4] + 128;
            int l = anInt1206 + anInt888 & 0x7ff;
            method17(anInt1022, true, j, method50(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600, 0, anInt1062) - 50, anInt1021, l, 600 + j * 3);
        }
        int k;
        if (!aBoolean1008)
            k = method120(-253);
        else
            k = method121(0);
        int i1 = anInt820;
        int j1 = anInt821;
        int k1 = anInt822;
        int l1 = anInt823;
        int i2 = anInt824;
        for (int j2 = 0; j2 < 5; j2++)
            if (aBooleanArray1161[j2]) {
                int k2 = (int) ((Math.random() * (double) (anIntArray998[j2] * 2 + 1) - (double) anIntArray998[j2]) + Math.sin((double) anIntArray968[j2] * ((double) anIntArray844[j2] / 100D)) * (double) anIntArray904[j2]);
                if (j2 == 0)
                    anInt820 += k2;
                if (j2 == 1)
                    anInt821 += k2;
                if (j2 == 2)
                    anInt822 += k2;
                if (j2 == 3)
                    anInt824 = anInt824 + k2 & 0x7ff;
                if (j2 == 4) {
                    anInt823 += k2;
                    if (anInt823 < 128)
                        anInt823 = 128;
                    if (anInt823 > 383)
                        anInt823 = 383;
                }
            }

        int l2 = Class44_Sub3_Sub1_Sub1.anInt1418;
        Class44_Sub3_Sub4_Sub4.aBoolean1580 = true;
        Class44_Sub3_Sub4_Sub4.anInt1583 = 0;
        Class44_Sub3_Sub4_Sub4.anInt1581 = super.anInt22 - 4;
        Class44_Sub3_Sub4_Sub4.anInt1582 = super.anInt23 - 4;
        Class44_Sub3_Sub1.method409(8);
        aClass36_915.method317(anInt820, -41301, anInt822, anInt824, anInt821, k, anInt823);
        aClass36_915.method292(-579);
        method115(0);
        method126(6905);
        method57(l2, 502);
        method18(31037);
        aClass34_864.method273(4, super.aGraphics14, (byte) 76, 4);
        anInt820 = i1;
        anInt821 = j1;
        anInt822 = k1;
        anInt823 = l1;
        anInt824 = i2;
        anInt1219 += i;
    }

    public void method38(boolean flag) {
        if (flag)
            anInt1220 = -1;
        if (super.anInt28 == 1) {
            if (super.anInt29 >= 6 && super.anInt29 <= 106 && super.anInt30 >= 467 && super.anInt30 <= 499) {
                anInt967 = (anInt967 + 1) % 4;
                aBoolean1141 = true;
                aBoolean1109 = true;
                aClass44_Sub3_Sub2_843.putOpcode(154);
                aClass44_Sub3_Sub2_843.put1(anInt967);
                aClass44_Sub3_Sub2_843.put1(anInt972);
                aClass44_Sub3_Sub2_843.put1(anInt805);
            }
            if (super.anInt29 >= 135 && super.anInt29 <= 235 && super.anInt30 >= 467 && super.anInt30 <= 499) {
                anInt972 = (anInt972 + 1) % 3;
                aBoolean1141 = true;
                aBoolean1109 = true;
                aClass44_Sub3_Sub2_843.putOpcode(154);
                aClass44_Sub3_Sub2_843.put1(anInt967);
                aClass44_Sub3_Sub2_843.put1(anInt972);
                aClass44_Sub3_Sub2_843.put1(anInt805);
            }
            if (super.anInt29 >= 273 && super.anInt29 <= 373 && super.anInt30 >= 467 && super.anInt30 <= 499) {
                anInt805 = (anInt805 + 1) % 3;
                aBoolean1141 = true;
                aBoolean1109 = true;
                aClass44_Sub3_Sub2_843.putOpcode(154);
                aClass44_Sub3_Sub2_843.put1(anInt967);
                aClass44_Sub3_Sub2_843.put1(anInt972);
                aClass44_Sub3_Sub2_843.put1(anInt805);
            }
            if (super.anInt29 >= 412 && super.anInt29 <= 512 && super.anInt30 >= 467 && super.anInt30 <= 499) {
                method45(false);
                aString951 = "";
                aBoolean1128 = false;
                for (int i = 0; i < Class5.aClass5Array103.length; i++)
                    if (Class5.aClass5Array103[i] != null && Class5.aClass5Array103[i].anInt112 == 600) {
                        anInt1081 = anInt1037 = Class5.aClass5Array103[i].anInt109;
                        return;
                    }

            }
        }
    }

    public boolean method39(int i, int j, int k, int l, int i1, int j1, int k1,
                            boolean flag, int l1, int i2, byte byte0, int j2) {
        byte byte1 = 104;
        byte byte2 = 104;
        for (int k2 = 0; k2 < byte1; k2++) {
            for (int l2 = 0; l2 < byte2; l2++) {
                anIntArrayArray986[k2][l2] = 0;
                anIntArrayArray1084[k2][l2] = 0x5f5e0ff;
            }

        }

        if (byte0 == 9)
            byte0 = 0;
        else
            anInt901 = aClass46_944.method542();
        int i3 = j1;
        int j3 = i;
        anIntArrayArray986[j1][i] = 99;
        anIntArrayArray1084[j1][i] = 0;
        int k3 = 0;
        int l3 = 0;
        anIntArray838[k3] = j1;
        anIntArray839[k3++] = i;
        boolean flag1 = false;
        int i4 = anIntArray838.length;
        int[][] ai = aClass18Array1105[anInt1062].anIntArrayArray411;
        while (l3 != k3) {
            i3 = anIntArray838[l3];
            j3 = anIntArray839[l3];
            l3 = (l3 + 1) % i4;
            if (i3 == j && j3 == i2) {
                flag1 = true;
                break;
            }
            if (k1 != 0) {
                if ((k1 < 5 || k1 == 10) && aClass18Array1105[anInt1062].method240(false, i3, l1, j, i2, k1 - 1, j3)) {
                    flag1 = true;
                    break;
                }
                if (k1 < 10 && aClass18Array1105[anInt1062].method241(j, i2, i3, k1 - 1, l1, j3, 6)) {
                    flag1 = true;
                    break;
                }
            }
            if (k != 0 && l != 0 && aClass18Array1105[anInt1062].method242(j, k, i1, 1, i2, j3, i3, l)) {
                flag1 = true;
                break;
            }
            int k4 = anIntArrayArray1084[i3][j3] + 1;
            if (i3 > 0 && anIntArrayArray986[i3 - 1][j3] == 0 && (ai[i3 - 1][j3] & 0x280108) == 0) {
                anIntArray838[k3] = i3 - 1;
                anIntArray839[k3] = j3;
                k3 = (k3 + 1) % i4;
                anIntArrayArray986[i3 - 1][j3] = 2;
                anIntArrayArray1084[i3 - 1][j3] = k4;
            }
            if (i3 < byte1 - 1 && anIntArrayArray986[i3 + 1][j3] == 0 && (ai[i3 + 1][j3] & 0x280180) == 0) {
                anIntArray838[k3] = i3 + 1;
                anIntArray839[k3] = j3;
                k3 = (k3 + 1) % i4;
                anIntArrayArray986[i3 + 1][j3] = 8;
                anIntArrayArray1084[i3 + 1][j3] = k4;
            }
            if (j3 > 0 && anIntArrayArray986[i3][j3 - 1] == 0 && (ai[i3][j3 - 1] & 0x280102) == 0) {
                anIntArray838[k3] = i3;
                anIntArray839[k3] = j3 - 1;
                k3 = (k3 + 1) % i4;
                anIntArrayArray986[i3][j3 - 1] = 1;
                anIntArrayArray1084[i3][j3 - 1] = k4;
            }
            if (j3 < byte2 - 1 && anIntArrayArray986[i3][j3 + 1] == 0 && (ai[i3][j3 + 1] & 0x280120) == 0) {
                anIntArray838[k3] = i3;
                anIntArray839[k3] = j3 + 1;
                k3 = (k3 + 1) % i4;
                anIntArrayArray986[i3][j3 + 1] = 4;
                anIntArrayArray1084[i3][j3 + 1] = k4;
            }
            if (i3 > 0 && j3 > 0 && anIntArrayArray986[i3 - 1][j3 - 1] == 0 && (ai[i3 - 1][j3 - 1] & 0x28010e) == 0 && (ai[i3 - 1][j3] & 0x280108) == 0 && (ai[i3][j3 - 1] & 0x280102) == 0) {
                anIntArray838[k3] = i3 - 1;
                anIntArray839[k3] = j3 - 1;
                k3 = (k3 + 1) % i4;
                anIntArrayArray986[i3 - 1][j3 - 1] = 3;
                anIntArrayArray1084[i3 - 1][j3 - 1] = k4;
            }
            if (i3 < byte1 - 1 && j3 > 0 && anIntArrayArray986[i3 + 1][j3 - 1] == 0 && (ai[i3 + 1][j3 - 1] & 0x280183) == 0 && (ai[i3 + 1][j3] & 0x280180) == 0 && (ai[i3][j3 - 1] & 0x280102) == 0) {
                anIntArray838[k3] = i3 + 1;
                anIntArray839[k3] = j3 - 1;
                k3 = (k3 + 1) % i4;
                anIntArrayArray986[i3 + 1][j3 - 1] = 9;
                anIntArrayArray1084[i3 + 1][j3 - 1] = k4;
            }
            if (i3 > 0 && j3 < byte2 - 1 && anIntArrayArray986[i3 - 1][j3 + 1] == 0 && (ai[i3 - 1][j3 + 1] & 0x280138) == 0 && (ai[i3 - 1][j3] & 0x280108) == 0 && (ai[i3][j3 + 1] & 0x280120) == 0) {
                anIntArray838[k3] = i3 - 1;
                anIntArray839[k3] = j3 + 1;
                k3 = (k3 + 1) % i4;
                anIntArrayArray986[i3 - 1][j3 + 1] = 6;
                anIntArrayArray1084[i3 - 1][j3 + 1] = k4;
            }
            if (i3 < byte1 - 1 && j3 < byte2 - 1 && anIntArrayArray986[i3 + 1][j3 + 1] == 0 && (ai[i3 + 1][j3 + 1] & 0x2801e0) == 0 && (ai[i3 + 1][j3] & 0x280180) == 0 && (ai[i3][j3 + 1] & 0x280120) == 0) {
                anIntArray838[k3] = i3 + 1;
                anIntArray839[k3] = j3 + 1;
                k3 = (k3 + 1) % i4;
                anIntArrayArray986[i3 + 1][j3 + 1] = 12;
                anIntArrayArray1084[i3 + 1][j3 + 1] = k4;
            }
        }
        anInt1006 = 0;
        if (!flag1) {
            if (flag) {
                int l4 = 100;
                for (int j5 = 1; j5 < 2; j5++) {
                    for (int l5 = j - j5; l5 <= j + j5; l5++) {
                        for (int j6 = i2 - j5; j6 <= i2 + j5; j6++)
                            if (l5 >= 0 && j6 >= 0 && l5 < 104 && j6 < 104 && anIntArrayArray1084[l5][j6] < l4) {
                                l4 = anIntArrayArray1084[l5][j6];
                                i3 = l5;
                                j3 = j6;
                                anInt1006 = 1;
                                flag1 = true;
                            }

                    }

                    if (flag1)
                        break;
                }

            }
            if (!flag1)
                return false;
        }
        l3 = 0;
        anIntArray838[l3] = i3;
        anIntArray839[l3++] = j3;
        int k5;
        for (int i5 = k5 = anIntArrayArray986[i3][j3]; i3 != j1 || j3 != i; i5 = anIntArrayArray986[i3][j3]) {
            if (i5 != k5) {
                k5 = i5;
                anIntArray838[l3] = i3;
                anIntArray839[l3++] = j3;
            }
            if ((i5 & 2) != 0)
                i3++;
            else if ((i5 & 8) != 0)
                i3--;
            if ((i5 & 1) != 0)
                j3++;
            else if ((i5 & 4) != 0)
                j3--;
        }

        if (l3 > 0) {
            int j4 = l3;
            if (j4 > 25)
                j4 = 25;
            l3--;
            int i6 = anIntArray838[l3];
            int k6 = anIntArray839[l3];
            if (j2 == 0) {
                aClass44_Sub3_Sub2_843.putOpcode(207);
                aClass44_Sub3_Sub2_843.put1(j4 + j4 + 3);
            }
            if (j2 == 1) {
                aClass44_Sub3_Sub2_843.putOpcode(86);
                aClass44_Sub3_Sub2_843.put1(j4 + j4 + 3 + 14);
            }
            if (j2 == 2) {
                aClass44_Sub3_Sub2_843.putOpcode(138);
                aClass44_Sub3_Sub2_843.put1(j4 + j4 + 3);
            }
            if (super.anIntArray32[5] == 1)
                aClass44_Sub3_Sub2_843.put1(1);
            else
                aClass44_Sub3_Sub2_843.put1(0);
            aClass44_Sub3_Sub2_843.put2(i6 + anInt1055);
            aClass44_Sub3_Sub2_843.put2(k6 + anInt1056);
            anInt1025 = anIntArray838[0];
            anInt1026 = anIntArray839[0];
            for (int l6 = 1; l6 < j4; l6++) {
                l3--;
                aClass44_Sub3_Sub2_843.put1(anIntArray838[l3] - i6);
                aClass44_Sub3_Sub2_843.put1(anIntArray839[l3] - k6);
            }

            return true;
        }
        return j2 != 1;
    }

    public URL getCodeBase() {
        if (signlink.mainapp != null)
            return signlink.mainapp.getCodeBase();
        try {
            if (super.aFrame_Sub1_17 != null)
                return new URL("http://127.0.0.1:" + (80 + anInt1238));
        } catch (Exception ignored) {
        }
        return super.getCodeBase();
    }

    public void method40(boolean flag, int i) {
        int j = Class38.aClass38Array660[i].anInt668;
        if (j == 0)
            return;
        int k = anIntArray1107[i];
        if (flag)
            aBoolean899 = !aBoolean899;
        if (j == 1) {
            if (k == 1)
                Class44_Sub3_Sub1_Sub1.method427(-42222, 0.90000000000000002D);
            if (k == 2)
                Class44_Sub3_Sub1_Sub1.method427(-42222, 0.80000000000000004D);
            if (k == 3)
                Class44_Sub3_Sub1_Sub1.method427(-42222, 0.69999999999999996D);
            if (k == 4)
                Class44_Sub3_Sub1_Sub1.method427(-42222, 0.59999999999999998D);
            Class14.aClass39_365.method341();
            aBoolean917 = true;
        }
        if (j == 3) {
            boolean flag1 = aBoolean1069;
            if (k == 0) {
                method109(0, aBoolean1069, 0);
                aBoolean1069 = true;
            }
            if (k == 1) {
                method109(0, aBoolean1069, -400);
                aBoolean1069 = true;
            }
            if (k == 2) {
                method109(0, aBoolean1069, -800);
                aBoolean1069 = true;
            }
            if (k == 3) {
                method109(0, aBoolean1069, -1200);
                aBoolean1069 = true;
            }
            if (k == 4)
                aBoolean1069 = false;
            if (aBoolean1069 != flag1 && !aBoolean1240) {
                if (aBoolean1069) {
                    anInt1183 = anInt1030;
                    aBoolean1184 = true;
                    aClass43_Sub1_1015.method392(2, anInt1183);
                } else {
                    method78(33993);
                }
                anInt927 = 0;
            }
        }
        if (j == 4) {
            if (k == 0) {
                aBoolean1080 = true;
                method20(678, 0);
            }
            if (k == 1) {
                aBoolean1080 = true;
                method20(678, -400);
            }
            if (k == 2) {
                aBoolean1080 = true;
                method20(678, -800);
            }
            if (k == 3) {
                aBoolean1080 = true;
                method20(678, -1200);
            }
            if (k == 4)
                aBoolean1080 = false;
        }
        if (j == 5)
            anInt1049 = k;
        if (j == 6)
            anInt1061 = k;
        if (j == 8) {
            anInt1074 = k;
            aBoolean1109 = true;
        }
        if (j == 9)
            anInt882 = k;
    }

    public void method41(int i, int j, int k, int l, int i1, int j1) {
        int k1 = aClass36_915.method304(i1, i, k);
        if (j1 != 15485)
            anInt1033 = aClass46_944.method542();
        if (k1 != 0) {
            int l1 = aClass36_915.method308(i1, i, k, k1);
            int k2 = l1 >> 6 & 3;
            int i3 = l1 & 0x1f;
            int k3 = j;
            if (k1 > 0)
                k3 = l;
            int[] ai = aClass44_Sub3_Sub1_Sub2_1027.anIntArray1431;
            int k4 = 24624 + i * 4 + (103 - k) * 512 * 4;
            int i5 = k1 >> 14 & 0x7fff;
            Class8 class8_2 = Class8.method199(i5);
            if (class8_2.anInt239 != -1) {
                Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3_2 = aClass44_Sub3_Sub1_Sub3Array1018[class8_2.anInt239];
                if (class44_sub3_sub1_sub3_2 != null) {
                    int i6 = (class8_2.anInt225 * 4 - class44_sub3_sub1_sub3_2.anInt1447) / 2;
                    int j6 = (class8_2.anInt226 * 4 - class44_sub3_sub1_sub3_2.anInt1448) / 2;
                    class44_sub3_sub1_sub3_2.method453(aByte1070, 48 + i * 4 + i6, 48 + (104 - k - class8_2.anInt226) * 4 + j6);
                }
            } else {
                if (i3 == 0 || i3 == 2)
                    if (k2 == 0) {
                        ai[k4] = k3;
                        ai[k4 + 512] = k3;
                        ai[k4 + 1024] = k3;
                        ai[k4 + 1536] = k3;
                    } else if (k2 == 1) {
                        ai[k4] = k3;
                        ai[k4 + 1] = k3;
                        ai[k4 + 2] = k3;
                        ai[k4 + 3] = k3;
                    } else if (k2 == 2) {
                        ai[k4 + 3] = k3;
                        ai[k4 + 3 + 512] = k3;
                        ai[k4 + 3 + 1024] = k3;
                        ai[k4 + 3 + 1536] = k3;
                    } else if (k2 == 3) {
                        ai[k4 + 1536] = k3;
                        ai[k4 + 1536 + 1] = k3;
                        ai[k4 + 1536 + 2] = k3;
                        ai[k4 + 1536 + 3] = k3;
                    }
                if (i3 == 3)
                    if (k2 == 0)
                        ai[k4] = k3;
                    else if (k2 == 1)
                        ai[k4 + 3] = k3;
                    else if (k2 == 2)
                        ai[k4 + 3 + 1536] = k3;
                    else if (k2 == 3)
                        ai[k4 + 1536] = k3;
                if (i3 == 2)
                    if (k2 == 3) {
                        ai[k4] = k3;
                        ai[k4 + 512] = k3;
                        ai[k4 + 1024] = k3;
                        ai[k4 + 1536] = k3;
                    } else if (k2 == 0) {
                        ai[k4] = k3;
                        ai[k4 + 1] = k3;
                        ai[k4 + 2] = k3;
                        ai[k4 + 3] = k3;
                    } else if (k2 == 1) {
                        ai[k4 + 3] = k3;
                        ai[k4 + 3 + 512] = k3;
                        ai[k4 + 3 + 1024] = k3;
                        ai[k4 + 3 + 1536] = k3;
                    } else if (k2 == 2) {
                        ai[k4 + 1536] = k3;
                        ai[k4 + 1536 + 1] = k3;
                        ai[k4 + 1536 + 2] = k3;
                        ai[k4 + 1536 + 3] = k3;
                    }
            }
        }
        k1 = aClass36_915.method306(i1, i, k);
        if (k1 != 0) {
            int i2 = aClass36_915.method308(i1, i, k, k1);
            int l2 = i2 >> 6 & 3;
            int j3 = i2 & 0x1f;
            int l3 = k1 >> 14 & 0x7fff;
            Class8 class8_1 = Class8.method199(l3);
            if (class8_1.anInt239 != -1) {
                Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3_1 = aClass44_Sub3_Sub1_Sub3Array1018[class8_1.anInt239];
                if (class44_sub3_sub1_sub3_1 != null) {
                    int j5 = (class8_1.anInt225 * 4 - class44_sub3_sub1_sub3_1.anInt1447) / 2;
                    int k5 = (class8_1.anInt226 * 4 - class44_sub3_sub1_sub3_1.anInt1448) / 2;
                    class44_sub3_sub1_sub3_1.method453(aByte1070, 48 + i * 4 + j5, 48 + (104 - k - class8_1.anInt226) * 4 + k5);
                }
            } else if (j3 == 9) {
                int l4 = 0xeeeeee;
                if (k1 > 0)
                    l4 = 0xee0000;
                int[] ai1 = aClass44_Sub3_Sub1_Sub2_1027.anIntArray1431;
                int l5 = 24624 + i * 4 + (103 - k) * 512 * 4;
                if (l2 == 0 || l2 == 2) {
                    ai1[l5 + 1536] = l4;
                    ai1[l5 + 1024 + 1] = l4;
                    ai1[l5 + 512 + 2] = l4;
                    ai1[l5 + 3] = l4;
                } else {
                    ai1[l5] = l4;
                    ai1[l5 + 512 + 1] = l4;
                    ai1[l5 + 1024 + 2] = l4;
                    ai1[l5 + 1536 + 3] = l4;
                }
            }
        }
        k1 = aClass36_915.method307(i1, i, k);
        if (k1 != 0) {
            int j2 = k1 >> 14 & 0x7fff;
            Class8 class8 = Class8.method199(j2);
            if (class8.anInt239 != -1) {
                Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3 = aClass44_Sub3_Sub1_Sub3Array1018[class8.anInt239];
                if (class44_sub3_sub1_sub3 != null) {
                    int i4 = (class8.anInt225 * 4 - class44_sub3_sub1_sub3.anInt1447) / 2;
                    int j4 = (class8.anInt226 * 4 - class44_sub3_sub1_sub3.anInt1448) / 2;
                    class44_sub3_sub1_sub3.method453(aByte1070, 48 + i * 4 + i4, 48 + (104 - k - class8.anInt226) * 4 + j4);
                }
            }
        }
    }

    public void method42(int i) {
        i = 15 / i;
        if (aBoolean1240 && anInt1129 == 2 && Class3.anInt68 != anInt1062) {
            aClass34_864.method272(aBoolean960);
            aClass44_Sub3_Sub1_Sub4_1076.method455(257, 151, 0, "Loading - please wait.", false);
            aClass44_Sub3_Sub1_Sub4_1076.method455(256, 150, 0xffffff, "Loading - please wait.", false);
            aClass34_864.method273(4, super.aGraphics14, (byte) 76, 4);
            anInt1129 = 1;
            aLong1127 = System.currentTimeMillis();
        }
        if (anInt1129 == 1) {
            int j = method43((byte) 2);
            if (j != 0 && System.currentTimeMillis() - aLong1127 > 0x57e40L) {
                signlink.reporterror(aString1147 + " glcfb " + aLong1231 + "," + j + "," + aBoolean1240 + "," + aClass45Array1225[0] + "," + aClass43_Sub1_1015.method393() + "," + anInt1062 + "," + anInt922 + "," + anInt923);
                aLong1127 = System.currentTimeMillis();
            }
        }
        if (anInt1129 == 2 && anInt1062 != anInt934) {
            anInt934 = anInt1062;
            method79(anInt1062, false);
        }
    }

    public int method43(byte byte0) {
        if (byte0 == 2)
            byte0 = 0;
        else
            aClass44_Sub3_Sub2_843.put1(128);
        for (int i = 0; i < aByteArrayArray886.length; i++) {
            if (aByteArrayArray886[i] == null && anIntArray831[i] != -1)
                return -1;
            if (aByteArrayArray953[i] == null && anIntArray832[i] != -1)
                return -2;
        }

        boolean flag = true;
        for (int j = 0; j < aByteArrayArray886.length; j++) {
            byte[] abyte0 = aByteArrayArray953[j];
            if (abyte0 != null) {
                int k = (anIntArray830[j] >> 8) * 64 - anInt1055;
                int l = (anIntArray830[j] & 0xff) * 64 - anInt1056;
                flag &= Class3.method159((byte) 106, abyte0, l, k);
            }
        }

        if (!flag)
            return -3;
        if (aBoolean1249) {
            return -4;
        } else {
            anInt1129 = 2;
            Class3.anInt68 = anInt1062;
            method19((byte) 116);
            aClass44_Sub3_Sub2_843.putOpcode(214);
            return 0;
        }
    }

    public void method44(int i, int j, int k, int l, boolean flag, int i1, int j1,
                         int k1) {
        if (flag) {
            for (int l1 = 1; l1 > 0; l1++) ;
        }
        if (k >= 1 && k1 >= 1 && k <= 102 && k1 <= 102) {
            if (aBoolean1240 && j1 != anInt1062)
                return;
            int i2 = 0;
            byte byte0 = -1;
            boolean flag1 = false;
            boolean flag2 = false;
            if (j == 0)
                i2 = aClass36_915.method304(j1, k, k1);
            if (j == 1)
                i2 = aClass36_915.method305(k1, k, j1, anInt1003);
            if (j == 2)
                i2 = aClass36_915.method306(j1, k, k1);
            if (j == 3)
                i2 = aClass36_915.method307(j1, k, k1);
            if (i2 != 0) {
                int i3 = aClass36_915.method308(j1, k, k1, i2);
                int j2 = i2 >> 14 & 0x7fff;
                int k2 = i3 & 0x1f;
                int l2 = i3 >> 6;
                if (j == 0) {
                    aClass36_915.method295(j1, k1, k, 45735);
                    Class8 class8 = Class8.method199(j2);
                    if (class8.aBoolean227)
                        aClass18Array1105[j1].method236((byte) 3, k2, class8.aBoolean228, l2, k1, k);
                }
                if (j == 1)
                    aClass36_915.method296(k1, j1, k, aByte846);
                if (j == 2) {
                    aClass36_915.method297(k1, j1, k, -870);
                    Class8 class8_1 = Class8.method199(j2);
                    if (k + class8_1.anInt225 > 103 || k1 + class8_1.anInt225 > 103 || k + class8_1.anInt226 > 103 || k1 + class8_1.anInt226 > 103)
                        return;
                    if (class8_1.aBoolean227)
                        aClass18Array1105[j1].method237(-585, class8_1.anInt225, k, k1, l2, class8_1.aBoolean228, class8_1.anInt226);
                }
                if (j == 3) {
                    aClass36_915.method298(k, (byte) 4, j1, k1);
                    Class8 class8_2 = Class8.method199(j2);
                    if (class8_2.aBoolean227 && class8_2.aBoolean229)
                        aClass18Array1105[j1].method239(k, 0, k1);
                }
            }
            if (i1 >= 0) {
                int j3 = j1;
                if (j3 < 3 && (aByteArrayArrayArray827[1][k][k1] & 2) == 2)
                    j3++;
                Class3.method174(aClass36_915, j3, j1, aBoolean1149, i1, l, i, aClass18Array1105[j1], anIntArrayArrayArray957, k1, k);
            }
        }
    }

    public void method45(boolean flag) {
        aClass44_Sub3_Sub2_843.putOpcode(51);
        if (anInt1216 != -1) {
            anInt1216 = -1;
            aBoolean928 = true;
            aBoolean1168 = false;
            aBoolean841 = true;
        }
        if (anInt1011 != -1) {
            anInt1011 = -1;
            aBoolean1109 = true;
            aBoolean1168 = false;
        }
        anInt1037 = -1;
        if (flag)
            anInt1220 = -1;
    }

    public boolean method46(int i) {
        if (i != 0)
            anInt1220 = aClass44_Sub3_Sub2_1135.get1();
        return signlink.wavereplay();
    }

    public void method47(int i) {
        if (i <= 0)
            aBoolean1152 = !aBoolean1152;
        if (anInt811 == 0 && anInt1196 == 0) {
            aStringArray1114[anInt980] = "Walk here";
            anIntArray1193[anInt980] = 718;
            anIntArray1191[anInt980] = super.anInt22;
            anIntArray1192[anInt980] = super.anInt23;
            anInt980++;
        }
        int j = -1;
        for (int k = 0; k < Class44_Sub3_Sub4_Sub4.anInt1583; k++) {
            int l = Class44_Sub3_Sub4_Sub4.anIntArray1584[k];
            int i1 = l & 0x7f;
            int j1 = l >> 7 & 0x7f;
            int k1 = l >> 29 & 3;
            int l1 = l >> 14 & 0x7fff;
            if (l != j) {
                j = l;
                if (k1 == 2 && aClass36_915.method308(anInt1062, i1, j1, l) >= 0) {
                    Class8 class8 = Class8.method199(l1);
                    if (anInt811 == 1) {
                        aStringArray1114[anInt980] = "Use " + aString815 + " with @cya@" + class8.aString221;
                        anIntArray1193[anInt980] = 810;
                        anIntArray1194[anInt980] = l;
                        anIntArray1191[anInt980] = i1;
                        anIntArray1192[anInt980] = j1;
                        anInt980++;
                    } else if (anInt1196 == 1) {
                        if ((anInt1198 & 4) == 4) {
                            aStringArray1114[anInt980] = aString1199 + " @cya@" + class8.aString221;
                            anIntArray1193[anInt980] = 899;
                            anIntArray1194[anInt980] = l;
                            anIntArray1191[anInt980] = i1;
                            anIntArray1192[anInt980] = j1;
                            anInt980++;
                        }
                    } else {
                        if (class8.aStringArray237 != null) {
                            for (int i2 = 4; i2 >= 0; i2--)
                                if (class8.aStringArray237[i2] != null) {
                                    aStringArray1114[anInt980] = class8.aStringArray237[i2] + " @cya@" + class8.aString221;
                                    if (i2 == 0)
                                        anIntArray1193[anInt980] = 625;
                                    if (i2 == 1)
                                        anIntArray1193[anInt980] = 721;
                                    if (i2 == 2)
                                        anIntArray1193[anInt980] = 743;
                                    if (i2 == 3)
                                        anIntArray1193[anInt980] = 357;
                                    if (i2 == 4)
                                        anIntArray1193[anInt980] = 1071;
                                    anIntArray1194[anInt980] = l;
                                    anIntArray1191[anInt980] = i1;
                                    anIntArray1192[anInt980] = j1;
                                    anInt980++;
                                }

                        }
                        aStringArray1114[anInt980] = "Examine @cya@" + class8.aString221;
                        anIntArray1193[anInt980] = 1381;
                        anIntArray1194[anInt980] = l;
                        anIntArray1191[anInt980] = i1;
                        anIntArray1192[anInt980] = j1;
                        anInt980++;
                    }
                }
                if (k1 == 1) {
                    Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1259[l1];
                    if (class44_sub3_sub4_sub6_sub2.aClass12_1682.aByte283 == 1 && (class44_sub3_sub4_sub6_sub2.anInt1599 & 0x7f) == 64 && (class44_sub3_sub4_sub6_sub2.anInt1600 & 0x7f) == 64) {
                        for (int j2 = 0; j2 < anInt1260; j2++) {
                            Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2_1 = aClass44_Sub3_Sub4_Sub6_Sub2Array1259[anIntArray1261[j2]];
                            if (class44_sub3_sub4_sub6_sub2_1 != null && class44_sub3_sub4_sub6_sub2_1 != class44_sub3_sub4_sub6_sub2 && class44_sub3_sub4_sub6_sub2_1.aClass12_1682.aByte283 == 1 && class44_sub3_sub4_sub6_sub2_1.anInt1599 == class44_sub3_sub4_sub6_sub2.anInt1599 && class44_sub3_sub4_sub6_sub2_1.anInt1600 == class44_sub3_sub4_sub6_sub2.anInt1600)
                                method133(0, i1, j1, class44_sub3_sub4_sub6_sub2_1.aClass12_1682, anIntArray1261[j2]);
                        }

                        for (int l2 = 0; l2 < anInt1121; l2++) {
                            Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1_1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1120[anIntArray1122[l2]];
                            if (class44_sub3_sub4_sub6_sub1_1 != null && class44_sub3_sub4_sub6_sub1_1.anInt1599 == class44_sub3_sub4_sub6_sub2.anInt1599 && class44_sub3_sub4_sub6_sub1_1.anInt1600 == class44_sub3_sub4_sub6_sub2.anInt1600)
                                method36(i1, anIntArray1122[l2], j1, class44_sub3_sub4_sub6_sub1_1, true);
                        }

                    }
                    method133(0, i1, j1, class44_sub3_sub4_sub6_sub2.aClass12_1682, l1);
                }
                if (k1 == 0) {
                    Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1120[l1];
                    if ((class44_sub3_sub4_sub6_sub1.anInt1599 & 0x7f) == 64 && (class44_sub3_sub4_sub6_sub1.anInt1600 & 0x7f) == 64) {
                        for (int k2 = 0; k2 < anInt1260; k2++) {
                            Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2_2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1259[anIntArray1261[k2]];
                            if (class44_sub3_sub4_sub6_sub2_2 != null && class44_sub3_sub4_sub6_sub2_2.aClass12_1682.aByte283 == 1 && class44_sub3_sub4_sub6_sub2_2.anInt1599 == class44_sub3_sub4_sub6_sub1.anInt1599 && class44_sub3_sub4_sub6_sub2_2.anInt1600 == class44_sub3_sub4_sub6_sub1.anInt1600)
                                method133(0, i1, j1, class44_sub3_sub4_sub6_sub2_2.aClass12_1682, anIntArray1261[k2]);
                        }

                        for (int i3 = 0; i3 < anInt1121; i3++) {
                            Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1_2 = aClass44_Sub3_Sub4_Sub6_Sub1Array1120[anIntArray1122[i3]];
                            if (class44_sub3_sub4_sub6_sub1_2 != null && class44_sub3_sub4_sub6_sub1_2 != class44_sub3_sub4_sub6_sub1 && class44_sub3_sub4_sub6_sub1_2.anInt1599 == class44_sub3_sub4_sub6_sub1.anInt1599 && class44_sub3_sub4_sub6_sub1_2.anInt1600 == class44_sub3_sub4_sub6_sub1.anInt1600)
                                method36(i1, anIntArray1122[i3], j1, class44_sub3_sub4_sub6_sub1_2, true);
                        }

                    }
                    method36(i1, l1, j1, class44_sub3_sub4_sub6_sub1, true);
                }
                if (k1 == 3) {
                    Class28 class28 = aClass28ArrayArrayArray816[anInt1062][i1][j1];
                    if (class28 != null) {
                        for (Class44_Sub3_Sub4_Sub2 class44_sub3_sub4_sub2 = (Class44_Sub3_Sub4_Sub2) class28.method260(false); class44_sub3_sub4_sub2 != null; class44_sub3_sub4_sub2 = (Class44_Sub3_Sub4_Sub2) class28.method262(false)) {
                            Class14 class14 = Class14.method220(class44_sub3_sub4_sub2.anInt1480);
                            if (anInt811 == 1) {
                                aStringArray1114[anInt980] = "Use " + aString815 + " with @lre@" + class14.aString327;
                                anIntArray1193[anInt980] = 111;
                                anIntArray1194[anInt980] = class44_sub3_sub4_sub2.anInt1480;
                                anIntArray1191[anInt980] = i1;
                                anIntArray1192[anInt980] = j1;
                                anInt980++;
                            } else if (anInt1196 == 1) {
                                if ((anInt1198 & 1) == 1) {
                                    aStringArray1114[anInt980] = aString1199 + " @lre@" + class14.aString327;
                                    anIntArray1193[anInt980] = 370;
                                    anIntArray1194[anInt980] = class44_sub3_sub4_sub2.anInt1480;
                                    anIntArray1191[anInt980] = i1;
                                    anIntArray1192[anInt980] = j1;
                                    anInt980++;
                                }
                            } else {
                                for (int j3 = 4; j3 >= 0; j3--)
                                    if (class14.aStringArray341 != null && class14.aStringArray341[j3] != null) {
                                        aStringArray1114[anInt980] = class14.aStringArray341[j3] + " @lre@" + class14.aString327;
                                        if (j3 == 0)
                                            anIntArray1193[anInt980] = 139;
                                        if (j3 == 1)
                                            anIntArray1193[anInt980] = 778;
                                        if (j3 == 2)
                                            anIntArray1193[anInt980] = 617;
                                        if (j3 == 3)
                                            anIntArray1193[anInt980] = 224;
                                        if (j3 == 4)
                                            anIntArray1193[anInt980] = 662;
                                        anIntArray1194[anInt980] = class44_sub3_sub4_sub2.anInt1480;
                                        anIntArray1191[anInt980] = i1;
                                        anIntArray1192[anInt980] = j1;
                                        anInt980++;
                                    } else if (j3 == 2) {
                                        aStringArray1114[anInt980] = "Take @lre@" + class14.aString327;
                                        anIntArray1193[anInt980] = 617;
                                        anIntArray1194[anInt980] = class44_sub3_sub4_sub2.anInt1480;
                                        anIntArray1191[anInt980] = i1;
                                        anIntArray1192[anInt980] = j1;
                                        anInt980++;
                                    }

                                aStringArray1114[anInt980] = "Examine @lre@" + class14.aString327;
                                anIntArray1193[anInt980] = 1152;
                                anIntArray1194[anInt980] = class44_sub3_sub4_sub2.anInt1480;
                                anIntArray1191[anInt980] = i1;
                                anIntArray1192[anInt980] = j1;
                                anInt980++;
                            }
                        }

                    }
                }
            }
        }

    }

    public void method48(String s, String s1, boolean flag) {
        signlink.errorname = s;
        try {
            if (!flag) {
                aString932 = "";
                aString933 = "Connecting to server...";
                method53(true, false);
            }
            aClass7_1108 = new Class7(-158, method72(43594 + anInt1238), this);
            long l = Class48.method547(s);
            int i = (int) (l >> 16 & 31L);
            aClass44_Sub3_Sub2_843.anInt1374 = 0;
            aClass44_Sub3_Sub2_843.put1(14);
            aClass44_Sub3_Sub2_843.put1(i);
            aClass7_1108.method195(2, -2584, aClass44_Sub3_Sub2_843.aByteArray1373, 0);
            for (int j = 0; j < 8; j++)
                aClass7_1108.method192();

            int k = aClass7_1108.method192();
            if (k == 0) {
                aClass7_1108.method194(aClass44_Sub3_Sub2_1135.aByteArray1373, 0, 8);
                aClass44_Sub3_Sub2_1135.anInt1374 = 0;
                aLong1231 = aClass44_Sub3_Sub2_1135.get8(0);
                int[] ai = new int[4];
                ai[0] = (int) (Math.random() * 99999999D);
                ai[1] = (int) (Math.random() * 99999999D);
                ai[2] = (int) (aLong1231 >> 32);
                ai[3] = (int) aLong1231;
                aClass44_Sub3_Sub2_843.anInt1374 = 0;
                aClass44_Sub3_Sub2_843.put1(10);
                aClass44_Sub3_Sub2_843.put4(ai[0]);
                aClass44_Sub3_Sub2_843.put4(ai[1]);
                aClass44_Sub3_Sub2_843.put4(ai[2]);
                aClass44_Sub3_Sub2_843.put4(ai[3]);
                aClass44_Sub3_Sub2_843.put4(signlink.uid);
                aClass44_Sub3_Sub2_843.putString(s);
                aClass44_Sub3_Sub2_843.putString(s1);
                aClass44_Sub3_Sub2_843.rsa(modulus, exponent, 4);
                aClass44_Sub3_Sub2_1106.anInt1374 = 0;
                if (flag)
                    aClass44_Sub3_Sub2_1106.put1(18);
                else
                    aClass44_Sub3_Sub2_1106.put1(16);
                aClass44_Sub3_Sub2_1106.put1(aClass44_Sub3_Sub2_843.anInt1374 + 36 + 1 + 1 + 2);
                aClass44_Sub3_Sub2_1106.put1(255);
                aClass44_Sub3_Sub2_1106.put2(274);
                aClass44_Sub3_Sub2_1106.put1(aBoolean1240 ? 1 : 0);
                for (int k1 = 0; k1 < 9; k1++)
                    aClass44_Sub3_Sub2_1106.put4(anIntArray885[k1]);

                aClass44_Sub3_Sub2_1106.putArray(aClass44_Sub3_Sub2_843.aByteArray1373, false, 0, aClass44_Sub3_Sub2_843.anInt1374);
                aClass44_Sub3_Sub2_843.aClass46_1378 = new Class46(true, ai);
                for (int i2 = 0; i2 < 4; i2++)
                    ai[i2] += 50;

                aClass46_944 = new Class46(true, ai);
                aClass7_1108.method195(aClass44_Sub3_Sub2_1106.anInt1374, -2584, aClass44_Sub3_Sub2_1106.aByteArray1373, 0);
                k = aClass7_1108.method192();
            }
            if (k == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception ignored) {
                }
                method48(s, s1, flag);
                return;
            }
            if (k == 2) {
                anInt866 = aClass7_1108.method192();
                aBoolean1167 = aClass7_1108.method192() == 1;
                aLong1230 = 0L;
                anInt983 = 0;
                aClass10_1160.anInt261 = 0;
                super.aBoolean19 = true;
                aBoolean945 = true;
                aBoolean905 = true;
                aClass44_Sub3_Sub2_843.anInt1374 = 0;
                aClass44_Sub3_Sub2_1135.anInt1374 = 0;
                anInt1220 = -1;
                anInt1138 = -1;
                anInt1139 = -1;
                anInt1140 = -1;
                anInt1219 = 0;
                anInt1221 = 0;
                anInt803 = 0;
                anInt1223 = 0;
                anInt1200 = 0;
                anInt980 = 0;
                aBoolean851 = false;
                super.anInt20 = 0;
                for (int i1 = 0; i1 < 100; i1++)
                    aStringArray950[i1] = null;

                anInt811 = 0;
                anInt1196 = 0;
                anInt1129 = 0;
                anInt929 = 0;
                anInt1246 = (int) (Math.random() * 100D) - 50;
                anInt834 = (int) (Math.random() * 110D) - 55;
                anInt888 = (int) (Math.random() * 80D) - 40;
                anInt1217 = (int) (Math.random() * 120D) - 60;
                anInt1170 = (int) (Math.random() * 30D) - 20;
                anInt1206 = (int) (Math.random() * 20D) - 10 & 0x7ff;
                anInt1031 = 0;
                anInt934 = -1;
                anInt1025 = 0;
                anInt1026 = 0;
                anInt1121 = 0;
                anInt1260 = 0;
                for (int l1 = 0; l1 < anInt1118; l1++) {
                    aClass44_Sub3_Sub4_Sub6_Sub1Array1120[l1] = null;
                    aClass44_Sub3_Sub2Array1125[l1] = null;
                }

                for (int j2 = 0; j2 < 16384; j2++)
                    aClass44_Sub3_Sub4_Sub6_Sub2Array1259[j2] = null;

                aClass44_Sub3_Sub4_Sub6_Sub1_1252 = aClass44_Sub3_Sub4_Sub6_Sub1Array1120[anInt1119] = new Class44_Sub3_Sub4_Sub6_Sub1();
                aClass28_1156.method263();
                aClass28_924.method263();
                for (int k2 = 0; k2 < 4; k2++) {
                    for (int l2 = 0; l2 < 104; l2++) {
                        for (int j3 = 0; j3 < 104; j3++)
                            aClass28ArrayArrayArray816[k2][l2][j3] = null;

                    }

                }

                aClass28_1228 = new Class28(-822);
                anInt1116 = 0;
                anInt1115 = 0;
                anInt1110 = -1;
                anInt1011 = -1;
                anInt1037 = -1;
                anInt1216 = -1;
                anInt1103 = -1;
                aBoolean1168 = false;
                anInt1013 = 3;
                aBoolean1104 = false;
                aBoolean851 = false;
                aBoolean1265 = false;
                aString829 = null;
                anInt818 = 0;
                anInt1173 = -1;
                aBoolean982 = true;
                method106(814);
                for (int i3 = 0; i3 < 5; i3++)
                    anIntArray1089[i3] = 0;

                for (int k3 = 0; k3 < 5; k3++) {
                    aStringArray799[k3] = null;
                    aBooleanArray800[k3] = false;
                }

                anInt1232 = 0;
                anInt969 = 0;
                anInt1151 = 0;
                anInt900 = 0;
                anInt1052 = 0;
                anInt1157 = 0;
                anInt1195 = 0;
                anInt880 = 0;
                anInt1028 = 0;
                anInt1137 = 0;
                method92(70);
                return;
            }
            if (k == 3) {
                aString932 = "";
                aString933 = "Invalid username or password.";
                return;
            }
            if (k == 4) {
                aString932 = "Your account has been disabled.";
                aString933 = "Please check your message-centre for details.";
                return;
            }
            if (k == 5) {
                aString932 = "Your account is already logged in.";
                aString933 = "Try again in 60 secs...";
                return;
            }
            if (k == 6) {
                aString932 = "RuneScape has been updated!";
                aString933 = "Please reload this page.";
                return;
            }
            if (k == 7) {
                aString932 = "This world is full.";
                aString933 = "Please use a different world.";
                return;
            }
            if (k == 8) {
                aString932 = "Unable to connect.";
                aString933 = "Login server offline.";
                return;
            }
            if (k == 9) {
                aString932 = "Login limit exceeded.";
                aString933 = "Too many connections from your address.";
                return;
            }
            if (k == 10) {
                aString932 = "Unable to connect.";
                aString933 = "Bad session id.";
                return;
            }
            if (k == 11) {
                aString933 = "Login server rejected session.";
                aString933 = "Please try again.";
                return;
            }
            if (k == 12) {
                aString932 = "You need a members account to login to this world.";
                aString933 = "Please subscribe, or use a different world.";
                return;
            }
            if (k == 13) {
                aString932 = "Could not complete login.";
                aString933 = "Please try using a different world.";
                return;
            }
            if (k == 14) {
                aString932 = "The server is being updated.";
                aString933 = "Please wait 1 minute and try again.";
                return;
            }
            if (k == 15) {
                aBoolean905 = true;
                aClass44_Sub3_Sub2_843.anInt1374 = 0;
                aClass44_Sub3_Sub2_1135.anInt1374 = 0;
                anInt1220 = -1;
                anInt1138 = -1;
                anInt1139 = -1;
                anInt1140 = -1;
                anInt1219 = 0;
                anInt1221 = 0;
                anInt803 = 0;
                anInt980 = 0;
                aBoolean851 = false;
                aLong1127 = System.currentTimeMillis();
                return;
            }
            if (k == 16) {
                aString932 = "Login attempts exceeded.";
                aString933 = "Please wait 1 minute and try again.";
                return;
            }
            if (k == 17) {
                aString932 = "You are standing in a members-only area.";
                aString933 = "To play on this world move to a free area first";
                return;
            }
            if (k == 20) {
                aString932 = "Invalid loginserver requested";
                aString933 = "Please try using a different world.";
                return;
            }
            if (k == 21) {
                for (int j1 = aClass7_1108.method192(); j1 >= 0; j1--) {
                    aString932 = "You have only just left another world";
                    aString933 = "Your profile will be transferred in: " + j1 + " seconds";
                    method53(true, false);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception ignored) {
                    }
                }

                method48(s, s1, flag);
                return;
            }
            if (k == -1) {
                aString932 = "No response from server";
                aString933 = "Please try using a different world.";
                return;
            } else {
                System.out.println("response:" + k);
                aString932 = "Unexpected server response";
                aString933 = "Please try using a different world.";
                return;
            }
        } catch (IOException _ex) {
            aString932 = "";
        }
        aString933 = "Error connecting to server.";
    }

    public void method49(int i, int j, String s, String s1) {
        if (j == 0 && anInt1110 != -1) {
            aString829 = s1;
            super.anInt28 = 0;
        }
        if (anInt1011 == -1)
            aBoolean1109 = true;
        for (int k = 99; k > 0; k--) {
            anIntArray948[k] = anIntArray948[k - 1];
            aStringArray949[k] = aStringArray949[k - 1];
            aStringArray950[k] = aStringArray950[k - 1];
        }

        anIntArray948[0] = j;
        aStringArray949[0] = s;
        aStringArray950[0] = s1;
        if (i >= 0)
            aClass44_Sub3_Sub2_843.put1(83);
    }

    public int method50(int i, int j, int k, int l) {
        int i1 = i >> 7;
        int j1 = j >> 7;
        if (i1 < 0 || j1 < 0 || i1 > 103 || j1 > 103)
            return 0;
        int k1 = l;
        if (k != 0)
            anInt1220 = -1;
        if (k1 < 3 && (aByteArrayArrayArray827[1][i1][j1] & 2) == 2)
            k1++;
        int l1 = i & 0x7f;
        int i2 = j & 0x7f;
        int j2 = anIntArrayArrayArray957[k1][i1][j1] * (128 - l1) + anIntArrayArrayArray957[k1][i1 + 1][j1] * l1 >> 7;
        int k2 = anIntArrayArrayArray957[k1][i1][j1 + 1] * (128 - l1) + anIntArrayArrayArray957[k1][i1 + 1][j1 + 1] * l1 >> 7;
        return j2 * (128 - i2) + k2 * i2 >> 7;
    }

    public boolean method51(int i, int j, int k, int l, int i1) {
        int j1 = i1 >> 14 & 0x7fff;
        if (j <= 0)
            aBoolean1152 = !aBoolean1152;
        int k1 = aClass36_915.method308(anInt1062, k, i, i1);
        if (k1 == -1)
            return false;
        int l1 = k1 & 0x1f;
        int i2 = k1 >> 6 & 3;
        anInt1132++;
        if (anInt1132 > 1086) {
            anInt1132 = 0;
            aClass44_Sub3_Sub2_843.putOpcode(149);
            aClass44_Sub3_Sub2_843.put1(0);
            int j2 = aClass44_Sub3_Sub2_843.anInt1374;
            if ((int) (Math.random() * 2D) == 0)
                aClass44_Sub3_Sub2_843.put2(16791);
            aClass44_Sub3_Sub2_843.put1(254);
            aClass44_Sub3_Sub2_843.put2((int) (Math.random() * 65536D));
            aClass44_Sub3_Sub2_843.put2(16128);
            aClass44_Sub3_Sub2_843.put2(52610);
            aClass44_Sub3_Sub2_843.put2((int) (Math.random() * 65536D));
            aClass44_Sub3_Sub2_843.put2(55420);
            if ((int) (Math.random() * 2D) == 0)
                aClass44_Sub3_Sub2_843.put2(35025);
            aClass44_Sub3_Sub2_843.put2(46628);
            aClass44_Sub3_Sub2_843.put1((int) (Math.random() * 256D));
            aClass44_Sub3_Sub2_843.putSize(aClass44_Sub3_Sub2_843.anInt1374 - j2, anInt797);
        }
        if (l1 == 10 || l1 == 11 || l1 == 22) {
            Class8 class8 = Class8.method199(j1);
            int k2;
            int l2;
            if (i2 == 0 || i2 == 2) {
                k2 = class8.anInt225;
                l2 = class8.anInt226;
            } else {
                k2 = class8.anInt226;
                l2 = class8.anInt225;
            }
            int i3 = class8.anInt248;
            if (i2 != 0)
                i3 = (i3 << i2 & 0xf) + (i3 >> 4 - i2);
            method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], k, k2, l2, i3, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, i, (byte) 9, 2);
        } else {
            method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], k, 0, 0, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], l1 + 1, false, i2, i, (byte) 9, 2);
        }
        anInt1142 = super.anInt29;
        anInt1143 = super.anInt30;
        anInt1145 = 2;
        anInt1144 = 0;
        aClass44_Sub3_Sub2_843.putOpcode(l);
        aClass44_Sub3_Sub2_843.put2(k + anInt1055);
        aClass44_Sub3_Sub2_843.put2(i + anInt1056);
        aClass44_Sub3_Sub2_843.put2(j1);
        return true;
    }

    public void method52(int i, int j) {
        Class28 class28 = aClass28ArrayArrayArray816[anInt1062][i][j];
        if (class28 == null) {
            aClass36_915.method299(anInt1062, i, j);
            return;
        }
        int k = 0xfa0a1f01;
        Class44_Sub3_Sub4_Sub2 obj = null;
        for (Class44_Sub3_Sub4_Sub2 class44_sub3_sub4_sub2 = (Class44_Sub3_Sub4_Sub2) class28.method259(); class44_sub3_sub4_sub2 != null; class44_sub3_sub4_sub2 = (Class44_Sub3_Sub4_Sub2) class28.method261(aByte958)) {
            Class14 class14 = Class14.method220(class44_sub3_sub4_sub2.anInt1480);
            int l = class14.anInt339;
            if (class14.aBoolean338)
                l *= class44_sub3_sub4_sub2.anInt1481 + 1;
            if (l > k) {
                k = l;
                obj = class44_sub3_sub4_sub2;
            }
        }

        class28.method257(false, obj);
        Class44_Sub3_Sub4_Sub2 obj1 = null;
        Class44_Sub3_Sub4 obj2 = null;
        for (Class44_Sub3_Sub4_Sub2 class44_sub3_sub4_sub2_1 = (Class44_Sub3_Sub4_Sub2) class28.method259(); class44_sub3_sub4_sub2_1 != null; class44_sub3_sub4_sub2_1 = (Class44_Sub3_Sub4_Sub2) class28.method261(aByte958)) {
            if (class44_sub3_sub4_sub2_1.anInt1480 != obj.anInt1480 && obj1 == null)
                obj1 = class44_sub3_sub4_sub2_1;
            if (class44_sub3_sub4_sub2_1.anInt1480 != obj.anInt1480 && class44_sub3_sub4_sub2_1.anInt1480 != obj1.anInt1480 && obj2 == null)
                obj2 = class44_sub3_sub4_sub2_1;
        }

        int i1 = i + (j << 7) + 0x60000000;
        aClass36_915.method285(j, i1, anInt1062, obj1, obj, (byte) 5, i, method50(i * 128 + 64, j * 128 + 64, 0, anInt1062), obj2);
    }

    public void method53(boolean flag, boolean flag1) {
        if (flag1)
            aBoolean956 = !aBoolean956;
        method16(anInt845);
        aClass34_1041.method272(aBoolean960);
        aClass44_Sub3_Sub1_Sub3_1263.method453(aByte1070, 0, 0);
        char c = '\u0168';
        char c1 = '\310';
        if (anInt1005 == 0) {
            int i = c1 / 2 + 80;
            aClass44_Sub3_Sub1_Sub4_1075.method456(0, c / 2, i, aClass43_Sub1_1015.aString1294, 0x75a9a9, true);
            i = c1 / 2 - 20;
            aClass44_Sub3_Sub1_Sub4_1077.method456(0, c / 2, i, "Welcome to RuneScape", 0xffff00, true);
            i += 30;
            int l = c / 2 - 80;
            int k1 = c1 / 2 + 20;
            aClass44_Sub3_Sub1_Sub3_1264.method453(aByte1070, l - 73, k1 - 20);
            aClass44_Sub3_Sub1_Sub4_1077.method456(0, l, k1 + 5, "New User", 0xffffff, true);
            l = c / 2 + 80;
            aClass44_Sub3_Sub1_Sub3_1264.method453(aByte1070, l - 73, k1 - 20);
            aClass44_Sub3_Sub1_Sub4_1077.method456(0, l, k1 + 5, "Existing User", 0xffffff, true);
        }
        if (anInt1005 == 2) {
            int j = c1 / 2 - 40;
            if (aString932.length() > 0) {
                aClass44_Sub3_Sub1_Sub4_1077.method456(0, c / 2, j - 15, aString932, 0xffff00, true);
                aClass44_Sub3_Sub1_Sub4_1077.method456(0, c / 2, j, aString933, 0xffff00, true);
                j += 30;
            } else {
                aClass44_Sub3_Sub1_Sub4_1077.method456(0, c / 2, j - 7, aString933, 0xffff00, true);
                j += 30;
            }
            aClass44_Sub3_Sub1_Sub4_1077.method460("Username: " + aString1147 + ((anInt955 == 0) & (anInt802 % 40 < 20) ? "@yel@|" : ""), anInt1033, true, j, c / 2 - 90, 0xffffff);
            j += 15;
            aClass44_Sub3_Sub1_Sub4_1077.method460("Password: " + Class48.method553(aString1148, false) + ((anInt955 == 1) & (anInt802 % 40 < 20) ? "@yel@|" : ""), anInt1033, true, j, c / 2 - 88, 0xffffff);
            j += 15;
            if (!flag) {
                int i1 = c / 2 - 80;
                int l1 = c1 / 2 + 50;
                aClass44_Sub3_Sub1_Sub3_1264.method453(aByte1070, i1 - 73, l1 - 20);
                aClass44_Sub3_Sub1_Sub4_1077.method456(0, i1, l1 + 5, "Login", 0xffffff, true);
                i1 = c / 2 + 80;
                aClass44_Sub3_Sub1_Sub3_1264.method453(aByte1070, i1 - 73, l1 - 20);
                aClass44_Sub3_Sub1_Sub4_1077.method456(0, i1, l1 + 5, "Cancel", 0xffffff, true);
            }
        }
        if (anInt1005 == 3) {
            aClass44_Sub3_Sub1_Sub4_1077.method456(0, c / 2, c1 / 2 - 60, "Create a free account", 0xffff00, true);
            int k = c1 / 2 - 35;
            aClass44_Sub3_Sub1_Sub4_1077.method456(0, c / 2, k, "To create a new account you need to", 0xffffff, true);
            k += 15;
            aClass44_Sub3_Sub1_Sub4_1077.method456(0, c / 2, k, "go back to the main RuneScape webpage", 0xffffff, true);
            k += 15;
            aClass44_Sub3_Sub1_Sub4_1077.method456(0, c / 2, k, "and choose the red 'create account'", 0xffffff, true);
            k += 15;
            aClass44_Sub3_Sub1_Sub4_1077.method456(0, c / 2, k, "button at the top right of that page.", 0xffffff, true);
            k += 15;
            int j1 = c / 2;
            int i2 = c1 / 2 + 50;
            aClass44_Sub3_Sub1_Sub3_1264.method453(aByte1070, j1 - 73, i2 - 20);
            aClass44_Sub3_Sub1_Sub4_1077.method456(0, j1, i2 + 5, "Cancel", 0xffffff, true);
        }
        aClass34_1041.method273(202, super.aGraphics14, (byte) 76, 171);
        if (aBoolean917) {
            aBoolean917 = false;
            aClass34_1039.method273(128, super.aGraphics14, (byte) 76, 0);
            aClass34_1040.method273(202, super.aGraphics14, (byte) 76, 371);
            aClass34_1044.method273(0, super.aGraphics14, (byte) 76, 265);
            aClass34_1045.method273(562, super.aGraphics14, (byte) 76, 265);
            aClass34_1046.method273(128, super.aGraphics14, (byte) 76, 171);
            aClass34_1047.method273(562, super.aGraphics14, (byte) 76, 171);
        }
    }

    public void method55(boolean flag) {
        for (Class44_Sub3_Sub4_Sub3 class44_sub3_sub4_sub3 = (Class44_Sub3_Sub4_Sub3) aClass28_1156.method259(); class44_sub3_sub4_sub3 != null; class44_sub3_sub4_sub3 = (Class44_Sub3_Sub4_Sub3) aClass28_1156.method261(aByte958))
            if (class44_sub3_sub4_sub3.anInt1485 != anInt1062 || anInt802 > class44_sub3_sub4_sub3.anInt1491)
                class44_sub3_sub4_sub3.method404();
            else if (anInt802 >= class44_sub3_sub4_sub3.anInt1490) {
                if (class44_sub3_sub4_sub3.anInt1494 > 0) {
                    Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1259[class44_sub3_sub4_sub3.anInt1494 - 1];
                    if (class44_sub3_sub4_sub6_sub2 != null && class44_sub3_sub4_sub6_sub2.anInt1599 >= 0 && class44_sub3_sub4_sub6_sub2.anInt1599 < 13312 && class44_sub3_sub4_sub6_sub2.anInt1600 >= 0 && class44_sub3_sub4_sub6_sub2.anInt1600 < 13312)
                        class44_sub3_sub4_sub3.method497(anInt802, method50(class44_sub3_sub4_sub6_sub2.anInt1599, class44_sub3_sub4_sub6_sub2.anInt1600, 0, class44_sub3_sub4_sub3.anInt1485) - class44_sub3_sub4_sub3.anInt1489, class44_sub3_sub4_sub6_sub2.anInt1599, (byte) 7, class44_sub3_sub4_sub6_sub2.anInt1600);
                }
                if (class44_sub3_sub4_sub3.anInt1494 < 0) {
                    int j = -class44_sub3_sub4_sub3.anInt1494 - 1;
                    Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1;
                    if (j == anInt947)
                        class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1_1252;
                    else
                        class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1120[j];
                    if (class44_sub3_sub4_sub6_sub1 != null && class44_sub3_sub4_sub6_sub1.anInt1599 >= 0 && class44_sub3_sub4_sub6_sub1.anInt1599 < 13312 && class44_sub3_sub4_sub6_sub1.anInt1600 >= 0 && class44_sub3_sub4_sub6_sub1.anInt1600 < 13312)
                        class44_sub3_sub4_sub3.method497(anInt802, method50(class44_sub3_sub4_sub6_sub1.anInt1599, class44_sub3_sub4_sub6_sub1.anInt1600, 0, class44_sub3_sub4_sub3.anInt1485) - class44_sub3_sub4_sub3.anInt1489, class44_sub3_sub4_sub6_sub1.anInt1599, (byte) 7, class44_sub3_sub4_sub6_sub1.anInt1600);
                }
                class44_sub3_sub4_sub3.method498(anInt975, true);
                aClass36_915.method289((int) class44_sub3_sub4_sub3.aDouble1498, class44_sub3_sub4_sub3, (int) class44_sub3_sub4_sub3.aDouble1496, -1, (int) class44_sub3_sub4_sub3.aDouble1497, (byte) 1, 60, class44_sub3_sub4_sub3.anInt1504, anInt1062, false);
            }

        anInt997++;
        aBoolean905 &= flag;
        if (anInt997 > 1174) {
            anInt997 = 0;
            aClass44_Sub3_Sub2_843.putOpcode(12);
            aClass44_Sub3_Sub2_843.put1(0);
            int i = aClass44_Sub3_Sub2_843.anInt1374;
            if ((int) (Math.random() * 2D) == 0)
                aClass44_Sub3_Sub2_843.put2(11499);
            aClass44_Sub3_Sub2_843.put2(10548);
            if ((int) (Math.random() * 2D) == 0)
                aClass44_Sub3_Sub2_843.put1(139);
            if ((int) (Math.random() * 2D) == 0)
                aClass44_Sub3_Sub2_843.put1(94);
            aClass44_Sub3_Sub2_843.put2(51693);
            aClass44_Sub3_Sub2_843.put1(16);
            aClass44_Sub3_Sub2_843.put2(15036);
            if ((int) (Math.random() * 2D) == 0)
                aClass44_Sub3_Sub2_843.put1(65);
            aClass44_Sub3_Sub2_843.put1((int) (Math.random() * 256D));
            aClass44_Sub3_Sub2_843.put2(22990);
            aClass44_Sub3_Sub2_843.putSize(aClass44_Sub3_Sub2_843.anInt1374 - i, anInt797);
        }
    }

    public void method56(int i, int j, int k, byte byte0, int l, int i1) {
        aClass44_Sub3_Sub1_Sub3_1154.method453(aByte1070, l, j);
        aClass44_Sub3_Sub1_Sub3_1155.method453(aByte1070, l, (j + i1) - 16);
        Class44_Sub3_Sub1.method411(i1 - 32, anInt1158, 16, l, 0, j + 16);
        int j1 = ((i1 - 32) * i1) / k;
        if (j1 < 8)
            j1 = 8;
        int k1 = ((i1 - 32 - j1) * i) / (k - i1);
        Class44_Sub3_Sub1.method411(j1, anInt1007, 16, l, 0, j + 16 + k1);
        Class44_Sub3_Sub1.method416(anInt1177, j1, l, 384, j + 16 + k1);
        Class44_Sub3_Sub1.method416(anInt1177, j1, l + 1, 384, j + 16 + k1);
        Class44_Sub3_Sub1.method414(16, anInt1177, l, (byte) 125, j + 16 + k1);
        Class44_Sub3_Sub1.method414(16, anInt1177, l, (byte) 125, j + 17 + k1);
        Class44_Sub3_Sub1.method416(anInt825, j1, l + 15, 384, j + 16 + k1);
        Class44_Sub3_Sub1.method416(anInt825, j1 - 1, l + 14, 384, j + 17 + k1);
        Class44_Sub3_Sub1.method414(16, anInt825, l, (byte) 125, j + 15 + k1 + j1);
        Class44_Sub3_Sub1.method414(15, anInt825, l + 1, (byte) 125, j + 14 + k1 + j1);
        if (byte0 != 123)
            aClass44_Sub3_Sub2_843.put1(30);
    }

    public void method57(int i, int j) {
        j = 49 / j;
        if (!aBoolean1240) {
            if (Class44_Sub3_Sub1_Sub1.anIntArray1417[17] >= i) {
                Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3 = Class44_Sub3_Sub1_Sub1.aClass44_Sub3_Sub1_Sub3Array1411[17];
                int k = class44_sub3_sub1_sub3.anInt1447 * class44_sub3_sub1_sub3.anInt1448 - 1;
                int i1 = class44_sub3_sub1_sub3.anInt1447 * anInt975 * 2;
                byte[] abyte0 = class44_sub3_sub1_sub3.aByteArray1445;
                byte[] abyte2 = aByteArray1088;
                for (int k1 = 0; k1 <= k; k1++)
                    abyte2[k1] = abyte0[k1 - i1 & k];

                class44_sub3_sub1_sub3.aByteArray1445 = abyte2;
                aByteArray1088 = abyte0;
                Class44_Sub3_Sub1_Sub1.method425(17, true);
            }
            if (Class44_Sub3_Sub1_Sub1.anIntArray1417[24] >= i) {
                Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3_1 = Class44_Sub3_Sub1_Sub1.aClass44_Sub3_Sub1_Sub3Array1411[24];
                int l = class44_sub3_sub1_sub3_1.anInt1447 * class44_sub3_sub1_sub3_1.anInt1448 - 1;
                int j1 = class44_sub3_sub1_sub3_1.anInt1447 * anInt975 * 2;
                byte[] abyte1 = class44_sub3_sub1_sub3_1.aByteArray1445;
                byte[] abyte3 = aByteArray1088;
                for (int l1 = 0; l1 <= l; l1++)
                    abyte3[l1] = abyte1[l1 - j1 & l];

                class44_sub3_sub1_sub3_1.aByteArray1445 = abyte3;
                aByteArray1088 = abyte1;
                Class44_Sub3_Sub1_Sub1.method425(24, true);
            }
        }
    }

    public void method58(int i) {
        if (i != 25675) {
            for (int j = 1; j > 0; j++) ;
        }
        if (super.anInt28 == 1) {
            if (super.anInt29 >= 539 && super.anInt29 <= 573 && super.anInt30 >= 169 && super.anInt30 < 205 && anIntArray954[0] != -1) {
                aBoolean928 = true;
                anInt1013 = 0;
                aBoolean841 = true;
            }
            if (super.anInt29 >= 569 && super.anInt29 <= 599 && super.anInt30 >= 168 && super.anInt30 < 205 && anIntArray954[1] != -1) {
                aBoolean928 = true;
                anInt1013 = 1;
                aBoolean841 = true;
            }
            if (super.anInt29 >= 597 && super.anInt29 <= 627 && super.anInt30 >= 168 && super.anInt30 < 205 && anIntArray954[2] != -1) {
                aBoolean928 = true;
                anInt1013 = 2;
                aBoolean841 = true;
            }
            if (super.anInt29 >= 625 && super.anInt29 <= 669 && super.anInt30 >= 168 && super.anInt30 < 203 && anIntArray954[3] != -1) {
                aBoolean928 = true;
                anInt1013 = 3;
                aBoolean841 = true;
            }
            if (super.anInt29 >= 666 && super.anInt29 <= 696 && super.anInt30 >= 168 && super.anInt30 < 205 && anIntArray954[4] != -1) {
                aBoolean928 = true;
                anInt1013 = 4;
                aBoolean841 = true;
            }
            if (super.anInt29 >= 694 && super.anInt29 <= 724 && super.anInt30 >= 168 && super.anInt30 < 205 && anIntArray954[5] != -1) {
                aBoolean928 = true;
                anInt1013 = 5;
                aBoolean841 = true;
            }
            if (super.anInt29 >= 722 && super.anInt29 <= 756 && super.anInt30 >= 169 && super.anInt30 < 205 && anIntArray954[6] != -1) {
                aBoolean928 = true;
                anInt1013 = 6;
                aBoolean841 = true;
            }
            if (super.anInt29 >= 540 && super.anInt29 <= 574 && super.anInt30 >= 466 && super.anInt30 < 502 && anIntArray954[7] != -1) {
                aBoolean928 = true;
                anInt1013 = 7;
                aBoolean841 = true;
            }
            if (super.anInt29 >= 572 && super.anInt29 <= 602 && super.anInt30 >= 466 && super.anInt30 < 503 && anIntArray954[8] != -1) {
                aBoolean928 = true;
                anInt1013 = 8;
                aBoolean841 = true;
            }
            if (super.anInt29 >= 599 && super.anInt29 <= 629 && super.anInt30 >= 466 && super.anInt30 < 503 && anIntArray954[9] != -1) {
                aBoolean928 = true;
                anInt1013 = 9;
                aBoolean841 = true;
            }
            if (super.anInt29 >= 627 && super.anInt29 <= 671 && super.anInt30 >= 467 && super.anInt30 < 502 && anIntArray954[10] != -1) {
                aBoolean928 = true;
                anInt1013 = 10;
                aBoolean841 = true;
            }
            if (super.anInt29 >= 669 && super.anInt29 <= 699 && super.anInt30 >= 466 && super.anInt30 < 503 && anIntArray954[11] != -1) {
                aBoolean928 = true;
                anInt1013 = 11;
                aBoolean841 = true;
            }
            if (super.anInt29 >= 696 && super.anInt29 <= 726 && super.anInt30 >= 466 && super.anInt30 < 503 && anIntArray954[12] != -1) {
                aBoolean928 = true;
                anInt1013 = 12;
                aBoolean841 = true;
            }
            if (super.anInt29 >= 724 && super.anInt29 <= 758 && super.anInt30 >= 466 && super.anInt30 < 502 && anIntArray954[13] != -1) {
                aBoolean928 = true;
                anInt1013 = 13;
                aBoolean841 = true;
            }
        }
    }

    public void method59(int i) {
        byte[] abyte0 = aClass47_942.method546("title.dat", null);
        Class44_Sub3_Sub1_Sub2 class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(abyte0, this);
        aClass34_1042.method272(aBoolean960);
        class44_sub3_sub1_sub2.method438(0, false, 0);
        aClass34_1043.method272(aBoolean960);
        class44_sub3_sub1_sub2.method438(0, false, -637);
        aClass34_1039.method272(aBoolean960);
        class44_sub3_sub1_sub2.method438(0, false, -128);
        aClass34_1040.method272(aBoolean960);
        class44_sub3_sub1_sub2.method438(-371, false, -202);
        aClass34_1041.method272(aBoolean960);
        class44_sub3_sub1_sub2.method438(-171, false, -202);
        aClass34_1044.method272(aBoolean960);
        class44_sub3_sub1_sub2.method438(-265, false, 0);
        aClass34_1045.method272(aBoolean960);
        class44_sub3_sub1_sub2.method438(-265, false, -562);
        aClass34_1046.method272(aBoolean960);
        class44_sub3_sub1_sub2.method438(-171, false, -128);
        aClass34_1047.method272(aBoolean960);
        class44_sub3_sub1_sub2.method438(-171, false, -562);
        int[] ai = new int[class44_sub3_sub1_sub2.anInt1432];
        for (int j = 0; j < class44_sub3_sub1_sub2.anInt1433; j++) {
            for (int k = 0; k < class44_sub3_sub1_sub2.anInt1432; k++)
                ai[k] = class44_sub3_sub1_sub2.anIntArray1431[(class44_sub3_sub1_sub2.anInt1432 - k - 1) + class44_sub3_sub1_sub2.anInt1432 * j];

            if (class44_sub3_sub1_sub2.anInt1432 >= 0)
                System.arraycopy(ai, 0, class44_sub3_sub1_sub2.anIntArray1431, class44_sub3_sub1_sub2.anInt1432 * j, class44_sub3_sub1_sub2.anInt1432);

        }

        aClass34_1042.method272(aBoolean960);
        class44_sub3_sub1_sub2.method438(0, false, 382);
        aClass34_1043.method272(aBoolean960);
        class44_sub3_sub1_sub2.method438(0, false, -255);
        aClass34_1039.method272(aBoolean960);
        class44_sub3_sub1_sub2.method438(0, false, 254);
        aClass34_1040.method272(aBoolean960);
        class44_sub3_sub1_sub2.method438(-371, false, 180);
        aClass34_1041.method272(aBoolean960);
        class44_sub3_sub1_sub2.method438(-171, false, 180);
        aClass34_1044.method272(aBoolean960);
        class44_sub3_sub1_sub2.method438(-265, false, 382);
        aClass34_1045.method272(aBoolean960);
        class44_sub3_sub1_sub2.method438(-265, false, -180);
        aClass34_1046.method272(aBoolean960);
        anInt1219 += i;
        class44_sub3_sub1_sub2.method438(-171, false, 254);
        aClass34_1047.method272(aBoolean960);
        class44_sub3_sub1_sub2.method438(-171, false, -180);
        class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(aClass47_942, "logo", 0);
        aClass34_1039.method272(aBoolean960);
        class44_sub3_sub1_sub2.method440(aByte1070, 382 - class44_sub3_sub1_sub2.anInt1432 / 2 - 128, 18);
        class44_sub3_sub1_sub2 = null;
        abyte0 = null;
        ai = null;
        System.gc();
    }

    public void method60(byte byte0, int i) {
        if (i < 0)
            return;
        if (aBoolean1104) {
            aBoolean1104 = false;
            aBoolean1109 = true;
        }
        int j = anIntArray1191[i];
        int k = anIntArray1192[i];
        int l = anIntArray1193[i];
        int i1 = anIntArray1194[i];
        if (byte0 == aByte1071)
            byte0 = 0;
        else
            anInt1113 = -128;
        if (l >= 2000)
            l -= 2000;
        if (l == 829) {
            Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1259[i1];
            if (class44_sub3_sub4_sub6_sub2 != null) {
                method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], class44_sub3_sub4_sub6_sub2.anIntArray1649[0], 1, 1, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, class44_sub3_sub4_sub6_sub2.anIntArray1650[0], (byte) 9, 2);
                anInt1142 = super.anInt29;
                anInt1143 = super.anInt30;
                anInt1145 = 2;
                anInt1144 = 0;
                aClass44_Sub3_Sub2_843.putOpcode(150);
                aClass44_Sub3_Sub2_843.put2(i1);
                aClass44_Sub3_Sub2_843.put2(anInt814);
                aClass44_Sub3_Sub2_843.put2(anInt812);
                aClass44_Sub3_Sub2_843.put2(anInt813);
            }
        }
        if (l == 524) {
            String s = aStringArray1114[i];
            int k1 = s.indexOf("@whi@");
            if (k1 != -1) {
                method45(false);
                aString951 = s.substring(k1 + 5).trim();
                aBoolean1128 = false;
                for (int i3 = 0; i3 < Class5.aClass5Array103.length; i3++) {
                    if (Class5.aClass5Array103[i3] == null || Class5.aClass5Array103[i3].anInt112 != 600)
                        continue;
                    anInt1081 = anInt1037 = Class5.aClass5Array103[i3].anInt109;
                    break;
                }

            }
        }
        if (l == 275) {
            Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1120[i1];
            if (class44_sub3_sub4_sub6_sub1 != null) {
                method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], class44_sub3_sub4_sub6_sub1.anIntArray1649[0], 1, 1, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, class44_sub3_sub4_sub6_sub1.anIntArray1650[0], (byte) 9, 2);
                anInt1142 = super.anInt29;
                anInt1143 = super.anInt30;
                anInt1145 = 2;
                anInt1144 = 0;
                aClass44_Sub3_Sub2_843.putOpcode(36);
                aClass44_Sub3_Sub2_843.put2(i1);
                aClass44_Sub3_Sub2_843.put2(anInt814);
                aClass44_Sub3_Sub2_843.put2(anInt812);
                aClass44_Sub3_Sub2_843.put2(anInt813);
            }
        }
        if (l == 743) {
            anInt969++;
            if (anInt969 >= 124) {
                aClass44_Sub3_Sub2_843.putOpcode(201);
                aClass44_Sub3_Sub2_843.put2(37954);
            }
            method51(k, 74, j, 187, i1);
        }
        if (l == 718)
            if (!aBoolean851)
                aClass36_915.method316(super.anInt29 - 4, super.anInt30 - 4, aByte1034);
            else
                aClass36_915.method316(j - 4, k - 4, aByte1034);
        if (l == 721) {
            anInt1232 += k;
            if (anInt1232 >= 139) {
                aClass44_Sub3_Sub2_843.putOpcode(219);
                aClass44_Sub3_Sub2_843.put4(0);
            }
            method51(k, 74, j, 103, i1);
        }
        if (l == 605 || l == 47 || l == 513 || l == 884) {
            String s1 = aStringArray1114[i];
            int l1 = s1.indexOf("@whi@");
            if (l1 != -1) {
                long l3 = Class48.method547(s1.substring(l1 + 5).trim());
                if (l == 605)
                    method102(199, l3);
                if (l == 47)
                    method96(l3, false);
                if (l == 513)
                    method62(0, l3);
                if (l == 884)
                    method123(aBoolean974, l3);
            }
        }
        if (l == 563) {
            aClass44_Sub3_Sub2_843.putOpcode(135);
            aClass44_Sub3_Sub2_843.put2(i1);
            aClass44_Sub3_Sub2_843.put2(j);
            aClass44_Sub3_Sub2_843.put2(k);
            aClass44_Sub3_Sub2_843.put2(anInt1197);
            anInt847 = 0;
            anInt848 = k;
            anInt849 = j;
            anInt850 = 2;
            if (Class5.aClass5Array103[k].anInt109 == anInt1037)
                anInt850 = 1;
            if (Class5.aClass5Array103[k].anInt109 == anInt1011)
                anInt850 = 3;
        }
        if (l == 435) {
            aClass44_Sub3_Sub2_843.putOpcode(9);
            aClass44_Sub3_Sub2_843.put2(k);
            Class5 class5 = Class5.aClass5Array103[k];
            if (class5.anIntArrayArray118 != null && class5.anIntArrayArray118[0][0] == 5) {
                int i2 = class5.anIntArrayArray118[0][1];
                anIntArray1107[i2] = 1 - anIntArray1107[i2];
                method40(false, i2);
                aBoolean928 = true;
            }
        }
        if (l == 810 && method51(k, 74, j, 60, i1)) {
            aClass44_Sub3_Sub2_843.put2(anInt814);
            aClass44_Sub3_Sub2_843.put2(anInt812);
            aClass44_Sub3_Sub2_843.put2(anInt813);
        }
        if (l == 102) {
            anInt811 = 1;
            anInt812 = j;
            anInt813 = k;
            anInt814 = i1;
            aString815 = Class14.method220(i1).aString327;
            anInt1196 = 0;
            aBoolean928 = true;
            return;
        }
        if (l == 1328) {
            Class14 class14 = Class14.method220(i1);
            Class5 class5_4 = Class5.aClass5Array103[k];
            String s4;
            if (class5_4 != null && class5_4.anIntArray105[j] >= 0x186a0)
                s4 = class5_4.anIntArray105[j] + " x " + class14.aString327;
            else if (class14.aByteArray328 != null)
                s4 = new String(class14.aByteArray328);
            else
                s4 = "It's a " + class14.aString327 + ".";
            method49(-476, 0, "", s4);
        }
        if (l == 639 || l == 499 || l == 27 || l == 387 || l == 185) {
            Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1_1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1120[i1];
            if (class44_sub3_sub4_sub6_sub1_1 != null) {
                method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], class44_sub3_sub4_sub6_sub1_1.anIntArray1649[0], 1, 1, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, class44_sub3_sub4_sub6_sub1_1.anIntArray1650[0], (byte) 9, 2);
                anInt1142 = super.anInt29;
                anInt1143 = super.anInt30;
                anInt1145 = 2;
                anInt1144 = 0;
                if (l == 387) {
                    anInt1052 += i1;
                    if (anInt1052 >= 66) {
                        aClass44_Sub3_Sub2_843.putOpcode(235);
                        aClass44_Sub3_Sub2_843.put1(154);
                    }
                    aClass44_Sub3_Sub2_843.putOpcode(98);
                }
                if (l == 185)
                    aClass44_Sub3_Sub2_843.putOpcode(174);
                if (l == 639) {
                    anInt900++;
                    if (anInt900 >= 52) {
                        aClass44_Sub3_Sub2_843.putOpcode(80);
                        aClass44_Sub3_Sub2_843.put1(131);
                    }
                    aClass44_Sub3_Sub2_843.putOpcode(109);
                }
                if (l == 27)
                    aClass44_Sub3_Sub2_843.putOpcode(196);
                if (l == 499)
                    aClass44_Sub3_Sub2_843.putOpcode(166);
                aClass44_Sub3_Sub2_843.put2(i1);
            }
        }
        if (l == 242 || l == 209 || l == 309 || l == 852 || l == 793) {
            Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2_1 = aClass44_Sub3_Sub4_Sub6_Sub2Array1259[i1];
            if (class44_sub3_sub4_sub6_sub2_1 != null) {
                method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], class44_sub3_sub4_sub6_sub2_1.anIntArray1649[0], 1, 1, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, class44_sub3_sub4_sub6_sub2_1.anIntArray1650[0], (byte) 9, 2);
                anInt1142 = super.anInt29;
                anInt1143 = super.anInt30;
                anInt1145 = 2;
                anInt1144 = 0;
                if (l == 309)
                    aClass44_Sub3_Sub2_843.putOpcode(223);
                if (l == 242)
                    aClass44_Sub3_Sub2_843.putOpcode(236);
                if (l == 852)
                    aClass44_Sub3_Sub2_843.putOpcode(147);
                if (l == 793)
                    aClass44_Sub3_Sub2_843.putOpcode(189);
                if (l == 209)
                    aClass44_Sub3_Sub2_843.putOpcode(233);
                aClass44_Sub3_Sub2_843.put2(i1);
            }
        }
        if (l == 582 || l == 113 || l == 555 || l == 331 || l == 354) {
            if (l == 331)
                aClass44_Sub3_Sub2_843.putOpcode(179);
            if (l == 113)
                aClass44_Sub3_Sub2_843.putOpcode(82);
            if (l == 555)
                aClass44_Sub3_Sub2_843.putOpcode(239);
            if (l == 354)
                aClass44_Sub3_Sub2_843.putOpcode(46);
            if (l == 582) {
                if ((i1 & 3) == 0)
                    anInt1157++;
                if (anInt1157 >= 133) {
                    aClass44_Sub3_Sub2_843.putOpcode(250);
                    aClass44_Sub3_Sub2_843.put2(6118);
                }
                aClass44_Sub3_Sub2_843.putOpcode(74);
            }
            aClass44_Sub3_Sub2_843.put2(i1);
            aClass44_Sub3_Sub2_843.put2(j);
            aClass44_Sub3_Sub2_843.put2(k);
            anInt847 = 0;
            anInt848 = k;
            anInt849 = j;
            anInt850 = 2;
            if (Class5.aClass5Array103[k].anInt109 == anInt1037)
                anInt850 = 1;
            if (Class5.aClass5Array103[k].anInt109 == anInt1011)
                anInt850 = 3;
        }
        if (l == 997 && !aBoolean1168) {
            aClass44_Sub3_Sub2_843.putOpcode(72);
            aClass44_Sub3_Sub2_843.put2(k);
            aBoolean1168 = true;
        }
        if (l == 1714) {
            Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2_2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1259[i1];
            if (class44_sub3_sub4_sub6_sub2_2 != null) {
                String s5;
                if (class44_sub3_sub4_sub6_sub2_2.aClass12_1682.aByteArray282 != null)
                    s5 = new String(class44_sub3_sub4_sub6_sub2_2.aClass12_1682.aByteArray282);
                else
                    s5 = "It's a " + class44_sub3_sub4_sub6_sub2_2.aClass12_1682.aString281 + ".";
                method49(-476, 0, "", s5);
            }
        }
        if (l == 240) {
            Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2_3 = aClass44_Sub3_Sub4_Sub6_Sub2Array1259[i1];
            if (class44_sub3_sub4_sub6_sub2_3 != null) {
                method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], class44_sub3_sub4_sub6_sub2_3.anIntArray1649[0], 1, 1, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, class44_sub3_sub4_sub6_sub2_3.anIntArray1650[0], (byte) 9, 2);
                anInt1142 = super.anInt29;
                anInt1143 = super.anInt30;
                anInt1145 = 2;
                anInt1144 = 0;
                aClass44_Sub3_Sub2_843.putOpcode(181);
                aClass44_Sub3_Sub2_843.put2(i1);
                aClass44_Sub3_Sub2_843.put2(anInt1197);
            }
        }
        if (l == 902) {
            String s2 = aStringArray1114[i];
            int j2 = s2.indexOf("@whi@");
            if (j2 != -1) {
                long l4 = Class48.method547(s2.substring(j2 + 5).trim());
                int j3 = -1;
                for (int i4 = 0; i4 < anInt1115; i4++) {
                    if (aLongArray1159[i4] != l4)
                        continue;
                    j3 = i4;
                    break;
                }

                if (j3 != -1 && anIntArray1073[j3] > 0) {
                    aBoolean1109 = true;
                    aBoolean1104 = false;
                    aBoolean1265 = true;
                    aString984 = "";
                    anInt1051 = 3;
                    aLong867 = aLongArray1159[j3];
                    aString1019 = "Enter message to send to " + aStringArray833[j3];
                }
            }
        }
        if (l == 1381) {
            int j1 = i1 >> 14 & 0x7fff;
            Class8 class8 = Class8.method199(j1);
            String s8;
            if (class8.aByteArray222 != null)
                s8 = new String(class8.aByteArray222);
            else
                s8 = "It's a " + class8.aString221 + ".";
            method49(-476, 0, "", s8);
        }
        if (l == 231) {
            Class5 class5_1 = Class5.aClass5Array103[k];
            boolean flag3 = true;
            if (class5_1.anInt112 > 0)
                flag3 = method113(class5_1, anInt1185);
            if (flag3) {
                aClass44_Sub3_Sub2_843.putOpcode(9);
                aClass44_Sub3_Sub2_843.put2(k);
            }
        }
        if (l == 139 || l == 778 || l == 617 || l == 224 || l == 662) {
            boolean flag = method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], j, 0, 0, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, k, (byte) 9, 2);
            if (!flag)
                flag = method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], j, 1, 1, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, k, (byte) 9, 2);
            anInt1142 = super.anInt29;
            anInt1143 = super.anInt30;
            anInt1145 = 2;
            anInt1144 = 0;
            if (l == 662) {
                anInt1151 += anInt1056;
                if (anInt1151 >= 118) {
                    aClass44_Sub3_Sub2_843.putOpcode(41);
                    aClass44_Sub3_Sub2_843.put4(0);
                }
                aClass44_Sub3_Sub2_843.putOpcode(117);
            }
            if (l == 139) {
                if ((j & 3) == 0)
                    anInt1195++;
                if (anInt1195 >= 123) {
                    aClass44_Sub3_Sub2_843.putOpcode(25);
                    aClass44_Sub3_Sub2_843.put4(0);
                }
                aClass44_Sub3_Sub2_843.putOpcode(247);
            }
            if (l == 224) {
                anInt880 += k;
                if (anInt880 >= 75) {
                    aClass44_Sub3_Sub2_843.putOpcode(0);
                    aClass44_Sub3_Sub2_843.put1(19);
                }
                aClass44_Sub3_Sub2_843.putOpcode(62);
            }
            if (l == 617)
                aClass44_Sub3_Sub2_843.putOpcode(108);
            if (l == 778)
                aClass44_Sub3_Sub2_843.putOpcode(169);
            aClass44_Sub3_Sub2_843.put2(j + anInt1055);
            aClass44_Sub3_Sub2_843.put2(k + anInt1056);
            aClass44_Sub3_Sub2_843.put2(i1);
        }
        if (l == 1071)
            method51(k, 74, j, 127, i1);
        if (l == 507 || l == 957) {
            String s3 = aStringArray1114[i];
            int k2 = s3.indexOf("@whi@");
            if (k2 != -1) {
                s3 = s3.substring(k2 + 5).trim();
                String s9 = Class48.method551(131, Class48.method548(0, Class48.method547(s3)));
                boolean flag4 = false;
                for (int k3 = 0; k3 < anInt1121; k3++) {
                    Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1_3 = aClass44_Sub3_Sub4_Sub6_Sub1Array1120[anIntArray1122[k3]];
                    if (class44_sub3_sub4_sub6_sub1_3 == null || class44_sub3_sub4_sub6_sub1_3.aString1657 == null || !class44_sub3_sub4_sub6_sub1_3.aString1657.equalsIgnoreCase(s9))
                        continue;
                    method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], class44_sub3_sub4_sub6_sub1_3.anIntArray1649[0], 1, 1, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, class44_sub3_sub4_sub6_sub1_3.anIntArray1650[0], (byte) 9, 2);
                    if (l == 507) {
                        anInt1052 += i1;
                        if (anInt1052 >= 66) {
                            aClass44_Sub3_Sub2_843.putOpcode(235);
                            aClass44_Sub3_Sub2_843.put1(154);
                        }
                        aClass44_Sub3_Sub2_843.putOpcode(98);
                    }
                    if (l == 957) {
                        anInt900++;
                        if (anInt900 >= 52) {
                            aClass44_Sub3_Sub2_843.putOpcode(80);
                            aClass44_Sub3_Sub2_843.put1(131);
                        }
                        aClass44_Sub3_Sub2_843.putOpcode(109);
                    }
                    aClass44_Sub3_Sub2_843.put2(anIntArray1122[k3]);
                    flag4 = true;
                    break;
                }

                if (!flag4)
                    method49(-476, 0, "", "Unable to find " + s9);
            }
        }
        if (l == 131) {
            Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1_2 = aClass44_Sub3_Sub4_Sub6_Sub1Array1120[i1];
            if (class44_sub3_sub4_sub6_sub1_2 != null) {
                method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], class44_sub3_sub4_sub6_sub1_2.anIntArray1649[0], 1, 1, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, class44_sub3_sub4_sub6_sub1_2.anIntArray1650[0], (byte) 9, 2);
                anInt1142 = super.anInt29;
                anInt1143 = super.anInt30;
                anInt1145 = 2;
                anInt1144 = 0;
                aClass44_Sub3_Sub2_843.putOpcode(240);
                aClass44_Sub3_Sub2_843.put2(i1);
                aClass44_Sub3_Sub2_843.put2(anInt1197);
            }
        }
        if (l == 398) {
            aClass44_Sub3_Sub2_843.putOpcode(136);
            aClass44_Sub3_Sub2_843.put2(i1);
            aClass44_Sub3_Sub2_843.put2(j);
            aClass44_Sub3_Sub2_843.put2(k);
            aClass44_Sub3_Sub2_843.put2(anInt814);
            aClass44_Sub3_Sub2_843.put2(anInt812);
            aClass44_Sub3_Sub2_843.put2(anInt813);
            anInt847 = 0;
            anInt848 = k;
            anInt849 = j;
            anInt850 = 2;
            if (Class5.aClass5Array103[k].anInt109 == anInt1037)
                anInt850 = 1;
            if (Class5.aClass5Array103[k].anInt109 == anInt1011)
                anInt850 = 3;
        }
        if (l == 737)
            method45(false);
        if (l == 694 || l == 962 || l == 795 || l == 681 || l == 100) {
            if (l == 681) {
                anInt1028++;
                if (anInt1028 >= 116) {
                    aClass44_Sub3_Sub2_843.putOpcode(24);
                    aClass44_Sub3_Sub2_843.put3(0xc6a439);
                }
                aClass44_Sub3_Sub2_843.putOpcode(216);
            }
            if (l == 100)
                aClass44_Sub3_Sub2_843.putOpcode(42);
            if (l == 694)
                aClass44_Sub3_Sub2_843.putOpcode(185);
            if (l == 962)
                aClass44_Sub3_Sub2_843.putOpcode(2);
            if (l == 795)
                aClass44_Sub3_Sub2_843.putOpcode(123);
            aClass44_Sub3_Sub2_843.put2(i1);
            aClass44_Sub3_Sub2_843.put2(j);
            aClass44_Sub3_Sub2_843.put2(k);
            anInt847 = 0;
            anInt848 = k;
            anInt849 = j;
            anInt850 = 2;
            if (Class5.aClass5Array103[k].anInt109 == anInt1037)
                anInt850 = 1;
            if (Class5.aClass5Array103[k].anInt109 == anInt1011)
                anInt850 = 3;
        }
        if (l == 357)
            method51(k, 74, j, 157, i1);
        if (l == 1152) {
            Class14 class14_1 = Class14.method220(i1);
            String s6;
            if (class14_1.aByteArray328 != null)
                s6 = new String(class14_1.aByteArray328);
            else
                s6 = "It's a " + class14_1.aString327 + ".";
            method49(-476, 0, "", s6);
        }
        if (l == 370) {
            boolean flag1 = method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], j, 0, 0, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, k, (byte) 9, 2);
            if (!flag1)
                flag1 = method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], j, 1, 1, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, k, (byte) 9, 2);
            anInt1142 = super.anInt29;
            anInt1143 = super.anInt30;
            anInt1145 = 2;
            anInt1144 = 0;
            aClass44_Sub3_Sub2_843.putOpcode(91);
            aClass44_Sub3_Sub2_843.put2(j + anInt1055);
            aClass44_Sub3_Sub2_843.put2(k + anInt1056);
            aClass44_Sub3_Sub2_843.put2(i1);
            aClass44_Sub3_Sub2_843.put2(anInt1197);
        }
        if (l == 899 && method51(k, 74, j, 213, i1))
            aClass44_Sub3_Sub2_843.put2(anInt1197);
        if (l == 625)
            method51(k, 74, j, 215, i1);
        if (l == 111) {
            boolean flag2 = method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], j, 0, 0, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, k, (byte) 9, 2);
            if (!flag2)
                flag2 = method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], j, 1, 1, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, k, (byte) 9, 2);
            anInt1142 = super.anInt29;
            anInt1143 = super.anInt30;
            anInt1145 = 2;
            anInt1144 = 0;
            aClass44_Sub3_Sub2_843.putOpcode(39);
            aClass44_Sub3_Sub2_843.put2(j + anInt1055);
            aClass44_Sub3_Sub2_843.put2(k + anInt1056);
            aClass44_Sub3_Sub2_843.put2(i1);
            aClass44_Sub3_Sub2_843.put2(anInt814);
            aClass44_Sub3_Sub2_843.put2(anInt812);
            aClass44_Sub3_Sub2_843.put2(anInt813);
        }
        if (l == 274) {
            Class5 class5_2 = Class5.aClass5Array103[k];
            anInt1196 = 1;
            anInt1197 = k;
            anInt1198 = class5_2.anInt163;
            anInt811 = 0;
            aBoolean928 = true;
            String s7 = class5_2.aString161;
            if (s7.contains(" "))
                s7 = s7.substring(0, s7.indexOf(" "));
            String s10 = class5_2.aString161;
            if (s10.contains(" "))
                s10 = s10.substring(s10.indexOf(" ") + 1);
            aString1199 = s7 + " " + class5_2.aString162 + " " + s10;
            if (anInt1198 == 16) {
                aBoolean928 = true;
                anInt1013 = 3;
                aBoolean841 = true;
            }
            return;
        }
        if (l == 225) {
            aClass44_Sub3_Sub2_843.putOpcode(9);
            aClass44_Sub3_Sub2_843.put2(k);
            Class5 class5_3 = Class5.aClass5Array103[k];
            if (class5_3.anIntArrayArray118 != null && class5_3.anIntArrayArray118[0][0] == 5) {
                int l2 = class5_3.anIntArrayArray118[0][1];
                if (anIntArray1107[l2] != class5_3.anIntArray120[0]) {
                    anIntArray1107[l2] = class5_3.anIntArray120[0];
                    method40(false, l2);
                    aBoolean928 = true;
                }
            }
        }
        anInt811 = 0;
        anInt1196 = 0;
        aBoolean928 = true;
    }

    public Class47 method61(String s, int i, String s1, int j, byte byte0, int k) {
        byte[] abyte0 = null;
        int l = 5;
        try {
            if (aClass45Array1225[0] != null)
                abyte0 = aClass45Array1225[0].method538((byte) 2, i);
        } catch (Exception ignored) {
        }
        if (abyte0 != null) {
            aCRC32_979.reset();
            aCRC32_979.update(abyte0);
            int i1 = (int) aCRC32_979.getValue();
            if (i1 != j)
                abyte0 = null;
        }
        if (abyte0 != null) {
            Class47 class47 = new Class47(0, abyte0);
            return class47;
        }
        int j1 = 0;
        if (byte0 != 46)
            anInt1235 = aClass46_944.method542();
        while (abyte0 == null) {
            String s2 = "Unknown error";
            method13("Requesting " + s, k, 7);
            Object obj = null;
            try {
                int k1 = 0;
                DataInputStream datainputstream = method84(s1 + j);
                byte[] abyte1 = new byte[6];
                datainputstream.readFully(abyte1, 0, 6);
                Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(abyte1, (byte) 1);
                class44_sub3_sub2.anInt1374 = 3;
                int i2 = class44_sub3_sub2.get3() + 6;
                int j2 = 6;
                abyte0 = new byte[i2];
                System.arraycopy(abyte1, 0, abyte0, 0, 6);

                while (j2 < i2) {
                    int l2 = i2 - j2;
                    if (l2 > 1000)
                        l2 = 1000;
                    int j3 = datainputstream.read(abyte0, j2, l2);
                    if (j3 < 0) {
                        s2 = "Length error: " + j2 + "/" + i2;
                        throw new IOException("EOF");
                    }
                    j2 += j3;
                    int k3 = (j2 * 100) / i2;
                    if (k3 != k1)
                        method13("Loading " + s + " - " + k3 + "%", k, 7);
                    k1 = k3;
                }
                datainputstream.close();
                try {
                    if (aClass45Array1225[0] != null)
                        aClass45Array1225[0].method539(abyte0.length, i, abyte0, (byte) 8);
                } catch (Exception _ex) {
                    aClass45Array1225[0] = null;
                }
                if (abyte0 != null) {
                    aCRC32_979.reset();
                    aCRC32_979.update(abyte0);
                    int i3 = (int) aCRC32_979.getValue();
                    if (i3 != j) {
                        abyte0 = null;
                        j1++;
                        s2 = "Checksum error: " + i3;
                    }
                }
            } catch (IOException ioexception) {
                if (s2.equals("Unknown error"))
                    s2 = "Connection error";
                abyte0 = null;
            } catch (NullPointerException _ex) {
                s2 = "Null error";
                abyte0 = null;
                if (!signlink.reporterror)
                    return null;
            } catch (ArrayIndexOutOfBoundsException _ex) {
                s2 = "Bounds error";
                abyte0 = null;
                if (!signlink.reporterror)
                    return null;
            } catch (Exception _ex) {
                s2 = "Unexpected error";
                abyte0 = null;
                if (!signlink.reporterror)
                    return null;
            }
            if (abyte0 == null) {
                for (int l1 = l; l1 > 0; l1--) {
                    if (j1 >= 3) {
                        method13("Game updated - please reload page", k, 7);
                        l1 = 10;
                    } else {
                        method13(s2 + " - Retrying in " + l1, k, 7);
                    }
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception ignored) {
                    }
                }

                l *= 2;
                if (l > 60)
                    l = 60;
                aBoolean1053 = !aBoolean1053;
            }
        }
        Class47 class47_1 = new Class47(0, abyte0);
        return class47_1;
    }

    public void method62(int i, long l) {
        try {
            if (i != 0)
                return;
            if (l == 0L)
                return;
            for (int j = 0; j < anInt1115; j++)
                if (aLongArray1159[j] == l) {
                    anInt1115--;
                    aBoolean928 = true;
                    for (int k = j; k < anInt1115; k++) {
                        aStringArray833[k] = aStringArray833[k + 1];
                        anIntArray1073[k] = anIntArray1073[k + 1];
                        aLongArray1159[k] = aLongArray1159[k + 1];
                    }

                    aClass44_Sub3_Sub2_843.putOpcode(106);
                    aClass44_Sub3_Sub2_843.put8(l, 0);
                    return;
                }

            return;
        } catch (RuntimeException runtimeexception) {
            signlink.reporterror("93477, " + i + ", " + l + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method63(byte byte0) {
        if (byte0 != -29)
            aBoolean899 = !aBoolean899;
        aClass34_865.method272(aBoolean960);
        Class44_Sub3_Sub1_Sub1.anIntArray1409 = anIntArray1243;
        aClass44_Sub3_Sub1_Sub3_1203.method453(aByte1070, 0, 0);
        if (aBoolean1265) {
            aClass44_Sub3_Sub1_Sub4_1077.method455(239, 40, 0, aString1019, false);
            aClass44_Sub3_Sub1_Sub4_1077.method455(239, 60, 128, aString984 + "*", false);
        } else if (aBoolean1104) {
            aClass44_Sub3_Sub1_Sub4_1077.method455(239, 40, 0, "Enter amount:", false);
            aClass44_Sub3_Sub1_Sub4_1077.method455(239, 60, 128, aString1182 + "*", false);
        } else if (aString829 != null) {
            aClass44_Sub3_Sub1_Sub4_1077.method455(239, 40, 0, aString829, false);
            aClass44_Sub3_Sub1_Sub4_1077.method455(239, 60, 128, "Click to continue", false);
        } else if (anInt1011 != -1)
            method127(0, Class5.aClass5Array103[anInt1011], 0, 0, (byte) 0);
        else if (anInt1110 != -1) {
            method127(0, Class5.aClass5Array103[anInt1110], 0, 0, (byte) 0);
        } else {
            Class44_Sub3_Sub1_Sub4 class44_sub3_sub1_sub4 = aClass44_Sub3_Sub1_Sub4_1076;
            int i = 0;
            Class44_Sub3_Sub1.method408(5, 77, 463, 0, 0);
            for (int j = 0; j < 100; j++)
                if (aStringArray950[j] != null) {
                    int k = anIntArray948[j];
                    int l = (70 - i * 14) + anInt1082;
                    String s1 = aStringArray949[j];
                    byte byte1 = 0;
                    if (s1 != null && s1.startsWith("@cr1@")) {
                        s1 = s1.substring(5);
                        byte1 = 1;
                    }
                    if (s1 != null && s1.startsWith("@cr2@")) {
                        s1 = s1.substring(5);
                        byte1 = 2;
                    }
                    if (k == 0) {
                        if (l > 0 && l < 110)
                            class44_sub3_sub1_sub4.method458(4, aStringArray950[j], 0, l, true);
                        i++;
                    }
                    if ((k == 1 || k == 2) && (k == 1 || anInt967 == 0 || anInt967 == 1 && method22(-238, s1))) {
                        if (l > 0 && l < 110) {
                            int i1 = 4;
                            if (byte1 == 1) {
                                aClass44_Sub3_Sub1_Sub3Array914[0].method453(aByte1070, i1, l - 12);
                                i1 += 14;
                            }
                            if (byte1 == 2) {
                                aClass44_Sub3_Sub1_Sub3Array914[1].method453(aByte1070, i1, l - 12);
                                i1 += 14;
                            }
                            class44_sub3_sub1_sub4.method458(i1, s1 + ":", 0, l, true);
                            i1 += class44_sub3_sub1_sub4.method457(-43341, s1) + 8;
                            class44_sub3_sub1_sub4.method458(i1, aStringArray950[j], 255, l, true);
                        }
                        i++;
                    }
                    if ((k == 3 || k == 7) && anInt1074 == 0 && (k == 7 || anInt972 == 0 || anInt972 == 1 && method22(-238, s1))) {
                        if (l > 0 && l < 110) {
                            int j1 = 4;
                            class44_sub3_sub1_sub4.method458(j1, "From", 0, l, true);
                            j1 += class44_sub3_sub1_sub4.method457(-43341, "From ");
                            if (byte1 == 1) {
                                aClass44_Sub3_Sub1_Sub3Array914[0].method453(aByte1070, j1, l - 12);
                                j1 += 14;
                            }
                            if (byte1 == 2) {
                                aClass44_Sub3_Sub1_Sub3Array914[1].method453(aByte1070, j1, l - 12);
                                j1 += 14;
                            }
                            class44_sub3_sub1_sub4.method458(j1, s1 + ":", 0, l, true);
                            j1 += class44_sub3_sub1_sub4.method457(-43341, s1) + 8;
                            class44_sub3_sub1_sub4.method458(j1, aStringArray950[j], 0x800000, l, true);
                        }
                        i++;
                    }
                    if (k == 4 && (anInt805 == 0 || anInt805 == 1 && method22(-238, s1))) {
                        if (l > 0 && l < 110)
                            class44_sub3_sub1_sub4.method458(4, s1 + " " + aStringArray950[j], 0x800080, l, true);
                        i++;
                    }
                    if (k == 5 && anInt1074 == 0 && anInt972 < 2) {
                        if (l > 0 && l < 110)
                            class44_sub3_sub1_sub4.method458(4, aStringArray950[j], 0x800000, l, true);
                        i++;
                    }
                    if (k == 6 && anInt1074 == 0 && anInt972 < 2) {
                        if (l > 0 && l < 110) {
                            class44_sub3_sub1_sub4.method458(4, "To " + s1 + ":", 0, l, true);
                            class44_sub3_sub1_sub4.method458(12 + class44_sub3_sub1_sub4.method457(-43341, "To " + s1), aStringArray950[j], 0x800000, l, true);
                        }
                        i++;
                    }
                    if (k == 8 && (anInt805 == 0 || anInt805 == 1 && method22(-238, s1))) {
                        if (l > 0 && l < 110)
                            class44_sub3_sub1_sub4.method458(4, s1 + " " + aStringArray950[j], 0x7e3200, l, true);
                        i++;
                    }
                }

            Class44_Sub3_Sub1.method407(true);
            anInt931 = i * 14 + 7;
            if (anInt931 < 78)
                anInt931 = 78;
            method56(anInt931 - anInt1082 - 77, 0, anInt931, (byte) 123, 463, 77);
            String s;
            if (aClass44_Sub3_Sub4_Sub6_Sub1_1252 != null && aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1657 != null)
                s = aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1657;
            else
                s = Class48.method551(131, aString1147);
            class44_sub3_sub1_sub4.method458(4, s + ":", 0, 90, true);
            class44_sub3_sub1_sub4.method458(6 + class44_sub3_sub1_sub4.method457(-43341, s + ": "), aString1009 + "*", 255, 90, true);
            Class44_Sub3_Sub1.method414(479, 0, 0, (byte) 125, 77);
        }
        if (aBoolean851 && anInt1254 == 2)
            method15(-593);
        aClass34_865.method273(17, super.aGraphics14, (byte) 76, 357);
        aClass34_864.method272(aBoolean960);
        Class44_Sub3_Sub1_Sub1.anIntArray1409 = anIntArray1245;
    }

    public void method6() {
        method13("Starting up", 20, 7);
        if (signlink.sunjava)
            super.anInt8 = 5;
        if (aBoolean926) {
            aBoolean1035 = true;
            return;
        }
        aBoolean926 = true;
        boolean flag = false;
        String s = method93(879);
        if (s.endsWith("jagex.com"))
            flag = true;
        if (s.endsWith("runescape.com"))
            flag = true;
        if (s.endsWith("192.168.1.2"))
            flag = true;
        if (s.endsWith("192.168.1.246"))
            flag = true;
        if (s.endsWith("192.168.1.247"))
            flag = true;
        if (s.endsWith("192.168.1.249"))
            flag = true;
        if (s.endsWith("192.168.1.253"))
            flag = true;
        if (s.endsWith("192.168.1.254"))
            flag = true;
        if (s.endsWith("127.0.0.1"))
            flag = true;
        if (!flag) {
            aBoolean898 = true;
            return;
        }
        if (signlink.cache_dat != null) {
            for (int i = 0; i < 5; i++)
                aClass45Array1225[i] = new Class45(signlink.cache_dat, 29615, signlink.cache_idx[i], i + 1, 0x7a120);

        }
        try {
            method147(0);
            aClass47_942 = method61("title screen", 1, "title", anIntArray885[1], (byte) 46, 25);
            aClass44_Sub3_Sub1_Sub4_1075 = new Class44_Sub3_Sub1_Sub4(aClass47_942, false, "p11_full", (byte) 0);
            aClass44_Sub3_Sub1_Sub4_1076 = new Class44_Sub3_Sub1_Sub4(aClass47_942, false, "p12_full", (byte) 0);
            aClass44_Sub3_Sub1_Sub4_1077 = new Class44_Sub3_Sub1_Sub4(aClass47_942, false, "b12_full", (byte) 0);
            aClass44_Sub3_Sub1_Sub4_1078 = new Class44_Sub3_Sub1_Sub4(aClass47_942, true, "q8_full", (byte) 0);
            method59(0);
            method91(4);
            Class47 class47 = method61("config", 2, "config", anIntArray885[2], (byte) 46, 30);
            Class47 class47_1 = method61("interface", 3, "interface", anIntArray885[3], (byte) 46, 35);
            Class47 class47_2 = method61("2d graphics", 4, "media", anIntArray885[4], (byte) 46, 40);
            Class47 class47_3 = method61("textures", 6, "textures", anIntArray885[6], (byte) 46, 45);
            Class47 class47_4 = method61("chat system", 7, "wordenc", anIntArray885[7], (byte) 46, 50);
            Class47 class47_5 = method61("sound effects", 8, "sounds", anIntArray885[8], (byte) 46, 55);
            aByteArrayArrayArray827 = new byte[4][104][104];
            anIntArrayArrayArray957 = new int[4][105][105];
            aClass36_915 = new Class36(4, 104, 104, anIntArrayArrayArray957, (byte) 6);
            for (int j = 0; j < 4; j++)
                aClass18Array1105[j] = new Class18(104, 104, true);

            aClass44_Sub3_Sub1_Sub2_1027 = new Class44_Sub3_Sub1_Sub2(512, 512);
            Class47 class47_6 = method61("update list", 5, "versionlist", anIntArray885[5], (byte) 46, 60);
            method13("Connecting to update server", 60, 7);
            aClass43_Sub1_1015 = new Class43_Sub1();
            aClass43_Sub1_1015.method383(class47_6, this);
            Class11.method207(aClass43_Sub1_1015.method386(836));
            Class44_Sub3_Sub4_Sub4.method500(aClass43_Sub1_1015.method385(anInt1235, 0), aClass43_Sub1_1015);
            if (!aBoolean1240) {
                anInt1183 = 0;
                try {
                    anInt1183 = Integer.parseInt(getParameter("music"));
                } catch (Exception ignored) {
                }
                aBoolean1184 = true;
                aClass43_Sub1_1015.method392(2, anInt1183);
                while (aClass43_Sub1_1015.method393() > 0) {
                    method23(0);
                    try {
                        Thread.sleep(100L);
                    } catch (Exception ignored) {
                    }
                    if (aClass43_Sub1_1015.anInt1300 > 3) {
                        method132("ondemand");
                        return;
                    }
                }
            }
            method13("Requesting animations", 65, 7);
            int k = aClass43_Sub1_1015.method385(anInt1235, 1);
            for (int i1 = 0; i1 < k; i1++)
                aClass43_Sub1_1015.method392(1, i1);

            while (aClass43_Sub1_1015.method393() > 0) {
                int j1 = k - aClass43_Sub1_1015.method393();
                if (j1 > 0)
                    method13("Loading animations - " + (j1 * 100) / k + "%", 65, 7);
                method23(0);
                try {
                    Thread.sleep(100L);
                } catch (Exception ignored) {
                }
                if (aClass43_Sub1_1015.anInt1300 > 3) {
                    method132("ondemand");
                    return;
                }
            }
            method13("Requesting models", 70, 7);
            k = aClass43_Sub1_1015.method385(anInt1235, 0);
            for (int k1 = 0; k1 < k; k1++) {
                int l1 = aClass43_Sub1_1015.method390(k1, (byte) 9);
                if ((l1 & 1) != 0)
                    aClass43_Sub1_1015.method392(0, k1);
            }

            k = aClass43_Sub1_1015.method393();
            while (aClass43_Sub1_1015.method393() > 0) {
                int i2 = k - aClass43_Sub1_1015.method393();
                if (i2 > 0)
                    method13("Loading models - " + (i2 * 100) / k + "%", 70, 7);
                method23(0);
                try {
                    Thread.sleep(100L);
                } catch (Exception ignored) {
                }
            }
            if (aClass45Array1225[0] != null) {
                method13("Requesting maps", 75, 7);
                aClass43_Sub1_1015.method392(3, aClass43_Sub1_1015.method387(0, 47, false, 48));
                aClass43_Sub1_1015.method392(3, aClass43_Sub1_1015.method387(1, 47, false, 48));
                aClass43_Sub1_1015.method392(3, aClass43_Sub1_1015.method387(0, 48, false, 48));
                aClass43_Sub1_1015.method392(3, aClass43_Sub1_1015.method387(1, 48, false, 48));
                aClass43_Sub1_1015.method392(3, aClass43_Sub1_1015.method387(0, 49, false, 48));
                aClass43_Sub1_1015.method392(3, aClass43_Sub1_1015.method387(1, 49, false, 48));
                aClass43_Sub1_1015.method392(3, aClass43_Sub1_1015.method387(0, 47, false, 47));
                aClass43_Sub1_1015.method392(3, aClass43_Sub1_1015.method387(1, 47, false, 47));
                aClass43_Sub1_1015.method392(3, aClass43_Sub1_1015.method387(0, 48, false, 47));
                aClass43_Sub1_1015.method392(3, aClass43_Sub1_1015.method387(1, 48, false, 47));
                aClass43_Sub1_1015.method392(3, aClass43_Sub1_1015.method387(0, 48, false, 148));
                aClass43_Sub1_1015.method392(3, aClass43_Sub1_1015.method387(1, 48, false, 148));
                k = aClass43_Sub1_1015.method393();
                while (aClass43_Sub1_1015.method393() > 0) {
                    int j2 = k - aClass43_Sub1_1015.method393();
                    if (j2 > 0)
                        method13("Loading maps - " + (j2 * 100) / k + "%", 75, 7);
                    method23(0);
                    try {
                        Thread.sleep(100L);
                    } catch (Exception ignored) {
                    }
                }
            }
            k = aClass43_Sub1_1015.method385(anInt1235, 0);
            for (int k2 = 0; k2 < k; k2++) {
                int l2 = aClass43_Sub1_1015.method390(k2, (byte) 9);
                byte byte0 = 0;
                if ((l2 & 8) != 0)
                    byte0 = 10;
                else if ((l2 & 0x20) != 0)
                    byte0 = 9;
                else if ((l2 & 0x10) != 0)
                    byte0 = 8;
                else if ((l2 & 0x40) != 0)
                    byte0 = 7;
                else if ((l2 & 0x80) != 0)
                    byte0 = 6;
                else if ((l2 & 2) != 0)
                    byte0 = 5;
                else if ((l2 & 4) != 0)
                    byte0 = 4;
                if ((l2 & 1) != 0)
                    byte0 = 3;
                if (byte0 != 0)
                    aClass43_Sub1_1015.method395((byte) 5, k2, 0, byte0);
            }

            aClass43_Sub1_1015.method388(aBoolean1239, -515);
            if (!aBoolean1240) {
                int l = aClass43_Sub1_1015.method385(anInt1235, 2);
                for (int i3 = 1; i3 < l; i3++)
                    if (aClass43_Sub1_1015.method391(i3, false))
                        aClass43_Sub1_1015.method395((byte) 5, i3, 2, (byte) 1);

            }
            method13("Unpacking media", 80, 7);
            aClass44_Sub3_Sub1_Sub3_1201 = new Class44_Sub3_Sub1_Sub3(class47_2, "invback", 0);
            aClass44_Sub3_Sub1_Sub3_1203 = new Class44_Sub3_Sub1_Sub3(class47_2, "chatback", 0);
            aClass44_Sub3_Sub1_Sub3_1202 = new Class44_Sub3_Sub1_Sub3(class47_2, "mapback", 0);
            aClass44_Sub3_Sub1_Sub3_1178 = new Class44_Sub3_Sub1_Sub3(class47_2, "backbase1", 0);
            aClass44_Sub3_Sub1_Sub3_1179 = new Class44_Sub3_Sub1_Sub3(class47_2, "backbase2", 0);
            aClass44_Sub3_Sub1_Sub3_1180 = new Class44_Sub3_Sub1_Sub3(class47_2, "backhmid1", 0);
            for (int j3 = 0; j3 < 13; j3++)
                aClass44_Sub3_Sub1_Sub3Array952[j3] = new Class44_Sub3_Sub1_Sub3(class47_2, "sideicons", j3);

            aClass44_Sub3_Sub1_Sub2_1085 = new Class44_Sub3_Sub1_Sub2(class47_2, "compass", 0);
            aClass44_Sub3_Sub1_Sub2_1126 = new Class44_Sub3_Sub1_Sub2(class47_2, "mapedge", 0);
            aClass44_Sub3_Sub1_Sub2_1126.method437((byte) 3);
            try {
                for (int k3 = 0; k3 < 100; k3++)
                    aClass44_Sub3_Sub1_Sub3Array1018[k3] = new Class44_Sub3_Sub1_Sub3(class47_2, "mapscene", k3);

            } catch (Exception ignored) {
            }
            try {
                for (int l3 = 0; l3 < 100; l3++)
                    aClass44_Sub3_Sub1_Sub2Array943[l3] = new Class44_Sub3_Sub1_Sub2(class47_2, "mapfunction", l3);

            } catch (Exception ignored) {
            }
            try {
                for (int i4 = 0; i4 < 20; i4++)
                    aClass44_Sub3_Sub1_Sub2Array935[i4] = new Class44_Sub3_Sub1_Sub2(class47_2, "hitmarks", i4);

            } catch (Exception ignored) {
            }
            try {
                for (int j4 = 0; j4 < 20; j4++)
                    aClass44_Sub3_Sub1_Sub2Array1001[j4] = new Class44_Sub3_Sub1_Sub2(class47_2, "headicons", j4);

            } catch (Exception ignored) {
            }
            aClass44_Sub3_Sub1_Sub2_964 = new Class44_Sub3_Sub1_Sub2(class47_2, "mapmarker", 0);
            aClass44_Sub3_Sub1_Sub2_965 = new Class44_Sub3_Sub1_Sub2(class47_2, "mapmarker", 1);
            for (int k4 = 0; k4 < 8; k4++)
                aClass44_Sub3_Sub1_Sub2Array1215[k4] = new Class44_Sub3_Sub1_Sub2(class47_2, "cross", k4);

            aClass44_Sub3_Sub1_Sub2_1187 = new Class44_Sub3_Sub1_Sub2(class47_2, "mapdots", 0);
            aClass44_Sub3_Sub1_Sub2_1188 = new Class44_Sub3_Sub1_Sub2(class47_2, "mapdots", 1);
            aClass44_Sub3_Sub1_Sub2_1189 = new Class44_Sub3_Sub1_Sub2(class47_2, "mapdots", 2);
            aClass44_Sub3_Sub1_Sub2_1190 = new Class44_Sub3_Sub1_Sub2(class47_2, "mapdots", 3);
            aClass44_Sub3_Sub1_Sub3_1154 = new Class44_Sub3_Sub1_Sub3(class47_2, "scrollbar", 0);
            aClass44_Sub3_Sub1_Sub3_1155 = new Class44_Sub3_Sub1_Sub3(class47_2, "scrollbar", 1);
            aClass44_Sub3_Sub1_Sub3_875 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone1", 0);
            aClass44_Sub3_Sub1_Sub3_876 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone2", 0);
            aClass44_Sub3_Sub1_Sub3_877 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone3", 0);
            aClass44_Sub3_Sub1_Sub3_878 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone1", 0);
            aClass44_Sub3_Sub1_Sub3_878.method450(2);
            aClass44_Sub3_Sub1_Sub3_879 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone2", 0);
            aClass44_Sub3_Sub1_Sub3_879.method450(2);
            aClass44_Sub3_Sub1_Sub3_1210 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone1", 0);
            aClass44_Sub3_Sub1_Sub3_1210.method451((byte) -36);
            aClass44_Sub3_Sub1_Sub3_1211 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone2", 0);
            aClass44_Sub3_Sub1_Sub3_1211.method451((byte) -36);
            aClass44_Sub3_Sub1_Sub3_1212 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone3", 0);
            aClass44_Sub3_Sub1_Sub3_1212.method451((byte) -36);
            aClass44_Sub3_Sub1_Sub3_1213 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone1", 0);
            aClass44_Sub3_Sub1_Sub3_1213.method450(2);
            aClass44_Sub3_Sub1_Sub3_1213.method451((byte) -36);
            aClass44_Sub3_Sub1_Sub3_1214 = new Class44_Sub3_Sub1_Sub3(class47_2, "redstone2", 0);
            aClass44_Sub3_Sub1_Sub3_1214.method450(2);
            aClass44_Sub3_Sub1_Sub3_1214.method451((byte) -36);
            for (int l4 = 0; l4 < 2; l4++)
                aClass44_Sub3_Sub1_Sub3Array914[l4] = new Class44_Sub3_Sub1_Sub3(class47_2, "mod_icons", l4);

            Class44_Sub3_Sub1_Sub2 class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(class47_2, "backleft1", 0);
            aClass34_852 = new Class34(class44_sub3_sub1_sub2.anInt1433, anInt940, class44_sub3_sub1_sub2.anInt1432, method11(aByte1102));
            class44_sub3_sub1_sub2.method438(0, false, 0);
            class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(class47_2, "backleft2", 0);
            aClass34_853 = new Class34(class44_sub3_sub1_sub2.anInt1433, anInt940, class44_sub3_sub1_sub2.anInt1432, method11(aByte1102));
            class44_sub3_sub1_sub2.method438(0, false, 0);
            class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(class47_2, "backright1", 0);
            aClass34_854 = new Class34(class44_sub3_sub1_sub2.anInt1433, anInt940, class44_sub3_sub1_sub2.anInt1432, method11(aByte1102));
            class44_sub3_sub1_sub2.method438(0, false, 0);
            class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(class47_2, "backright2", 0);
            aClass34_855 = new Class34(class44_sub3_sub1_sub2.anInt1433, anInt940, class44_sub3_sub1_sub2.anInt1432, method11(aByte1102));
            class44_sub3_sub1_sub2.method438(0, false, 0);
            class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(class47_2, "backtop1", 0);
            aClass34_856 = new Class34(class44_sub3_sub1_sub2.anInt1433, anInt940, class44_sub3_sub1_sub2.anInt1432, method11(aByte1102));
            class44_sub3_sub1_sub2.method438(0, false, 0);
            class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(class47_2, "backvmid1", 0);
            aClass34_857 = new Class34(class44_sub3_sub1_sub2.anInt1433, anInt940, class44_sub3_sub1_sub2.anInt1432, method11(aByte1102));
            class44_sub3_sub1_sub2.method438(0, false, 0);
            class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(class47_2, "backvmid2", 0);
            aClass34_858 = new Class34(class44_sub3_sub1_sub2.anInt1433, anInt940, class44_sub3_sub1_sub2.anInt1432, method11(aByte1102));
            class44_sub3_sub1_sub2.method438(0, false, 0);
            class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(class47_2, "backvmid3", 0);
            aClass34_859 = new Class34(class44_sub3_sub1_sub2.anInt1433, anInt940, class44_sub3_sub1_sub2.anInt1432, method11(aByte1102));
            class44_sub3_sub1_sub2.method438(0, false, 0);
            class44_sub3_sub1_sub2 = new Class44_Sub3_Sub1_Sub2(class47_2, "backhmid2", 0);
            aClass34_860 = new Class34(class44_sub3_sub1_sub2.anInt1433, anInt940, class44_sub3_sub1_sub2.anInt1432, method11(aByte1102));
            class44_sub3_sub1_sub2.method438(0, false, 0);
            int i5 = (int) (Math.random() * 21D) - 10;
            int j5 = (int) (Math.random() * 21D) - 10;
            int k5 = (int) (Math.random() * 21D) - 10;
            int l5 = (int) (Math.random() * 41D) - 20;
            for (int i6 = 0; i6 < 100; i6++) {
                if (aClass44_Sub3_Sub1_Sub2Array943[i6] != null)
                    aClass44_Sub3_Sub1_Sub2Array943[i6].method436(k5 + l5, 6, i5 + l5, j5 + l5);
                if (aClass44_Sub3_Sub1_Sub3Array1018[i6] != null)
                    aClass44_Sub3_Sub1_Sub3Array1018[i6].method452(k5 + l5, 6, i5 + l5, j5 + l5);
            }

            method13("Unpacking textures", 83, 7);
            Class44_Sub3_Sub1_Sub1.method423(class47_3, 0);
            Class44_Sub3_Sub1_Sub1.method427(-42222, 0.80000000000000004D);
            Class44_Sub3_Sub1_Sub1.method422(20, 2972);
            method13("Unpacking config", 86, 7);
            Class26.method253(false, class47);
            Class8.method197(class47);
            Class20.method243(false, class47);
            Class14.method218(class47);
            Class12.method212(class47);
            Class22.method247(false, class47);
            Class32.method269(false, class47);
            Class38.method337(false, class47);
            Class35.method275(false, class47);
            Class14.aBoolean324 = aBoolean1239;
            if (!aBoolean1240) {
                method13("Unpacking sounds", 90, 7);
                byte[] abyte0 = class47_5.method546("sounds.dat", null);
                Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(abyte0, (byte) 1);
                Class4.method175(false, class44_sub3_sub2);
            }
            method13("Unpacking interfaces", 95, 7);
            Class44_Sub3_Sub1_Sub4[] aclass44_sub3_sub1_sub4 = {
                    aClass44_Sub3_Sub1_Sub4_1075, aClass44_Sub3_Sub1_Sub4_1076, aClass44_Sub3_Sub1_Sub4_1077, aClass44_Sub3_Sub1_Sub4_1078
            };
            Class5.method181(class47_1, class47_2, aclass44_sub3_sub1_sub4, -584);
            method13("Preparing game engine", 100, 7);
            for (int j6 = 0; j6 < 33; j6++) {
                int k6 = 999;
                int i7 = 0;
                for (int k7 = 0; k7 < 34; k7++) {
                    if (aClass44_Sub3_Sub1_Sub3_1202.aByteArray1445[k7 + j6 * aClass44_Sub3_Sub1_Sub3_1202.anInt1447] == 0) {
                        if (k6 == 999)
                            k6 = k7;
                        continue;
                    }
                    if (k6 == 999)
                        continue;
                    i7 = k7;
                    break;
                }

                anIntArray883[j6] = k6;
                anIntArray1054[j6] = i7 - k6;
            }

            for (int l6 = 5; l6 < 156; l6++) {
                int j7 = 999;
                int l7 = 0;
                for (int j8 = 25; j8 < 172; j8++) {
                    if (aClass44_Sub3_Sub1_Sub3_1202.aByteArray1445[j8 + l6 * aClass44_Sub3_Sub1_Sub3_1202.anInt1447] == 0 && (j8 > 34 || l6 > 34)) {
                        if (j7 == 999)
                            j7 = j8;
                        continue;
                    }
                    if (j7 == 999)
                        continue;
                    l7 = j8;
                    break;
                }

                anIntArray1136[l6 - 5] = j7 - 25;
                anIntArray1150[l6 - 5] = l7 - j7;
            }

            Class44_Sub3_Sub1_Sub1.method420(479, 6487, 96);
            anIntArray1243 = Class44_Sub3_Sub1_Sub1.anIntArray1409;
            Class44_Sub3_Sub1_Sub1.method420(190, 6487, 261);
            anIntArray1244 = Class44_Sub3_Sub1_Sub1.anIntArray1409;
            Class44_Sub3_Sub1_Sub1.method420(512, 6487, 334);
            anIntArray1245 = Class44_Sub3_Sub1_Sub1.anIntArray1409;
            int[] ai = new int[9];
            for (int i8 = 0; i8 < 9; i8++) {
                int k8 = 128 + i8 * 32 + 15;
                int l8 = 600 + k8 * 3;
                int i9 = Class44_Sub3_Sub1_Sub1.anIntArray1407[k8];
                ai[i8] = l8 * i9 >> 16;
            }

            Class36.method314(334, false, 800, 512, 500, ai);
            Class41.method342(class47_4);
            aClass10_1160 = new Class10(anInt1224, this);
            method12(aClass10_1160, 10);
            return;
        } catch (Exception exception) {
            signlink.reporterror("loaderror " + aString828 + " " + anInt908);
        }
        aBoolean1174 = true;
    }

    public void method64(int i, int j, Class5 class5, int k, int l, int i1, int j1,
                         boolean flag, int k1) {
        if (i >= 0)
            anInt1220 = aClass44_Sub3_Sub2_1135.get1();
        if (aBoolean1017)
            anInt1086 = 32;
        else
            anInt1086 = 0;
        aBoolean1017 = false;
        if (j1 >= i1 && j1 < i1 + 16 && k >= l && k < l + 16) {
            class5.anInt123 -= anInt993 * 4;
            if (flag) {
                aBoolean928 = true;
            }
        } else if (j1 >= i1 && j1 < i1 + 16 && k >= (l + j) - 16 && k < l + j) {
            class5.anInt123 += anInt993 * 4;
            if (flag) {
                aBoolean928 = true;
            }
        } else if (j1 >= i1 - anInt1086 && j1 < i1 + 16 + anInt1086 && k >= l + 16 && k < (l + j) - 16 && anInt993 > 0) {
            int l1 = ((j - 32) * j) / k1;
            if (l1 < 8)
                l1 = 8;
            int i2 = k - l - 16 - l1 / 2;
            int j2 = j - 32 - l1;
            class5.anInt123 = ((k1 - j) * i2) / j2;
            if (flag)
                aBoolean928 = true;
            aBoolean1017 = true;
        }
    }

    public boolean method65(int i, byte byte0) {
        if (i < 0)
            return false;
        int j = anIntArray1193[i];
        if (byte0 != 9)
            anInt801 = aClass46_944.method542();
        if (j >= 2000)
            j -= 2000;
        return j == 605;
    }

    public void method66(int i, int j, Class44_Sub3_Sub2 class44_sub3_sub2) {
        i += j;
        class44_sub3_sub2.accessBits((byte) 4);
        int k = class44_sub3_sub2.getBit(8, (byte) -96);
        if (k < anInt1260) {
            for (int l = k; l < anInt1260; l++)
                anIntArray1065[anInt1064++] = anIntArray1261[l];

        }
        if (k > anInt1260) {
            signlink.reporterror(aString1147 + " Too many npcs");
            throw new RuntimeException("eek");
        }
        anInt1260 = 0;
        for (int i1 = 0; i1 < k; i1++) {
            int j1 = anIntArray1261[i1];
            Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1259[j1];
            int k1 = class44_sub3_sub2.getBit(1, (byte) -96);
            if (k1 == 0) {
                anIntArray1261[anInt1260++] = j1;
                class44_sub3_sub4_sub6_sub2.anInt1644 = anInt802;
            } else {
                int l1 = class44_sub3_sub2.getBit(2, (byte) -96);
                if (l1 == 0) {
                    anIntArray1261[anInt1260++] = j1;
                    class44_sub3_sub4_sub6_sub2.anInt1644 = anInt802;
                    anIntArray1124[anInt1123++] = j1;
                } else if (l1 == 1) {
                    anIntArray1261[anInt1260++] = j1;
                    class44_sub3_sub4_sub6_sub2.anInt1644 = anInt802;
                    int i2 = class44_sub3_sub2.getBit(3, (byte) -96);
                    class44_sub3_sub4_sub6_sub2.method530(true, i2, false);
                    int k2 = class44_sub3_sub2.getBit(1, (byte) -96);
                    if (k2 == 1)
                        anIntArray1124[anInt1123++] = j1;
                } else if (l1 == 2) {
                    anIntArray1261[anInt1260++] = j1;
                    class44_sub3_sub4_sub6_sub2.anInt1644 = anInt802;
                    int j2 = class44_sub3_sub2.getBit(3, (byte) -96);
                    class44_sub3_sub4_sub6_sub2.method530(true, j2, true);
                    int l2 = class44_sub3_sub2.getBit(3, (byte) -96);
                    class44_sub3_sub4_sub6_sub2.method530(true, l2, true);
                    int i3 = class44_sub3_sub2.getBit(1, (byte) -96);
                    if (i3 == 1)
                        anIntArray1124[anInt1123++] = j1;
                } else if (l1 == 3)
                    anIntArray1065[anInt1064++] = j1;
            }
        }

    }

    public void method67(int i, int j, Class44_Sub3_Sub2 class44_sub3_sub2) {
        j = 58 / j;
        if (i == 138 || i == 173) {
            int k = class44_sub3_sub2.get1();
            int l2 = anInt918 + (k >> 4 & 7);
            int i5 = anInt919 + (k & 7);
            int j7 = class44_sub3_sub2.get1();
            int k9 = j7 >> 2;
            int k11 = j7 & 3;
            int j13 = anIntArray973[k9];
            int j14;
            if (i == 173)
                j14 = -1;
            else
                j14 = class44_sub3_sub2.get2();
            if (l2 >= 0 && i5 >= 0 && l2 < 104 && i5 < 104)
                method82(i5, 4823, -1, j14, anInt1062, k11, l2, j13, k9, 0);
            return;
        }
        if (i == 48) {
            int l = class44_sub3_sub2.get1();
            int i3 = anInt918 + (l >> 4 & 7);
            int j5 = anInt919 + (l & 7);
            int k7 = class44_sub3_sub2.get1();
            int l9 = k7 >> 2;
            int l11 = k7 & 3;
            int k13 = anIntArray973[l9];
            int k14 = class44_sub3_sub2.get2();
            if (i3 >= 0 && j5 >= 0 && i3 < 103 && j5 < 103) {
                int j15 = anIntArrayArrayArray957[anInt1062][i3][j5];
                int i16 = anIntArrayArrayArray957[anInt1062][i3 + 1][j5];
                int l16 = anIntArrayArrayArray957[anInt1062][i3 + 1][j5 + 1];
                int k17 = anIntArrayArrayArray957[anInt1062][i3][j5 + 1];
                if (k13 == 0) {
                    Class33 class33 = aClass36_915.method300((byte) -31, j5, anInt1062, i3);
                    if (class33 != null) {
                        int j18 = class33.anInt567 >> 14 & 0x7fff;
                        if (l9 == 2) {
                            class33.aClass44_Sub3_Sub4_565 = new Class44_Sub3_Sub4_Sub1(2, 4 + l11, k14, j18, l16, anInt907, false, i16, k17, j15);
                            class33.aClass44_Sub3_Sub4_566 = new Class44_Sub3_Sub4_Sub1(2, l11 + 1 & 3, k14, j18, l16, anInt907, false, i16, k17, j15);
                        } else {
                            class33.aClass44_Sub3_Sub4_565 = new Class44_Sub3_Sub4_Sub1(l9, l11, k14, j18, l16, anInt907, false, i16, k17, j15);
                        }
                    }
                }
                if (k13 == 1) {
                    Class13 class13 = aClass36_915.method301(i3, (byte) 1, anInt1062, j5);
                    if (class13 != null)
                        class13.aClass44_Sub3_Sub4_312 = new Class44_Sub3_Sub4_Sub1(4, 0, k14, class13.anInt313 >> 14 & 0x7fff, l16, anInt907, false, i16, k17, j15);
                }
                if (k13 == 2) {
                    Class30 class30 = aClass36_915.method302(i3, anInt1062, aBoolean881, j5);
                    if (l9 == 11)
                        l9 = 10;
                    if (class30 != null)
                        class30.aClass44_Sub3_Sub4_532 = new Class44_Sub3_Sub4_Sub1(l9, l11, k14, class30.anInt540 >> 14 & 0x7fff, l16, anInt907, false, i16, k17, j15);
                }
                if (k13 == 3) {
                    Class17 class17 = aClass36_915.method303(i3, anInt1062, j5, (byte) 7);
                    if (class17 != null)
                        class17.aClass44_Sub3_Sub4_397 = new Class44_Sub3_Sub4_Sub1(22, l11, k14, class17.anInt398 >> 14 & 0x7fff, l16, anInt907, false, i16, k17, j15);
                }
            }
            return;
        }
        if (i == 81) {
            int i1 = class44_sub3_sub2.get1();
            int j3 = anInt918 + (i1 >> 4 & 7);
            int k5 = anInt919 + (i1 & 7);
            int l7 = class44_sub3_sub2.get2();
            int i10 = class44_sub3_sub2.get2();
            if (j3 >= 0 && k5 >= 0 && j3 < 104 && k5 < 104) {
                Class44_Sub3_Sub4_Sub2 class44_sub3_sub4_sub2 = new Class44_Sub3_Sub4_Sub2();
                class44_sub3_sub4_sub2.anInt1480 = l7;
                class44_sub3_sub4_sub2.anInt1481 = i10;
                if (aClass28ArrayArrayArray816[anInt1062][j3][k5] == null)
                    aClass28ArrayArrayArray816[anInt1062][j3][k5] = new Class28(-822);
                aClass28ArrayArrayArray816[anInt1062][j3][k5].method256(class44_sub3_sub4_sub2);
                method52(j3, k5);
            }
            return;
        }
        if (i == 52) {
            int j1 = class44_sub3_sub2.get1();
            int k3 = anInt918 + (j1 >> 4 & 7);
            int l5 = anInt919 + (j1 & 7);
            int i8 = class44_sub3_sub2.get2();
            if (k3 >= 0 && l5 >= 0 && k3 < 104 && l5 < 104) {
                Class28 class28 = aClass28ArrayArrayArray816[anInt1062][k3][l5];
                if (class28 != null) {
                    for (Class44_Sub3_Sub4_Sub2 class44_sub3_sub4_sub2_1 = (Class44_Sub3_Sub4_Sub2) class28.method259(); class44_sub3_sub4_sub2_1 != null; class44_sub3_sub4_sub2_1 = (Class44_Sub3_Sub4_Sub2) class28.method261(aByte958)) {
                        if (class44_sub3_sub4_sub2_1.anInt1480 != (i8 & 0x7fff))
                            continue;
                        class44_sub3_sub4_sub2_1.method404();
                        break;
                    }

                    if (class28.method259() == null)
                        aClass28ArrayArrayArray816[anInt1062][k3][l5] = null;
                    method52(k3, l5);
                }
            }
            return;
        }
        if (i == 107) {
            int k1 = class44_sub3_sub2.get1();
            int l3 = anInt918 + (k1 >> 4 & 7);
            int i6 = anInt919 + (k1 & 7);
            int j8 = l3 + class44_sub3_sub2.get1Signed();
            int j10 = i6 + class44_sub3_sub2.get1Signed();
            int i12 = class44_sub3_sub2.get2Signed();
            int l13 = class44_sub3_sub2.get2();
            int l14 = class44_sub3_sub2.get1() * 4;
            int k15 = class44_sub3_sub2.get1() * 4;
            int j16 = class44_sub3_sub2.get2();
            int i17 = class44_sub3_sub2.get2();
            int l17 = class44_sub3_sub2.get1();
            int i18 = class44_sub3_sub2.get1();
            if (l3 >= 0 && i6 >= 0 && l3 < 104 && i6 < 104 && j8 >= 0 && j10 >= 0 && j8 < 104 && j10 < 104) {
                l3 = l3 * 128 + 64;
                i6 = i6 * 128 + 64;
                j8 = j8 * 128 + 64;
                j10 = j10 * 128 + 64;
                Class44_Sub3_Sub4_Sub3 class44_sub3_sub4_sub3 = new Class44_Sub3_Sub4_Sub3(l3, i18, k15, i17 + anInt802, l17, j16 + anInt802, anInt1062, l13, aBoolean930, method50(l3, i6, 0, anInt1062) - l14, i12, i6);
                class44_sub3_sub4_sub3.method497(j16 + anInt802, method50(j8, j10, 0, anInt1062) - k15, j8, (byte) 7, j10);
                aClass28_1156.method256(class44_sub3_sub4_sub3);
            }
            return;
        }
        if (i == 85) {
            int l1 = class44_sub3_sub2.get1();
            int i4 = anInt918 + (l1 >> 4 & 7);
            int j6 = anInt919 + (l1 & 7);
            int k8 = class44_sub3_sub2.get2();
            int k10 = class44_sub3_sub2.get1();
            int j12 = class44_sub3_sub2.get2();
            if (i4 >= 0 && j6 >= 0 && i4 < 104 && j6 < 104) {
                i4 = i4 * 128 + 64;
                j6 = j6 * 128 + 64;
                Class44_Sub3_Sub4_Sub5 class44_sub3_sub4_sub5 = new Class44_Sub3_Sub4_Sub5(j12, j6, i4, anInt1062, 0, method50(i4, j6, 0, anInt1062) - k10, k8, anInt802);
                aClass28_924.method256(class44_sub3_sub4_sub5);
            }
            return;
        }
        if (i == 219) {
            int i2 = class44_sub3_sub2.get1();
            int j4 = anInt918 + (i2 >> 4 & 7);
            int k6 = anInt919 + (i2 & 7);
            int l8 = class44_sub3_sub2.get2();
            int l10 = class44_sub3_sub2.get2();
            int k12 = class44_sub3_sub2.get2();
            if (j4 >= 0 && k6 >= 0 && j4 < 104 && k6 < 104 && k12 != anInt947) {
                Class44_Sub3_Sub4_Sub2 class44_sub3_sub4_sub2_2 = new Class44_Sub3_Sub4_Sub2();
                class44_sub3_sub4_sub2_2.anInt1480 = l8;
                class44_sub3_sub4_sub2_2.anInt1481 = l10;
                if (aClass28ArrayArrayArray816[anInt1062][j4][k6] == null)
                    aClass28ArrayArrayArray816[anInt1062][j4][k6] = new Class28(-822);
                aClass28ArrayArrayArray816[anInt1062][j4][k6].method256(class44_sub3_sub4_sub2_2);
                method52(j4, k6);
            }
            return;
        }
        if (i == 176) {
            int j2 = class44_sub3_sub2.get1();
            int k4 = anInt918 + (j2 >> 4 & 7);
            int l6 = anInt919 + (j2 & 7);
            int i9 = class44_sub3_sub2.get1();
            int i11 = i9 >> 2;
            int l12 = i9 & 3;
            int i14 = anIntArray973[i11];
            int i15 = class44_sub3_sub2.get2();
            int l15 = class44_sub3_sub2.get2();
            int k16 = class44_sub3_sub2.get2();
            int j17 = class44_sub3_sub2.get2();
            byte byte0 = class44_sub3_sub2.get1Signed();
            byte byte1 = class44_sub3_sub2.get1Signed();
            byte byte2 = class44_sub3_sub2.get1Signed();
            byte byte3 = class44_sub3_sub2.get1Signed();
            Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1;
            if (j17 == anInt947)
                class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1_1252;
            else
                class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1120[j17];
            if (class44_sub3_sub4_sub6_sub1 != null) {
                Class8 class8 = Class8.method199(i15);
                int k18 = anIntArrayArrayArray957[anInt1062][k4][l6];
                int l18 = anIntArrayArrayArray957[anInt1062][k4 + 1][l6];
                int i19 = anIntArrayArrayArray957[anInt1062][k4 + 1][l6 + 1];
                int j19 = anIntArrayArrayArray957[anInt1062][k4][l6 + 1];
                Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4 = class8.method205(i11, l12, k18, l18, i19, j19, -1);
                if (class44_sub3_sub4_sub4 != null) {
                    method82(l6, 4823, k16 + 1, -1, anInt1062, 0, k4, i14, 0, l15 + 1);
                    class44_sub3_sub4_sub6_sub1.anInt1667 = l15 + anInt802;
                    class44_sub3_sub4_sub6_sub1.anInt1668 = k16 + anInt802;
                    class44_sub3_sub4_sub6_sub1.aClass44_Sub3_Sub4_Sub4_1672 = class44_sub3_sub4_sub4;
                    int k19 = class8.anInt225;
                    int l19 = class8.anInt226;
                    if (l12 == 1 || l12 == 3) {
                        k19 = class8.anInt226;
                        l19 = class8.anInt225;
                    }
                    class44_sub3_sub4_sub6_sub1.anInt1669 = k4 * 128 + k19 * 64;
                    class44_sub3_sub4_sub6_sub1.anInt1671 = l6 * 128 + l19 * 64;
                    class44_sub3_sub4_sub6_sub1.anInt1670 = method50(class44_sub3_sub4_sub6_sub1.anInt1669, class44_sub3_sub4_sub6_sub1.anInt1671, 0, anInt1062);
                    if (byte0 > byte2) {
                        byte byte4 = byte0;
                        byte0 = byte2;
                        byte2 = byte4;
                    }
                    if (byte1 > byte3) {
                        byte byte5 = byte1;
                        byte1 = byte3;
                        byte3 = byte5;
                    }
                    class44_sub3_sub4_sub6_sub1.anInt1673 = k4 + byte0;
                    class44_sub3_sub4_sub6_sub1.anInt1675 = k4 + byte2;
                    class44_sub3_sub4_sub6_sub1.anInt1674 = l6 + byte1;
                    class44_sub3_sub4_sub6_sub1.anInt1676 = l6 + byte3;
                }
            }
        }
        if (i == 95) {
            int k2 = class44_sub3_sub2.get1();
            int l4 = anInt918 + (k2 >> 4 & 7);
            int i7 = anInt919 + (k2 & 7);
            int j9 = class44_sub3_sub2.get2();
            int j11 = class44_sub3_sub2.get2();
            int i13 = class44_sub3_sub2.get2();
            if (l4 >= 0 && i7 >= 0 && l4 < 104 && i7 < 104) {
                Class28 class28_1 = aClass28ArrayArrayArray816[anInt1062][l4][i7];
                if (class28_1 != null) {
                    for (Class44_Sub3_Sub4_Sub2 class44_sub3_sub4_sub2_3 = (Class44_Sub3_Sub4_Sub2) class28_1.method259(); class44_sub3_sub4_sub2_3 != null; class44_sub3_sub4_sub2_3 = (Class44_Sub3_Sub4_Sub2) class28_1.method261(aByte958)) {
                        if (class44_sub3_sub4_sub2_3.anInt1480 != (j9 & 0x7fff) || class44_sub3_sub4_sub2_3.anInt1481 != j11)
                            continue;
                        class44_sub3_sub4_sub2_3.anInt1481 = i13;
                        break;
                    }

                    method52(l4, i7);
                }
            }
        }
    }

    public void method68(int i) {
        if (anInt895 != 0)
            return;
        aStringArray1114[0] = "Cancel";
        anIntArray1193[0] = 1106;
        anInt980 = 1;
        method83(false);
        anInt1130 = 0;
        if (super.anInt22 > 4 && super.anInt23 > 4 && super.anInt22 < 516 && super.anInt23 < 338)
            if (anInt1037 != -1)
                method69(super.anInt23, super.anInt22, 4, Class5.aClass5Array103[anInt1037], 0, 0, 4);
            else
                method47(571);
        if (anInt1130 != anInt1248)
            anInt1248 = anInt1130;
        anInt1130 = 0;
        if (super.anInt22 > 553 && super.anInt23 > 205 && super.anInt22 < 743 && super.anInt23 < 466)
            if (anInt1216 != -1)
                method69(super.anInt23, super.anInt22, 205, Class5.aClass5Array103[anInt1216], 0, 0, 553);
            else if (anIntArray954[anInt1013] != -1)
                method69(super.anInt23, super.anInt22, 205, Class5.aClass5Array103[anIntArray954[anInt1013]], 0, 0, 553);
        if (anInt1130 != anInt1016) {
            aBoolean928 = true;
            anInt1016 = anInt1130;
        }
        anInt1130 = 0;
        if (i != 4)
            aClass28ArrayArrayArray816 = null;
        if (super.anInt22 > 17 && super.anInt23 > 357 && super.anInt22 < 496 && super.anInt23 < 453)
            if (anInt1011 != -1)
                method69(super.anInt23, super.anInt22, 357, Class5.aClass5Array103[anInt1011], 0, 0, 17);
            else if (super.anInt23 < 434 && super.anInt22 < 426)
                method90(super.anInt22 - 17, true, super.anInt23 - 357);
        if (anInt1011 != -1 && anInt1130 != anInt1066) {
            aBoolean1109 = true;
            anInt1066 = anInt1130;
        }
        for (boolean flag = false; !flag; ) {
            flag = true;
            for (int j = 0; j < anInt980 - 1; j++)
                if (anIntArray1193[j] < 1000 && anIntArray1193[j + 1] > 1000) {
                    String s = aStringArray1114[j];
                    aStringArray1114[j] = aStringArray1114[j + 1];
                    aStringArray1114[j + 1] = s;
                    int k = anIntArray1193[j];
                    anIntArray1193[j] = anIntArray1193[j + 1];
                    anIntArray1193[j + 1] = k;
                    k = anIntArray1191[j];
                    anIntArray1191[j] = anIntArray1191[j + 1];
                    anIntArray1191[j + 1] = k;
                    k = anIntArray1192[j];
                    anIntArray1192[j] = anIntArray1192[j + 1];
                    anIntArray1192[j + 1] = k;
                    k = anIntArray1194[j];
                    anIntArray1194[j] = anIntArray1194[j + 1];
                    anIntArray1194[j + 1] = k;
                    flag = false;
                }

        }

    }

    public void method10(int i) {
        i = 43 / i;
        aBoolean917 = true;
    }

    public void method13(String s, int i, int j) {
        anInt908 = i;
        if (j != 7)
            return;
        aString828 = s;
        method16(anInt845);
        if (aClass47_942 == null) {
            super.method13(s, i, 7);
            return;
        }
        aClass34_1041.method272(aBoolean960);
        char c = '\u0168';
        char c1 = '\310';
        byte byte0 = 20;
        aClass44_Sub3_Sub1_Sub4_1077.method455(c / 2, c1 / 2 - 26 - byte0, 0xffffff, "RuneScape is loading - please wait...", false);
        int k = c1 / 2 - 18 - byte0;
        Class44_Sub3_Sub1.method412(304, 0x8c1111, 34, c / 2 - 152, k, 394);
        Class44_Sub3_Sub1.method412(302, 0, 32, c / 2 - 151, k + 1, 394);
        Class44_Sub3_Sub1.method411(30, 0x8c1111, i * 3, c / 2 - 150, 0, k + 2);
        Class44_Sub3_Sub1.method411(30, 0, 300 - i * 3, (c / 2 - 150) + i * 3, 0, k + 2);
        aClass44_Sub3_Sub1_Sub4_1077.method455(c / 2, (c1 / 2 + 5) - byte0, 0xffffff, s, false);
        aClass34_1041.method273(202, super.aGraphics14, (byte) 76, 171);
        if (aBoolean917) {
            aBoolean917 = false;
            if (!aBoolean906) {
                aClass34_1042.method273(0, super.aGraphics14, (byte) 76, 0);
                aClass34_1043.method273(637, super.aGraphics14, (byte) 76, 0);
            }
            aClass34_1039.method273(128, super.aGraphics14, (byte) 76, 0);
            aClass34_1040.method273(202, super.aGraphics14, (byte) 76, 371);
            aClass34_1044.method273(0, super.aGraphics14, (byte) 76, 265);
            aClass34_1045.method273(562, super.aGraphics14, (byte) 76, 265);
            aClass34_1046.method273(128, super.aGraphics14, (byte) 76, 171);
            aClass34_1047.method273(562, super.aGraphics14, (byte) 76, 171);
        }
    }

    public void method69(int i, int j, int k, Class5 class5, int l, int i1, int j1) {
        if (class5.anInt110 != 0 || class5.anIntArray125 == null || class5.aBoolean124)
            return;
        if (j < j1 || i < k || j > j1 + class5.anInt113 || i > k + class5.anInt114)
            return;
        int k1 = class5.anIntArray125.length;
        anInt1219 += l;
        for (int l1 = 0; l1 < k1; l1++) {
            int i2 = class5.anIntArray126[l1] + j1;
            int j2 = (class5.anIntArray127[l1] + k) - i1;
            Class5 class5_1 = Class5.aClass5Array103[class5.anIntArray125[l1]];
            i2 += class5_1.anInt116;
            j2 += class5_1.anInt117;
            if ((class5_1.anInt121 >= 0 || class5_1.anInt148 != 0) && j >= i2 && i >= j2 && j < i2 + class5_1.anInt113 && i < j2 + class5_1.anInt114)
                if (class5_1.anInt121 >= 0)
                    anInt1130 = class5_1.anInt121;
                else
                    anInt1130 = class5_1.anInt108;
            if (class5_1.anInt110 == 0) {
                method69(i, j, j2, class5_1, 0, class5_1.anInt123, i2);
                if (class5_1.anInt122 > class5_1.anInt114)
                    method64(-782, class5_1.anInt114, class5_1, i, j2, i2 + class5_1.anInt113, j, true, class5_1.anInt122);
            } else {
                if (class5_1.anInt111 == 1 && j >= i2 && i >= j2 && j < i2 + class5_1.anInt113 && i < j2 + class5_1.anInt114) {
                    boolean flag = false;
                    if (class5_1.anInt112 != 0)
                        flag = method24(class5_1, (byte) 15);
                    if (!flag) {
                        aStringArray1114[anInt980] = class5_1.aString164;
                        anIntArray1193[anInt980] = 231;
                        anIntArray1192[anInt980] = class5_1.anInt108;
                        anInt980++;
                    }
                }
                if (class5_1.anInt111 == 2 && anInt1196 == 0 && j >= i2 && i >= j2 && j < i2 + class5_1.anInt113 && i < j2 + class5_1.anInt114) {
                    String s = class5_1.aString161;
                    if (s.contains(" "))
                        s = s.substring(0, s.indexOf(" "));
                    aStringArray1114[anInt980] = s + " @gre@" + class5_1.aString162;
                    anIntArray1193[anInt980] = 274;
                    anIntArray1192[anInt980] = class5_1.anInt108;
                    anInt980++;
                }
                if (class5_1.anInt111 == 3 && j >= i2 && i >= j2 && j < i2 + class5_1.anInt113 && i < j2 + class5_1.anInt114) {
                    aStringArray1114[anInt980] = "Close";
                    anIntArray1193[anInt980] = 737;
                    anIntArray1192[anInt980] = class5_1.anInt108;
                    anInt980++;
                }
                if (class5_1.anInt111 == 4 && j >= i2 && i >= j2 && j < i2 + class5_1.anInt113 && i < j2 + class5_1.anInt114) {
                    aStringArray1114[anInt980] = class5_1.aString164;
                    anIntArray1193[anInt980] = 435;
                    anIntArray1192[anInt980] = class5_1.anInt108;
                    anInt980++;
                }
                if (class5_1.anInt111 == 5 && j >= i2 && i >= j2 && j < i2 + class5_1.anInt113 && i < j2 + class5_1.anInt114) {
                    aStringArray1114[anInt980] = class5_1.aString164;
                    anIntArray1193[anInt980] = 225;
                    anIntArray1192[anInt980] = class5_1.anInt108;
                    anInt980++;
                }
                if (class5_1.anInt111 == 6 && !aBoolean1168 && j >= i2 && i >= j2 && j < i2 + class5_1.anInt113 && i < j2 + class5_1.anInt114) {
                    aStringArray1114[anInt980] = class5_1.aString164;
                    anIntArray1193[anInt980] = 997;
                    anIntArray1192[anInt980] = class5_1.anInt108;
                    anInt980++;
                }
                if (class5_1.anInt110 == 2) {
                    int k2 = 0;
                    for (int l2 = 0; l2 < class5_1.anInt114; l2++) {
                        for (int i3 = 0; i3 < class5_1.anInt113; i3++) {
                            int j3 = i2 + i3 * (32 + class5_1.anInt134);
                            int k3 = j2 + l2 * (32 + class5_1.anInt135);
                            if (k2 < 20) {
                                j3 += class5_1.anIntArray137[k2];
                                k3 += class5_1.anIntArray138[k2];
                            }
                            if (j >= j3 && i >= k3 && j < j3 + 32 && i < k3 + 32) {
                                anInt962 = k2;
                                anInt963 = class5_1.anInt108;
                                if (class5_1.anIntArray104[k2] > 0) {
                                    Class14 class14 = Class14.method220(class5_1.anIntArray104[k2] - 1);
                                    if (anInt811 == 1 && class5_1.aBoolean131) {
                                        if (class5_1.anInt108 != anInt813 || k2 != anInt812) {
                                            aStringArray1114[anInt980] = "Use " + aString815 + " with @lre@" + class14.aString327;
                                            anIntArray1193[anInt980] = 398;
                                            anIntArray1194[anInt980] = class14.anInt325;
                                            anIntArray1191[anInt980] = k2;
                                            anIntArray1192[anInt980] = class5_1.anInt108;
                                            anInt980++;
                                        }
                                    } else if (anInt1196 == 1 && class5_1.aBoolean131) {
                                        if ((anInt1198 & 0x10) == 16) {
                                            aStringArray1114[anInt980] = aString1199 + " @lre@" + class14.aString327;
                                            anIntArray1193[anInt980] = 563;
                                            anIntArray1194[anInt980] = class14.anInt325;
                                            anIntArray1191[anInt980] = k2;
                                            anIntArray1192[anInt980] = class5_1.anInt108;
                                            anInt980++;
                                        }
                                    } else {
                                        if (class5_1.aBoolean131) {
                                            for (int l3 = 4; l3 >= 3; l3--)
                                                if (class14.aStringArray342 != null && class14.aStringArray342[l3] != null) {
                                                    aStringArray1114[anInt980] = class14.aStringArray342[l3] + " @lre@" + class14.aString327;
                                                    if (l3 == 3)
                                                        anIntArray1193[anInt980] = 681;
                                                    if (l3 == 4)
                                                        anIntArray1193[anInt980] = 100;
                                                    anIntArray1194[anInt980] = class14.anInt325;
                                                    anIntArray1191[anInt980] = k2;
                                                    anIntArray1192[anInt980] = class5_1.anInt108;
                                                    anInt980++;
                                                } else if (l3 == 4) {
                                                    aStringArray1114[anInt980] = "Drop @lre@" + class14.aString327;
                                                    anIntArray1193[anInt980] = 100;
                                                    anIntArray1194[anInt980] = class14.anInt325;
                                                    anIntArray1191[anInt980] = k2;
                                                    anIntArray1192[anInt980] = class5_1.anInt108;
                                                    anInt980++;
                                                }

                                        }
                                        if (class5_1.aBoolean132) {
                                            aStringArray1114[anInt980] = "Use @lre@" + class14.aString327;
                                            anIntArray1193[anInt980] = 102;
                                            anIntArray1194[anInt980] = class14.anInt325;
                                            anIntArray1191[anInt980] = k2;
                                            anIntArray1192[anInt980] = class5_1.anInt108;
                                            anInt980++;
                                        }
                                        if (class5_1.aBoolean131 && class14.aStringArray342 != null) {
                                            for (int i4 = 2; i4 >= 0; i4--)
                                                if (class14.aStringArray342[i4] != null) {
                                                    aStringArray1114[anInt980] = class14.aStringArray342[i4] + " @lre@" + class14.aString327;
                                                    if (i4 == 0)
                                                        anIntArray1193[anInt980] = 694;
                                                    if (i4 == 1)
                                                        anIntArray1193[anInt980] = 962;
                                                    if (i4 == 2)
                                                        anIntArray1193[anInt980] = 795;
                                                    anIntArray1194[anInt980] = class14.anInt325;
                                                    anIntArray1191[anInt980] = k2;
                                                    anIntArray1192[anInt980] = class5_1.anInt108;
                                                    anInt980++;
                                                }

                                        }
                                        if (class5_1.aStringArray139 != null) {
                                            for (int j4 = 4; j4 >= 0; j4--)
                                                if (class5_1.aStringArray139[j4] != null) {
                                                    aStringArray1114[anInt980] = class5_1.aStringArray139[j4] + " @lre@" + class14.aString327;
                                                    if (j4 == 0)
                                                        anIntArray1193[anInt980] = 582;
                                                    if (j4 == 1)
                                                        anIntArray1193[anInt980] = 113;
                                                    if (j4 == 2)
                                                        anIntArray1193[anInt980] = 555;
                                                    if (j4 == 3)
                                                        anIntArray1193[anInt980] = 331;
                                                    if (j4 == 4)
                                                        anIntArray1193[anInt980] = 354;
                                                    anIntArray1194[anInt980] = class14.anInt325;
                                                    anIntArray1191[anInt980] = k2;
                                                    anIntArray1192[anInt980] = class5_1.anInt108;
                                                    anInt980++;
                                                }

                                        }
                                        aStringArray1114[anInt980] = "Examine @lre@" + class14.aString327;
                                        anIntArray1193[anInt980] = 1328;
                                        anIntArray1194[anInt980] = class14.anInt325;
                                        anIntArray1191[anInt980] = k2;
                                        anIntArray1192[anInt980] = class5_1.anInt108;
                                        anInt980++;
                                    }
                                }
                            }
                            k2++;
                        }

                    }

                }
            }
        }

    }

    public void method70(boolean flag) {
        if (flag)
            aBoolean826 = !aBoolean826;
        for (Class44_Sub3_Sub4_Sub5 class44_sub3_sub4_sub5 = (Class44_Sub3_Sub4_Sub5) aClass28_924.method259(); class44_sub3_sub4_sub5 != null; class44_sub3_sub4_sub5 = (Class44_Sub3_Sub4_Sub5) aClass28_924.method261(aByte958))
            if (class44_sub3_sub4_sub5.anInt1591 != anInt1062 || class44_sub3_sub4_sub5.aBoolean1597)
                class44_sub3_sub4_sub5.method404();
            else if (anInt802 >= class44_sub3_sub4_sub5.anInt1590) {
                class44_sub3_sub4_sub5.method528(0, anInt975);
                if (class44_sub3_sub4_sub5.aBoolean1597)
                    class44_sub3_sub4_sub5.method404();
                else
                    aClass36_915.method289(class44_sub3_sub4_sub5.anInt1594, class44_sub3_sub4_sub5, class44_sub3_sub4_sub5.anInt1592, -1, class44_sub3_sub4_sub5.anInt1593, (byte) 1, 60, 0, class44_sub3_sub4_sub5.anInt1591, false);
            }

    }

    public void method71(int i) {
        if (anInt1223 > 0) {
            method80(false);
            return;
        }
        aClass34_864.method272(aBoolean960);
        aClass44_Sub3_Sub1_Sub4_1076.method455(257, 144, 0, "Connection lost", false);
        aClass44_Sub3_Sub1_Sub4_1076.method455(256, 143, 0xffffff, "Connection lost", false);
        anInt1219 += i;
        aClass44_Sub3_Sub1_Sub4_1076.method455(257, 159, 0, "Please wait - attempting to reestablish", false);
        aClass44_Sub3_Sub1_Sub4_1076.method455(256, 158, 0xffffff, "Please wait - attempting to reestablish", false);
        aClass34_864.method273(4, super.aGraphics14, (byte) 76, 4);
        anInt1031 = 0;
        anInt1025 = 0;
        Class7 class7 = aClass7_1108;
        aBoolean905 = false;
        method48(aString1147, aString1148, true);
        if (!aBoolean905)
            method80(false);
        try {
            class7.method191();
        } catch (Exception _ex) {
        }
    }

    public Socket method72(int i)
            throws IOException {
        if (signlink.mainapp != null)
            return signlink.opensocket(i);
        else
            return new Socket(InetAddress.getByName(getCodeBase().getHost()), i);
    }

    public void run() {
        if (aBoolean1175) {
            method85(-568);
        } else {
            super.run();
        }
    }

    public void method74(int i) {
        if (anInt1074 == 0)
            return;
        Class44_Sub3_Sub1_Sub4 class44_sub3_sub1_sub4 = aClass44_Sub3_Sub1_Sub4_1076;
        if (i != 3)
            return;
        int j = 0;
        if (anInt803 != 0)
            j = 1;
        for (int k = 0; k < 100; k++)
            if (aStringArray950[k] != null) {
                int l = anIntArray948[k];
                String s = aStringArray949[k];
                byte byte0 = 0;
                if (s != null && s.startsWith("@cr1@")) {
                    s = s.substring(5);
                    byte0 = 1;
                }
                if (s != null && s.startsWith("@cr2@")) {
                    s = s.substring(5);
                    byte0 = 2;
                }
                if ((l == 3 || l == 7) && (l == 7 || anInt972 == 0 || anInt972 == 1 && method22(-238, s))) {
                    int i1 = 329 - j * 13;
                    int l1 = 4;
                    class44_sub3_sub1_sub4.method458(l1, "From", 0, i1, true);
                    class44_sub3_sub1_sub4.method458(l1, "From", 65535, i1 - 1, true);
                    l1 += class44_sub3_sub1_sub4.method457(-43341, "From ");
                    if (byte0 == 1) {
                        aClass44_Sub3_Sub1_Sub3Array914[0].method453(aByte1070, l1, i1 - 12);
                        l1 += 14;
                    }
                    if (byte0 == 2) {
                        aClass44_Sub3_Sub1_Sub3Array914[1].method453(aByte1070, l1, i1 - 12);
                        l1 += 14;
                    }
                    class44_sub3_sub1_sub4.method458(l1, s + ": " + aStringArray950[k], 0, i1, true);
                    class44_sub3_sub1_sub4.method458(l1, s + ": " + aStringArray950[k], 65535, i1 - 1, true);
                    if (++j >= 5)
                        return;
                }
                if (l == 5 && anInt972 < 2) {
                    int j1 = 329 - j * 13;
                    class44_sub3_sub1_sub4.method458(4, aStringArray950[k], 0, j1, true);
                    class44_sub3_sub1_sub4.method458(4, aStringArray950[k], 65535, j1 - 1, true);
                    if (++j >= 5)
                        return;
                }
                if (l == 6 && anInt972 < 2) {
                    int k1 = 329 - j * 13;
                    class44_sub3_sub1_sub4.method458(4, "To " + s + ": " + aStringArray950[k], 0, k1, true);
                    class44_sub3_sub1_sub4.method458(4, "To " + s + ": " + aStringArray950[k], 65535, k1 - 1, true);
                    if (++j >= 5)
                        return;
                }
            }

    }

    public void method75(Class44_Sub3_Sub2 class44_sub3_sub2, int i, int j) {
        for (int k = 0; k < anInt1123; k++) {
            int l = anIntArray1124[k];
            Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1120[l];
            int i1 = class44_sub3_sub2.get1();
            if ((i1 & 0x80) == 128)
                i1 += class44_sub3_sub2.get1() << 8;
            method101(i1, l, (byte) 3, class44_sub3_sub4_sub6_sub1, class44_sub3_sub2);
        }

        if (i != -45473)
            anInt1224 = aClass46_944.method542();
    }

    public void method76(boolean flag, byte[] abyte0, int i) {
        signlink.midifade = flag ? 1 : 0;
        signlink.midisave(abyte0, abyte0.length);
        if (i == 7) ;
    }

    public void method78(int i) {
        if (i != 33993)
            anInt1220 = aClass44_Sub3_Sub2_1135.get1();
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    public void method79(int i, boolean flag) {
        if (flag)
            anInt1235 = aClass46_944.method542();
        int[] ai = aClass44_Sub3_Sub1_Sub2_1027.anIntArray1431;
        int j = ai.length;
        for (int k = 0; k < j; k++)
            ai[k] = 0;

        for (int l = 1; l < 103; l++) {
            int i1 = 24628 + (103 - l) * 512 * 4;
            for (int k1 = 1; k1 < 103; k1++) {
                if ((aByteArrayArrayArray827[i][k1][l] & 0x18) == 0)
                    aClass36_915.method313(ai, i1, 512, i, k1, l);
                if (i < 3 && (aByteArrayArrayArray827[i + 1][k1][l] & 8) != 0)
                    aClass36_915.method313(ai, i1, 512, i + 1, k1, l);
                i1 += 4;
            }

        }

        int j1 = ((238 + (int) (Math.random() * 20D)) - 10 << 16) + ((238 + (int) (Math.random() * 20D)) - 10 << 8) + ((238 + (int) (Math.random() * 20D)) - 10);
        int l1 = (238 + (int) (Math.random() * 20D)) - 10 << 16;
        aClass44_Sub3_Sub1_Sub2_1027.method435(aBoolean960);
        for (int i2 = 1; i2 < 103; i2++) {
            for (int j2 = 1; j2 < 103; j2++) {
                if ((aByteArrayArrayArray827[i][j2][i2] & 0x18) == 0)
                    method41(j2, j1, i2, l1, i, 15485);
                if (i < 3 && (aByteArrayArrayArray827[i + 1][j2][i2] & 8) != 0)
                    method41(j2, j1, i2, l1, i + 1, 15485);
            }

        }

        aClass34_864.method272(aBoolean960);
        anInt987 = 0;
        for (int k2 = 0; k2 < 104; k2++) {
            for (int l2 = 0; l2 < 104; l2++) {
                int i3 = aClass36_915.method307(anInt1062, k2, l2);
                if (i3 != 0) {
                    i3 = i3 >> 14 & 0x7fff;
                    int j3 = Class8.method199(i3).anInt238;
                    if (j3 >= 0) {
                        int k3 = k2;
                        int l3 = l2;
                        if (j3 != 22 && j3 != 29 && j3 != 34 && j3 != 36 && j3 != 46 && j3 != 47 && j3 != 48) {
                            byte byte0 = 104;
                            byte byte1 = 104;
                            int[][] ai1 = aClass18Array1105[anInt1062].anIntArrayArray411;
                            for (int i4 = 0; i4 < 10; i4++) {
                                int j4 = (int) (Math.random() * 4D);
                                if (j4 == 0 && k3 > 0 && k3 > k2 - 3 && (ai1[k3 - 1][l3] & 0x280108) == 0)
                                    k3--;
                                if (j4 == 1 && k3 < byte0 - 1 && k3 < k2 + 3 && (ai1[k3 + 1][l3] & 0x280180) == 0)
                                    k3++;
                                if (j4 == 2 && l3 > 0 && l3 > l2 - 3 && (ai1[k3][l3 - 1] & 0x280102) == 0)
                                    l3--;
                                if (j4 == 3 && l3 < byte1 - 1 && l3 < l2 + 3 && (ai1[k3][l3 + 1] & 0x280120) == 0)
                                    l3++;
                            }

                        }
                        aClass44_Sub3_Sub1_Sub2Array1204[anInt987] = aClass44_Sub3_Sub1_Sub2Array943[j3];
                        anIntArray988[anInt987] = k3;
                        anIntArray989[anInt987] = l3;
                        anInt987++;
                    }
                }
            }

        }

        anInt996++;
        if (anInt996 > 112) {
            anInt996 = 0;
            aClass44_Sub3_Sub2_843.putOpcode(52);
            aClass44_Sub3_Sub2_843.put1(50);
        }
    }

    public void method80(boolean flag) {
        try {
            if (aClass7_1108 != null)
                aClass7_1108.method191();
        } catch (Exception ignored) {
        }
        aClass7_1108 = null;
        if (flag)
            return;
        aBoolean905 = false;
        anInt1005 = 0;
        aString1147 = "";
        aString1148 = "";
        method125(-501);
        aClass36_915.method278((byte) 52);
        for (int i = 0; i < 4; i++)
            aClass18Array1105[i].method231((byte) 5);

        System.gc();
        method78(33993);
        anInt1030 = -1;
        anInt1183 = -1;
        anInt927 = 0;
    }

    public void method81(int i, Class44_Sub1 class44_sub1) {
        int j = 0;
        int k = -1;
        int l = 0;
        int i1 = 0;
        if (class44_sub1.anInt1311 == 0)
            j = aClass36_915.method304(class44_sub1.anInt1310, class44_sub1.anInt1312, class44_sub1.anInt1313);
        if (class44_sub1.anInt1311 == 1)
            j = aClass36_915.method305(class44_sub1.anInt1313, class44_sub1.anInt1312, class44_sub1.anInt1310, anInt1003);
        if (class44_sub1.anInt1311 == 2)
            j = aClass36_915.method306(class44_sub1.anInt1310, class44_sub1.anInt1312, class44_sub1.anInt1313);
        if (class44_sub1.anInt1311 == 3)
            j = aClass36_915.method307(class44_sub1.anInt1310, class44_sub1.anInt1312, class44_sub1.anInt1313);
        if (j != 0) {
            int j1 = aClass36_915.method308(class44_sub1.anInt1310, class44_sub1.anInt1312, class44_sub1.anInt1313, j);
            k = j >> 14 & 0x7fff;
            l = j1 & 0x1f;
            i1 = j1 >> 6;
        }
        class44_sub1.anInt1314 = k;
        class44_sub1.anInt1316 = l;
        if (i >= 0)
            anInt1220 = -1;
        class44_sub1.anInt1315 = i1;
    }

    public void method12(Runnable runnable, int i) {
        if (i > 10)
            i = 10;
        if (signlink.mainapp != null) {
            signlink.startthread(runnable, i);
        } else {
            super.method12(runnable, i);
        }
    }

    public void method82(int i, int j, int k, int l, int i1, int j1, int k1,
                         int l1, int i2, int j2) {
        Class44_Sub1 class44_sub1 = null;
        if (j != 4823)
            aBoolean1152 = !aBoolean1152;
        for (Class44_Sub1 class44_sub1_1 = (Class44_Sub1) aClass28_1228.method259(); class44_sub1_1 != null; class44_sub1_1 = (Class44_Sub1) aClass28_1228.method261(aByte958)) {
            if (class44_sub1_1.anInt1310 != i1 || class44_sub1_1.anInt1312 != k1 || class44_sub1_1.anInt1313 != i || class44_sub1_1.anInt1311 != l1)
                continue;
            class44_sub1 = class44_sub1_1;
            break;
        }

        if (class44_sub1 == null) {
            class44_sub1 = new Class44_Sub1();
            class44_sub1.anInt1310 = i1;
            class44_sub1.anInt1311 = l1;
            class44_sub1.anInt1312 = k1;
            class44_sub1.anInt1313 = i;
            method81(-452, class44_sub1);
            aClass28_1228.method256(class44_sub1);
        }
        class44_sub1.anInt1317 = l;
        class44_sub1.anInt1319 = i2;
        class44_sub1.anInt1318 = j1;
        class44_sub1.anInt1320 = j2;
        class44_sub1.anInt1321 = k;
    }

    public void method83(boolean flag) {
        if (anInt1074 == 0)
            return;
        int i = 0;
        if (anInt803 != 0)
            i = 1;
        for (int j = 0; j < 100; j++)
            if (aStringArray950[j] != null) {
                int k = anIntArray948[j];
                String s = aStringArray949[j];
                boolean flag1 = false;
                if (s != null && s.startsWith("@cr1@")) {
                    s = s.substring(5);
                    boolean flag2 = true;
                }
                if (s != null && s.startsWith("@cr2@")) {
                    s = s.substring(5);
                    byte byte0 = 2;
                }
                if ((k == 3 || k == 7) && (k == 7 || anInt972 == 0 || anInt972 == 1 && method22(-238, s))) {
                    int i1 = 329 - i * 13;
                    if (super.anInt22 > 4 && super.anInt23 - 4 > i1 - 10 && super.anInt23 - 4 <= i1 + 3) {
                        int j1 = aClass44_Sub3_Sub1_Sub4_1076.method457(-43341, "From:  " + s + aStringArray950[j]) + 25;
                        if (j1 > 450)
                            j1 = 450;
                        if (super.anInt22 < 4 + j1) {
                            if (anInt866 >= 1) {
                                aStringArray1114[anInt980] = "Report abuse @whi@" + s;
                                anIntArray1193[anInt980] = 2524;
                                anInt980++;
                            }
                            aStringArray1114[anInt980] = "Add ignore @whi@" + s;
                            anIntArray1193[anInt980] = 2047;
                            anInt980++;
                            aStringArray1114[anInt980] = "Add friend @whi@" + s;
                            anIntArray1193[anInt980] = 2605;
                            anInt980++;
                        }
                    }
                    if (++i >= 5)
                        return;
                }
                if ((k == 5 || k == 6) && anInt972 < 2 && ++i >= 5)
                    return;
            }

        if (flag) {
            for (int l = 1; l > 0; l++) ;
        }
    }

    public DataInputStream method84(String s)
            throws IOException {
        if (!aBoolean1053)
            if (signlink.mainapp != null)
                return signlink.openurl(s);
            else
                return new DataInputStream((new URL(getCodeBase(), s)).openStream());
        if (aSocket1004 != null) {
            try {
                aSocket1004.close();
            } catch (Exception ignored) {
            }
            aSocket1004 = null;
        }
        aSocket1004 = method72(43595);
        aSocket1004.setSoTimeout(10000);
        java.io.InputStream inputstream = aSocket1004.getInputStream();
        OutputStream outputstream = aSocket1004.getOutputStream();
        outputstream.write(("JAGGRAB /" + s + "\n\n").getBytes());
        return new DataInputStream(inputstream);
    }

    public void method85(int i) {
        aBoolean976 = true;
        if (i >= 0)
            aClass28ArrayArrayArray816 = null;
        try {
            long l = System.currentTimeMillis();
            int j = 0;
            int k = 20;
            while (aBoolean906) {
                anInt966++;
                method86((byte) 9);
                method86((byte) 9);
                method128(35604);
                if (++j > 10) {
                    long l1 = System.currentTimeMillis();
                    int i1 = (int) (l1 - l) / 10 - k;
                    k = 40 - i1;
                    if (k < 5)
                        k = 5;
                    j = 0;
                    l = l1;
                }
                try {
                    Thread.sleep(k);
                } catch (Exception ignored) {
                }
            }
        } catch (Exception ignored) {
        }
        aBoolean976 = false;
    }

    public void method86(byte byte0) {
        if (byte0 != aByte1014) {
            for (int i = 1; i > 0; i++) ;
        }
        char c = '\u0100';
        for (int j = 10; j < 117; j++) {
            int k = (int) (Math.random() * 100D);
            if (k < 50)
                anIntArray977[j + (c - 2 << 7)] = 255;
        }

        for (int l = 0; l < 100; l++) {
            int i1 = (int) (Math.random() * 124D) + 2;
            int k1 = (int) (Math.random() * 128D) + 128;
            int k2 = i1 + (k1 << 7);
            anIntArray977[k2] = 192;
        }

        for (int j1 = 1; j1 < c - 1; j1++) {
            for (int l1 = 1; l1 < 127; l1++) {
                int l2 = l1 + (j1 << 7);
                anIntArray978[l2] = (anIntArray977[l2 - 1] + anIntArray977[l2 + 1] + anIntArray977[l2 - 128] + anIntArray977[l2 + 128]) / 4;
            }

        }

        anInt1063 += 128;
        if (anInt1063 > anIntArray1111.length) {
            anInt1063 -= anIntArray1111.length;
            int i2 = (int) (Math.random() * 12D);
            method100(512, aClass44_Sub3_Sub1_Sub3Array1229[i2]);
        }
        for (int j2 = 1; j2 < c - 1; j2++) {
            for (int i3 = 1; i3 < 127; i3++) {
                int k3 = i3 + (j2 << 7);
                int i4 = anIntArray978[k3 + 128] - anIntArray1111[k3 + anInt1063 & anIntArray1111.length - 1] / 5;
                if (i4 < 0)
                    i4 = 0;
                anIntArray977[k3] = i4;
            }

        }

        System.arraycopy(anIntArray903, 1, anIntArray903, 0, c - 1);

        anIntArray903[c - 1] = (int) (Math.sin((double) anInt802 / 14D) * 16D + Math.sin((double) anInt802 / 15D) * 14D + Math.sin((double) anInt802 / 16D) * 12D);
        if (anInt994 > 0)
            anInt994 -= 4;
        if (anInt995 > 0)
            anInt995 -= 4;
        if (anInt994 == 0 && anInt995 == 0) {
            int l3 = (int) (Math.random() * 2000D);
            if (l3 == 0)
                anInt994 = 1024;
            if (l3 == 1)
                anInt995 = 1024;
        }
    }

    public AppletContext getAppletContext() {
        if (signlink.mainapp != null)
            return signlink.mainapp.getAppletContext();
        else
            return super.getAppletContext();
    }

    public void method87(int i) {
        if (i != 3)
            anInt901 = -139;
        if (anInt1005 == 0) {
            int j = super.anInt12 / 2 - 80;
            int i1 = super.anInt13 / 2 + 20;
            i1 += 20;
            if (super.anInt28 == 1 && super.anInt29 >= j - 75 && super.anInt29 <= j + 75 && super.anInt30 >= i1 - 20 && super.anInt30 <= i1 + 20) {
                anInt1005 = 3;
                anInt955 = 0;
            }
            j = super.anInt12 / 2 + 80;
            if (super.anInt28 == 1 && super.anInt29 >= j - 75 && super.anInt29 <= j + 75 && super.anInt30 >= i1 - 20 && super.anInt30 <= i1 + 20) {
                aString932 = "";
                aString933 = "Enter your username & password.";
                anInt1005 = 2;
                anInt955 = 0;
            }
        } else {
            if (anInt1005 == 2) {
                int k = super.anInt13 / 2 - 40;
                k += 30;
                k += 25;
                if (super.anInt28 == 1 && super.anInt30 >= k - 15 && super.anInt30 < k)
                    anInt955 = 0;
                k += 15;
                if (super.anInt28 == 1 && super.anInt30 >= k - 15 && super.anInt30 < k)
                    anInt955 = 1;
                k += 15;
                int j1 = super.anInt12 / 2 - 80;
                int l1 = super.anInt13 / 2 + 50;
                l1 += 20;
                if (super.anInt28 == 1 && super.anInt29 >= j1 - 75 && super.anInt29 <= j1 + 75 && super.anInt30 >= l1 - 20 && super.anInt30 <= l1 + 20) {
                    method48(aString1147, aString1148, false);
                    if (aBoolean905)
                        return;
                }
                j1 = super.anInt12 / 2 + 80;
                if (super.anInt28 == 1 && super.anInt29 >= j1 - 75 && super.anInt29 <= j1 + 75 && super.anInt30 >= l1 - 20 && super.anInt30 <= l1 + 20) {
                    anInt1005 = 0;
                    aString1147 = "";
                    aString1148 = "";
                }
                do {
                    int i2 = method5((byte) 5);
                    if (i2 == -1)
                        break;
                    boolean flag = false;
                    for (int j2 = 0; j2 < aString807.length(); j2++) {
                        if (i2 != aString807.charAt(j2))
                            continue;
                        flag = true;
                        break;
                    }

                    if (anInt955 == 0) {
                        if (i2 == 8 && aString1147.length() > 0)
                            aString1147 = aString1147.substring(0, aString1147.length() - 1);
                        if (i2 == 9 || i2 == 10 || i2 == 13)
                            anInt955 = 1;
                        if (flag)
                            aString1147 += (char) i2;
                        if (aString1147.length() > 12)
                            aString1147 = aString1147.substring(0, 12);
                    } else if (anInt955 == 1) {
                        if (i2 == 8 && aString1148.length() > 0)
                            aString1148 = aString1148.substring(0, aString1148.length() - 1);
                        if (i2 == 9 || i2 == 10 || i2 == 13)
                            anInt955 = 0;
                        if (flag)
                            aString1148 += (char) i2;
                        if (aString1148.length() > 20)
                            aString1148 = aString1148.substring(0, 20);
                    }
                } while (true);
                return;
            }
            if (anInt1005 == 3) {
                int l = super.anInt12 / 2;
                int k1 = super.anInt13 / 2 + 50;
                k1 += 20;
                if (super.anInt28 == 1 && super.anInt29 >= l - 75 && super.anInt29 <= l + 75 && super.anInt30 >= k1 - 20 && super.anInt30 <= k1 + 20)
                    anInt1005 = 0;
            }
        }
    }

    public void method88(int i, int j, int k, Class44_Sub3_Sub1_Sub2 class44_sub3_sub1_sub2) {
        if (k != 4) {
            for (int l = 1; l > 0; l++) ;
        }
        int i1 = i * i + j * j;
        if (i1 > 4225 && i1 < 0x15f90) {
            int j1 = anInt1206 + anInt1217 & 0x7ff;
            int k1 = Class44_Sub3_Sub4_Sub4.anIntArray1585[j1];
            int l1 = Class44_Sub3_Sub4_Sub4.anIntArray1586[j1];
            k1 = (k1 * 256) / (anInt1170 + 256);
            l1 = (l1 * 256) / (anInt1170 + 256);
            int i2 = j * k1 + i * l1 >> 16;
            int j2 = j * l1 - i * k1 >> 16;
            double d = Math.atan2(i2, j2);
            int k2 = (int) (Math.sin(d) * 63D);
            int l2 = (int) (Math.cos(d) * 57D);
            aClass44_Sub3_Sub1_Sub2_1126.method445(15, 20, (94 + k2 + 4) - 10, 83 - l2 - 20, d, 256, (byte) -32, 15, 20);
        } else {
            method33(j, i, (byte) -111, class44_sub3_sub1_sub2);
        }
    }

    public void method89(byte byte0) {
        if (byte0 == 4) {
            byte0 = 0;
        } else {
            for (int i = 1; i > 0; i++) ;
        }
        for (Class44_Sub1 class44_sub1 = (Class44_Sub1) aClass28_1228.method259(); class44_sub1 != null; class44_sub1 = (Class44_Sub1) aClass28_1228.method261(aByte958))
            if (class44_sub1.anInt1321 == -1) {
                class44_sub1.anInt1320 = 0;
                method81(-452, class44_sub1);
            } else {
                class44_sub1.method404();
            }

    }

    public String getParameter(String s) {
        if (signlink.mainapp != null)
            return signlink.mainapp.getParameter(s);
        else
            return super.getParameter(s);
    }

    public void method90(int i, boolean flag, int j) {
        int k = 0;
        for (int l = 0; l < 100; l++) {
            if (aStringArray950[l] == null)
                continue;
            int i1 = anIntArray948[l];
            int j1 = (70 - k * 14) + anInt1082 + 4;
            if (j1 < -20)
                break;
            String s = aStringArray949[l];
            boolean flag1 = false;
            if (s != null && s.startsWith("@cr1@")) {
                s = s.substring(5);
                boolean flag2 = true;
            }
            if (s != null && s.startsWith("@cr2@")) {
                s = s.substring(5);
                byte byte0 = 2;
            }
            if (i1 == 0)
                k++;
            if ((i1 == 1 || i1 == 2) && (i1 == 1 || anInt967 == 0 || anInt967 == 1 && method22(-238, s))) {
                if (j > j1 - 14 && j <= j1 && !s.equals(aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1657)) {
                    if (anInt866 >= 1) {
                        aStringArray1114[anInt980] = "Report abuse @whi@" + s;
                        anIntArray1193[anInt980] = 524;
                        anInt980++;
                    }
                    aStringArray1114[anInt980] = "Add ignore @whi@" + s;
                    anIntArray1193[anInt980] = 47;
                    anInt980++;
                    aStringArray1114[anInt980] = "Add friend @whi@" + s;
                    anIntArray1193[anInt980] = 605;
                    anInt980++;
                }
                k++;
            }
            if ((i1 == 3 || i1 == 7) && anInt1074 == 0 && (i1 == 7 || anInt972 == 0 || anInt972 == 1 && method22(-238, s))) {
                if (j > j1 - 14 && j <= j1) {
                    if (anInt866 >= 1) {
                        aStringArray1114[anInt980] = "Report abuse @whi@" + s;
                        anIntArray1193[anInt980] = 524;
                        anInt980++;
                    }
                    aStringArray1114[anInt980] = "Add ignore @whi@" + s;
                    anIntArray1193[anInt980] = 47;
                    anInt980++;
                    aStringArray1114[anInt980] = "Add friend @whi@" + s;
                    anIntArray1193[anInt980] = 605;
                    anInt980++;
                }
                k++;
            }
            if (i1 == 4 && (anInt805 == 0 || anInt805 == 1 && method22(-238, s))) {
                if (j > j1 - 14 && j <= j1) {
                    aStringArray1114[anInt980] = "Accept trade @whi@" + s;
                    anIntArray1193[anInt980] = 507;
                    anInt980++;
                }
                k++;
            }
            if ((i1 == 5 || i1 == 6) && anInt1074 == 0 && anInt972 < 2)
                k++;
            if (i1 == 8 && (anInt805 == 0 || anInt805 == 1 && method22(-238, s))) {
                if (j > j1 - 14 && j <= j1) {
                    aStringArray1114[anInt980] = "Accept duel @whi@" + s;
                    anIntArray1193[anInt980] = 957;
                    anInt980++;
                }
                k++;
            }
        }

        if (!flag)
            aClass28ArrayArrayArray816 = null;
    }

    public void method91(int i) {
        aClass44_Sub3_Sub1_Sub3_1263 = new Class44_Sub3_Sub1_Sub3(aClass47_942, "titlebox", 0);
        aClass44_Sub3_Sub1_Sub3_1264 = new Class44_Sub3_Sub1_Sub3(aClass47_942, "titlebutton", 0);
        aClass44_Sub3_Sub1_Sub3Array1229 = new Class44_Sub3_Sub1_Sub3[12];
        int j = 0;
        try {
            j = Integer.parseInt(getParameter("fl_icon"));
        } catch (Exception ignored) {
        }
        if (j == 0) {
            for (int k = 0; k < 12; k++)
                aClass44_Sub3_Sub1_Sub3Array1229[k] = new Class44_Sub3_Sub1_Sub3(aClass47_942, "runes", k);

        } else {
            for (int l = 0; l < 12; l++)
                aClass44_Sub3_Sub1_Sub3Array1229[l] = new Class44_Sub3_Sub1_Sub3(aClass47_942, "runes", 12 + (l & 3));

        }
        aClass44_Sub3_Sub1_Sub2_891 = new Class44_Sub3_Sub1_Sub2(128, 265);
        if (i != 4)
            anInt1220 = aClass44_Sub3_Sub2_1135.get1();
        aClass44_Sub3_Sub1_Sub2_892 = new Class44_Sub3_Sub1_Sub2(128, 265);
        System.arraycopy(aClass34_1042.anIntArray571, 0, aClass44_Sub3_Sub1_Sub2_891.anIntArray1431, 0, 33920);

        System.arraycopy(aClass34_1043.anIntArray571, 0, aClass44_Sub3_Sub1_Sub2_892.anIntArray1431, 0, 33920);

        anIntArray937 = new int[256];
        for (int k1 = 0; k1 < 64; k1++)
            anIntArray937[k1] = k1 * 0x40000;

        for (int l1 = 0; l1 < 64; l1++)
            anIntArray937[l1 + 64] = 0xff0000 + 1024 * l1;

        for (int i2 = 0; i2 < 64; i2++)
            anIntArray937[i2 + 128] = 0xffff00 + 4 * i2;

        for (int j2 = 0; j2 < 64; j2++)
            anIntArray937[j2 + 192] = 0xffffff;

        anIntArray938 = new int[256];
        for (int k2 = 0; k2 < 64; k2++)
            anIntArray938[k2] = k2 * 1024;

        for (int l2 = 0; l2 < 64; l2++)
            anIntArray938[l2 + 64] = 65280 + 4 * l2;

        for (int i3 = 0; i3 < 64; i3++)
            anIntArray938[i3 + 128] = 65535 + 0x40000 * i3;

        for (int j3 = 0; j3 < 64; j3++)
            anIntArray938[j3 + 192] = 0xffffff;

        anIntArray939 = new int[256];
        for (int k3 = 0; k3 < 64; k3++)
            anIntArray939[k3] = k3 * 4;

        for (int l3 = 0; l3 < 64; l3++)
            anIntArray939[l3 + 64] = 255 + 0x40000 * l3;

        for (int i4 = 0; i4 < 64; i4++)
            anIntArray939[i4 + 128] = 0xff00ff + 1024 * i4;

        for (int j4 = 0; j4 < 64; j4++)
            anIntArray939[j4 + 192] = 0xffffff;

        anIntArray936 = new int[256];
        anIntArray1111 = new int[32768];
        anIntArray1112 = new int[32768];
        method100(512, null);
        anIntArray977 = new int[32768];
        anIntArray978 = new int[32768];
        method13("Connecting to fileserver", 10, 7);
        if (!aBoolean906) {
            aBoolean1175 = true;
            aBoolean906 = true;
            method12(this, 2);
        }
    }

    public void method92(int i) {
        if (aClass34_865 != null) {
        } else {
            method114(0);
            super.aClass34_15 = null;
            aClass34_1039 = null;
            aClass34_1040 = null;
            aClass34_1041 = null;
            aClass34_1042 = null;
            aClass34_1043 = null;
            i = 12 / i;
            aClass34_1044 = null;
            aClass34_1045 = null;
            aClass34_1046 = null;
            aClass34_1047 = null;
            aClass34_865 = new Class34(96, anInt940, 479, method11(aByte1102));
            aClass34_863 = new Class34(156, anInt940, 172, method11(aByte1102));
            Class44_Sub3_Sub1.method409(8);
            aClass44_Sub3_Sub1_Sub3_1202.method453(aByte1070, 0, 0);
            aClass34_862 = new Class34(261, anInt940, 190, method11(aByte1102));
            aClass34_864 = new Class34(334, anInt940, 512, method11(aByte1102));
            Class44_Sub3_Sub1.method409(8);
            aClass34_990 = new Class34(50, anInt940, 496, method11(aByte1102));
            aClass34_991 = new Class34(37, anInt940, 269, method11(aByte1102));
            aClass34_992 = new Class34(45, anInt940, 249, method11(aByte1102));
            aBoolean917 = true;
        }
    }

    public String method93(int i) {
        i = 90 / i;
        if (signlink.mainapp != null)
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        if (super.aFrame_Sub1_17 != null)
            return "runescape.com";
        else
            return super.getDocumentBase().getHost().toLowerCase();
    }

    public void method94(int i, Class44_Sub3_Sub2 class44_sub3_sub2, int j) {
        int k = class44_sub3_sub2.getBit(8, (byte) -96);
        j += i;
        if (k < anInt1121) {
            for (int l = k; l < anInt1121; l++)
                anIntArray1065[anInt1064++] = anIntArray1122[l];

        }
        if (k > anInt1121) {
            signlink.reporterror(aString1147 + " Too many players");
            throw new RuntimeException("eek");
        }
        anInt1121 = 0;
        for (int i1 = 0; i1 < k; i1++) {
            int j1 = anIntArray1122[i1];
            Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1120[j1];
            int k1 = class44_sub3_sub2.getBit(1, (byte) -96);
            if (k1 == 0) {
                anIntArray1122[anInt1121++] = j1;
                class44_sub3_sub4_sub6_sub1.anInt1644 = anInt802;
            } else {
                int l1 = class44_sub3_sub2.getBit(2, (byte) -96);
                if (l1 == 0) {
                    anIntArray1122[anInt1121++] = j1;
                    class44_sub3_sub4_sub6_sub1.anInt1644 = anInt802;
                    anIntArray1124[anInt1123++] = j1;
                } else if (l1 == 1) {
                    anIntArray1122[anInt1121++] = j1;
                    class44_sub3_sub4_sub6_sub1.anInt1644 = anInt802;
                    int i2 = class44_sub3_sub2.getBit(3, (byte) -96);
                    class44_sub3_sub4_sub6_sub1.method530(true, i2, false);
                    int k2 = class44_sub3_sub2.getBit(1, (byte) -96);
                    if (k2 == 1)
                        anIntArray1124[anInt1123++] = j1;
                } else if (l1 == 2) {
                    anIntArray1122[anInt1121++] = j1;
                    class44_sub3_sub4_sub6_sub1.anInt1644 = anInt802;
                    int j2 = class44_sub3_sub2.getBit(3, (byte) -96);
                    class44_sub3_sub4_sub6_sub1.method530(true, j2, true);
                    int l2 = class44_sub3_sub2.getBit(3, (byte) -96);
                    class44_sub3_sub4_sub6_sub1.method530(true, l2, true);
                    int i3 = class44_sub3_sub2.getBit(1, (byte) -96);
                    if (i3 == 1)
                        anIntArray1124[anInt1123++] = j1;
                } else if (l1 == 3)
                    anIntArray1065[anInt1064++] = j1;
            }
        }

    }

    public void method95(int i) {
        int j = aClass44_Sub3_Sub1_Sub4_1077.method457(-43341, "Choose Option");
        for (int k = 0; k < anInt980; k++) {
            int l = aClass44_Sub3_Sub1_Sub4_1077.method457(-43341, aStringArray1114[k]);
            if (l > j)
                j = l;
        }

        j += 8;
        anInt1219 += i;
        int i1 = 15 * anInt980 + 21;
        if (super.anInt29 > 4 && super.anInt30 > 4 && super.anInt29 < 516 && super.anInt30 < 338) {
            int j1 = super.anInt29 - 4 - j / 2;
            if (j1 + j > 512)
                j1 = 512 - j;
            if (j1 < 0)
                j1 = 0;
            int i2 = super.anInt30 - 4;
            if (i2 + i1 > 334)
                i2 = 334 - i1;
            if (i2 < 0)
                i2 = 0;
            aBoolean851 = true;
            anInt1254 = 0;
            anInt1255 = j1;
            anInt1256 = i2;
            anInt1257 = j;
            anInt1258 = 15 * anInt980 + 22;
        }
        if (super.anInt29 > 553 && super.anInt30 > 205 && super.anInt29 < 743 && super.anInt30 < 466) {
            int k1 = super.anInt29 - 553 - j / 2;
            if (k1 < 0)
                k1 = 0;
            else if (k1 + j > 190)
                k1 = 190 - j;
            int j2 = super.anInt30 - 205;
            if (j2 < 0)
                j2 = 0;
            else if (j2 + i1 > 261)
                j2 = 261 - i1;
            aBoolean851 = true;
            anInt1254 = 1;
            anInt1255 = k1;
            anInt1256 = j2;
            anInt1257 = j;
            anInt1258 = 15 * anInt980 + 22;
        }
        if (super.anInt29 > 17 && super.anInt30 > 357 && super.anInt29 < 496 && super.anInt30 < 453) {
            int l1 = super.anInt29 - 17 - j / 2;
            if (l1 < 0)
                l1 = 0;
            else if (l1 + j > 479)
                l1 = 479 - j;
            int k2 = super.anInt30 - 357;
            if (k2 < 0)
                k2 = 0;
            else if (k2 + i1 > 96)
                k2 = 96 - i1;
            aBoolean851 = true;
            anInt1254 = 2;
            anInt1255 = l1;
            anInt1256 = k2;
            anInt1257 = j;
            anInt1258 = 15 * anInt980 + 22;
        }
    }

    public void method96(long l, boolean flag) {
        try {
            if (l == 0L)
                return;
            if (anInt961 >= 100) {
                method49(-476, 0, "", "Your ignore list is full. Max of 100 hit");
                return;
            }
            String s = Class48.method551(131, Class48.method548(0, l));
            if (flag)
                aBoolean1226 = !aBoolean1226;
            for (int i = 0; i < anInt961; i++)
                if (aLongArray817[i] == l) {
                    method49(-476, 0, "", s + " is already on your ignore list");
                    return;
                }

            for (int j = 0; j < anInt1115; j++)
                if (aLongArray1159[j] == l) {
                    method49(-476, 0, "", "Please remove " + s + " from your friend list first");
                    return;
                }

            aLongArray817[anInt961++] = l;
            aBoolean928 = true;
            aClass44_Sub3_Sub2_843.putOpcode(255);
            aClass44_Sub3_Sub2_843.put8(l, 0);
            return;
        } catch (RuntimeException runtimeexception) {
            signlink.reporterror("75400, " + l + ", " + flag + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void init() {
        anInt1237 = Integer.parseInt(getParameter("nodeid"));
        anInt1238 = Integer.parseInt(getParameter("portoff"));
        String s = getParameter("lowmem");
        if (s != null && s.equals("1"))
            method54(true);
        else
            method73(10969);
        String s1 = getParameter("free");
        aBoolean1239 = s1 == null || !s1.equals("1");
        method2(503, 765, (byte) 23);
    }

    public void method98(boolean flag) {
        aClass34_862.method272(aBoolean960);
        Class44_Sub3_Sub1_Sub1.anIntArray1409 = anIntArray1244;
        aClass44_Sub3_Sub1_Sub3_1201.method453(aByte1070, 0, 0);
        if (anInt1216 != -1)
            method127(0, Class5.aClass5Array103[anInt1216], 0, 0, (byte) 0);
        else if (anIntArray954[anInt1013] != -1)
            method127(0, Class5.aClass5Array103[anIntArray954[anInt1013]], 0, 0, (byte) 0);
        if (aBoolean851 && anInt1254 == 1)
            method15(-593);
        aClass34_862.method273(553, super.aGraphics14, (byte) 76, 205);
        if (!flag) {
            for (int i = 1; i > 0; i++) ;
        }
        aClass34_864.method272(aBoolean960);
        Class44_Sub3_Sub1_Sub1.anIntArray1409 = anIntArray1245;
    }

    public void method99(int i, byte byte0, Class44_Sub3_Sub2 class44_sub3_sub2) {
        for (int j = 0; j < anInt1123; j++) {
            int k = anIntArray1124[j];
            Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1259[k];
            int l = class44_sub3_sub2.get1();
            if ((l & 1) == 1) {
                int i1 = class44_sub3_sub2.get1();
                int i2 = class44_sub3_sub2.get1();
                class44_sub3_sub4_sub6_sub2.method533(anInt802, (byte) 8, i1, i2);
                class44_sub3_sub4_sub6_sub2.anInt1618 = anInt802 + 300;
                class44_sub3_sub4_sub6_sub2.anInt1619 = class44_sub3_sub2.get1();
                class44_sub3_sub4_sub6_sub2.anInt1620 = class44_sub3_sub2.get1();
            }
            if ((l & 2) == 2) {
                int j1 = class44_sub3_sub2.get2();
                if (j1 == 65535)
                    j1 = -1;
                if (j1 == class44_sub3_sub4_sub6_sub2.anInt1627)
                    class44_sub3_sub4_sub6_sub2.anInt1631 = 0;
                int j2 = class44_sub3_sub2.get1();
                if (j1 == class44_sub3_sub4_sub6_sub2.anInt1627 && j1 != -1) {
                    int l2 = Class26.aClass26Array497[j1].anInt511;
                    if (l2 == 1) {
                        class44_sub3_sub4_sub6_sub2.anInt1628 = 0;
                        class44_sub3_sub4_sub6_sub2.anInt1629 = 0;
                        class44_sub3_sub4_sub6_sub2.anInt1630 = j2;
                        class44_sub3_sub4_sub6_sub2.anInt1631 = 0;
                    }
                    if (l2 == 2)
                        class44_sub3_sub4_sub6_sub2.anInt1631 = 0;
                } else if (j1 == -1 || class44_sub3_sub4_sub6_sub2.anInt1627 == -1 || Class26.aClass26Array497[j1].anInt505 >= Class26.aClass26Array497[class44_sub3_sub4_sub6_sub2.anInt1627].anInt505) {
                    class44_sub3_sub4_sub6_sub2.anInt1627 = j1;
                    class44_sub3_sub4_sub6_sub2.anInt1628 = 0;
                    class44_sub3_sub4_sub6_sub2.anInt1629 = 0;
                    class44_sub3_sub4_sub6_sub2.anInt1630 = j2;
                    class44_sub3_sub4_sub6_sub2.anInt1631 = 0;
                    class44_sub3_sub4_sub6_sub2.anInt1653 = class44_sub3_sub4_sub6_sub2.anInt1648;
                }
            }
            if ((l & 4) == 4) {
                class44_sub3_sub4_sub6_sub2.anInt1621 = class44_sub3_sub2.get2();
                if (class44_sub3_sub4_sub6_sub2.anInt1621 == 65535)
                    class44_sub3_sub4_sub6_sub2.anInt1621 = -1;
            }
            if ((l & 8) == 8) {
                class44_sub3_sub4_sub6_sub2.aString1611 = class44_sub3_sub2.getString();
                class44_sub3_sub4_sub6_sub2.anInt1612 = 100;
            }
            if ((l & 0x10) == 16) {
                int k1 = class44_sub3_sub2.get1();
                int k2 = class44_sub3_sub2.get1();
                class44_sub3_sub4_sub6_sub2.method533(anInt802, (byte) 8, k1, k2);
                class44_sub3_sub4_sub6_sub2.anInt1618 = anInt802 + 300;
                class44_sub3_sub4_sub6_sub2.anInt1619 = class44_sub3_sub2.get1();
                class44_sub3_sub4_sub6_sub2.anInt1620 = class44_sub3_sub2.get1();
            }
            if ((l & 0x20) == 32) {
                class44_sub3_sub4_sub6_sub2.aClass12_1682 = Class12.method214(class44_sub3_sub2.get2());
                class44_sub3_sub4_sub6_sub2.anInt1603 = class44_sub3_sub4_sub6_sub2.aClass12_1682.aByte283;
                class44_sub3_sub4_sub6_sub2.anInt1647 = class44_sub3_sub4_sub6_sub2.aClass12_1682.anInt305;
                class44_sub3_sub4_sub6_sub2.anInt1606 = class44_sub3_sub4_sub6_sub2.aClass12_1682.anInt287;
                class44_sub3_sub4_sub6_sub2.anInt1607 = class44_sub3_sub4_sub6_sub2.aClass12_1682.anInt288;
                class44_sub3_sub4_sub6_sub2.anInt1608 = class44_sub3_sub4_sub6_sub2.aClass12_1682.anInt289;
                class44_sub3_sub4_sub6_sub2.anInt1609 = class44_sub3_sub4_sub6_sub2.aClass12_1682.anInt290;
                class44_sub3_sub4_sub6_sub2.anInt1604 = class44_sub3_sub4_sub6_sub2.aClass12_1682.anInt286;
            }
            if ((l & 0x40) == 64) {
                class44_sub3_sub4_sub6_sub2.anInt1632 = class44_sub3_sub2.get2();
                int l1 = class44_sub3_sub2.get4();
                class44_sub3_sub4_sub6_sub2.anInt1636 = l1 >> 16;
                class44_sub3_sub4_sub6_sub2.anInt1635 = anInt802 + (l1 & 0xffff);
                class44_sub3_sub4_sub6_sub2.anInt1633 = 0;
                class44_sub3_sub4_sub6_sub2.anInt1634 = 0;
                if (class44_sub3_sub4_sub6_sub2.anInt1635 > anInt802)
                    class44_sub3_sub4_sub6_sub2.anInt1633 = -1;
                if (class44_sub3_sub4_sub6_sub2.anInt1632 == 65535)
                    class44_sub3_sub4_sub6_sub2.anInt1632 = -1;
            }
            if ((l & 0x80) == 128) {
                class44_sub3_sub4_sub6_sub2.anInt1622 = class44_sub3_sub2.get2();
                class44_sub3_sub4_sub6_sub2.anInt1623 = class44_sub3_sub2.get2();
            }
        }

        if (byte0 != 4)
            aClass28ArrayArrayArray816 = null;
    }

    public void method100(int i, Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3) {
        int j = 256;
        if (i <= 0)
            anInt1220 = aClass44_Sub3_Sub2_1135.get1();
        Arrays.fill(anIntArray1111, 0);

        for (int l = 0; l < 5000; l++) {
            int i1 = (int) (Math.random() * 128D * (double) j);
            anIntArray1111[i1] = (int) (Math.random() * 256D);
        }

        for (int j1 = 0; j1 < 20; j1++) {
            for (int k1 = 1; k1 < j - 1; k1++) {
                for (int i2 = 1; i2 < 127; i2++) {
                    int k2 = i2 + (k1 << 7);
                    anIntArray1112[k2] = (anIntArray1111[k2 - 1] + anIntArray1111[k2 + 1] + anIntArray1111[k2 - 128] + anIntArray1111[k2 + 128]) / 4;
                }

            }

            int[] ai = anIntArray1111;
            anIntArray1111 = anIntArray1112;
            anIntArray1112 = ai;
        }

        if (class44_sub3_sub1_sub3 != null) {
            int l1 = 0;
            for (int j2 = 0; j2 < class44_sub3_sub1_sub3.anInt1448; j2++) {
                for (int l2 = 0; l2 < class44_sub3_sub1_sub3.anInt1447; l2++)
                    if (class44_sub3_sub1_sub3.aByteArray1445[l1++] != 0) {
                        int i3 = l2 + 16 + class44_sub3_sub1_sub3.anInt1449;
                        int j3 = j2 + 16 + class44_sub3_sub1_sub3.anInt1450;
                        int k3 = i3 + (j3 << 7);
                        anIntArray1111[k3] = 0;
                    }

            }

        }
    }

    public void method101(int i, int j, byte byte0, Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1, Class44_Sub3_Sub2 class44_sub3_sub2) {
        if (byte0 != aByte836)
            return;
        if ((i & 1) == 1) {
            int k = class44_sub3_sub2.get1();
            byte[] abyte0 = new byte[k];
            Class44_Sub3_Sub2 class44_sub3_sub2_1 = new Class44_Sub3_Sub2(abyte0, (byte) 1);
            class44_sub3_sub2.getArray(k, abyte0, 0, 0);
            aClass44_Sub3_Sub2Array1125[j] = class44_sub3_sub2_1;
            class44_sub3_sub4_sub6_sub1.method534(class44_sub3_sub2_1, anInt801);
        }
        if ((i & 2) == 2) {
            int l = class44_sub3_sub2.get2();
            if (l == 65535)
                l = -1;
            if (l == class44_sub3_sub4_sub6_sub1.anInt1627)
                class44_sub3_sub4_sub6_sub1.anInt1631 = 0;
            int i2 = class44_sub3_sub2.get1();
            if (l == class44_sub3_sub4_sub6_sub1.anInt1627 && l != -1) {
                int i3 = Class26.aClass26Array497[l].anInt511;
                if (i3 == 1) {
                    class44_sub3_sub4_sub6_sub1.anInt1628 = 0;
                    class44_sub3_sub4_sub6_sub1.anInt1629 = 0;
                    class44_sub3_sub4_sub6_sub1.anInt1630 = i2;
                    class44_sub3_sub4_sub6_sub1.anInt1631 = 0;
                }
                if (i3 == 2)
                    class44_sub3_sub4_sub6_sub1.anInt1631 = 0;
            } else if (l == -1 || class44_sub3_sub4_sub6_sub1.anInt1627 == -1 || Class26.aClass26Array497[l].anInt505 >= Class26.aClass26Array497[class44_sub3_sub4_sub6_sub1.anInt1627].anInt505) {
                class44_sub3_sub4_sub6_sub1.anInt1627 = l;
                class44_sub3_sub4_sub6_sub1.anInt1628 = 0;
                class44_sub3_sub4_sub6_sub1.anInt1629 = 0;
                class44_sub3_sub4_sub6_sub1.anInt1630 = i2;
                class44_sub3_sub4_sub6_sub1.anInt1631 = 0;
                class44_sub3_sub4_sub6_sub1.anInt1653 = class44_sub3_sub4_sub6_sub1.anInt1648;
            }
        }
        if ((i & 4) == 4) {
            class44_sub3_sub4_sub6_sub1.anInt1621 = class44_sub3_sub2.get2();
            if (class44_sub3_sub4_sub6_sub1.anInt1621 == 65535)
                class44_sub3_sub4_sub6_sub1.anInt1621 = -1;
        }
        if ((i & 8) == 8) {
            class44_sub3_sub4_sub6_sub1.aString1611 = class44_sub3_sub2.getString();
            class44_sub3_sub4_sub6_sub1.anInt1613 = 0;
            class44_sub3_sub4_sub6_sub1.anInt1614 = 0;
            class44_sub3_sub4_sub6_sub1.anInt1612 = 150;
            method49(-476, 2, class44_sub3_sub4_sub6_sub1.aString1657, class44_sub3_sub4_sub6_sub1.aString1611);
        }
        if ((i & 0x10) == 16) {
            int i1 = class44_sub3_sub2.get1();
            int j2 = class44_sub3_sub2.get1();
            class44_sub3_sub4_sub6_sub1.method533(anInt802, (byte) 8, i1, j2);
            class44_sub3_sub4_sub6_sub1.anInt1618 = anInt802 + 300;
            class44_sub3_sub4_sub6_sub1.anInt1619 = class44_sub3_sub2.get1();
            class44_sub3_sub4_sub6_sub1.anInt1620 = class44_sub3_sub2.get1();
        }
        if ((i & 0x20) == 32) {
            class44_sub3_sub4_sub6_sub1.anInt1622 = class44_sub3_sub2.get2();
            class44_sub3_sub4_sub6_sub1.anInt1623 = class44_sub3_sub2.get2();
        }
        if ((i & 0x40) == 64) {
            int j1 = class44_sub3_sub2.get2();
            int k2 = class44_sub3_sub2.get1();
            int j3 = class44_sub3_sub2.get1();
            int k3 = class44_sub3_sub2.anInt1374;
            if (class44_sub3_sub4_sub6_sub1.aString1657 != null && class44_sub3_sub4_sub6_sub1.aBoolean1658) {
                long l3 = Class48.method547(class44_sub3_sub4_sub6_sub1.aString1657);
                boolean flag = false;
                if (k2 <= 1) {
                    for (int i4 = 0; i4 < anInt961; i4++) {
                        if (aLongArray817[i4] != l3)
                            continue;
                        flag = true;
                        break;
                    }

                }
                if (!flag && anInt890 == 0)
                    try {
                        String s = Class49.method554((byte) 8, j3, class44_sub3_sub2);
                        s = Class41.method352((byte) 3, s);
                        class44_sub3_sub4_sub6_sub1.aString1611 = s;
                        class44_sub3_sub4_sub6_sub1.anInt1613 = j1 >> 8;
                        class44_sub3_sub4_sub6_sub1.anInt1614 = j1 & 0xff;
                        class44_sub3_sub4_sub6_sub1.anInt1612 = 150;
                        if (k2 == 2 || k2 == 3)
                            method49(-476, 1, "@cr2@" + class44_sub3_sub4_sub6_sub1.aString1657, s);
                        else if (k2 == 1)
                            method49(-476, 1, "@cr1@" + class44_sub3_sub4_sub6_sub1.aString1657, s);
                        else
                            method49(-476, 2, class44_sub3_sub4_sub6_sub1.aString1657, s);
                    } catch (Exception exception) {
                        signlink.reporterror("cde2");
                    }
            }
            class44_sub3_sub2.anInt1374 = k3 + j3;
        }
        if ((i & 0x100) == 256) {
            class44_sub3_sub4_sub6_sub1.anInt1632 = class44_sub3_sub2.get2();
            int k1 = class44_sub3_sub2.get4();
            class44_sub3_sub4_sub6_sub1.anInt1636 = k1 >> 16;
            class44_sub3_sub4_sub6_sub1.anInt1635 = anInt802 + (k1 & 0xffff);
            class44_sub3_sub4_sub6_sub1.anInt1633 = 0;
            class44_sub3_sub4_sub6_sub1.anInt1634 = 0;
            if (class44_sub3_sub4_sub6_sub1.anInt1635 > anInt802)
                class44_sub3_sub4_sub6_sub1.anInt1633 = -1;
            if (class44_sub3_sub4_sub6_sub1.anInt1632 == 65535)
                class44_sub3_sub4_sub6_sub1.anInt1632 = -1;
        }
        if ((i & 0x200) == 512) {
            class44_sub3_sub4_sub6_sub1.anInt1637 = class44_sub3_sub2.get1();
            class44_sub3_sub4_sub6_sub1.anInt1639 = class44_sub3_sub2.get1();
            class44_sub3_sub4_sub6_sub1.anInt1638 = class44_sub3_sub2.get1();
            class44_sub3_sub4_sub6_sub1.anInt1640 = class44_sub3_sub2.get1();
            class44_sub3_sub4_sub6_sub1.anInt1641 = class44_sub3_sub2.get2() + anInt802;
            class44_sub3_sub4_sub6_sub1.anInt1642 = class44_sub3_sub2.get2() + anInt802;
            class44_sub3_sub4_sub6_sub1.anInt1643 = class44_sub3_sub2.get1();
            class44_sub3_sub4_sub6_sub1.method531(false);
        }
        if ((i & 0x400) == 1024) {
            int l1 = class44_sub3_sub2.get1();
            int l2 = class44_sub3_sub2.get1();
            class44_sub3_sub4_sub6_sub1.method533(anInt802, (byte) 8, l1, l2);
            class44_sub3_sub4_sub6_sub1.anInt1618 = anInt802 + 300;
            class44_sub3_sub4_sub6_sub1.anInt1619 = class44_sub3_sub2.get1();
            class44_sub3_sub4_sub6_sub1.anInt1620 = class44_sub3_sub2.get1();
        }
    }

    public void method102(int i, long l) {
        try {
            if (l == 0L)
                return;
            if (anInt1115 >= 100 && anInt808 != 1) {
                method49(-476, 0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
                return;
            }
            if (anInt1115 >= 200) {
                method49(-476, 0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
                return;
            }
            String s = Class48.method551(131, Class48.method548(0, l));
            for (int j = 0; j < anInt1115; j++)
                if (aLongArray1159[j] == l) {
                    method49(-476, 0, "", s + " is already on your friend list");
                    return;
                }

            i = 88 / i;
            for (int k = 0; k < anInt961; k++)
                if (aLongArray817[k] == l) {
                    method49(-476, 0, "", "Please remove " + s + " from your ignore list first");
                    return;
                }

            if (s.equals(aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1657)) {
                return;
            } else {
                aStringArray833[anInt1115] = s;
                aLongArray1159[anInt1115] = l;
                anIntArray1073[anInt1115] = 0;
                anInt1115++;
                aBoolean928 = true;
                aClass44_Sub3_Sub2_843.putOpcode(13);
                aClass44_Sub3_Sub2_843.put8(l, 0);
                return;
            }
        } catch (RuntimeException runtimeexception) {
            signlink.reporterror("75126, " + i + ", " + l + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public void method9(boolean flag) {
        if (!flag) {
            for (int i = 1; i > 0; i++) ;
        }
        if (aBoolean1035 || aBoolean1174 || aBoolean898) {
            method108(15447);
            return;
        }
        anInt842++;
        if (!aBoolean905)
            method53(false, false);
        else
            method142(41329);
        anInt993 = 0;
    }

    public void method103(byte byte0) {
        aClass34_863.method272(aBoolean960);
        if (anInt1031 == 2) {
            byte[] abyte0 = aClass44_Sub3_Sub1_Sub3_1202.aByteArray1445;
            int[] ai = Class44_Sub3_Sub1.anIntArray1351;
            int k2 = abyte0.length;
            for (int i5 = 0; i5 < k2; i5++)
                if (abyte0[i5] == 0)
                    ai[i5] = 0;

            aClass44_Sub3_Sub1_Sub2_1085.method444(256, 25, 33, 33, 0, anIntArray1054, 25, anIntArray883, -582, anInt1206, 0);
            aClass34_864.method272(aBoolean960);
            return;
        }
        int i = anInt1206 + anInt1217 & 0x7ff;
        int j = 48 + aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 / 32;
        int l2 = 464 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 / 32;
        aClass44_Sub3_Sub1_Sub2_1027.method444(256 + anInt1170, j, 146, 151, 25, anIntArray1150, l2, anIntArray1136, -582, i, 5);
        if (byte0 == aByte798)
            byte0 = 0;
        else
            return;
        aClass44_Sub3_Sub1_Sub2_1085.method444(256, 25, 33, 33, 0, anIntArray1054, 25, anIntArray883, -582, anInt1206, 0);
        for (int j5 = 0; j5 < anInt987; j5++) {
            int k = (anIntArray988[j5] * 4 + 2) - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 / 32;
            int i3 = (anIntArray989[j5] * 4 + 2) - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 / 32;
            method33(i3, k, (byte) -111, aClass44_Sub3_Sub1_Sub2Array1204[j5]);
        }

        for (int k5 = 0; k5 < 104; k5++) {
            for (int l5 = 0; l5 < 104; l5++) {
                Class28 class28 = aClass28ArrayArrayArray816[anInt1062][k5][l5];
                if (class28 != null) {
                    int l = (k5 * 4 + 2) - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 / 32;
                    int j3 = (l5 * 4 + 2) - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 / 32;
                    method33(j3, l, (byte) -111, aClass44_Sub3_Sub1_Sub2_1187);
                }
            }

        }

        for (int i6 = 0; i6 < anInt1260; i6++) {
            Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1259[anIntArray1261[i6]];
            if (class44_sub3_sub4_sub6_sub2 != null && class44_sub3_sub4_sub6_sub2.method532(0) && class44_sub3_sub4_sub6_sub2.aClass12_1682.aBoolean297) {
                int i1 = class44_sub3_sub4_sub6_sub2.anInt1599 / 32 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 / 32;
                int k3 = class44_sub3_sub4_sub6_sub2.anInt1600 / 32 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 / 32;
                method33(k3, i1, (byte) -111, aClass44_Sub3_Sub1_Sub2_1188);
            }
        }

        for (int j6 = 0; j6 < anInt1121; j6++) {
            Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1120[anIntArray1122[j6]];
            if (class44_sub3_sub4_sub6_sub1 != null && class44_sub3_sub4_sub6_sub1.method532(0)) {
                int j1 = class44_sub3_sub4_sub6_sub1.anInt1599 / 32 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 / 32;
                int l3 = class44_sub3_sub4_sub6_sub1.anInt1600 / 32 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 / 32;
                boolean flag = false;
                long l6 = Class48.method547(class44_sub3_sub4_sub6_sub1.aString1657);
                for (int k6 = 0; k6 < anInt1115; k6++) {
                    if (l6 != aLongArray1159[k6] || anIntArray1073[k6] == 0)
                        continue;
                    flag = true;
                    break;
                }

                if (flag)
                    method33(l3, j1, (byte) -111, aClass44_Sub3_Sub1_Sub2_1190);
                else
                    method33(l3, j1, (byte) -111, aClass44_Sub3_Sub1_Sub2_1189);
            }
        }

        if (anInt1200 != 0 && anInt802 % 20 < 10) {
            if (anInt1200 == 1 && anInt920 >= 0 && anInt920 < aClass44_Sub3_Sub4_Sub6_Sub2Array1259.length) {
                Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2_1 = aClass44_Sub3_Sub4_Sub6_Sub2Array1259[anInt920];
                if (class44_sub3_sub4_sub6_sub2_1 != null) {
                    int k1 = class44_sub3_sub4_sub6_sub2_1.anInt1599 / 32 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 / 32;
                    int i4 = class44_sub3_sub4_sub6_sub2_1.anInt1600 / 32 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 / 32;
                    method88(k1, i4, 4, aClass44_Sub3_Sub1_Sub2_965);
                }
            }
            if (anInt1200 == 2) {
                int l1 = ((anInt1162 - anInt1055) * 4 + 2) - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 / 32;
                int j4 = ((anInt1163 - anInt1056) * 4 + 2) - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 / 32;
                method88(l1, j4, 4, aClass44_Sub3_Sub1_Sub2_965);
            }
            if (anInt1200 == 10 && anInt1181 >= 0 && anInt1181 < aClass44_Sub3_Sub4_Sub6_Sub1Array1120.length) {
                Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1_1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1120[anInt1181];
                if (class44_sub3_sub4_sub6_sub1_1 != null) {
                    int i2 = class44_sub3_sub4_sub6_sub1_1.anInt1599 / 32 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 / 32;
                    int k4 = class44_sub3_sub4_sub6_sub1_1.anInt1600 / 32 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 / 32;
                    method88(i2, k4, 4, aClass44_Sub3_Sub1_Sub2_965);
                }
            }
        }
        if (anInt1025 != 0) {
            int j2 = (anInt1025 * 4 + 2) - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 / 32;
            int l4 = (anInt1026 * 4 + 2) - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 / 32;
            method33(l4, j2, (byte) -111, aClass44_Sub3_Sub1_Sub2_964);
        }
        Class44_Sub3_Sub1.method411(3, 0xffffff, 3, 97, 0, 78);
        aClass34_864.method272(aBoolean960);
    }

    public void method104(boolean flag) {
        for (int i = -1; i < anInt1121; i++) {
            int j;
            if (i == -1)
                j = anInt1119;
            else
                j = anIntArray1122[i];
            Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1120[j];
            if (class44_sub3_sub4_sub6_sub1 != null)
                method136(class44_sub3_sub4_sub6_sub1, 0, 1);
        }

        aBoolean905 &= flag;
    }

    public void method105(int i, boolean flag) {
        if (aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 >> 7 == anInt1025 && aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 >> 7 == anInt1026) {
            anInt1025 = 0;
            anInt981++;
            if (anInt981 > 122) {
                anInt981 = 0;
                aClass44_Sub3_Sub2_843.putOpcode(188);
                aClass44_Sub3_Sub2_843.put1(62);
            }
        }
        int j = anInt1121;
        if (i != 0)
            return;
        if (flag)
            j = 1;
        for (int k = 0; k < j; k++) {
            Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1;
            int l;
            if (flag) {
                class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1_1252;
                l = anInt1119 << 14;
            } else {
                class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1120[anIntArray1122[k]];
                l = anIntArray1122[k] << 14;
            }
            if (class44_sub3_sub4_sub6_sub1 == null || !class44_sub3_sub4_sub6_sub1.method532(0))
                continue;
            class44_sub3_sub4_sub6_sub1.aBoolean1677 = (aBoolean1240 && anInt1121 > 50 || anInt1121 > 200) && !flag && class44_sub3_sub4_sub6_sub1.anInt1624 == class44_sub3_sub4_sub6_sub1.anInt1604;
            int i1 = class44_sub3_sub4_sub6_sub1.anInt1599 >> 7;
            int j1 = class44_sub3_sub4_sub6_sub1.anInt1600 >> 7;
            if (i1 < 0 || i1 >= 104 || j1 < 0 || j1 >= 104)
                continue;
            if (class44_sub3_sub4_sub6_sub1.aClass44_Sub3_Sub4_Sub4_1672 != null && anInt802 >= class44_sub3_sub4_sub6_sub1.anInt1667 && anInt802 < class44_sub3_sub4_sub6_sub1.anInt1668) {
                class44_sub3_sub4_sub6_sub1.aBoolean1677 = false;
                class44_sub3_sub4_sub6_sub1.anInt1666 = method50(class44_sub3_sub4_sub6_sub1.anInt1599, class44_sub3_sub4_sub6_sub1.anInt1600, 0, anInt1062);
                aClass36_915.method290(-23687, class44_sub3_sub4_sub6_sub1.anInt1676, class44_sub3_sub4_sub6_sub1.anInt1601, class44_sub3_sub4_sub6_sub1.anInt1675, class44_sub3_sub4_sub6_sub1.anInt1666, class44_sub3_sub4_sub6_sub1.anInt1673, 60, class44_sub3_sub4_sub6_sub1.anInt1599, anInt1062, class44_sub3_sub4_sub6_sub1, class44_sub3_sub4_sub6_sub1.anInt1600, class44_sub3_sub4_sub6_sub1.anInt1674, l);
                continue;
            }
            if ((class44_sub3_sub4_sub6_sub1.anInt1599 & 0x7f) == 64 && (class44_sub3_sub4_sub6_sub1.anInt1600 & 0x7f) == 64) {
                if (anIntArrayArray1020[i1][j1] == anInt868)
                    continue;
                anIntArrayArray1020[i1][j1] = anInt868;
            }
            class44_sub3_sub4_sub6_sub1.anInt1666 = method50(class44_sub3_sub4_sub6_sub1.anInt1599, class44_sub3_sub4_sub6_sub1.anInt1600, 0, anInt1062);
            aClass36_915.method289(class44_sub3_sub4_sub6_sub1.anInt1666, class44_sub3_sub4_sub6_sub1, class44_sub3_sub4_sub6_sub1.anInt1599, l, class44_sub3_sub4_sub6_sub1.anInt1600, (byte) 1, 60, class44_sub3_sub4_sub6_sub1.anInt1601, anInt1062, class44_sub3_sub4_sub6_sub1.aBoolean1602);
        }

    }

    public void method106(int i) {
        if (i <= 0)
            anInt1003 = aClass46_944.method542();
        aBoolean971 = true;
        for (int j = 0; j < 7; j++) {
            anIntArray810[j] = -1;
            for (int k = 0; k < Class22.anInt454; k++) {
                if (Class22.aClass22Array455[k].aBoolean461 || Class22.aClass22Array455[k].anInt456 != j + (aBoolean982 ? 0 : 7))
                    continue;
                anIntArray810[j] = k;
                break;
            }

        }

    }

    public void method107(int i) {
        anInt890 = 0;
        int j = (aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 >> 7) + anInt1055;
        int k = (aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 >> 7) + anInt1056;
        if (i <= 0)
            anInt1133 = aClass46_944.method542();
        if (j >= 3053 && j <= 3156 && k >= 3056 && k <= 3136)
            anInt890 = 1;
        if (j >= 3072 && j <= 3118 && k >= 9492 && k <= 9535)
            anInt890 = 1;
        if (anInt890 == 1 && j >= 3139 && j <= 3199 && k >= 3008 && k <= 3062)
            anInt890 = 0;
    }

    public void method108(int i) {
        if (i != 15447)
            aClass44_Sub3_Sub2_843.put1(186);
        Graphics g = method11(aByte1102).getGraphics();
        g.setColor(Color.black);
        g.fillRect(0, 0, 765, 503);
        method4(-27605, 1);
        if (aBoolean1174) {
            aBoolean906 = false;
            g.setFont(new Font("Helvetica", 1, 16));
            g.setColor(Color.yellow);
            int j = 35;
            g.drawString("Sorry, an error has occured whilst loading RuneScape", 30, j);
            j += 50;
            g.setColor(Color.white);
            g.drawString("To fix this try the following (in order):", 30, j);
            j += 50;
            g.setColor(Color.white);
            g.setFont(new Font("Helvetica", 1, 12));
            g.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, j);
            j += 30;
            g.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, j);
            j += 30;
            g.drawString("3: Try using a different game-world", 30, j);
            j += 30;
            g.drawString("4: Try rebooting your computer", 30, j);
            j += 30;
            g.drawString("5: Try selecting a different version of Java from the play-game menu", 30, j);
        }
        if (aBoolean898) {
            aBoolean906 = false;
            g.setFont(new Font("Helvetica", 1, 20));
            g.setColor(Color.white);
            g.drawString("Error - unable to load game!", 50, 50);
            g.drawString("To play RuneScape make sure you play from", 50, 100);
            g.drawString("http://www.runescape.com", 50, 150);
        }
        if (aBoolean1035) {
            aBoolean906 = false;
            g.setColor(Color.yellow);
            int k = 35;
            g.drawString("Error a copy of RuneScape already appears to be loaded", 30, k);
            k += 50;
            g.setColor(Color.white);
            g.drawString("To fix this try the following (in order):", 30, k);
            k += 50;
            g.setColor(Color.white);
            g.setFont(new Font("Helvetica", 1, 12));
            g.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, k);
            k += 30;
            g.drawString("2: Try rebooting your computer, and reloading", 30, k);
            k += 30;
        }
    }

    public void method109(int i, boolean flag, int j) {
        anInt1219 += i;
        signlink.midivol = j;
        if (flag)
            signlink.midi = "voladjust";
    }

    public void method111(int i, byte byte0, Class44_Sub3_Sub2 class44_sub3_sub2) {
        anInt1064 = 0;
        anInt1123 = 0;
        method119(class44_sub3_sub2, i, (byte) -85);
        method94(0, class44_sub3_sub2, i);
        method145(class44_sub3_sub2, i, anInt806);
        method75(class44_sub3_sub2, -45473, i);
        if (byte0 != aByte1087)
            return;
        for (int j = 0; j < anInt1064; j++) {
            int k = anIntArray1065[j];
            if (aClass44_Sub3_Sub4_Sub6_Sub1Array1120[k].anInt1644 != anInt802)
                aClass44_Sub3_Sub4_Sub6_Sub1Array1120[k] = null;
        }

        if (class44_sub3_sub2.anInt1374 != i) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + class44_sub3_sub2.anInt1374 + " psize:" + i);
            throw new RuntimeException("eek");
        }
        for (int l = 0; l < anInt1121; l++)
            if (aClass44_Sub3_Sub4_Sub6_Sub1Array1120[anIntArray1122[l]] == null) {
                signlink.reporterror(aString1147 + " null entry in pl list - pos:" + l + " size:" + anInt1121);
                throw new RuntimeException("eek");
            }

    }

    public boolean method112(int i) {
        if (i != 0)
            throw new NullPointerException();
        if (aClass7_1108 == null)
            return false;
        try {
            int j = aClass7_1108.method193();
            if (j == 0)
                return false;
            if (anInt1220 == -1) {
                aClass7_1108.method194(aClass44_Sub3_Sub2_1135.aByteArray1373, 0, 1);
                anInt1220 = aClass44_Sub3_Sub2_1135.aByteArray1373[0] & 0xff;
                if (aClass46_944 != null)
                    anInt1220 = anInt1220 - aClass46_944.method542() & 0xff;
                anInt1219 = Class16.anIntArray393[anInt1220];
                j--;
            }
            if (anInt1219 == -1)
                if (j > 0) {
                    aClass7_1108.method194(aClass44_Sub3_Sub2_1135.aByteArray1373, 0, 1);
                    anInt1219 = aClass44_Sub3_Sub2_1135.aByteArray1373[0] & 0xff;
                    j--;
                } else {
                    return false;
                }
            if (anInt1219 == -2)
                if (j > 1) {
                    aClass7_1108.method194(aClass44_Sub3_Sub2_1135.aByteArray1373, 0, 2);
                    aClass44_Sub3_Sub2_1135.anInt1374 = 0;
                    anInt1219 = aClass44_Sub3_Sub2_1135.get2();
                    j -= 2;
                } else {
                    return false;
                }
            if (j < anInt1219)
                return false;
            aClass44_Sub3_Sub2_1135.anInt1374 = 0;
            aClass7_1108.method194(aClass44_Sub3_Sub2_1135.aByteArray1373, 0, anInt1219);
            anInt1221 = 0;
            anInt1140 = anInt1139;
            anInt1139 = anInt1138;
            anInt1138 = anInt1220;
            if (anInt1220 == 207) {
                anInt818 = aClass44_Sub3_Sub2_1135.get1();
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 241) {
                anInt1013 = aClass44_Sub3_Sub2_1135.get1();
                aBoolean928 = true;
                aBoolean841 = true;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 203) {
                int k = aClass44_Sub3_Sub2_1135.get2();
                byte byte0 = aClass44_Sub3_Sub2_1135.get1Signed();
                anIntArray1172[k] = byte0;
                if (anIntArray1107[k] != byte0) {
                    anIntArray1107[k] = byte0;
                    method40(false, k);
                    aBoolean928 = true;
                    if (anInt1110 != -1)
                        aBoolean1109 = true;
                }
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 115) {
                anInt1025 = 0;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 64) {
                int l = aClass44_Sub3_Sub2_1135.get1();
                int i10 = aClass44_Sub3_Sub2_1135.get1();
                int j15 = aClass44_Sub3_Sub2_1135.get1();
                int i19 = aClass44_Sub3_Sub2_1135.get1();
                aBooleanArray1161[l] = true;
                anIntArray998[l] = i10;
                anIntArray904[l] = j15;
                anIntArray844[l] = i19;
                anIntArray968[l] = 0;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 95 || anInt1220 == 176 || anInt1220 == 219 || anInt1220 == 85 || anInt1220 == 107 || anInt1220 == 52 || anInt1220 == 81 || anInt1220 == 48 || anInt1220 == 173 || anInt1220 == 138) {
                method67(anInt1220, 220, aClass44_Sub3_Sub2_1135);
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 211) {
                int i1 = aClass44_Sub3_Sub2_1135.get2();
                method28(i1, -147);
                if (anInt1216 != -1) {
                    anInt1216 = -1;
                    aBoolean928 = true;
                    aBoolean841 = true;
                }
                if (anInt1011 != -1) {
                    anInt1011 = -1;
                    aBoolean1109 = true;
                }
                if (aBoolean1104) {
                    aBoolean1104 = false;
                    aBoolean1109 = true;
                }
                anInt1037 = i1;
                aBoolean1168 = false;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 192) {
                int j1 = aClass44_Sub3_Sub2_1135.get2();
                Class5.aClass5Array103[j1].anInt152 = 3;
                Class5.aClass5Array103[j1].anInt153 = (aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1662[0] << 24) + (aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1662[4] << 18) + (aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1661[0] << 12) + (aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1661[8] << 6) + aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1661[11];
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 210) {
                aBoolean1265 = false;
                aBoolean1104 = true;
                aString1182 = "";
                aBoolean1109 = true;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 130) {
                int k1 = aClass44_Sub3_Sub2_1135.get2Signed();
                anInt1110 = k1;
                aBoolean1109 = true;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 167) {
                method111(anInt1219, (byte) -44, aClass44_Sub3_Sub2_1135);
                aBoolean1249 = false;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 34) {
                int l1 = aClass44_Sub3_Sub2_1135.get2();
                int j10 = aClass44_Sub3_Sub2_1135.get1();
                int k15 = aClass44_Sub3_Sub2_1135.get2();
                if (aBoolean1080 && !aBoolean1240 && anInt929 < 50) {
                    anIntArray1048[anInt929] = l1;
                    anIntArray804[anInt929] = j10;
                    anIntArray1083[anInt929] = k15 + Class4.anIntArray95[l1];
                    anInt929++;
                }
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 91) {
                anInt970 = aClass44_Sub3_Sub2_1135.get4();
                anInt1010 = aClass44_Sub3_Sub2_1135.get2();
                anInt1029 = aClass44_Sub3_Sub2_1135.get1();
                anInt887 = aClass44_Sub3_Sub2_1135.get2();
                anInt1100 = aClass44_Sub3_Sub2_1135.get1();
                if (anInt970 != 0 && anInt1037 == -1) {
                    signlink.dnslookup(Class48.method550((byte) 94, anInt970));
                    method45(false);
                    char c = '\u028A';
                    if (anInt1029 != 201 || anInt1100 == 1)
                        c = '\u028F';
                    aString951 = "";
                    aBoolean1128 = false;
                    for (int k10 = 0; k10 < Class5.aClass5Array103.length; k10++) {
                        if (Class5.aClass5Array103[k10] == null || Class5.aClass5Array103[k10].anInt112 != c)
                            continue;
                        anInt1037 = Class5.aClass5Array103[k10].anInt109;
                        break;
                    }

                }
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 88) {
                method80(false);
                anInt1220 = -1;
                return false;
            }
            if (anInt1220 == 134) {
                int i2 = aClass44_Sub3_Sub2_1135.get2();
                int l10 = aClass44_Sub3_Sub2_1135.get2Signed();
                Class5 class5_3 = Class5.aClass5Array103[i2];
                class5_3.anInt156 = l10;
                if (l10 == -1) {
                    class5_3.anInt106 = 0;
                    class5_3.anInt107 = 0;
                }
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 156) {
                anInt1200 = aClass44_Sub3_Sub2_1135.get1();
                if (anInt1200 == 1)
                    anInt920 = aClass44_Sub3_Sub2_1135.get2();
                if (anInt1200 >= 2 && anInt1200 <= 6) {
                    if (anInt1200 == 2) {
                        anInt1165 = 64;
                        anInt1166 = 64;
                    }
                    if (anInt1200 == 3) {
                        anInt1165 = 0;
                        anInt1166 = 64;
                    }
                    if (anInt1200 == 4) {
                        anInt1165 = 128;
                        anInt1166 = 64;
                    }
                    if (anInt1200 == 5) {
                        anInt1165 = 64;
                        anInt1166 = 0;
                    }
                    if (anInt1200 == 6) {
                        anInt1165 = 64;
                        anInt1166 = 128;
                    }
                    anInt1200 = 2;
                    anInt1162 = aClass44_Sub3_Sub2_1135.get2();
                    anInt1163 = aClass44_Sub3_Sub2_1135.get2();
                    anInt1164 = aClass44_Sub3_Sub2_1135.get1();
                }
                if (anInt1200 == 10)
                    anInt1181 = aClass44_Sub3_Sub2_1135.get2();
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 67) {
                if (anInt1013 == 12)
                    aBoolean928 = true;
                anInt921 = aClass44_Sub3_Sub2_1135.get2Signed();
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 3) {
                anInt961 = anInt1219 / 8;
                for (int j2 = 0; j2 < anInt961; j2++)
                    aLongArray817[j2] = aClass44_Sub3_Sub2_1135.get8(0);

                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 142) {
                int k2 = aClass44_Sub3_Sub2_1135.get2();
                int i11 = aClass44_Sub3_Sub2_1135.get2();
                Class5.aClass5Array103[k2].anInt152 = 2;
                Class5.aClass5Array103[k2].anInt153 = i11;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 215) {
                int l2 = aClass44_Sub3_Sub2_1135.get2();
                int j11 = aClass44_Sub3_Sub2_1135.get1();
                if (l2 == 65535)
                    l2 = -1;
                anIntArray954[j11] = l2;
                aBoolean928 = true;
                aBoolean841 = true;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 153) {
                anInt918 = aClass44_Sub3_Sub2_1135.get1();
                anInt919 = aClass44_Sub3_Sub2_1135.get1();
                for (int i3 = anInt918; i3 < anInt918 + 8; i3++) {
                    for (int k11 = anInt919; k11 < anInt919 + 8; k11++)
                        if (aClass28ArrayArrayArray816[anInt1062][i3][k11] != null) {
                            aClass28ArrayArrayArray816[anInt1062][i3][k11] = null;
                            method52(i3, k11);
                        }

                }

                for (Class44_Sub1 class44_sub1 = (Class44_Sub1) aClass28_1228.method259(); class44_sub1 != null; class44_sub1 = (Class44_Sub1) aClass28_1228.method261(aByte958))
                    if (class44_sub1.anInt1312 >= anInt918 && class44_sub1.anInt1312 < anInt918 + 8 && class44_sub1.anInt1313 >= anInt919 && class44_sub1.anInt1313 < anInt919 + 8 && class44_sub1.anInt1310 == anInt1062)
                        class44_sub1.anInt1321 = 0;

                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 114) {
                anInt967 = aClass44_Sub3_Sub2_1135.get1();
                anInt972 = aClass44_Sub3_Sub2_1135.get1();
                anInt805 = aClass44_Sub3_Sub2_1135.get1();
                aBoolean1141 = true;
                aBoolean1109 = true;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 158) {
                int j3 = aClass44_Sub3_Sub2_1135.get2();
                int l11 = aClass44_Sub3_Sub2_1135.get2();
                if (anInt1011 != -1) {
                    anInt1011 = -1;
                    aBoolean1109 = true;
                }
                if (aBoolean1104) {
                    aBoolean1104 = false;
                    aBoolean1109 = true;
                }
                anInt1037 = j3;
                anInt1216 = l11;
                aBoolean928 = true;
                aBoolean841 = true;
                aBoolean1168 = false;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 240) {
                int k3 = aClass44_Sub3_Sub2_1135.get2Signed();
                if (k3 >= 0)
                    method28(k3, -147);
                anInt1103 = k3;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 195) {
                anInt918 = aClass44_Sub3_Sub2_1135.get1();
                anInt919 = aClass44_Sub3_Sub2_1135.get1();
                while (aClass44_Sub3_Sub2_1135.anInt1374 < anInt1219) {
                    int l3 = aClass44_Sub3_Sub2_1135.get1();
                    method67(l3, 220, aClass44_Sub3_Sub2_1135);
                }
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 161) {
                String s = aClass44_Sub3_Sub2_1135.getString();
                if (s.endsWith(":tradereq:")) {
                    String s2 = s.substring(0, s.indexOf(":"));
                    long l15 = Class48.method547(s2);
                    boolean flag1 = false;
                    for (int i23 = 0; i23 < anInt961; i23++) {
                        if (aLongArray817[i23] != l15)
                            continue;
                        flag1 = true;
                        break;
                    }

                    if (!flag1 && anInt890 == 0)
                        method49(-476, 4, s2, "wishes to trade with you.");
                } else if (s.endsWith(":duelreq:")) {
                    String s3 = s.substring(0, s.indexOf(":"));
                    long l16 = Class48.method547(s3);
                    boolean flag2 = false;
                    for (int j23 = 0; j23 < anInt961; j23++) {
                        if (aLongArray817[j23] != l16)
                            continue;
                        flag2 = true;
                        break;
                    }

                    if (!flag2 && anInt890 == 0)
                        method49(-476, 8, s3, "wishes to duel with you.");
                } else {
                    method49(-476, 0, "", s);
                }
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 101) {
                aBoolean1008 = false;
                for (int i4 = 0; i4 < 5; i4++)
                    aBooleanArray1161[i4] = false;

                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 16) {
                int j4 = aClass44_Sub3_Sub2_1135.get2();
                method28(j4, -147);
                if (anInt1011 != -1) {
                    anInt1011 = -1;
                    aBoolean1109 = true;
                }
                if (aBoolean1104) {
                    aBoolean1104 = false;
                    aBoolean1109 = true;
                }
                anInt1216 = j4;
                aBoolean928 = true;
                aBoolean841 = true;
                anInt1037 = -1;
                aBoolean1168 = false;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 44) {
                int k4 = aClass44_Sub3_Sub2_1135.get2();
                String s4 = aClass44_Sub3_Sub2_1135.getString();
                Class5.aClass5Array103[k4].aString144 = s4;
                if (Class5.aClass5Array103[k4].anInt109 == anIntArray954[anInt1013])
                    aBoolean928 = true;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 245) {
                int l4 = aClass44_Sub3_Sub2_1135.get2();
                int i12 = aClass44_Sub3_Sub2_1135.get4();
                anIntArray1172[l4] = i12;
                if (anIntArray1107[l4] != i12) {
                    anIntArray1107[l4] = i12;
                    method40(false, l4);
                    aBoolean928 = true;
                    if (anInt1110 != -1)
                        aBoolean1109 = true;
                }
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 166) {
                int i5 = aClass44_Sub3_Sub2_1135.get2();
                method28(i5, -147);
                if (anInt1216 != -1) {
                    anInt1216 = -1;
                    aBoolean928 = true;
                    aBoolean841 = true;
                }
                anInt1011 = i5;
                aBoolean1109 = true;
                anInt1037 = -1;
                aBoolean1168 = false;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 28) {
                int j5 = aClass44_Sub3_Sub2_1135.get2();
                int j12 = aClass44_Sub3_Sub2_1135.get2();
                int i16 = aClass44_Sub3_Sub2_1135.get2();
                Class14 class14 = Class14.method220(j12);
                Class5.aClass5Array103[j5].anInt152 = 4;
                Class5.aClass5Array103[j5].anInt153 = j12;
                Class5.aClass5Array103[j5].anInt159 = class14.anInt332;
                Class5.aClass5Array103[j5].anInt160 = class14.anInt333;
                Class5.aClass5Array103[j5].anInt158 = (class14.anInt331 * 100) / i16;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 54) {
                int k5 = aClass44_Sub3_Sub2_1135.get2();
                int k12 = aClass44_Sub3_Sub2_1135.get2();
                Class5 class5_4 = Class5.aClass5Array103[k5];
                if (class5_4 != null && class5_4.anInt110 == 0) {
                    if (k12 < 0)
                        k12 = 0;
                    if (k12 > class5_4.anInt122 - class5_4.anInt114)
                        k12 = class5_4.anInt122 - class5_4.anInt114;
                    class5_4.anInt123 = k12;
                }
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 47) {
                for (Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 : aClass44_Sub3_Sub4_Sub6_Sub1Array1120)
                    if (class44_sub3_sub4_sub6_sub1 != null)
                        class44_sub3_sub4_sub6_sub1.anInt1627 = -1;

                for (Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 : aClass44_Sub3_Sub4_Sub6_Sub2Array1259)
                    if (class44_sub3_sub4_sub6_sub2 != null)
                        class44_sub3_sub4_sub6_sub2.anInt1627 = -1;

                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 194) {
                anInt1031 = aClass44_Sub3_Sub2_1135.get1();
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 90) {
                anInt1173 = aClass44_Sub3_Sub2_1135.get1();
                if (anInt1173 == anInt1013) {
                    if (anInt1173 == 3)
                        anInt1013 = 1;
                    else
                        anInt1013 = 3;
                    aBoolean928 = true;
                }
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 89) {
                anInt803 = aClass44_Sub3_Sub2_1135.get2() * 30;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 190) {
                for (int i6 = 0; i6 < anIntArray1107.length; i6++)
                    if (anIntArray1107[i6] != anIntArray1172[i6]) {
                        anIntArray1107[i6] = anIntArray1172[i6];
                        method40(false, i6);
                        aBoolean928 = true;
                    }

                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 83) {
                if (anInt1013 == 12)
                    aBoolean928 = true;
                anInt840 = aClass44_Sub3_Sub2_1135.get1();
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 231) {
                int j6 = aClass44_Sub3_Sub2_1135.get2();
                int i13 = aClass44_Sub3_Sub2_1135.get2();
                if (anInt922 == j6 && anInt923 == i13 && anInt1129 == 2) {
                    anInt1220 = -1;
                    return true;
                }
                anInt922 = j6;
                anInt923 = i13;
                anInt1055 = (anInt922 - 6) * 8;
                anInt1056 = (anInt923 - 6) * 8;
                aBoolean1169 = (anInt922 / 8 == 48 || anInt922 / 8 == 49) && anInt923 / 8 == 48;
                if (anInt922 / 8 == 48 && anInt923 / 8 == 148)
                    aBoolean1169 = true;
                anInt1129 = 1;
                aLong1127 = System.currentTimeMillis();
                aClass34_864.method272(aBoolean960);
                aClass44_Sub3_Sub1_Sub4_1076.method455(257, 151, 0, "Loading - please wait.", false);
                aClass44_Sub3_Sub1_Sub4_1076.method455(256, 150, 0xffffff, "Loading - please wait.", false);
                aClass34_864.method273(4, super.aGraphics14, (byte) 76, 4);
                int j16 = 0;
                for (int j19 = (anInt922 - 6) / 8; j19 <= (anInt922 + 6) / 8; j19++) {
                    for (int i21 = (anInt923 - 6) / 8; i21 <= (anInt923 + 6) / 8; i21++)
                        j16++;

                }

                aByteArrayArray886 = new byte[j16][];
                aByteArrayArray953 = new byte[j16][];
                anIntArray830 = new int[j16];
                anIntArray831 = new int[j16];
                anIntArray832 = new int[j16];
                j16 = 0;
                for (int j21 = (anInt922 - 6) / 8; j21 <= (anInt922 + 6) / 8; j21++) {
                    for (int k23 = (anInt923 - 6) / 8; k23 <= (anInt923 + 6) / 8; k23++) {
                        anIntArray830[j16] = (j21 << 8) + k23;
                        if (aBoolean1169 && (k23 == 49 || k23 == 149 || k23 == 147 || j21 == 50 || j21 == 49 && k23 == 47)) {
                            anIntArray831[j16] = -1;
                            anIntArray832[j16] = -1;
                            j16++;
                        } else {
                            int k24 = anIntArray831[j16] = aClass43_Sub1_1015.method387(0, j21, false, k23);
                            if (k24 != -1)
                                aClass43_Sub1_1015.method392(3, k24);
                            int l25 = anIntArray832[j16] = aClass43_Sub1_1015.method387(1, j21, false, k23);
                            if (l25 != -1)
                                aClass43_Sub1_1015.method392(3, l25);
                            j16++;
                        }
                    }

                }

                int l23 = anInt1055 - anInt1057;
                int l24 = anInt1056 - anInt1058;
                anInt1057 = anInt1055;
                anInt1058 = anInt1056;
                for (int i26 = 0; i26 < 16384; i26++) {
                    Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1259[i26];
                    if (class44_sub3_sub4_sub6_sub2 != null) {
                        for (int l26 = 0; l26 < 10; l26++) {
                            class44_sub3_sub4_sub6_sub2.anIntArray1649[l26] -= l23;
                            class44_sub3_sub4_sub6_sub2.anIntArray1650[l26] -= l24;
                        }

                        class44_sub3_sub4_sub6_sub2.anInt1599 -= l23 * 128;
                        class44_sub3_sub4_sub6_sub2.anInt1600 -= l24 * 128;
                    }
                }

                for (int k26 = 0; k26 < anInt1118; k26++) {
                    Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1120[k26];
                    if (class44_sub3_sub4_sub6_sub1 != null) {
                        for (int i27 = 0; i27 < 10; i27++) {
                            class44_sub3_sub4_sub6_sub1.anIntArray1649[i27] -= l23;
                            class44_sub3_sub4_sub6_sub1.anIntArray1650[i27] -= l24;
                        }

                        class44_sub3_sub4_sub6_sub1.anInt1599 -= l23 * 128;
                        class44_sub3_sub4_sub6_sub1.anInt1600 -= l24 * 128;
                    }
                }

                aBoolean1249 = true;
                byte byte1 = 0;
                byte byte2 = 104;
                byte byte3 = 1;
                if (l23 < 0) {
                    byte1 = 103;
                    byte2 = -1;
                    byte3 = -1;
                }
                byte byte4 = 0;
                byte byte5 = 104;
                byte byte6 = 1;
                if (l24 < 0) {
                    byte4 = 103;
                    byte5 = -1;
                    byte6 = -1;
                }
                for (int j27 = byte1; j27 != byte2; j27 += byte3) {
                    for (int k27 = byte4; k27 != byte5; k27 += byte6) {
                        int i28 = j27 + l23;
                        int j28 = k27 + l24;
                        for (int k28 = 0; k28 < 4; k28++)
                            if (i28 >= 0 && j28 >= 0 && i28 < 104 && j28 < 104)
                                aClass28ArrayArrayArray816[k28][j27][k27] = aClass28ArrayArrayArray816[k28][i28][j28];
                            else
                                aClass28ArrayArrayArray816[k28][j27][k27] = null;

                    }

                }

                for (Class44_Sub1 class44_sub1_1 = (Class44_Sub1) aClass28_1228.method259(); class44_sub1_1 != null; class44_sub1_1 = (Class44_Sub1) aClass28_1228.method261(aByte958)) {
                    class44_sub1_1.anInt1312 -= l23;
                    class44_sub1_1.anInt1313 -= l24;
                    if (class44_sub1_1.anInt1312 < 0 || class44_sub1_1.anInt1313 < 0 || class44_sub1_1.anInt1312 >= 104 || class44_sub1_1.anInt1313 >= 104)
                        class44_sub1_1.method404();
                }

                if (anInt1025 != 0) {
                    anInt1025 -= l23;
                    anInt1026 -= l24;
                }
                aBoolean1008 = false;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 171) {
                if (anInt1216 != -1) {
                    anInt1216 = -1;
                    aBoolean928 = true;
                    aBoolean841 = true;
                }
                if (anInt1011 != -1) {
                    anInt1011 = -1;
                    aBoolean1109 = true;
                }
                if (aBoolean1104) {
                    aBoolean1104 = false;
                    aBoolean1109 = true;
                }
                anInt1037 = -1;
                aBoolean1168 = false;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 247) {
                long l6 = aClass44_Sub3_Sub2_1135.get8(0);
                int k16 = aClass44_Sub3_Sub2_1135.get1();
                String s6 = Class48.method551(131, Class48.method548(0, l6));
                for (int k21 = 0; k21 < anInt1115; k21++) {
                    if (l6 != aLongArray1159[k21])
                        continue;
                    if (anIntArray1073[k21] != k16) {
                        anIntArray1073[k21] = k16;
                        aBoolean928 = true;
                        if (k16 > 0)
                            method49(-476, 5, "", s6 + " has logged in.");
                        if (k16 == 0)
                            method49(-476, 5, "", s6 + " has logged out.");
                    }
                    s6 = null;
                    break;
                }

                if (s6 != null && anInt1115 < 200) {
                    aLongArray1159[anInt1115] = l6;
                    aStringArray833[anInt1115] = s6;
                    anIntArray1073[anInt1115] = k16;
                    anInt1115++;
                    aBoolean928 = true;
                }
                for (boolean flag4 = false; !flag4; ) {
                    flag4 = true;
                    for (int i25 = 0; i25 < anInt1115 - 1; i25++)
                        if (anIntArray1073[i25] != anInt1237 && anIntArray1073[i25 + 1] == anInt1237 || anIntArray1073[i25] == 0 && anIntArray1073[i25 + 1] != 0) {
                            int j26 = anIntArray1073[i25];
                            anIntArray1073[i25] = anIntArray1073[i25 + 1];
                            anIntArray1073[i25 + 1] = j26;
                            String s8 = aStringArray833[i25];
                            aStringArray833[i25] = aStringArray833[i25 + 1];
                            aStringArray833[i25 + 1] = s8;
                            long l27 = aLongArray1159[i25];
                            aLongArray1159[i25] = aLongArray1159[i25 + 1];
                            aLongArray1159[i25 + 1] = l27;
                            aBoolean928 = true;
                            flag4 = false;
                        }

                }

                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 10) {
                int k6 = aClass44_Sub3_Sub2_1135.get2();
                boolean flag = aClass44_Sub3_Sub2_1135.get1() == 1;
                Class5.aClass5Array103[k6].aBoolean124 = flag;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 105) {
                aBoolean928 = true;
                int i7 = aClass44_Sub3_Sub2_1135.get1();
                int j13 = aClass44_Sub3_Sub2_1135.get4();
                int i17 = aClass44_Sub3_Sub2_1135.get1();
                anIntArray1253[i7] = j13;
                anIntArray884[i7] = i17;
                anIntArray1153[i7] = 1;
                for (int k19 = 0; k19 < 98; k19++)
                    if (j13 >= anIntArray1236[k19])
                        anIntArray1153[i7] = k19 + 2;

                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 23) {
                int j7 = aClass44_Sub3_Sub2_1135.get2();
                if (j7 == 65535)
                    j7 = -1;
                if (j7 != anInt1030 && aBoolean1069 && !aBoolean1240 && anInt927 == 0) {
                    anInt1183 = j7;
                    aBoolean1184 = true;
                    aClass43_Sub1_1015.method392(2, anInt1183);
                }
                anInt1030 = j7;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 15) {
                int k7 = aClass44_Sub3_Sub2_1135.get2();
                int k13 = aClass44_Sub3_Sub2_1135.get2();
                if (aBoolean1069 && !aBoolean1240) {
                    anInt1183 = k7;
                    aBoolean1184 = false;
                    aClass43_Sub1_1015.method392(2, anInt1183);
                    anInt927 = k13;
                }
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 200) {
                aBoolean1008 = true;
                anInt869 = aClass44_Sub3_Sub2_1135.get1();
                anInt870 = aClass44_Sub3_Sub2_1135.get1();
                anInt871 = aClass44_Sub3_Sub2_1135.get2();
                anInt872 = aClass44_Sub3_Sub2_1135.get1();
                anInt873 = aClass44_Sub3_Sub2_1135.get1();
                if (anInt873 >= 100) {
                    anInt820 = anInt869 * 128 + 64;
                    anInt822 = anInt870 * 128 + 64;
                    anInt821 = method50(anInt820, anInt822, 0, anInt1062) - anInt871;
                }
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 172) {
                aBoolean928 = true;
                int l7 = aClass44_Sub3_Sub2_1135.get2();
                Class5 class5 = Class5.aClass5Array103[l7];
                while (aClass44_Sub3_Sub2_1135.anInt1374 < anInt1219) {
                    int j17 = aClass44_Sub3_Sub2_1135.get1();
                    int l19 = aClass44_Sub3_Sub2_1135.get2();
                    int l21 = aClass44_Sub3_Sub2_1135.get1();
                    if (l21 == 255)
                        l21 = aClass44_Sub3_Sub2_1135.get4();
                    if (j17 >= 0 && j17 < class5.anIntArray104.length) {
                        class5.anIntArray104[j17] = l19;
                        class5.anIntArray105[j17] = l21;
                    }
                }
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 17) {
                int i8 = aClass44_Sub3_Sub2_1135.get1();
                int l13 = aClass44_Sub3_Sub2_1135.get1();
                String s5 = aClass44_Sub3_Sub2_1135.getString();
                if (i8 >= 1 && i8 <= 5) {
                    if (s5.equalsIgnoreCase("null"))
                        s5 = null;
                    aStringArray799[i8 - 1] = s5;
                    aBooleanArray800[i8 - 1] = l13 == 0;
                }
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 32) {
                anInt918 = aClass44_Sub3_Sub2_1135.get1();
                anInt919 = aClass44_Sub3_Sub2_1135.get1();
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 106) {
                aBoolean928 = true;
                int j8 = aClass44_Sub3_Sub2_1135.get2();
                Class5 class5_1 = Class5.aClass5Array103[j8];
                int k17 = aClass44_Sub3_Sub2_1135.get1();
                for (int i20 = 0; i20 < k17; i20++) {
                    class5_1.anIntArray104[i20] = aClass44_Sub3_Sub2_1135.get2();
                    int i22 = aClass44_Sub3_Sub2_1135.get1();
                    if (i22 == 255)
                        i22 = aClass44_Sub3_Sub2_1135.get4();
                    class5_1.anIntArray105[i20] = i22;
                }

                for (int j22 = k17; j22 < class5_1.anIntArray104.length; j22++) {
                    class5_1.anIntArray104[j22] = 0;
                    class5_1.anIntArray105[j22] = 0;
                }

                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 133) {
                anInt947 = aClass44_Sub3_Sub2_1135.get2();
                anInt808 = aClass44_Sub3_Sub2_1135.get1();
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 129) {
                int k8 = aClass44_Sub3_Sub2_1135.get2();
                int i14 = aClass44_Sub3_Sub2_1135.get2();
                Class5.aClass5Array103[k8].anInt152 = 1;
                Class5.aClass5Array103[k8].anInt153 = i14;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 233) {
                aBoolean1008 = true;
                anInt909 = aClass44_Sub3_Sub2_1135.get1();
                anInt910 = aClass44_Sub3_Sub2_1135.get1();
                anInt911 = aClass44_Sub3_Sub2_1135.get2();
                anInt912 = aClass44_Sub3_Sub2_1135.get1();
                anInt913 = aClass44_Sub3_Sub2_1135.get1();
                if (anInt913 >= 100) {
                    int l8 = anInt909 * 128 + 64;
                    int j14 = anInt910 * 128 + 64;
                    int l17 = method50(l8, j14, 0, anInt1062) - anInt911;
                    int j20 = l8 - anInt820;
                    int k22 = l17 - anInt821;
                    int i24 = j14 - anInt822;
                    int j25 = (int) Math.sqrt(j20 * j20 + i24 * i24);
                    anInt823 = (int) (Math.atan2(k22, j25) * 325.94900000000001D) & 0x7ff;
                    anInt824 = (int) (Math.atan2(j20, i24) * -325.94900000000001D) & 0x7ff;
                    if (anInt823 < 128)
                        anInt823 = 128;
                    if (anInt823 > 383)
                        anInt823 = 383;
                }
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 227) {
                int i9 = aClass44_Sub3_Sub2_1135.get2();
                Class5 class5_2 = Class5.aClass5Array103[i9];
                for (int i18 = 0; i18 < class5_2.anIntArray104.length; i18++) {
                    class5_2.anIntArray104[i18] = -1;
                    class5_2.anIntArray104[i18] = 0;
                }

                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 77) {
                int j9 = aClass44_Sub3_Sub2_1135.get2();
                int k14 = aClass44_Sub3_Sub2_1135.get2Signed();
                int j18 = aClass44_Sub3_Sub2_1135.get2Signed();
                Class5 class5_5 = Class5.aClass5Array103[j9];
                class5_5.anInt116 = k14;
                class5_5.anInt117 = j18;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 185) {
                anInt1116 = aClass44_Sub3_Sub2_1135.get1();
                aBoolean928 = true;
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 197) {
                method143(0, anInt1219, aClass44_Sub3_Sub2_1135);
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 183) {
                int k9 = aClass44_Sub3_Sub2_1135.get2();
                int l14 = aClass44_Sub3_Sub2_1135.get2();
                int k18 = l14 >> 10 & 0x1f;
                int k20 = l14 >> 5 & 0x1f;
                int l22 = l14 & 0x1f;
                Class5.aClass5Array103[k9].anInt146 = (k18 << 19) + (k20 << 11) + (l22 << 3);
                anInt1220 = -1;
                return true;
            }
            if (anInt1220 == 235) {
                long l9 = aClass44_Sub3_Sub2_1135.get8(0);
                int l18 = aClass44_Sub3_Sub2_1135.get4();
                int l20 = aClass44_Sub3_Sub2_1135.get1();
                boolean flag3 = false;
                for (int j24 = 0; j24 < 100; j24++) {
                    if (anIntArray1068[j24] != l18)
                        continue;
                    flag3 = true;
                    break;
                }

                if (l20 <= 1) {
                    for (int k25 = 0; k25 < anInt961; k25++) {
                        if (aLongArray817[k25] != l9)
                            continue;
                        flag3 = true;
                        break;
                    }

                }
                if (!flag3 && anInt890 == 0)
                    try {
                        anIntArray1068[anInt1186] = l18;
                        anInt1186 = (anInt1186 + 1) % 100;
                        String s7 = Class49.method554((byte) 8, anInt1219 - 13, aClass44_Sub3_Sub2_1135);
                        s7 = Class41.method352((byte) 3, s7);
                        if (l20 == 2 || l20 == 3)
                            method49(-476, 7, "@cr2@" + Class48.method551(131, Class48.method548(0, l9)), s7);
                        else if (l20 == 1)
                            method49(-476, 7, "@cr1@" + Class48.method551(131, Class48.method548(0, l9)), s7);
                        else
                            method49(-476, 3, Class48.method551(131, Class48.method548(0, l9)), s7);
                    } catch (Exception exception1) {
                        signlink.reporterror("cde1");
                    }
                anInt1220 = -1;
                return true;
            }
            signlink.reporterror("T1 - " + anInt1220 + "," + anInt1219 + " - " + anInt1139 + "," + anInt1140);
            method80(false);
        } catch (IOException _ex) {
            method71(0);
        } catch (Exception exception) {
            StringBuilder s1 = new StringBuilder("T2 - " + anInt1220 + "," + anInt1139 + "," + anInt1140 + " - " + anInt1219 + "," + (anInt1055 + aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0]) + "," + (anInt1056 + aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0]) + " - ");
            for (int i15 = 0; i15 < anInt1219 && i15 < 50; i15++)
                s1.append(aClass44_Sub3_Sub2_1135.aByteArray1373[i15]).append(",");

            signlink.reporterror(s1.toString());
            method80(false);
        }
        return true;
    }

    public boolean method113(Class5 class5, int i) {
        if (i != 0)
            throw new NullPointerException();
        int j = class5.anInt112;
        if (anInt1116 == 2) {
            if (j == 201) {
                aBoolean1109 = true;
                aBoolean1104 = false;
                aBoolean1265 = true;
                aString984 = "";
                anInt1051 = 1;
                aString1019 = "Enter name of friend to add to list";
            }
            if (j == 202) {
                aBoolean1109 = true;
                aBoolean1104 = false;
                aBoolean1265 = true;
                aString984 = "";
                anInt1051 = 2;
                aString1019 = "Enter name of friend to delete from list";
            }
        }
        if (j == 205) {
            anInt1223 = 250;
            return true;
        }
        if (j == 501) {
            aBoolean1109 = true;
            aBoolean1104 = false;
            aBoolean1265 = true;
            aString984 = "";
            anInt1051 = 4;
            aString1019 = "Enter name of player to add to list";
        }
        if (j == 502) {
            aBoolean1109 = true;
            aBoolean1104 = false;
            aBoolean1265 = true;
            aString984 = "";
            anInt1051 = 5;
            aString1019 = "Enter name of player to delete from list";
        }
        if (j >= 300 && j <= 313) {
            int k = (j - 300) / 2;
            int j1 = j & 1;
            int i2 = anIntArray810[k];
            if (i2 != -1) {
                do {
                    if (j1 == 0 && --i2 < 0)
                        i2 = Class22.anInt454 - 1;
                    if (j1 == 1 && ++i2 >= Class22.anInt454)
                        i2 = 0;
                } while (Class22.aClass22Array455[i2].aBoolean461 || Class22.aClass22Array455[i2].anInt456 != k + (aBoolean982 ? 0 : 7));
                anIntArray810[k] = i2;
                aBoolean971 = true;
            }
        }
        if (j >= 314 && j <= 323) {
            int l = (j - 314) / 2;
            int k1 = j & 1;
            int j2 = anIntArray1089[l];
            if (k1 == 0 && --j2 < 0)
                j2 = anIntArrayArray1241[l].length - 1;
            if (k1 == 1 && ++j2 >= anIntArrayArray1241[l].length)
                j2 = 0;
            anIntArray1089[l] = j2;
            aBoolean971 = true;
        }
        if (j == 324 && !aBoolean982) {
            aBoolean982 = true;
            method106(814);
        }
        if (j == 325 && aBoolean982) {
            aBoolean982 = false;
            method106(814);
        }
        if (j == 326) {
            aClass44_Sub3_Sub2_843.putOpcode(125);
            aClass44_Sub3_Sub2_843.put1(aBoolean982 ? 0 : 1);
            for (int i1 = 0; i1 < 7; i1++)
                aClass44_Sub3_Sub2_843.put1(anIntArray810[i1]);

            for (int l1 = 0; l1 < 5; l1++)
                aClass44_Sub3_Sub2_843.put1(anIntArray1089[l1]);

            return true;
        }
        if (j == 613)
            aBoolean1128 = !aBoolean1128;
        if (j >= 601 && j <= 612) {
            method45(false);
            if (aString951.length() > 0) {
                aClass44_Sub3_Sub2_843.putOpcode(137);
                aClass44_Sub3_Sub2_843.put8(Class48.method547(aString951), 0);
                aClass44_Sub3_Sub2_843.put1(j - 601);
                aClass44_Sub3_Sub2_843.put1(aBoolean1128 ? 1 : 0);
            }
        }
        return false;
    }

    public void method114(int i) {
        aBoolean906 = false;
        while (aBoolean976) {
            aBoolean906 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception ignored) {
            }
        }
        aClass44_Sub3_Sub1_Sub3_1263 = null;
        aClass44_Sub3_Sub1_Sub3_1264 = null;
        aClass44_Sub3_Sub1_Sub3Array1229 = null;
        anIntArray936 = null;
        anIntArray937 = null;
        anIntArray938 = null;
        anIntArray939 = null;
        anIntArray1111 = null;
        anInt1219 += i;
        anIntArray1112 = null;
        anIntArray977 = null;
        anIntArray978 = null;
        aClass44_Sub3_Sub1_Sub2_891 = null;
        aClass44_Sub3_Sub1_Sub2_892 = null;
    }

    public void method115(int i) {
        anInt1090 = 0;
        for (int j = -1; j < anInt1121 + anInt1260; j++) {
            Class44_Sub3_Sub4_Sub6 obj;
            if (j == -1)
                obj = aClass44_Sub3_Sub4_Sub6_Sub1_1252;
            else if (j < anInt1121)
                obj = aClass44_Sub3_Sub4_Sub6_Sub1Array1120[anIntArray1122[j]];
            else
                obj = aClass44_Sub3_Sub4_Sub6_Sub2Array1259[anIntArray1261[j - anInt1121]];
            if (obj != null && obj.method532(0)) {
                if (j < anInt1121) {
                    int l = 30;
                    Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 = (Class44_Sub3_Sub4_Sub6_Sub1) obj;
                    if (class44_sub3_sub4_sub6_sub1.anInt1660 != 0) {
                        method29(obj, -213, obj.anInt1645 + 15);
                        if (anInt999 > -1) {
                            for (int i2 = 0; i2 < 8; i2++)
                                if ((class44_sub3_sub4_sub6_sub1.anInt1660 & 1 << i2) != 0) {
                                    aClass44_Sub3_Sub1_Sub2Array1001[i2].method440(aByte1070, anInt999 - 12, anInt1000 - l);
                                    l -= 25;
                                }

                        }
                    }
                    if (j >= 0 && anInt1200 == 10 && anInt1181 == anIntArray1122[j]) {
                        method29(obj, -213, obj.anInt1645 + 15);
                        if (anInt999 > -1)
                            aClass44_Sub3_Sub1_Sub2Array1001[7].method440(aByte1070, anInt999 - 12, anInt1000 - l);
                    }
                } else {
                    Class12 class12 = ((Class44_Sub3_Sub4_Sub6_Sub2) obj).aClass12_1682;
                    if (class12.anInt304 >= 0 && class12.anInt304 < aClass44_Sub3_Sub1_Sub2Array1001.length) {
                        method29(obj, -213, obj.anInt1645 + 15);
                        if (anInt999 > -1)
                            aClass44_Sub3_Sub1_Sub2Array1001[class12.anInt304].method440(aByte1070, anInt999 - 12, anInt1000 - 30);
                    }
                    if (anInt1200 == 1 && anInt920 == anIntArray1261[j - anInt1121] && anInt802 % 20 < 10) {
                        method29(obj, -213, obj.anInt1645 + 15);
                        if (anInt999 > -1)
                            aClass44_Sub3_Sub1_Sub2Array1001[2].method440(aByte1070, anInt999 - 12, anInt1000 - 28);
                    }
                }
                if (obj.aString1611 != null && (j >= anInt1121 || anInt967 == 0 || anInt967 == 3 || anInt967 == 1 && method22(-238, ((Class44_Sub3_Sub4_Sub6_Sub1) obj).aString1657))) {
                    method29(obj, -213, obj.anInt1645);
                    if (anInt999 > -1 && anInt1090 < anInt1091) {
                        anIntArray1095[anInt1090] = aClass44_Sub3_Sub1_Sub4_1077.method457(-43341, obj.aString1611) / 2;
                        anIntArray1094[anInt1090] = aClass44_Sub3_Sub1_Sub4_1077.anInt1464;
                        anIntArray1092[anInt1090] = anInt999;
                        anIntArray1093[anInt1090] = anInt1000;
                        anIntArray1096[anInt1090] = obj.anInt1613;
                        anIntArray1097[anInt1090] = obj.anInt1614;
                        anIntArray1098[anInt1090] = obj.anInt1612;
                        aStringArray1099[anInt1090++] = obj.aString1611;
                        if (anInt1061 == 0 && obj.anInt1614 == 1) {
                            anIntArray1094[anInt1090] += 10;
                            anIntArray1093[anInt1090] += 5;
                        }
                        if (anInt1061 == 0 && obj.anInt1614 == 2)
                            anIntArray1095[anInt1090] = 60;
                    }
                }
                if (obj.anInt1618 > anInt802) {
                    method29(obj, -213, obj.anInt1645 + 15);
                    if (anInt999 > -1) {
                        int i1 = (obj.anInt1619 * 30) / obj.anInt1620;
                        if (i1 > 30)
                            i1 = 30;
                        Class44_Sub3_Sub1.method411(5, 65280, i1, anInt999 - 15, 0, anInt1000 - 3);
                        Class44_Sub3_Sub1.method411(5, 0xff0000, 30 - i1, (anInt999 - 15) + i1, 0, anInt1000 - 3);
                    }
                }
                for (int j1 = 0; j1 < 4; j1++)
                    if (obj.anIntArray1617[j1] > anInt802) {
                        method29(obj, -213, obj.anInt1645 / 2);
                        if (anInt999 > -1) {
                            if (j1 == 1)
                                anInt1000 -= 20;
                            if (j1 == 2) {
                                anInt999 -= 15;
                                anInt1000 -= 10;
                            }
                            if (j1 == 3) {
                                anInt999 += 15;
                                anInt1000 -= 10;
                            }
                            aClass44_Sub3_Sub1_Sub2Array935[obj.anIntArray1616[j1]].method440(aByte1070, anInt999 - 12, anInt1000 - 12);
                            aClass44_Sub3_Sub1_Sub4_1075.method455(anInt999, anInt1000 + 4, 0, String.valueOf(obj.anIntArray1615[j1]), false);
                            aClass44_Sub3_Sub1_Sub4_1075.method455(anInt999 - 1, anInt1000 + 3, 0xffffff, String.valueOf(obj.anIntArray1615[j1]), false);
                        }
                    }

            }
        }

        for (int k = 0; k < anInt1090; k++) {
            int k1 = anIntArray1092[k];
            int l1 = anIntArray1093[k];
            int j2 = anIntArray1095[k];
            int k2 = anIntArray1094[k];
            boolean flag = true;
            while (flag) {
                flag = false;
                for (int l2 = 0; l2 < k; l2++)
                    if (l1 + 2 > anIntArray1093[l2] - anIntArray1094[l2] && l1 - k2 < anIntArray1093[l2] + 2 && k1 - j2 < anIntArray1092[l2] + anIntArray1095[l2] && k1 + j2 > anIntArray1092[l2] - anIntArray1095[l2] && anIntArray1093[l2] - anIntArray1094[l2] < l1) {
                        l1 = anIntArray1093[l2] - anIntArray1094[l2];
                        flag = true;
                    }

            }
            anInt999 = anIntArray1092[k];
            anInt1000 = anIntArray1093[k] = l1;
            String s = aStringArray1099[k];
            if (anInt1061 == 0) {
                int i3 = 0xffff00;
                if (anIntArray1096[k] < 6)
                    i3 = anIntArray985[anIntArray1096[k]];
                if (anIntArray1096[k] == 6)
                    i3 = anInt868 % 20 >= 10 ? 0xffff00 : 0xff0000;
                if (anIntArray1096[k] == 7)
                    i3 = anInt868 % 20 >= 10 ? 65535 : 255;
                if (anIntArray1096[k] == 8)
                    i3 = anInt868 % 20 >= 10 ? 0x80ff80 : 45056;
                if (anIntArray1096[k] == 9) {
                    int j3 = 150 - anIntArray1098[k];
                    if (j3 < 50)
                        i3 = 0xff0000 + 1280 * j3;
                    else if (j3 < 100)
                        i3 = 0xffff00 - 0x50000 * (j3 - 50);
                    else if (j3 < 150)
                        i3 = 65280 + 5 * (j3 - 100);
                }
                if (anIntArray1096[k] == 10) {
                    int k3 = 150 - anIntArray1098[k];
                    if (k3 < 50)
                        i3 = 0xff0000 + 5 * k3;
                    else if (k3 < 100)
                        i3 = 0xff00ff - 0x50000 * (k3 - 50);
                    else if (k3 < 150)
                        i3 = (255 + 0x50000 * (k3 - 100)) - 5 * (k3 - 100);
                }
                if (anIntArray1096[k] == 11) {
                    int l3 = 150 - anIntArray1098[k];
                    if (l3 < 50)
                        i3 = 0xffffff - 0x50005 * l3;
                    else if (l3 < 100)
                        i3 = 65280 + 0x50005 * (l3 - 50);
                    else if (l3 < 150)
                        i3 = 0xffffff - 0x50000 * (l3 - 100);
                }
                if (anIntArray1097[k] == 0) {
                    aClass44_Sub3_Sub1_Sub4_1077.method455(anInt999, anInt1000 + 1, 0, s, false);
                    aClass44_Sub3_Sub1_Sub4_1077.method455(anInt999, anInt1000, i3, s, false);
                }
                if (anIntArray1097[k] == 1) {
                    aClass44_Sub3_Sub1_Sub4_1077.method459(s, anInt1000 + 1, anInt999, 0, 6, anInt868);
                    aClass44_Sub3_Sub1_Sub4_1077.method459(s, anInt1000, anInt999, i3, 6, anInt868);
                }
                if (anIntArray1097[k] == 2) {
                    int i4 = aClass44_Sub3_Sub1_Sub4_1077.method457(-43341, s);
                    int j4 = ((150 - anIntArray1098[k]) * (i4 + 100)) / 150;
                    Class44_Sub3_Sub1.method408(5, 334, anInt999 + 50, anInt999 - 50, 0);
                    aClass44_Sub3_Sub1_Sub4_1077.method458((anInt999 + 50) - j4, s, 0, anInt1000 + 1, true);
                    aClass44_Sub3_Sub1_Sub4_1077.method458((anInt999 + 50) - j4, s, i3, anInt1000, true);
                    Class44_Sub3_Sub1.method407(true);
                }
            } else {
                aClass44_Sub3_Sub1_Sub4_1077.method455(anInt999, anInt1000 + 1, 0, s, false);
                aClass44_Sub3_Sub1_Sub4_1077.method455(anInt999, anInt1000, 0xffff00, s, false);
            }
        }

        if (i == 0) ;
    }

    public void method116(int i) {
        int j = anInt869 * 128 + 64;
        int k = anInt870 * 128 + 64;
        int l = method50(j, k, 0, anInt1062) - anInt871;
        if (anInt820 < j) {
            anInt820 += anInt872 + ((j - anInt820) * anInt873) / 1000;
            if (anInt820 > j)
                anInt820 = j;
        }
        if (anInt820 > j) {
            anInt820 -= anInt872 + ((anInt820 - j) * anInt873) / 1000;
            if (anInt820 < j)
                anInt820 = j;
        }
        if (anInt821 < l) {
            anInt821 += anInt872 + ((l - anInt821) * anInt873) / 1000;
            if (anInt821 > l)
                anInt821 = l;
        }
        if (anInt821 > l) {
            anInt821 -= anInt872 + ((anInt821 - l) * anInt873) / 1000;
            if (anInt821 < l)
                anInt821 = l;
        }
        if (anInt822 < k) {
            anInt822 += anInt872 + ((k - anInt822) * anInt873) / 1000;
            if (anInt822 > k)
                anInt822 = k;
        }
        if (anInt822 > k) {
            anInt822 -= anInt872 + ((anInt822 - k) * anInt873) / 1000;
            if (anInt822 < k)
                anInt822 = k;
        }
        j = anInt909 * 128 + 64;
        k = anInt910 * 128 + 64;
        while (i >= 0)
            aClass44_Sub3_Sub2_843.put1(31);
        l = method50(j, k, 0, anInt1062) - anInt911;
        int i1 = j - anInt820;
        int j1 = l - anInt821;
        int k1 = k - anInt822;
        int l1 = (int) Math.sqrt(i1 * i1 + k1 * k1);
        int i2 = (int) (Math.atan2(j1, l1) * 325.94900000000001D) & 0x7ff;
        int j2 = (int) (Math.atan2(i1, k1) * -325.94900000000001D) & 0x7ff;
        if (i2 < 128)
            i2 = 128;
        if (i2 > 383)
            i2 = 383;
        if (anInt823 < i2) {
            anInt823 += anInt912 + ((i2 - anInt823) * anInt913) / 1000;
            if (anInt823 > i2)
                anInt823 = i2;
        }
        if (anInt823 > i2) {
            anInt823 -= anInt912 + ((anInt823 - i2) * anInt913) / 1000;
            if (anInt823 < i2)
                anInt823 = i2;
        }
        int k2 = j2 - anInt824;
        if (k2 > 1024)
            k2 -= 2048;
        if (k2 < -1024)
            k2 += 2048;
        if (k2 > 0) {
            anInt824 += anInt912 + (k2 * anInt913) / 1000;
            anInt824 &= 0x7ff;
        }
        if (k2 < 0) {
            anInt824 -= anInt912 + (-k2 * anInt913) / 1000;
            anInt824 &= 0x7ff;
        }
        int l2 = j2 - anInt824;
        if (l2 > 1024)
            l2 -= 2048;
        if (l2 < -1024)
            l2 += 2048;
        if (l2 < 0 && k2 > 0 || l2 > 0 && k2 < 0)
            anInt824 = j2;
    }

    public void method117(int i) {
        for (int j = -1; j < anInt1121; j++) {
            int k;
            if (j == -1)
                k = anInt1119;
            else
                k = anIntArray1122[j];
            Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1120[k];
            if (class44_sub3_sub4_sub6_sub1 != null && class44_sub3_sub4_sub6_sub1.anInt1612 > 0) {
                class44_sub3_sub4_sub6_sub1.anInt1612--;
                if (class44_sub3_sub4_sub6_sub1.anInt1612 == 0)
                    class44_sub3_sub4_sub6_sub1.aString1611 = null;
            }
        }

        for (int l = 0; l < anInt1260; l++) {
            int i1 = anIntArray1261[l];
            Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1259[i1];
            if (class44_sub3_sub4_sub6_sub2 != null && class44_sub3_sub4_sub6_sub2.anInt1612 > 0) {
                class44_sub3_sub4_sub6_sub2.anInt1612--;
                if (class44_sub3_sub4_sub6_sub2.anInt1612 == 0)
                    class44_sub3_sub4_sub6_sub2.aString1611 = null;
            }
        }

        if (i != 46415)
            anInt845 = -145;
    }

    public void method118(boolean flag) {
        System.out.println("============");
        System.out.println("flame-cycle:" + anInt966);
        if (!flag)
            method6();
        if (aClass43_Sub1_1015 != null)
            System.out.println("Od-cycle:" + aClass43_Sub1_1015.anInt1309);
        System.out.println("loop-cycle:" + anInt802);
        System.out.println("draw-cycle:" + anInt842);
        System.out.println("ptype:" + anInt1220);
        System.out.println("psize:" + anInt1219);
        if (aClass7_1108 != null)
            aClass7_1108.method196(true);
        super.aBoolean11 = true;
    }

    public Component method11(byte byte0) {
        if (byte0 == 7)
            byte0 = 0;
        else
            anInt907 = -291;
        if (signlink.mainapp != null)
            return signlink.mainapp;
        if (super.aFrame_Sub1_17 != null)
            return super.aFrame_Sub1_17;
        else
            return this;
    }

    public void method119(Class44_Sub3_Sub2 class44_sub3_sub2, int i, byte byte0) {
        class44_sub3_sub2.accessBits((byte) 4);
        int j = class44_sub3_sub2.getBit(1, (byte) -96);
        if (byte0 != -85)
            anInt1220 = -1;
        if (j == 0)
            return;
        int k = class44_sub3_sub2.getBit(2, (byte) -96);
        if (k == 0) {
            anIntArray1124[anInt1123++] = anInt1119;
            return;
        }
        if (k == 1) {
            int l = class44_sub3_sub2.getBit(3, (byte) -96);
            aClass44_Sub3_Sub4_Sub6_Sub1_1252.method530(true, l, false);
            int k1 = class44_sub3_sub2.getBit(1, (byte) -96);
            if (k1 == 1)
                anIntArray1124[anInt1123++] = anInt1119;
            return;
        }
        if (k == 2) {
            int i1 = class44_sub3_sub2.getBit(3, (byte) -96);
            aClass44_Sub3_Sub4_Sub6_Sub1_1252.method530(true, i1, true);
            int l1 = class44_sub3_sub2.getBit(3, (byte) -96);
            aClass44_Sub3_Sub4_Sub6_Sub1_1252.method530(true, l1, true);
            int j2 = class44_sub3_sub2.getBit(1, (byte) -96);
            if (j2 == 1)
                anIntArray1124[anInt1123++] = anInt1119;
            return;
        }
        if (k == 3) {
            anInt1062 = class44_sub3_sub2.getBit(2, (byte) -96);
            int j1 = class44_sub3_sub2.getBit(7, (byte) -96);
            int i2 = class44_sub3_sub2.getBit(7, (byte) -96);
            int k2 = class44_sub3_sub2.getBit(1, (byte) -96);
            aClass44_Sub3_Sub4_Sub6_Sub1_1252.method529(j1, k2 == 1, false, i2);
            int l2 = class44_sub3_sub2.getBit(1, (byte) -96);
            if (l2 == 1)
                anIntArray1124[anInt1123++] = anInt1119;
        }
    }

    public int method120(int i) {
        while (i >= 0)
            return anInt1033;
        int j = 3;
        if (anInt823 < 310) {
            int k = anInt820 >> 7;
            int l = anInt822 >> 7;
            int i1 = aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 >> 7;
            int j1 = aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 >> 7;
            if ((aByteArrayArrayArray827[anInt1062][k][l] & 4) != 0)
                j = anInt1062;
            int k1;
            if (i1 > k)
                k1 = i1 - k;
            else
                k1 = k - i1;
            int l1;
            if (j1 > l)
                l1 = j1 - l;
            else
                l1 = l - j1;
            if (k1 > l1) {
                int i2 = (l1 * 0x10000) / k1;
                int k2 = 32768;
                while (k != i1) {
                    if (k < i1)
                        k++;
                    else if (k > i1)
                        k--;
                    if ((aByteArrayArrayArray827[anInt1062][k][l] & 4) != 0)
                        j = anInt1062;
                    k2 += i2;
                    if (k2 >= 0x10000) {
                        k2 -= 0x10000;
                        if (l < j1)
                            l++;
                        else if (l > j1)
                            l--;
                        if ((aByteArrayArrayArray827[anInt1062][k][l] & 4) != 0)
                            j = anInt1062;
                    }
                }
            } else {
                int j2 = (k1 * 0x10000) / l1;
                int l2 = 32768;
                while (l != j1) {
                    if (l < j1)
                        l++;
                    else if (l > j1)
                        l--;
                    if ((aByteArrayArrayArray827[anInt1062][k][l] & 4) != 0)
                        j = anInt1062;
                    l2 += j2;
                    if (l2 >= 0x10000) {
                        l2 -= 0x10000;
                        if (k < i1)
                            k++;
                        else if (k > i1)
                            k--;
                        if ((aByteArrayArrayArray827[anInt1062][k][l] & 4) != 0)
                            j = anInt1062;
                    }
                }
            }
        }
        if ((aByteArrayArrayArray827[anInt1062][aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 >> 7][aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 >> 7] & 4) != 0)
            j = anInt1062;
        return j;
    }

    public int method121(int i) {
        int j = method50(anInt820, anInt822, 0, anInt1062);
        anInt1219 += i;
        if (j - anInt821 < 800 && (aByteArrayArrayArray827[anInt1062][anInt820 >> 7][anInt822 >> 7] & 4) != 0)
            return anInt1062;
        else
            return 3;
    }

    public void method122(int i) {
        if (anInt803 > 1)
            anInt803--;
        if (anInt1223 > 0)
            anInt1223--;
        for (int j = 0; j < 5; j++)
            if (!method112(0))
                break;

        if (!aBoolean905)
            return;
        synchronized (aClass10_1160.anObject260) {
            if (aBoolean1167) {
                if (super.anInt28 != 0 || aClass10_1160.anInt261 >= 40) {
                    aClass44_Sub3_Sub2_843.putOpcode(222);
                    aClass44_Sub3_Sub2_843.put1(0);
                    int j2 = aClass44_Sub3_Sub2_843.anInt1374;
                    int j3 = 0;
                    for (int j4 = 0; j4 < aClass10_1160.anInt261; j4++) {
                        if (j2 - aClass44_Sub3_Sub2_843.anInt1374 >= 240)
                            break;
                        j3++;
                        int l4 = aClass10_1160.anIntArray263[j4];
                        if (l4 < 0)
                            l4 = 0;
                        else if (l4 > 502)
                            l4 = 502;
                        int k5 = aClass10_1160.anIntArray262[j4];
                        if (k5 < 0)
                            k5 = 0;
                        else if (k5 > 764)
                            k5 = 764;
                        int i6 = l4 * 765 + k5;
                        if (aClass10_1160.anIntArray263[j4] == -1 && aClass10_1160.anIntArray262[j4] == -1) {
                            k5 = -1;
                            l4 = -1;
                            i6 = 0x7ffff;
                        }
                        if (k5 == anInt1233 && l4 == anInt1234) {
                            if (anInt983 < 2047)
                                anInt983++;
                        } else {
                            int j6 = k5 - anInt1233;
                            anInt1233 = k5;
                            int k6 = l4 - anInt1234;
                            anInt1234 = l4;
                            if (anInt983 < 8 && j6 >= -32 && j6 <= 31 && k6 >= -32 && k6 <= 31) {
                                j6 += 32;
                                k6 += 32;
                                aClass44_Sub3_Sub2_843.put2((anInt983 << 12) + (j6 << 6) + k6);
                                anInt983 = 0;
                            } else if (anInt983 < 8) {
                                aClass44_Sub3_Sub2_843.put3(0x800000 + (anInt983 << 19) + i6);
                                anInt983 = 0;
                            } else {
                                aClass44_Sub3_Sub2_843.put4(0xc0000000 + (anInt983 << 19) + i6);
                                anInt983 = 0;
                            }
                        }
                    }

                    aClass44_Sub3_Sub2_843.putSize(aClass44_Sub3_Sub2_843.anInt1374 - j2, anInt797);
                    if (j3 >= aClass10_1160.anInt261) {
                        aClass10_1160.anInt261 = 0;
                    } else {
                        aClass10_1160.anInt261 -= j3;
                        for (int i5 = 0; i5 < aClass10_1160.anInt261; i5++) {
                            aClass10_1160.anIntArray262[i5] = aClass10_1160.anIntArray262[i5 + j3];
                            aClass10_1160.anIntArray263[i5] = aClass10_1160.anIntArray263[i5 + j3];
                        }

                    }
                }
            } else {
                aClass10_1160.anInt261 = 0;
            }
        }
        if (super.anInt28 != 0) {
            long l = (super.aLong31 - aLong1230) / 50L;
            if (l > 4095L)
                l = 4095L;
            aLong1230 = super.aLong31;
            int k2 = super.anInt30;
            if (k2 < 0)
                k2 = 0;
            else if (k2 > 502)
                k2 = 502;
            int k3 = super.anInt29;
            if (k3 < 0)
                k3 = 0;
            else if (k3 > 764)
                k3 = 764;
            int k4 = k2 * 765 + k3;
            int j5 = 0;
            if (super.anInt28 == 2)
                j5 = 1;
            int l5 = (int) l;
            aClass44_Sub3_Sub2_843.putOpcode(20);
            aClass44_Sub3_Sub2_843.put4((l5 << 20) + (j5 << 19) + k4);
        }
        if (anInt1023 > 0)
            anInt1023--;
        if (super.anIntArray32[1] == 1 || super.anIntArray32[2] == 1 || super.anIntArray32[3] == 1 || super.anIntArray32[4] == 1)
            aBoolean1024 = true;
        if (aBoolean1024 && anInt1023 <= 0) {
            anInt1023 = 20;
            aBoolean1024 = false;
            aClass44_Sub3_Sub2_843.putOpcode(53);
            aClass44_Sub3_Sub2_843.put2(anInt1205);
            aClass44_Sub3_Sub2_843.put2(anInt1206);
        }
        if (super.aBoolean19 && !aBoolean945) {
            aBoolean945 = true;
            aClass44_Sub3_Sub2_843.putOpcode(73);
            aClass44_Sub3_Sub2_843.put1(1);
        }
        if (!super.aBoolean19 && aBoolean945) {
            aBoolean945 = false;
            aClass44_Sub3_Sub2_843.putOpcode(73);
            aClass44_Sub3_Sub2_843.put1(0);
        }
        method42(503);
        method144(42825);
        method27(0);
        anInt1221++;
        if (anInt1221 > 750)
            method71(0);
        method104(true);
        method135((byte) -34);
        method117(46415);
        anInt975++;
        if (anInt1145 != 0) {
            anInt1144 += 20;
            if (anInt1144 >= 400)
                anInt1145 = 0;
        }
        if (anInt850 != 0) {
            anInt847++;
            if (anInt847 >= 15) {
                if (anInt850 == 2)
                    aBoolean928 = true;
                if (anInt850 == 3)
                    aBoolean1109 = true;
                anInt850 = 0;
            }
        }
        if (anInt895 != 0) {
            anInt1250++;
            if (super.anInt22 > anInt896 + 5 || super.anInt22 < anInt896 - 5 || super.anInt23 > anInt897 + 5 || super.anInt23 < anInt897 - 5)
                aBoolean1146 = true;
            if (super.anInt21 == 0) {
                if (anInt895 == 2)
                    aBoolean928 = true;
                if (anInt895 == 3)
                    aBoolean1109 = true;
                anInt895 = 0;
                if (aBoolean1146 && anInt1250 >= 5) {
                    anInt963 = -1;
                    method68(4);
                    if (anInt963 == anInt893 && anInt962 != anInt894) {
                        Class5 class5 = Class5.aClass5Array103[anInt893];
                        int j1 = 0;
                        if (anInt882 == 1 && class5.anInt112 == 206)
                            j1 = 1;
                        if (class5.anIntArray104[anInt962] <= 0)
                            j1 = 0;
                        if (class5.aBoolean133) {
                            int l2 = anInt894;
                            int l3 = anInt962;
                            class5.anIntArray104[l3] = class5.anIntArray104[l2];
                            class5.anIntArray105[l3] = class5.anIntArray105[l2];
                            class5.anIntArray104[l2] = -1;
                            class5.anIntArray105[l2] = 0;
                        } else if (j1 == 1) {
                            int i3 = anInt894;
                            for (int i4 = anInt962; i3 != i4; )
                                if (i3 > i4) {
                                    class5.method182(i3, i3 - 1, 865);
                                    i3--;
                                } else if (i3 < i4) {
                                    class5.method182(i3, i3 + 1, 865);
                                    i3++;
                                }

                        } else {
                            class5.method182(anInt894, anInt962, 865);
                        }
                        aClass44_Sub3_Sub2_843.putOpcode(93);
                        aClass44_Sub3_Sub2_843.put2(anInt893);
                        aClass44_Sub3_Sub2_843.put2(anInt894);
                        aClass44_Sub3_Sub2_843.put2(anInt962);
                        aClass44_Sub3_Sub2_843.put1(j1);
                    }
                } else if ((anInt1049 == 1 || method65(anInt980 - 1, (byte) 9)) && anInt980 > 2)
                    method95(0);
                else if (anInt980 > 0)
                    method60((byte) 6, anInt980 - 1);
                anInt847 = 10;
                super.anInt28 = 0;
            }
        }
        anInt1227++;
        if (anInt1227 > 62) {
            anInt1227 = 0;
            aClass44_Sub3_Sub2_843.putOpcode(89);
        }
        if (Class36.anInt627 != -1) {
            int k = Class36.anInt627;
            int k1 = Class36.anInt628;
            boolean flag = method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], k, 0, 0, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, true, 0, k1, (byte) 9, 0);
            Class36.anInt627 = -1;
            if (flag) {
                anInt1142 = super.anInt29;
                anInt1143 = super.anInt30;
                anInt1145 = 1;
                anInt1144 = 0;
            }
        }
        if (super.anInt28 == 1 && aString829 != null) {
            aString829 = null;
            aBoolean1109 = true;
            super.anInt28 = 0;
        }
        method21((byte) 1);
        method130(-48671);
        method58(25675);
        method38(aBoolean1002);
        if (super.anInt21 == 1 || super.anInt28 == 1)
            anInt993++;
        if (anInt1129 == 2)
            method129(true);
        if (anInt1129 == 2 && aBoolean1008)
            method116(-630);
        for (int i1 = 0; i1 < 5; i1++)
            anIntArray968[i1]++;

        method131((byte) -39);
        super.anInt20++;
        if (super.anInt20 > 4500) {
            anInt1223 = 250;
            super.anInt20 -= 500;
            aClass44_Sub3_Sub2_843.putOpcode(209);
        }
        anInt837++;
        if (i != 5)
            anInt1220 = aClass44_Sub3_Sub2_1135.get1();
        if (anInt837 > 500) {
            anInt837 = 0;
            int l1 = (int) (Math.random() * 8D);
            if ((l1 & 1) == 1)
                anInt1246 += anInt1247;
            if ((l1 & 2) == 2)
                anInt834 += anInt835;
            if ((l1 & 4) == 4)
                anInt888 += anInt889;
        }
        if (anInt1246 < -50)
            anInt1247 = 2;
        if (anInt1246 > 50)
            anInt1247 = -2;
        if (anInt834 < -55)
            anInt835 = 2;
        if (anInt834 > 55)
            anInt835 = -2;
        if (anInt888 < -40)
            anInt889 = 1;
        if (anInt888 > 40)
            anInt889 = -1;
        anInt916++;
        if (anInt916 > 500) {
            anInt916 = 0;
            int i2 = (int) (Math.random() * 8D);
            if ((i2 & 1) == 1)
                anInt1217 += anInt1218;
            if ((i2 & 2) == 2)
                anInt1170 += anInt1171;
        }
        if (anInt1217 < -60)
            anInt1218 = 2;
        if (anInt1217 > 60)
            anInt1218 = -2;
        if (anInt1170 < -20)
            anInt1171 = 1;
        if (anInt1170 > 10)
            anInt1171 = -1;
        anInt1222++;
        if (anInt1222 > 50)
            aClass44_Sub3_Sub2_843.putOpcode(120);
        try {
            if (aClass7_1108 != null && aClass44_Sub3_Sub2_843.anInt1374 > 0) {
                aClass7_1108.method195(aClass44_Sub3_Sub2_843.anInt1374, -2584, aClass44_Sub3_Sub2_843.aByteArray1373, 0);
                aClass44_Sub3_Sub2_843.anInt1374 = 0;
                anInt1222 = 0;
            }
        } catch (IOException _ex) {
            method71(0);
        } catch (Exception exception) {
            method80(false);
        }
    }

    public void method123(boolean flag, long l) {
        try {
            if (flag)
                anInt1220 = aClass44_Sub3_Sub2_1135.get1();
            if (l == 0L)
                return;
            for (int i = 0; i < anInt961; i++)
                if (aLongArray817[i] == l) {
                    anInt961--;
                    aBoolean928 = true;
                    if (anInt961 - i >= 0) System.arraycopy(aLongArray817, i + 1, aLongArray817, i, anInt961 - i);

                    aClass44_Sub3_Sub2_843.putOpcode(101);
                    aClass44_Sub3_Sub2_843.put8(l, 0);
                    return;
                }

            return;
        } catch (RuntimeException runtimeexception) {
            signlink.reporterror("59118, " + flag + ", " + l + ", " + runtimeexception);
        }
        throw new RuntimeException();
    }

    public int method124(int i, int j, int k, int l) {
        if (k <= 0)
            method6();
        int i1 = 256 - j;
        return ((i & 0xff00ff) * i1 + (l & 0xff00ff) * j & 0xff00ff00) + ((i & 0xff00) * i1 + (l & 0xff00) * j & 0xff0000) >> 8;
    }

    public void method125(int i) {
        Class8.aClass39_252.method341();
        Class8.aClass39_253.method341();
        if (i >= 0)
            aBoolean956 = !aBoolean956;
        Class12.aClass39_306.method341();
        Class14.aClass39_364.method341();
        Class14.aClass39_365.method341();
        Class44_Sub3_Sub4_Sub6_Sub1.aClass39_1680.method341();
        Class32.aClass39_559.method341();
    }

    public void method126(int i) {
        if (i != 6905)
            anInt1133 = aClass46_944.method542();
        if (anInt1200 != 2)
            return;
        method30(361, (anInt1162 - anInt1055 << 7) + anInt1165, (anInt1163 - anInt1056 << 7) + anInt1166, anInt1164 * 2);
        if (anInt999 > -1 && anInt802 % 20 < 10)
            aClass44_Sub3_Sub1_Sub2Array1001[2].method440(aByte1070, anInt999 - 12, anInt1000 - 28);
    }

    public void method127(int i, Class5 class5, int j, int k, byte byte0) {
        if (class5.anInt110 != 0 || class5.anIntArray125 == null)
            return;
        if (class5.aBoolean124 && anInt1248 != class5.anInt108 && anInt1016 != class5.anInt108 && anInt1066 != class5.anInt108)
            return;
        int l = Class44_Sub3_Sub1.anInt1356;
        int i1 = Class44_Sub3_Sub1.anInt1354;
        int j1 = Class44_Sub3_Sub1.anInt1357;
        int k1 = Class44_Sub3_Sub1.anInt1355;
        Class44_Sub3_Sub1.method408(5, j + class5.anInt114, i + class5.anInt113, i, j);
        int l1 = class5.anIntArray125.length;
        for (int i2 = 0; i2 < l1; i2++) {
            int j2 = class5.anIntArray126[i2] + i;
            int k2 = (class5.anIntArray127[i2] + j) - k;
            Class5 class5_1 = Class5.aClass5Array103[class5.anIntArray125[i2]];
            j2 += class5_1.anInt116;
            k2 += class5_1.anInt117;
            if (class5_1.anInt112 > 0)
                method35((byte) -123, class5_1);
            if (class5_1.anInt110 == 0) {
                if (class5_1.anInt123 > class5_1.anInt122 - class5_1.anInt114)
                    class5_1.anInt123 = class5_1.anInt122 - class5_1.anInt114;
                if (class5_1.anInt123 < 0)
                    class5_1.anInt123 = 0;
                method127(j2, class5_1, k2, class5_1.anInt123, (byte) 0);
                if (class5_1.anInt122 > class5_1.anInt114)
                    method56(class5_1.anInt123, k2, class5_1.anInt122, (byte) 123, j2 + class5_1.anInt113, class5_1.anInt114);
            } else if (class5_1.anInt110 != 1)
                if (class5_1.anInt110 == 2) {
                    int l2 = 0;
                    for (int k3 = 0; k3 < class5_1.anInt114; k3++) {
                        for (int k4 = 0; k4 < class5_1.anInt113; k4++) {
                            int j5 = j2 + k4 * (32 + class5_1.anInt134);
                            int i6 = k2 + k3 * (32 + class5_1.anInt135);
                            if (l2 < 20) {
                                j5 += class5_1.anIntArray137[l2];
                                i6 += class5_1.anIntArray138[l2];
                            }
                            if (class5_1.anIntArray104[l2] > 0) {
                                int j6 = 0;
                                int i7 = 0;
                                int i9 = class5_1.anIntArray104[l2] - 1;
                                if (j5 > Class44_Sub3_Sub1.anInt1356 - 32 && j5 < Class44_Sub3_Sub1.anInt1357 && i6 > Class44_Sub3_Sub1.anInt1354 - 32 && i6 < Class44_Sub3_Sub1.anInt1355 || anInt895 != 0 && anInt894 == l2) {
                                    int k9 = 0;
                                    if (anInt811 == 1 && anInt812 == l2 && anInt813 == class5_1.anInt108)
                                        k9 = 0xffffff;
                                    Class44_Sub3_Sub1_Sub2 class44_sub3_sub1_sub2_2 = Class14.method226(i9, k9, 45926, class5_1.anIntArray105[l2]);
                                    if (class44_sub3_sub1_sub2_2 != null) {
                                        if (anInt895 != 0 && anInt894 == l2 && anInt893 == class5_1.anInt108) {
                                            j6 = super.anInt22 - anInt896;
                                            i7 = super.anInt23 - anInt897;
                                            if (j6 < 5 && j6 > -5)
                                                j6 = 0;
                                            if (i7 < 5 && i7 > -5)
                                                i7 = 0;
                                            if (anInt1250 < 5) {
                                                j6 = 0;
                                                i7 = 0;
                                            }
                                            class44_sub3_sub1_sub2_2.method442(i6 + i7, j5 + j6, -676, 128);
                                            if (i6 + i7 < Class44_Sub3_Sub1.anInt1354 && class5.anInt123 > 0) {
                                                int l9 = (anInt975 * (Class44_Sub3_Sub1.anInt1354 - i6 - i7)) / 3;
                                                if (l9 > anInt975 * 10)
                                                    l9 = anInt975 * 10;
                                                if (l9 > class5.anInt123)
                                                    l9 = class5.anInt123;
                                                class5.anInt123 -= l9;
                                                anInt897 += l9;
                                            }
                                            if (i6 + i7 + 32 > Class44_Sub3_Sub1.anInt1355 && class5.anInt123 < class5.anInt122 - class5.anInt114) {
                                                int i10 = (anInt975 * ((i6 + i7 + 32) - Class44_Sub3_Sub1.anInt1355)) / 3;
                                                if (i10 > anInt975 * 10)
                                                    i10 = anInt975 * 10;
                                                if (i10 > class5.anInt122 - class5.anInt114 - class5.anInt123)
                                                    i10 = class5.anInt122 - class5.anInt114 - class5.anInt123;
                                                class5.anInt123 += i10;
                                                anInt897 -= i10;
                                            }
                                        } else if (anInt850 != 0 && anInt849 == l2 && anInt848 == class5_1.anInt108)
                                            class44_sub3_sub1_sub2_2.method442(i6, j5, -676, 128);
                                        else
                                            class44_sub3_sub1_sub2_2.method440(aByte1070, j5, i6);
                                        if (class44_sub3_sub1_sub2_2.anInt1436 == 33 || class5_1.anIntArray105[l2] != 1) {
                                            int j10 = class5_1.anIntArray105[l2];
                                            aClass44_Sub3_Sub1_Sub4_1075.method458(j5 + 1 + j6, method110(5, j10), 0, i6 + 10 + i7, true);
                                            aClass44_Sub3_Sub1_Sub4_1075.method458(j5 + j6, method110(5, j10), 0xffff00, i6 + 9 + i7, true);
                                        }
                                    }
                                }
                            } else if (class5_1.aClass44_Sub3_Sub1_Sub2Array136 != null && l2 < 20) {
                                Class44_Sub3_Sub1_Sub2 class44_sub3_sub1_sub2_1 = class5_1.aClass44_Sub3_Sub1_Sub2Array136[l2];
                                if (class44_sub3_sub1_sub2_1 != null)
                                    class44_sub3_sub1_sub2_1.method440(aByte1070, j5, i6);
                            }
                            l2++;
                        }

                    }

                } else if (class5_1.anInt110 == 3) {
                    boolean flag = anInt1066 == class5_1.anInt108 || anInt1016 == class5_1.anInt108 || anInt1248 == class5_1.anInt108;
                    int i3;
                    if (method134(class5_1, 717)) {
                        i3 = class5_1.anInt147;
                        if (flag && class5_1.anInt149 != 0)
                            i3 = class5_1.anInt149;
                    } else {
                        i3 = class5_1.anInt146;
                        if (flag && class5_1.anInt148 != 0)
                            i3 = class5_1.anInt148;
                    }
                    if (class5_1.aByte115 == 0) {
                        if (class5_1.aBoolean140)
                            Class44_Sub3_Sub1.method411(class5_1.anInt114, i3, class5_1.anInt113, j2, 0, k2);
                        else
                            Class44_Sub3_Sub1.method412(class5_1.anInt113, i3, class5_1.anInt114, j2, k2, 394);
                    } else if (class5_1.aBoolean140)
                        Class44_Sub3_Sub1.method410(class5_1.anInt113, class5_1.anInt114, k2, i3, j2, 0, 256 - (class5_1.aByte115 & 0xff));
                    else
                        Class44_Sub3_Sub1.method413(class5_1.anInt113, true, k2, j2, i3, class5_1.anInt114, 256 - (class5_1.aByte115 & 0xff));
                } else if (class5_1.anInt110 == 4) {
                    Class44_Sub3_Sub1_Sub4 class44_sub3_sub1_sub4 = class5_1.aClass44_Sub3_Sub1_Sub4_143;
                    String s = class5_1.aString144;
                    boolean flag1 = anInt1066 == class5_1.anInt108 || anInt1016 == class5_1.anInt108 || anInt1248 == class5_1.anInt108;
                    int l3;
                    if (method134(class5_1, 717)) {
                        l3 = class5_1.anInt147;
                        if (flag1 && class5_1.anInt149 != 0)
                            l3 = class5_1.anInt149;
                        if (class5_1.aString145.length() > 0)
                            s = class5_1.aString145;
                    } else {
                        l3 = class5_1.anInt146;
                        if (flag1 && class5_1.anInt148 != 0)
                            l3 = class5_1.anInt148;
                    }
                    if (class5_1.anInt111 == 6 && aBoolean1168) {
                        s = "Please wait...";
                        l3 = class5_1.anInt146;
                    }
                    if (Class44_Sub3_Sub1.anInt1352 == 479) {
                        if (l3 == 0xffff00)
                            l3 = 255;
                        if (l3 == 49152)
                            l3 = 0xffffff;
                    }
                    for (int k6 = k2 + class44_sub3_sub1_sub4.anInt1464; s.length() > 0; k6 += class44_sub3_sub1_sub4.anInt1464) {
                        if (s.contains("%")) {
                            do {
                                int j7 = s.indexOf("%1");
                                if (j7 == -1)
                                    break;
                                s = s.substring(0, j7) + method26(aByte1117, method34(true, class5_1, 0)) + s.substring(j7 + 2);
                            } while (true);
                            do {
                                int k7 = s.indexOf("%2");
                                if (k7 == -1)
                                    break;
                                s = s.substring(0, k7) + method26(aByte1117, method34(true, class5_1, 1)) + s.substring(k7 + 2);
                            } while (true);
                            do {
                                int l7 = s.indexOf("%3");
                                if (l7 == -1)
                                    break;
                                s = s.substring(0, l7) + method26(aByte1117, method34(true, class5_1, 2)) + s.substring(l7 + 2);
                            } while (true);
                            do {
                                int i8 = s.indexOf("%4");
                                if (i8 == -1)
                                    break;
                                s = s.substring(0, i8) + method26(aByte1117, method34(true, class5_1, 3)) + s.substring(i8 + 2);
                            } while (true);
                            do {
                                int j8 = s.indexOf("%5");
                                if (j8 == -1)
                                    break;
                                s = s.substring(0, j8) + method26(aByte1117, method34(true, class5_1, 4)) + s.substring(j8 + 2);
                            } while (true);
                        }
                        int k8 = s.indexOf("\\n");
                        String s1;
                        if (k8 != -1) {
                            s1 = s.substring(0, k8);
                            s = s.substring(k8 + 2);
                        } else {
                            s1 = s;
                            s = "";
                        }
                        if (class5_1.aBoolean141)
                            class44_sub3_sub1_sub4.method456(0, j2 + class5_1.anInt113 / 2, k6, s1, l3, class5_1.aBoolean142);
                        else
                            class44_sub3_sub1_sub4.method460(s1, anInt1033, class5_1.aBoolean142, k6, j2, l3);
                    }

                } else if (class5_1.anInt110 == 5) {
                    Class44_Sub3_Sub1_Sub2 class44_sub3_sub1_sub2;
                    if (method134(class5_1, 717))
                        class44_sub3_sub1_sub2 = class5_1.aClass44_Sub3_Sub1_Sub2_151;
                    else
                        class44_sub3_sub1_sub2 = class5_1.aClass44_Sub3_Sub1_Sub2_150;
                    if (class44_sub3_sub1_sub2 != null)
                        class44_sub3_sub1_sub2.method440(aByte1070, j2, k2);
                } else if (class5_1.anInt110 == 6) {
                    int j3 = Class44_Sub3_Sub1_Sub1.anInt1403;
                    int i4 = Class44_Sub3_Sub1_Sub1.anInt1404;
                    Class44_Sub3_Sub1_Sub1.anInt1403 = j2 + class5_1.anInt113 / 2;
                    Class44_Sub3_Sub1_Sub1.anInt1404 = k2 + class5_1.anInt114 / 2;
                    int l4 = Class44_Sub3_Sub1_Sub1.anIntArray1407[class5_1.anInt159] * class5_1.anInt158 >> 16;
                    int k5 = Class44_Sub3_Sub1_Sub1.anIntArray1408[class5_1.anInt159] * class5_1.anInt158 >> 16;
                    boolean flag2 = method134(class5_1, 717);
                    int l6;
                    if (flag2)
                        l6 = class5_1.anInt157;
                    else
                        l6 = class5_1.anInt156;
                    Class44_Sub3_Sub4_Sub4 class44_sub3_sub4_sub4;
                    if (l6 == -1) {
                        class44_sub3_sub4_sub4 = class5_1.method183(-1, -1, 811, flag2);
                    } else {
                        Class26 class26 = Class26.aClass26Array497[l6];
                        class44_sub3_sub4_sub4 = class5_1.method183(class26.anIntArray499[class5_1.anInt106], class26.anIntArray500[class5_1.anInt106], 811, flag2);
                    }
                    if (class44_sub3_sub4_sub4 != null)
                        class44_sub3_sub4_sub4.method523(0, class5_1.anInt160, 0, class5_1.anInt159, 0, l4, k5);
                    Class44_Sub3_Sub1_Sub1.anInt1403 = j3;
                    Class44_Sub3_Sub1_Sub1.anInt1404 = i4;
                } else if (class5_1.anInt110 == 7) {
                    Class44_Sub3_Sub1_Sub4 class44_sub3_sub1_sub4_1 = class5_1.aClass44_Sub3_Sub1_Sub4_143;
                    int j4 = 0;
                    for (int i5 = 0; i5 < class5_1.anInt114; i5++) {
                        for (int l5 = 0; l5 < class5_1.anInt113; l5++) {
                            if (class5_1.anIntArray104[j4] > 0) {
                                Class14 class14 = Class14.method220(class5_1.anIntArray104[j4] - 1);
                                String s2 = class14.aString327;
                                if (class14.aBoolean338 || class5_1.anIntArray105[j4] != 1)
                                    s2 = s2 + " x" + method97(class5_1.anIntArray105[j4], aBoolean1262);
                                int l8 = j2 + l5 * (115 + class5_1.anInt134);
                                int j9 = k2 + i5 * (12 + class5_1.anInt135);
                                if (class5_1.aBoolean141)
                                    class44_sub3_sub1_sub4_1.method456(0, l8 + class5_1.anInt113 / 2, j9, s2, class5_1.anInt146, class5_1.aBoolean142);
                                else
                                    class44_sub3_sub1_sub4_1.method460(s2, anInt1033, class5_1.aBoolean142, j9, l8, class5_1.anInt146);
                            }
                            j4++;
                        }

                    }

                }
        }

        Class44_Sub3_Sub1.method408(5, k1, j1, l, i1);
        if (byte0 == 0) {
            byte0 = 0;
        } else {
            aClass44_Sub3_Sub2_843.put1(141);
        }
    }

    public void method128(int i) {
        char c = '\u0100';
        if (i != 35604)
            aBoolean956 = !aBoolean956;
        if (anInt994 > 0) {
            for (int j = 0; j < 256; j++)
                if (anInt994 > 768)
                    anIntArray936[j] = method124(anIntArray937[j], 1024 - anInt994, 264, anIntArray938[j]);
                else if (anInt994 > 256)
                    anIntArray936[j] = anIntArray938[j];
                else
                    anIntArray936[j] = method124(anIntArray938[j], 256 - anInt994, 264, anIntArray937[j]);

        } else if (anInt995 > 0) {
            for (int k = 0; k < 256; k++)
                if (anInt995 > 768)
                    anIntArray936[k] = method124(anIntArray937[k], 1024 - anInt995, 264, anIntArray939[k]);
                else if (anInt995 > 256)
                    anIntArray936[k] = anIntArray939[k];
                else
                    anIntArray936[k] = method124(anIntArray939[k], 256 - anInt995, 264, anIntArray937[k]);

        } else {
            System.arraycopy(anIntArray937, 0, anIntArray936, 0, 256);

        }
        System.arraycopy(aClass44_Sub3_Sub1_Sub2_891.anIntArray1431, 0, aClass34_1042.anIntArray571, 0, 33920);

        int j1 = 0;
        int k1 = 1152;
        for (int l1 = 1; l1 < c - 1; l1++) {
            int i2 = (anIntArray903[l1] * (c - l1)) / c;
            int k2 = 22 + i2;
            if (k2 < 0)
                k2 = 0;
            j1 += k2;
            for (int i3 = k2; i3 < 128; i3++) {
                int k3 = anIntArray977[j1++];
                if (k3 != 0) {
                    int i4 = k3;
                    int k4 = 256 - k3;
                    k3 = anIntArray936[k3];
                    int i5 = aClass34_1042.anIntArray571[k1];
                    aClass34_1042.anIntArray571[k1++] = ((k3 & 0xff00ff) * i4 + (i5 & 0xff00ff) * k4 & 0xff00ff00) + ((k3 & 0xff00) * i4 + (i5 & 0xff00) * k4 & 0xff0000) >> 8;
                } else {
                    k1++;
                }
            }

            k1 += k2;
        }

        aClass34_1042.method273(0, super.aGraphics14, (byte) 76, 0);
        System.arraycopy(aClass44_Sub3_Sub1_Sub2_892.anIntArray1431, 0, aClass34_1043.anIntArray571, 0, 33920);

        j1 = 0;
        k1 = 1176;
        for (int l2 = 1; l2 < c - 1; l2++) {
            int j3 = (anIntArray903[l2] * (c - l2)) / c;
            int l3 = 103 - j3;
            k1 += j3;
            for (int j4 = 0; j4 < l3; j4++) {
                int l4 = anIntArray977[j1++];
                if (l4 != 0) {
                    int j5 = l4;
                    int k5 = 256 - l4;
                    l4 = anIntArray936[l4];
                    int l5 = aClass34_1043.anIntArray571[k1];
                    aClass34_1043.anIntArray571[k1++] = ((l4 & 0xff00ff) * j5 + (l5 & 0xff00ff) * k5 & 0xff00ff00) + ((l4 & 0xff00) * j5 + (l5 & 0xff00) * k5 & 0xff0000) >> 8;
                } else {
                    k1++;
                }
            }

            j1 += 128 - l3;
            k1 += 128 - l3 - j3;
        }

        aClass34_1043.method273(637, super.aGraphics14, (byte) 76, 0);
    }

    public void method129(boolean flag) {
        aBoolean905 &= flag;
        try {
            int i = aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 + anInt1246;
            int j = aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 + anInt834;
            if (anInt1021 - i < -500 || anInt1021 - i > 500 || anInt1022 - j < -500 || anInt1022 - j > 500) {
                anInt1021 = i;
                anInt1022 = j;
            }
            if (anInt1021 != i)
                anInt1021 += (i - anInt1021) / 16;
            if (anInt1022 != j)
                anInt1022 += (j - anInt1022) / 16;
            if (super.anIntArray32[1] == 1)
                anInt1207 += (-24 - anInt1207) / 2;
            else if (super.anIntArray32[2] == 1)
                anInt1207 += (24 - anInt1207) / 2;
            else
                anInt1207 /= 2;
            if (super.anIntArray32[3] == 1)
                anInt1208 += (12 - anInt1208) / 2;
            else if (super.anIntArray32[4] == 1)
                anInt1208 += (-12 - anInt1208) / 2;
            else
                anInt1208 /= 2;
            anInt1206 = anInt1206 + anInt1207 / 2 & 0x7ff;
            anInt1205 += anInt1208 / 2;
            if (anInt1205 < 128)
                anInt1205 = 128;
            if (anInt1205 > 383)
                anInt1205 = 383;
            int k = anInt1021 >> 7;
            int l = anInt1022 >> 7;
            int i1 = method50(anInt1021, anInt1022, 0, anInt1062);
            int j1 = 0;
            if (k > 3 && l > 3 && k < 100 && l < 100) {
                for (int k1 = k - 4; k1 <= k + 4; k1++) {
                    for (int i2 = l - 4; i2 <= l + 4; i2++) {
                        int j2 = anInt1062;
                        if (j2 < 3 && (aByteArrayArrayArray827[1][k1][i2] & 2) == 2)
                            j2++;
                        int k2 = i1 - anIntArrayArrayArray957[j2][k1][i2];
                        if (k2 > j1)
                            j1 = k2;
                    }

                }

            }
            int l1 = j1 * 192;
            if (l1 > 0x17f00)
                l1 = 0x17f00;
            if (l1 < 32768)
                l1 = 32768;
            if (l1 > anInt1072) {
                anInt1072 += (l1 - anInt1072) / 24;
                return;
            }
            if (l1 < anInt1072) {
                anInt1072 += (l1 - anInt1072) / 80;
            }
        } catch (Exception _ex) {
            signlink.reporterror("glfc_ex " + aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 + "," + aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 + "," + anInt1021 + "," + anInt1022 + "," + anInt922 + "," + anInt923 + "," + anInt1055 + "," + anInt1056);
            throw new RuntimeException("eek");
        }
    }

    public void method130(int i) {
        if (i != anInt1176)
            method6();
        if (anInt1031 != 0)
            return;
        if (super.anInt28 == 1) {
            int j = super.anInt29 - 25 - 550;
            int k = super.anInt30 - 5 - 4;
            if (j >= 0 && k >= 0 && j < 146 && k < 151) {
                j -= 73;
                k -= 75;
                int l = anInt1206 + anInt1217 & 0x7ff;
                int i1 = Class44_Sub3_Sub1_Sub1.anIntArray1407[l];
                int j1 = Class44_Sub3_Sub1_Sub1.anIntArray1408[l];
                i1 = i1 * (anInt1170 + 256) >> 8;
                j1 = j1 * (anInt1170 + 256) >> 8;
                int k1 = k * i1 + j * j1 >> 11;
                int l1 = k * j1 - j * i1 >> 11;
                int i2 = aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 + k1 >> 7;
                int j2 = aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 - l1 >> 7;
                boolean flag = method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], i2, 0, 0, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, true, 0, j2, (byte) 9, 1);
                if (flag) {
                    aClass44_Sub3_Sub2_843.put1(j);
                    aClass44_Sub3_Sub2_843.put1(k);
                    aClass44_Sub3_Sub2_843.put2(anInt1206);
                    aClass44_Sub3_Sub2_843.put1(57);
                    aClass44_Sub3_Sub2_843.put1(anInt1217);
                    aClass44_Sub3_Sub2_843.put1(anInt1170);
                    aClass44_Sub3_Sub2_843.put1(89);
                    aClass44_Sub3_Sub2_843.put2(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599);
                    aClass44_Sub3_Sub2_843.put2(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600);
                    aClass44_Sub3_Sub2_843.put1(anInt1006);
                    aClass44_Sub3_Sub2_843.put1(63);
                }
            }
        }
    }

    public void method131(byte byte0) {
        if (byte0 != -39)
            aBoolean899 = !aBoolean899;
        anInt1038++;
        if (anInt1038 > 192) {
            anInt1038 = 0;
            aClass44_Sub3_Sub2_843.putOpcode(230);
            aClass44_Sub3_Sub2_843.put1(232);
        }
        do {
            int i = method5((byte) 5);
            if (i == -1)
                break;
            if (anInt1037 != -1 && anInt1037 == anInt1081) {
                if (i == 8 && aString951.length() > 0)
                    aString951 = aString951.substring(0, aString951.length() - 1);
                if ((i >= 97 && i <= 122 || i >= 65 && i <= 90 || i >= 48 && i <= 57 || i == 32) && aString951.length() < 12)
                    aString951 += (char) i;
            } else if (aBoolean1265) {
                if (i >= 32 && i <= 122 && aString984.length() < 80) {
                    aString984 += (char) i;
                    aBoolean1109 = true;
                }
                if (i == 8 && aString984.length() > 0) {
                    aString984 = aString984.substring(0, aString984.length() - 1);
                    aBoolean1109 = true;
                }
                if (i == 13 || i == 10) {
                    aBoolean1265 = false;
                    aBoolean1109 = true;
                    if (anInt1051 == 1) {
                        long l = Class48.method547(aString984);
                        method102(199, l);
                    }
                    if (anInt1051 == 2 && anInt1115 > 0) {
                        long l1 = Class48.method547(aString984);
                        method62(0, l1);
                    }
                    if (anInt1051 == 3 && aString984.length() > 0) {
                        aClass44_Sub3_Sub2_843.putOpcode(139);
                        aClass44_Sub3_Sub2_843.put1(0);
                        int j = aClass44_Sub3_Sub2_843.anInt1374;
                        aClass44_Sub3_Sub2_843.put8(aLong867, 0);
                        Class49.method555(aString984, (byte) 126, aClass44_Sub3_Sub2_843);
                        aClass44_Sub3_Sub2_843.putSize(aClass44_Sub3_Sub2_843.anInt1374 - j, anInt797);
                        aString984 = Class48.method552(aString984, -407);
                        aString984 = Class41.method352((byte) 3, aString984);
                        method49(-476, 6, Class48.method551(131, Class48.method548(0, aLong867)), aString984);
                        if (anInt972 == 2) {
                            anInt972 = 1;
                            aBoolean1141 = true;
                            aClass44_Sub3_Sub2_843.putOpcode(154);
                            aClass44_Sub3_Sub2_843.put1(anInt967);
                            aClass44_Sub3_Sub2_843.put1(anInt972);
                            aClass44_Sub3_Sub2_843.put1(anInt805);
                        }
                    }
                    if (anInt1051 == 4 && anInt961 < 100) {
                        long l2 = Class48.method547(aString984);
                        method96(l2, false);
                    }
                    if (anInt1051 == 5 && anInt961 > 0) {
                        long l3 = Class48.method547(aString984);
                        method123(aBoolean974, l3);
                    }
                }
            } else if (aBoolean1104) {
                if (i >= 48 && i <= 57 && aString1182.length() < 10) {
                    aString1182 += (char) i;
                    aBoolean1109 = true;
                }
                if (i == 8 && aString1182.length() > 0) {
                    aString1182 = aString1182.substring(0, aString1182.length() - 1);
                    aBoolean1109 = true;
                }
                if (i == 13 || i == 10) {
                    if (aString1182.length() > 0) {
                        int k = 0;
                        try {
                            k = Integer.parseInt(aString1182);
                        } catch (Exception ignored) {
                        }
                        aClass44_Sub3_Sub2_843.putOpcode(102);
                        aClass44_Sub3_Sub2_843.put4(k);
                    }
                    aBoolean1104 = false;
                    aBoolean1109 = true;
                }
            } else if (anInt1011 == -1) {
                if (i >= 32 && i <= 122 && aString1009.length() < 80) {
                    aString1009 += (char) i;
                    aBoolean1109 = true;
                }
                if (i == 8 && aString1009.length() > 0) {
                    aString1009 = aString1009.substring(0, aString1009.length() - 1);
                    aBoolean1109 = true;
                }
                if ((i == 13 || i == 10) && aString1009.length() > 0) {
                    if (anInt866 == 2) {
                        if (aString1009.equals("::clientdrop"))
                            method71(0);
                        if (aString1009.equals("::lag"))
                            method118(true);
                        if (aString1009.equals("::prefetchmusic")) {
                            for (int i1 = 0; i1 < aClass43_Sub1_1015.method385(anInt1235, 2); i1++)
                                aClass43_Sub1_1015.method395((byte) 5, i1, 2, (byte) 1);

                        }
                    }
                    if (aString1009.startsWith("::")) {
                        aClass44_Sub3_Sub2_843.putOpcode(224);
                        aClass44_Sub3_Sub2_843.put1(aString1009.length() - 1);
                        aClass44_Sub3_Sub2_843.putString(aString1009.substring(2));
                    } else {
                        int j1 = 0;
                        if (aString1009.startsWith("yellow:")) {
                            j1 = 0;
                            aString1009 = aString1009.substring(7);
                        }
                        if (aString1009.startsWith("red:")) {
                            j1 = 1;
                            aString1009 = aString1009.substring(4);
                        }
                        if (aString1009.startsWith("green:")) {
                            j1 = 2;
                            aString1009 = aString1009.substring(6);
                        }
                        if (aString1009.startsWith("cyan:")) {
                            j1 = 3;
                            aString1009 = aString1009.substring(5);
                        }
                        if (aString1009.startsWith("purple:")) {
                            j1 = 4;
                            aString1009 = aString1009.substring(7);
                        }
                        if (aString1009.startsWith("white:")) {
                            j1 = 5;
                            aString1009 = aString1009.substring(6);
                        }
                        if (aString1009.startsWith("flash1:")) {
                            j1 = 6;
                            aString1009 = aString1009.substring(7);
                        }
                        if (aString1009.startsWith("flash2:")) {
                            j1 = 7;
                            aString1009 = aString1009.substring(7);
                        }
                        if (aString1009.startsWith("flash3:")) {
                            j1 = 8;
                            aString1009 = aString1009.substring(7);
                        }
                        if (aString1009.startsWith("glow1:")) {
                            j1 = 9;
                            aString1009 = aString1009.substring(6);
                        }
                        if (aString1009.startsWith("glow2:")) {
                            j1 = 10;
                            aString1009 = aString1009.substring(6);
                        }
                        if (aString1009.startsWith("glow3:")) {
                            j1 = 11;
                            aString1009 = aString1009.substring(6);
                        }
                        int k1 = 0;
                        if (aString1009.startsWith("wave:")) {
                            k1 = 1;
                            aString1009 = aString1009.substring(5);
                        }
                        if (aString1009.startsWith("scroll:")) {
                            k1 = 2;
                            aString1009 = aString1009.substring(7);
                        }
                        aClass44_Sub3_Sub2_843.putOpcode(253);
                        aClass44_Sub3_Sub2_843.put1(0);
                        int i2 = aClass44_Sub3_Sub2_843.anInt1374;
                        aClass44_Sub3_Sub2_843.put1(j1);
                        aClass44_Sub3_Sub2_843.put1(k1);
                        Class49.method555(aString1009, (byte) 126, aClass44_Sub3_Sub2_843);
                        aClass44_Sub3_Sub2_843.putSize(aClass44_Sub3_Sub2_843.anInt1374 - i2, anInt797);
                        aString1009 = Class48.method552(aString1009, -407);
                        aString1009 = Class41.method352((byte) 3, aString1009);
                        aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1611 = aString1009;
                        aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1613 = j1;
                        aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1614 = k1;
                        aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1612 = 150;
                        if (anInt866 == 2)
                            method49(-476, 2, "@cr2@" + aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1657, aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1611);
                        else if (anInt866 == 1)
                            method49(-476, 2, "@cr1@" + aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1657, aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1611);
                        else
                            method49(-476, 2, aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1657, aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1611);
                        if (anInt967 == 2) {
                            anInt967 = 3;
                            aBoolean1141 = true;
                            aClass44_Sub3_Sub2_843.putOpcode(154);
                            aClass44_Sub3_Sub2_843.put1(anInt967);
                            aClass44_Sub3_Sub2_843.put1(anInt972);
                            aClass44_Sub3_Sub2_843.put1(anInt805);
                        }
                    }
                    aString1009 = "";
                    aBoolean1109 = true;
                }
            }
        } while (true);
    }

    public void method132(String s) {
        System.out.println(s);
        try {
            getAppletContext().showDocument(new URL(getCodeBase(), "loaderror_" + s + ".html"));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        do
            try {
                Thread.sleep(1000L);
            } catch (Exception ignored) {
            }
        while (true);
    }

    public void method133(int i, int j, int k, Class12 class12, int l) {
        if (anInt980 >= 400)
            return;
        String s = class12.aString281;
        if (i != 0)
            aClass44_Sub3_Sub2_843.put1(204);
        if (class12.anInt298 != 0)
            s = s + method77(-684, class12.anInt298, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1663) + " (level-" + class12.anInt298 + ")";
        if (anInt811 == 1) {
            aStringArray1114[anInt980] = "Use " + aString815 + " with @yel@" + s;
            anIntArray1193[anInt980] = 829;
            anIntArray1194[anInt980] = l;
            anIntArray1191[anInt980] = j;
            anIntArray1192[anInt980] = k;
            anInt980++;
            return;
        }
        if (anInt1196 == 1) {
            if ((anInt1198 & 2) == 2) {
                aStringArray1114[anInt980] = aString1199 + " @yel@" + s;
                anIntArray1193[anInt980] = 240;
                anIntArray1194[anInt980] = l;
                anIntArray1191[anInt980] = j;
                anIntArray1192[anInt980] = k;
                anInt980++;
            }
        } else {
            if (class12.aStringArray293 != null) {
                for (int i1 = 4; i1 >= 0; i1--)
                    if (class12.aStringArray293[i1] != null && !class12.aStringArray293[i1].equalsIgnoreCase("attack")) {
                        aStringArray1114[anInt980] = class12.aStringArray293[i1] + " @yel@" + s;
                        if (i1 == 0)
                            anIntArray1193[anInt980] = 242;
                        if (i1 == 1)
                            anIntArray1193[anInt980] = 209;
                        if (i1 == 2)
                            anIntArray1193[anInt980] = 309;
                        if (i1 == 3)
                            anIntArray1193[anInt980] = 852;
                        if (i1 == 4)
                            anIntArray1193[anInt980] = 793;
                        anIntArray1194[anInt980] = l;
                        anIntArray1191[anInt980] = j;
                        anIntArray1192[anInt980] = k;
                        anInt980++;
                    }

            }
            if (class12.aStringArray293 != null) {
                for (int j1 = 4; j1 >= 0; j1--)
                    if (class12.aStringArray293[j1] != null && class12.aStringArray293[j1].equalsIgnoreCase("attack")) {
                        char c = '\0';
                        if (class12.anInt298 > aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1663)
                            c = '\u07D0';
                        aStringArray1114[anInt980] = class12.aStringArray293[j1] + " @yel@" + s;
                        if (j1 == 0)
                            anIntArray1193[anInt980] = 242 + c;
                        if (j1 == 1)
                            anIntArray1193[anInt980] = 209 + c;
                        if (j1 == 2)
                            anIntArray1193[anInt980] = 309 + c;
                        if (j1 == 3)
                            anIntArray1193[anInt980] = 852 + c;
                        if (j1 == 4)
                            anIntArray1193[anInt980] = 793 + c;
                        anIntArray1194[anInt980] = l;
                        anIntArray1191[anInt980] = j;
                        anIntArray1192[anInt980] = k;
                        anInt980++;
                    }

            }
            aStringArray1114[anInt980] = "Examine @yel@" + s;
            anIntArray1193[anInt980] = 1714;
            anIntArray1194[anInt980] = l;
            anIntArray1191[anInt980] = j;
            anIntArray1192[anInt980] = k;
            anInt980++;
        }
    }

    public boolean method134(Class5 class5, int i) {
        if (class5.anIntArray119 == null)
            return false;
        for (int j = 0; j < class5.anIntArray119.length; j++) {
            int k = method34(true, class5, j);
            int i1 = class5.anIntArray120[j];
            if (class5.anIntArray119[j] == 2) {
                if (k >= i1)
                    return false;
            } else if (class5.anIntArray119[j] == 3) {
                if (k <= i1)
                    return false;
            } else if (class5.anIntArray119[j] == 4) {
                if (k == i1)
                    return false;
            } else if (k != i1)
                return false;
        }

        if (i <= 0) {
            for (int l = 1; l > 0; l++) ;
        }
        return true;
    }

    public void method135(byte byte0) {
        for (int i = 0; i < anInt1260; i++) {
            int j = anIntArray1261[i];
            Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1259[j];
            if (class44_sub3_sub4_sub6_sub2 != null)
                method136(class44_sub3_sub4_sub6_sub2, 0, class44_sub3_sub4_sub6_sub2.aClass12_1682.aByte283);
        }

        if (byte0 != -34)
            anInt1220 = -1;
    }

    public void method136(Class44_Sub3_Sub4_Sub6 class44_sub3_sub4_sub6, int i, int j) {
        if (class44_sub3_sub4_sub6.anInt1599 < 128 || class44_sub3_sub4_sub6.anInt1600 < 128 || class44_sub3_sub4_sub6.anInt1599 >= 13184 || class44_sub3_sub4_sub6.anInt1600 >= 13184) {
            class44_sub3_sub4_sub6.anInt1627 = -1;
            class44_sub3_sub4_sub6.anInt1632 = -1;
            class44_sub3_sub4_sub6.anInt1641 = 0;
            class44_sub3_sub4_sub6.anInt1642 = 0;
            class44_sub3_sub4_sub6.anInt1599 = class44_sub3_sub4_sub6.anIntArray1649[0] * 128 + class44_sub3_sub4_sub6.anInt1603 * 64;
            class44_sub3_sub4_sub6.anInt1600 = class44_sub3_sub4_sub6.anIntArray1650[0] * 128 + class44_sub3_sub4_sub6.anInt1603 * 64;
            class44_sub3_sub4_sub6.method531(false);
        }
        if (class44_sub3_sub4_sub6 == aClass44_Sub3_Sub4_Sub6_Sub1_1252 && (class44_sub3_sub4_sub6.anInt1599 < 1536 || class44_sub3_sub4_sub6.anInt1600 < 1536 || class44_sub3_sub4_sub6.anInt1599 >= 11776 || class44_sub3_sub4_sub6.anInt1600 >= 11776)) {
            class44_sub3_sub4_sub6.anInt1627 = -1;
            class44_sub3_sub4_sub6.anInt1632 = -1;
            class44_sub3_sub4_sub6.anInt1641 = 0;
            class44_sub3_sub4_sub6.anInt1642 = 0;
            class44_sub3_sub4_sub6.anInt1599 = class44_sub3_sub4_sub6.anIntArray1649[0] * 128 + class44_sub3_sub4_sub6.anInt1603 * 64;
            class44_sub3_sub4_sub6.anInt1600 = class44_sub3_sub4_sub6.anIntArray1650[0] * 128 + class44_sub3_sub4_sub6.anInt1603 * 64;
            class44_sub3_sub4_sub6.method531(false);
        }
        if (class44_sub3_sub4_sub6.anInt1641 > anInt802)
            method137(class44_sub3_sub4_sub6, 896);
        else if (class44_sub3_sub4_sub6.anInt1642 >= anInt802)
            method138(class44_sub3_sub4_sub6, anInt1133);
        else
            method139(0, class44_sub3_sub4_sub6);
        method140(class44_sub3_sub4_sub6, -1672);
        if (i != 0)
            anInt1235 = 207;
        method141(class44_sub3_sub4_sub6, 3186);
    }

    public void method137(Class44_Sub3_Sub4_Sub6 class44_sub3_sub4_sub6, int i) {
        int j = class44_sub3_sub4_sub6.anInt1641 - anInt802;
        i = 25 / i;
        int k = class44_sub3_sub4_sub6.anInt1637 * 128 + class44_sub3_sub4_sub6.anInt1603 * 64;
        int l = class44_sub3_sub4_sub6.anInt1639 * 128 + class44_sub3_sub4_sub6.anInt1603 * 64;
        class44_sub3_sub4_sub6.anInt1599 += (k - class44_sub3_sub4_sub6.anInt1599) / j;
        class44_sub3_sub4_sub6.anInt1600 += (l - class44_sub3_sub4_sub6.anInt1600) / j;
        class44_sub3_sub4_sub6.anInt1652 = 0;
        if (class44_sub3_sub4_sub6.anInt1643 == 0)
            class44_sub3_sub4_sub6.anInt1646 = 1024;
        if (class44_sub3_sub4_sub6.anInt1643 == 1)
            class44_sub3_sub4_sub6.anInt1646 = 1536;
        if (class44_sub3_sub4_sub6.anInt1643 == 2)
            class44_sub3_sub4_sub6.anInt1646 = 0;
        if (class44_sub3_sub4_sub6.anInt1643 == 3)
            class44_sub3_sub4_sub6.anInt1646 = 512;
    }

    public void method138(Class44_Sub3_Sub4_Sub6 class44_sub3_sub4_sub6, int i) {
        anInt1219 += i;
        if (class44_sub3_sub4_sub6.anInt1642 == anInt802 || class44_sub3_sub4_sub6.anInt1627 == -1 || class44_sub3_sub4_sub6.anInt1630 != 0 || class44_sub3_sub4_sub6.anInt1629 + 1 > Class26.aClass26Array497[class44_sub3_sub4_sub6.anInt1627].method254(class44_sub3_sub4_sub6.anInt1628, 41645)) {
            int j = class44_sub3_sub4_sub6.anInt1642 - class44_sub3_sub4_sub6.anInt1641;
            int k = anInt802 - class44_sub3_sub4_sub6.anInt1641;
            int l = class44_sub3_sub4_sub6.anInt1637 * 128 + class44_sub3_sub4_sub6.anInt1603 * 64;
            int i1 = class44_sub3_sub4_sub6.anInt1639 * 128 + class44_sub3_sub4_sub6.anInt1603 * 64;
            int j1 = class44_sub3_sub4_sub6.anInt1638 * 128 + class44_sub3_sub4_sub6.anInt1603 * 64;
            int k1 = class44_sub3_sub4_sub6.anInt1640 * 128 + class44_sub3_sub4_sub6.anInt1603 * 64;
            class44_sub3_sub4_sub6.anInt1599 = (l * (j - k) + j1 * k) / j;
            class44_sub3_sub4_sub6.anInt1600 = (i1 * (j - k) + k1 * k) / j;
        }
        class44_sub3_sub4_sub6.anInt1652 = 0;
        if (class44_sub3_sub4_sub6.anInt1643 == 0)
            class44_sub3_sub4_sub6.anInt1646 = 1024;
        if (class44_sub3_sub4_sub6.anInt1643 == 1)
            class44_sub3_sub4_sub6.anInt1646 = 1536;
        if (class44_sub3_sub4_sub6.anInt1643 == 2)
            class44_sub3_sub4_sub6.anInt1646 = 0;
        if (class44_sub3_sub4_sub6.anInt1643 == 3)
            class44_sub3_sub4_sub6.anInt1646 = 512;
        class44_sub3_sub4_sub6.anInt1601 = class44_sub3_sub4_sub6.anInt1646;
    }

    public void method139(int i, Class44_Sub3_Sub4_Sub6 class44_sub3_sub4_sub6) {
        class44_sub3_sub4_sub6.anInt1624 = class44_sub3_sub4_sub6.anInt1604;
        if (class44_sub3_sub4_sub6.anInt1648 == 0) {
            class44_sub3_sub4_sub6.anInt1652 = 0;
            return;
        }
        if (class44_sub3_sub4_sub6.anInt1627 != -1 && class44_sub3_sub4_sub6.anInt1630 == 0) {
            Class26 class26 = Class26.aClass26Array497[class44_sub3_sub4_sub6.anInt1627];
            if (class44_sub3_sub4_sub6.anInt1653 > 0 && class26.anInt509 == 0) {
                class44_sub3_sub4_sub6.anInt1652++;
                return;
            }
            if (class44_sub3_sub4_sub6.anInt1653 <= 0 && class26.anInt510 == 0) {
                class44_sub3_sub4_sub6.anInt1652++;
                return;
            }
        }
        int j = class44_sub3_sub4_sub6.anInt1599;
        int k = class44_sub3_sub4_sub6.anInt1600;
        int l = class44_sub3_sub4_sub6.anIntArray1649[class44_sub3_sub4_sub6.anInt1648 - 1] * 128 + class44_sub3_sub4_sub6.anInt1603 * 64;
        int i1 = class44_sub3_sub4_sub6.anIntArray1650[class44_sub3_sub4_sub6.anInt1648 - 1] * 128 + class44_sub3_sub4_sub6.anInt1603 * 64;
        if (l - j > 256 || l - j < -256 || i1 - k > 256 || i1 - k < -256) {
            class44_sub3_sub4_sub6.anInt1599 = l;
            class44_sub3_sub4_sub6.anInt1600 = i1;
            return;
        }
        if (j < l) {
            if (k < i1)
                class44_sub3_sub4_sub6.anInt1646 = 1280;
            else if (k > i1)
                class44_sub3_sub4_sub6.anInt1646 = 1792;
            else
                class44_sub3_sub4_sub6.anInt1646 = 1536;
        } else if (j > l) {
            if (k < i1)
                class44_sub3_sub4_sub6.anInt1646 = 768;
            else if (k > i1)
                class44_sub3_sub4_sub6.anInt1646 = 256;
            else
                class44_sub3_sub4_sub6.anInt1646 = 512;
        } else if (k < i1)
            class44_sub3_sub4_sub6.anInt1646 = 1024;
        else
            class44_sub3_sub4_sub6.anInt1646 = 0;
        int j1 = class44_sub3_sub4_sub6.anInt1646 - class44_sub3_sub4_sub6.anInt1601 & 0x7ff;
        if (j1 > 1024)
            j1 -= 2048;
        int k1 = class44_sub3_sub4_sub6.anInt1607;
        if (j1 >= -256 && j1 <= 256)
            k1 = class44_sub3_sub4_sub6.anInt1606;
        else if (j1 >= 256 && j1 < 768)
            k1 = class44_sub3_sub4_sub6.anInt1609;
        else if (j1 >= -768 && j1 <= -256)
            k1 = class44_sub3_sub4_sub6.anInt1608;
        if (k1 == -1)
            k1 = class44_sub3_sub4_sub6.anInt1606;
        class44_sub3_sub4_sub6.anInt1624 = k1;
        if (i != 0)
            return;
        int l1 = 4;
        if (class44_sub3_sub4_sub6.anInt1601 != class44_sub3_sub4_sub6.anInt1646 && class44_sub3_sub4_sub6.anInt1621 == -1 && class44_sub3_sub4_sub6.anInt1647 != 0)
            l1 = 2;
        if (class44_sub3_sub4_sub6.anInt1648 > 2)
            l1 = 6;
        if (class44_sub3_sub4_sub6.anInt1648 > 3)
            l1 = 8;
        if (class44_sub3_sub4_sub6.anInt1652 > 0 && class44_sub3_sub4_sub6.anInt1648 > 1) {
            l1 = 8;
            class44_sub3_sub4_sub6.anInt1652--;
        }
        if (class44_sub3_sub4_sub6.aBooleanArray1651[class44_sub3_sub4_sub6.anInt1648 - 1])
            l1 <<= 1;
        if (l1 >= 8 && class44_sub3_sub4_sub6.anInt1624 == class44_sub3_sub4_sub6.anInt1606 && class44_sub3_sub4_sub6.anInt1610 != -1)
            class44_sub3_sub4_sub6.anInt1624 = class44_sub3_sub4_sub6.anInt1610;
        if (j < l) {
            class44_sub3_sub4_sub6.anInt1599 += l1;
            if (class44_sub3_sub4_sub6.anInt1599 > l)
                class44_sub3_sub4_sub6.anInt1599 = l;
        } else if (j > l) {
            class44_sub3_sub4_sub6.anInt1599 -= l1;
            if (class44_sub3_sub4_sub6.anInt1599 < l)
                class44_sub3_sub4_sub6.anInt1599 = l;
        }
        if (k < i1) {
            class44_sub3_sub4_sub6.anInt1600 += l1;
            if (class44_sub3_sub4_sub6.anInt1600 > i1)
                class44_sub3_sub4_sub6.anInt1600 = i1;
        } else if (k > i1) {
            class44_sub3_sub4_sub6.anInt1600 -= l1;
            if (class44_sub3_sub4_sub6.anInt1600 < i1)
                class44_sub3_sub4_sub6.anInt1600 = i1;
        }
        if (class44_sub3_sub4_sub6.anInt1599 == l && class44_sub3_sub4_sub6.anInt1600 == i1) {
            class44_sub3_sub4_sub6.anInt1648--;
            if (class44_sub3_sub4_sub6.anInt1653 > 0)
                class44_sub3_sub4_sub6.anInt1653--;
        }
    }

    public void method140(Class44_Sub3_Sub4_Sub6 class44_sub3_sub4_sub6, int i) {
        if (i != -1672)
            anInt1220 = aClass44_Sub3_Sub2_1135.get1();
        if (class44_sub3_sub4_sub6.anInt1647 == 0)
            return;
        if (class44_sub3_sub4_sub6.anInt1621 != -1 && class44_sub3_sub4_sub6.anInt1621 < 32768) {
            Class44_Sub3_Sub4_Sub6_Sub2 class44_sub3_sub4_sub6_sub2 = aClass44_Sub3_Sub4_Sub6_Sub2Array1259[class44_sub3_sub4_sub6.anInt1621];
            if (class44_sub3_sub4_sub6_sub2 != null) {
                int i1 = class44_sub3_sub4_sub6.anInt1599 - class44_sub3_sub4_sub6_sub2.anInt1599;
                int k1 = class44_sub3_sub4_sub6.anInt1600 - class44_sub3_sub4_sub6_sub2.anInt1600;
                if (i1 != 0 || k1 != 0)
                    class44_sub3_sub4_sub6.anInt1646 = (int) (Math.atan2(i1, k1) * 325.94900000000001D) & 0x7ff;
            }
        }
        if (class44_sub3_sub4_sub6.anInt1621 >= 32768) {
            int j = class44_sub3_sub4_sub6.anInt1621 - 32768;
            if (j == anInt947)
                j = anInt1119;
            Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1120[j];
            if (class44_sub3_sub4_sub6_sub1 != null) {
                int l1 = class44_sub3_sub4_sub6.anInt1599 - class44_sub3_sub4_sub6_sub1.anInt1599;
                int i2 = class44_sub3_sub4_sub6.anInt1600 - class44_sub3_sub4_sub6_sub1.anInt1600;
                if (l1 != 0 || i2 != 0)
                    class44_sub3_sub4_sub6.anInt1646 = (int) (Math.atan2(l1, i2) * 325.94900000000001D) & 0x7ff;
            }
        }
        if ((class44_sub3_sub4_sub6.anInt1622 != 0 || class44_sub3_sub4_sub6.anInt1623 != 0) && (class44_sub3_sub4_sub6.anInt1648 == 0 || class44_sub3_sub4_sub6.anInt1652 > 0)) {
            int k = class44_sub3_sub4_sub6.anInt1599 - (class44_sub3_sub4_sub6.anInt1622 - anInt1055 - anInt1055) * 64;
            int j1 = class44_sub3_sub4_sub6.anInt1600 - (class44_sub3_sub4_sub6.anInt1623 - anInt1056 - anInt1056) * 64;
            if (k != 0 || j1 != 0)
                class44_sub3_sub4_sub6.anInt1646 = (int) (Math.atan2(k, j1) * 325.94900000000001D) & 0x7ff;
            class44_sub3_sub4_sub6.anInt1622 = 0;
            class44_sub3_sub4_sub6.anInt1623 = 0;
        }
        int l = class44_sub3_sub4_sub6.anInt1646 - class44_sub3_sub4_sub6.anInt1601 & 0x7ff;
        if (l != 0) {
            if (l < class44_sub3_sub4_sub6.anInt1647 || l > 2048 - class44_sub3_sub4_sub6.anInt1647)
                class44_sub3_sub4_sub6.anInt1601 = class44_sub3_sub4_sub6.anInt1646;
            else if (l > 1024)
                class44_sub3_sub4_sub6.anInt1601 -= class44_sub3_sub4_sub6.anInt1647;
            else
                class44_sub3_sub4_sub6.anInt1601 += class44_sub3_sub4_sub6.anInt1647;
            class44_sub3_sub4_sub6.anInt1601 &= 0x7ff;
            if (class44_sub3_sub4_sub6.anInt1624 == class44_sub3_sub4_sub6.anInt1604 && class44_sub3_sub4_sub6.anInt1601 != class44_sub3_sub4_sub6.anInt1646) {
                if (class44_sub3_sub4_sub6.anInt1605 != -1) {
                    class44_sub3_sub4_sub6.anInt1624 = class44_sub3_sub4_sub6.anInt1605;
                    return;
                }
                class44_sub3_sub4_sub6.anInt1624 = class44_sub3_sub4_sub6.anInt1606;
            }
        }
    }

    public void method141(Class44_Sub3_Sub4_Sub6 class44_sub3_sub4_sub6, int i) {
        if (i != 3186)
            anInt845 = aClass46_944.method542();
        class44_sub3_sub4_sub6.aBoolean1602 = false;
        if (class44_sub3_sub4_sub6.anInt1624 != -1) {
            Class26 class26 = Class26.aClass26Array497[class44_sub3_sub4_sub6.anInt1624];
            class44_sub3_sub4_sub6.anInt1626++;
            if (class44_sub3_sub4_sub6.anInt1625 < class26.anInt498 && class44_sub3_sub4_sub6.anInt1626 > class26.method254(class44_sub3_sub4_sub6.anInt1625, 41645)) {
                class44_sub3_sub4_sub6.anInt1626 = 0;
                class44_sub3_sub4_sub6.anInt1625++;
            }
            if (class44_sub3_sub4_sub6.anInt1625 >= class26.anInt498) {
                class44_sub3_sub4_sub6.anInt1626 = 0;
                class44_sub3_sub4_sub6.anInt1625 = 0;
            }
        }
        if (class44_sub3_sub4_sub6.anInt1632 != -1 && anInt802 >= class44_sub3_sub4_sub6.anInt1635) {
            if (class44_sub3_sub4_sub6.anInt1633 < 0)
                class44_sub3_sub4_sub6.anInt1633 = 0;
            Class26 class26_1 = Class32.aClass32Array547[class44_sub3_sub4_sub6.anInt1632].aClass26_551;
            for (class44_sub3_sub4_sub6.anInt1634++; class44_sub3_sub4_sub6.anInt1633 < class26_1.anInt498 && class44_sub3_sub4_sub6.anInt1634 > class26_1.method254(class44_sub3_sub4_sub6.anInt1633, 41645); class44_sub3_sub4_sub6.anInt1633++)
                class44_sub3_sub4_sub6.anInt1634 -= class26_1.method254(class44_sub3_sub4_sub6.anInt1633, 41645);

            if (class44_sub3_sub4_sub6.anInt1633 >= class26_1.anInt498 && (class44_sub3_sub4_sub6.anInt1633 < 0 || class44_sub3_sub4_sub6.anInt1633 >= class26_1.anInt498))
                class44_sub3_sub4_sub6.anInt1632 = -1;
        }
        if (class44_sub3_sub4_sub6.anInt1627 != -1 && class44_sub3_sub4_sub6.anInt1630 <= 1) {
            Class26 class26_2 = Class26.aClass26Array497[class44_sub3_sub4_sub6.anInt1627];
            if (class26_2.anInt509 == 1 && class44_sub3_sub4_sub6.anInt1653 > 0 && class44_sub3_sub4_sub6.anInt1641 <= anInt802 && class44_sub3_sub4_sub6.anInt1642 < anInt802) {
                class44_sub3_sub4_sub6.anInt1630 = 1;
                return;
            }
        }
        if (class44_sub3_sub4_sub6.anInt1627 != -1 && class44_sub3_sub4_sub6.anInt1630 == 0) {
            Class26 class26_3 = Class26.aClass26Array497[class44_sub3_sub4_sub6.anInt1627];
            for (class44_sub3_sub4_sub6.anInt1629++; class44_sub3_sub4_sub6.anInt1628 < class26_3.anInt498 && class44_sub3_sub4_sub6.anInt1629 > class26_3.method254(class44_sub3_sub4_sub6.anInt1628, 41645); class44_sub3_sub4_sub6.anInt1628++)
                class44_sub3_sub4_sub6.anInt1629 -= class26_3.method254(class44_sub3_sub4_sub6.anInt1628, 41645);

            if (class44_sub3_sub4_sub6.anInt1628 >= class26_3.anInt498) {
                class44_sub3_sub4_sub6.anInt1628 -= class26_3.anInt502;
                class44_sub3_sub4_sub6.anInt1631++;
                if (class44_sub3_sub4_sub6.anInt1631 >= class26_3.anInt508)
                    class44_sub3_sub4_sub6.anInt1627 = -1;
                if (class44_sub3_sub4_sub6.anInt1628 < 0 || class44_sub3_sub4_sub6.anInt1628 >= class26_3.anInt498)
                    class44_sub3_sub4_sub6.anInt1627 = -1;
            }
            class44_sub3_sub4_sub6.aBoolean1602 = class26_3.aBoolean504;
        }
        if (class44_sub3_sub4_sub6.anInt1630 > 0)
            class44_sub3_sub4_sub6.anInt1630--;
    }

    public void method142(int i) {
        if (i != 41329)
            anInt1220 = -1;
        if (aBoolean917) {
            aBoolean917 = false;
            aClass34_852.method273(0, super.aGraphics14, (byte) 76, 4);
            aClass34_853.method273(0, super.aGraphics14, (byte) 76, 357);
            aClass34_854.method273(722, super.aGraphics14, (byte) 76, 4);
            aClass34_855.method273(743, super.aGraphics14, (byte) 76, 205);
            aClass34_856.method273(0, super.aGraphics14, (byte) 76, 0);
            aClass34_857.method273(516, super.aGraphics14, (byte) 76, 4);
            aClass34_858.method273(516, super.aGraphics14, (byte) 76, 205);
            aClass34_859.method273(496, super.aGraphics14, (byte) 76, 357);
            aClass34_860.method273(0, super.aGraphics14, (byte) 76, 338);
            aBoolean928 = true;
            aBoolean1109 = true;
            aBoolean841 = true;
            aBoolean1141 = true;
            if (anInt1129 != 2) {
                aClass34_864.method273(4, super.aGraphics14, (byte) 76, 4);
                aClass34_863.method273(550, super.aGraphics14, (byte) 76, 4);
            }
        }
        if (anInt1129 == 2)
            method37(0);
        if (aBoolean851 && anInt1254 == 1)
            aBoolean928 = true;
        if (anInt1216 != -1) {
            boolean flag = method14(anInt975, 753, anInt1216);
            if (flag)
                aBoolean928 = true;
        }
        if (anInt850 == 2)
            aBoolean928 = true;
        if (anInt895 == 2)
            aBoolean928 = true;
        if (aBoolean928) {
            method98(true);
            aBoolean928 = false;
        }
        if (anInt1011 == -1) {
            aClass5_861.anInt123 = anInt931 - anInt1082 - 77;
            if (super.anInt22 > 448 && super.anInt22 < 560 && super.anInt23 > 332)
                method64(-782, 77, aClass5_861, super.anInt23 - 357, 0, 463, super.anInt22 - 17, false, anInt931);
            int j = anInt931 - 77 - aClass5_861.anInt123;
            if (j < 0)
                j = 0;
            if (j > anInt931 - 77)
                j = anInt931 - 77;
            if (anInt1082 != j) {
                anInt1082 = j;
                aBoolean1109 = true;
            }
        }
        if (anInt1011 != -1) {
            boolean flag1 = method14(anInt975, 753, anInt1011);
            if (flag1)
                aBoolean1109 = true;
        }
        if (anInt850 == 3)
            aBoolean1109 = true;
        if (anInt895 == 3)
            aBoolean1109 = true;
        if (aString829 != null)
            aBoolean1109 = true;
        if (aBoolean851 && anInt1254 == 2)
            aBoolean1109 = true;
        if (aBoolean1109) {
            method63((byte) -29);
            aBoolean1109 = false;
        }
        if (anInt1129 == 2) {
            method103((byte) 5);
            aClass34_863.method273(550, super.aGraphics14, (byte) 76, 4);
        }
        if (anInt1173 != -1)
            aBoolean841 = true;
        if (aBoolean841) {
            if (anInt1173 != -1 && anInt1173 == anInt1013) {
                anInt1173 = -1;
                aClass44_Sub3_Sub2_843.putOpcode(94);
                aClass44_Sub3_Sub2_843.put1(anInt1013);
            }
            aBoolean841 = false;
            aClass34_992.method272(aBoolean960);
            aClass44_Sub3_Sub1_Sub3_1180.method453(aByte1070, 0, 0);
            if (anInt1216 == -1) {
                if (anIntArray954[anInt1013] != -1) {
                    if (anInt1013 == 0)
                        aClass44_Sub3_Sub1_Sub3_875.method453(aByte1070, 22, 10);
                    if (anInt1013 == 1)
                        aClass44_Sub3_Sub1_Sub3_876.method453(aByte1070, 54, 8);
                    if (anInt1013 == 2)
                        aClass44_Sub3_Sub1_Sub3_876.method453(aByte1070, 82, 8);
                    if (anInt1013 == 3)
                        aClass44_Sub3_Sub1_Sub3_877.method453(aByte1070, 110, 8);
                    if (anInt1013 == 4)
                        aClass44_Sub3_Sub1_Sub3_879.method453(aByte1070, 153, 8);
                    if (anInt1013 == 5)
                        aClass44_Sub3_Sub1_Sub3_879.method453(aByte1070, 181, 8);
                    if (anInt1013 == 6)
                        aClass44_Sub3_Sub1_Sub3_878.method453(aByte1070, 209, 9);
                }
                if (anIntArray954[0] != -1 && (anInt1173 != 0 || anInt802 % 20 < 10))
                    aClass44_Sub3_Sub1_Sub3Array952[0].method453(aByte1070, 29, 13);
                if (anIntArray954[1] != -1 && (anInt1173 != 1 || anInt802 % 20 < 10))
                    aClass44_Sub3_Sub1_Sub3Array952[1].method453(aByte1070, 53, 11);
                if (anIntArray954[2] != -1 && (anInt1173 != 2 || anInt802 % 20 < 10))
                    aClass44_Sub3_Sub1_Sub3Array952[2].method453(aByte1070, 82, 11);
                if (anIntArray954[3] != -1 && (anInt1173 != 3 || anInt802 % 20 < 10))
                    aClass44_Sub3_Sub1_Sub3Array952[3].method453(aByte1070, 115, 12);
                if (anIntArray954[4] != -1 && (anInt1173 != 4 || anInt802 % 20 < 10))
                    aClass44_Sub3_Sub1_Sub3Array952[4].method453(aByte1070, 153, 13);
                if (anIntArray954[5] != -1 && (anInt1173 != 5 || anInt802 % 20 < 10))
                    aClass44_Sub3_Sub1_Sub3Array952[5].method453(aByte1070, 180, 11);
                if (anIntArray954[6] != -1 && (anInt1173 != 6 || anInt802 % 20 < 10))
                    aClass44_Sub3_Sub1_Sub3Array952[6].method453(aByte1070, 208, 13);
            }
            aClass34_992.method273(516, super.aGraphics14, (byte) 76, 160);
            aClass34_991.method272(aBoolean960);
            aClass44_Sub3_Sub1_Sub3_1179.method453(aByte1070, 0, 0);
            if (anInt1216 == -1) {
                if (anIntArray954[anInt1013] != -1) {
                    if (anInt1013 == 7)
                        aClass44_Sub3_Sub1_Sub3_1210.method453(aByte1070, 42, 0);
                    if (anInt1013 == 8)
                        aClass44_Sub3_Sub1_Sub3_1211.method453(aByte1070, 74, 0);
                    if (anInt1013 == 9)
                        aClass44_Sub3_Sub1_Sub3_1211.method453(aByte1070, 102, 0);
                    if (anInt1013 == 10)
                        aClass44_Sub3_Sub1_Sub3_1212.method453(aByte1070, 130, 1);
                    if (anInt1013 == 11)
                        aClass44_Sub3_Sub1_Sub3_1214.method453(aByte1070, 173, 0);
                    if (anInt1013 == 12)
                        aClass44_Sub3_Sub1_Sub3_1214.method453(aByte1070, 201, 0);
                    if (anInt1013 == 13)
                        aClass44_Sub3_Sub1_Sub3_1213.method453(aByte1070, 229, 0);
                }
                if (anIntArray954[8] != -1 && (anInt1173 != 8 || anInt802 % 20 < 10))
                    aClass44_Sub3_Sub1_Sub3Array952[7].method453(aByte1070, 74, 2);
                if (anIntArray954[9] != -1 && (anInt1173 != 9 || anInt802 % 20 < 10))
                    aClass44_Sub3_Sub1_Sub3Array952[8].method453(aByte1070, 102, 3);
                if (anIntArray954[10] != -1 && (anInt1173 != 10 || anInt802 % 20 < 10))
                    aClass44_Sub3_Sub1_Sub3Array952[9].method453(aByte1070, 137, 4);
                if (anIntArray954[11] != -1 && (anInt1173 != 11 || anInt802 % 20 < 10))
                    aClass44_Sub3_Sub1_Sub3Array952[10].method453(aByte1070, 174, 2);
                if (anIntArray954[12] != -1 && (anInt1173 != 12 || anInt802 % 20 < 10))
                    aClass44_Sub3_Sub1_Sub3Array952[11].method453(aByte1070, 201, 2);
                if (anIntArray954[13] != -1 && (anInt1173 != 13 || anInt802 % 20 < 10))
                    aClass44_Sub3_Sub1_Sub3Array952[12].method453(aByte1070, 226, 2);
            }
            aClass34_991.method273(496, super.aGraphics14, (byte) 76, 466);
            aClass34_864.method272(aBoolean960);
        }
        if (aBoolean1141) {
            aBoolean1141 = false;
            aClass34_990.method272(aBoolean960);
            aClass44_Sub3_Sub1_Sub3_1178.method453(aByte1070, 0, 0);
            aClass44_Sub3_Sub1_Sub4_1076.method456(0, 55, 28, "Public chat", 0xffffff, true);
            if (anInt967 == 0)
                aClass44_Sub3_Sub1_Sub4_1076.method456(0, 55, 41, "On", 65280, true);
            if (anInt967 == 1)
                aClass44_Sub3_Sub1_Sub4_1076.method456(0, 55, 41, "Friends", 0xffff00, true);
            if (anInt967 == 2)
                aClass44_Sub3_Sub1_Sub4_1076.method456(0, 55, 41, "Off", 0xff0000, true);
            if (anInt967 == 3)
                aClass44_Sub3_Sub1_Sub4_1076.method456(0, 55, 41, "Hide", 65535, true);
            aClass44_Sub3_Sub1_Sub4_1076.method456(0, 184, 28, "Private chat", 0xffffff, true);
            if (anInt972 == 0)
                aClass44_Sub3_Sub1_Sub4_1076.method456(0, 184, 41, "On", 65280, true);
            if (anInt972 == 1)
                aClass44_Sub3_Sub1_Sub4_1076.method456(0, 184, 41, "Friends", 0xffff00, true);
            if (anInt972 == 2)
                aClass44_Sub3_Sub1_Sub4_1076.method456(0, 184, 41, "Off", 0xff0000, true);
            aClass44_Sub3_Sub1_Sub4_1076.method456(0, 324, 28, "Trade/duel", 0xffffff, true);
            if (anInt805 == 0)
                aClass44_Sub3_Sub1_Sub4_1076.method456(0, 324, 41, "On", 65280, true);
            if (anInt805 == 1)
                aClass44_Sub3_Sub1_Sub4_1076.method456(0, 324, 41, "Friends", 0xffff00, true);
            if (anInt805 == 2)
                aClass44_Sub3_Sub1_Sub4_1076.method456(0, 324, 41, "Off", 0xff0000, true);
            aClass44_Sub3_Sub1_Sub4_1076.method456(0, 458, 33, "Report abuse", 0xffffff, true);
            aClass34_990.method273(0, super.aGraphics14, (byte) 76, 453);
            aClass34_864.method272(aBoolean960);
        }
        anInt975 = 0;
    }

    public void method143(int i, int j, Class44_Sub3_Sub2 class44_sub3_sub2) {
        anInt1064 = 0;
        anInt1123 = 0;
        j += i;
        method66(j, anInt925, class44_sub3_sub2);
        method25(-196, class44_sub3_sub2, j);
        method99(j, (byte) 4, class44_sub3_sub2);
        for (int k = 0; k < anInt1064; k++) {
            int l = anIntArray1065[k];
            if (aClass44_Sub3_Sub4_Sub6_Sub2Array1259[l].anInt1644 != anInt802) {
                aClass44_Sub3_Sub4_Sub6_Sub2Array1259[l].aClass12_1682 = null;
                aClass44_Sub3_Sub4_Sub6_Sub2Array1259[l] = null;
            }
        }

        if (class44_sub3_sub2.anInt1374 != j) {
            signlink.reporterror(aString1147 + " size mismatch in getnpcpos - pos:" + class44_sub3_sub2.anInt1374 + " psize:" + j);
            throw new RuntimeException("eek");
        }
        for (int i1 = 0; i1 < anInt1260; i1++)
            if (aClass44_Sub3_Sub4_Sub6_Sub2Array1259[anIntArray1261[i1]] == null) {
                signlink.reporterror(aString1147 + " null entry in npc list - pos:" + i1 + " size:" + anInt1260);
                throw new RuntimeException("eek");
            }

    }

    public void method144(int i) {
        if (i != 42825)
            aClass28ArrayArrayArray816 = null;
        if (anInt1129 == 2) {
            for (Class44_Sub1 class44_sub1 = (Class44_Sub1) aClass28_1228.method259(); class44_sub1 != null; class44_sub1 = (Class44_Sub1) aClass28_1228.method261(aByte958)) {
                if (class44_sub1.anInt1321 > 0)
                    class44_sub1.anInt1321--;
                if (class44_sub1.anInt1321 == 0) {
                    if (class44_sub1.anInt1314 < 0 || Class3.method173(class44_sub1.anInt1314, class44_sub1.anInt1316, 469)) {
                        method44(class44_sub1.anInt1315, class44_sub1.anInt1311, class44_sub1.anInt1312, class44_sub1.anInt1316, false, class44_sub1.anInt1314, class44_sub1.anInt1310, class44_sub1.anInt1313);
                        class44_sub1.method404();
                    }
                } else {
                    if (class44_sub1.anInt1320 > 0)
                        class44_sub1.anInt1320--;
                    if (class44_sub1.anInt1320 == 0 && class44_sub1.anInt1312 >= 1 && class44_sub1.anInt1313 >= 1 && class44_sub1.anInt1312 <= 102 && class44_sub1.anInt1313 <= 102 && (class44_sub1.anInt1317 < 0 || Class3.method173(class44_sub1.anInt1317, class44_sub1.anInt1319, 469))) {
                        method44(class44_sub1.anInt1318, class44_sub1.anInt1311, class44_sub1.anInt1312, class44_sub1.anInt1319, false, class44_sub1.anInt1317, class44_sub1.anInt1310, class44_sub1.anInt1313);
                        class44_sub1.anInt1320 = -1;
                        if (class44_sub1.anInt1317 == class44_sub1.anInt1314 && class44_sub1.anInt1314 == -1)
                            class44_sub1.method404();
                        else if (class44_sub1.anInt1317 == class44_sub1.anInt1314 && class44_sub1.anInt1318 == class44_sub1.anInt1315 && class44_sub1.anInt1319 == class44_sub1.anInt1316)
                            class44_sub1.method404();
                    }
                }
            }

        }
    }

    public void method145(Class44_Sub3_Sub2 class44_sub3_sub2, int i, int j) {
        do {
            if (class44_sub3_sub2.anInt1375 + 10 >= i * 8)
                break;
            int k = class44_sub3_sub2.getBit(11, (byte) -96);
            if (k == 2047)
                break;
            if (aClass44_Sub3_Sub4_Sub6_Sub1Array1120[k] == null) {
                aClass44_Sub3_Sub4_Sub6_Sub1Array1120[k] = new Class44_Sub3_Sub4_Sub6_Sub1();
                if (aClass44_Sub3_Sub2Array1125[k] != null)
                    aClass44_Sub3_Sub4_Sub6_Sub1Array1120[k].method534(aClass44_Sub3_Sub2Array1125[k], anInt801);
            }
            anIntArray1122[anInt1121++] = k;
            Class44_Sub3_Sub4_Sub6_Sub1 class44_sub3_sub4_sub6_sub1 = aClass44_Sub3_Sub4_Sub6_Sub1Array1120[k];
            class44_sub3_sub4_sub6_sub1.anInt1644 = anInt802;
            int l = class44_sub3_sub2.getBit(5, (byte) -96);
            if (l > 15)
                l -= 32;
            int i1 = class44_sub3_sub2.getBit(5, (byte) -96);
            if (i1 > 15)
                i1 -= 32;
            int j1 = class44_sub3_sub2.getBit(1, (byte) -96);
            class44_sub3_sub4_sub6_sub1.method529(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0] + l, j1 == 1, false, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0] + i1);
            int k1 = class44_sub3_sub2.getBit(1, (byte) -96);
            if (k1 == 1)
                anIntArray1124[anInt1123++] = k;
        } while (true);
        class44_sub3_sub2.accessBytes(941);
        j = 7 / j;
    }

    public boolean method146(byte[] abyte0, int i, byte byte0) {
        if (byte0 != 9)
            anInt806 = aClass46_944.method542();
        if (abyte0 == null)
            return true;
        else
            return signlink.wavesave(abyte0, i);
    }

    public void method147(int i) {
        int j = 5;
        anIntArray885[8] = 0;
        anInt1219 += i;
        int k = 0;
        while (anIntArray885[8] == 0) {
            String s = "Unknown problem";
            method13("Connecting to web server", 20, 7);
            try {
                DataInputStream datainputstream = method84("crc" + (int) (Math.random() * 99999999D) + "-" + 274);
                Class44_Sub3_Sub2 class44_sub3_sub2 = new Class44_Sub3_Sub2(new byte[40], (byte) 1);
                datainputstream.readFully(class44_sub3_sub2.aByteArray1373, 0, 40);
                datainputstream.close();
                for (int i1 = 0; i1 < 9; i1++)
                    anIntArray885[i1] = class44_sub3_sub2.get4();

                int j1 = class44_sub3_sub2.get4();
                int k1 = 1234;
                for (int l1 = 0; l1 < 9; l1++)
                    k1 = (k1 << 1) + anIntArray885[l1];

                if (j1 != k1) {
                    s = "checksum problem";
                    anIntArray885[8] = 0;
                }
            } catch (EOFException _ex) {
                s = "EOF problem";
                anIntArray885[8] = 0;
            } catch (IOException _ex) {
                s = "connection problem";
                anIntArray885[8] = 0;
            } catch (Exception _ex) {
                s = "logic problem";
                anIntArray885[8] = 0;
                if (!signlink.reporterror)
                    return;
            }
            if (anIntArray885[8] == 0) {
                k++;
                for (int l = j; l > 0; l--) {
                    if (k >= 10) {
                        method13("Game updated - please reload page", 10, 7);
                        l = 10;
                    } else {
                        method13(s + " - Will retry in " + l + " secs.", 10, 7);
                    }
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception ignored) {
                    }
                }

                j *= 2;
                if (j > 60)
                    j = 60;
                aBoolean1053 = !aBoolean1053;
            }
        }
    }
}
