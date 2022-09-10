//class solution{
//	int[] arr;
//	int left;
//	int right;
//
//	solution(){
//		arr = {1,2,3,4,5,6,7,8,9};
//		left = 0;
//		right = size - 1;
//	}
//	public static int findNum(int value){
//		return find(left, right, value);
//	}
//
//	public static int find(int left, int right, int value){
//		int mid = (left + (right-1))/2;
//
//		if(value == arr[mid]){
//		    return mid;
//		}
//
//		if(value > arr[mid]){
//		   return find(left, mid-1, value);
//		}
//		else{
//		   return find(mid, right, value);
//		}
//		return -1;
//
//	}
//}
//
//public binarySearch{
//	public static void main((String[] args){
//		Solution st = new Solution();
//
//		int x = st.findNum(4);
//
//		if(x == -1)
//			System.out.println("Found");
//		else
//			System.out.println("Not Found");
//	}
//}