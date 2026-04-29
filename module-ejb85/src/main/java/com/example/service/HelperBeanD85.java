package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD85 {

    @EJB
    private HelperBeanC85 helperBeanC85;

    public String identify() {
        return "HelperBeanD85";
    }
}
