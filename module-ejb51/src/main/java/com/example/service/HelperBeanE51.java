package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE51 {

    @EJB
    private HelperBeanD51 helperBeanD51;

    public String identify() {
        return "HelperBeanE51";
    }
}
