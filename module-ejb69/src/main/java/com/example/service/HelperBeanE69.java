package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE69 {

    @EJB
    private HelperBeanD69 helperBeanD69;

    public String identify() {
        return "HelperBeanE69";
    }
}
