package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class GeoSample {
    
    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(columnDefinition = "TEXT")
    private String geom;  // Store Well-Known Text (WKT) representation

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeom() {
        return geom;
    }

    public void setGeom(String geom) {
        this.geom = geom;
    }
}
