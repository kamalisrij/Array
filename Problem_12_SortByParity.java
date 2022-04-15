import java.util.*;
class Problem_12_SortByParity {
    public int[] sortArrayByParity(int[] nums) {
        int arr[]=new int[nums.length];
        int i=0;
        int e=nums.length-1;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]%2==0)
                arr[i++]=nums[j];
            else
                arr[e--]=nums[j];
        }
        return arr;
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
		Problem_12_SortByParity p=new Problem_12_SortByParity();
		int res[]=p.sortArrayByParity(arr1);
		for(int k=0;k<l;k++)
		{
		    System.out.println(res[k]);
		}
	}
}
		
