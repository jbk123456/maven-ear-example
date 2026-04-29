package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH136 {

    @EJB
    private HelperBeanG136 helperBeanG136;

    public String identify() {
        return "HelperBeanH136";
    }
}
