package com.membership.subscriptionmembership.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.membership.subscriptionmembership.enums.MembershipTier;
import com.membership.subscriptionmembership.enums.MembershipType;

public class SubscriptionRequest {
    @JsonProperty("type")
    private MembershipType type;

    @JsonProperty("tier")
    private MembershipTier tier;



    public MembershipType getType() {
        return type;
    }

    public void setType(MembershipType type) {
        this.type = type;
    }

    public MembershipTier getTier() {
        return tier;
    }

    public void setTier(MembershipTier tier) {
        this.tier = tier;
    }

    public SubscriptionRequest() {
    }

    public SubscriptionRequest(MembershipType type, MembershipTier tier) {
        this.type = type;
        this.tier = tier;
    }
}
