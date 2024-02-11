package lesson_017_Incapsulation.L17.people;

public class Woman {
    private String name;
    private String hair;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public Woman() {
        setName("Mystery Lady");
        setHair("brunette");
    }

    public Woman(String name, String hair) {
        setName(name);
        setHair(hair);
    }

    public String toString() {
        String a = new String(getName()+" is a woman with "+getHair()+" hair. It is impolite to ask her about her age");
        return a;
    }

}
