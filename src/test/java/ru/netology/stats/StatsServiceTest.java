package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    //1
    @Test
    public void salesSum() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.salesSum(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    //2
    @Test
    public void salesMedium() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.salesMedium(sales);
        long expected = 180 / 12;

        Assertions.assertEquals(expected, actual);
    }

    //3
    @Test
    public void maxMonth() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxMonth(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    //4
    @Test
    public void minMonth() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minMonth(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    //5
    @Test
    public void monthsBelowMedium() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthsBelowMedium(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    //6
    @Test
    public void monthsAboveMedium() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthsAboveMedium(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}
