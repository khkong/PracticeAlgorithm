import org.junit.Before
import org.junit.Test

class Problem2Test {

    lateinit var solution: AddTwoNumbers

    @Before
    fun setUp() {
        solution = AddTwoNumbers()
    }

    @Test
    fun case1() {
        var result = solution.addTwoNumbers(
            ListNode(2).apply {
                this.next = ListNode(4).apply {
                    this.next = ListNode(3)
                }
            },
            ListNode(5).apply {
                this.next = ListNode(6).apply {
                    this.next = ListNode(4)
                }
            }
        )
        assert(result?.`val` == 7)
        result = result?.next
        assert(result?.`val` == 0)
        result = result?.next
        assert(result?.`val` == 8)
    }

    @Test
    fun case2() {
        var result = solution.addTwoNumbers(
            ListNode(5),
            ListNode(5)
        )
        assert(result?.`val` == 0)
        result = result?.next
        assert(result?.`val` == 1)
    }

    @Test
    fun case3() {
        var result = solution.addTwoNumbers(
            ListNode(1),
            ListNode(9).apply {
                this.next = ListNode(9)
            }
        )
        assert(result?.`val` == 0)
        result = result?.next
        assert(result?.`val` == 0)
        result = result?.next
        assert(result?.`val` == 1)
    }
}
