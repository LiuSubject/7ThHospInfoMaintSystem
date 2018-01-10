package com.system.po;

public class MaterialApplicationType {
    private Integer id;

    private String materialName;

    private String materialCode;

    private String materialCode2;

    private String materialCode3;

    private String materialNote;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName == null ? null : materialName.trim();
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode == null ? null : materialCode.trim();
    }

    public String getMaterialCode2() {
        return materialCode2;
    }

    public void setMaterialCode2(String materialCode2) {
        this.materialCode2 = materialCode2 == null ? null : materialCode2.trim();
    }

    public String getMaterialCode3() {
        return materialCode3;
    }

    public void setMaterialCode3(String materialCode3) {
        this.materialCode3 = materialCode3 == null ? null : materialCode3.trim();
    }

    public String getMaterialNote() {
        return materialNote;
    }

    public void setMaterialNote(String materialNote) {
        this.materialNote = materialNote == null ? null : materialNote.trim();
    }
}