import java.util.*;
class Problem_8_DoubleExist{
    public boolean checkIfExist(int[] arr1) {
        Set<Integer> s=new HashSet<>();
        for(int i:arr1)
        {
            if((i%2)==0 && s.contains(i/2) || s.contains(2*i))
                return true;
                s.add(i);
        }
        
                return false;
            
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
	Problem_8_DoubleExist p=new Problem_8_DoubleExist();
	boolean x=p.checkIfExist(arr);
	System.out.println(x);
}
}
