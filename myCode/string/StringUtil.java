package myCode.string;

public class StringUtil {
    public static String fromByteArray(byte[] var0) {
        return new String(asCharArray(var0));
    }

    public static char[] asCharArray(byte[] var0) {
        char[] var1 = new char[var0.length];

        for(int var2 = 0; var2 != var1.length; ++var2) {
            var1[var2] = (char)(var0[var2] & 255);
        }

        return var1;
    }
}
