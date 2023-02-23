package com.valhallacore.dto.paypal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.valhallacore.Enum.Intent;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PayPalOrder {
    private Intent intent;
    @JsonProperty("purchase_units")
    private List<PurchaseUnit> purchaseUnits;
    @JsonProperty("application_context")
    private ApplicationContext applicationContext;
}
