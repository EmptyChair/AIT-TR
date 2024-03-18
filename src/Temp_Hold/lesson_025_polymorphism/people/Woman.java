package Temp_Hold.lesson_025_polymorphism.people;

public class Woman extends Human {

    private String hair;

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public Woman() {
        super();
        setName("Mystery Lady");
        setHair("brunette");
        setGender("female");
    }

    public Woman(String name, int age, String hair) {
        super(name,age);
        setHair(hair);
        setGender("female");
    }

    public String toString() {
        String a = new String(getName()+" is a woman with "+getHair()+" hair. It is impolite to ask her about her age (but it is "+getAge()+" actually).");
        return a;
    }

}
