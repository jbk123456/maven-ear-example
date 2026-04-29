package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI140 {

    @EJB
    private HelperBeanH140 helperBeanH140;

    public String identify() {
        return "HelperBeanI140";
    }
}
