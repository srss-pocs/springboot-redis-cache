package com.example.redis.cache.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Product")
public class Product implements Serializable {
	private static final long serialVersionUID = -1239743723453535123L;
	@Id
	private int id;
	private String name;
	private int qty;
	private long price;
}
