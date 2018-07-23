//2. Написать метод, который проверяет, что массив состоит только из чисел 1 и 4.
//Если в массиве нет хоть одной 4 или 1, то метод вернет false;
//Написать набор тестов для этого метода (3-4 варианта входных данных).

public class CheckArrayContainer {

    public CheckArrayContainer() {
    }


    boolean checkIfArrayContains(int[] userInput) {
        boolean containsNumbers = false;
        for (int i = 0; i < userInput.length; i++) {
            if ((userInput[i] == 1) || (userInput[i] == 4)) {
                containsNumbers = true;
            }

        }
        return containsNumbers;
    }

}
