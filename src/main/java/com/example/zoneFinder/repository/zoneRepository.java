package com.example.zoneFinder.repository;

import com.example.zoneFinder.model.station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface zoneRepository extends JpaRepository<station, Long> {

    @Query(value = "SELECT DISTINCT(t.fareZone) FROM station t WHERE t.stationName LIKE %:stationName% LIMIT 1", nativeQuery = true)
    String findFareZoneByStationNameIgnoreCase(@Param("stationName") String stationName);
}
