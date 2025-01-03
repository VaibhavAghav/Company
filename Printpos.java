public class Printpos{

public static int[] posNeg(int[] arr){

	int n = arr.length;
	int left = 0;
	for(int i =0;i<n;i++)
	{
		int k = i;
		if(arr[i] != 2){
			while(left != k){
				int temp = arr[k];
				arr[k] = arr[k-1];
				arr[k-1] = temp; 
				k --;				
			}
			left ++ ;
		}
		// else{

		// 	int temp = arr[i];

		// 	for(int j =0;j<i;j++){
		// 		if(arr[j] > 0 && arr[j] > temp){
		// 			int var = arr[j];
		// 			arr[j] = temp;
		// 			temp = var;
		// 		}
		// 	}
		// 	arr[i] = temp;
		// }
	}

	return arr;

}

public static void main(String args[]){

	int[] arr = {0,1,2,2,3,0,4,2};

	int n = arr.length;

	int[] res = posNeg(arr);

	for(int i =0;i<n;i++){
		System.out.println(res[i]);
	}


}


}