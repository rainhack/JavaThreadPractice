/**
 * Created by like on 2016/5/28.
 * 通过对get和set等方法进行同步，可以
 * 使MutableInteger成为一个线程安全类。
 * 仅对set方法进行同步是不够的。
 * 当线程在没有同步的情况下读取变量时，可能会得到一个
 * 失效值。
 * java的内存模型要求，变量的读取操作和写入操作
 * 都必须是原子操作，但对于非volatile类型的Long和
 * double变量，JVM允许将64位的都操作或写操作分解为两个
 * 32位的操作。
 * 因此操作double或Long类型时应该用volatile声明或用
 * 锁保护。
 * volatile变量典型用法：检查某个状态标记
 * 以判断是否退出循环。
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
