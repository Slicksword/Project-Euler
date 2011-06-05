package solutions;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 
 * @author jonathan
 * 
 */
public final class Solve {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("Please Enter in the number of the project euler problem to sovle:");
		Scanner scan = new Scanner(System.in);
		String solutionMethodToReflect = "problem" + scan.nextInt();

		try {
			Method eulerProblem = EulerProblems.class.getMethod(solutionMethodToReflect);
			Object answer = eulerProblem.invoke(EulerProblems.getInstance());
			System.out.println(answer);
		} catch (Exception ex) {
			throw ex;
		}
	}
}
