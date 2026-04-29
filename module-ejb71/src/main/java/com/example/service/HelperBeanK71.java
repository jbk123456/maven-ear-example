package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK71 {

    @EJB
    private HelperBeanJ71 helperBeanJ71;

    public String identify() {
        return "HelperBeanK71";
    }
}
