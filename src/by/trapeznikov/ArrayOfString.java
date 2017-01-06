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
		
		text = sort(text);
		
		for(int i=0; i<10; i++){
			System.out.println(text[i]);
		}
	
		
	}
	
	public static String [] sort(String [] text){
		for(int i=0; i<10; i++)
			for(int j=0; j<10; j++){
				if (compareToWords(text[i], text[j])==-1){String s = text[j];
														 text[j]=text[i];
														 text[i]=s;}
		}
		return text;
	}
	
	public static int compareToWords(String firstWord,String secondWord){
		
		char [] arrFirstWord = firstWord.toLowerCase().trim().toCharArray();
		char [] arrSecondWord = secondWord.toLowerCase().trim().toCharArray();
		
		int lengthFirstWord = arrFirstWord.length;
		int lengthSecondWord = arrSecondWord.length;
		
		int n;
		int m = 0;
		int i = 0;
		
		if (lengthFirstWord>lengthSecondWord){ n = lengthSecondWord;
		}else if(lengthFirstWord<lengthSecondWord){n = lengthFirstWord;
		}else {n = lengthSecondWord;}
		
		while((m == 0)&&(i!=n)){
			
			if (compareToCharacter(arrFirstWord[i],arrSecondWord[i])==-1){m = -1; 
			}else if (compareToCharacter(arrFirstWord[i],arrSecondWord[i])==1){m = 1;}
			i++;
			
		}		
		return m;
	}				
	
	
	public static int compareToCharacter(char s, char m){
		if (valueCharacter(s)==valueCharacter(m)) { return 0;
		} else if (valueCharacter(s)>valueCharacter(m)) {return 1;
		} else return -1;
		
	}
	
	public static int valueCharacter(char s){
		switch (s){
		case 'a': return 1; 
		case 'b': return 2; 	
		case 'c': return 3; 	
		case 'd': return 4; 	
		case 'e': return 5;
		case 'f': return 6; 	
		case 'g': return 7; 
		case 'h': return 8; 
		case 'i': return 9; 
		case 'j': return 10; 
		case 'k': return 11; 
		case 'l': return 12; 
		case 'm': return 13; 
		case 'n': return 14; 
		case 'o': return 15; 
		case 'p': return 16; 
		case 'q': return 17; 
		case 'r': return 18; 
		case 's': return 19; 
		case 't': return 20; 
		case 'u': return 21; 
		case 'v': return 22; 
		case 'w': return 23; 
		case 'x': return 24; 
		case 'y': return 25; 
		case 'z': return 26; 
		default: return 0;
				
		}
	}

}
