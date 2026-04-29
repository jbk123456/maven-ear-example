package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC52 {

    @EJB
    private HelperBeanB52 helperBeanB52;

    public String identify() {
        return "HelperBeanC52";
    }
}
