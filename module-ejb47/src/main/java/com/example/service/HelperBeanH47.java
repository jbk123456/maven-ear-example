package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH47 {

    @EJB
    private HelperBeanG47 helperBeanG47;

    public String identify() {
        return "HelperBeanH47";
    }
}
