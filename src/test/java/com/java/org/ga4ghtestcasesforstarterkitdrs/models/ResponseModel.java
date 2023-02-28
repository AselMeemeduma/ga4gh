package com.java.org.ga4ghtestcasesforstarterkitdrs.models;

import java.util.List;

public class ResponseModel {
    private String id;
    private String description;
    private String created_time;
    private String mime_type;
    private String name;
    private int size;
    private String updated_time;
    private String version;
    private List<String> aliases;
    private List <ChecksumModel> checksums;
    private String self_uri;
    private List<AccessMethodModel>  access_methods;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public String getMime_type() {
        return mime_type;
    }

    public void setMime_type(String mime_type) {
        this.mime_type = mime_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(String updated_time) {
        this.updated_time = updated_time;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public List<ChecksumModel> getChecksums() {
        return checksums;
    }

    public void setChecksums(List<ChecksumModel> checksums) {
        this.checksums = checksums;
    }

    public String getSelf_uri() {
        return self_uri;
    }

    public void setSelf_uri(String self_uri) {
        this.self_uri = self_uri;
    }

    public List<AccessMethodModel> getAccess_methods() {
        return access_methods;
    }

    public void setAccess_methods(List<AccessMethodModel> access_methods) {
        this.access_methods = access_methods;
    }
}
