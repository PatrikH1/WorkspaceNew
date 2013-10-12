package com.learningtree.crs471;
public class Track {

	//
	//  TO DO: Complete the steps below.
	//	       For help, see the hints online
	//
	//
	//	5a.  Define the fields for the track title and runningTime
	//	 	-  The fields should have "private" access
	private String title;
	private Duration runningTime;
	
	//	5b.  Define the getter and setter methods for the
	//		track title and runningTime
  	//		-  The methods should have "public" access
  	public String getTitle()
	{
	   return title;
	}
	public void setTitle( String s)
	{
	   title = s;
	}
	
	public void setRunningTime(int min, int sec) {
		runningTime = new Duration(0, min,sec);
	}

	public Duration getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(int h,int min, int sec) {
		runningTime = new Duration(h,min,sec);
	}
}