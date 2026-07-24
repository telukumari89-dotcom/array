public class java{
    public static void main(String[] args){
    int[] a ={5,4,2,9};
    int largest = a[0];
    for(int i=1;i<a.length;i++)
    {
        if(a[i]> largest){
            largest=a[i];
    }
    }
    System.out.println(largest);
 }
}