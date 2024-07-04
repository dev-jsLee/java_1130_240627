package practice;

public class Calculator2 extends Calculator{

	@Override
	public int calculate(String expression) {
		// "- 3 + 4 - 2"
		int result = 0;
		String[] splitedExp = expression.split(" ");
		boolean isFirstOper = false;
		int i = 0;

//		try {
//			Integer.parseInt(splitedExp[0]);
//		} catch(Exception e) {
//			isFirstOper = true;
//		}
//		if(isFirstOper) {
//			result = Integer.parseInt(splitedExp[i++] + splitedExp[i++]); 
//		}

		String currentOper = "+";
		int currentNum = 0;
		for (; i < splitedExp.length; i++) {
			try {
				currentNum = Integer.parseInt(splitedExp[i]);
			} catch (Exception e) {
				currentOper = splitedExp[i];
				continue;
			}
			if(currentOper.equals("+") | currentOper.equals("-")) {
				result += Integer.parseInt(currentOper + splitedExp[i]);
				currentOper = "";
				continue;
			} else {
				if(currentOper.equals("*")) {
					result *= currentNum;
				} else {
//					result /= currentNum;
					division(result, currentNum);
				}
			}
		}
		return result;

	}
	
	@Override
	public int division(int num1, int num2) {
		try {
			return num1/num2;
		}catch (Exception e) {
			return 0;
		}
		
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.calculate("3 - 5 * 2"));
	}

}
