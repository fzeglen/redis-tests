package com.worldremit.redistests.repositories;

import com.worldremit.redistests.data.SamplesClass;
import org.springframework.data.repository.CrudRepository;

public interface SampleClassRepository extends CrudRepository<SamplesClass, String> {
}
