import java.util.Scanner;


public class firstprogram {

	public static void main(String[] args) {
		// System.out.println("Hello world");
		//int a=8,b=7,c=0;
		
		//c=a+b;
		 
		//
		//System.out.print(c);
		//int x=10;
		//int y=20;
	//if(x+y<20)
	//{
		//System.out.println("x+y is greater than 20");
	//}
	//else
	//{
		//System.out.println("x+y is less than 20");
		/*int num=2;
		switch(num)
		{
		case 0:
			System.out.println("number is zero");
			break;
		case 1:
			System.out.println("number is 1");
			break;
			default:
				System.out.println(num);*/
				
			/*	int sum=0;
				for(int i=0;i<10;i++)
				{
					sum=sum+i;
				}
				System.out.println("sum of first 10 natural number is:"+sum);*/
	/*	int i=0;
		System.out.println("printing the list  of first 10  even number:--\n");
				while(i<=10)
				{
				i=i+2;
				System.out.println(i);
				}*/
		/*int i=0;
		System.out.println("printing the first 10 even number-->\n");
		do {
			i=i+2;
			System.out.println(i);
		}while(i<10);*/
		
		
		/*fibonaci series in java*/
		/*int a=0,b=1,temp;
		//System.out.println(a+""+b);
		for(int i=0;i<=10;i++)
		{
		 temp=a+b;
		System.out.println(""+temp);
		a=b;
		b=temp;
		
		}*/
		
	/*getting input form user*/	/*
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number:");
		num=s.nextInt();
		System.out.println("you have entered"+num);*/
		
		
		/*program for prime number*//*
		int num,rem=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enetr any number to check:");
		num=s.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
			rem++;
				break;
			}
		}
			if(rem!=0)
			{
				System.out.println("enetr number is not  prime");
			}
			else
			{
				System.out.println("eneter number is  prime:");
			}*/
		
		/*program for palindrome number*//*
		int n;
		int sum=0,rem,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number to check:\n");
		n=s.nextInt();
		temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("enetr number is palindrome");
		}
		else
		{
			System.out.println("enter number is not palindrom");
			
		}*/
		
		/*program for factorial*//*
		int n,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number:");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of enter number is:"+fact);*/
		/*program for random number*/
		
	/*	System.out.println("1st random number is:"+Math.random());
		System.out.println("2nd random number is:"+Math.random());
		System.out.println("3rd random number is:"+Math.random());
		System.out.println("4th random number is:"+Math.random());
		System.out.println("5th random number is:"+Math.random());
		System.out.println("6th random number is:"+Math.random());
		System.out.println("7th random number is:"+Math.random());
		System.out.println("8th random number is:"+Math.random());
		System.out.println("9th random number is:"+Math.random());
		System.out.println("10th random number is:"+Math.random());*/
		
		mymethod();
		mymethod();
		mymethod();
		mymethod();
		
		 String productName = "पाउरोटी5kg";
	      List<String> analyzedProduct = new PerformAnalysis().callAnalyzer(productName);
	      System.out.println("Input: " + productName);
	      System.out.println("Output: " + analyzedProduct);
	}
		
		static void mymethod()
		{
			System.out.println("sumitra gyawali");
		}
		
		 
		
	}
		
		   
		
			
		


		 

	
		
		
		
		
		
		
	
		



