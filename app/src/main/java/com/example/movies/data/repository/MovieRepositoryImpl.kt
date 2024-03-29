package com.example.movies.data.repository

import com.example.movies.data.source.local.FavoriteMoviesDataSource
import com.example.movies.data.source.local.TemporaryMoviesDataSource
import com.example.movies.data.source.network.MovieApi
import com.example.movies.data.source.network.dto.Items
import com.example.movies.data.source.network.dto.MovieInfoDto
import com.example.movies.data.source.network.dto.MoviesDto
import com.example.movies.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
  private val api: MovieApi,
  private val temporaryMoviesDataSource: TemporaryMoviesDataSource,
  private val favoriteMoviesDataSource: FavoriteMoviesDataSource
) : MovieRepository {
  override fun getMoviesStream(): Flow<List<MoviesDto>> {
    TODO("Not yet implemented")
  }

  override fun getMovieStream(movieId: Int): Flow<Items> {
    TODO("Not yet implemented")
  }

  override suspend fun insert(items: Items) {
    TODO("Not yet implemented")
  }

  override suspend fun delete(items: Items) {

  }

  override suspend fun getMovies(): Response<MoviesDto> {
    return api.getTopMovies()
  }

  override suspend fun getMovieById(id: Int): Response<MovieInfoDto> {
    return api.getMovieById(id)
  }
}