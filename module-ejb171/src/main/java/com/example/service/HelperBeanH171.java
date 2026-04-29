package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH171 {

    @EJB
    private HelperBeanG171 helperBeanG171;

    public String identify() {
        return "HelperBeanH171";
    }
}
