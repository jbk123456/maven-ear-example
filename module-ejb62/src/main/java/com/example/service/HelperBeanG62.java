package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG62 {

    @EJB
    private HelperBeanF62 helperBeanF62;

    public String identify() {
        return "HelperBeanG62";
    }
}
