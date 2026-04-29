package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF82 {

    @EJB
    private HelperBeanE82 helperBeanE82;

    public String identify() {
        return "HelperBeanF82";
    }
}
