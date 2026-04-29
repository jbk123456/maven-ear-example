package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH14 {

    @EJB
    private HelperBeanG14 helperBeanG14;

    public String identify() {
        return "HelperBeanH14";
    }
}
