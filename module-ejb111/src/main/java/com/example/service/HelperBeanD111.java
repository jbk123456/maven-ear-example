package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD111 {

    @EJB
    private HelperBeanC111 helperBeanC111;

    public String identify() {
        return "HelperBeanD111";
    }
}
