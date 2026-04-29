package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC165 {

    @EJB
    private HelperBeanB165 helperBeanB165;

    public String identify() {
        return "HelperBeanC165";
    }
}
