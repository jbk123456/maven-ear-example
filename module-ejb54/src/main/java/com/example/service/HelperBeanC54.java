package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC54 {

    @EJB
    private HelperBeanB54 helperBeanB54;

    public String identify() {
        return "HelperBeanC54";
    }
}
