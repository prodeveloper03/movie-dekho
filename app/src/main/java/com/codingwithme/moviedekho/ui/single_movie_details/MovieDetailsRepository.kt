package com.codingwithme.moviedekho.ui.single_movie_details

import androidx.lifecycle.LiveData
import com.codingwithme.moviedekho.data.api.TheMovieDBInterface
import com.codingwithme.moviedekho.data.repository.MovieDetailsNetworkDataSource
import com.codingwithme.moviedekho.data.repository.NetworkState
import com.codingwithme.moviedekho.data.vo.MovieDetails
import io.reactivex.disposables.CompositeDisposable

class MovieDetailsRepository(private val apiService: TheMovieDBInterface) {

    lateinit var movieDetailsNetworkDataSource:MovieDetailsNetworkDataSource

    fun fetchSingleMovieDetails(compositeDisposable: CompositeDisposable,movieId:Int):LiveData<MovieDetails>{

        movieDetailsNetworkDataSource= MovieDetailsNetworkDataSource(apiService,compositeDisposable)
        movieDetailsNetworkDataSource.fetchMovieDetails(movieId)

        return movieDetailsNetworkDataSource.downloadedMoviewDetailsResponse
    }

    fun getMovieDetailsNetworkState():LiveData<NetworkState>{
        return movieDetailsNetworkDataSource.networkState
    }
}