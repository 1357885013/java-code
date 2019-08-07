package newsSystem;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg) {
        newsManage nm = null;
        ArrayList<newsManage.Res> results;
        New new_ = new New();
        try {
            nm = new newsManage();
        } catch (ClassNotFoundException | IOException | SQLException e) {
            e.printStackTrace();
        }

        if (nm == null)
            System.exit(-1);
        printMenu();

        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "l":
                case "list":
                    results = nm.listTitle();
                    for (newsManage.Res res : results) {
                        System.out.println(res);
                    }
                    break;
                case "lm":
                case "lM":
                case "listMe":
                case "listme":
                    results = nm.listTitle();
                    for (newsManage.Res res : results) {
                        System.out.println(res);
                    }
                    break;
                case "a":
                case "add":
                    new_.clear();
                    scanner.nextLine();
                    System.out.println("Pleale type the title");
                    if (scanner.hasNextLine())
                        new_.setTitle(scanner.nextLine());
                    System.out.println("Pleale type the content");
                    if (scanner.hasNextLine())
                        new_.setContent(scanner.nextLine());
                    new_.setAuthur("ljj");
                    new_.setTime(new Date());

                    if (nm.add(new_) == 1)
                        System.out.println("add success");
                    else
                        System.out.println("add fail");
                    break;
                case "c":
                case "change":
                    System.out.println("Pleale type the id");
                    if (scanner.hasNext())
                        new_ = nm.query(Integer.parseInt(scanner.next()));
                    System.out.println("Pleale type the title,if you dont want to change title please press Enter directly");
                    String temp = scanner.nextLine();
                    if (temp.equals("")) {
                        if (scanner.hasNextLine())
                            temp = scanner.nextLine();
                        if (!temp.equals("")) {
                            new_.setTitle(temp);
                        }
                    } else {
                        new_.setTitle(temp);
                    }

                    System.out.println("Pleale type the content,if you dont want to change content please press Enter directly");
                    if (scanner.hasNextLine())
                        temp = scanner.nextLine();
                    if (!temp.equals(""))
                        new_.setContent(temp);

                    new_.setAuthur("ljj");
                    new_.setTime(new Date());

                    if (nm.update(new_) == 1)
                        System.out.println("add success");
                    else
                        System.out.println("add fail");
                    break;
                case "del":
                case "d":
                case "delete":
                    System.out.println("Pleale type the ID you want delete.");
                    if (scanner.hasNext())
                        if (1 == nm.delete(Integer.parseInt(scanner.next())))
                            System.out.println("you deleted it succesful");
                        else
                            System.out.println("you can't delete it for some reason");
                    break;
                case "v":
                case "view":
                    System.out.println("Pleale type the id you want view.");
                    if (scanner.hasNext())
                        new_ = nm.query(Integer.parseInt(scanner.next()));
                    System.out.println("new_.getTitle() = " + new_.getTitle());
                    System.out.println("new_.getAuthur() = " + new_.getAuthur());
                    System.out.println("new_.getTime() = " + new_.getTime());
                    System.out.println("new_.getContent() = " + new_.getContent());

                    break;
                case "q":
                case "quit":
                    System.out.println("Quiting");
                    return;
                default:
                    printMenu();
            }
        }
    }

    public static void printMenu() {
        System.out.println("Welcome to the news manger system.");
        System.out.println();
        System.out.println("Functions");
        System.out.println(" l | list : list all News");
        System.out.println(" lm|listMe : list News which you published");
        System.out.println(" a | add : add a new New");
        System.out.println(" c | change : change a New");
        System.out.println(" d | del | delete : delete one New");
        System.out.println(" v | view : view a  New by title");
        System.out.println(" q | quit : quit the system");
        System.out.println("please type code you need:");
    }

}