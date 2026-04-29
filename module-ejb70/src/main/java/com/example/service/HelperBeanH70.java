package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH70 {

    @EJB
    private HelperBeanG70 helperBeanG70;

    public String identify() {
        return "HelperBeanH70";
    }
}
