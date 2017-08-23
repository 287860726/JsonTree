package com.zhao.www;

import java.util.ArrayList;
import java.util.List;

public class Node {

	private String id;
	private String pid;
	private String text;
	private String url;
	private List<Node> menus;

	public Node() {
	}

	public Node(String id, String pid, String text, String url) {
		super();
		this.id = id;
		this.pid = pid;
		this.text = text;
		this.url = url;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Node> getMenus() {
		return menus;
	}

	public void setMenus(List<Node> menus) {
		this.menus = menus;
	}
	
}
