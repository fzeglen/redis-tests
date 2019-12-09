package com.worldremit.redistests.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("sample")
@Data
@NoArgsConstructor
public class SamplesClass implements IdHolder<String> {

    @Id
    private String id;
    private String name;
}
