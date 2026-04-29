package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI34 {

    @EJB
    private HelperBeanH34 helperBeanH34;

    public String identify() {
        return "HelperBeanI34";
    }
}
