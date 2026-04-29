package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC117 {

    @EJB
    private HelperBeanB117 helperBeanB117;

    public String identify() {
        return "HelperBeanC117";
    }
}
