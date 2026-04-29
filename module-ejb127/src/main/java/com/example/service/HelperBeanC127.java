package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC127 {

    @EJB
    private HelperBeanB127 helperBeanB127;

    public String identify() {
        return "HelperBeanC127";
    }
}
