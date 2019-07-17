package DVD;

public class DvdManger {
	private Dvd[] dvds = new Dvd[50];
	private int count=0; //count 指向的是永远是空或越界
	
	public boolean borrowDvd(String name)
	{
		int state = checkDvd(name);
		if(state==-1)
			return false;
		else if(state==0)
			return false;
		else if(state==1)
		{
			int index = indexOf(name);
			dvds[index].out=true;
			dvds[index].setTime();
			return true;
		}
		
		return false;
	}
	public boolean returnDvd(String name)
	{
		int state = checkDvd(name);
		if(state==-1)
			return false;
		else if(state==1)
			return false;
		else if(state==0)
		{
			int index = indexOf(name);
			dvds[index].out=false;
			dvds[index].setTime();
			dvds[index].addCount();
			return true;
		}
		
		return false;
	}
	public void listDvd()
	{
		System.out.println("name \t is_lend_out \t Lending_frequency \t lend_time");
		for(int i=0;i<count;i++)
		{
			System.out.println(dvds[i].getName()  +"\t\t"+ dvds[i].out+"\t\t"+ dvds[i].getCount()+"\t\t"+ dvds[i].getTime());
		}
	}
	public void listDvdCanBorrow()
	{
		for(int i=0;i<count;i++)
		{
			if(dvds[i].out==false)
				System.out.println(dvds[i].getName());
		}
	}
	public boolean addDvd(String name)
	{
		Dvd dvd = new Dvd(name);
		dvds[count]=dvd;
		count++;
		return true;
	}
	public boolean deleteDvd(String name)
	{
		int index = indexOf(name);
		dvds[index]=dvds[count-1];
		count--;
		return true;
	}
	public byte checkDvd(String name)
	{
		int index = indexOf(name);
		if(index == -1)
			return -1;
		else if(dvds[index].out==true)
			return 0;
		else if(dvds[index].out==false)
			return 1;
		else
			return -1;
	}
	private int indexOf(String name)
	{
		for(int i=0;i<count;i++)
		{
			if(dvds[i].getName().equals(name))
				return i;
		}
		return -1;
	}
	
}
