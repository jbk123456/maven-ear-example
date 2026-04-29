package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG66 {

    @EJB
    private HelperBeanF66 helperBeanF66;

    public String identify() {
        return "HelperBeanG66";
    }
}
