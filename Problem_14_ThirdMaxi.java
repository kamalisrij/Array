import java.util.*;
class Problem_14_ThirdMaxi{
    public int n=3;
    public int thirdMax(int[] nums) {
        if(nums.length==0)
            return 0;
        TreeSet<Integer> s=new TreeSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(s.contains(nums[i]))
                continue;
            if(s.size()<n || nums[i]>s.first())
            {
                if(s.size()==n)
                    s.remove(s.first());
                s.add(nums[i]);
            }
        }
        return s.size()==n?s.first():s.last();
        
        
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
		Problem_14_ThirdMaxi p=new Problem_14_ThirdMaxi();
		int res=p.thirdMax(arr1);
		System.out.println(res);
	}
}
