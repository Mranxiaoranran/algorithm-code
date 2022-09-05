package algorithm.node;



/**
 *  获取链表第N个元素
 */
public class GetNNodeSolution {


    public static void main(String[] args) {
        ListNode listNode = ListNodeUtil.getListNode();
        ListNode dummyNode = new ListNode();
        dummyNode.setVal(0);
        dummyNode.setNext(listNode);
        int n = 1;
        for(int i = 0 ; i<n; i++){
            dummyNode = dummyNode.getNext();
        }
        System.out.println(dummyNode);
    }


}
