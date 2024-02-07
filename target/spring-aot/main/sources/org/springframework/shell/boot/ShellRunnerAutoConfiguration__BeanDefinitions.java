package org.springframework.shell.boot;

import org.jline.reader.LineReader;
import org.jline.reader.Parser;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.shell.Shell;
import org.springframework.shell.context.ShellContext;
import org.springframework.shell.jline.InteractiveShellRunner;
import org.springframework.shell.jline.NonInteractiveShellRunner;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.shell.jline.ScriptShellRunner;

/**
 * Bean definitions for {@link ShellRunnerAutoConfiguration}.
 */
public class ShellRunnerAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'shellRunnerAutoConfiguration'.
   */
  public static BeanDefinition getShellRunnerAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ShellRunnerAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(ShellRunnerAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link ShellRunnerAutoConfiguration.NonePrimaryCommandConfiguration}.
   */
  public static class NonePrimaryCommandConfiguration {
    /**
     * Get the bean definition for 'nonePrimaryCommandConfiguration'.
     */
    public static BeanDefinition getNonePrimaryCommandConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(ShellRunnerAutoConfiguration.NonePrimaryCommandConfiguration.class);
      beanDefinition.setInstanceSupplier(ShellRunnerAutoConfiguration.NonePrimaryCommandConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'interactiveApplicationRunner'.
     */
    private static BeanInstanceSupplier<InteractiveShellRunner> getInteractiveApplicationRunnerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<InteractiveShellRunner>forFactoryMethod(ShellRunnerAutoConfiguration.NonePrimaryCommandConfiguration.class, "interactiveApplicationRunner", LineReader.class, PromptProvider.class, Shell.class, ShellContext.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ShellRunnerAutoConfiguration.NonePrimaryCommandConfiguration.class).interactiveApplicationRunner(args.get(0), args.get(1), args.get(2), args.get(3)));
    }

    /**
     * Get the bean definition for 'interactiveApplicationRunner'.
     */
    public static BeanDefinition getInteractiveApplicationRunnerBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(InteractiveShellRunner.class);
      beanDefinition.setInstanceSupplier(getInteractiveApplicationRunnerInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'nonInteractiveApplicationRunner'.
     */
    private static BeanInstanceSupplier<NonInteractiveShellRunner> getNonInteractiveApplicationRunnerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<NonInteractiveShellRunner>forFactoryMethod(ShellRunnerAutoConfiguration.NonePrimaryCommandConfiguration.class, "nonInteractiveApplicationRunner", Shell.class, ShellContext.class, ObjectProvider.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ShellRunnerAutoConfiguration.NonePrimaryCommandConfiguration.class).nonInteractiveApplicationRunner(args.get(0), args.get(1), args.get(2)));
    }

    /**
     * Get the bean definition for 'nonInteractiveApplicationRunner'.
     */
    public static BeanDefinition getNonInteractiveApplicationRunnerBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(NonInteractiveShellRunner.class);
      beanDefinition.setInstanceSupplier(getNonInteractiveApplicationRunnerInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'scriptApplicationRunner'.
     */
    private static BeanInstanceSupplier<ScriptShellRunner> getScriptApplicationRunnerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<ScriptShellRunner>forFactoryMethod(ShellRunnerAutoConfiguration.NonePrimaryCommandConfiguration.class, "scriptApplicationRunner", Parser.class, Shell.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ShellRunnerAutoConfiguration.NonePrimaryCommandConfiguration.class).scriptApplicationRunner(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'scriptApplicationRunner'.
     */
    public static BeanDefinition getScriptApplicationRunnerBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(ScriptShellRunner.class);
      beanDefinition.setInstanceSupplier(getScriptApplicationRunnerInstanceSupplier());
      return beanDefinition;
    }
  }
}
