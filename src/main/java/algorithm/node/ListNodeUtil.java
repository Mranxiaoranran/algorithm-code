package algorithm.node;

public class ListNodeUtil {


    /**
     *  获取链表
     *
     * @return
     */
    public static ListNode getListNode(){
        ListNode one = new ListNode();
        one.setVal(1);
        ListNode two = new ListNode();
        two.setVal(2);
        ListNode three = new ListNode();
        three.setVal(3);
        ListNode four = new ListNode();
        four.setVal(4);
        ListNode five = new ListNode();
        five.setVal(5);
        one.setNext(two);
        two.setNext(three);
        three.setNext(four);
        four.setNext(five);
        return  one;
    }



}

