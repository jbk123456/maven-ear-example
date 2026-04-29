package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB90 {

    @EJB
    private HelperBeanA90 helperBeanA90;

    public String identify() {
        return "HelperBeanB90";
    }
}
