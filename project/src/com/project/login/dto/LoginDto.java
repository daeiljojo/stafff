package com.project.login.dto;

public class LoginDto {

	private int empno;
	private String empname;
	private String juminno;
	private String email;
	private String phone;
	private String indt;
	private String outdt;
	private int manyn;
	private int deptno;

	@Override
	public String toString() {
		return "LoginDto [empno=" + empno + ", empname=" + empname + ", juminno=" + juminno + ", email=" + email
				+ ", phone=" + phone + ", indt=" + indt + ", outdt=" + outdt + ", manyn=" + manyn + ", deptno=" + deptno
				+ ", ranknum=" + ranknum + "]";
	}
	private int ranknum;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getJuminno() {
		return juminno;
	}
	public void setJuminno(String juminno) {
		this.juminno = juminno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getIndt() {
		return indt;
	}
	public void setIndt(String indt) {
		this.indt = indt;
	}
	public String getOutdt() {
		return outdt;
	}
	public void setOutdt(String outdt) {
		this.outdt = outdt;
	}
	public int getManyn() {
		return manyn;
	}
	public void setManyn(int manyn) {
		this.manyn = manyn;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public int getRanknum() {
		return ranknum;
	}
	public void setRanknum(int ranknum) {
		this.ranknum = ranknum;
	}
}
