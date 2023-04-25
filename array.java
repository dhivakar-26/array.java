import java.util.*;
import java.util.Arrays;
public class array{
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the size ot the Element:");
    int size=s.nextInt();
    int arr[]=new int[5];
    System.out.println("Enter the array Element:");
    for(int i=0;i<size;i++){
        arr[i]=s.nextInt();
    }
    System.out.println("Entered Array Elements are:");
    
    for(int i=0;i<size;i++){
        System.out.println(arr[i]+"");
    }
    Arrays.sort(arr);
    System.out.println("Entered Array Elements are:"+Arrays.toString(arr));
    System.out.println("small Array Elements are:"+arr[0]);
    System.out.println("Big Array Elements are:"+arr[4]);
    

   
    

}
}