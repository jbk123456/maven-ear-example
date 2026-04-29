package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE66 {

    @EJB
    private HelperBeanD66 helperBeanD66;

    public String identify() {
        return "HelperBeanE66";
    }
}
