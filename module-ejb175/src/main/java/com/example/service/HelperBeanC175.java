package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC175 {

    @EJB
    private HelperBeanB175 helperBeanB175;

    public String identify() {
        return "HelperBeanC175";
    }
}
