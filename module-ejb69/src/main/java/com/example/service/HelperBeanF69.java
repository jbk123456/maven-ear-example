package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF69 {

    @EJB
    private HelperBeanE69 helperBeanE69;

    public String identify() {
        return "HelperBeanF69";
    }
}
