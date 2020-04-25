package exampleThread;

import java.util.concurrent.Callable;

public class ExampleThreadClass extends Thread implements Callable<Integer> {

    private int i;

    public Integer call(){
        for (i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Thread1" + (i + 1) + "度目の処理");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return i;
    }


}
