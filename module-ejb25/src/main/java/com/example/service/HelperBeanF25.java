package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF25 {

    @EJB
    private HelperBeanE25 helperBeanE25;

    public String identify() {
        return "HelperBeanF25";
    }
}
