package org.springframework.shell.boot;

import java.util.List;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.shell.DefaultShellApplicationRunner;

/**
 * Bean definitions for {@link ApplicationRunnerAutoConfiguration}.
 */
public class ApplicationRunnerAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'applicationRunnerAutoConfiguration'.
   */
  public static BeanDefinition getApplicationRunnerAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ApplicationRunnerAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(ApplicationRunnerAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultShellApplicationRunner'.
   */
  private static BeanInstanceSupplier<DefaultShellApplicationRunner> getDefaultShellApplicationRunnerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DefaultShellApplicationRunner>forFactoryMethod(ApplicationRunnerAutoConfiguration.class, "defaultShellApplicationRunner", List.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ApplicationRunnerAutoConfiguration.class).defaultShellApplicationRunner(args.get(0)));
  }

  /**
   * Get the bean definition for 'defaultShellApplicationRunner'.
   */
  public static BeanDefinition getDefaultShellApplicationRunnerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DefaultShellApplicationRunner.class);
    beanDefinition.setInstanceSupplier(getDefaultShellApplicationRunnerInstanceSupplier());
    return beanDefinition;
  }
}
