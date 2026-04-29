package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC151 {

    @EJB
    private HelperBeanB151 helperBeanB151;

    public String identify() {
        return "HelperBeanC151";
    }
}
