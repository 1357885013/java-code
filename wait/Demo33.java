class Demo33 
{
	public static void main(String[] args) 
	{
		CuteCat c = new CuteCat();

		c.eat();
		c.speakEnglish();
	}
}


/*
格式
	interface 接口名{
		
	}

	class 类名 implements 接口{
		
	}
*/


interface AnimalSkill
{
	//只有规则：方法的声明
	public abstract void speakEnglish();
}


abstract class Animal1
{
	public abstract void eat();
}



class Cat extends Animal1
{
	public void eat(){
		System.out.println("吃鱼");
	}
}

//Demo33.java:42: 错误: CuteCat不是抽象的, 并且未覆盖AnimalSkill中的抽象方法speakEnglish()
class CuteCat extends Cat implements AnimalSkill
{
	public void speakEnglish(){
		System.out.println("how are you ~");
	}
}

class Dog extends Animal1
{
	public void eat(){
		System.out.println("吃骨头");
	}
}


