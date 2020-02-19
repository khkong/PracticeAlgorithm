public class Problem21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = null;
        ListNode curr = null;
        ListNode first = l1;
        ListNode second = l2;

        while (first != null || second != null) {
            int firstValue = Integer.MAX_VALUE;
            int secondValue = Integer.MAX_VALUE;
            if (first != null) {
                firstValue = first.val;
            }
            if (second != null) {
                secondValue = second.val;
            }

            if (firstValue < secondValue) {
                if (root == null) {
                    root = first;
                    curr = root;
                } else if (curr != null) {
                    curr.next = first;
                    curr = curr.next;
                }
                if (first != null)
                    first = first.next;
            } else {
                if (root == null) {
                    root = second;
                    curr = root;
                } else if (curr != null) {
                    curr.next = second;
                    curr = curr.next;
                }
                if (second != null)
                    second = second.next;
            }
        }

        return root;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

  136  git config --local user.name "khkong"
          137  git config --local user.email "khkong0928@naver.com"