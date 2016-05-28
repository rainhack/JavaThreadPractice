/**
 * Created by like on 2016/5/28.
 */
public class Novisibility {
    private static boolean ready;
    private static int number;
    private static class ReaderThread extends Thread{
       public void run(){
           while(!ready)
               Thread.yield();
           System.out.println(number);
       }
    }
    /**
     * NoVisibility可能会持续循环下去，因为读线程可能永远都看不到
     * ready的值。也可能输出0，指令重排序。
     *
     * */
    public static void main(String[] args){
        new ReaderThread().start();
        number=42;
        ready=true;
    }

}
