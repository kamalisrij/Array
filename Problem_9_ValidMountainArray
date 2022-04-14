import java.util.*;
class Problem_9_ValidMountainArray{
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)
            return false;
        int i=1;
        while(i<arr.length && arr[i]>arr[i-1])
            i=i+1;
        if(i==1 || i==arr.length)
            return false;
        while(i<arr.length && arr[i]<arr[i-1])
            i=i+1;
        return i==arr.length;
        
    }
    public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the length of the array:");
		int l=in.nextInt();
		int[] arr1=new int[l];
		for(int j=0;j<l;j++)
		{
			arr1[j]=in.nextInt();
		}
	Problem_9_ValidMountainArray p=new Problem_9_ValidMountainArray();
	boolean res=p.validMountainArray(arr1);
	System.out.println(res);
}
}
