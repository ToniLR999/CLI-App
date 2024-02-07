package org.springframework.shell.boot;

import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.shell.command.CommandExecution;
import org.springframework.shell.completion.CompletionResolver;
import org.springframework.shell.config.ShellConversionServiceSupplier;

/**
 * Bean definitions for {@link ParameterResolverAutoConfiguration}.
 */
public class ParameterResolverAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'parameterResolverAutoConfiguration'.
   */
  public static BeanDefinition getParameterResolverAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ParameterResolverAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(ParameterResolverAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultCompletionResolver'.
   */
  private static BeanInstanceSupplier<CompletionResolver> getDefaultCompletionResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CompletionResolver>forFactoryMethod(ParameterResolverAutoConfiguration.class, "defaultCompletionResolver")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ParameterResolverAutoConfiguration.class).defaultCompletionResolver());
  }

  /**
   * Get the bean definition for 'defaultCompletionResolver'.
   */
  public static BeanDefinition getDefaultCompletionResolverBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CompletionResolver.class);
    beanDefinition.setInstanceSupplier(getDefaultCompletionResolverInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'commandExecutionHandlerMethodArgumentResolvers'.
   */
  private static BeanInstanceSupplier<CommandExecution.CommandExecutionHandlerMethodArgumentResolvers> getCommandExecutionHandlerMethodArgumentResolversInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CommandExecution.CommandExecutionHandlerMethodArgumentResolvers>forFactoryMethod(ParameterResolverAutoConfiguration.class, "commandExecutionHandlerMethodArgumentResolvers", ShellConversionServiceSupplier.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ParameterResolverAutoConfiguration.class).commandExecutionHandlerMethodArgumentResolvers(args.get(0)));
  }

  /**
   * Get the bean definition for 'commandExecutionHandlerMethodArgumentResolvers'.
   */
  public static BeanDefinition getCommandExecutionHandlerMethodArgumentResolversBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CommandExecution.CommandExecutionHandlerMethodArgumentResolvers.class);
    beanDefinition.setInstanceSupplier(getCommandExecutionHandlerMethodArgumentResolversInstanceSupplier());
    return beanDefinition;
  }
}
