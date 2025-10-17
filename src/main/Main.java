package main;

import entites.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     /* main.ZooManagment zm = new main.ZooManagment();
        Scanner sc = new Scanner(System.in);
        System.out.println("zooName : ");
       zm.zooName = sc.nextLine();
        System.out.println("nbrCages : ");
        zm.nbCages = sc.nextInt();
        System.out.println("zooName : "+zm.zooName);

        System.out.println("nbrCages : "+zm.nbCages);
        System.out.println("entites.Zoo "+zm);
        main.ZooManagment zm2 = new main.ZooManagment("my entites.Zoo",80);

System.out.println(zm2);*/
        Animal chat = new Animal();
        Animal chien = new Animal();
        Zoo zoo = new Zoo();
       chat.setName("Michou");
       chat.setAge(1);
       chat.setMammal(true);

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
        Aquatic aquatic = new Aquatic();
        Terrestrial terrestrial = new Terrestrial("Chien","karim",2,true,4);
        Dolphin dolphin = new Dolphin("Dolphin","Dofdof",2,true,"habita ",7);
        Penguin penguin = new Penguin("penguin","dahdouh",2,false,"",3);
        System.out.println("aquatic");

        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);
        aquatic.swim();
dolphin.swim();
dolphin.swim(23);
penguin.swim();
    }
}