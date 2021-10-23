package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSum() {
        StatisticService service = new StatisticService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(managerSales);

        assertEquals(expected, actual);


    }

    @Test
    void shouldfindAverage() {
        StatisticService service = new StatisticService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.findAverage(managerSales);

        assertEquals(expected, actual);


    }

    @Test
    void shouldfindMaxSales() {
        StatisticService service = new StatisticService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMaxSales(managerSales);

        assertEquals(expected, actual);


    }

    @Test
    void shouldfindMinSales() {
        StatisticService service = new StatisticService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMinSales(managerSales);

        assertEquals(expected, actual);


    }

    @Test
    void shouldfindBelowAverage() {
        StatisticService service = new StatisticService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findBelowAverage(managerSales);

        assertEquals(expected, actual);


    }

    @Test
    void shouldfindAboveAverage() {
        StatisticService service = new StatisticService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findAboveAverage(managerSales);

        assertEquals(expected, actual);


    }
}