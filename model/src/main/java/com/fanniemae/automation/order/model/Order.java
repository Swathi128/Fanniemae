package com.fanniemae.automation.order.model;

import com.fanniemae.automation.order.model.OrderType;
import com.fanniemae.automation.order.model.SuperOrder;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class Order {

	public OrderType orderType;
	public SuperOrder superOrder;

	public OrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}

	public SuperOrder getSuperOrder() {
		return superOrder;
	}

	public void setSuperOrder(SuperOrder superOrder) {
		this.superOrder = superOrder;
	}

	public void init(WebDriver driver) {
		orderType = PageFactory.initElements(driver, OrderType.class);
		superOrder = PageFactory.initElements(driver, SuperOrder.class);
	}
}