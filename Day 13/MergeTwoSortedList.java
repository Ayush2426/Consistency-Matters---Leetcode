// public class MergeTwoSortedList {
//     public ListNode getMergedList(ListNode list1, ListNode list2){
//         ListNode dummy = new ListNode(-1);

//         while(list1 != null & list2 != null){
//             if(list1.val <= list2.val){
//                 dummy.next = lis1;
//                 list1 = list1.next;
//             }else{
//                 dummy.next = list2;
//                 list2 = list2.next;
//             }

//             if(list1 != null){
//                 dummy.next = list;
//             }else{
//                 dummy.next = list2;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         MergeTwoSortedList mtsl = new MergeTwoSortedList();
//         mtsl.getMergedList(list1, list2)
//     }
// }
