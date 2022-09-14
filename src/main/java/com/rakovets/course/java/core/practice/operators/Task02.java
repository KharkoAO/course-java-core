package com.rakovets.course.java.core.practice.operators;

/**
 * Разработать программу для логистического центра.
 *
 * @author Dmitry Rakovets
 */
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
        int cargo = 74;
        int carryingCapacity = 7;

        int amountRemainingCargo = getAmountRemainingCargo(cargo, carryingCapacity);
        System.out.printf("Result: %d", amountRemainingCargo);
    }

    /**
     * Рассчитывает количество некоторого груза, который останется на складе, после полной загрузки его в грузовики, т.е.
     * грузовики должны быть загружены полностью
     *
     * @param cargo            вес всего груза
     * @param carryingCapacity грузоподъемность грузовиков
     */
    static int getAmountRemainingCargo(int cargo, int carryingCapacity) {
        return cargo % carryingCapacity;
    }
}
