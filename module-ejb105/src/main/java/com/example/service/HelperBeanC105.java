package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC105 {

    @EJB
    private HelperBeanB105 helperBeanB105;

    public String identify() {
        return "HelperBeanC105";
    }
}
