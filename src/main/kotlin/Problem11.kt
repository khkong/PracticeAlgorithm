class Problem11 {
    fun maxArea(height: IntArray): Int {
        var i = 0
        var j = height.size - 1
        var bestCost = 0
        while (i < j) {
            val min = Math.min(height[i], height[j])
            val cost = min * (j - i)
            if (cost > bestCost)
                bestCost = cost

            if (height[i] > height[j]) {
                j--
            } else {
                i++
            }
        }
        return bestCost
    }
}
