class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val set1 = nums.toSet()
            var current = 0
        
        for(number in set1){

            if(set1.contains(number - 1)){
                continue
            }else{
                var length = 1

                while(set1.contains(number + length)){
                    length += 1
                }

                current = maxOf(current, length)

            }


        }

        return current
    }
}
