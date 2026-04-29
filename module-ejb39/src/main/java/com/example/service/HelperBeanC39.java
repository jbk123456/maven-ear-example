package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC39 {

    @EJB
    private HelperBeanB39 helperBeanB39;

    public String identify() {
        return "HelperBeanC39";
    }
}
