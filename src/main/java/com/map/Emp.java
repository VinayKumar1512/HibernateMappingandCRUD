package com.map;
import java.util.*;

import javax.persistence.*;

@Entity
public class Emp {

	@Id
	private int eid;
	private String name;
	
	@ManyToMany(mappedBy="projects")
	private List<Project> list;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int eid, String name, List<Project> list) {
		super();
		this.eid = eid;
		this.name = name;
		this.list = list;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getList() {
		return list;
	}

	public void setList(List<Project> list) {
		this.list = list;
	}

}
