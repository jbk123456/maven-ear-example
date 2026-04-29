package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG59 {

    @EJB
    private HelperBeanF59 helperBeanF59;

    public String identify() {
        return "HelperBeanG59";
    }
}
