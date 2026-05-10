class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        //nums = [1,2,4,6]
        val result = IntArray(nums.size) {1}
        var prefix = 1
        
        for (i in nums.indices){
            result[i] = prefix  //[1, 2, 8, 24]
            prefix *= nums[i]
        }

        var postfix = 1

        for(i in nums.size -1 downTo 0){
            result[i] *= postfix // [48, 24, 48, 24]
            postfix *= nums[i]
        }

        return result
    }
}
