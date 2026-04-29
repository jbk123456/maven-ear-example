package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE162 {

    @EJB
    private HelperBeanD162 helperBeanD162;

    public String identify() {
        return "HelperBeanE162";
    }
}
