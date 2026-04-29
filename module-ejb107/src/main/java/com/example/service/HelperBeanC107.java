package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC107 {

    @EJB
    private HelperBeanB107 helperBeanB107;

    public String identify() {
        return "HelperBeanC107";
    }
}
