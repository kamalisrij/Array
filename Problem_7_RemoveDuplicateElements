import java.util.*;
class Problem_7_RemoveDuplicateElements{
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums){
            if (i == 0 || n > nums[i-1])
            nums[i++] = n;
        }
    return i;
    }
    public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the length of the array:");
		int l=in.nextInt();
		int[] arr=new int[l];
		for(int j=0;j<l;j++)
		{
			arr[j]=in.nextInt();
		}
		Problem_7_RemoveDuplicateElements p=new Problem_7_RemoveDuplicateElements();
		int r=p.removeDuplicates(arr);
		System.out.println(r);
}
}
