package algorithm.node;

import algorithm.node.bean.ListNode;
import algorithm.node.util.ListNodeUtil;

/**
 * 获取链表第N个节点
 */
public class GetNodeSizeSolution {

    public static void main(String[] args) {
        ListNode listNode = ListNodeUtil.getListNode();
        int size = size(listNode);
        System.out.println(size);
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
