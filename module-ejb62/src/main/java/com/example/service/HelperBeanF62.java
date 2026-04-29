package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF62 {

    @EJB
    private HelperBeanE62 helperBeanE62;

    public String identify() {
        return "HelperBeanF62";
    }
}
