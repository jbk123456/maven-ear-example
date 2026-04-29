package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC142 {

    @EJB
    private HelperBeanB142 helperBeanB142;

    public String identify() {
        return "HelperBeanC142";
    }
}
