package net.school;

import java.util.ArrayList;

public class Cafeteria {
    private final ArrayList<Purchase> allPurchases = new ArrayList<Purchase>();
    private double dailyTokensReceived;


    public void buyBreakFast(Person person) {
        if (person.getTokens() >= 4) {
            person.useTokens(checkDiscount(person) ? applyDiscount(4) : 4);
            allPurchases.add(new Purchase(person, checkDiscount(person) ? applyDiscount(4) : 4, "Breakfast"));
            updateDailyTokensReceived(checkDiscount(person) ? applyDiscount(4) : 4);
        }
    }

    public void buyLunch(Person person) {
        if (person.getTokens() >= 6) {
            person.useTokens(checkDiscount(person) ? applyDiscount(6) : 6);
            allPurchases.add(new Purchase(person, checkDiscount(person) ? applyDiscount(6) : 6, "Lunch"));
            updateDailyTokensReceived(checkDiscount(person) ? applyDiscount(6) : 6);
        }
    }

    public void buySnack(Person person) {
        if (person.getTokens() >= 3) {
            person.useTokens(checkDiscount(person) ? applyDiscount(3) : 3);
            allPurchases.add(new Purchase(person, checkDiscount(person) ? applyDiscount(3) : 3, "Afternoon Snack"));
            updateDailyTokensReceived(checkDiscount(person) ? applyDiscount(3) : 3);
        }
    }

    public void buyDrink(Person person) {
        if (person.getTokens() >= 2) {
            person.useTokens(checkDiscount(person) ? applyDiscount(2) : 2);
            allPurchases.add(new Purchase(person, checkDiscount(person) ? applyDiscount(2) : 2, "Afternoon Snack"));
            updateDailyTokensReceived(checkDiscount(person) ? applyDiscount(2) : 2);
        }
    }

    private boolean checkDiscount(Person person) {
        if (person instanceof Teacher) {
            return ((Teacher) person).getNumberOfLessonsTaught() >= 5;
        }
        return false;
    }

    private double applyDiscount(int cost) {
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
}
