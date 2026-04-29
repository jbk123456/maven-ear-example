package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE34 {

    @EJB
    private HelperBeanD34 helperBeanD34;

    public String identify() {
        return "HelperBeanE34";
    }
}
