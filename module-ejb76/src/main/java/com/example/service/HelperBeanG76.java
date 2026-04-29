package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG76 {

    @EJB
    private HelperBeanF76 helperBeanF76;

    public String identify() {
        return "HelperBeanG76";
    }
}
