package ru.netology.sales.services;

import org.jetbrains.annotations.NotNull;

public class SalesService {
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
// sales[minMonth] - продажи в месяце minMonth
// sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int amountSales(int[] sales) {
        int amount = 0;
        for (int sale : sales) {
            amount += sale;
        }
        return amount;

    }

    public int averageAmountSales(int[] sales) {
        return amountSales(sales) / sales.length;

    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
// sales[maxMonth] - продажи в месяце maxMonth
// sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int qtyMonthBelowAverageSales(int[] sales) {
        int belowAverage = 0;
        int average = averageAmountSales(sales);

        for (int sale : sales) {
            if (sale < average) {
                belowAverage = belowAverage + 1;
            }
        }
        return belowAverage;

    }

    public int qtyMonthAboveAverageSales(int[] sales) {
        int aboveAverage = 0;
        int average = averageAmountSales(sales);

        for (int sale : sales) {
            if (sale > average) {
                aboveAverage = aboveAverage + 1;
            }
        }
        return aboveAverage;
    }
}