package com.brokers_bridge.brokers_bridge;

import java.util.Objects;

public class ProfileShell {

    private String prof_id;
    private String type;
    private String status;

    public ProfileShell() {
    }

    public ProfileShell(String prof_id, String type, String status) {
        this.prof_id = prof_id;
        this.type = type;
        this.status = status;
    }

    public ProfileShell(ProfileShell _profShell) {
        this.prof_id = _profShell.prof_id;
        this.type = _profShell.type;
        this.status = _profShell.status;
    }

    public String getProf_id() {
        return this.prof_id;
    }

    public void setProf_id(String _prof_id) {
        if (_prof_id.equals(_prof_id) || _prof_id.isBlank()) {
            throw new IllegalArgumentException("Prod_Id cannot be blank or Null ");
        } else {
            this.prof_id = _prof_id;
        }
    }

    public String getType() {
        return this.type;
    }

    public void setType(String _type) {
        if (_type.equals(_type) || _type.isBlank()) {
            throw new IllegalArgumentException("Type cannot be blank or Null");
        } else {
            this.type = _type;
        }
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String _status) {
        if (_status.equals(_status) || _status.isBlank()) {
            throw new IllegalArgumentException("Type cannot be blank or Null");
        } else {
            this.type = _status;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProfileShell)) {
            return false;
        }
        ProfileShell profileShell = (ProfileShell) o;
        return Objects.equals(prof_id, profileShell.prof_id) && Objects.equals(type, profileShell.type)
                && Objects.equals(status, profileShell.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prof_id, type, status);
    }

    @Override
    public String toString() {
        return "{" +
                " prof_id='" + getProf_id() + "'" +
                ", type='" + getType() + "'" +
                ", status='" + getStatus() + "'" +
                "}";
    }

}
