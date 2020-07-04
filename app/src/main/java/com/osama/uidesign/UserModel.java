package com.osama.uidesign;

public class UserModel {
    String name;
    String message;

    public int getImagePath() {
        return imagePath;
    }

    public void setImagePath(int imagePath) {
        this.imagePath = imagePath;
    }

    int imagePath;

    public UserModel(String name, String message, int imagePath) {
        this.name = name;
        this.message = message;
        this.imagePath = imagePath;
    }

    public UserModel(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
