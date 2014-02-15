package com.lianeci.rssreader.parser;

import java.io.Serializable;

public class RSSItem implements Serializable {

	private static final long serialVersionUID = 1L;
	private String _title = null;
	private String _description = null;
	private String _date = null;
	private String _link = null;

	void setTitle(String title) {
		_title = title;
	}

	void setDescription(String description) {
		_description = description;
	}

	void setDate(String pubdate) {
		_date = pubdate;
	}


	public String getTitle() {
		return _title;
	}

	public String getDescription() {
		return _description;
	}


	
	public String getDate() {
		return _date;
	}


}
