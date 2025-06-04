/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Delete Node in a Linked List{
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
       node.next=node.next.next;
    }
}