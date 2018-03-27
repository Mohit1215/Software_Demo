package test_log;


import org.apache.log4j.Logger;

public class log_example {
	 private static Logger logger=Logger.getLogger("Log4jExample");
	public static void main(String[] args) {
		int x=-9;
		if(x<0) {
		logger.warn("The value cannot be negative");
		logger.error("Error, this is a negative value");
		}
		else {
			System.out.println("The value of x is:"+x);
		}
		
		

	}

}
