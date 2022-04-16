// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class9 {

    public final int anInt254;
    public final int[] anIntArray255;
    public final int[][] anIntArrayArray256;
    public Class9(int i, Class44_Sub3_Sub2 class44_sub3_sub2) {
        anInt254 = class44_sub3_sub2.get1();
        anIntArray255 = new int[anInt254];
        if (i != 10470) {
            for (int j = 1; j > 0; j++) ;
        }
        anIntArrayArray256 = new int[anInt254][];
        for (int k = 0; k < anInt254; k++)
            anIntArray255[k] = class44_sub3_sub2.get1();

        for (int l = 0; l < anInt254; l++) {
            int i1 = class44_sub3_sub2.get1();
            anIntArrayArray256[l] = new int[i1];
            for (int j1 = 0; j1 < i1; j1++)
                anIntArrayArray256[l][j1] = class44_sub3_sub2.get1();

        }

    }
}
