package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB153 {

    @EJB
    private HelperBeanA153 helperBeanA153;

    public String identify() {
        return "HelperBeanB153";
    }
}
