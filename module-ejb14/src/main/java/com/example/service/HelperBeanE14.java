package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE14 {

    @EJB
    private HelperBeanD14 helperBeanD14;

    public String identify() {
        return "HelperBeanE14";
    }
}
