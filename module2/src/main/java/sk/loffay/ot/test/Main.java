package sk.loffay.ot.test;

import io.opentracing.mock.MockTracer;

/**
 * @author Pavol Loffay
 */
public class Main {

  private static MockTracer mockTracer = new MockTracer();

  public static void main(String[] args) throws InterruptedException {
    System.out.println("main");

    TracedClass tracedClass = new TracedClass(mockTracer);
    tracedClass.invoke2();
  }

}
