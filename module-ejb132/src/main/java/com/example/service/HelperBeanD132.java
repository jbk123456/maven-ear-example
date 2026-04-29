package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD132 {

    @EJB
    private HelperBeanC132 helperBeanC132;

    public String identify() {
        return "HelperBeanD132";
    }
}
