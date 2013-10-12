package com.learningtree.crs471;
public class Driver2 {

	public static void main(String[] args) {

		//
		//  TO DO: Complete the steps below.
		//		   For help, see the hints online
		//
		//  7a.  Construct a new Track object and assign it to a variable
		Track myTrack =new Track();
		
		//  7b.  Set the title of your Track object to "Watching The Wheels"
		myTrack.setTitle(args[0]);
		String myTitle = myTrack.getTitle();
		//  7c.  Set the running time of your Track object to 3 mins, 48 secs
		myTrack.setRunningTime(new Integer(args[1]), new Integer(args[2]));
		//	7d.  Display the title and running time of your Track object
        System.out.println("Title :\n "+ myTitle);
		System.out.println("RunningTime :\n "+ myTrack.getRunningTime());
	}
}