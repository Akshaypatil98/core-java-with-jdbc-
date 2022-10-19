package com.FoodOrder.Util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.FoodOrder.Bean.Dish;
public class FoodOrderImpl implements FoodOrderInf {

	@Override
	public Set<Dish> populateData(String fileName) {
		Set<Dish> sList = new HashSet<>();
		File f = new File(fileName);

		try {
			Scanner sc = new Scanner(f);
			int i = 0;
			while (sc.hasNext()) {
				String[] m = sc.nextLine().split(",");
				int dishId = Integer.parseInt(m[0]);
				String dishName = m[1];
				int cost = Integer.parseInt(m[2]);
				double timeToCook = Double.parseDouble(m[3]);
				Dish s = new Dish(dishId, dishName, cost, timeToCook);
				i++;
				sList.add(s);
				//System.out.println(sList);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hello");
		for (Dish s : sList) {
			s.setDishId(s.getDishId());
			s.setDishName(s.getDishName());
			s.setCost(s.getCost());
			s.setTimeToCook(s.getTimeToCook());
		}

		return sList;

	}

}
