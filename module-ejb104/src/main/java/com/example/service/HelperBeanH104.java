package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH104 {

    @EJB
    private HelperBeanG104 helperBeanG104;

    public String identify() {
        return "HelperBeanH104";
    }
}
