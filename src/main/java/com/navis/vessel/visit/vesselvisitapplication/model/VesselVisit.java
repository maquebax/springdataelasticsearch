package com.navis.vessel.visit.vesselvisitapplication.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;
import java.util.List;
/**
 *
 * @author sridhvi
 *
 */
@Document(indexName = "navisapex", type = "doc")
public class VesselVisit {

    private String vesselName;
    @Id
    private String visit;
    private String line;
    private String visitPhase;
    private Date estimatedArrivalTime;
    private Date estimatedDepartureTime;
    private String classification;
    private String inboundVoyage;
    private String outboundVoyage;
    private String service;
    private String facility;

    @Field( type = FieldType.Nested)
    private List<Itinerary> itineraryList;

    @Field( type = FieldType.Nested)
    private List<Berthings> berthingsList;
    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public String getVisit() {
        return visit;
    }

    public void setVisit(String visit) {
        this.visit = visit;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getVisitPhase() {
        return visitPhase;
    }

    public void setVisitPhase(String visitPhase) {
        this.visitPhase = visitPhase;
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

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
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

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public List<Itinerary> getItineraryList() {
        return itineraryList;
    }

    public void setItineraryList(List<Itinerary> itineraryList) {
        this.itineraryList = itineraryList;
    }

    public List<Berthings> getBerthingsList() {
        return berthingsList;
    }

    public void setBerthingsList(List<Berthings> berthingsList) {
        this.berthingsList = berthingsList;
    }

    @Override
    public String toString() {
        if(this.vesselName !=null)
        return "**************" + this.vesselName + " *********************";

        return "null";
    }

}
