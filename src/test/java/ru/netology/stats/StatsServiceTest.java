package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void sumOfAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 23, 19, 20, 7, 14, 14, 18};

        long expected = 8 + 15 + 13 + 15 + 17 + 23 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.salesAmount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void averageSalesAmount() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 23, 19, 20, 7, 14, 14, 18};

        long expected = (8 + 15 + 13 + 15 + 17 + 23 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actual = service.averageSalesAmount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void MonthOfMinimumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 23, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void MonthOfMaximumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 23, 19, 20, 7, 14, 14, 18};

        int expected = 6;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowSalesMonths() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 23, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.lowSalesMonths(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void highSalesMonths() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 23, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.lowSalesMonths(sales);

        Assertions.assertEquals(expected, actual);
    }
}