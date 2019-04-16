package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loc_table")
public class Location {
	
@Id
@Column(name="lid")
private int locId;

@Column(name="lname")
private String locName;

@Column(name="ltype")
private String locType;

@Column(name="lcode")
private String locCode;


public int getLocId() {
	return locId;
}
public void setLocId(int locId) {
	this.locId = locId;
}
public String getLocName() {
	return locName;
}
public void setLocName(String locName) {
	this.locName = locName;
}
public String getLocType() {
	return locType;
}
public void setLocType(String locType) {
	this.locType = locType;
}
public String getLocCode() {
	return locCode;
}
public void setLocCode(String locCode) {
	this.locCode = locCode;
}
@Override
public String toString() {
	return "Location [locId=" + locId + ", locName=" + locName + ", locType="
			+ locType + ", locCode=" + locCode + "]";
}
public Location( ) {
	super();
}
public Location(int locId) {
	super();
	this.locId = locId;
}

}
