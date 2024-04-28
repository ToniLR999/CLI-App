package dev.tonilr.cliapp.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;

import shell.ProgressBar;
import shell.ProgressCounter;

import java.util.Locale;

import org.jline.terminal.Terminal;
import org.jline.utils.AttributedString;
import org.springframework.context.annotation.Lazy;

@Component 
@Configuration
public class CLIAppConfiguration implements PromptProvider{

	@Override
	public final AttributedString getPrompt() {

	return new AttributedString("cli-shell:>");

	}


	@Bean
    public ShellHelper shellHelper(@Lazy Terminal terminal) {
            return new ShellHelper(terminal);
    }

	@Bean
	public ProgressCounter progressCounter(@Lazy Terminal terminal) {
    return new ProgressCounter(terminal);
	}
	
	@Bean
	public ProgressBar progressBar(ShellHelper shellHelper) {
		return new ProgressBar(shellHelper);
	}

}
