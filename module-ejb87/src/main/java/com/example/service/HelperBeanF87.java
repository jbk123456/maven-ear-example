package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF87 {

    @EJB
    private HelperBeanE87 helperBeanE87;

    public String identify() {
        return "HelperBeanF87";
    }
}
