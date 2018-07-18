package com.stackroute.coding;

public class Commoncode {
	public int getReverse(int number)
	{
		int temp,sum=0,r;
		temp=number;
		while(number>0) {
			r=number%10;
			sum=(sum*10)+r;
			number=number/10;
			
		}
		if(temp==sum)
		{
			return 1;
		}
		else
		
		return 0;
	}
public int getPower(int number) 
{
	if(number==0)
	return 0;
	while(number!=1)
	{
		if(number%4!=0)
			return 0;
		number=number/4;
	}
	return 1;
		
	}


 public float getAvg(int a[])
{ 
	float avg;
	int sum=0;
	int n=a.length;
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
	
	}
	avg	=(float)sum/n;

 return avg;
 }
 public int getMax(int a [])
 { 
	    int maxValue = a[0]; 
	    for(int i=1;i < a.length;i++){ 
	      if(a[i] > maxValue){ 
	         maxValue = a[i]; 
	      } 
	    } 
	    return maxValue; 
	  }
 public  int getMin(int a[])
 { 
	    int minValue = a[0]; 
	    for(int i=1;i<a.length;i++){ 
	      if(a[i] < minValue){ 
	        minValue = a[i]; 
	      } 
	    } 
	    return minValue; 
}
 public int printIntFactorials(int i,int fn)
 {
     while (true)
     {
         System.out.printf("The factorial of %1$d is is %2$d.\n", i, fn);
         if (Integer.MAX_VALUE / fn < (i+1)) {
             System.out.printf("The factorial of %d is out of range.\n", (i+1));
             break;
         }
         i++;
         fn *= i;
     }
      return fn;
      }
      
 
 

 
 public long printLongFactorials(long i,long fn)
 {
     
     while (true)
     {
    	 System.out.printf("The factorial of %1$d is is %2$d.\n", i, fn);

         
         if (Long.MAX_VALUE / fn < (i+1)) {
             System.out.printf("The factorial of %d is out of range.\n", (i+1));
             break;
         }
         i++;
         fn *= i;
     }
     return fn;
 
 }
 }






