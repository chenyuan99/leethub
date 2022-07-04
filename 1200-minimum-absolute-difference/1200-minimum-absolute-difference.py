class Solution:
    def minimumAbsDifference(self, arr: List[int]) -> List[List[int]]:
        arr.sort()
        index = 1
        result_dict : dict = {}
        min_diff = arr[len(arr)-1] - arr[0] + 1
        while index < len(arr):
            if min_diff > arr[index] - arr[index-1]:
                result_list :list[list] = [[arr[index-1],arr[index]]]
                min_diff =  arr[index] - arr[index-1]
                result_dict.update({str(min_diff):result_list})
            elif arr[index] - arr[index-1] == min_diff:
               result_list:list[list]=  result_dict[str(min_diff)]
               result_list.append([arr[index-1],arr[index]])
            index += 1

        return result_dict.get(str(min_diff))