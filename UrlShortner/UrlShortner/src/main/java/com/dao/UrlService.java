package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static com.ls.GenerateShortUrl.getShortUrl;
import static com.ls.GenerateShortUrl.isUrlValid;
import com.model.Url;

@Service
public class UrlService {
	
	@Autowired
	private UrlDataRepository urlDataRepository;

	public String getOriginalUrl(String id) {
		// TODO Auto-generated method stub
		return urlDataRepository.findByShortUrl(id);
	}

	public Url generateShortUrl(String url) {
//	if(! isUrlValid(url)){
//		System.out.println("URL is not valid");
//		return null;
//	}
	Url urlObject=new Url();
	urlObject.setOriginalurl(url);
	urlObject.setShorturl(getShortUrl(url));
	return urlDataRepository.save(urlObject);
	}

}
