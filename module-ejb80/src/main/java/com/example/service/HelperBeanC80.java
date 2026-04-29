package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC80 {

    @EJB
    private HelperBeanB80 helperBeanB80;

    public String identify() {
        return "HelperBeanC80";
    }
}
