package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC176 {

    @EJB
    private HelperBeanB176 helperBeanB176;

    public String identify() {
        return "HelperBeanC176";
    }
}
