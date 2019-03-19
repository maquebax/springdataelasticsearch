package com.navis.vessel.visit.vesselvisitapplication.service;




import com.navis.vessel.visit.vesselvisitapplication.model.Berthings;
import com.navis.vessel.visit.vesselvisitapplication.model.Itinerary;
import com.navis.vessel.visit.vesselvisitapplication.model.VesselVisit;
import com.navis.vessel.visit.vesselvisitapplication.repo.VesselVisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service to retrieve data from elastic search
 * @author sridhvi
 *
 */
@Profile("elasticsearch")
@Service(value="vesselServiceElasticSearch")
public class VesselVisitElasticSearchServiceImpl implements VesselVisitService{
	@Autowired
	VesselVisitRepository vesselVisitRepository;
	@Override
	public VesselVisit fetchVesselVisitDetails() {
		Iterable<VesselVisit> vvList =  vesselVisitRepository.findAll();
		VesselVisit details = new VesselVisit();
		for(VesselVisit vv : vvList) {
			if(vv.getVesselName()!=null) {
				details.setVesselName(vv.getVesselName());
				details.setVisit(vv.getVisit());
				details.setLine(vv.getLine());
				details.setVisitPhase(vv.getVisitPhase());
				details.setEstimatedArrivalTime(vv.getEstimatedArrivalTime());
				details.setEstimatedDepartureTime(vv.getEstimatedDepartureTime());
				details.setClassification(vv.getClassification());
				details.setOutboundVoyage(vv.getOutboundVoyage());
				details.setInboundVoyage(vv.getInboundVoyage());
				details.setService(vv.getService());
				details.setFacility(vv.getFacility());

				List<Berthings> berthingsList = vv.getBerthingsList();
				List<Itinerary> itineraryList =vv.getItineraryList();

				details.setBerthingsList(berthingsList);
				details.setItineraryList(itineraryList);
				break;
			}
		}
		return details;
	}
	
}
