package com.example.finaltodoapp.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;

import com.example.finaltodoapp.util.DateConverter;

import java.util.Date;

    @Entity(tableName = "todo_table")
    public class ETodo {
        @PrimaryKey(autoGenerate = true)

        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @NonNull
        @ColumnInfo(name = "Title")
        private String title;
        @ColumnInfo(name = "Description")
        private String description;
        @ColumnInfo(name = "TODO_date")
        @TypeConverters({DateConverter.class})
        private Date todo_date;
        @ColumnInfo(name = "Priority")
        private int priority;
        @ColumnInfo(name = "Status")
        private boolean is_completed;
        @Ignore
        public ETodo() {
        }

        public ETodo(@NonNull String title, String description, Date todo_date, int priority, boolean is_completed) {
            this.title = title;
            this.description = description;
            this.todo_date = todo_date;
            this.priority = priority;
            this.is_completed = is_completed;
        }

        @NonNull
        public String getTitle() {
            return title;
        }

        public void setTitle(@NonNull String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Date getTodo_date() {
            return todo_date;
        }

        public void setTodo_date(Date todo_date) {
            this.todo_date = todo_date;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public boolean isIs_completed() {
            return is_completed;
        }

        public void setIs_completed(boolean is_completed) {
            this.is_completed = is_completed;
        }
    }


