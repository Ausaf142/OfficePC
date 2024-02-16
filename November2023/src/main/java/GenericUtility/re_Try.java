package GenericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class re_Try implements IRetryAnalyzer {
	int retryCount=1;
	int MAX_RETRY_COUNT=3;
	 public boolean retry(ITestResult result) {
		 
	        if (retryCount < MAX_RETRY_COUNT) {
	            retryCount++;
	            return true;
	        }
	        return false;
	    }
}
