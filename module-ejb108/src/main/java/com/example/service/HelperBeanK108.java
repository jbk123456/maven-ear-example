package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK108 {

    @EJB
    private HelperBeanJ108 helperBeanJ108;

    public String identify() {
        return "HelperBeanK108";
    }
}
