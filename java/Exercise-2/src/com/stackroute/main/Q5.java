package com.stackroute.main;
import java.util.*;

public class Q5 {
	public double[] gradeStatistics(int numberOfStudents, int[] grades){
		double[] gradeStats = new double[3];
		gradeStats[0] = getAverageValue(numberOfStudents,grades);
		gradeStats[1] = getMinimumValue(grades);
		gradeStats[2] = getMaximumValue(grades);

		return gradeStats;
	}

	private double getMinimumValue(int[] values) {
		double minimumValue = values[0];
		for (int value: values){
			if(minimumValue > value){
				minimumValue = value;
			}
		}
		return minimumValue;
	}

	private double getMaximumValue(int[] values) {
		double maximumValue = 0;
		for (int value: values){
			if(maximumValue < value){
				maximumValue = value;
			}
		}
		return maximumValue;
	}

	private double getAverageValue(int numberOfValues, int[] values){
		double sumOfValues = 0, averageValue;
		for(int value: values){
			sumOfValues += value;
		}
		averageValue = sumOfValues / numberOfValues;
		return averageValue;
	}
}
