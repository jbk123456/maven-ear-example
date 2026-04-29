package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD19 {

    @EJB
    private HelperBeanC19 helperBeanC19;

    public String identify() {
        return "HelperBeanD19";
    }
}
