package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG55 {

    @EJB
    private HelperBeanF55 helperBeanF55;

    public String identify() {
        return "HelperBeanG55";
    }
}
