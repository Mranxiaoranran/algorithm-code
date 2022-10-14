package algorithm.node;

import algorithm.node.bean.ListNode;
import algorithm.node.util.ListNodeUtil;

/**
 *  链表反转
 */
public class ReverseListSolution {

    public static void main(String[] args) {
        ListNode listNode = ListNodeUtil.getListNode();
        ListNode result = reverseList(listNode);
        System.out.println(result);
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


}
