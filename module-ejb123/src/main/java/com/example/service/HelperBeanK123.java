package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK123 {

    @EJB
    private HelperBeanJ123 helperBeanJ123;

    public String identify() {
        return "HelperBeanK123";
    }
}
