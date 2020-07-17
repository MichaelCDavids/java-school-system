package net.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PurchaseTest {

    @Test
    public void purchaseGetPerson() {
        Person person = new Learner("First", "Person", "firstperson@gmail.com");
        double cost = 4.0;
        String itemBought = "Breakfast";
        Purchase purchase = new Purchase(person, cost, itemBought);
        assertEquals(person, purchase.getPerson());
    }

    @Test
    public void purchaseGetCost() {
        Person person = new Learner("First", "Person", "firstperson@gmail.com");
        double cost = 6.0;
        String itemBought = "Lunch";
        Purchase purchase = new Purchase(person, cost, itemBought);
        assertEquals(6.0, purchase.getCost());
    }

    @Test
    public void purchaseGetItemBough() {
        Person person = new Learner("First", "Person", "firstperson@gmail.com");
        double cost = 2.0;
        String itemBought = "Drink";
        Purchase purchase = new Purchase(person, cost, itemBought);
        assertEquals("Drink", purchase.getItemBought());
    }

    @Test
    public void purchaseToString() {
        Person person = new Learner("First", "Person", "firstperson@gmail.com");
        double cost = 2.0;
        String itemBought = "Drink";
        Purchase purchase = new Purchase(person, cost, itemBought);
        assertEquals("\n===================\nPurchase at Cafeteria\nItem:" + "Drink" + "\nCost:" + 2.0 + "\nPerson: " + "First" + " " + "Person" + "\n=====================", purchase.toString());
    }


}
