package com.davee.elfangor.User;

public class UserObject {

    private String uId,
            name,
            phone;

    public UserObject(String uId, String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.uId = uId;
    }

    public String getuId() {
        return uId;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
