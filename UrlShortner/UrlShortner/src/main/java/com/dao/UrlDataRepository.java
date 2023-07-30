package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.Url;

@Repository
public interface UrlDataRepository extends JpaRepository<Url, Integer>{

	@Query(value="select originalurl from Url where shorturl = ?1", nativeQuery=true)
	String findByShortUrl(String id);

}
