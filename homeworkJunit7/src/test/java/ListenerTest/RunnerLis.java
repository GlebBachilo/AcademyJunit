package ListenerTest;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class RunnerLis extends BlockJUnit4ClassRunner {
        private CalculatorTestListener testListener;


        public RunnerLis(Class<CalculatorTestListener> testClass) throws InitializationError {
            super(testClass);
            testListener = new CalculatorTestListener();
        }

        @Override
        public void run(final RunNotifier notifier) {
            notifier.addFirstListener(testListener);
            super.run(notifier);
        }
}
