package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK115 {

    @EJB
    private HelperBeanJ115 helperBeanJ115;

    public String identify() {
        return "HelperBeanK115";
    }
}
