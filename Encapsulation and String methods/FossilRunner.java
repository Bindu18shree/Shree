package com.xworkz.watch.runner;

public class FossilRunner {
	
	public static void main(String[] args) {
		
		String modelNumber = " BQ3721";
		String number = " Bindu0018";
		
		StringBuilder builder  = new StringBuilder("Kprakash0064@gmail.com");
		
		
		boolean value = modelNumber.contains("BQ");
		boolean value1 = modelNumber.contains("31");
		boolean value2 = modelNumber.contains(modelNumber);
		boolean numberValue = modelNumber.contains(number);
		
		System.out.println("value :" +value);
		System.out.println("value1 :" +value1);
		System.out.println("value2 :" +value2);
		System.out.println("number :" +number);
		
		
		boolean yesOrNo = modelNumber.endsWith(modelNumber);
		boolean yesOrNo1 = modelNumber.endsWith("21");
		boolean yesOrNo2 = modelNumber.endsWith("1");
		boolean yesOrNo3 = modelNumber.endsWith("Q");
		
		System.out.println("yesOrNo :" +yesOrNo);
		System.out.println("yesOrNo1 :" +yesOrNo1);
		System.out.println("yesOrNo2 :" +yesOrNo2);
		System.out.println("yesOrNo3 :" +yesOrNo3);
		
		
		boolean trueOrFalse = modelNumber.matches(modelNumber);
		boolean trueOrFalse1 = modelNumber.matches("Q");
		
		System.out.println("trueOrFalse :" +trueOrFalse);
		System.out.println("trueOrFalse1 :" +trueOrFalse1);

		
		boolean yOrN = modelNumber.isEmpty();
		boolean yOrN1 = number.isEmpty();
	
		System.out.println("is empty :" +yOrN);
		System.out.println("is number empty :" +yOrN1);
		
		
		String concat = modelNumber.concat("shree");
		
		System.out.println("concat :" +concat);
		
		
		
		String sequence1 = modelNumber.replace('Q', 'P');
		
		String sequence2 = number.replace("Bindu", "shree");
		
		
		System.out.println("replace =" +sequence1);
		System.out.println("replace =" +sequence2);
		
		String lowercase = modelNumber.toLowerCase();
		System.out.println("lowercase : " +lowercase);
		
		
		String uppercase = number.toUpperCase();
		System.out.println("uppercase :" +uppercase);
		
		
		int length = modelNumber.length();
		System.out.println("Length :" +length);
		
		
		StringBuilder append = builder.append(" is a email id");
		
		System.out.println("append :" +append);
		
		
		int lengthOfTheStringBuilder = builder.length();
		
		System.out.println("lengthOfTheStringBuilder :" +lengthOfTheStringBuilder);
		
		
		
		StringBuilder reverse = builder.reverse();
		
		System.out.println("reverse =" +reverse);
	
	}

}
