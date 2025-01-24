package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheller;

public class Vehicle {
	public void VehicleNecessery() {
           System.out.println("Vehicle Is run at petrol");
	}
	public static void main(String[] args) {
		Vehicle vc=new Vehicle();
		vc.VehicleNecessery();
		
		TwoWheller mh=new TwoWheller();
		mh.cycle();
		mh.bike();
		
		FourWheeler fh=new FourWheeler();
		fh.car();
		fh.bus();
		fh.lorry();
		
		ThreeWheeler th=new ThreeWheeler();
		th.Auto();
	}

}
