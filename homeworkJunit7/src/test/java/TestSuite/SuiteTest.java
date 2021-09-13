package TestSuite;

import MathTests.MathTestAcos;
import MathTests.MathTestPow;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({MathTestPow.class, MathTestAcos.class})
public class SuiteTest {
}
