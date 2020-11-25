package com.javaweb.javaweb.entities;

import java.time.Instant;

import com.javaweb.javaweb.entities.enums.OrderStatus;

public class Order {

	private Long id;
	private Instant moment;
	
	private User user;
	
	private Integer orderStatus;
	
	public Order() {
	}

	public Order(Long id, Instant moment, User user, OrderStatus orderStatus) {
		setId(id);
		setMoment(moment);
		setUser(user);
		setOrderStatus(orderStatus);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public OrderStatus getOrderStatus(Integer code) {
		return OrderStatus.valueOf(code);
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		if(orderStatus != null) {
			this.orderStatus = orderStatus.getCode();
		}
	}
	
	
}
