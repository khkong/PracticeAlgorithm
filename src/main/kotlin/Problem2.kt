class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var startL1 = l1
        var startL2 = l2
        var result: ListNode? = null
        var next: ListNode? = null
        var add = 0
        while (startL1 != null || startL2 != null) {
            val value1 = startL1?.`val` ?: 0
            val value2 = startL2?.`val` ?: 0
            val tmp = (value1 + value2) + add
            if (result == null) {
                result = ListNode(tmp % 10)
                next = result
            } else {
                next?.next = ListNode(tmp % 10)
                next = next?.next
            }
            add = tmp / 10
            startL1 = startL1?.next
            startL2 = startL2?.next
        }

        if (add > 0) {
            next?.next = ListNode(add % 10)
        }
        return result
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
