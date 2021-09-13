package MathTests;

import org.junit.*;
import static java.lang.Double.NaN;

public class MathTestAcos extends Assert {
        @Test
        public void test() {
                Math.acos(1);
        }

        @Ignore
        @Test
        public void test1() {
                assertEquals(1, Math.acos(1), 0.000001);
        }

        @Test
        public void test2() {
                assertEquals(NaN, Math.acos(Math.PI / 2), 0.000001);
        }
}
