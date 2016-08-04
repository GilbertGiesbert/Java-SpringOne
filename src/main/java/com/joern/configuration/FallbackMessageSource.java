package com.joern.configuration;


import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.text.MessageFormat;
import java.util.Locale;

public class FallbackMessageSource extends ReloadableResourceBundleMessageSource {

	private static final Locale FALLBACK_LOCALE = Locale.ENGLISH;

	@Override
	protected MessageFormat resolveCode(String code, Locale locale) {
		MessageFormat result = super.resolveCode(code, locale);
		if(result == null && locale != FALLBACK_LOCALE){
			return resolveCode(code, FALLBACK_LOCALE);
		}
		else{
			return result;
		}
	}

	@Override
	protected String resolveCodeWithoutArguments(String code, Locale locale) {
		String result = super.resolveCodeWithoutArguments(code, locale);
		if(result == null && locale != FALLBACK_LOCALE){
			return resolveCodeWithoutArguments(code, FALLBACK_LOCALE);
		}
		else{
			return result;
		}
	}
}