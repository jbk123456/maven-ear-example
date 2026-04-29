package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF137 {

    @EJB
    private HelperBeanE137 helperBeanE137;

    public String identify() {
        return "HelperBeanF137";
    }
}
