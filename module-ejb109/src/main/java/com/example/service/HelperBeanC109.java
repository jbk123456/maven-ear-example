package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC109 {

    @EJB
    private HelperBeanB109 helperBeanB109;

    public String identify() {
        return "HelperBeanC109";
    }
}
