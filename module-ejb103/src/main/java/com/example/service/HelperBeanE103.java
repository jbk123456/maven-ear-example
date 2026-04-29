package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE103 {

    @EJB
    private HelperBeanD103 helperBeanD103;

    public String identify() {
        return "HelperBeanE103";
    }
}
