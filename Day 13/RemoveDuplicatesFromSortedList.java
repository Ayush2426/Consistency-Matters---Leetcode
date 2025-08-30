// public class RemoveDuplicatesFromSortedList {
//     public ListNode removeDuplicate(ListNode head){
//         ListNode current = head;

//         while(current != null && current.next != null){
//             if(current.val == current.next.val){
//                 current.next = current.next.next;
//             }else{
//                 current = current.next;
//             }
//         }
//         return head;
//     }
//     public static void main(String[] args) {
//         RemoveDuplicatesFromSortedList rdfsl = new RemoveDuplicatesFromSortedList();
//         rdfsl.removeDuplicate(head);
//     }
// }
