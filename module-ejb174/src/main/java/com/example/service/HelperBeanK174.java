package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK174 {

    @EJB
    private HelperBeanJ174 helperBeanJ174;

    public String identify() {
        return "HelperBeanK174";
    }
}
