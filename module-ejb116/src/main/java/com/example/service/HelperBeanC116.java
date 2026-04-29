package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC116 {

    @EJB
    private HelperBeanB116 helperBeanB116;

    public String identify() {
        return "HelperBeanC116";
    }
}
