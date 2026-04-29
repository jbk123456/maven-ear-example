package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK156 {

    @EJB
    private HelperBeanJ156 helperBeanJ156;

    public String identify() {
        return "HelperBeanK156";
    }
}
