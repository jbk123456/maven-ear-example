package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB129 {

    @EJB
    private HelperBeanA129 helperBeanA129;

    public String identify() {
        return "HelperBeanB129";
    }
}
