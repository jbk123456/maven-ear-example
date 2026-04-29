package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH79 {

    @EJB
    private HelperBeanG79 helperBeanG79;

    public String identify() {
        return "HelperBeanH79";
    }
}
