package edu.upc.eetac.dsa.ernest.better.api.model;

import java.util.ArrayList;

import edu.upc.eetac.dsa.ernest.better.api.links.Link;

public class Sting {
	private String stingId;
	private String username;
	private String author;
	private String subject;
	private String content;
	private java.util.Date creationTimestamp;
	private ArrayList<Link> links;
	
	public Sting() {
		super();
		links = new ArrayList<Link>();
	}
	
	public String getStingId() {
		return stingId;
	}
	public void setStingId(String id) {
		this.stingId = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public java.util.Date getCreationTimestamp() {
		return creationTimestamp;
	}
	public void setCreationTimestamp(java.util.Date creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public ArrayList<Link> getLinks() {
		return links;
	}

	public void setLinks(ArrayList<Link> links) {
		this.links = links;
	}
	
	public void addLink(Link link) {
		links.add(link);
		return;
	}
	
	
}
