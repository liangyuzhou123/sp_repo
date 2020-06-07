package cn.tedu.sp01.service;

import cn.tedu.sp01.pojo.Item;

public interface OrderService {
	Item getOrder(String orderId);
	void addOrder(Item order);
}
