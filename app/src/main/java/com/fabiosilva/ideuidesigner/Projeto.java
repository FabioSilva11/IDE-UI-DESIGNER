package com.fabiosilva.ideuidesigner;

public class Project {
    private String version;
    private String name;
    private String releaseDate;
    private String creationDate;

    // Constructor that initializes all fields
    public Project(String version, String name, String releaseDate, String creationDate) {
        this.version = version;
        this.name = name;
        this.releaseDate = releaseDate;
        this.creationDate = creationDate;
    }

    // Getter methods for all fields
    public String getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getCreationDate() {
        return creationDate;
    }
}
