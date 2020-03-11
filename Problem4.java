class Problem4{
  public static void main (String[] args) {
		int L[] = {1, 3, 5, 6, 8};
		int R[] = {0, 2, 10};
		int arr[] = new int[L.length + R.length];
		int i = 0, j = 0; 
        int k = 0; 
        while (i < L.length && j < R.length) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < L.length) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < R.length) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
        for(i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

	}
}
