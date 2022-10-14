package algorithm.node;

import algorithm.node.bean.ListNode;
import algorithm.node.util.ListNodeUtil;

public class ReverseBetweenSolution {

    public static void main(String[] args) {
        ListNode listNode = ListNodeUtil.getListNode();
        int m = 3;
        int n = 5;
        ListNode reult = reverseBetween(listNode, m, n);
        System.out.println(reult);
    }
    /**
     *
     * @param head ListNode类
     * @param m int整型
     * @param n int整型
     * @return ListNode类
     */
    public static  ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
        //获取m节点, n节点
        if(m==n){
            return  head;
        }
        int size = size(head);
        if(m==1 && n == size ){
           return reverseList(head);
        }
        if(m==1){
            ListNode mNode = head;
            ListNode nNode = index(head, n);
            ListNode nNextNode = nNode.next;
            nNode.next = null;
            ListNode reverseNode = reverseList(head);
            mNode.next = nNextNode;
            return reverseNode;
        }
        if(n == size){
            ListNode mNode = index(head, m);
            ListNode mPreNode = index(head,m-1);
            mPreNode.next = null;
            ListNode reverseNode = reverseList(mNode);
            mPreNode.next = reverseNode;
            return  head;
        }
        ListNode mNode = index(head, m);
        ListNode nNode = index(head, n);
        ListNode mPreNode = index(head,m-1);
        ListNode nNextNode = nNode.next;
        mPreNode.next = null;
        nNode.next = null;
        ListNode reverseNode = reverseList(mNode);
        mPreNode.next = reverseNode;
        mNode.next = nNextNode;
        return  head;
    }


    public static ListNode reverseList(ListNode head) {
        //上一个节点
        ListNode pre = null ;
        //下一个节点
        ListNode next = null;
        //循环的当前节点
        ListNode curr = null;
        //循环
        while(head!=null){
            //记录当前节点值
            curr = head;
            //记录当前节点值的下一个节点
            next = head.next;
            //当前节点的下一个节点为上一个节点
            head.next = pre;
            //上一个节点为当前节点
            pre = curr;
            //循环的链表位置进行变化
            head = next;
        }
        return pre;
    }


    /**
     * 获取指定位置的节点
     *
     * @param listNode
     * @param index
     * @return
     */
    public static ListNode index(ListNode listNode , int index){
        ListNode dummyNode = new ListNode();
        dummyNode.setVal(-1);
        dummyNode.setNext(listNode);
        for(int i = 0 ; i< index; i++){
            dummyNode = dummyNode.getNext();
        }
        return  dummyNode;
    }

    public static  int size(ListNode listNode){
        if(listNode==null){
            return  0 ;
        }
        int size = 0;
        while (listNode!=null){
            listNode = listNode.next;
            size ++ ;
        }
        return  size;
    }
}
