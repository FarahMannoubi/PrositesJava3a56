package entites;

public abstract sealed class Aquatic extends Animal permits Penguin,Dolphin {

    protected String habitat;
    public Aquatic() {}
    public Aquatic(String family, String name, int age, boolean isMammal,String habitat) {
       super(family, name, age, isMammal);
       this.habitat = habitat;
    }

    public void swim(){
        System.out.println("Aquatic swimming");
    }

    public String toString() {
        return super.toString()+ " Aquatic [habitat=" + habitat + "]";
    }
}
