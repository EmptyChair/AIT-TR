package lesson_036_JavaFramework3.Bobr;

import java.util.Comparator;
import java.util.Objects;

public class Bobr implements Comparable<Bobr> {
    private String name;
    private int age;
    private int relativesCount;

    ///CONSTRUCTORS

    public Bobr() {
        this.name = "Big Tooth";
        this.age = 4;
        this.relativesCount = 5;
    }

    public Bobr(String name, int age, int rc) {
        this.name = name;
        this.age = age;
        this.relativesCount = rc;
    }

    ///GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRelativesCount() {
        return relativesCount;
    }

    public void setRelativesCount(int relativesCount) {
        this.relativesCount = relativesCount;
    }

    @Override
    //hashcode-based comparison
    public int compareTo (Bobr beaver) {
        //return this.getName().compareTo(beaver.getName());
        return (this.name.hashCode()-beaver.name.hashCode()*100+(this.age-beaver.age)*10+(this.relativesCount- beaver.relativesCount));
    }

    @Override
    //better toString
    public String toString() {
        //return this.getName().compareTo(beaver.getName());
        return this.name+", aged "+this.age+", "+this.relativesCount+" relatives.";
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()*100+this.age*10+this.relativesCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Bobr bobr = (Bobr) obj;
        return age == bobr.age && relativesCount == bobr.relativesCount && Objects.equals(name, bobr.name);
    }

}


class BobrNameComparator implements Comparator<Bobr> {

    @Override
    public int compare(Bobr b1, Bobr b2) {
        //String comparison
        return b1.getName().compareTo(b2.getName());
    }
}

class BobrRelativeCountComparator implements Comparator<Bobr> {

    @Override
    public int compare(Bobr b1, Bobr b2) {
        return b1.getRelativesCount() - b2.getRelativesCount();
    }
}

