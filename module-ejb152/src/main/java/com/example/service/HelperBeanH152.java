package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH152 {

    @EJB
    private HelperBeanG152 helperBeanG152;

    public String identify() {
        return "HelperBeanH152";
    }
}
