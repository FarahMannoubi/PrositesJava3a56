package entites;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;
public Animal(String family, String name, int age, boolean isMammal) {
    this.family = family;
    this.name = name;
setAge(age);
this.isMammal = isMammal;
}
public Animal() {}
 public  String getFamily(){
    return family;
 }
 public void setFamily(String family){
    this.family = family;
 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
    if (age <= 0){
        System.out.println("Invalid Age");
        return;
    }

        this.age = age;
    }

    public String toString() {
    return "entites.Animal [family=" + family + ", name=" + name + ", age=" + age + "]";
    }
}
