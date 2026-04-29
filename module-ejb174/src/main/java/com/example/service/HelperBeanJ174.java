package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ174 {

    @EJB
    private HelperBeanI174 helperBeanI174;

    public String identify() {
        return "HelperBeanJ174";
    }
}
