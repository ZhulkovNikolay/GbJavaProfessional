import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    float getWeight() {
        return fruits.size() == 0 ? 0 : fruits.get(0).getWeight() * fruits.size();
    }

    public ArrayList<T> getFruitsFromBox() {
        return fruits;
    }

    public void addFruitsInBox(T fruit, int size) {
        for (int i = 0; i < size; i++) {
            fruits.add(fruit);
        }
    }

    //TODO проверка на тип Geniric'a не работает!
    void intersperse(Box<T> anotherBox) {
        if (anotherBox.getClass().getGenericSuperclass().equals(this.getClass().getGenericSuperclass())) {
            anotherBox.fruits.addAll(fruits);
            fruits.clear();
        } else {
            System.out.println("Коробочки пересыпать нельзя. Разные фрукты");
        }
    }

    public boolean compare(Box<?> another) {
        return this.getWeight() == another.getWeight();
    }
}
