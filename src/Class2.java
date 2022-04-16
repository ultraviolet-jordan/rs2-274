// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class2 {

    public static final float[][] aFloatArrayArray59 = new float[2][8];
    public static final int[][] anIntArrayArray60 = new int[2][8];
    public static float aFloat61;
    public static int anInt62;
    public int anInt52;
    public boolean aBoolean53;
    public final byte aByte54;
    public final int[] anIntArray55;
    public final int[][][] anIntArrayArrayArray56;
    public final int[][][] anIntArrayArrayArray57;
    public final int[] anIntArray58;
    public Class2() {
        anInt52 = 181;
        aBoolean53 = true;
        aByte54 = 1;
        anIntArray55 = new int[2];
        anIntArrayArrayArray56 = new int[2][2][4];
        anIntArrayArrayArray57 = new int[2][2][4];
        anIntArray58 = new int[2];
    }

    public float method152(int i, int j, int k, float f) {
        float f1 = (float) anIntArrayArrayArray57[k][0][i] + f * (float) (anIntArrayArrayArray57[k][1][i] - anIntArrayArrayArray57[k][0][i]);
        j = 49 / j;
        f1 *= 0.001525879F;
        return 1.0F - (float) Math.pow(10D, -f1 / 20F);
    }

    public float method153(byte byte0, float f) {
        if (byte0 != -81) {
            throw new NullPointerException();
        } else {
            float f1 = 32.7032F * (float) Math.pow(2D, f);
            return (f1 * 3.141593F) / 11025F;
        }
    }

    public float method154(byte byte0, int i, int j, float f) {
        float f1 = (float) anIntArrayArrayArray56[i][0][j] + f * (float) (anIntArrayArrayArray56[i][1][j] - anIntArrayArrayArray56[i][0][j]);
        if (byte0 != aByte54)
            anInt52 = -228;
        f1 *= 0.0001220703F;
        return method153((byte) -81, f1);
    }

    public int method155(int i, float f, byte byte0) {
        if (byte0 == 1)
            byte0 = 0;
        else
            aBoolean53 = !aBoolean53;
        if (i == 0) {
            float f1 = (float) anIntArray58[0] + (float) (anIntArray58[1] - anIntArray58[0]) * f;
            f1 *= 0.003051758F;
            aFloat61 = (float) Math.pow(0.10000000000000001D, f1 / 20F);
            anInt62 = (int) (aFloat61 * 65536F);
        }
        if (anIntArray55[i] == 0)
            return 0;
        float f2 = method152(0, 680, i, f);
        aFloatArrayArray59[i][0] = -2F * f2 * (float) Math.cos(method154((byte) 1, i, 0, f));
        aFloatArrayArray59[i][1] = f2 * f2;
        for (int j = 1; j < anIntArray55[i]; j++) {
            float f3 = method152(j, 680, i, f);
            float f4 = -2F * f3 * (float) Math.cos(method154((byte) 1, i, j, f));
            float f5 = f3 * f3;
            aFloatArrayArray59[i][j * 2 + 1] = aFloatArrayArray59[i][j * 2 - 1] * f5;
            aFloatArrayArray59[i][j * 2] = aFloatArrayArray59[i][j * 2 - 1] * f4 + aFloatArrayArray59[i][j * 2 - 2] * f5;
            for (int i1 = j * 2 - 1; i1 >= 2; i1--)
                aFloatArrayArray59[i][i1] += aFloatArrayArray59[i][i1 - 1] * f4 + aFloatArrayArray59[i][i1 - 2] * f5;

            aFloatArrayArray59[i][1] += aFloatArrayArray59[i][0] * f4 + f5;
            aFloatArrayArray59[i][0] += f4;
        }

        if (i == 0) {
            for (int k = 0; k < anIntArray55[0] * 2; k++)
                aFloatArrayArray59[0][k] *= aFloat61;

        }
        for (int l = 0; l < anIntArray55[i] * 2; l++)
            anIntArrayArray60[i][l] = (int) (aFloatArrayArray59[i][l] * 65536F);

        return anIntArray55[i] * 2;
    }

    public void method156(Class44_Sub3_Sub2 class44_sub3_sub2, byte byte0, Class1 class1) {
        int i = class44_sub3_sub2.get1();
        anIntArray55[0] = i >> 4;
        anIntArray55[1] = i & 0xf;
        if (byte0 != 6) {
            for (int j = 1; j > 0; j++) ;
        }
        if (i != 0) {
            anIntArray58[0] = class44_sub3_sub2.get2();
            anIntArray58[1] = class44_sub3_sub2.get2();
            int k = class44_sub3_sub2.get1();
            for (int l = 0; l < 2; l++) {
                for (int i1 = 0; i1 < anIntArray55[l]; i1++) {
                    anIntArrayArrayArray56[l][0][i1] = class44_sub3_sub2.get2();
                    anIntArrayArrayArray57[l][0][i1] = class44_sub3_sub2.get2();
                }

            }

            for (int j1 = 0; j1 < 2; j1++) {
                for (int k1 = 0; k1 < anIntArray55[j1]; k1++)
                    if ((k & 1 << j1 * 4 << k1) != 0) {
                        anIntArrayArrayArray56[j1][1][k1] = class44_sub3_sub2.get2();
                        anIntArrayArrayArray57[j1][1][k1] = class44_sub3_sub2.get2();
                    } else {
                        anIntArrayArrayArray56[j1][1][k1] = anIntArrayArrayArray56[j1][0][k1];
                        anIntArrayArrayArray57[j1][1][k1] = anIntArrayArrayArray57[j1][0][k1];
                    }

            }

            if (k != 0 || anIntArray58[1] != anIntArray58[0])
                class1.method149(class44_sub3_sub2, 9);
        } else {
            anIntArray58[0] = anIntArray58[1] = 0;
        }
    }

}
