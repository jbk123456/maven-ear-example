package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC41 {

    @EJB
    private HelperBeanB41 helperBeanB41;

    public String identify() {
        return "HelperBeanC41";
    }
}
