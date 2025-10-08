package entites;

public class Zoo {
    private Animal[] animals = new Animal[2]; ;
    private String name;
 private String city;
private int nbrCages;
private int nbAnimals;
public Zoo() {
}
    public Zoo( String name, String city, int nbrCages) {
setName(name);
this.city = city;
    this.nbrCages = nbrCages;

    }
    public void displayZoo(){
    System.out.println("entites.Zoo [ name : "+name+" city "+ city +" nbrCages : "+nbrCages+"]");
    }
    public String toString() {
    return "entites.Zoo [name : "+name+" city "+" city : ]";
    }

    public boolean addAnimal(Animal animal){
        if (isZooFull()) return false;
        if (searchAnimal(animal) != -1) return false;
        if ( animals.length <= nbAnimals ) return false;
        for (int i = 0; i < animals.length; i++){
            if (animals[i] == null){
                animals[i] = animal;
                nbAnimals++;
                return true;
            }
        }
        return false;
    }
 public void affiche () {
    for (int i = 0; i < animals.length; i++){

            System.out.println("tableaux :"+animals[i]);

    }
 }
 public int searchAnimal(Animal animal){
    for (int i = 0; i < animals.length; i++){
        if (animals[i]!=null && animal.getName().equals(animals[i].getName())){
            return i;
        };
    }
    return -1;
 }
 public boolean removeAnimal(Animal animal){
    int indice = searchAnimal(animal);
    if (indice == -1)
        return false;
     if (indice  == animals.length){
         animals[indice] = null;
         nbAnimals--;
         return true;
     }
    for (int i = indice; i < animals.length-1; i++){
        animals[i] = animals[i+1];
    }
     nbAnimals--;
     return true;
 }
 public boolean isZooFull(){
    if (nbAnimals == animals.length) return true;
    return false;
 }
public static Zoo comparerZoo(Zoo z1, Zoo z2){
   if (z1.nbAnimals > z2.nbAnimals){
       return z1;
   }
   return z2;
}


    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
    if (name==null){
        System.out.println("name is null");
        return;
    }
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void setNbrCages(int nbrCages) {
        this.nbrCages = nbrCages;
    }

    public int getNbAnimals() {
        return nbAnimals;
    }

    public void setNbAnimals(int nbAnimals) {
        this.nbAnimals = nbAnimals;
    }
}
