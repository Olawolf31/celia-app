package com.lfp.celia.com.celia.service;

import java.util.List;
import java.util.NoSuchElementException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lfp.celia.com.celia.pojo.Bookmark;
import com.lfp.celia.com.celia.repository.BookmarkRepository;

@Service
public class BookmarkServiceImp implements BookmarkService {
    

    @Autowired
    private BookmarkRepository bookmarkRepository;

    @Override
    public void createBookmark(Bookmark bookmark){
        bookmarkRepository.createBookmark(bookmark);
    }

    @Override
    public Bookmark getBookmark(String id){
       return bookmarkRepository.getBookmark(findIndexById(id));
    }

    @Override
    public List<Bookmark> getAllBookmarks(){
        return bookmarkRepository.getAllBookmarks();
    }

    @Override
    public void deleteBookmark(String id){
        bookmarkRepository.deleteBookmark(findIndexById(id));
    }

    @Override
    public Bookmark updateBookmark(String id, Bookmark bookmark){
        return bookmarkRepository.updateBookmark(findIndexById(id), bookmark);
    }


/*     private int findIndexById(String id) {
        return IntStream.range(0, bookmarkRepository.getAllBookmarks().size())
            .filter(index -> bookmarkRepository.getAllBookmarks().get(index).getId().equals(id))
            .findFirst()
            .orElseThrow();
    } */

    private int findIndexById(String id) {
    List<Bookmark> bookmarks = bookmarkRepository.getAllBookmarks();
    for (int i = 0; i < bookmarks.size(); i++) {
        if (bookmarks.get(i).getId().equals(id)) {
            return i;
        }
    }
    throw new NoSuchElementException("Bookmark not found with id: " + id);
}

}
