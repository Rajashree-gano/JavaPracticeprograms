package com.stackroute.coding;
import com.stackroute.coding.Member;

public class MemberVariable {
	

		 public static String [] displayMemberVariable(String[] a)
		
		{
	       Member obj=new Member();
	       obj.Name="HarryPotter";
	       obj.Age=30;
	       obj.Salary=(float)2500.3;
	       String str=a[0].concat(obj.Name).concat(",").concat(a[1]).concat(Integer.toString(obj.Age)).concat(",").concat(a[2]).concat(Float.toString(obj.Salary));
		   return str.split(",");
	}

}
