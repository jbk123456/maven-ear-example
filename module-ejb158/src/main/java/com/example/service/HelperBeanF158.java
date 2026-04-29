package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF158 {

    @EJB
    private HelperBeanE158 helperBeanE158;

    public String identify() {
        return "HelperBeanF158";
    }
}
