package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF34 {

    @EJB
    private HelperBeanE34 helperBeanE34;

    public String identify() {
        return "HelperBeanF34";
    }
}
