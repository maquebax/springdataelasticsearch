package com.navis.vessel.visit.vesselvisitapplication.model;



import java.util.Date;

/**
 *
 * @author sridhvi
 *
 */
public class Berthings {
	private int seq;
	private String quay;
	private String sideTo;
	private Date estimatedArrivalTime;
	private Date estimatedDepartureTime;

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getQuay() {
		return quay;
	}

	public void setQuay(String quay) {
		this.quay = quay;
	}

	public String getSideTo() {
		return sideTo;
	}

	public void setSideTo(String sideTo) {
		this.sideTo = sideTo;
	}

	public Date getEstimatedArrivalTime() {
		return estimatedArrivalTime;
	}

	public void setEstimatedArrivalTime(Date estimatedArrivalTime) {
		this.estimatedArrivalTime = estimatedArrivalTime;
	}

	public Date getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}

	public void setEstimatedDepartureTime(Date estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
}
