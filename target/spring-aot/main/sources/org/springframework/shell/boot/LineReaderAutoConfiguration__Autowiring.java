package org.springframework.shell.boot;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link LineReaderAutoConfiguration}.
 */
public class LineReaderAutoConfiguration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static LineReaderAutoConfiguration apply(RegisteredBean registeredBean,
      LineReaderAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("fallbackHistoryFileName").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
