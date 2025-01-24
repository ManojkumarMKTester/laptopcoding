package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	public void TransportForm() {
System.out.println("Transport is much important");
	}
	public static void main(String[] args) {
		Transport tm=new Transport();
		tm.TransportForm();
		Water wr=new Water();
		wr.boat();
		wr.ship();
		Air ai=new Air();
		ai.aeroPlane();
		ai.heliCopter();Road rd=new Road();
		rd.bike();
		rd.cycle();
		rd.bus();
		rd.car();
	}
}
