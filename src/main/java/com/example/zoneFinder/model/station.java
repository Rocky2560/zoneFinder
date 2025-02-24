package com.example.zoneFinder.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.ComponentScan;

@Entity
@Table(name = "station")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "station_name", nullable = false)
    private String stationName;

    @Column(name = "local_authority")
    private String localAuthority;

    @Column(name = "managed_by")
    private String managedBy;

    @Column(name = "station_code", unique = true)
    private String stationCode;

    @Column(name = "fare_zone")
    private String fareZone;

    @Column(name = "year_opened")
    private Integer yearOpened;

    @Column(name = "category", length = 11)
    private String category;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "area_served")
    private String areaServed;

}
