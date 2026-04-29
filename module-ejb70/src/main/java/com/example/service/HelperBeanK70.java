package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK70 {

    @EJB
    private HelperBeanJ70 helperBeanJ70;

    public String identify() {
        return "HelperBeanK70";
    }
}
