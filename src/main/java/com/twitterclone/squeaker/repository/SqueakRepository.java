package com.twitterclone.squeaker.repository;

import com.twitterclone.squeaker.repository.entity.Squeak;
import com.twitterclone.squeaker.repository.entity.Squeaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SqueakRepository extends JpaRepository<Squeak, Long> {
    List<Squeak> findAllBySqueakerOrderByIdDesc(Optional<Squeaker> squeaker);

    Squeak findSqueakById(Long id);
    List<Squeak> findAllByOrderByIdDesc();
}
