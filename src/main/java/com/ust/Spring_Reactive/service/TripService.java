package com.ust.Spring_Reactive.service;

import com.ust.Spring_Reactive.Repository.Triprepo;
import com.ust.Spring_Reactive.dto.Tripdto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Mono;

@Service
public class TripService {
    @Autowired
    private Triprepo Repo;



    public Mono<Tripdto> addTrip(Mono<Tripdto> tripdtomono)
    {
        return tripdtomono.map(AppUtlis::dtoToEntity),
                    .flatMap(repo::insert)
            .map(AppUtlis::entityToDto);
        
    }
}
