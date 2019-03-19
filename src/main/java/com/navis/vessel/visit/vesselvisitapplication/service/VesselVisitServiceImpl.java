package com.navis.vessel.visit.vesselvisitapplication.service;


import com.navis.vessel.visit.vesselvisitapplication.model.Berthings;
import com.navis.vessel.visit.vesselvisitapplication.model.Itinerary;
import com.navis.vessel.visit.vesselvisitapplication.model.VesselVisit;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Sample service with some hardcoded values, need to fetch the real values from NoSQL
 * @author thulath
 *
 */
@Profile("default")
@Service(value="vesselServiceDefault")
public class VesselVisitServiceImpl implements VesselVisitService{

	@Override
	public VesselVisit fetchVesselVisitDetails() {
		Date arrivalTime = Date.from(Instant.now().plus(1, ChronoUnit.DAYS));
		Date departTime = Date.from(Instant.now().plus(2, ChronoUnit.DAYS));
		VesselVisit details = new VesselVisit();
		details.setVesselName("APL Chongqing");
		details.setVisit("APLCHO001");
		details.setLine("APL");
		details.setVisitPhase("Working");
		details.setEstimatedArrivalTime(arrivalTime);
		details.setEstimatedDepartureTime(departTime);
		details.setClassification("Deepsea");
		details.setOutboundVoyage("002E");
		details.setInboundVoyage("002");
		details.setService("SCX");
		details.setFacility("RWG");
		
		Berthings berthings = new Berthings();
		berthings.setSeq(1);
		berthings.setQuay("DS");
		berthings.setSideTo("Starboard");
		berthings.setEstimatedArrivalTime(arrivalTime);
		berthings.setEstimatedDepartureTime(departTime);
		
		List<Itinerary> itineraryList = new ArrayList<>();
		Itinerary it = new Itinerary();
		it.setLine("APL");
		it.setInboundVoyage("002");
		it.setOutboundVoyage("002");
		itineraryList.add(it);
		
		it = new Itinerary();
		it.setLine("HMM");
		it.setInboundVoyage("002");
		it.setOutboundVoyage("002");
		itineraryList.add(it);
		
		it = new Itinerary();
		it.setLine("MOL");
		it.setInboundVoyage("002");
		it.setOutboundVoyage("ACH002E");
		itineraryList.add(it);
		
		details.setBerthingsList(Arrays.asList(berthings));
		details.setItineraryList(itineraryList);
		return details;
	}
	
}
