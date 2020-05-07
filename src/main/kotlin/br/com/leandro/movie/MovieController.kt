package br.com.leandro.movie

import io.smallrye.mutiny.Multi
import io.smallrye.mutiny.Uni
import org.jboss.resteasy.annotations.jaxrs.PathParam
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Produces(MediaType.APPLICATION_JSON)
@Path("/movies")
class MovieController(private var movieService: MovieService){

    @GET
    fun get(): Multi<Movie> {
        return movieService.get()
    }

    @GET
    @Path("/{id}")
    fun get(@PathParam id: Long): Uni<Movie> {
        return movieService.get(id)
    }

    @POST
    fun post(entity: Movie): Uni<Movie> {
        return movieService.post(entity)
    }

    @DELETE
    @Path("/{id}")
    fun delete(@PathParam id: Long): Uni<Unit> {
        return movieService.delete(id)
    }
}