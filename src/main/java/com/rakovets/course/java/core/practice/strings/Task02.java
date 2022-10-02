package com.rakovets.course.java.core.practice.strings;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Разработать программу для разбора (parsing) банковских отчетов.
 *
 * @author Dmitry Rakovets
 */
@SuppressWarnings("unused")
class Task02 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        String bankReport = "Remaining 10$  12$ essentially 13$ unchanged.";

        double[] moneyFromReport = getArrayMoneyFromReport(bankReport);
        System.out.printf("Money from the report: %s\n", Arrays.toString(moneyFromReport));
        double sumMoneyFromReport = getSumMoneyFromReport(bankReport);
        System.out.printf("Sum money from the report: %s\n", sumMoneyFromReport);
    }

    /**
     * Возвращает список сумм, которые встречаются в отчете.
     *
     * @param report в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
     * @return список сумм
     */
    static double[] getArrayMoneyFromReport(String report) {
        String[] stringWithoutSpace = report.split("\\s+");
        ArrayList<Double> arrayFullSumsFromReport = new ArrayList<>();

        for (String strNumbers : stringWithoutSpace) {
            if (strNumbers.matches("\\-?\\d+\\.?\\d*\\$")) {
                arrayFullSumsFromReport.add(Double.parseDouble(strNumbers.replace("$", "")));
            }
        }

        double[] moneyFromReport = new double[arrayFullSumsFromReport.size()];
        for (int i = 0; i < moneyFromReport.length; i++) {
            moneyFromReport[i] = arrayFullSumsFromReport.get(i);
        }

        return moneyFromReport;
    }

    /**
     * Возвращает общую сумму всех денег, которые встречаются в отчете.
     *
     * @param report в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
     * @return общую сумму всех денег
     */
    static double getSumMoneyFromReport(String report) {
        double totalAmountOfAllMoney = 0.0;
        double[] arrayMoney = getArrayMoneyFromReport(report);

        for (int i = 0; i < arrayMoney.length; i++) {
            totalAmountOfAllMoney += arrayMoney[i];
        }

        return totalAmountOfAllMoney;
    }
}
