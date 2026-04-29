package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI22 {

    @EJB
    private HelperBeanH22 helperBeanH22;

    public String identify() {
        return "HelperBeanI22";
    }
}
