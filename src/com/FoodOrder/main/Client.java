package com.FoodOrder.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.FoodOrder.Bean.Dish;
import com.FoodOrder.Util.FoodOrderImpl;
import com.FoodOrder.Util.FoodOrderInf;

public class Client {
	public static void main(String[] args) {

		FoodOrderInf fos = new FoodOrderImpl();
		Set<Dish> s = fos.populateData("Dish.txt");
		System.out.println(s);
	}

}
