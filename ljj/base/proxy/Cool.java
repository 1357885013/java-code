package myCode.proxy;

import javax.xml.ws.RequestWrapper;

public class Cool implements CoolInterface {
    @Override
    @RequestWrapper
    public String out(String a, String b) {
        return a + b;
    }
}
