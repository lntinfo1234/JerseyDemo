package com;

import java.time.LocalDate;

import javax.ws.rs.Path;

public class Message {
private int id;
private String msg;
private LocalDate doc;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public LocalDate getDoc() {
	return doc;
}
public void setDoc(LocalDate doc) {
	this.doc = doc;
}
public Message(int id, String msg, LocalDate doc) {
	
	this.id = id;
	this.msg = msg;
	this.doc = doc;
}
public Message() {
	super();
	// TODO Auto-generated constructor stub
}


}
