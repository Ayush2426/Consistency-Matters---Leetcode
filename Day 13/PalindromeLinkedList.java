// import java.util.*;

// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  * int val;
//  * ListNode next;
//  * ListNode() {}
//  * ListNode(int val) { this.val = val; }
//  * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */

// public class PalindromeLinkedList {
//     public boolean checkLinkedListPalindrome() {

//         Stack<Integer> st = new Stack<>();

//         ListNode current = head;

//         while (current != null) {
//             st.push(current.val);
//             current = current.next;
//         }

//         ListNode current2 = head;

//         while (current2 != null) {
//             int el = current2.val;
//             if (el != st.pop()) {
//                 return false;
//             }
//         }

//         return true;
//     }
//     public static void main(String[] args) {
//         PalindromeLinkedList pll = new PalindromeLinkedList();
//         pll.checkLinkedListPalindrome();
//     }
// }
