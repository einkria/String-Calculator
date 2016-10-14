package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.isEmpty()){
			return 0;
		}
		else if(text.length() > 1){
			String[] sa = null;
			String delim = ",|\n";
			if(text.startsWith("//")){
				int delimIndex = text.indexOf("//")+2;
				delim = text.substring(delimIndex, delimIndex+1);
				String newS = text.substring(text.indexOf("\n")+1);
				sa = newS.split(delim);
			}
		/*else if( text.contains(",")){
			String[] sa;
			if(text.contains("\n")){
				sa = text.split(",|\n");
			}
			else{
				sa = text.split(",");
			}*/
			else{
				sa = text.split(delim);
			}
			checkNegative(sa);
			int result = 0;
			for(String i : sa){
				int value = toInt(i);
				if(value <= 1000){
					result += value;
				}
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
