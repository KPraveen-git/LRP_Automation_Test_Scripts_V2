package commonMethods;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class TestMethodFilter implements IAnnotationTransformer{

	static Map<String, String> testExecutionMap;
	static {
        try {
            testExecutionMap = TestNgXml.getFlagValue_FromExecution();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		String methodName = testMethod.getName();
        if (testExecutionMap != null && testExecutionMap.get(methodName).equalsIgnoreCase("No")) {
            annotation.setEnabled(false); // Disable the method
        }
	}

}
