package com.example.demo.model;

public class Course {
	private int id;
	private String name,desc, fee, resources;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getResources() {
		return resources;
	}
	public void setResources(String resources) {
		this.resources = resources;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", desc=" + desc + ", fee=" + fee + ", resources=" + resources
				+ "]";
	}
	
}
