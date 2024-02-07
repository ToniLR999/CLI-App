package dev.tonilr.cliapp.commands;

import dev.tonilr.cliapp.client.DadJokeClient;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DadJokeCommand}.
 */
public class DadJokeCommand__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'dadJokeCommand'.
   */
  private static BeanInstanceSupplier<DadJokeCommand> getDadJokeCommandInstanceSupplier() {
    return BeanInstanceSupplier.<DadJokeCommand>forConstructor(DadJokeClient.class)
            .withGenerator((registeredBean, args) -> new DadJokeCommand(args.get(0)));
  }

  /**
   * Get the bean definition for 'dadJokeCommand'.
   */
  public static BeanDefinition getDadJokeCommandBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DadJokeCommand.class);
    beanDefinition.setInstanceSupplier(getDadJokeCommandInstanceSupplier());
    return beanDefinition;
  }
}
