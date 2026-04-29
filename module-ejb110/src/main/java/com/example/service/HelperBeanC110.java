package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC110 {

    @EJB
    private HelperBeanB110 helperBeanB110;

    public String identify() {
        return "HelperBeanC110";
    }
}
