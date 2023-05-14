package ru.netology.stats;

public class StatsService {

    /* [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18]
    Рассчитать:
    1. сумму всех продаж;
    2. среднюю сумму продаж в месяц;
    3. номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;
    4. номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*;
    5. количество месяцев, в которых продажи были ниже среднего (см. п.2);
    6. количество месяцев, в которых продажи были выше среднего (см. п.2).
     */


    // 1)
    public long salesSum(long[] sales) {
        long allSales = 0;
        for (long sale : sales) {
            allSales += sale;
        }
        return allSales;
    }

    // 2)
    public long salesMedium(long[] sales) {
        long salesMedium = salesSum(sales) / 12;

        return salesMedium;
    }

    // 3)
    public int maxMonth(int[] sales) {
        int maxMonthSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonthSale]) {
                maxMonthSale = i;
            }
        }
        return maxMonthSale + 1;
    }

    //4
    public int minMonth(int[] sales) {
        int minMonthSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonthSale]) {
                minMonthSale = i;
            }
        }
        return minMonthSale + 1;
    }

    //5
    public int monthsBelowMedium(long[] sales) {
        int monthsBelow = 0;
        for (long sale : sales) {
            if (sale < salesMedium(sales)) {
                monthsBelow++;
            }
        }
        return monthsBelow;
    }

    //6
    public int monthsAboveMedium(long[] sales) {
        int monthsAbove = 0;
        for (long sale : sales) {
            if (sale < salesMedium(sales)) {
                monthsAbove++;
            }
        }
        return monthsAbove;
    }
}



