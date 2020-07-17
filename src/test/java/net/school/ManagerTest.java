package net.school;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTest {
    @Test
    public void managerViewAllPurchases() {
        Cafeteria cafeteria = new Cafeteria();
        Manager manager = new Manager("Mike", "dave", "mikedave@gmail.com", cafeteria);
        assertEquals(new ArrayList<>(), manager.viewAllPurchases());
    }

    @Test
    public void managerViewAllPurchasesOne() {
        Cafeteria cafeteria = new Cafeteria();
        Manager manager = new Manager("Mike", "dave", "mikedave@gmail.com", cafeteria);
        manager.earnTokens(20);
        cafeteria.buyLunch(manager);
        assertEquals(1, manager.viewAllPurchases().size());
    }

    @Test
    public void managerGetDailyTokensReceived() {
        Cafeteria cafeteria = new Cafeteria();
        Manager manager = new Manager("Mike", "dave", "mikedave@gmail.com", cafeteria);
        assertEquals(0.00, manager.totalDailyTokensReceived());
    }

    @Test
    public void managerGetDailyTokensReceivedOne() {
        Cafeteria cafeteria = new Cafeteria();
        Manager manager = new Manager("Mike", "dave", "mikedave@gmail.com", cafeteria);
        manager.earnTokens(20);
        cafeteria.buyLunch(manager);
        assertEquals(6.00, manager.totalDailyTokensReceived());
    }

}
