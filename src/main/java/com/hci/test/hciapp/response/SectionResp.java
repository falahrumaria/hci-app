package com.hci.test.hciapp.response;

import java.util.List;

public class SectionResp {

    private List<Module> modules;

    public SectionResp(List<Module> modules) {
        this.modules = modules;
    }

    public SectionResp() {
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }
}
