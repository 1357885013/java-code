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
                System.out.println("�����ڲ���   gone~~~");
            }
        };


        p.cool(m);
    }
}

/*
�� �� ��

ֵ���ݣ�ʵ����ʵ�Σ��β����β�
���ô��ݣ�ʵ�κ��β�ָ��ͬһ������

�������Ĳ������������ʱ�򣬴��ݵ�ʵ���Ǹ���Ķ������������󣨶�̬��

�������Ĳ��������ǳ������ʱ�򣬴��ݵ�ʵ���Ǹó������������󣨶�̬��

�������Ĳ��������ǽӿڵ�ʱ�򣬴��ݵ�ʵ��Ӧ���Ǹýӿڵ�������󣨶�̬��
*/
class Person {
    public void play(Card b) {
        b.zha();

    }


    public void fun(Pai p) {
        p.win();
    }

    //Magic m = new Card();//��̬
    public void cool(Magic m) {
        m.gone();
    }
}

abstract class Pai {
    public abstract void win();
}

class Card extends Pai implements Magic {
    public void zha() {
        System.out.println("��ը");
    }

    public void win() {
        System.out.println("˭�������������˭Ӯ");
    }

    public void gone() {
        System.out.println("ֽ�Ʋ�����");
    }
}

class MaJiang extends Pai {
    public void win() {
        System.out.println("����~~����");
    }
}
