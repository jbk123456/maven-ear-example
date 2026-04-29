package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE46 {

    @EJB
    private HelperBeanD46 helperBeanD46;

    public String identify() {
        return "HelperBeanE46";
    }
}
