/*1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
Метод должен вернуть новый массив, который получен путем вытаскивания элементов из исходного массива,
идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку,
в противном случае в методе необходимо выбросить RuntimeException.

Написать набор тестов для этого метода (3-4 варианта входных данных).
вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ]

2. Написать метод, который проверяет, что массив состоит только из чисел 1 и 4.
Если в массиве нет хоть одной 4 или 1, то метод вернет false;
Написать набор тестов для этого метода (3-4 варианта входных данных).

3. Создать небольшую БД (таблица: студенты; поля: id, фамилия, балл).
Написать тесты для проверки того, что при работе с базой корректно добавляются, обновляются и читаются записи.
Следует учесть, что в базе есть заранее добавленные записи,
и после проведения тестов эти записи не должны быть удалены/изменены/добавлены.*/

import java.util.List;

public class StartApp {

    public static void main(String[] args) {
        ArrayExecutor arrayExecutor = new ArrayExecutor();
        int[] userInput = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        arrayExecutor.executeFromArray(userInput);
        List temp;
        temp = arrayExecutor.executeFromArray(userInput);
        for (Object o : temp) {
            System.out.println(o);
        }


        CheckArrayContainer checkArrayContainer = new CheckArrayContainer();
        System.out.println(checkArrayContainer.checkIfArrayContains(userInput));


    }
}
