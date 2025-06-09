package com.lfp.celia.com.celia.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lfp.celia.com.celia.pojo.Bookmark;

@Repository
public class BookmarkRepository {

    List<Bookmark> bookmarks = new ArrayList<>();

    public List<Bookmark> getAllBookmarks(){
        return bookmarks;
    }

    public Bookmark getBookmark(int id) {
        return bookmarks.get(id);
    }

    public void createBookmark(Bookmark bookmark){
        bookmarks.add(bookmark);
    }

    public void deleteBookmark(int id){
        bookmarks.remove(id);
    }

    public Bookmark updateBookmark(int id, Bookmark bookmark){
        return bookmarks.set(id, bookmark);
    }

}
