package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC76 {

    @EJB
    private HelperBeanB76 helperBeanB76;

    public String identify() {
        return "HelperBeanC76";
    }
}
