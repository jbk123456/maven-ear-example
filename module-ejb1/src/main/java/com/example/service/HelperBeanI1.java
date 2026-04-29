package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI1 {

    @EJB
    private HelperBeanH1 helperBeanH1;

    public String identify() {
        return "HelperBeanI1";
    }
}
