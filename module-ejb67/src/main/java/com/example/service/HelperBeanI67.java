package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI67 {

    @EJB
    private HelperBeanH67 helperBeanH67;

    public String identify() {
        return "HelperBeanI67";
    }
}
