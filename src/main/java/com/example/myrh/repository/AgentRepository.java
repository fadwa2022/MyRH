package com.example.myrh.repository;

import com.example.myrh.model.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository  extends JpaRepository<Agent, String> {
}
