package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE82 {

    @EJB
    private HelperBeanD82 helperBeanD82;

    public String identify() {
        return "HelperBeanE82";
    }
}
