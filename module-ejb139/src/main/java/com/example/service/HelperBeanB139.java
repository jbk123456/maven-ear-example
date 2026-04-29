package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB139 {

    @EJB
    private HelperBeanA139 helperBeanA139;

    public String identify() {
        return "HelperBeanB139";
    }
}
