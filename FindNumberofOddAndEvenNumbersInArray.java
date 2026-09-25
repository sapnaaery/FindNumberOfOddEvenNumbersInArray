package day7;

public class FindNumberofOddAndEvenNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[]= {10, 8, 31, 80, 9, 37, 56, 42, 55};
		int evenCounter=0;
		int oddCounter=0;
		
		for(int x=0; x<i.length; x++)
		{
			if(i[x]%2==0)
			{
				evenCounter++;
			}
			else
			{
				oddCounter++;
			}
		}
		System.out.println("Number of Even numbers is: "+evenCounter);
		System.out.println("Number of odd numbers is: "+oddCounter);

	}

}
