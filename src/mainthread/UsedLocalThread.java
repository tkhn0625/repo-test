package mainthread;
import exampleThread.*;

public class UsedLocalThread {

    public static void main(String[] args) {

        ExampleThreadInnerClass et = new ExampleThreadInnerClass();
        ExampleThreadInnerClass.Thread1 thread1 = et.new Thread1();
        thread1.start();
        try {
            System.out.println("別スレッドの処理を待機します。");
            thread1.join();
            System.out.println("別スレッドの処理が終わりました。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(et.getNumber());
    }

}
