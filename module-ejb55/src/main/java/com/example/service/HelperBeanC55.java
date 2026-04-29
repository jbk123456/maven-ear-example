package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC55 {

    @EJB
    private HelperBeanB55 helperBeanB55;

    public String identify() {
        return "HelperBeanC55";
    }
}
