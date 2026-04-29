package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ74 {

    @EJB
    private HelperBeanI74 helperBeanI74;

    public String identify() {
        return "HelperBeanJ74";
    }
}
