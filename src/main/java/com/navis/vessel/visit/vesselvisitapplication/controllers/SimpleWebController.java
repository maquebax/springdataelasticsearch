package com.navis.vessel.visit.vesselvisitapplication.controllers;


import com.navis.vessel.visit.vesselvisitapplication.service.VesselVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SimpleWebController {
    @Autowired
    VesselVisitService vesselVisitService;

    @Value("${spring.application.name}")
    String appName;
    @GetMapping("/home")
    String getHome(Model model){
        model.addAttribute("appName",appName);
        return "home";
    }

    @GetMapping({"/","/vesselVisitDetails"})
    public String vesselVisitDetails(Model model) {
        model.addAttribute("vvd", vesselVisitService.fetchVesselVisitDetails());
        return "/vesselVisitDetails";
    }




}