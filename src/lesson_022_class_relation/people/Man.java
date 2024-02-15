package lesson_022_class_relation.people;

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

    //extends
    //super
}
