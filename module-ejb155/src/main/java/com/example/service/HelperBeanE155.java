package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE155 {

    @EJB
    private HelperBeanD155 helperBeanD155;

    public String identify() {
        return "HelperBeanE155";
    }
}
