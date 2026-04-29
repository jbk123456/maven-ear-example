package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ152 {

    @EJB
    private HelperBeanI152 helperBeanI152;

    public String identify() {
        return "HelperBeanJ152";
    }
}
