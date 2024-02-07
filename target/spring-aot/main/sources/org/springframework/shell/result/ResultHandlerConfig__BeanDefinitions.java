package org.springframework.shell.result;

import org.jline.terminal.Terminal;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.shell.command.CommandCatalog;
import org.springframework.shell.command.CommandParserExceptionResolver;
import org.springframework.shell.context.ShellContext;

/**
 * Bean definitions for {@link ResultHandlerConfig}.
 */
public class ResultHandlerConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'resultHandlerConfig'.
   */
  public static BeanDefinition getResultHandlerConfigBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ResultHandlerConfig.class);
    beanDefinition.setInstanceSupplier(ResultHandlerConfig::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'terminalSizeAwareResultHandler'.
   */
  private static BeanInstanceSupplier<TerminalSizeAwareResultHandler> getTerminalSizeAwareResultHandlerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TerminalSizeAwareResultHandler>forFactoryMethod(ResultHandlerConfig.class, "terminalSizeAwareResultHandler", Terminal.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ResultHandlerConfig.class).terminalSizeAwareResultHandler(args.get(0)));
  }

  /**
   * Get the bean definition for 'terminalSizeAwareResultHandler'.
   */
  public static BeanDefinition getTerminalSizeAwareResultHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TerminalSizeAwareResultHandler.class);
    beanDefinition.setInstanceSupplier(getTerminalSizeAwareResultHandlerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'attributedCharSequenceResultHandler'.
   */
  private static BeanInstanceSupplier<AttributedCharSequenceResultHandler> getAttributedCharSequenceResultHandlerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<AttributedCharSequenceResultHandler>forFactoryMethod(ResultHandlerConfig.class, "attributedCharSequenceResultHandler", Terminal.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ResultHandlerConfig.class).attributedCharSequenceResultHandler(args.get(0)));
  }

  /**
   * Get the bean definition for 'attributedCharSequenceResultHandler'.
   */
  public static BeanDefinition getAttributedCharSequenceResultHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AttributedCharSequenceResultHandler.class);
    beanDefinition.setInstanceSupplier(getAttributedCharSequenceResultHandlerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultResultHandler'.
   */
  private static BeanInstanceSupplier<DefaultResultHandler> getDefaultResultHandlerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DefaultResultHandler>forFactoryMethod(ResultHandlerConfig.class, "defaultResultHandler", Terminal.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ResultHandlerConfig.class).defaultResultHandler(args.get(0)));
  }

  /**
   * Get the bean definition for 'defaultResultHandler'.
   */
  public static BeanDefinition getDefaultResultHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DefaultResultHandler.class);
    beanDefinition.setInstanceSupplier(getDefaultResultHandlerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'parameterValidationExceptionResultHandler'.
   */
  private static BeanInstanceSupplier<ParameterValidationExceptionResultHandler> getParameterValidationExceptionResultHandlerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ParameterValidationExceptionResultHandler>forFactoryMethod(ResultHandlerConfig.class, "parameterValidationExceptionResultHandler", Terminal.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ResultHandlerConfig.class).parameterValidationExceptionResultHandler(args.get(0)));
  }

  /**
   * Get the bean definition for 'parameterValidationExceptionResultHandler'.
   */
  public static BeanDefinition getParameterValidationExceptionResultHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ParameterValidationExceptionResultHandler.class);
    beanDefinition.setInstanceSupplier(getParameterValidationExceptionResultHandlerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'commandParserExceptionResolver'.
   */
  private static BeanInstanceSupplier<CommandParserExceptionResolver> getCommandParserExceptionResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CommandParserExceptionResolver>forFactoryMethod(ResultHandlerConfig.class, "commandParserExceptionResolver")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ResultHandlerConfig.class).commandParserExceptionResolver());
  }

  /**
   * Get the bean definition for 'commandParserExceptionResolver'.
   */
  public static BeanDefinition getCommandParserExceptionResolverBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CommandParserExceptionResolver.class);
    beanDefinition.setInstanceSupplier(getCommandParserExceptionResolverInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'throwableResultHandler'.
   */
  private static BeanInstanceSupplier<ThrowableResultHandler> getThrowableResultHandlerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ThrowableResultHandler>forFactoryMethod(ResultHandlerConfig.class, "throwableResultHandler", Terminal.class, CommandCatalog.class, ShellContext.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ResultHandlerConfig.class).throwableResultHandler(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'throwableResultHandler'.
   */
  public static BeanDefinition getThrowableResultHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ThrowableResultHandler.class);
    beanDefinition.setInstanceSupplier(getThrowableResultHandlerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'commandNotFoundResultHandler'.
   */
  private static BeanInstanceSupplier<CommandNotFoundResultHandler> getCommandNotFoundResultHandlerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CommandNotFoundResultHandler>forFactoryMethod(ResultHandlerConfig.class, "commandNotFoundResultHandler", Terminal.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ResultHandlerConfig.class).commandNotFoundResultHandler(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'commandNotFoundResultHandler'.
   */
  public static BeanDefinition getCommandNotFoundResultHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CommandNotFoundResultHandler.class);
    beanDefinition.setInstanceSupplier(getCommandNotFoundResultHandlerInstanceSupplier());
    return beanDefinition;
  }
}
