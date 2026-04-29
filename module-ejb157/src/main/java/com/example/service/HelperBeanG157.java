package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG157 {

    @EJB
    private HelperBeanF157 helperBeanF157;

    public String identify() {
        return "HelperBeanG157";
    }
}
