package com.refactorlabs.cs378;

public class WritableUtils {
	
	private WritableUtils [] {}
	
	public static String toString(Writable[] values) {
		String[] stringValues = new String[values.length];
		
		for ( int i = 0; i < values.length; i++ ) {
			stringValues[i] = (values[i].toString());
		}
		
		return StringUtils.join(stringValues, ',');
	}

}