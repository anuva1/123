import java.util.Scanner;
public class Example 
{
	static int[] arr = new int[8];
	
	public static int binarySearch( int first, int last, int key){  
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      return 0;
		   }  
		   return mid;
		 }  
	 static void swap(int a,int b,int d)
	  {
		  int temp;
	      for(int i =0;i<d;i++)
	      {
	    	temp =arr[a+i];
	    	arr[a+i]=arr[b+i];
	    	arr[b+i]=temp;
	      }
	      
	  }
	static void rotate(int x,int n,int d )
	  {
		  if(d==n || d==0)
			  return;
		  
		  if(d==n-d)
			  swap(0,n-d,d);
		  
		  if(d<n-d)
			  {
				swap(0,n-d,d);
				rotate(0,n-d,d);
			  }
		  if(d>n-d)
		  {
			  swap(0,n-d,d);
			  rotate(n-d,d,2*d-n);
		  }
	  }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//BinarySearch bs = new BinarySearch();
		
		int n =8;
		System.out.println("enter array");
			for(int i=0;i<n;i++)
			{
				arr[i]=i+1;
			}
		System.out.println("enter number of rotations");
			int d = sc.nextInt();
			
			rotate(0,n,d);
			
			
			if(binarySearch(0, n-1-d,4)==0)
			{
				if(binarySearch(n-d, n-1,4)==0)
					System.out.println("element not found");
			}
			        
			         
		
			         
			         
			      
			
			
		System.out.println("Result:");
			for(int i=0;i<8;i++)
			{
				System.out.println(arr[i]);
			}
			
			
	}

}
