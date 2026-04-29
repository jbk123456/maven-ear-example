package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC93 {

    @EJB
    private HelperBeanB93 helperBeanB93;

    public String identify() {
        return "HelperBeanC93";
    }
}
