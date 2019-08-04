package com.hci.test.hciapp.response;

public class Module {

    private String moduleName;
    private Integer moduleOrder;

    public Module(String moduleName, Integer moduleOrder) {
        this.moduleName = moduleName;
        this.moduleOrder = moduleOrder;
    }

    public Integer getModuleOrder() {
        return moduleOrder;
    }

    public void setModuleOrder(Integer moduleOrder) {
        this.moduleOrder = moduleOrder;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
}
