// public class IntersectionLinkedList {
//     public int reverse(ListNode head) {
//         ListNode ptr = head;
//         int count = 0;

//         while (ptr != null) {
//             count++;
//             ptr = ptr.next;
//         }
//         return count;
//     }

//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         if (headA == null || headB == null) {
//             return null;
//         }
//         int sizeA = reverse(headA);
//         int sizeB = reverse(headB);

//         int dif = sizeA - sizeB;

//         ListNode ptr1 = headA;
//         ListNode ptr2 = headB;

//         if (dif > 0) {
//             while (dif > 0) {
//                 ptr1 = ptr1.next;
//                 dif--;
//             }
//         } else {
//             while (dif < 0) {
//                 ptr2 = ptr2.next;
//                 dif++;
//             }
//         }

//         while (ptr1 != ptr2) {
//             ptr1 = ptr1.next;
//             ptr2 = ptr2.next;
//         }
//         return ptr1;
//     }
//     public static void main(String[] args) {
//         IntersectionLinkedList ill = new IntersectionLinkedList();
//         ill.getIntersectionNode(null, null);
//     }
// }
