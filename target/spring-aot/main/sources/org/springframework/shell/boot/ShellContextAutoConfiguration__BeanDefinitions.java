package org.springframework.shell.boot;

import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.shell.context.ShellContext;

/**
 * Bean definitions for {@link ShellContextAutoConfiguration}.
 */
public class ShellContextAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'shellContextAutoConfiguration'.
   */
  public static BeanDefinition getShellContextAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ShellContextAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(ShellContextAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'shellContext'.
   */
  private static BeanInstanceSupplier<ShellContext> getShellContextInstanceSupplier() {
    return BeanInstanceSupplier.<ShellContext>forFactoryMethod(ShellContextAutoConfiguration.class, "shellContext")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ShellContextAutoConfiguration.class).shellContext());
  }

  /**
   * Get the bean definition for 'shellContext'.
   */
  public static BeanDefinition getShellContextBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ShellContext.class);
    beanDefinition.setInstanceSupplier(getShellContextInstanceSupplier());
    return beanDefinition;
  }
}
