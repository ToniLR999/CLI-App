package dev.tonilr.cliapp.configuration;

import java.util.Locale;

import org.codehaus.groovy.tools.shell.util.MessageSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

@Component 
@Configuration
public class VariablesConfiguration {

    private final ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();

	private Locale lang = Locale.ENGLISH;

    public VariablesConfiguration(){
        messageSource.setBasenames("lang/messages");
        messageSource.setDefaultEncoding("UTF-8");
    }

	public Locale getLang() {
        return lang;
    }

    public void setLang(Locale newLang) {
        this.lang = newLang;
    }

    public String  getLocalisedText(String msg) {
        return messageSource.getMessage(msg, null, lang);
    }

    

    
    
}
