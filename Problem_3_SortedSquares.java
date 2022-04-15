import java.util.*;
class Problem_3_SortedSquares {
    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int i = 0, j = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[p] = A[i] * A[i];
                i++;
            } else {
                result[p] = A[j] * A[j];
                j--;
            }
        }
        return result;
       
    }
    public static void main(String args[])
    {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the length of the array:");
	int l=in.nextInt();
	int[] arr=new int[l];
	System.out.println("Enter the element of the array:");
	for(int j=0;j<l;j++)
	{
		arr[j]=in.nextInt();
	}
	Problem_3_SortedSquares s=new Problem_3_SortedSquares();
	int a[]=s.sortedSquares(arr);
	for(int k=0;k<l;k++)
	{
		System.out.println(a[k]);
	}
	
	
}
}
