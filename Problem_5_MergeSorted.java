import java.util.*;
class Problem_5_MergeSorted {
    public void merge(int[] A, int m, int[] B, int n) {
            int i = m - 1, j = n - 1, k = m + n - 1;
            while(i >= 0 && j >= 0) {
                A[k--] = A[i] > B[j] ? A[i--] : B[j--];
            }
            while(j >= 0) {
                A[k--] = B[j--];
            }
            for(int ele:A)
            {
            System.out.println(ele);
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the length of the array1:");
        int l1=in.nextInt();
        int[] array1=new int[l1];
        System.out.println("enter the elements of the array1:");
        for(int e1=0;e1<l1;e1++)
        {
            array1[e1]=in.nextInt();
        }
        System.out.println("enter the length of the array2:");
        int l2=in.nextInt();
        int[] array2=new int[l2];
        System.out.println("enter the elements of the array2:");
        for(int e2=0;e2<l2;e2++)
        {
            array2[e2]=in.nextInt();
        }
        int l=l1-l2;
        Problem_5_MergeSorted p=new Problem_5_MergeSorted();
        p.merge(array1,l,array2,l2);
    }
}
