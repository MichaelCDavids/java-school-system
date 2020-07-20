package net.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PurchaseTest {

    @Test
    public void purchaseGetPerson() {
        Person person = new Learner("First", "Person", "firstperson@gmail.com");
        Purchase purchase = new Purchase(person, new AfternoonSnack());
        assertEquals(person, purchase.getPerson());
    }

    @Test
    public void purchaseGetItemBough() {
        Person person = new Learner("First", "Person", "firstperson@gmail.com");
        Purchase purchase = new Purchase(person, new Lunch());
        assertEquals(ProductType.LUNCH, purchase.getItemBought().getType());
    }

    @Test
    public void purchaseToString() {
        Person person = new Learner("First", "Person", "firstperson@gmail.com");
        Purchase purchase = new Purchase(person, new BreakFast());
        assertEquals("\n===================\nPurchase at Cafeteria\nItem:" + "BREAKFAST" + "\nCost:" + 4.0 + "\nPerson: " + "First" + " " + "Person" + "\n=====================", purchase.toString());
    }


}
