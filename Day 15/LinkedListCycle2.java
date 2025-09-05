// public class LinkedListCycle2{
//     public ListNode checkCycle(ListNode head){
//         ListNode fast = head;
//         ListNode slow = head;
//         ListNode ptr = head;

//         while(fast != null && fast.next != null){
//             fast = fast.next.next;
//             slow = slow.next;


//             if(fast == slow){
//                 while(ptr != slow){
//                     ptr = ptr.next;
//                     slow = slow.next;
//                 }
//                 return ptr;
//             }
//         }
//         return null;
//     }
//     public static void main(String[] args) {
//         LinkedListCycle llc = new LinkedListCycle();
//         llc.checkCycle(null);
//     }
// }