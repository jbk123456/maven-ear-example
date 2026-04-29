package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB127 {

    @EJB
    private HelperBeanA127 helperBeanA127;

    public String identify() {
        return "HelperBeanB127";
    }
}
