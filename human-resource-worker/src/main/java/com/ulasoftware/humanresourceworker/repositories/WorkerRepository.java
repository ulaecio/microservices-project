package com.ulasoftware.humanresourceworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulasoftware.humanresourceworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
