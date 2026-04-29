package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG79 {

    @EJB
    private HelperBeanF79 helperBeanF79;

    public String identify() {
        return "HelperBeanG79";
    }
}
