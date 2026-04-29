package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC65 {

    @EJB
    private HelperBeanB65 helperBeanB65;

    public String identify() {
        return "HelperBeanC65";
    }
}
