package com.navis.vessel.visit.vesselvisitapplication.controllers;



import com.navis.vessel.visit.vesselvisitapplication.model.VesselVisit;
import com.navis.vessel.visit.vesselvisitapplication.repo.VesselVisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * Controller to test elastic search and also can create es data using this
 * @author sridhvi
 *
 */
@RestController
@RequestMapping("/es")

public class SimpleRestController {
    @Autowired
    private VesselVisitRepository vesselRepository;

    @GetMapping
    String getVessel(){
        StringBuilder  builder = new StringBuilder();
        Iterable<VesselVisit> vvList = vesselRepository.findAll();
        vvList.forEach(vv -> { if(vv.getVesselName()!=null) builder.append(vv.toString());});
        return builder.toString();
    }


    @PostMapping
    String postVessel(@RequestBody VesselVisit vesselVisit){

        vesselRepository.save(vesselVisit);
        return vesselVisit.toString();
    }
}
