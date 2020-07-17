package net.school;

public class Purchase {
    private Person person;
    private double cost;
    private String itemBought;

    public Purchase(Person person, double cost, String itemBought) {
        this.person = person;
        this.cost = cost;
        this.itemBought = itemBought;
    }

    public Person getPerson() {
        return person;
    }

    public double getCost() {
        return cost;
    }

    public String getItemBought() {
        return itemBought;
    }

    @Override
    public String toString() {
        return "\n===================\nPurchase at Cafeteria\nItem:" + getItemBought() + "\nCost:" + getCost() + "\nPerson: " + getPerson().getFirstName() + " " + getPerson().getLastName() + "\n=====================";
    }
}
