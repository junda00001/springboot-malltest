package com.junda.springbootmall.dto;

import jakarta.validation.constraints.NotNull;

public class BuyItem {

    @NotNull
    private Integer productId;

    @NotNull
    private Integer quantity;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer producrId) {
        this.productId = producrId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
