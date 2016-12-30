package by.trapeznikov;

import java.util.Arrays;

public class ArrayOfString {
	
	public static void main(String [] args){
		
		String [] text = new String[10];
		
		text[0] = "Trapeznikov";
		text[1] = "Mandrik";
		text[2] = "Metelskii";
		text[3] = "Dubchak";
		text[4] = "Malashkevich";
		text[5] = "Kostuk";
		text[6] = "Tereshko";
		text[7] = "Miloichikova";
		text[8] = "Kretova";
		text[9] = "Misukevich";
		
		
		int number = 0;
		int min = text[number].length();
		
		for(int i=0; i<10; i++){
			if (min>text[i].length()){	number = i;
										min = text[i].length();}
		}
		
		System.out.println("Min quantity characters in "+text[number]);
		
		Arrays.sort(text);
		
		for(int i=0; i<10; i++){
			System.out.println(text[i]);
		}
	
		
	}

}
