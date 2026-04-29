package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG154 {

    @EJB
    private HelperBeanF154 helperBeanF154;

    public String identify() {
        return "HelperBeanG154";
    }
}
