package com.zensar.springboot.endpoints;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class CustomInfoContributor implements InfoContributor {

	@Override
	public void contribute(Builder builder) {
		Map<String, Object> productDetails = new HashMap<String, Object>();
		productDetails.put("CreatedBy", "Anil Ghumare");
		productDetails.put("ModifiedOn", "22July2022");

		builder.withDetail("Product", productDetails);

	}

}
