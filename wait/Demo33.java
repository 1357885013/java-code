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
��ʽ
	interface �ӿ���{
		
	}

	class ���� implements �ӿ�{
		
	}
*/


interface AnimalSkill
{
	//ֻ�й��򣺷���������
	public abstract void speakEnglish();
}


abstract class Animal1
{
	public abstract void eat();
}



class Cat extends Animal1
{
	public void eat(){
		System.out.println("����");
	}
}

//Demo33.java:42: ����: CuteCat���ǳ����, ����δ����AnimalSkill�еĳ��󷽷�speakEnglish()
class CuteCat extends Cat implements AnimalSkill
{
	public void speakEnglish(){
		System.out.println("how are you ~");
	}
}

class Dog extends Animal1
{
	public void eat(){
		System.out.println("�Թ�ͷ");
	}
}


