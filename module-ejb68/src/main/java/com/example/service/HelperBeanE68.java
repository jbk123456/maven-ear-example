package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE68 {

    @EJB
    private HelperBeanD68 helperBeanD68;

    public String identify() {
        return "HelperBeanE68";
    }
}
