package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.isEmpty()){
			return 0;
		}
		else if( text.contains(",")){
			String [] sa = text.split(",");
			return toInt(sa[0]) + toInt(sa[1]);
		}
		else
			return 1;
	}
	
	private static int toInt(String text){
		return Integer.parseInt(text);
	}
}
