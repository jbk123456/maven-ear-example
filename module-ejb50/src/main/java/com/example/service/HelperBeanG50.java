package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG50 {

    @EJB
    private HelperBeanF50 helperBeanF50;

    public String identify() {
        return "HelperBeanG50";
    }
}
