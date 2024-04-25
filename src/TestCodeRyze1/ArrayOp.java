package TestCodeRyze1;

public class ArrayOp {

	public static void main(String[] args) {
		int arr[]= {23,12,18,7,19,78,45,76};
		
		System.out.println("Length of the Array ="+arr.length);
		
		for(int i=0;i<arr.length;i++)
		{
			if(i==5)
				break;
			else
				
			System.out.print(arr[i]+" ");
		
		}
		System.out.println("\n");
		for(int j=0; j<arr.length;j++)
		{
			if(j==2)
				continue;
			else
				System.out.print(arr[j]+" ");
			
		}

	}

}
