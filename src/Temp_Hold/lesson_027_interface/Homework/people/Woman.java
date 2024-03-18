package Temp_Hold.lesson_027_interface.Homework.people;

public class Woman extends Human {

    protected String hair;

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

    @Override
    public String toString() {
        String a = new String(getName()+" is a woman with "+getHair()+" hair. It is impolite to ask her about her age (but it is "+getAge()+" actually).");
        return a;
    }

    @Override
    public void greet() {
        System.out.println("Hello, my name is "+this.name+".");
    }

    public void preen() {
        System.out.println(this.name+" is preening for five minutes. She is now pretty.");
    }

    @Override
    public void acquireMobile() {
        System.out.println("The woman grabs your mobile and runs away!");
        System.out.println("It's no use to run after her, the justice system will let it slide either way.");
    }
}
