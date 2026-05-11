package LeetCode;

public class intersectionOfTwoLinkedList_160 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // calculate length of list
        int lenA = 0;
        ListNode tempA = headA;
        while (tempA != null) {
            tempA = tempA.next;
            lenA++;
        }
        int lenB = 0;
        ListNode tempB = headB;
        while (tempB != null) {
            tempB = tempB.next;
            lenB++;
        }

        tempA = headA;
        tempB = headB;

        if (lenA > lenB) {
            for (int i = 1; i <= lenA - lenB; i++) {
                tempA = tempA.next;
            }
        }
        else{  // lenB >= lenA
            for (int i = 1; i <= lenB - lenA; i++) {
                tempB = tempB.next;
            }
        }
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;

        /*
        // method 02 :-
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            if (a == null) {
                a = headB;
            } else {
                a = a.next;
            }

            if (b == null) {
                b = headA;
            } else {
                b = b.next;
            }
        }

        return a; // either intersection node or null

         */
    }

    public static void main(String[] args) {
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common; // attach intersection

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common; // attach intersection

        ListNode intersectNode = getIntersectionNode(headA, headB);

        if (intersectNode != null) {
            System.out.println("Intersected at '" + intersectNode.val + "'");
        } else {
            System.out.println("No intersection");
        }
    }
}
