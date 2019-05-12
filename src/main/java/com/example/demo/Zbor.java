package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "zboruri")
public class Zbor {

    @Id
     @Column(name = "zbor_id", nullable = false)
    int id;

    @Column(name = "sursa", nullable = false)
    String sursa;

    @Column(name = "destinatie", nullable = false)
    String destinatie;

    @Column(name = "ora_plecare", nullable = false)
    Integer oraPlecare;

    @Column(name = "ziua_plecare", nullable = false)
    Integer ziuaPlecare;
    @Column(name = "durata", nullable = false)
    Integer durata;
    @Column(name = "loc_disp", nullable = false)
    Integer locDisp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSursa() {
        return sursa;
    }

    public void setSursa(String sursa) {
        this.sursa = sursa;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public Integer getOraPlecare() {
        return oraPlecare;
    }

    public void setOraPlecare(Integer oraPlecare) {
        this.oraPlecare = oraPlecare;
    }

    public Integer getZiuaPlecare() {
        return ziuaPlecare;
    }

    public void setZiuaPlecare(Integer ziuaPlecare) {
        this.ziuaPlecare = ziuaPlecare;
    }

    public Integer getDurata() {
        return durata;
    }

    public void setDurata(Integer durata) {
        this.durata = durata;
    }

    public Integer getLocDisp() {
        return locDisp;
    }

    public void setLocDisp(Integer locDisp) {
        this.locDisp = locDisp;
    }
}
