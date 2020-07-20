package net.school;

public class Purchase {
    private Person person;
//    private double cost;
    private Product product;

    public Purchase(Person person, Product product) {
        this.person = person;
//        this.cost = cost;
        this.product = product;
    }

    public Person getPerson() {
        return person;
    }

//    public double getCost() {
//        return cost;
//    }

    public Product getItemBought() {
        return product;
    }

    @Override
    public String toString() {
        return "\n===================\nPurchase at Cafeteria\nItem:" + getItemBought().getType() + "\nCost:" + product.getCost() + "\nPerson: " + getPerson().getFirstName() + " " + getPerson().getLastName() + "\n=====================";
    }
}
