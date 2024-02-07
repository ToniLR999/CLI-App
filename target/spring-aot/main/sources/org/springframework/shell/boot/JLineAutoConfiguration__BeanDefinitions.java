package org.springframework.shell.boot;

import org.jline.reader.History;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link JLineAutoConfiguration}.
 */
public class JLineAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'jLineAutoConfiguration'.
   */
  public static BeanDefinition getJLineAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JLineAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(JLineAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link JLineAutoConfiguration.JLineHistoryConfiguration}.
   */
  public static class JLineHistoryConfiguration {
    /**
     * Get the bean definition for 'jLineHistoryConfiguration'.
     */
    public static BeanDefinition getJLineHistoryConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(JLineAutoConfiguration.JLineHistoryConfiguration.class);
      beanDefinition.setTargetType(JLineAutoConfiguration.JLineHistoryConfiguration.class);
      ConfigurationClassUtils.initializeConfigurationClass(JLineAutoConfiguration.JLineHistoryConfiguration.class);
      beanDefinition.setInstanceSupplier(JLineAutoConfiguration$JLineHistoryConfiguration$$SpringCGLIB$$0::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'history'.
     */
    private static BeanInstanceSupplier<History> getHistoryInstanceSupplier() {
      return BeanInstanceSupplier.<History>forFactoryMethod(JLineAutoConfiguration.JLineHistoryConfiguration.class, "history")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(JLineAutoConfiguration.JLineHistoryConfiguration.class).history());
    }

    /**
     * Get the bean definition for 'history'.
     */
    public static BeanDefinition getHistoryBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(History.class);
      beanDefinition.setInstanceSupplier(getHistoryInstanceSupplier());
      return beanDefinition;
    }
  }
}
