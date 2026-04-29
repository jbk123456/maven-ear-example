package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD105 {

    @EJB
    private HelperBeanC105 helperBeanC105;

    public String identify() {
        return "HelperBeanD105";
    }
}
