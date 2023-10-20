package com.cg.customermodule;


import jakarta.persistence.Entity;
@Entity

public class Customer {
	 private Integer id;
	 private String name;
	 private String phone;
	 private String email;
	 private  OrderDetails Order_id;
	 
	 
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

 
	public Customer(Integer id, String name, String phone, String email, OrderDetails order_id) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		Order_id = order_id;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public OrderDetails getOrder_id() {
		return Order_id;
	}


	public void setOrder_id(OrderDetails order_id) {
		Order_id = order_id;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", Order_id="
				+ Order_id + "]";
	}
	
	
	
	 
	 
	 
	 
	 
	 
	 
	 

}
