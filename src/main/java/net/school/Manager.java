package net.school;

import java.util.ArrayList;

public class Manager extends Person {
    Cafeteria cafeteria;

    public Manager(String first, String last, String emailAddress, Cafeteria cafeteria) {
        super(first, last, emailAddress);
        this.cafeteria = cafeteria;
    }

    public double totalDailyTokensReceived() {
        return cafeteria.getDailyTokensReceived();
    }

    public ArrayList<Purchase> viewAllPurchases() {
        return cafeteria.getAllPurchases();
    }
}
