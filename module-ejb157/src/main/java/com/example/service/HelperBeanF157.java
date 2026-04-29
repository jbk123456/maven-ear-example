package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF157 {

    @EJB
    private HelperBeanE157 helperBeanE157;

    public String identify() {
        return "HelperBeanF157";
    }
}
