package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH140 {

    @EJB
    private HelperBeanG140 helperBeanG140;

    public String identify() {
        return "HelperBeanH140";
    }
}
