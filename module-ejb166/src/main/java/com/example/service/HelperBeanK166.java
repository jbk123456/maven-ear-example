package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK166 {

    @EJB
    private HelperBeanJ166 helperBeanJ166;

    public String identify() {
        return "HelperBeanK166";
    }
}
