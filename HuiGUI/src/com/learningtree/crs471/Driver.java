package com.learningtree.crs471;
public class Driver {

	public static void main(String[] args) {

		//
		//  TO DO: Complete the steps below.
		//		   For help, see the hints online
		//
		//  7a.  Construct a new Track object and assign it to a variable
		Track myTrack =new Track();
		
		//  7b.  Set the title of your Track object to "Watching The Wheels"
		myTrack.setTitle("Watching The Wheel");
		String myTitle = myTrack.getTitle();
		//  7c.  Set the running time of your Track object to 3 mins, 48 secs
		myTrack.setRunningTime(3, 48);
		//	7d.  Display the title and running time of your Track object
        System.out.println("Title :\n "+ myTitle);
		System.out.println("RunningTime :\n "+ myTrack.getRunningTime());
	}
}