package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG175 {

    @EJB
    private HelperBeanF175 helperBeanF175;

    public String identify() {
        return "HelperBeanG175";
    }
}
