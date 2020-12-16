package test;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class ListenerTest implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        TestMethodInfo testMethodInfo = iInvokedMethod
                .getTestMethod()
                .getConstructorOrMethod()
                .getMethod()
                .getAnnotation(TestMethodInfo.class);

        if (testMethodInfo != null) {
            System.out.printf("Priority: %s%n" +
                    "Author: %s%n" +
                    "Last modified: %s%n",
                    testMethodInfo.priority(),
                    testMethodInfo.author(),
                    testMethodInfo.lastModified());
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {

    }
}
