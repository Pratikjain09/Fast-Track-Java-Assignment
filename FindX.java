import java.util.*;

class FindX 
{
	public static void main(String[] args) 
	{
	  double temp1,temp2;
	  int a =2, b=4, c =6;

	  temp1 = (- b + Math.sqrt(Math.pow(b,2) - 4 *a*c)) / 2 * a;
	  temp2 = (- b - Math.sqrt(Math.pow(b,2) - 4 *a*c)) / 2 * a;

	System.out.println("the value of X:"+temp1+"or"+temp2);
}
}