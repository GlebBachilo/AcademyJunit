package ListenerTest;

import by.academy.Junit.Calculator;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(RunnerLis.class)
public class Tests extends Assert {
        @Test
        public void calDivide(){
            assertEquals(3,Calculator.getDivide(16,4));
        }

        //@Ignore
        @Test
        public void calMultiple(){
            assertEquals(8,Calculator.getMultiple(2,4));
        }

        @Test
        public void calSum(){
            assertEquals(9,Calculator.getSum(5,4));
        }
}
