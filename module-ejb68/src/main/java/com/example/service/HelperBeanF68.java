package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF68 {

    @EJB
    private HelperBeanE68 helperBeanE68;

    public String identify() {
        return "HelperBeanF68";
    }
}
