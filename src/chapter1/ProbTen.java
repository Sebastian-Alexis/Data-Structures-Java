package chapter1;

/*
Write a Java class, Flower, that has three instance variables of type String, int,
and float, which respectively represent the name of the flower, its number of
petals, and price. Your class must include a constructor method that initializes
each variable to an appropriate value, and your class should include methods for
setting the value of each type, and getting the value of each type.
 */

public class ProbTen {
    public static void main(String[] args){
        ProbTen jasmine = new ProbTen("jasmine", 10, 20.5f);
        System.out.println(jasmine.toString());
    }

    private String name;
    private int petals;
    private float price;

    public ProbTen(String name, int petals, float price) {
        this.name = name;
        this.petals = petals;
        this.price = price;
    }

    public String toString() {
        return ("name: " + this.name + " petals: " + this.petals + " price: " + this.price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPetals() {
        return petals;
    }

    public void setPetals(int petals) {
        this.petals = petals;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}

