package sort;

public class SelectionSort {

	public static void main(String []args) {
		int arr[]= {2,1,5,98,45,78};
//		select Minimum value
//		for(int i=0;i<arr.length-1;i++) {
//			int minIndex=i;
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[j]<arr[minIndex]) {
//					minIndex=j;
//				}
//			}
//			int temp=arr[minIndex];
//			arr[minIndex]=arr[i];
//			arr[i]=temp;
//		}
//		Select Maximum Value
		for(int i=0;i<arr.length-1;i++) {
			int maxIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[maxIndex]>arr[j]) {
					maxIndex=j;
				}
			}
			int temp=arr[maxIndex];
			arr[maxIndex]=arr[i];
			arr[i]=temp;
		}
		for(int i:arr) {
			System.out.print(i+",");
		}
	}
}
