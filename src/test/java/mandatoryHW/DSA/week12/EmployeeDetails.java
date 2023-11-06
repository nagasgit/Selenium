package mandatoryHW.DSA.week12;

public class EmployeeDetails {

	private String orgName;
	private int totalExp;
	private String des;
	public EmployeeDetails previousExp;

	public EmployeeDetails(String orgName, int totalExp, String des, EmployeeDetails previousExp) {
		super();
		this.orgName = orgName;
		this.totalExp = totalExp;
		this.des = des;
		this.previousExp = previousExp;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public int getTotalExp() {
		return totalExp;
	}

	public void setTotalExp(int totalExp) {
		this.totalExp = totalExp;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public EmployeeDetails getPreviousExp() {
		return previousExp;
	}

	public void setPreviousExp(EmployeeDetails previousExp) {
		this.previousExp = previousExp;
	}	
	
}
