// public class OddEvenLinkedList {
//     public ListNode oddEvenList(ListNode head) {
//         if (head == null || head.next == null || head.next.next == null) {
//             return head;
//         }
//         ListNode odd = head;
//         ListNode even = head.next;
//         ListNode Even = even;

//         while (even != null && even.next != null) {
//             odd.next = odd.next.next;
//             even.next = even.next.next;

//             odd = odd.next;
//             even = even.next;
//         }

//         odd.next = Even;
//         return head;
//     }
//     public static void main(String[] args) {
//         OddEvenLinkedList oell = new OddEvenLinkedList();
//         oell.oddEvenList(null);
//     }
// }
