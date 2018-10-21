package com.oukele.model;

public class UserGroup {
    private String userGroupId;

    private String userGroupName;

    private String userGroupRemarks;

    public String getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId == null ? null : userGroupId.trim();
    }

    public String getUserGroupName() {
        return userGroupName;
    }

    public void setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName == null ? null : userGroupName.trim();
    }

    public String getUserGroupRemarks() {
        return userGroupRemarks;
    }

    public void setUserGroupRemarks(String userGroupRemarks) {
        this.userGroupRemarks = userGroupRemarks == null ? null : userGroupRemarks.trim();
    }
}