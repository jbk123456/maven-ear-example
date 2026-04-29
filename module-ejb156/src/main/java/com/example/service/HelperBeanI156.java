package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI156 {

    @EJB
    private HelperBeanH156 helperBeanH156;

    public String identify() {
        return "HelperBeanI156";
    }
}
