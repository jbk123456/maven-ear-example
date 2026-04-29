package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH150 {

    @EJB
    private HelperBeanG150 helperBeanG150;

    public String identify() {
        return "HelperBeanH150";
    }
}
