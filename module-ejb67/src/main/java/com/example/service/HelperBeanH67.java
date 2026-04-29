package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH67 {

    @EJB
    private HelperBeanG67 helperBeanG67;

    public String identify() {
        return "HelperBeanH67";
    }
}
