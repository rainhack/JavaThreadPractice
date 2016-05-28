/**
 * Created by like on 2016/5/28.
 * ͨ����get��set�ȷ�������ͬ��������
 * ʹMutableInteger��Ϊһ���̰߳�ȫ�ࡣ
 * ����set��������ͬ���ǲ����ġ�
 * ���߳���û��ͬ��������¶�ȡ����ʱ�����ܻ�õ�һ��
 * ʧЧֵ��
 * java���ڴ�ģ��Ҫ�󣬱����Ķ�ȡ������д�����
 * ��������ԭ�Ӳ����������ڷ�volatile���͵�Long��
 * double������JVM����64λ�Ķ�������д�����ֽ�Ϊ����
 * 32λ�Ĳ�����
 * ��˲���double��Long����ʱӦ����volatile��������
 * ��������
 * volatile���������÷������ĳ��״̬���
 * ���ж��Ƿ��˳�ѭ����
 * volatile boolean asleep
 * while(!asleep)
 *    countSomeSheep();
 *
 *
 */
public class SynchronizedInteger {
    private int value;
    public synchronized int get(){
        return  value;
    }
    public synchronized void set(int value){
        this.value=value;
    }
}
