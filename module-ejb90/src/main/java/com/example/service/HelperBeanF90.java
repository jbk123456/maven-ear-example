package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF90 {

    @EJB
    private HelperBeanE90 helperBeanE90;

    public String identify() {
        return "HelperBeanF90";
    }
}
