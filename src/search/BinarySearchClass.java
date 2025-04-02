package search;

public class BinarySearchClass {
	public static int searchbinary(int val,int[] arr) {
		
//		int left=0;
//		int right=arr.length-1;
//		while(left<=right) {
//			int mid=left+(right-left)/2;
//			if(arr[mid]==val) {
//				return mid;
//			}
//			if(arr[mid]<val) {
//				left=mid+1;	
//			}else {
//				right=mid-1;
//			}
//		}
//		return -1;
		String a1=new String();
		Object a=new Object();
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(arr[mid]==val) {
				return mid;
			}
			if(arr[mid]<val) {
				left=mid+1;
				
			}else {
				right=mid-1;
			}
		}
		return -1;
		
		
	}
	public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40};
        int target = 10;

        int result = searchbinary(target,array);
        if (result == -1) {
            System.out.println("Element not present in the array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
