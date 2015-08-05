package com.ghca.cxf.server;

import com.ghca.cxf.service.IVMService;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by lvg on 2014/8/28.
 */
@WebService
public class IVMServiceImpl implements IVMService {
    @Override
    @WebMethod
    public void startProcess(String key, String params) {

    }

    @Override
    @WebMethod
    public String getProcessDifine() {
        return "ddddddddd";
    }
}
