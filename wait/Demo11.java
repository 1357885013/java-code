package wait;

class Demo11 {
    public static void main(String[] args) {
        //Demo11.java:5: ����: Animal�ǳ����; �޷�ʵ����
        //Animal a = new Animal();

        //���ö�̬ʵ�������������
        Animal a = new Cat1();

        a.eat();
    }
}
/*
���������������������

��ʽ
	abstract class{
		
	} 

���󷽷�---���� �����������Ϊ �������з�����
	abstract ����ֵ���� ������();


�ص�
	�������޷�ʵ����

	�������������̳е�

	�����������ص㣺
			Ҫô�ǳ�����
			Ҫô��д�����е����г��󷽷���


��Ա�ص�
	��Ա������һ���������п����з�+���󷽷�
				�г��󷽷���������ǳ�����

	���췽����
			�������й��췽�������ǳ����޷�ʵ������������ʲô��
			�������õġ�
			��Ϊ�������������̳еģ�����Ĺ��췽��Ĭ�ϵ��ø�����޲ι��췽�������Գ�����������޲ι��췽����


	��Ա������������,�����г�����

	
	
*/


abstract class Animal {
    int a = 20;

    Animal(int a) {
        this.a = a;
    }

    public abstract void eat();//����ǿ������ʵ�ֵ�

    public void sleep() {
        System.out.println("�����۾�˯��");
    }
}

class Cat1 extends Animal {
    Cat1() {
        super(20);
    }

    public void eat() {
        System.out.println("����");
    }
}