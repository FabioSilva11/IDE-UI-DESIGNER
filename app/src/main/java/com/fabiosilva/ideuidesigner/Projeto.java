package com.fabiosilva.ideuidesigner;

public class Projeto {
    String version = "", name = "", release = "", data = "";

    public Projeto(String version, String name, String release, String data) {
        this.version = version;
        this.name = name;
        this.release = release;
        this.data = data;
    }

    public String getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }

    public String getRelease() {
        return release;
    }

    public String getData() {
        return data;
    }
}
