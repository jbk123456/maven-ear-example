package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL109 {

    @EJB
    private HelperBeanK109 helperBeanK109;

    public String identify() {
        return "HelperBeanL109";
    }
}
