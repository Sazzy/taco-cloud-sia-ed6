package org.zzy.tacocloud.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.zzy.tacocloud.domain.TacoOrder;
import org.zzy.tacocloud.repositories.OrderRepository;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("tacoOrder")
public class OrderController {
	private final OrderRepository orderRepository;

	public OrderController(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	@GetMapping("/current")
	public String orderForm() {
		return "orderForm";
	}

	@PostMapping
	public String processOrder(@Valid TacoOrder order,
							   Errors errors,
							   SessionStatus sessionStatus) {
		if (errors.hasErrors()) {
			return "orderForm";
		}

		log.info("Order submitted: {}", order);
		orderRepository.save(order);
		sessionStatus.setComplete();

		return "redirect:/";
	}
}
