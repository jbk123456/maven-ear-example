package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC120 {

    @EJB
    private HelperBeanB120 helperBeanB120;

    public String identify() {
        return "HelperBeanC120";
    }
}
