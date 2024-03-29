package dev.tonilr.cliapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.shell.jline.PromptProvider;

import shell.ProgressBar;
import shell.ProgressCounter;

import org.jline.terminal.Terminal;
import org.jline.utils.AttributedString;
import org.springframework.context.annotation.Lazy;

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
