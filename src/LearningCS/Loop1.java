package LearningCS;

public class Loop1 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=10; i++)
		{
			sum=sum+i;
		}
System.out.println(sum);
	
	
	int givenNumber=12345;
	int i=1;
	
	int sum1=0;
	int remainder=0;
	
	while( i<=5)
	{
		remainder=givenNumber%10;
		sum1=sum1+remainder;
		givenNumber=givenNumber/10;

		i++;
	}
	System.out.println(sum1);
	}

	//Prime number or not
	

	
}

