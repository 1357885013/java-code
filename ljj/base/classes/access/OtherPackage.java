package ljj.base.classes.access;

import ljj.base.classes.access.modifier.Main;

public class OtherPackage {
    public void test(){
        Main m = new Main();
//        m.d=1;
//        m.pro=1;
        m.pub=1;
    }
}
