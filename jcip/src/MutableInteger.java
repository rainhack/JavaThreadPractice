/**
 * Created by like on 2016/5/28.
 * 非线程安全类的可变整数
 */
public class MutableInteger {
    private int value;
    public int get(){
        return value;
    }
    public void set(int value){
        this.value=value;
    }
}
