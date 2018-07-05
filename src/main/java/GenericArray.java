import java.util.ArrayList;
import java.util.Arrays;

public class GenericArray<T extends Number> {
    private T[] numbers;

    public GenericArray(T[] numbers) {
        this.numbers = numbers;
    }

    //1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    public T[] switchElements(int first, int second) {
        T element1 = null;
        T element2 = null;
        for (int i = 0; i < numbers.length; i++) {
            element1 = numbers[first];
            element2 = numbers[second];
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[first] = element2;
            numbers[second] = element1;

        }
        return numbers;
    }

    //2. Написать метод, который преобразует массив в ArrayList;
    public ArrayList<T> transformerFromArrayToList() {
        ArrayList<T> arrayList = new ArrayList<T>(Arrays.asList(numbers));
        return arrayList;
    }
}
