import java.util.ArrayList;

public class StartApp {
    public static void main(String[] args) {
        Integer[] testArr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        GenericArray<Integer> genericArray = new GenericArray<Integer>(testArr);
        genericArray.switchElements(5, 8);
        System.out.println("1. Написать метод, который меняет два элемента массива местами");
        for (Integer integer : testArr) {
            System.out.print(integer + " ");
        }

        ArrayList arrayList = genericArray.transformerFromArrayToList();
        System.out.println("\n" + "2. Написать метод, который преобразует массив в ArrayList;");
        for (Object o : arrayList) {
            System.out.print(o + " ");
        }



        System.out.println("\nкоробочки:");
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();
        Box box4 = new Box();
        box1.addFruitsInBox(new Orange(),22);
        box2.addFruitsInBox(new Orange(),11);
        box3.addFruitsInBox(new Apple(),30);
        box4.addFruitsInBox(new Apple(),0);
        System.out.println("вес 1 коробочки: (липесинки): " + box1.getWeight());
        System.out.println("вес 2 коробочки: (липесинки): " + box2.getWeight());
        System.out.println("вес 3 коробочки: (яблочки): " + box3.getWeight());
        System.out.println("вес 4 коробочки: (яблочки): " + box4.getWeight());
        System.out.println("\nпересыпаем из 1 коробочки во 2: ");
        box1.intersperse(box2);
        System.out.println("вес 1 коробочки: (липесинки): " + box1.getWeight());
        System.out.println("вес 2 коробочки: (липесинки): " + box2.getWeight());
        System.out.println("\nпересыпаем из 3 коробочки во 2: (должна быть ошибка! Фрукты не совпадают) ");
        box3.intersperse(box2);
        System.out.println("вес 2 коробочки: (липесинки): " + box2.getWeight());
        System.out.println("вес 3 коробочки: (яблочки): " + box3.getWeight());


        System.out.println("сраниваем размеры 1 коробочки и 2: "+ box1.compare(box2));
        System.out.println("сраниваем размеры 4 коробочки и 1: "+ box4.compare(box1));

    }
}
