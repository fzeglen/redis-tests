package com.worldremit.redistests.services;

import com.worldremit.redistests.data.IdHolder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;

@RequiredArgsConstructor
public class BaseTemplateService<T extends IdHolder<ID>, ID> {
    private final RedisTemplate redisTemplate;

    private final String KEY;


    public Object findById(ID id) {
        return redisTemplate.opsForHash().get(KEY, id);
    }


    public Object findAll() {
        return redisTemplate.opsForHash().entries(KEY);
    }


    public Object save(T object) {
        return redisTemplate.opsForHash().putIfAbsent(KEY, object.getId(), object);
    }


    public void delete(ID id) {
        redisTemplate.opsForHash().delete(KEY, findById(id));
    }
}
