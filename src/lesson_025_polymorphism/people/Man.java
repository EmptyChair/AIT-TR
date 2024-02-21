package lesson_025_polymorphism.people;

public class Man extends Human {

    private String favoriteBeer;

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

    public String toString() {
        String a = new String(getName()+" is a man who is "+getAge()+" years old. His favorite beer is "+getFavoriteBeer());
        return a;
    }
    @Override
    public void makeSound() {
        System.out.println("Hey, bro!");
    }

    //extends
    //super
}
