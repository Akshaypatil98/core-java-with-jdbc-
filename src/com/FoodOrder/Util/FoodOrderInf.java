package com.FoodOrder.Util;

import java.util.List;
import java.util.Set;

import com.FoodOrder.Bean.Dish;

public interface FoodOrderInf {
	Set<Dish> populateData(String dishFile);

}
