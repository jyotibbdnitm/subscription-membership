package com.membership.subscriptionmembership.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum MembershipType {
    MONTHLY, QUARTERLY, YEARLY;

    @JsonCreator
    public static MembershipType fromString(String key) {
        return key == null ? null : MembershipType.valueOf(key.toUpperCase());
    }

    @JsonValue
    public String toValue() {
        return this.name();
    }
}
