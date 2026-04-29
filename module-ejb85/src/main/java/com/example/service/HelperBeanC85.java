package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC85 {

    @EJB
    private HelperBeanB85 helperBeanB85;

    public String identify() {
        return "HelperBeanC85";
    }
}
