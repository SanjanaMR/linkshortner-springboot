  package com.ls;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.apache.commons.validator.routines.UrlValidator;

import com.google.common.hash.Hashing;

public class GenerateShortUrl {

	public static String getShortUrl(String url){
		CharSequence charSequence = url; // Convert String to CharSequence
        String shortUrl = Hashing.murmur3_32_fixed().hashString(charSequence, StandardCharsets.UTF_8).toString();
        return shortUrl;
    }

    public static boolean isUrlValid(String url) {
        boolean result = UrlValidator.getInstance().isValid(url);
        return result;
    
	}
}
