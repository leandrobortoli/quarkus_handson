package br.com.leandro.movie

import javax.persistence.*

@Entity(name = "MOVIE")
data class Movie(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        var title: String? = null,
        var description: String? = null,
        @Column(name = "IMDB_RATING")
        var imdbRating: Double? = 0.0
)