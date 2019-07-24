package wait;

class Demo11 {
    public static void main(String[] args) {
        //Demo11.java:5: 错误: Animal是抽象的; 无法实例化
        //Animal a = new Animal();

        //利用多态实例化抽象类对象
        Animal a = new Cat1();

        a.eat();
    }
}
/*
定义抽象类描述抽象事物

格式
	abstract class{
		
	} 

抽象方法---描述 描述不清的行为 ，不能有方法体
	abstract 返回值类型 方法名();


特点
	抽象类无法实例化

	抽象类用来被继承的

	抽象类子类特点：
			要么是抽象类
			要么重写父类中的所有抽象方法。


成员特点
	成员方法：一个抽象类中可以有非+抽象方法
				有抽象方法的类必须是抽象类

	构造方法：
			抽象类有构造方法，但是抽象无法实例化，用来做什么？
			给子类用的。
			因为抽象类用来被继承的，子类的构造方法默认调用父类的无参构造方法，所以抽象类必须有无参构造方法。


	成员变量：可以有,可以有常量。

	
	
*/


abstract class Animal {
    int a = 20;

    Animal(int a) {
        this.a = a;
    }

    public abstract void eat();//父类强制子类实现的

    public void sleep() {
        System.out.println("闭着眼睛睡觉");
    }
}

class Cat1 extends Animal {
    Cat1() {
        super(20);
    }

    public void eat() {
        System.out.println("吃鱼");
    }
}