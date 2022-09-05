package algorithm.node;

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
