// public class LinkedListCycle {
//     public boolean hasCycle(ListNode head) {
//         ListNode A = head;
//         ListNode B = head;

//         if (head == null || head.next == null) {
//             return false;
//         }

//         while (B != null && B.next != null) {
//             B = B.next.next;
//             A = A.next;

//             if (A == B) {
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         LinkedListCycle llc = new LinkedListCycle();
//         llc.hasCycle(llc);
//     }
// }
