package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC9 {

    @EJB
    private HelperBeanB9 helperBeanB9;

    public String identify() {
        return "HelperBeanC9";
    }
}
