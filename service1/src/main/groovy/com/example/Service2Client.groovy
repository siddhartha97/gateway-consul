package com.example

import com.example.domain.Book
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.reactivex.Flowable
import io.micronaut.retry.annotation.CircuitBreaker

@Client(id = "service2")
@CircuitBreaker(delay = "5s", attempts = "1", multiplier = "2", reset = "100s")
interface Service2Client {
    @Get("/books")
    Flowable<ArrayList<Book>> findBooks();
}