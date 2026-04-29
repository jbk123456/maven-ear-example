package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC25 {

    @EJB
    private HelperBeanB25 helperBeanB25;

    public String identify() {
        return "HelperBeanC25";
    }
}
