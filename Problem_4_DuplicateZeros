import java.util.*;
class Problem_4_DuplicateZeros {
    public void duplicateZeros(int[] arr) {
    int n = arr.length, c = 0;
    
    for (int num : arr) if (num == 0) c++;
    int i = n - 1;
    int a = n + c - 1;
    
    while (i >= 0 && a >= 0)  {
      
      if (arr[i] != 0) {
        if (a < n) arr[a] = arr[i];
        
      } else {
        if (a < n) arr[a] = arr[i];
        a--;
        if (a < n) arr[a] = arr[i];
      }
      
      i--;
      a--;
    }
	for(int k=0;k<n;k++)
	{
		System.out.println(arr[k]);
	}
}
     public static void main(String args[])
    {
	Scanner in=new Scanner(System.in);
	System.out.println("enter the length of the array:");
	int l=in.nextInt();
	int[] array=new int[l];
	for(int j=0;j<l;j++)
	{
		array[j]=in.nextInt();
	}
	Problem_4_DuplicateZeros p=new Problem_4_DuplicateZeros();
	p.duplicateZeros(array);
}
}
