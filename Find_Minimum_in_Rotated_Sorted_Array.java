class Find_Minimum_in_Rotated_Sorted_Array
 {
public:
    int findMin(vector<int>& nums) {

        int n = nums.size();

        int ans = INT_MAX;

        int low = 0;
        int high = n-1;

        while(low <= high)
        {
           int mid = ( low + high ) / 2;

           // find out which one is sorted part , and store the first element of of sorted part
           // as a smallest and erase the sorted part
           if(nums[low] <= nums[mid] ){
            
                ans =min(ans, nums[low]);
                low = mid + 1;
           }

           else{
                ans = min(ans,nums[mid]);
                high = mid-1;
            }

        }

        return ans;
        
    }
};