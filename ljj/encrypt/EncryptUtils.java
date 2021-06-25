package ljj.encrypt;

import java.util.Random;

public class EncryptUtils {
    public static long code = 954178L;
    public static String encPassword(String mac,Long random,String password){
       String mixCode = mix(mac,random,code);
        System.out.println(mixCode);
       return SHAUtils.getSHA256(password+mixCode);
    }
    public static String mix(String mac, long code) {
        long time = new Random().nextLong();
        return mix(mac, time, code);
    }

    public static String mix(String mac, Long random, Long code) {
        long fdsf=code*code;
        random = (long) (random - fdsf);
        String timeS = Long.toString(random);
        random += random % ((Integer.parseInt(timeS.substring(timeS.length() - 2))) + code);
        random = Math.abs(random);
        timeS = String.valueOf(random);
        timeS = timeS.substring(timeS.length() - 6);
        String[] split = timeS.split("");
        StringBuilder result = new StringBuilder();
        for (String s : split) {
            int ss = Integer.parseInt(s);
            while (ss > mac.length())
                ss -= mac.length();
            result.append(mac, ss, ss + 1);
        }
        return result.toString();
    }

    public static String byte2Hex(byte[] bytes) {
        StringBuilder stringBuffer = new StringBuilder();
        String temp = null;
        for (byte aByte : bytes) {
            temp = Integer.toHexString(aByte & 0xFF);
            if (temp.length() == 1) {
                //1得到一位的进行补0操作
                stringBuffer.append("0");
            }
            stringBuffer.append(temp);
        }
        return stringBuffer.toString();
    }
}
