class Solution {

    fun encode(strs: List<String>): String {
    var str = ""

    for (str1 in strs) {
        str += "${str1.length}#$str1"
    }

    return str
}

fun decode(str: String): List<String> {
    val list = mutableListOf<String>()
    var i = 0
    while(i< str.length){
        var j = i

        while (str[j] != '#'){
            j++
        }
        val length = str.substring(i,j).toInt()
        i = j+1
        list.add(str.substring(i, i + length))
        i += length
    }
    

    return list
}
}
