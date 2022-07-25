package ru.netology.sales.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesServiceTest {
    @Test
    public void shouldFindMinSales() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void calculateAmountSales() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.amountSales(sales);


    }

    @Test
    public void calculateAverageAmountSales() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageAmountSales(sales);
    }

    @Test
    public void shouldFindMaxSales() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindqtyMonthBelowAverageSales() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        int actualMonth = service.qtyMonthBelowAverageSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void shouldFindqtyMonthAboveAverageSales() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        int actualMonth = service.qtyMonthAboveAverageSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}