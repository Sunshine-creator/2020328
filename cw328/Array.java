package cw328;
public class Array {
    private int [] data = new int[100];
    private int head =0;
    private  int tail = 0;
    private  int size = 0;//个数
    public void  offer(int val){
        if(size==data.length){
            return;
        }
        data[tail] = val;
        tail++;
        if(tail>=data.length){      //设置两个变量判断
            tail = 0;
        }
        size++;
    }
    public Integer pool(){
        if(size==0){
            return null;
        }
         Integer result =  data[head];
         head++;
         if(head>=data.length){
             head =0;
         }
         size--;
         return result;
    }
       public Integer peak(){
        if(size==0){
            return null;
        }
        return data[head];      //也是返回头部元素
    }
}
