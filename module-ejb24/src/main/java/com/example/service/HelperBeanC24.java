package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC24 {

    @EJB
    private HelperBeanB24 helperBeanB24;

    public String identify() {
        return "HelperBeanC24";
    }
}
