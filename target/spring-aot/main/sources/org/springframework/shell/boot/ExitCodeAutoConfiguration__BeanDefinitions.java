package org.springframework.shell.boot;

import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.shell.exit.ExitCodeExceptionProvider;

/**
 * Bean definitions for {@link ExitCodeAutoConfiguration}.
 */
public class ExitCodeAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'exitCodeAutoConfiguration'.
   */
  public static BeanDefinition getExitCodeAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ExitCodeAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(ExitCodeAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'shellExitCodeExceptionMapper'.
   */
  private static BeanInstanceSupplier<ExitCodeAutoConfiguration.ShellExitCodeExceptionMapper> getShellExitCodeExceptionMapperInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ExitCodeAutoConfiguration.ShellExitCodeExceptionMapper>forFactoryMethod(ExitCodeAutoConfiguration.class, "shellExitCodeExceptionMapper")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ExitCodeAutoConfiguration.class).shellExitCodeExceptionMapper());
  }

  /**
   * Get the bean definition for 'shellExitCodeExceptionMapper'.
   */
  public static BeanDefinition getShellExitCodeExceptionMapperBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ExitCodeAutoConfiguration.ShellExitCodeExceptionMapper.class);
    beanDefinition.setInstanceSupplier(getShellExitCodeExceptionMapperInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'shellExitCodeMappingsExceptionMapper'.
   */
  private static BeanInstanceSupplier<ExitCodeAutoConfiguration.ShellExitCodeMappingsExceptionMapper> getShellExitCodeMappingsExceptionMapperInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ExitCodeAutoConfiguration.ShellExitCodeMappingsExceptionMapper>forFactoryMethod(ExitCodeAutoConfiguration.class, "shellExitCodeMappingsExceptionMapper")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ExitCodeAutoConfiguration.class).shellExitCodeMappingsExceptionMapper());
  }

  /**
   * Get the bean definition for 'shellExitCodeMappingsExceptionMapper'.
   */
  public static BeanDefinition getShellExitCodeMappingsExceptionMapperBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ExitCodeAutoConfiguration.ShellExitCodeMappingsExceptionMapper.class);
    beanDefinition.setInstanceSupplier(getShellExitCodeMappingsExceptionMapperInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'exitCodeExceptionProvider'.
   */
  private static BeanInstanceSupplier<ExitCodeExceptionProvider> getExitCodeExceptionProviderInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ExitCodeExceptionProvider>forFactoryMethod(ExitCodeAutoConfiguration.class, "exitCodeExceptionProvider")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ExitCodeAutoConfiguration.class).exitCodeExceptionProvider());
  }

  /**
   * Get the bean definition for 'exitCodeExceptionProvider'.
   */
  public static BeanDefinition getExitCodeExceptionProviderBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ExitCodeExceptionProvider.class);
    beanDefinition.setInstanceSupplier(getExitCodeExceptionProviderInstanceSupplier());
    return beanDefinition;
  }
}
