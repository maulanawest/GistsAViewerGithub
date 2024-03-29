package com.fullpagedeveloper.gistsaviewergithub.model;

import java.util.Date;

public class GithubUser {

	/*
	Modifired sample data from: https://developer.github.com/v3/users/#get-the-authenticated-user
	{
		"login": "octocat",
 		"id": 1,
 		"avatar_url": "https://github.com/images/error/octocat_happy.gif",
  		"name": "monalisa octocat",
	  	"company": "GitHub",
	  	"blog": "https://github.com/blog",
	  	"location": "San Francisco",
	  	"email": "octocat@github.com",
	  	"bio": "There once was...",
	  	"public_gists": 1,
	  	"followers": 20,
 		"following": 0,
  		"created_at": "2008-01-14T04:33:35Z",
  		"updated_at": "2008-01-14T04:33:35Z",
  		"private_gists": 81,
	}
	*/

	private String login;
	private int id;
	private String avatar_url;
	private String name;
	private String company;
	private String blog;
	private String location;
	private String email;
	private String bio;
	private int public_gists;
	private int followers;
	private int following;
	private Date created_at;
	private Date update_at;
	private int private_gists;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAvatar_url() {
		return avatar_url;
	}

	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getBlog() {
		return blog;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public int getPublic_gists() {
		return public_gists;
	}

	public void setPublic_gists(int public_gists) {
		this.public_gists = public_gists;
	}

	public int getFollowers() {
		return followers;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}

	public int getFollowing() {
		return following;
	}

	public void setFollowing(int following) {
		this.following = following;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}

	public int getPrivate_gists() {
		return private_gists;
	}

	public void setPrivate_gists(int private_gists) {
		this.private_gists = private_gists;
	}
}