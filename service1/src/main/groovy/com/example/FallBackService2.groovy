package com.example;

import com.example.domain.Book;
import io.micronaut.retry.annotation.Fallback;
import io.micronaut.retry.annotation.Recoverable;
import io.reactivex.Flowable;
import java.util.ArrayList;

@Fallback
@Recoverable
public class FallBackService2 implements Service2Client{
    @Override
    public Flowable<ArrayList<Book>> findBooks() {
        return Flowable.just(new ArrayList<>());
    }
}