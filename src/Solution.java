public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;//前指针节点
        ListNode cur=head; //当前指针节点
        //每次循环，都当前结点指向它前面的结点,然后当前节点和前结点后移
        while(cur!=null){
            ListNode nextTemp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nextTemp;
        }
        return prev;
    }
}
