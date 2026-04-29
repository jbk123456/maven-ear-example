package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC72 {

    @EJB
    private HelperBeanB72 helperBeanB72;

    public String identify() {
        return "HelperBeanC72";
    }
}
