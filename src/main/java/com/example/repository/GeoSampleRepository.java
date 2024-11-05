package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.GeoSample;

@Repository
public interface GeoSampleRepository extends JpaRepository<GeoSample, Long> {

    @Query(value = "SELECT id, name, ST_AsEWKT(geom) as geom FROM geo_sample WHERE id = :id", nativeQuery = true)
	GeoSample findGeoSampleById(Long id);
}
