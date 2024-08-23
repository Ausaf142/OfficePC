package Generic_Utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Try implements IRetryAnalyzer {
	int retryCount=1;
	int MAX_RETRY_COUNT=2;
	 public boolean retry(ITestResult result) {
		 
	        if (retryCount < MAX_RETRY_COUNT) {
	            retryCount++;
	            return true;
	        }
	        return false;
	    }
}
