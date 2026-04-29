package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD147 {

    @EJB
    private HelperBeanC147 helperBeanC147;

    public String identify() {
        return "HelperBeanD147";
    }
}
