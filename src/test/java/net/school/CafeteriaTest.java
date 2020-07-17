package net.school;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CafeteriaTest {
    @Test
    public void constructCafeteria() {
        Cafeteria cafe = new Cafeteria();
        assertTrue(cafe instanceof Cafeteria);
    }

    @Test
    public void cafeteriaGetDailyTokensReceived() {
        Cafeteria cafe = new Cafeteria();
        assertEquals(0.00, cafe.getDailyTokensReceived());
    }

    @Test
    public void cafeteriaGetAllPurchases() {
        Cafeteria cafe = new Cafeteria();
        assertEquals(new ArrayList<Purchase>(), cafe.getAllPurchases());
    }

    @Test
    public void cafeteriaBuyBreakFast() {
        Learner sylo = new Learner("Shaun", "Bongz", "sylobongz@gmail.com");
        sylo.earnTokens(100);
        Cafeteria cafe = new Cafeteria();
        cafe.buyBreakFast(sylo);
        assertEquals(4.00, cafe.getDailyTokensReceived());
    }

    @Test
    public void cafeteriaBuyLunch() {
        Learner sylo = new Learner("Shaun", "Bongz", "sylobongz@gmail.com");
        sylo.earnTokens(100);
        Cafeteria cafe = new Cafeteria();
        cafe.buyLunch(sylo);
        assertEquals(6.00, cafe.getDailyTokensReceived());
    }

    @Test
    public void cafeteriaBuyDrink() {
        Learner sylo = new Learner("Shaun", "Bongz", "sylobongz@gmail.com");
        sylo.earnTokens(100);
        Cafeteria cafe = new Cafeteria();
        cafe.buyDrink(sylo);
        assertEquals(2.00, cafe.getDailyTokensReceived());
    }

    @Test
    public void cafeteriaBuySnack() {
        Learner sylo = new Learner("Shaun", "Bongz", "sylobongz@gmail.com");
        sylo.earnTokens(100);
        Cafeteria cafe = new Cafeteria();
        cafe.buySnack(sylo);
        assertEquals(3.00, cafe.getDailyTokensReceived());
    }
}
