package com.example.movies.presentation.movies_list

import com.example.movies.domain.model.Movies

data class MoviesListState(
  val isLoading: Boolean = false,
  val movies: Movies? = null,
  val error: String = ""
)