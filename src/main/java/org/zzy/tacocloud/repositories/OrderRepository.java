package org.zzy.tacocloud.repositories;

import org.springframework.data.repository.CrudRepository;
import org.zzy.tacocloud.domain.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
