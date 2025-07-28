package com.membership.subscriptionmembership.entities;

import com.membership.subscriptionmembership.enums.MembershipTier;
import com.membership.subscriptionmembership.enums.MembershipType;
import jakarta.persistence.*;

@Entity
public class MembershipPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private MembershipType name;
    private MembershipTier tier;
    public MembershipPlan() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MembershipType getName() {
        return name;
    }

    public void setName(MembershipType name) {
        this.name = name;
    }

    public MembershipTier getTier() {
        return tier;
    }

    public void setTier(MembershipTier tier) {
        this.tier = tier;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MembershipPlan(Long id, MembershipType name, MembershipTier tier, double price) {
        this.id = id;
        this.name = name;
        this.tier = tier;
        this.price = price;
    }

    private double price;
}
