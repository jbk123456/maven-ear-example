package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH169 {

    @EJB
    private HelperBeanG169 helperBeanG169;

    public String identify() {
        return "HelperBeanH169";
    }
}
