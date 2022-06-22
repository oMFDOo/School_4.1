import java.io.IOException;

class myThread extends Thread {
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.print(i + " ");
        }
    }
}

public class main {
    public static void main(String[] args) throws IOException {
        Thread t1 = new myThread();
        Thread t2 = new myThread();
        t1.start();
        t2.start();
    }
}

