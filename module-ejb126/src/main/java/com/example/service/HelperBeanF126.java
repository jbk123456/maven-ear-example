package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF126 {

    @EJB
    private HelperBeanE126 helperBeanE126;

    public String identify() {
        return "HelperBeanF126";
    }
}
