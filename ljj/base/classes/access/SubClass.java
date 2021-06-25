package ljj.base.classes.access;

import ljj.base.classes.access.modifier.Main;

public class SubClass extends Main {
    private void test(){
        Main m = new Main();
//        m.d=1;
//        m.pro=1;
        m.pub=1;
        this.pro=1;
        this.pub=1;

    }
}
