package DVD;

import java.util.Scanner;

public class DvdMain {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] arg)
	{
		DvdManger dm=new DvdManger();
		
		printMenu();
		
		dm.addDvd("book1");
		dm.addDvd("book2");
		
		while(scanner.hasNext())
		{
			switch(scanner.next())
			{
				case "b":
				case "borrow":
					System.out.println("Pleale type the name you want borrow.");
					if(scanner.hasNext())
						if(dm.borrowDvd(scanner.next()))
							System.out.println("you borrow succesful");
						else
							System.out.println("you can't borrow ");
					break;
				case "r":
				case "return":
					System.out.println("Pleale type the name you want return.");
					if(scanner.hasNext())
						if(dm.returnDvd(scanner.next()))
							System.out.println("you returned succesful");
						else
							System.out.println("you can't return ");
					break;
				case "l":
				case "list":
					dm.listDvd();
					break;
				case "listValue":
					dm.listDvdCanBorrow();
					break;
				case "a":
				case "add":
					System.out.println("Pleale type the name you want add.");
					if(scanner.hasNext())
						if(dm.addDvd(scanner.next()))
							System.out.println("you added a new book succesful");
						else
							System.out.println("you can't add ");
					else
						System.out.println("...");
					break;
				case "del":
				case "d":
				case "delete":
					System.out.println("Pleale type the name you want delete.");
					if(scanner.hasNext())
						if(dm.deleteDvd(scanner.next()))
							System.out.println("you deleted a DVD succesful");
						else
							System.out.println("you can't delete it for some reason");
					break;
				case "c":
				case "check":
					System.out.println("Pleale type the name you want check.");
					if(scanner.hasNext())
						switch(dm.checkDvd(scanner.next()))
						{
						case -1:
							System.out.println("we don't have the book ");
							break;
						case 0:
							System.out.println("The book has been lent out:");
							break;
						case 1:
							System.out.println("you can borrow the book now: ");
							break;
						}
					break;
				default :
					System.out.println("Exiting");
					return;
			}
		}
	}
	
	public static void printMenu()
	{
		System.out.println("Welcome to the DVD manger system.");
		System.out.println();
		System.out.println("Functions");
		System.out.println(" 1 : borrow DVD");
		System.out.println(" 2 : return DVD");
		System.out.println(" 3 : list all  DVD");
		System.out.println(" 4 : list DVD which can borrow");
		System.out.println(" 5 : add a new DVD");
		System.out.println(" 6 : delete a new DVD");
		System.out.println(" 7 : check DVD");
		System.out.println("please type the num you need:");
	}
}
