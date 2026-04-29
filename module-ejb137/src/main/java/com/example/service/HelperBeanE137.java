package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE137 {

    @EJB
    private HelperBeanD137 helperBeanD137;

    public String identify() {
        return "HelperBeanE137";
    }
}
