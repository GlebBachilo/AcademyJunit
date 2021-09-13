package ListenerTest;

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class CalculatorTestListener extends RunListener {
        @Override
        public void testFinished(Description description) throws Exception {
            System.out.println("Тест завершил работу : " + description.getMethodName());
        }

        @Override
        public void testFailure(Failure failure) {
            System.out.println("Тест провален : " + failure.getMessage());
        }
}
