package com.membership.subscriptionmembership.dto;

import com.membership.subscriptionmembership.entities.Membership;

import java.time.LocalDate;

public class MembershipStatusDTO {
    private Long id;
    private String type;
    private String tier;
    private LocalDate startDate;
    private LocalDate expiryDate;
    private boolean active;
    private String userName;
    private String userEmail;

    public MembershipStatusDTO() {
    }

    // Constructors
    public MembershipStatusDTO(Membership membership) {
        this.id = membership.getId();
        this.type = String.valueOf(membership.getType());
        this.tier = String.valueOf(membership.getTier());
        this.startDate = membership.getStartDate();
        this.expiryDate = membership.getExpiryDate();
        this.active = membership.isActive();
        this.userName = membership.getUser().getName();
        this.userEmail = membership.getUser().getEmail();
    }

    // Getters and setters (optional if using Lombok)
}

