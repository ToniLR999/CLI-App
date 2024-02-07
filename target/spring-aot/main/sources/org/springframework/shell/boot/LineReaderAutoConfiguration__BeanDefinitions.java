package org.springframework.shell.boot;

import org.jline.reader.Completer;
import org.jline.reader.History;
import org.jline.reader.LineReader;
import org.jline.reader.Parser;
import org.jline.terminal.Terminal;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.shell.command.CommandCatalog;
import org.springframework.shell.config.UserConfigPathProvider;

/**
 * Bean definitions for {@link LineReaderAutoConfiguration}.
 */
public class LineReaderAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.shell.boot.LineReaderAutoConfiguration'.
   */
  private static BeanInstanceSupplier<LineReaderAutoConfiguration> getLineReaderAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LineReaderAutoConfiguration>forConstructor(Terminal.class, Completer.class, Parser.class, CommandCatalog.class, History.class, SpringShellProperties.class, UserConfigPathProvider.class)
            .withGenerator((registeredBean, args) -> new LineReaderAutoConfiguration(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5), args.get(6)));
  }

  /**
   * Get the bean definition for 'lineReaderAutoConfiguration'.
   */
  public static BeanDefinition getLineReaderAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LineReaderAutoConfiguration.class);
    InstanceSupplier<LineReaderAutoConfiguration> instanceSupplier = getLineReaderAutoConfigurationInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(LineReaderAutoConfiguration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'lineReader'.
   */
  private static BeanInstanceSupplier<LineReader> getLineReaderInstanceSupplier() {
    return BeanInstanceSupplier.<LineReader>forFactoryMethod(LineReaderAutoConfiguration.class, "lineReader")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(LineReaderAutoConfiguration.class).lineReader());
  }

  /**
   * Get the bean definition for 'lineReader'.
   */
  public static BeanDefinition getLineReaderBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LineReader.class);
    beanDefinition.setInstanceSupplier(getLineReaderInstanceSupplier());
    return beanDefinition;
  }
}
