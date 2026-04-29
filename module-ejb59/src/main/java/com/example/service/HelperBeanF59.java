package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF59 {

    @EJB
    private HelperBeanE59 helperBeanE59;

    public String identify() {
        return "HelperBeanF59";
    }
}
