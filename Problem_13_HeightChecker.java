import java.util.*;
class Problem_13_HeightChecker {
    public int heightChecker(int[] heights) {
        int arr[]=heights.clone();
        Arrays.sort(arr);
        int c=0;
        for(int k=0;k<heights.length;k++)
        {
            if(arr[k]!=heights[k])
                c++;
        }
        return c;
        
    }
     public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the length of the array:");
		int l=in.nextInt();
		int[] arr1=new int[l];
		System.out.println("enter the element of the array:");
		for(int j=0;j<l;j++)
		{
			arr1[j]=in.nextInt();
		}
		System.out.println("\nResult:");
		Problem_13_HeightChecker p=new Problem_13_HeightChecker();
		int res=p.heightChecker(arr1);
		System.out.println(res);
	}
}
