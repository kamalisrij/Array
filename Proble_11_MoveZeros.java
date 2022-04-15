import java.util.*;
class Problem_11_MoveZeros {
    public void moveZeros(int[] nums,int len) {
	int [] n=nums;
	int l1=len;
        if(l1==0 || nums==null)
            return;
        int ind=0;
        for(int i:nums)
        {
            if(i!=0)
            {
                nums[ind++]=i;
            }
        }
        while(ind<l1)
        {
            nums[ind++]=0;
        }
    for(int k=0;k<l1;k++)
	{
		System.out.println(nums[k]);
	}
}
     public static void main(String args[])
    {
	Scanner in=new Scanner(System.in);
	System.out.println("enter the length of the array:");
	int l=in.nextInt();
	int[] array=new int[l];
	System.out.println("enter the element of the array:");
	for(int j=0;j<l;j++)
	{
		array[j]=in.nextInt();
	}
	System.out.println("Result");
	Problem_11_MoveZeros p=new Problem_11_MoveZeros();
	p.moveZeros(array,l);
     }
}
