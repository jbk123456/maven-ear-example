package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI152 {

    @EJB
    private HelperBeanH152 helperBeanH152;

    public String identify() {
        return "HelperBeanI152";
    }
}
