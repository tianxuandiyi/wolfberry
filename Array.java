import java.util.Arrays;
public class Array {
	
	public static void main( String[] args )
	{
		int[] arr = new int[]{1,2,3,4,5,6,7};
      System.out.println( Arrays.toString(arr) );
	  int tem = 0;
		for(int i = 0;i < arr.length/2 ; i++)
		{
			tem = arr[i];
			arr[i] = arr[arr.length - 1-i] ;
			arr[arr.length - 1-i] = tem;
			
		}
	System.out.println( Arrays.toString(arr) );
	
	
}
}

























