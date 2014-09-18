package com.refactorlabs.cs378;

public class LongArrayWritable extends ArrayWritable{
	public LongArrayWritable() { super(LongWritable.class); }
	
	public long[] getValueArray() {
		Writable[] writableValues = get();
		long[] values = new Long[writableValues.length];
		
		for ( int i = 0; i < values.length; i++ ) {
			values[i] = ((longWritable)writableValues[i])get();
		}
		
		return values;
	}

}
