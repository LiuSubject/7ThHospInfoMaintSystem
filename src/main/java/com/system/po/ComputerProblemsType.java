package com.system.po;

public class ComputerProblemsType {
    private Integer id;

    private String typeName;

    private String typeCode;

    private String typeCode2;

    private String typeCode3;

    private String typeNote;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    public String getTypeCode2() {
        return typeCode2;
    }

    public void setTypeCode2(String typeCode2) {
        this.typeCode2 = typeCode2 == null ? null : typeCode2.trim();
    }

    public String getTypeCode3() {
        return typeCode3;
    }

    public void setTypeCode3(String typeCode3) {
        this.typeCode3 = typeCode3 == null ? null : typeCode3.trim();
    }

    public String getTypeNote() {
        return typeNote;
    }

    public void setTypeNote(String typeNote) {
        this.typeNote = typeNote == null ? null : typeNote.trim();
    }
}