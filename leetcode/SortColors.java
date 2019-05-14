/*
    Given an array with n objects colored red, white or blue, sort them in-place 
    so that objects of the same color are adjacent, with the colors in the order red,
    white and blue.

    Here, we will use the integers 0, 1, and 2 to represent the color red, white,
    and blue respectively.
*/
class SortColors {
    public void sort012(int[] nums) {
        int[] countArr = new int[3];
        
        for(int i = 0; i < nums.length; i++) {
            countArr[nums[i]]++;
        }
        
        for(int i = 0; i < countArr[0]; i++)
            nums[i] = 0;
        
        for(int i = countArr[0]; i < countArr[0] + countArr[1]; i++)
            nums[i] = 1;
        
        for(int i = countArr[1] + countArr[0]; i < countArr[2] + countArr[1] + countArr[0]; i++)
            nums[i] = 2;
        
    }
}