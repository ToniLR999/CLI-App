package dev.tonilr.cliapp;

import dev.tonilr.cliapp.client.DadJokeClient;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link CliappApplication}.
 */
public class CliappApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'cliappApplication'.
   */
  public static BeanDefinition getCliappApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CliappApplication.class);
    beanDefinition.setTargetType(CliappApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(CliappApplication.class);
    beanDefinition.setInstanceSupplier(CliappApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'dadJokeClient'.
   */
  private static BeanInstanceSupplier<DadJokeClient> getDadJokeClientInstanceSupplier() {
    return BeanInstanceSupplier.<DadJokeClient>forFactoryMethod(CliappApplication.class, "dadJokeClient")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(CliappApplication.class).dadJokeClient());
  }

  /**
   * Get the bean definition for 'dadJokeClient'.
   */
  public static BeanDefinition getDadJokeClientBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DadJokeClient.class);
    beanDefinition.setInstanceSupplier(getDadJokeClientInstanceSupplier());
    return beanDefinition;
  }
}
