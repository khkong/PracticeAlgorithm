class Problem5143 {

    fun decompressRLElist(nums: IntArray): IntArray {
        val list = arrayListOf<Int>()
        var i = 0
        while (i < nums.size) {
            for (j in 0 until nums[i]) {
                list.add(nums[i + 1])
            }
            i += 2
        }
        return list.toIntArray()
    }
}
