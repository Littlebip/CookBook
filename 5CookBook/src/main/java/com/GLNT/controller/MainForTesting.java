package com.GLNT.controller;

import com.GLNT.tool.DatabasePopulator;

public class MainForTesting {

	public static void main(String[] args) {

		DatabasePopulator dp = new DatabasePopulator();
		dp.populateDatabase();

	}
}
