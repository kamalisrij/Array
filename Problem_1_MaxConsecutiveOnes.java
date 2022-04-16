import java.util.*;
class Problem_1_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int res=0;
        for (int i : nums)
        {
            if(i==1){
                c=c+1;
                if(res<c)
                {
                    res=c;
                }
            }
            else
                c=0;
        
        }
        return res;
}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the length of the array:");
		int l=in.nextInt();
		int[] arr=new int[l];
		System.out.println("enter the elements of the array:");
		for(int j=0;j<l;j++)
		{
			arr[j]=in.nextInt();
		}
		Problem_1_MaxConsecutiveOnes p=new Problem_1_MaxConsecutiveOnes();
		int r=p.findMaxConsecutiveOnes(arr);
		System.out.println(r);
		
	}
}
