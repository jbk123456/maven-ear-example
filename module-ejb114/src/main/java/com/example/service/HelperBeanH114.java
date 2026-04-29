package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH114 {

    @EJB
    private HelperBeanG114 helperBeanG114;

    public String identify() {
        return "HelperBeanH114";
    }
}
