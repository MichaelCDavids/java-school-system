package net.school;

import java.util.ArrayList;

public class Cafeteria implements Transaction {
    private final ArrayList<Purchase> allPurchases = new ArrayList<Purchase>();
    private double dailyTokensReceived;

    private boolean hasEnoughTokens(Person person, double itemCost) {
        return person.getTokens() >= itemCost;
    }

    private boolean checkDiscount(Person person) {
        if (person instanceof Teacher) {
            return ((Teacher) person).getNumberOfLessonsTaught() >= 5;
        }
        return false;
    }

    private double applyDiscount(double cost) {
        return (double) cost - (cost * 0.25);
    }

    private void updateDailyTokensReceived(double amount) {
        this.dailyTokensReceived += amount;
    }

    public double getDailyTokensReceived() {
        return dailyTokensReceived;
    }

    public ArrayList<Purchase> getAllPurchases() {
        return allPurchases;
    }

    @Override
    public void buy(Person person, Product product) {
        if (hasEnoughTokens(person, product.getCost())) {
            person.useTokens(checkDiscount(person) ? applyDiscount(product.getCost()) : product.getCost());
            allPurchases.add(new Purchase(person, product));
            updateDailyTokensReceived(checkDiscount(person) ? applyDiscount(product.getCost()) : product.getCost());
        }
    }
}
