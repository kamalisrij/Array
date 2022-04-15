import java.util.*;
class Problem_15_DisappearedValue{
    public void findDisappearedNumbers(int[] nums) {
        for (int i=0;i<nums.length;i++)
        {
            while(nums[i]!=i+1 && nums[i]!=nums[nums[i]-1])
            {
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }
        }
        List<Integer> res=new ArrayList<Integer>();
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
                res.add(j+1);
        }      
        for(int e=0;e<res.size();e++)
	{
		System.out.println(res.get(e));
	}
    }
    public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the length of the array upto which you want the values:");
		int l=in.nextInt();
		int[] arr1=new int[l];
		System.out.println("enter the element of the array:");
		for(int ele=0;ele<l;ele++)
		{
			arr1[ele]=in.nextInt();
		}
		System.out.println("\nResult:");
		Problem_15_DisappearedValue p=new Problem_15_DisappearedValue();
		p.findDisappearedNumbers(arr1);
	}

}
