package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD21 {

    @EJB
    private HelperBeanC21 helperBeanC21;

    public String identify() {
        return "HelperBeanD21";
    }
}
