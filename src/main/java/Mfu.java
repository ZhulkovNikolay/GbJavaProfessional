public class Mfu implements Runnable {
//3. Написать класс МФУ, на котором возможны одновременная печать и сканирование документов,
// при этом нельзя одновременно печатать или сканировать два документа (при печати в консоль выводится сообщения
// «отпечатано 1, 2, 3,... страницы», при сканировании – «отсканировано...». Вывод в консоль все так же с периодом в 50 мс.)

    private String task;
    private int amount;
    static Object sync = new Object();

    public Mfu(String task, int amount) {
        this.amount = amount;
        this.task = task;
    }

    public Mfu(int amount, String task) {
        this.amount = amount;
        this.task = task;
    }

    public void run() {
        int count = 0;
        try {
            synchronized (sync) {
                System.out.print(task + ": ");
                while (amount > 0) {
                    Thread.sleep(50);
                    System.out.print(count + " ");
                    count++;
                    amount--;
                }
                System.out.println();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
