class Search_in_Rotated_Sorted_Array {
public:
    int search(vector<int>& nums, int target) {

        int n = nums.size();

        int low = 0;
        int high = n-1;

        while(low <= high)
        {
          //1 . find mid 
          int mid = ( low + high ) / 2;

          if(nums[mid] == target)
          {
            return mid;
          }

          //2.now,check is our target is might be present in which part of array
          // bcz , as we know their are 2 parts in array , one is sorted and other one is non-sorted part


         // means , if left part is sorted  
          if(nums[low] <= nums[mid])
          {
            //then , check is our target is present between low and mid
            if(nums[low] <= target && target <= nums[mid])
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
          }

         
          // if right part is sorted
          else{
            // if , target element is present in right portion
            if(nums[mid] <= target && target <= nums[high])
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
          }

        }

        // function returns int , so that's why we have to return something so return -1;
        return -1;
        
    }
};