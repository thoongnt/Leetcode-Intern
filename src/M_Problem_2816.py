from typing import Optional

from ListNode import ListNode


class Solution:
    def doubleIt(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head.val > 4:
            head = ListNode(0, head)
        cur = head
        while cur:
            cur.val = (cur.val * 2) % 10
            if cur.next and cur.next.val > 4:
                cur.val += 1
            cur = cur.next
        return head
