// public class RemoveLinkedListElement{
//     public ListNode removeNode(ListNode head, int val){
//         ListNode dummy = new ListNode(-1);
//         dummy.next = head;
//         ListNode current = dummy;

//         while(current.next != null){
//             if(current.next.val == val){
//                 current.next = current.next.next;
//             }else{
//                 current = current.next;
//             }
//         }
//         return dummy.next;
//     }
//     public static void main(String[] args) {
//         RemoveLinkedListElement rlle = new RemoveLinkedListElement();
//         rlle.removeNode(null, 0);
//     }
// }