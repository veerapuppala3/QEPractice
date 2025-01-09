package framework.TestComponents;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		int count =0, maxTry=1;
		if(count<maxTry)
		{
			count++;
			return true;
		}
		
		return false;
	}

}
