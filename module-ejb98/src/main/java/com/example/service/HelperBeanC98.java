package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC98 {

    @EJB
    private HelperBeanB98 helperBeanB98;

    public String identify() {
        return "HelperBeanC98";
    }
}
