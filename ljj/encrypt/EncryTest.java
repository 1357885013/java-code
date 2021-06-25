package ljj.encrypt;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Random;

class EncryTest {
    @Test //登录的密码加密
    public void testEncodePassword() {
        String mac = "28:D1:27:13:2F:01";
        long e = 4895038726872234000L;
        String password = "123123";
        String enCodePassword = EncryptUtils.encPassword(mac, e, password);
        System.out.println(enCodePassword);
    }

    @Test
    public void rsaGenKeys() {
        //访问页面产生一对公钥私钥
        Map<String, Object> keyMap;
        String publicKey = null;
        String privateKey = null;
        try {
            keyMap = RSAUtils.genKeyPair();
            publicKey = RSAUtils.getPublicKey(keyMap);
            privateKey = RSAUtils.getPrivateKey(keyMap);
        } catch (Exception e) {
            System.out.println("生产密钥对失败");
            e.printStackTrace();
        }
        System.out.println("publicKey:" + publicKey);
        System.out.println("privateKey:" + privateKey);
    }

    @Test
    public void rsaDecode() {
        //JS加密后的密文
        String password = "qCVHlVxjba7H9dN6efayrNpnYZ9m8o7oig4DqkRoAozOYqUjqB3QZ7H2IUO2PL/cIS+KuHg2vqZe6JCMNjYYo3micLoWBedfmne8bLUcj0xEXBJN7uV1wZj5+DpWXyLJvJhee7gkl7EJ+eHZ3SJdXSeKKb4Akjr5PHz/bFB+wjU=";
        //私钥
        String privateKey = "MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAKpULVE8M+KjJDcWH0OMizlGl351EKoLIvqb+ulbm70mfbDj3cpRYfUUFwGyXYX/RDunQNkUikbPPYFTEdhjsZzCSs8VitfclsiGQoCCmdEnZYaKdoi/gwwwg1TDi8o+IiQJeP16bs0jHLlLjInovxZYnt/0u/lnkrQaX6Xtrg61AgMBAAECgYBbtb08yzSIqBy8yF2HCmqAKWEyhqe1Vw+7bjbYZSni25G7p8VoxQ8AXZPRpw8yMfK0R+bju2qEm9tbAbZPE8ayYnQdHG4uFBaPYz5BWZE5YdMOmvYB6ycvdn500/MsvkeOtIeNCwO5aBxiTFxor7VgXLeseqV7vrc4972dlgE4tQJBAP+ZpMhMMZp/GA+NF/f/wdb43OO+C1XdfrEeGSPMGv+0HdS+uFlZTj+kbFI2uaHhihsgLQrOhuWj3TUMI98XLT8CQQCqmGLR5YVEx4jtLppJ8WEAuFd0S543u6HBXwNhw4ZJiOGxI2UnsdzLu9cBbSqa/dh8yRaQNwmADAVBFKSSIKMLAkEAsrO9Hb0HwTiynczLwTwzThVYenHYgwQFG9grQ3fkOHq5kJB3WyCxMJXIlgJk7uU9JZHta+zRK6TRd9ExEzylCQJBAI6i0x1EluUnIKmPaZmhpMWBXD30a9mVnG2eD6nSXZlmRa5iNdW2tTHzYJXkvNbSoAvV5nO2UM8rPclohSFZAHkCQQCkzwlC9exoNMaQzortkLy39ViSi16BuoZ3IPgP5dblOEILMpnoQoU/S9nzykkbIrUfzgEpo4fzvgeFKh6JTGwx";
        String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCqVC1RPDPioyQ3Fh9DjIs5Rpd+dRCqCyL6m/rpW5u9Jn2w493KUWH1FBcBsl2F/0Q7p0DZFIpGzz2BUxHYY7GcwkrPFYrX3JbIhkKAgpnRJ2WGinaIv4MMMINUw4vKPiIkCXj9em7NIxy5S4yJ6L8WWJ7f9Lv5Z5K0Gl+l7a4OtQIDAQAB";

        try {
            //解密后的明文
            byte[] decodedData = RSAUtils.decryptByPrivateKey(Base64Utils.decode(password), privateKey);
            password = new String(decodedData);
            System.out.println(password);
        } catch (Exception e) {
            System.out.println("登录解密异常");
        }
    }

    @Test // 混淆密码
    public void mix() {
        String mac = "28:D1:27:13:2F:01";
        long time = new Random().nextLong();
        time = 945613860435387L;
        long code = 954178L;

        System.out.println(EncryptUtils.mix(mac, time, code));
    }

    @Test
    public void fdsf() {
        Long fdfd = 954178L * 954178L;
        System.out.println(fdfd);
        System.out.println(7318556822416965000L - fdfd);
    }

    @Test
    public void decCodePassword() throws Exception {
        String en = "FSrT3c6fW3d6UtOOy87yHcUYF4LkXwgY1korXnuk9Qx8rlMF5KJzaaXbkddp5FDmx3VNWra1oCltOsC8i+QXSpkgwq5WgPXDd4Lz0cDThT2KpBl7GSit1/nj73p1zAPBRpeGFdacRHyxlLWWLQKX4cCeDPk2uvXxT8qxpP6CMgM=";
        String newPassword = RSAUtils.decPassword(en);
        System.out.println(newPassword);
    }
    @Test
    public void encCodePassword() throws Exception {
        String password = "123123";

        String en = "FSrT3c6fW3d6UtOOy87yHcUYF4LkXwgY1korXnuk9Qx8rlMF5KJzaaXbkddp5FDmx3VNWra1oCltOsC8i+QXSpkgwq5WgPXDd4Lz0cDThT2KpBl7GSit1/nj73p1zAPBRpeGFdacRHyxlLWWLQKX4cCeDPk2uvXxT8qxpP6CMgM=";
        en=RSAUtils.encPassword(password);
        System.out.println(en);
        String newPassword = RSAUtils.decPassword(en);
        System.out.println(newPassword);
    }

    @Test
    public void testSHA256() {
        System.out.println(SHAUtils.getSHA256("123123"));
    }
}
