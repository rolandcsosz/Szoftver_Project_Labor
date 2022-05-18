
/**
 * Proto-hoz használtuk.
 */
public class Logger {
	
	static String actualParameter;
	
	static String secondParameter;

	public static void log(String method,int level)
	{
		System.out.print("\n");
		for(int i = 0; i < level; i++)
			System.out.print("\t");
		
		System.out.println(method);
	}
	
	public static void setParameter(String newParam) {
		actualParameter = newParam;
	}
	
	public static String getParameter() {
		return actualParameter;
	}
	
	public static void setsecondParameter(String newParam) {
		secondParameter = newParam;
	}
	
	public static String getsecondParameter() {
		return secondParameter;
	}
}
