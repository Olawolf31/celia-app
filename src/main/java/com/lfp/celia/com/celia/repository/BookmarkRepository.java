package com.lfp.celia.com.celia.repository;

import java.util.ArrayList;
import java.util.List;

import com.lfp.celia.com.celia.pojo.Bookmark;

public class BookmarkRepository {
    

    List<Bookmark> bookmarks = new ArrayList<>();

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
