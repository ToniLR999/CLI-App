package org.springframework.shell.boot;

import org.jline.reader.Parser;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.shell.standard.commands.Clear;
import org.springframework.shell.standard.commands.Help;
import org.springframework.shell.standard.commands.History;
import org.springframework.shell.standard.commands.Quit;
import org.springframework.shell.standard.commands.Script;
import org.springframework.shell.standard.commands.Stacktrace;
import org.springframework.shell.standard.commands.Version;

/**
 * Bean definitions for {@link StandardCommandsAutoConfiguration}.
 */
public class StandardCommandsAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'standardCommandsAutoConfiguration'.
   */
  public static BeanDefinition getStandardCommandsAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(StandardCommandsAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(StandardCommandsAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'help'.
   */
  private static BeanInstanceSupplier<Help> getHelpInstanceSupplier() {
    return BeanInstanceSupplier.<Help>forFactoryMethod(StandardCommandsAutoConfiguration.class, "help", SpringShellProperties.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(StandardCommandsAutoConfiguration.class).help(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'help'.
   */
  public static BeanDefinition getHelpBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Help.class);
    beanDefinition.setInstanceSupplier(getHelpInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'clear'.
   */
  private static BeanInstanceSupplier<Clear> getClearInstanceSupplier() {
    return BeanInstanceSupplier.<Clear>forFactoryMethod(StandardCommandsAutoConfiguration.class, "clear")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(StandardCommandsAutoConfiguration.class).clear());
  }

  /**
   * Get the bean definition for 'clear'.
   */
  public static BeanDefinition getClearBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Clear.class);
    beanDefinition.setInstanceSupplier(getClearInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'quit'.
   */
  private static BeanInstanceSupplier<Quit> getQuitInstanceSupplier() {
    return BeanInstanceSupplier.<Quit>forFactoryMethod(StandardCommandsAutoConfiguration.class, "quit")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(StandardCommandsAutoConfiguration.class).quit());
  }

  /**
   * Get the bean definition for 'quit'.
   */
  public static BeanDefinition getQuitBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Quit.class);
    beanDefinition.setInstanceSupplier(getQuitInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'stacktrace'.
   */
  private static BeanInstanceSupplier<Stacktrace> getStacktraceInstanceSupplier() {
    return BeanInstanceSupplier.<Stacktrace>forFactoryMethod(StandardCommandsAutoConfiguration.class, "stacktrace", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(StandardCommandsAutoConfiguration.class).stacktrace(args.get(0)));
  }

  /**
   * Get the bean definition for 'stacktrace'.
   */
  public static BeanDefinition getStacktraceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Stacktrace.class);
    beanDefinition.setInstanceSupplier(getStacktraceInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'script'.
   */
  private static BeanInstanceSupplier<Script> getScriptInstanceSupplier() {
    return BeanInstanceSupplier.<Script>forFactoryMethod(StandardCommandsAutoConfiguration.class, "script", Parser.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(StandardCommandsAutoConfiguration.class).script(args.get(0)));
  }

  /**
   * Get the bean definition for 'script'.
   */
  public static BeanDefinition getScriptBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Script.class);
    beanDefinition.setInstanceSupplier(getScriptInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'historyCommand'.
   */
  private static BeanInstanceSupplier<History> getHistoryCommandInstanceSupplier() {
    return BeanInstanceSupplier.<History>forFactoryMethod(StandardCommandsAutoConfiguration.class, "historyCommand", org.jline.reader.History.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(StandardCommandsAutoConfiguration.class).historyCommand(args.get(0)));
  }

  /**
   * Get the bean definition for 'historyCommand'.
   */
  public static BeanDefinition getHistoryCommandBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(History.class);
    beanDefinition.setInstanceSupplier(getHistoryCommandInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'version'.
   */
  private static BeanInstanceSupplier<Version> getVersionInstanceSupplier() {
    return BeanInstanceSupplier.<Version>forFactoryMethod(StandardCommandsAutoConfiguration.class, "version", SpringShellProperties.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(StandardCommandsAutoConfiguration.class).version(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'version'.
   */
  public static BeanDefinition getVersionBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Version.class);
    beanDefinition.setInstanceSupplier(getVersionInstanceSupplier());
    return beanDefinition;
  }
}
