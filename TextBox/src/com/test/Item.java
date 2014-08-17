package com.test;

import java.util.ArrayList;
import java.util.List;


public class Item{
	
	private String title;
	private List categoryList = new ArrayList();
	private String author;
	private String link;
	private String description;
	private String guid;
	private String comments;
	private String pubDate;
	
	
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setCategory(String category) {
		categoryList.add(category);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString(){
		return "\ntitle = "+title+"link = "+link+",description = "+description+",category = "+categoryList+",author ="+author+",guid = "+guid+",comments = "+comments+",pubDate = "+pubDate;
	}
}