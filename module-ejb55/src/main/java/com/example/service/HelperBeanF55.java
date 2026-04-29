package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF55 {

    @EJB
    private HelperBeanE55 helperBeanE55;

    public String identify() {
        return "HelperBeanF55";
    }
}
