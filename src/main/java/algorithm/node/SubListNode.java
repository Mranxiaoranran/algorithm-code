package algorithm.node;

import algorithm.node.bean.ListNode;
import algorithm.node.util.ListNodeUtil;

/**
 *  输入起始位置，终止位置截取链表
 */
public class SubListNode {


    public static void main(String[] args) {
        ListNode listNode = ListNodeUtil.getListNode();
        int m = 2;
        int n = 4;
        //获取m节点, n节点
        ListNode mNode = index(listNode, m);
        ListNode nNode = index(listNode, n);
        if(m!=1){
            //获取m的上一个节点
            int mPre =  m -1;
            ListNode mPreNode = index(listNode, mPre);
            mPreNode.next = null;
        }
        ListNode nNextNode = nNode.next;
        nNode.next = null;
        System.out.println(mNode);
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



}
