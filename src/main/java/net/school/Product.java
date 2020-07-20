package net.school;

public class Product {
    private double cost;
    private ProductType type;

    public Product(double cost, ProductType type) {
        this.cost = cost;
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public ProductType getType() {
        return type;
    }

}

enum ProductType{
    BREAKFAST,
    LUNCH,
    DRINK,
    AFTERNOON_SNACK
}

class BreakFast extends Product {
    public BreakFast() {
        super(4, ProductType.BREAKFAST);
    }
}

class Lunch extends Product {
    public Lunch() {
        super(6, ProductType.LUNCH);
    }
}

class AfternoonSnack extends Product {
    public AfternoonSnack() {
        super(2, ProductType.AFTERNOON_SNACK);
    }
}

class Drink extends Product {
    public Drink() {
        super(3, ProductType.DRINK);
    }
}





