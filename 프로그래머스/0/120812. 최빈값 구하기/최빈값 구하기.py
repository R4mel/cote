def solution(array):
    nums = [0 for _ in range(1000)]
    
    for i in array:
        nums[i] += 1
    
    max_count = max(nums)
    index_count = 0
    for i in nums:
        if max_count == i:
            index_count += 1
    
    if index_count > 1:
        return -1
    else:
        return nums.index(max_count)
