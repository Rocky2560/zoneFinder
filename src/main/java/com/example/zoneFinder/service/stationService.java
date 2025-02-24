package com.example.zoneFinder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.zoneFinder.repository.zoneRepository;
@Service
public class stationService {

@Autowired
    private zoneRepository zoneRepository;

public int findfareZoneDifference(String station1, String station2)
{
 String zone1 = zoneRepository.findFareZoneByStationNameIgnoreCase(station1);
    System.out.println(zone1);
 String zone2 = zoneRepository.findFareZoneByStationNameIgnoreCase(station2);
    System.out.println(zone1);

 if (zone1 == null && zone2 == null)
 {
     throw new RuntimeException("one or both station not found");
 }

 return Math.abs(Integer.parseInt(zone1) - Integer.parseInt(zone2));
}
}
