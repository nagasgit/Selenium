package mandatoryHW.DSA.week12;

import mandatoryHW.DSA.week10.EmployeeDetails;

public class Pojo_Cls_Org {

	private int id;
	public EmployeeDetails employee;
	
	//Constructor creation
	public Pojo_Cls_Org(int id, EmployeeDetails employee) {
	
		this.id = id;
		this.employee = employee;
	}
	
	public void empDetails() {
		EmployeeDetails emp = new EmployeeDetails();
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	/*
	 * public int getId() { return id; }
	 * 
	 * public int setId(int id) { return id; }
	 */
	
	
}
