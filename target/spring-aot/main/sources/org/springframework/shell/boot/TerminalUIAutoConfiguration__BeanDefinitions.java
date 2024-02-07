package org.springframework.shell.boot;

import org.jline.terminal.Terminal;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.shell.component.view.TerminalUIBuilder;
import org.springframework.shell.style.ThemeActive;
import org.springframework.shell.style.ThemeResolver;

/**
 * Bean definitions for {@link TerminalUIAutoConfiguration}.
 */
public class TerminalUIAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'terminalUIAutoConfiguration'.
   */
  public static BeanDefinition getTerminalUIAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TerminalUIAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(TerminalUIAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'terminalUIBuilder'.
   */
  private static BeanInstanceSupplier<TerminalUIBuilder> getTerminalUIBuilderInstanceSupplier() {
    return BeanInstanceSupplier.<TerminalUIBuilder>forFactoryMethod(TerminalUIAutoConfiguration.class, "terminalUIBuilder", Terminal.class, ThemeResolver.class, ThemeActive.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(TerminalUIAutoConfiguration.class).terminalUIBuilder(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'terminalUIBuilder'.
   */
  public static BeanDefinition getTerminalUIBuilderBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TerminalUIBuilder.class);
    beanDefinition.setScope("prototype");
    beanDefinition.setInstanceSupplier(getTerminalUIBuilderInstanceSupplier());
    return beanDefinition;
  }
}
