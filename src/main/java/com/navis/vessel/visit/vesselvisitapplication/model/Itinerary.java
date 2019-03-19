package com.navis.vessel.visit.vesselvisitapplication.model;


/**
 *
 * @author sridhvi
 *
 */

public class Itinerary {
	private String line;
	private String inboundVoyage;
	private String outboundVoyage;
	private String dryCutoff;

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getInboundVoyage() {
		return inboundVoyage;
	}

	public void setInboundVoyage(String inboundVoyage) {
		this.inboundVoyage = inboundVoyage;
	}

	public String getOutboundVoyage() {
		return outboundVoyage;
	}

	public void setOutboundVoyage(String outboundVoyage) {
		this.outboundVoyage = outboundVoyage;
	}

	public String getDryCutoff() {
		return dryCutoff;
	}

	public void setDryCutoff(String dryCutoff) {
		this.dryCutoff = dryCutoff;
	}
}
