/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode 
{
     int val;
     ListNode next;
     ListNode(int val) 
     { 
        this.val = val; 
        }
     
 }
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
           ListNode res = new ListNode(0);
           ListNode ret = res;
           int carry = 0;
           while(l1!= null || l2!=null)
           {
            int sum = 0;
            if(l1!=null)
            {
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null)
            {
                sum+=l2.val;
                l2=l2.next;
            }
            sum = sum+carry;
            carry = sum/10;
            sum = sum%10;
            res.next = new ListNode(sum);
            res = res.next;
           } 
           if(carry==1) res.next = new ListNode(carry);
           return ret.next;
    }
}
public class AddTwoNumber 
{
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = sol.addTwoNumbers(l1, l2);
        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

    }
}