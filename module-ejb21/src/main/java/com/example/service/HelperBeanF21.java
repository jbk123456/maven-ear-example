package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF21 {

    @EJB
    private HelperBeanE21 helperBeanE21;

    public String identify() {
        return "HelperBeanF21";
    }
}
