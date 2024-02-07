package org.springframework.shell.boot;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.shell.component.flow.ComponentFlow;

/**
 * Bean definitions for {@link ComponentFlowAutoConfiguration}.
 */
public class ComponentFlowAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'componentFlowAutoConfiguration'.
   */
  public static BeanDefinition getComponentFlowAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentFlowAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(ComponentFlowAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'componentFlowBuilder'.
   */
  private static BeanInstanceSupplier<ComponentFlow.Builder> getComponentFlowBuilderInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ComponentFlow.Builder>forFactoryMethod(ComponentFlowAutoConfiguration.class, "componentFlowBuilder", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ComponentFlowAutoConfiguration.class).componentFlowBuilder(args.get(0)));
  }

  /**
   * Get the bean definition for 'componentFlowBuilder'.
   */
  public static BeanDefinition getComponentFlowBuilderBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentFlow.Builder.class);
    beanDefinition.setScope("prototype");
    beanDefinition.setInstanceSupplier(getComponentFlowBuilderInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link ComponentFlowAutoConfiguration.ComponentFlowConfiguration}.
   */
  public static class ComponentFlowConfiguration {
    /**
     * Get the bean definition for 'componentFlowConfiguration'.
     */
    public static BeanDefinition getComponentFlowConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentFlowAutoConfiguration.ComponentFlowConfiguration.class);
      beanDefinition.setInstanceSupplier(ComponentFlowAutoConfiguration.ComponentFlowConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'shellCommonComponentFlowCustomizer'.
     */
    private static BeanInstanceSupplier<ComponentFlowCustomizer> getShellCommonComponentFlowCustomizerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<ComponentFlowCustomizer>forFactoryMethod(ComponentFlowAutoConfiguration.ComponentFlowConfiguration.class, "shellCommonComponentFlowCustomizer", ObjectProvider.class, ObjectProvider.class, ObjectProvider.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ComponentFlowAutoConfiguration.ComponentFlowConfiguration.class).shellCommonComponentFlowCustomizer(args.get(0), args.get(1), args.get(2)));
    }

    /**
     * Get the bean definition for 'shellCommonComponentFlowCustomizer'.
     */
    public static BeanDefinition getShellCommonComponentFlowCustomizerBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(ComponentFlowCustomizer.class);
      beanDefinition.setInstanceSupplier(getShellCommonComponentFlowCustomizerInstanceSupplier());
      return beanDefinition;
    }
  }
}
