interface Magic {
    public void gone();
}

class Demo1 {
    public static void main(String[] args) {
        Person p = new Person();

        Card c = new Card();

        p.play(c);


        p.fun(c);


        p.cool(c);


        Magic m = new Magic() {
            public void gone() {
                System.out.println("匿名内部类   gone~~~");
            }
        };


        p.cool(m);
    }
}

/*
人 打 牌

值传递：实参是实参，形参是形参
引用传递：实参和形参指向同一个对象

当方法的参数类型是类的时候，传递的实参是该类的对象或者子类对象（多态）

当方法的参数类型是抽象类的时候，传递的实参是该抽象类的子类对象（多态）

当方法的参数类型是接口的时候，传递的实参应该是该接口的子类对象（多态）
*/
class Person {
    public void play(Card b) {
        b.zha();

    }


    public void fun(Pai p) {
        p.win();
    }

    //Magic m = new Card();//多态
    public void cool(Magic m) {
        m.gone();
    }
}

abstract class Pai {
    public abstract void win();
}

class Card extends Pai implements Magic {
    public void zha() {
        System.out.println("王炸");
    }

    public void win() {
        System.out.println("谁的牌先走完就是谁赢");
    }

    public void gone() {
        System.out.println("纸牌不见了");
    }
}

class MaJiang extends Pai {
    public void win() {
        System.out.println("胡了~~！！");
    }
}
