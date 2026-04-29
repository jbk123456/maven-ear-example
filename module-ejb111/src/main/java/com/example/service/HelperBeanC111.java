package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC111 {

    @EJB
    private HelperBeanB111 helperBeanB111;

    public String identify() {
        return "HelperBeanC111";
    }
}
