package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC81 {

    @EJB
    private HelperBeanB81 helperBeanB81;

    public String identify() {
        return "HelperBeanC81";
    }
}
