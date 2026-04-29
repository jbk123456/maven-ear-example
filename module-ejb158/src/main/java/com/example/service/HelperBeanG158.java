package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG158 {

    @EJB
    private HelperBeanF158 helperBeanF158;

    public String identify() {
        return "HelperBeanG158";
    }
}
