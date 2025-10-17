package entites;

public abstract non-sealed class Penguin extends Aquatic {
    private float swimmingDepth;
    public Penguin(String family, String name, int age, boolean isMammal,String habitat,float swimmingDepth) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
        this.habitat = habitat;
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString()+" swimmingDepth = "+swimmingDepth;
    }
}
