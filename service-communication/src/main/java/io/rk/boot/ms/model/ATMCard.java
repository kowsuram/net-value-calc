package io.rk.boot.ms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class ATMCard implements Serializable {
	private String atmNumber;
	private String customerName;
	private int cvv;
	private String validUpto;
	private String pin;

}
