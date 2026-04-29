package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB157 {

    @EJB
    private HelperBeanA157 helperBeanA157;

    public String identify() {
        return "HelperBeanB157";
    }
}
