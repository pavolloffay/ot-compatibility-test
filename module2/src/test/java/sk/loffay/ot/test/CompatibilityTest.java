package sk.loffay.ot.test;

import io.opentracing.mock.MockTracer;
import org.junit.Test;

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
