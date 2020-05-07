package br.com.leandro.movie

import io.smallrye.mutiny.Multi
import io.smallrye.mutiny.Uni
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class MovieService(private var movieRepository: MovieRepository) {

    fun get(id: Long): Uni<Movie> {
        return Uni.createFrom().item { movieRepository.getOne(id) }
    }

    fun get(): Multi<Movie> {
        return Multi.createFrom().items { movieRepository.findAll().stream() }
    }

    fun post(entity: Movie): Uni<Movie> {
        return Uni.createFrom().item { movieRepository.save(entity) }
    }

    fun delete(id: Long): Uni<Unit> {
        return Uni.createFrom().item { movieRepository.deleteById(id) }
    }
}