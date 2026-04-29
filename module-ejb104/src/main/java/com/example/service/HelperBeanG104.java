package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG104 {

    @EJB
    private HelperBeanF104 helperBeanF104;

    public String identify() {
        return "HelperBeanG104";
    }
}
