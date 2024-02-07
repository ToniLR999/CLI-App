package org.springframework.shell.boot;

import org.jline.reader.Parser;
import org.jline.terminal.Terminal;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.shell.jline.PromptProvider;

/**
 * Bean definitions for {@link JLineShellAutoConfiguration}.
 */
public class JLineShellAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'jLineShellAutoConfiguration'.
   */
  public static BeanDefinition getJLineShellAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JLineShellAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(JLineShellAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'terminal'.
   */
  private static BeanInstanceSupplier<Terminal> getTerminalInstanceSupplier() {
    return BeanInstanceSupplier.<Terminal>forFactoryMethod(JLineShellAutoConfiguration.class, "terminal", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(JLineShellAutoConfiguration.class).terminal(args.get(0)));
  }

  /**
   * Get the bean definition for 'terminal'.
   */
  public static BeanDefinition getTerminalBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Terminal.class);
    beanDefinition.setDestroyMethodNames("close");
    beanDefinition.setInstanceSupplier(getTerminalInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'promptProvider'.
   */
  private static BeanInstanceSupplier<PromptProvider> getPromptProviderInstanceSupplier() {
    return BeanInstanceSupplier.<PromptProvider>forFactoryMethod(JLineShellAutoConfiguration.class, "promptProvider")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(JLineShellAutoConfiguration.class).promptProvider());
  }

  /**
   * Get the bean definition for 'promptProvider'.
   */
  public static BeanDefinition getPromptProviderBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PromptProvider.class);
    beanDefinition.setInstanceSupplier(getPromptProviderInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'parser'.
   */
  private static BeanInstanceSupplier<Parser> getParserInstanceSupplier() {
    return BeanInstanceSupplier.<Parser>forFactoryMethod(JLineShellAutoConfiguration.class, "parser")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(JLineShellAutoConfiguration.class).parser());
  }

  /**
   * Get the bean definition for 'parser'.
   */
  public static BeanDefinition getParserBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Parser.class);
    beanDefinition.setInstanceSupplier(getParserInstanceSupplier());
    return beanDefinition;
  }
}
