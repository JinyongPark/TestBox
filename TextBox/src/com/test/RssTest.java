package com.test;

import java.io.File;
import java.net.URL;

import org.apache.commons.digester.Digester;
import org.apache.commons.digester.ExtendedBaseRules;

public class RssTest{
	
	public static void main(String[] args){
		RssTest rt = new RssTest();
		rt.start();
	}

	private void start() {
		
		File file = new File("E:/eclipse/workspace/DigesterTest/xml/jupid.xml");
		
		Digester dig = new Digester();
		dig.setRules(new ExtendedBaseRules());
		
		dig.addObjectCreate("rss/channel",Rss.class);
		dig.addBeanPropertySetter("rss/channel/title","title");
		dig.addBeanPropertySetter("rss/channel/link","link");
		dig.addBeanPropertySetter("rss/channel/description","description");
		dig.addBeanPropertySetter("rss/channel/language","language");
		dig.addBeanPropertySetter("rss/channel/pubDate","pubDate");
		dig.addBeanPropertySetter("rss/channel/generator","generator");
		
		dig.addObjectCreate("rss/channel/item",Item.class);
		dig.addBeanPropertySetter("rss/channel/item/title","title");
		dig.addBeanPropertySetter("rss/channel/item/link","link");
		dig.addBeanPropertySetter("rss/channel/item/description","description");
		dig.addBeanPropertySetter("rss/channel/item/category","category");
		dig.addBeanPropertySetter("rss/channel/item/author","author");
		dig.addBeanPropertySetter("rss/channel/item/guid","guid");
		dig.addBeanPropertySetter("rss/channel/item/comments","comments");
		dig.addBeanPropertySetter("rss/channel/item/pubDate","pubDate");
		
		
		dig.addSetNext("rss/channel/item","addItem");
		
//		dig.addObjectCreate("channel/item/category",Category.class);
//		dig.addBeanPropertySetter("channel/item/category/category","category");
//		dig.addSetNext("channel/item/category","addCategory");
		
		try{
			URL url = new URL("http://blog.rss.naver.com/wish_joo.xml");
			Object obj = dig.parse(url);
		}catch(Exception e){
			e.printStackTrace();
		}
		Rss r = (Rss)dig.getRoot();
		
		//System.out.println("타이틀 = "+ r.getTitle()+",주소= "+r.getLink()+",할말="+r.getDescription()+",언어="+r.getLanguage()+",날짜="+r.getPubDate()+",제목="+r.getGenerator());
		//System.out.println("r.getItems() = "+r.getItems());
	}
	
	public static Rss getRss(String rssUrl) {
			
			File file = new File("E:/eclipse/workspace/DigesterTest/xml/jupid.xml");
			
			Digester dig = new Digester();
			dig.setRules(new ExtendedBaseRules());
			
			dig.addObjectCreate("rss/channel",Rss.class);
			dig.addBeanPropertySetter("rss/channel/title","title");
			dig.addBeanPropertySetter("rss/channel/link","link");
			dig.addBeanPropertySetter("rss/channel/description","description");
			dig.addBeanPropertySetter("rss/channel/language","language");
			dig.addBeanPropertySetter("rss/channel/pubDate","pubDate");
			dig.addBeanPropertySetter("rss/channel/generator","generator");
			
			dig.addObjectCreate("rss/channel/item",Item.class);
			dig.addBeanPropertySetter("rss/channel/item/title","title");
			dig.addBeanPropertySetter("rss/channel/item/link","link");
			dig.addBeanPropertySetter("rss/channel/item/description","description");
			dig.addBeanPropertySetter("rss/channel/item/category","category");
			dig.addBeanPropertySetter("rss/channel/item/author","author");
			dig.addBeanPropertySetter("rss/channel/item/guid","guid");
			dig.addBeanPropertySetter("rss/channel/item/comments","comments");
			dig.addBeanPropertySetter("rss/channel/item/pubDate","pubDate");
			
			
			dig.addSetNext("rss/channel/item","addItem");
			
	//		dig.addObjectCreate("channel/item/category",Category.class);
	//		dig.addBeanPropertySetter("channel/item/category/category","category");
	//		dig.addSetNext("channel/item/category","addCategory");
			
			Rss rss = null;
			try{
				URL url = new URL(rssUrl);
				rss = (Rss) dig.parse(url);
			}catch(Exception e){
				e.printStackTrace();
			}
			
			return rss;
	}
}
