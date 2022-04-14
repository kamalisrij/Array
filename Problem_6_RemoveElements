import java.util.*;
class Problem_6_RemoveElements{
    public int removeElement(int[] nums, int val) {
        int m = 0;    
        for(int i = 0; i < nums.length; i++){
       
        if(nums[i] != val){
           nums[m] = nums[i];
           m++;
       }
   }
   
   return m;
        
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
		System.out.println("enter the value:");
		int n=in.nextInt();
		Problem_6_RemoveElements p=new Problem_6_RemoveElements();
		int r=p.removeElement(arr,n);
		System.out.println(r);
}
}
