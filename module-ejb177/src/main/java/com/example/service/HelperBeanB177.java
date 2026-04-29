package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB177 {

    @EJB
    private HelperBeanA177 helperBeanA177;

    public String identify() {
        return "HelperBeanB177";
    }
}
