class Problem5309 {
    fun makeConnected(n: Int, connections: Array<IntArray>): Int {
        val hashSet = hashMapOf<Int, Node>()
        for (i in 0 until n) {
            hashSet[i] = Node(i)
        }

        for (item in connections) {
            val node = hashSet[item[0]]
            if (node?.list?.contains(item[1]) == true) {
                node.list.add(item[1])
            } else {
                node?.list?.add(item[1] + 1)
            }
        }
        return 0
    }
}

class Node(val value: Int) {
    var list = ArrayList<Int>()
}