import java.util.*;
class Problem_2_EvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int sol = 0;                            
	    for(int n : nums)                      
		    if(getNumberOfDigits(n) % 2 == 0) 
			    sol++;                          
	    return sol;                             
}

    public int getNumberOfDigits(int num) {
	    int count = 1;                         
	    while((num /= 10) != 0)                 
		    count++;                           
	    return count;
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
	Problem_2_EvenNumberOfDigits p=new Problem_2_EvenNumberOfDigits();
	int r=p.findNumbers(arr);
	int s=p.getNumberOfDigits(r);
	System.out.println("even digit number:");
	System.out.println(r);
		
	}
}
