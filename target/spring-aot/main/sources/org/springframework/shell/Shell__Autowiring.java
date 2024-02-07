package org.springframework.shell;

import jakarta.validation.ValidatorFactory;
import java.util.List;
import org.springframework.beans.factory.aot.AutowiredMethodArgumentsResolver;
import org.springframework.beans.factory.support.RegisteredBean;
import org.springframework.shell.command.CommandExecution;
import org.springframework.shell.exit.ExitCodeExceptionProvider;

/**
 * Autowiring for {@link Shell}.
 */
public class Shell__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static Shell apply(RegisteredBean registeredBean, Shell instance) {
    AutowiredMethodArgumentsResolver.forRequiredMethod("setCompletionResolvers", List.class).resolve(registeredBean, args -> instance.setCompletionResolvers(args.get(0)));
    AutowiredMethodArgumentsResolver.forRequiredMethod("setArgumentResolvers", CommandExecution.CommandExecutionHandlerMethodArgumentResolvers.class).resolve(registeredBean, args -> instance.setArgumentResolvers(args.get(0)));
    AutowiredMethodArgumentsResolver.forMethod("setValidatorFactory", ValidatorFactory.class).resolve(registeredBean, args -> instance.setValidatorFactory(args.get(0)));
    AutowiredMethodArgumentsResolver.forMethod("setExceptionResolvers", List.class).resolve(registeredBean, args -> instance.setExceptionResolvers(args.get(0)));
    AutowiredMethodArgumentsResolver.forMethod("setExitCodeExceptionProvider", ExitCodeExceptionProvider.class).resolve(registeredBean, args -> instance.setExitCodeExceptionProvider(args.get(0)));
    return instance;
  }
}
