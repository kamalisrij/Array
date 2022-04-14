import java.util.*;
import java.lang.Math;
class Problem_10_ReplaceElement {
    public void replaceElements(int[] arr,int l) {
	int len=l;
        int m=arr[len-1];
        arr[len-1]=-1;
        for(int i=len-2;i>-1;i--)
        {
            int c=arr[i];
            arr[i]=m;
            m=Math.max(c,m);
        }
        for(int k=0;k<len;k++)
	{
	    System.out.println(arr[k]);
        }
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
		Problem_10_ReplaceElement p=new Problem_10_ReplaceElement();
		p.replaceElements(arr1,l);
}
}
