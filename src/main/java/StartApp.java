import java.io.IOException;

public class StartApp {
    public static void main(String[] args) throws IOException {

//1. Создать три потока, каждый из которых выводит определенную букву (A, B и C) 5 раз.
// Порядок должен быть именно таким: ABСABСABС.
// Используйте wait/notify/notifyAll.
        Object waiter = new Object();
        AbcThread abcThreadA = new AbcThread(waiter,'A');
        AbcThread abcThreadB = new AbcThread(waiter,'B');
        AbcThread abcThreadC = new AbcThread(waiter,'C');
        Thread t1 = new Thread(abcThreadA);
        Thread t2 = new Thread(abcThreadB);
        Thread t3 = new Thread(abcThreadC);
        t1.start();
        t2.start();
        t3.start();

//2. Написать совсем небольшой метод, в котором 3 потока построчно пишут данные в файл (по 10 записей с периодом в 20 мс)
        FileWriterThread fileWriterThread4 = new FileWriterThread("C:\\c\\lesson4.txt", "111");
        FileWriterThread fileWriterThread5 = new FileWriterThread("C:\\c\\lesson4.txt", "222");
        FileWriterThread fileWriterThread6 = new FileWriterThread("C:\\c\\lesson4.txt", "333");
        Thread t4 = new Thread(fileWriterThread4);
        Thread t5 = new Thread(fileWriterThread5);
        Thread t6 = new Thread(fileWriterThread6);
        t4.start();
        t5.start();
        t6.start();


//3. Написать класс МФУ, на котором возможны одновременная печать и сканирование документов,
// при этом нельзя одновременно печатать или сканировать два документа (при печати в консоль выводится сообщения
// «отпечатано 1, 2, 3,... страницы», при сканировании – «отсканировано...». Вывод в консоль все так же с периодом в 50 мс.)
        Mfu mfu1 = new Mfu("отсканированно", 22);
        Mfu mfu2 = new Mfu(22, "распечатанно");
        Thread t7 = new Thread(mfu1);
        Thread t8 = new Thread(mfu2);
        t7.start();
        t8.start();
    }
}