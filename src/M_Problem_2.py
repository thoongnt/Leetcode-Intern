from typing import Optional

from ListNode import ListNode


class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        head = ListNode(0)
        tail = head
        carry = 0
        while l1 or l2 or carry > 0:
            d1 = l1.val if l1 else 0
            d2 = l2.val if l2 else 0
            sum = d1 + d2 + carry
            digit = sum % 10
            carry = sum // 10
            new_node = ListNode(digit)
            tail.next = new_node
            tail = new_node
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
        return head.next
