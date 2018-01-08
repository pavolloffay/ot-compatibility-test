package sk.loffay.ot.test;

import io.opentracing.Span;
import io.opentracing.Tracer;
import io.opentracing.tag.Tags;

/**
 * @author Pavol Loffay
 */
public class TracedClass {

  private Tracer tracer;

  public TracedClass(Tracer tracer) {
    this.tracer = tracer;
  }

  public void invoke() {
    Span span = tracer.buildSpan("invoke").startManual();
    Tags.ERROR.set(span, true);
    span.finish();
  }

  public void invoke2() throws InterruptedException {
    final Span span = tracer.buildSpan("invoke").startManual();
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        Tags.ERROR.set(span, true);
        span.finish();
      }
    });
    System.out.println(thread.getName());
  }
}
