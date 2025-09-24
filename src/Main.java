import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      ZooManagment zm = new ZooManagment();
        Scanner sc = new Scanner(System.in);
        System.out.println("zooName : ");
       zm.zooName = sc.nextLine();
        System.out.println("nbrCages : ");
        zm.nbCages = sc.nextInt();
        System.out.println("zooName : "+zm.zooName);

        System.out.println("nbrCages : "+zm.nbCages);
        System.out.println("Zoo "+zm);
        ZooManagment zm2 = new ZooManagment("my Zoo",80);

System.out.println(zm2);
    }
}