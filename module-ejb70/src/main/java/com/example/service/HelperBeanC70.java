package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC70 {

    @EJB
    private HelperBeanB70 helperBeanB70;

    public String identify() {
        return "HelperBeanC70";
    }
}
