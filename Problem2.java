class Problem2{
public static void main (String[] args) {
		int arr[] = {1, 3, 5 ,2 ,6, 1, 5, 3, 5, 2};
		for(int i = arr.length - 1; i >= 0; i--)
		{
		    int j = i - 1;
		    for(; j >= 0; j--)
		    {
		        if(arr[i] == arr[j])
		            break;
		    }
		    if(j == -1)
		        System.out.print(arr[i] + " ");
		}
}
}
