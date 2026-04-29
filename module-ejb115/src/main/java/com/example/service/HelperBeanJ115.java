package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ115 {

    @EJB
    private HelperBeanI115 helperBeanI115;

    public String identify() {
        return "HelperBeanJ115";
    }
}
