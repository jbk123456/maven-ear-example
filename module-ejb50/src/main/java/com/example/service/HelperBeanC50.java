package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC50 {

    @EJB
    private HelperBeanB50 helperBeanB50;

    public String identify() {
        return "HelperBeanC50";
    }
}
