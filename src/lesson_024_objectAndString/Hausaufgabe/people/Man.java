package lesson_024_objectAndString.Hausaufgabe.people;

public class Man extends Human {

    protected String favoriteBeer;

    public String getFavoriteBeer() {
        return favoriteBeer;
    }

    public void setFavoriteBeer(String favoriteBeer) {
        this.favoriteBeer = favoriteBeer;
    }

    public Man() {
        super();
        setName("John Doe");
        setFavoriteBeer("Budweiser");
        setGender("male");
    }

    public Man(String name, int age, String beer) {
        super(name, age);
        setFavoriteBeer(beer);
        setGender("male");
    }

    @Override
    public String toString() {
        String a = new String(getName()+" is a man who is "+getAge()+" years old. His favorite beer is "+getFavoriteBeer());
        return a;
    }

    @Override
    public void greet() {
        System.out.println("Hey, bro!");
    }

    public void expropriateMobile() {
        System.out.println("Good day, sir, I hereby requisition your mobile phone for a greater purpose.");
    }

    //extends
    //super
}
