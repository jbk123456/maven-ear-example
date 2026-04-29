package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD35 {

    @EJB
    private HelperBeanC35 helperBeanC35;

    public String identify() {
        return "HelperBeanD35";
    }
}
