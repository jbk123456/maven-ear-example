package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC30 {

    @EJB
    private HelperBeanB30 helperBeanB30;

    public String identify() {
        return "HelperBeanC30";
    }
}
