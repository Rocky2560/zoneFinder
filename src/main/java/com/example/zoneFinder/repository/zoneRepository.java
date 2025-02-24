package com.example.zoneFinder.repository;

import com.example.zoneFinder.model.station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface zoneRepository extends JpaRepository<station, Long> {

    @Query("SELECT t.fareZone FROM station t WHERE t.stationName = :stationName")
    String findFareZoneByStationNameIgnoreCase(String stationName);

}
