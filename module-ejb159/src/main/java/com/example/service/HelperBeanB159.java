package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB159 {

    @EJB
    private HelperBeanA159 helperBeanA159;

    public String identify() {
        return "HelperBeanB159";
    }
}
