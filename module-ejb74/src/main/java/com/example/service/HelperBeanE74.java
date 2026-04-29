package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE74 {

    @EJB
    private HelperBeanD74 helperBeanD74;

    public String identify() {
        return "HelperBeanE74";
    }
}
