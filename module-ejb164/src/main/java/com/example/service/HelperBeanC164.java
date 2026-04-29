package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC164 {

    @EJB
    private HelperBeanB164 helperBeanB164;

    public String identify() {
        return "HelperBeanC164";
    }
}
