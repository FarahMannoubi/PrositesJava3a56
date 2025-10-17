package entites;

public non-sealed class Terrestrial extends Animal {
    private int nbrLegs;
    public Terrestrial(String family, String name, int age, boolean isMammal,int nbrLegs) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
        this.nbrLegs = nbrLegs;

    }

    @Override
    public void talk() {
        System.out.println("Terrestrial talk");
    }

    @Override
    public String toString() {
        return super.toString()+"Terrestrial [nbrLegs=" + nbrLegs + "]";
    }
}
