package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI141 {

    @EJB
    private HelperBeanH141 helperBeanH141;

    public String identify() {
        return "HelperBeanI141";
    }
}
