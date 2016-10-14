package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.isEmpty()){
			return 0;
		}
		else if( text.contains(",")){
			String[] sa;
			if(text.contains("\n")){
				sa = text.split(",|\n");
			}
			else{
				sa = text.split(",");
			}
			checkNegative(sa);
			int result = 0;
			for(String i : sa){
				result += toInt(i);
			}
			return result;
		}
		else
			return toInt(text);
	}
	private static void checkNegative(String[] text){
		String ex = "Negatives Not Allowed: ";
		boolean hasNeg = false;
		for(int i = 0; i < text.length; i++){
			int k = toInt(text[i]);
			if(k < 0){
				ex+= text[i];
				hasNeg = true;
				}
			}
		if(hasNeg){
			throw new IllegalArgumentException(ex);
		}
		
	}
	private static int toInt(String text){
		return Integer.parseInt(text);
	}
}
