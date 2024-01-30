public int binarySearch(int[] nums, int start, int end, int key){
    int mid = (start+end)/2; // middle index to search
    if (nums[mid] == key) return mid; // if the key is found
    if (nums[mid] > key) binarySearch(nums, start, mid, key); // if the chosen middle is larger than the key, we know that they key should be between start and the middle
    if (nums[mid] < key) binarySearch(nums, mid, end, key); // if the chosen middle is smaller than the key, we know that they key should be between middle and the start
    return -1; // if not found
}