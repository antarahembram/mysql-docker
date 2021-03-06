package com.stackroute.repository;

import com.stackroute.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

    @Query("from Movie where movieTitle=?1 ")
    public List<Movie> getMovieByName(String movieTitle);
}
