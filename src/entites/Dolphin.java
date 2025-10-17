package entites;

public  final class Dolphin extends Aquatic {
    public float swimmingSpeed;
    public Dolphin(String family, String name, int age, boolean isMammal,String habitatfloat,float swimmingSpeed) {
        super(family, name, age, isMammal, habitatfloat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("Dolphin swimming");
    }
    public void swim(float swimmingSpeed) {
        System.out.println("Dolphin swimming " + swimmingSpeed);
    }

    @Override
    public void talk() {
        System.out.println("Dolphin talking");
    }

    @Override
    public String toString() {
        return super.toString()+ "swimmingSpeed=" + swimmingSpeed;
    }
}
