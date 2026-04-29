package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK142 {

    @EJB
    private HelperBeanJ142 helperBeanJ142;

    public String identify() {
        return "HelperBeanK142";
    }
}
