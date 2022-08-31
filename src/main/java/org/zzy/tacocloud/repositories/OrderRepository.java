package org.zzy.tacocloud.repositories;

import org.zzy.tacocloud.domain.TacoOrder;

public interface OrderRepository {
	TacoOrder save(TacoOrder order);
}
