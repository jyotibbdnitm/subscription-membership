package com.membership.subscriptionmembership.enums;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum MembershipTier {
    SILVER, GOLD, PLATINUM;

    @JsonCreator
    public static MembershipTier fromString(String key) {
        return key == null ? null : MembershipTier.valueOf(key.toUpperCase());
    }

    @JsonValue
    public String toValue() {
        return this.name();
    }
}

