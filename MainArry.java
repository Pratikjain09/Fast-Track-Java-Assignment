public class MainArry extends MeanAvgSdArry
{

	public static void main(String[] args) {
			MeanAvgSdArry  calc;
			calc = new MeanAvgSdArry();

			System.out.println("Mean   " + calc.getMean());
			System.out.println("Variance  " + calc.getVariance());
			System.out.println("Sd   " + calc.getStdDev());

		}	
}