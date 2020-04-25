package exampleThread;

import java.util.concurrent.Callable;

public class ExampleThreadInnerClass {

    private int i;

    public Integer getNumber(){
        return i;
    }

    public class Thread1 extends Thread implements Callable<Integer> {
        public void run() {
            for (i = 0; i < 3; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Thread1" + (i + 1) + "度目の処理");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        public Integer call(){
            // returnが返せる。
            return i;
        }

    }

}
