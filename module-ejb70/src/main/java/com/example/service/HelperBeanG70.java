package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG70 {

    @EJB
    private HelperBeanF70 helperBeanF70;

    public String identify() {
        return "HelperBeanG70";
    }
}
