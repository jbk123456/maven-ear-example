package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC155 {

    @EJB
    private HelperBeanB155 helperBeanB155;

    public String identify() {
        return "HelperBeanC155";
    }
}
