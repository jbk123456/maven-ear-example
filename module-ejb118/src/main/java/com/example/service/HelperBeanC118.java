package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC118 {

    @EJB
    private HelperBeanB118 helperBeanB118;

    public String identify() {
        return "HelperBeanC118";
    }
}
