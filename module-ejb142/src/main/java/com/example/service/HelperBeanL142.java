package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL142 {

    @EJB
    private HelperBeanK142 helperBeanK142;

    public String identify() {
        return "HelperBeanL142";
    }
}
