class Problem1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val map = hashMapOf<Int, Int>()
        nums.forEachIndexed { index, value ->
            val pairKey = target - value
            if (map.containsKey(pairKey)) {
                return intArrayOf(map[pairKey]!!, index)
            }
            map[value] = index
        }
        return intArrayOf()
    }
}