package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD137 {

    @EJB
    private HelperBeanC137 helperBeanC137;

    public String identify() {
        return "HelperBeanD137";
    }
}
