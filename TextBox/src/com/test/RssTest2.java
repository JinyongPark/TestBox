package com.test;

import java.net.URL;

import org.apache.commons.digester.Digester;


public class RssTest2 {
	public static Rss getRss(String rssUrl) {				
		
		Digester dig = new Digester();
		
		Rss rss = null;
		try{
			URL url = new URL(rssUrl);
			rss = (Rss) dig.parse(url);
		}catch(Exception e){
			System.out.println(e.toString());
			System.out.println("rssTest2.java 오류");
		}		
		return rss;
	}
}
