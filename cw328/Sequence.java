package cw328;

public class Sequence {
    static class Node{
        public int val;
        Node next =  null;
        public Node(int val) {
            this.val = val;
        }
    }
    private Sequence.Node head = null;
    private Sequence.Node tail = null;
    //入队列
    public void offer(int val){   //队列Offer
        Sequence.Node newNode =  new Sequence.Node(val);
        if(head==null){
            head= newNode;
            tail= newNode;
            return;
        }
        tail.next= newNode;
        tail=tail.next;
    }
    //出队列
    public Integer poll(){
        if(head==null){
            return  null;
        }
        int result = head.val;
        head = head.next;
        if(head == null){
            tail = null;     //在这里更新head;删除之后变为空链表
        }
        return  result;
    }
    public  Integer peak(){
        if(head==null){
            return null;
        }
        return head.val;
    }

}
