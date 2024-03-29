package com.fullpagedeveloper.gistsaviewergithub.model.gists;

import com.fullpagedeveloper.gistsaviewergithub.model.GithubUser;

import java.util.Date;

public class Gistcomment {

	/*
	Modifired sample data from: https://developer.github.com/v3/gists/comments/#list-comments-on-a-gist
	{
		"id": 1,
		"body": "Just commenting for the sake of commenting",
		"user": {

		},
		"created_at": "2011-04-18T23:23:56Z",
    	"updated_at": "2011-04-18T23:23:56Z"
	}
	*/

	private int id;
	private String body;
	private GithubUser user;
	private Date created_at;
	private Date updated_at;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public GithubUser getUser() {
		return user;
	}

	public void setUser(GithubUser user) {
		this.user = user;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
}
