package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG74 {

    @EJB
    private HelperBeanF74 helperBeanF74;

    public String identify() {
        return "HelperBeanG74";
    }
}
