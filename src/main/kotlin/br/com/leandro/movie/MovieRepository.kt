package br.com.leandro.movie

import org.springframework.data.jpa.repository.JpaRepository

interface MovieRepository : JpaRepository<Movie, Long>