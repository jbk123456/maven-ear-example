package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC40 {

    @EJB
    private HelperBeanB40 helperBeanB40;

    public String identify() {
        return "HelperBeanC40";
    }
}
