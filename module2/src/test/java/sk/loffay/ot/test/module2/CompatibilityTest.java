package sk.loffay.ot.test.module2;

import io.opentracing.mock.MockTracer;
import org.junit.Test;
import sk.loffay.ot.test.TracedClass;

/**
 * @author Pavol Loffay
 */
public class CompatibilityTest {
  private MockTracer mockTracer = new MockTracer();

//  @Test
  public void test() {
    TracedClass tracedClass = new TracedClass(mockTracer);
    tracedClass.invoke();
  }
}
