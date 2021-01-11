package io.rk.boot.ms.service;

import io.rk.boot.ms.model.ATMCard;
import io.rk.boot.ms.model.Transaction;

public interface ATMService {

	public void readCard(ATMCard atmCard);
	public void transact(ATMCard atmCard, Transaction transaction);
	public void removeCard(ATMCard atmCard);
}
