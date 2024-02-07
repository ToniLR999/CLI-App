package org.springframework.shell.boot;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.shell.command.CommandCatalog;
import org.springframework.shell.command.CommandCatalogCustomizer;
import org.springframework.shell.command.CommandRegistration;
import org.springframework.shell.context.ShellContext;

/**
 * Bean definitions for {@link CommandCatalogAutoConfiguration}.
 */
public class CommandCatalogAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'commandCatalogAutoConfiguration'.
   */
  public static BeanDefinition getCommandCatalogAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CommandCatalogAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(CommandCatalogAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'commandCatalog'.
   */
  private static BeanInstanceSupplier<CommandCatalog> getCommandCatalogInstanceSupplier() {
    return BeanInstanceSupplier.<CommandCatalog>forFactoryMethod(CommandCatalogAutoConfiguration.class, "commandCatalog", ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ShellContext.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CommandCatalogAutoConfiguration.class).commandCatalog(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'commandCatalog'.
   */
  public static BeanDefinition getCommandCatalogBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CommandCatalog.class);
    beanDefinition.setInstanceSupplier(getCommandCatalogInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultCommandCatalogCustomizer'.
   */
  private static BeanInstanceSupplier<CommandCatalogCustomizer> getDefaultCommandCatalogCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CommandCatalogCustomizer>forFactoryMethod(CommandCatalogAutoConfiguration.class, "defaultCommandCatalogCustomizer", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CommandCatalogAutoConfiguration.class).defaultCommandCatalogCustomizer(args.get(0)));
  }

  /**
   * Get the bean definition for 'defaultCommandCatalogCustomizer'.
   */
  public static BeanDefinition getDefaultCommandCatalogCustomizerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CommandCatalogCustomizer.class);
    beanDefinition.setInstanceSupplier(getDefaultCommandCatalogCustomizerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'helpOptionsCommandRegistrationCustomizer'.
   */
  private static BeanInstanceSupplier<CommandRegistrationCustomizer> getHelpOptionsCommandRegistrationCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CommandRegistrationCustomizer>forFactoryMethod(CommandCatalogAutoConfiguration.class, "helpOptionsCommandRegistrationCustomizer", SpringShellProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CommandCatalogAutoConfiguration.class).helpOptionsCommandRegistrationCustomizer(args.get(0)));
  }

  /**
   * Get the bean definition for 'helpOptionsCommandRegistrationCustomizer'.
   */
  public static BeanDefinition getHelpOptionsCommandRegistrationCustomizerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CommandRegistrationCustomizer.class);
    beanDefinition.setInstanceSupplier(getHelpOptionsCommandRegistrationCustomizerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'commandRegistrationBuilderSupplier'.
   */
  private static BeanInstanceSupplier<CommandRegistration.BuilderSupplier> getCommandRegistrationBuilderSupplierInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CommandRegistration.BuilderSupplier>forFactoryMethod(CommandCatalogAutoConfiguration.class, "commandRegistrationBuilderSupplier", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CommandCatalogAutoConfiguration.class).commandRegistrationBuilderSupplier(args.get(0)));
  }

  /**
   * Get the bean definition for 'commandRegistrationBuilderSupplier'.
   */
  public static BeanDefinition getCommandRegistrationBuilderSupplierBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CommandRegistration.BuilderSupplier.class);
    beanDefinition.setInstanceSupplier(getCommandRegistrationBuilderSupplierInstanceSupplier());
    return beanDefinition;
  }
}
