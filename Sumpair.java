import java.util.Scanner;
public class Sumpair 
{
	static int[] arr = new int[8];
	public static int binarySearch( int first, int last, int key){  
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        //System.out.println("Element is found at index: " + mid);  
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
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 
		 int n =8;
			System.out.println("enter array");
				for(int i=0;i<n;i++)
				{
					arr[i]=i+1;
				}
			System.out.println("enter sum value");
			int k= sc.nextInt();
			
			for(int i=0;i<n-1;i++)
			{
				int num = k-arr[i];
				if(binarySearch(i+1, n-1, num)!=0)
				{
					System.out.println("true");
					System.exit(0);
				}
				else
				{
					System.out.println("false");
					System.exit(0);
				}
			}

	}

}
