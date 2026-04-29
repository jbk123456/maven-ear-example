package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC160 {

    @EJB
    private HelperBeanB160 helperBeanB160;

    public String identify() {
        return "HelperBeanC160";
    }
}
