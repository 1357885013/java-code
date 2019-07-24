class Demo2 
{
	public static void main(String[] args) 
	{
		int a = 12;
		int b = 78;

		sum(a,b);

		System.out.println(a+"  "+b);//12 78


		Student s = new Student();
		s.name = "111";
		
		test(s);

		System.out.println(s.name);//222
	}


	public static void test(Student s){
		s.name = "222";
		System.out.println(s.name);//222
	}


	public static void sum(int a,int b){
		int sum = a+b;
		a++;
		b++;
		System.out.println(a+"  "+b);//13 79
	}
}

class Student 
{
	String name;
}


