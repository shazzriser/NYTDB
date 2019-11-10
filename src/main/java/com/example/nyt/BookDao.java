package com.example.nyt;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.nyt.model.Book;

import java.util.List;

@Dao
public interface BookDao {
    @Query("SELECT * FROM bestSellers ")
    List<Book>getBook();

    @Query("SELECT * FROM bestSellers WHERE isbn = :id ")
    Book getBookById(long id );

    @Insert
    void insert (Book book);

//    @Insert
//    void insertAll(Book... books);
}
