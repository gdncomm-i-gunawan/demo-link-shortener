package com.example.demo_link_shortener.service;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
@Lazy
public class InMemoryIdGeneratorService implements IdGeneratorService {

  private final AtomicLong atomicLong;

  public InMemoryIdGeneratorService(long seed) {
    this.atomicLong = new AtomicLong(seed);
  }

  @Override
  public long generateId() {
    return atomicLong.incrementAndGet();
  }
}
