package com.example.zoneFinder.controller;

import com.example.zoneFinder.service.stationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class stationController {

    @Autowired
    private stationService stationService;
    @GetMapping("/index")
    public String index()
    {
        return "zone-difference";
    }

    @GetMapping("/find-zone-difference")
    public String findZoneDifference(@RequestParam String station1, @RequestParam String station2, Model model)
    {
        System.out.println(station1+ station2);
        try {
            int zoneDiff = stationService.findfareZoneDifference(station1, station2);
            System.out.println(zoneDiff);
            model.addAttribute("zone-difference", zoneDiff);
        }
        catch(Exception e)
        {
            model.addAttribute("error", e.getMessage());
        }
        return  "zone-difference";
    }
}
