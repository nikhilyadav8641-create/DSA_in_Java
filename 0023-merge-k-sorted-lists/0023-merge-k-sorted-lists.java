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
    public ListNode merge (ListNode a,ListNode b)
    {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(a!=null && b!=null)
        {
            if(a.val<b.val)
            {
                temp.next=a;
                a=a.next;
            }
            else
            {
                temp.next=b;
                b=b.next;
            }
            temp=temp.next;
        }
        if(a!=null)
        temp.next=a;
        else
        temp.next=b;
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        ListNode res=lists[0];
        for(int i=1;i<lists.length;i++)
        {
            res=merge(res,lists[i]);
        }
        return res;
    }
}