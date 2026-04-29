package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI103 {

    @EJB
    private HelperBeanH103 helperBeanH103;

    public String identify() {
        return "HelperBeanI103";
    }
}
