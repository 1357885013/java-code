class Demo3 
{
	public static void main(String[] args) 
	{
		Machine m = new Machine();

//		Card c = m.send();
//
//		c.zha();

//		Pai p = m.send();
//
//		p.win();


		Magic m1 = m.send();
		m1.gone();
	}
}


/*
����ֵ����
	����ȷ�ķ���ֵ  void
	��ȷ����ֵ    ��������   ���������� ��  ������  �ӿ�  ����


	�������ķ���ֵ����������ʱ�򣬷��ص���ֵӦ���Ǹ���Ķ�������������
	�������ķ���ֵ�����ǳ������ʱ�򣬷��ص�ֵӦ���Ǹó�������������

	�������ķ���ֵ�����ǽӿڵ�ʱ�򣬷��ص��Ǹýӿڵ��������



���ƻ�  ��  ��
*/

class Machine
{
//	public Card send(){
//		return new Card();
//	}


//	public Pai send(){
//		return new MaJiang();
//	}


	public Magic send(){
		return new Card();
	}
}

interface Magic
{
	public void gone();
}

abstract class Pai
{
	public abstract void win();
}


class MaJiang extends Pai
{
	public void win(){
		System.out.println("����");
	}

}

class Card extends Pai implements Magic
{
	public void zha(){
		System.out.println("��ը");
	}

	public void win(){
		System.out.println("˭��������˭Ӯ~~");
	}

	public void gone(){
		System.out.println("ֽ�Ʋ�����~~~~");
	}
}
