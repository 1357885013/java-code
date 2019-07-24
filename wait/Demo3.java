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
返回值问题
	不明确的返回值  void
	明确返回值    数据类型   基本，引用 类  抽象类  接口  数组


	当方法的返回值类型类名的时候，返回的是值应该是该类的对象或者子类对象
	当方法的返回值类型是抽象类的时候，返回的值应该是该抽象类的子类对象。

	当方法的返回值类型是接口的时候，返回的是该接口的子类对象。



发牌机  发  牌
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
		System.out.println("胡了");
	}

}

class Card extends Pai implements Magic
{
	public void zha(){
		System.out.println("王炸");
	}

	public void win(){
		System.out.println("谁的牌跑完谁赢~~");
	}

	public void gone(){
		System.out.println("纸牌不见了~~~~");
	}
}
