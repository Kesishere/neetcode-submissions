class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val resultMap = mutableMapOf<Int, Int>()
        for (i in 0 until nums.size){
            val need = target - nums[i]
        
            if(need in resultMap){
                return intArrayOf(resultMap[need]!!, i)
            }
            resultMap[nums[i]] = i
        }

        return intArrayOf()
    }
}
