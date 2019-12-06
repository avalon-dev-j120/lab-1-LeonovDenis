package ru.avalon.java.j20.labs.core;

import ru.avalon.java.j20.labs.models.Fibonacci;

/**
 * Фабрика, создающая последовательности чисел Фибоначчи.
 */
public class FibonacciFactory implements Factory<Fibonacci, Integer> {

    private final int a = 1;
    private final int b = 1;
    private int[] array;

    /**
     * Возвращает новый объект Fibonacci с последовательностью заданной длины.
     *
     * @param param длина последовательности
     * @return новый объект Fibonacci с последовательностью, заданной длины.
     */
    @Override
    public Fibonacci getInstance(Integer param) {
        if (param < 2) {
            throw new IllegalArgumentException("The argument must be greater then 2");
        }
        array = new int[param];
        array[0] = a;
        array[1] = b;
        int i = 2;
        while (i < param) {
            array[i] = array[i - 2] + array[i - 1];
            i++;
        }
        return new Fibonacci(array);
    }

}
