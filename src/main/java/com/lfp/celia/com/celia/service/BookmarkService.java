package com.lfp.celia.com.celia.service;

import java.util.List;

import com.lfp.celia.com.celia.pojo.Bookmark;

public interface BookmarkService {
    void createBookmark(Bookmark bookmark);
    Bookmark getBookmark(String id);
    void deleteBookmark(String id);
    Bookmark updateBookmark(String id, Bookmark bookmark);
    List<Bookmark> getAllBookmarks();
}