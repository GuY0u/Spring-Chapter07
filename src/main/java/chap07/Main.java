package chap07;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start1 = System.currentTimeMillis();
		ImpeCalculator impeCalc = new ImpeCalculator();
		impeCalc.factorial(4);
		long end1 = System.currentTimeMillis();
		System.out.printf("ImpeCalculator.factorial(4)의 실행시간 = %d\n", (end1-start1));
		long start2 = System.currentTimeMillis();
		RecCalculator recCalc = new RecCalculator();
		recCalc.factorial(4);
		long end2 = System.currentTimeMillis();
		System.out.printf("ImpeCalculator.factorial(4)의 실행시간 = %d\n", (end2-start2));
		

	}

}
