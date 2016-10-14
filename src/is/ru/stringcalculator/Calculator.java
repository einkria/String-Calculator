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
			int result = 0;
			for(String i : sa){
				result += toInt(i);
			}
			return result;
		}
		else
			return 1;
	}
	
	private static int toInt(String text){
		return Integer.parseInt(text);
	}
}
