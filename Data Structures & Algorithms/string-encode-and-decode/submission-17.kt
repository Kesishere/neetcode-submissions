class Solution {

    fun encode(strs: List<String>): String {
        
        var encodeString = ""

        for(str in strs){
            encodeString += "${str.length}#$str"
        }

        return encodeString

    }
    


fun decode(str: String): List<String> {
    
    val decodeList = mutableListOf<String>()
    var i = 0

    while(i < str.length){
        var j = i 

        while(str[j] != '#'){
            j++
        }

        val length = str.substring(i, j).toInt()

        i = j + 1

        val decodeWord = str.substring(i, i+length)
        decodeList.add(decodeWord)

        i+= length
    
    }
    return decodeList
}
}
