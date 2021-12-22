package com.example.finaltodoapp.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.finaltodoapp.model.ETodo;

import java.util.List;

@Dao

public interface TodoDAO {
    @Insert
    void insert(ETodo todo);

    @Delete
    void deleteById(ETodo todo);

    @Query("DELETE FROM todo_table")
    void deleteAll();

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void update(ETodo... todos);

    @Query("SELECT * FROM todo_table ORDER BY todo_date, priority desc")
    LiveData<List<ETodo>> getAllTodos();

    @Query("SELECT * FROM todo_table WHERe id=:id")
    ETodo getTODOById(int id);

    @Query("DELETE FROM todo_table WHERE Status='1'")
    void delete_completed();

}
