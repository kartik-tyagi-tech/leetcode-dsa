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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack <Integer> st1=new Stack<>();
        Stack <Integer> st2=new Stack<>();
        Stack <Integer> res=new Stack<>();

        if(l1.val==0) return l2;
        if(l2.val==0) return l1;

        while(l1!=null){
            st1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            st2.push(l2.val);
            l2=l2.next;
        }
        while(st1.size()>0 || st2.size()>0){
              int add=0;


              if (!st1.isEmpty()) add += st1.pop();
            if (!st2.isEmpty()) add+= st2.pop();
              if(add>=10){
                res.push(add%10);
                if(st1.size()==0) st1.push(1);
                else st1.push(st1.pop()+1);
                
              }
              else {
                res.push(add);
              }
        }
        if(st1.size()>0) res.push(st1.pop());
        if(st2.size()>0) res.push(st2.pop());
        
        ListNode out=new ListNode(res.pop());
        ListNode r=out;
        while(res.size()>0){
            out.next = new ListNode(res.pop());
              out=out.next;
        }
        return r;
    }
}