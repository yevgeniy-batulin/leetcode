package easy.linkedlist;

// https://leetcode.com/problems/delete-node-in-a-linked-list/
class DeleteNodeInLinkedList_237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}