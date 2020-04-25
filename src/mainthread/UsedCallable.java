package mainthread;

import exampleThread.ExampleThreadClass;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UsedCallable {

    public static void main(String[] args) {


        //ExampleThreadInnerClass et = new ExampleThreadInnerClass();
        //ExampleThreadInnerClass.Thread1 thread1 = et.new Thread1();
        ExampleThreadClass etc = new ExampleThreadClass();

        etc.start();
        try {
            System.out.println("別スレッドの処理を待機します。");
            etc.join();
            System.out.println("別スレッドの処理が終わりました。");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // ExecutorServiceを生成
        ExecutorService ex = Executors.newSingleThreadExecutor();
        // Executorにスレッド ThreadRun5() の実行を依頼
        Future<Integer> futureResult = ex.submit((Callable<Integer>) new ExampleThreadClass());
        // スレッドから戻ってきた値を受け取る。
        try {
            // Future型は「getメソッド」で取り出す必要あり。
            Integer result = futureResult.get();
            System.out.println(result);
        }catch (Exception e){
            // ここは例外処理です
            System.out.println(e);
        }
    }

}
