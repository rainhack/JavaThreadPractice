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
     * NoVisibility���ܻ����ѭ����ȥ����Ϊ���߳̿�����Զ��������
     * ready��ֵ��Ҳ�������0��ָ��������
     *
     * */
    public static void main(String[] args){
        new ReaderThread().start();
        number=42;
        ready=true;
    }

}
