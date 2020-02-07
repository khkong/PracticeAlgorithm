import java.lang.StringBuilder

class Problem13 {
    //    I             1
    //    V             5
    //    X             10
    //    L             50
    //    C             100
    //    D             500
    //    M             1000
    fun romanToInt(s: String): Int {
        val map = HashMap<Char, Int>().apply {
            this['I'] = 1
            this['V'] = 5
            this['X'] = 10
            this['L'] = 50
            this['C'] = 100
            this['D'] = 500
            this['M'] = 1000
        }

        var result = 0;
        s.forEachIndexed { index, char ->
            if (index < s.length - 1 && map[s[index]]!! < map[s[index + 1]]!!){
            }
        }
        return 0
    }
}
