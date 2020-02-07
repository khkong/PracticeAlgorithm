import java.lang.Exception

class Problem5144 {
    fun matrixBlockSum(mat: Array<IntArray>, K: Int): Array<IntArray> {
        val arr = Array(mat.size) {
            IntArray(mat[0].size)
        }
        for (i in 0 until mat.size) {
            for (j in 0 until mat[i].size) {
                arr[i][j] = getBlockSum(mat, i, j, K)
            }
        }
        return arr
    }

    private fun getBlockSum(mat: Array<IntArray>, i: Int, j: Int, K: Int): Int {
        var result = 0

        for (i2 in i - K..i + K) {
            for (j2 in j - K..j + K) {
                try {
                    result += mat[i2][j2]
                } catch (e: Exception) {

                }
            }
        }
        return result
    }
}
