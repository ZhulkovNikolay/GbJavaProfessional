//1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
//Метод должен вернуть новый массив, который получен путем вытаскивания элементов из исходного массива,
//идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку,
//в противном случае в методе необходимо выбросить RuntimeException.
//Написать набор тестов для этого метода (3-4 варианта входных данных).
//вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ]


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ArrayExecutor {

    ArrayExecutor() {
    }

    List executeFromArray(int[] usersArray) {
        boolean ifContainsNumber = false;
        for (int i : usersArray) {
            if (i == 4)
                ifContainsNumber = true;
        }
        if (!ifContainsNumber){
            throw new  RuntimeException();
        }

        List<Integer> tempList = new ArrayList<Integer>();
        for (int i = usersArray.length - 1; i > 0; i--) {
            if (usersArray[i] != 4) {
                tempList.add(usersArray[i]);
            } else {
                break;
            }
        }
        Collections.reverse(tempList);
        return tempList;
    }

}