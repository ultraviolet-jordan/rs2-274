// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class28 {

    public boolean aBoolean520;
    public boolean aBoolean521;
    public int anInt522;
    public final Class44 aClass44_523;
    public Class44 aClass44_524;

    public Class28(int i) {
        aBoolean520 = true;
        aBoolean521 = true;
        anInt522 = -676;
        aClass44_523 = new Class44();
        if (i >= 0)
            aBoolean520 = !aBoolean520;
        aClass44_523.aClass44_761 = aClass44_523;
        aClass44_523.aClass44_762 = aClass44_523;
    }

    public void method256(Class44 class44) {
        if (class44.aClass44_762 != null)
            class44.method404();
        class44.aClass44_762 = aClass44_523.aClass44_762;
        class44.aClass44_761 = aClass44_523;
        class44.aClass44_762.aClass44_761 = class44;
        class44.aClass44_761.aClass44_762 = class44;
    }

    public void method257(boolean flag, Class44 class44) {
        if (class44.aClass44_762 != null)
            class44.method404();
        class44.aClass44_762 = aClass44_523;
        class44.aClass44_761 = aClass44_523.aClass44_761;
        class44.aClass44_762.aClass44_761 = class44;
        if (flag)
            anInt522 = 91;
        class44.aClass44_761.aClass44_762 = class44;
    }

    public Class44 method258() {
        Class44 class44 = aClass44_523.aClass44_761;
        if (class44 == aClass44_523) {
            return null;
        } else {
            class44.method404();
            return class44;
        }
    }

    public Class44 method259() {
        Class44 class44 = aClass44_523.aClass44_761;
        if (class44 == aClass44_523) {
            aClass44_524 = null;
            return null;
        } else {
            aClass44_524 = class44.aClass44_761;
            return class44;
        }
    }

    public Class44 method260(boolean flag) {
        Class44 class44 = aClass44_523.aClass44_762;
        if (flag)
            aBoolean521 = !aBoolean521;
        if (class44 == aClass44_523) {
            aClass44_524 = null;
            return null;
        } else {
            aClass44_524 = class44.aClass44_762;
            return class44;
        }
    }

    public Class44 method261(byte byte0) {
        Class44 class44 = aClass44_524;
        if (class44 == aClass44_523) {
            aClass44_524 = null;
            return null;
        }
        aClass44_524 = class44.aClass44_761;
        if (byte0 == 0)
            byte0 = 0;
        else
            aBoolean521 = !aBoolean521;
        return class44;
    }

    public Class44 method262(boolean flag) {
        if (flag)
            throw new NullPointerException();
        Class44 class44 = aClass44_524;
        if (class44 == aClass44_523) {
            aClass44_524 = null;
            return null;
        } else {
            aClass44_524 = class44.aClass44_762;
            return class44;
        }
    }

    public void method263() {
        if (aClass44_523.aClass44_761 == aClass44_523)
            return;
        do {
            Class44 class44 = aClass44_523.aClass44_761;
            if (class44 == aClass44_523)
                return;
            class44.method404();
        } while (true);
    }
}
