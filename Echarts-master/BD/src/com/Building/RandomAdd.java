package com.Building;

import java.util.ArrayList;
import java.util.List;

public class RandomAdd {

	public static void main(String[] args) {
		randomAdd(1212595,308519);
	}
	public static void randomAdd(double x,double y) {
		
		List<Integer> numList = new ArrayList<Integer>();
		for (int i=0;i<10;i++)
		{
			int addNum = (int) (Math.random()*10);
			int minNum = (int) (Math.random()*10);
			
			if (minNum < 5)
			{
				minNum = minNum * -1;
			}
			if (addNum < 5)
			{ 
				addNum = addNum * -1;
			}
			x=x+addNum;
			y=y+minNum;
			
			numList.add(addNum);
			numList.add(minNum);
		}
				
		System.out.print(x + ","+y+",");
		for(int i = 0; i < numList.size(); i++) {
			System.out.print(numList.get(i) + ",");
			
		}
	}
}
