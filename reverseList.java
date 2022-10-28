/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prenode,curnode,nextnode;
        if(head==null || head.next==null)
            return head;
        
            
        else{
            prenode=head;
            curnode=head.next;
            while(curnode!=null){
                nextnode=curnode.next;
                curnode.next=prenode;
                prenode=curnode;
                curnode=nextnode;
            }
            head.next=null;
            head=prenode;
        }
       
        return prenode;
    }
}
