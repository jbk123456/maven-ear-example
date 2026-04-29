package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC19 {

    @EJB
    private HelperBeanB19 helperBeanB19;

    public String identify() {
        return "HelperBeanC19";
    }
}
