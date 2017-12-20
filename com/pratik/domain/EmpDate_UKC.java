package com.pratik.domain;

import java.util.Date;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Type;
@Entity
@Table(name="EmpDate_UKC",
		uniqueConstraints=
			{@UniqueConstraint(columnNames={"FIRSTNAME"}),
						@UniqueConstraint(columnNames={"LASTNAME"})})

public class EmpDate {
	private int cartid;
	private String fname;
	private String lname;
	private Date joindate;


		public EmpDate_UKC() {
			super();
			System.out.println("\n\t\t***WELCOME TO DMART***");
		}
			@Id
			@Type(type="int")
			@Column(name="CARTID",length=10)
		public int getCartid() {
			return cartid;
		}

		public void setCartid(int cartid) {
			this.cartid = cartid;
		}
			@Column(name="FIRSTNAME")
		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}
			@Column(name="LASTNAME")			
		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}
		
		@Column(name="JOININGDATE")
		@Temporal(TemporalType.DATE)
		public Date getJoindate() {
			return joindate;
		}

		public void setJoindate(Date joindate) {
			this.joindate = joindate;
		}
		@Override
		public String toString() {
			return "EmpDate [cartid=" + cartid + ", fname=" + fname + ", lname=" + lname + ", joindate=" + joindate
					+ "]";
		}
	
			




	
}
