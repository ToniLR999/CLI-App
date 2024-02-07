package dev.tonilr.cliapp.commands;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HelloComand}.
 */
public class HelloComand__BeanDefinitions {
  /**
   * Get the bean definition for 'helloComand'.
   */
  public static BeanDefinition getHelloComandBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HelloComand.class);
    beanDefinition.setInstanceSupplier(HelloComand::new);
    return beanDefinition;
  }
}
