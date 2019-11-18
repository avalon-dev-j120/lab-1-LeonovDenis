package ru.avalon.java.j20.labs.tasks;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.util.ArrayList;
import java.util.Arrays;
import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Задание №5.
 *
 * <p>
 * Тема: "Изучение отличия между списками и наборами".
 */
public class Task5 implements Task {

    /**
     * Фабрика, генерирующая массивы чисел случайного характера.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        final Integer[] array = arrayFactory.getInstance(20);

        List<Integer> list = new ArrayList<>(Arrays.asList(array));

        Set<Integer> set = new TreeSet<>();
        for (Integer integer : array) {
            set.add(integer);
        }

        System.out.println(list.toString());
        System.out.println("\n==============================");
        System.out.println(set.toString());
        /**
         * TODO(Студент): Выполните задание №5
         *
         * 1. Проинициализируйте переменные list и set объектами подходящих
         * классов.
         *
         * 2. В обе коллекции поместите элементы массива array.
         *
         * 3. С использованием отладчика проверьте корректность выполнения
         * задания.
         */
    }
}
