//1. Создать три потока, каждый из которых выводит определенную букву (A, B и C) 5 раз.
// Порядок должен быть именно таким: ABСABСABС.
// Используйте wait/notify/notifyAll.

public class AbcThread implements Runnable {
    private char userInput ='x';
    private Object sync;

    public AbcThread() {
    }

    public AbcThread(Object sync, char userInput) {
        this.sync = sync;
        this.userInput = userInput;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (sync) {
                    System.out.println(userInput);
                    sync.notifyAll();
                    try {
                        sync.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }
        }
    }
}