package com.map;
import java.util.*;

import javax.persistence.*;

@Entity
public class Project {

	@Id
	private int pid;
	private String projectName;
	
	
	@ManyToMany
	private List<Emp> projects;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Emp> getList() {
		return projects;
	}

	public void setList(List<Emp> list) {
		this.projects = list;
	}

	public Project(int pid, String projectName, List<Emp> list) {
		super();
		this.pid = pid;
		this.projectName = projectName;
		this.projects= list;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
