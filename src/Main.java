import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     /* ZooManagment zm = new ZooManagment();
        Scanner sc = new Scanner(System.in);
        System.out.println("zooName : ");
       zm.zooName = sc.nextLine();
        System.out.println("nbrCages : ");
        zm.nbCages = sc.nextInt();
        System.out.println("zooName : "+zm.zooName);

        System.out.println("nbrCages : "+zm.nbCages);
        System.out.println("Zoo "+zm);
        ZooManagment zm2 = new ZooManagment("my Zoo",80);

System.out.println(zm2);*/
        Animal chat = new Animal();
        Animal chien = new Animal();
        Zoo zoo = new Zoo();
       chat.name="Michou";
       chat.age=1;
       chat.isMammal=true;
       chien.name="loulou";
       chien.age=2;
       chien.isMammal=true;
       Animal lion = new Animal("Chat","simba",15,true);
        System.out.println(lion);
        Zoo zoo2 = new Zoo("frigya","sousse",100);
        System.out.println(zoo2);
        zoo2.displayZoo();
        System.out.println(zoo2.addAnimal(chat));
        zoo2.affiche();
        System.out.println(zoo2.searchAnimal(chat));
        System.out.println(zoo2.addAnimal(lion));
        System.out.println(zoo2.addAnimal(new Animal("Chat","katis",23,true)));
        zoo2.affiche();

       System.out.println(zoo2.removeAnimal(chat));

System.out.println(zoo2.isZooFull());
System.out.println(Zoo.comparerZoo(zoo2,zoo));

    }
}