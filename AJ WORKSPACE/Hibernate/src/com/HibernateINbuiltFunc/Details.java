package com.HibernateINbuiltFunc;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table
public class Details {
	@javax.persistence.Id
    int Id;
    String Name;
    int mobno;
    
    Details()
    {
    	super();
    }
    
    
    public Details(int id, String name, int mobno) {
		super();
		Id = id;
		Name = name;
		this.mobno = mobno;
	}
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	

	public void setName(String name) {
		Name = name;
	}
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	@Override
	public String toString() {
		return "Details [Id=" + Id + ", Name=" + Name + ", mobno=" + mobno + "]";
	}
}
