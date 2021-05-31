package encrypt;

import myCode.string.StringUtil;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Base64 {
    private static final Base64Encoder encoder = new Base64Encoder();

    public Base64() {
    }

    public static String toBase64String(byte[] var0) {
        return toBase64String(var0, 0, var0.length);
    }

    public static String toBase64String(byte[] var0, int var1, int var2) {
        byte[] var3 = new byte[0];
        try {
            var3 = encode(var0, var1, var2);
        } catch (EncoderException e) {
            e.printStackTrace();
        }
        return StringUtil.fromByteArray(var3);
    }

    public static byte[] encode(byte[] var0) throws EncoderException {
        return encode(var0, 0, var0.length);
    }

    public static byte[] encode(byte[] var0, int var1, int var2) throws EncoderException {
        int var3 = (var2 + 2) / 3 * 4;
        ByteArrayOutputStream var4 = new ByteArrayOutputStream(var3);

        try {
            encoder.encode(var0, var1, var2, var4);
        } catch (Exception var6) {
            throw new EncoderException("exception encoding base64 string: " + var6.getMessage(), var6);
        }

        return var4.toByteArray();
    }

    public static int encode(byte[] var0, OutputStream var1) throws IOException {
        return encoder.encode(var0, 0, var0.length, var1);
    }

    public static int encode(byte[] var0, int var1, int var2, OutputStream var3) throws IOException {
        return encoder.encode(var0, var1, var2, var3);
    }

    public static byte[] decode(byte[] var0) throws DecoderException {
        int var1 = var0.length / 4 * 3;
        ByteArrayOutputStream var2 = new ByteArrayOutputStream(var1);

        try {
            encoder.decode(var0, 0, var0.length, var2);
        } catch (Exception var4) {
            throw new DecoderException("unable to decode base64 data: " + var4.getMessage(), var4);
        }

        return var2.toByteArray();
    }

    public static byte[] decode(String var0) throws DecoderException {
        int var1 = var0.length() / 4 * 3;
        ByteArrayOutputStream var2 = new ByteArrayOutputStream(var1);

        try {
            encoder.decode(var0, var2);
        } catch (Exception var4) {
            throw new DecoderException("unable to decode base64 string: " + var4.getMessage(), var4);
        }

        return var2.toByteArray();
    }

    public static int decode(String var0, OutputStream var1) throws IOException {
        return encoder.decode(var0, var1);
    }

    public static int decode(byte[] var0, int var1, int var2, OutputStream var3) throws DecoderException {
        try {
            return encoder.decode(var0, var1, var2, var3);
        } catch (Exception var5) {
            throw new DecoderException("unable to decode base64 data: " + var5.getMessage(), var5);
        }
    }
}

