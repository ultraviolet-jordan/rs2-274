// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class44_Sub3_Sub4_Sub6 extends Class44_Sub3_Sub4 {

    public boolean aBoolean1598;
    public int anInt1599;
    public int anInt1600;
    public int anInt1601;
    public boolean aBoolean1602;
    public int anInt1603;
    public int anInt1604;
    public int anInt1605;
    public int anInt1606;
    public int anInt1607;
    public int anInt1608;
    public int anInt1609;
    public int anInt1610;
    public String aString1611;
    public int anInt1612;
    public int anInt1613;
    public int anInt1614;
    public final int[] anIntArray1615;
    public final int[] anIntArray1616;
    public final int[] anIntArray1617;
    public int anInt1618;
    public int anInt1619;
    public int anInt1620;
    public int anInt1621;
    public int anInt1622;
    public int anInt1623;
    public int anInt1624;
    public int anInt1625;
    public int anInt1626;
    public int anInt1627;
    public int anInt1628;
    public int anInt1629;
    public int anInt1630;
    public int anInt1631;
    public int anInt1632;
    public int anInt1633;
    public int anInt1634;
    public int anInt1635;
    public int anInt1636;
    public int anInt1637;
    public int anInt1638;
    public int anInt1639;
    public int anInt1640;
    public int anInt1641;
    public int anInt1642;
    public int anInt1643;
    public int anInt1644;
    public int anInt1645;
    public int anInt1646;
    public int anInt1647;
    public int anInt1648;
    public final int[] anIntArray1649;
    public final int[] anIntArray1650;
    public final boolean[] aBooleanArray1651;
    public int anInt1652;
    public int anInt1653;
    public Class44_Sub3_Sub4_Sub6() {
        aBoolean1598 = true;
        aBoolean1602 = false;
        anInt1603 = 1;
        anInt1604 = -1;
        anInt1605 = -1;
        anInt1606 = -1;
        anInt1607 = -1;
        anInt1608 = -1;
        anInt1609 = -1;
        anInt1610 = -1;
        anInt1612 = 100;
        anIntArray1615 = new int[4];
        anIntArray1616 = new int[4];
        anIntArray1617 = new int[4];
        anInt1618 = -1000;
        anInt1621 = -1;
        anInt1624 = -1;
        anInt1627 = -1;
        anInt1632 = -1;
        anInt1645 = 200;
        anInt1647 = 32;
        anIntArray1649 = new int[10];
        anIntArray1650 = new int[10];
        aBooleanArray1651 = new boolean[10];
    }

    public void method529(int i, boolean flag, boolean flag1, int j) {
        if (anInt1627 != -1 && Class26.aClass26Array497[anInt1627].anInt510 == 1)
            anInt1627 = -1;
        if (!flag) {
            int k = i - anIntArray1649[0];
            int l = j - anIntArray1650[0];
            if (k >= -8 && k <= 8 && l >= -8 && l <= 8) {
                if (anInt1648 < 9)
                    anInt1648++;
                for (int i1 = anInt1648; i1 > 0; i1--) {
                    anIntArray1649[i1] = anIntArray1649[i1 - 1];
                    anIntArray1650[i1] = anIntArray1650[i1 - 1];
                    aBooleanArray1651[i1] = aBooleanArray1651[i1 - 1];
                }

                anIntArray1649[0] = i;
                anIntArray1650[0] = j;
                aBooleanArray1651[0] = false;
                return;
            }
        }
        anInt1648 = 0;
        anInt1653 = 0;
        anInt1652 = 0;
        anIntArray1649[0] = i;
        if (flag1)
            aBoolean1598 = !aBoolean1598;
        anIntArray1650[0] = j;
        anInt1599 = anIntArray1649[0] * 128 + anInt1603 * 64;
        anInt1600 = anIntArray1650[0] * 128 + anInt1603 * 64;
    }

    public void method530(boolean flag, int i, boolean flag1) {
        int j = anIntArray1649[0];
        int k = anIntArray1650[0];
        if (i == 0) {
            j--;
            k++;
        }
        if (i == 1)
            k++;
        if (i == 2) {
            j++;
            k++;
        }
        if (i == 3)
            j--;
        if (i == 4)
            j++;
        if (i == 5) {
            j--;
            k--;
        }
        if (i == 6)
            k--;
        if (i == 7) {
            j++;
            k--;
        }
        if (anInt1627 != -1 && Class26.aClass26Array497[anInt1627].anInt510 == 1)
            anInt1627 = -1;
        if (anInt1648 < 9)
            anInt1648++;
        for (int l = anInt1648; l > 0; l--) {
            anIntArray1649[l] = anIntArray1649[l - 1];
            anIntArray1650[l] = anIntArray1650[l - 1];
            aBooleanArray1651[l] = aBooleanArray1651[l - 1];
        }

        anIntArray1649[0] = j;
        if (!flag)
            aBoolean1598 = !aBoolean1598;
        anIntArray1650[0] = k;
        aBooleanArray1651[0] = flag1;
    }

    public void method531(boolean flag) {
        anInt1648 = 0;
        anInt1653 = 0;
        if (!flag) ;
    }

    public boolean method532(int i) {
        if (i != 0)
            throw new NullPointerException();
        else
            return false;
    }

    public void method533(int i, byte byte0, int j, int k) {
        for (int l = 0; l < 4; l++)
            if (anIntArray1617[l] <= i) {
                anIntArray1615[l] = j;
                anIntArray1616[l] = k;
                anIntArray1617[l] = i + 70;
                return;
            }

        if (byte0 == 8) ;
    }
}
