package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB72 {

    @EJB
    private HelperBeanA72 helperBeanA72;

    public String identify() {
        return "HelperBeanB72";
    }
}
