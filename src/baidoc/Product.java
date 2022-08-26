package baidoc;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long seri=-242546645343221L;
    private int ID;
    private String name;
    private double price;
    private String description;

    public Product(int ID, String name, double price, String description) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
