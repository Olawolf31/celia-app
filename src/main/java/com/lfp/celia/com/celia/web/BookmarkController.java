package com.lfp.celia.com.celia.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lfp.celia.com.celia.pojo.Bookmark;
import com.lfp.celia.com.celia.service.BookmarkService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class BookmarkController {
    
@Autowired
private BookmarkService bookmarkService;


    @GetMapping("/bookmarks/all")
    public ResponseEntity<List<Bookmark>> getContacts() {
        List<Bookmark> bookmarks = bookmarkService.getAllBookmarks();
        return new ResponseEntity<>(bookmarks, HttpStatus.OK);
    }

    @GetMapping("/bookmarks/{id}")
    public ResponseEntity<Bookmark> getBookmarkById(@PathVariable  String id) {
        try {
            Bookmark bookmark = bookmarkService.getBookmark(id);
            return new ResponseEntity<>(bookmark, HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/bookmarks")
    public ResponseEntity<HttpStatus> createBookmark(@RequestBody Bookmark entity) {
        //TODO: process POST request
        bookmarkService.createBookmark(entity);
        return new ResponseEntity<>(HttpStatus.CREATED);    
    }

    @PutMapping("/bookmarks/{id}")
    public ResponseEntity<Bookmark> updateBookmark(@PathVariable String id, @RequestBody Bookmark entity) {
        //TODO: process PUT request
        try {
            bookmarkService.updateBookmark(id, entity);
            return new ResponseEntity<Bookmark>(bookmarkService.getBookmark(id), HttpStatus.OK); 
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/bookmarks/{id}")
    public ResponseEntity<HttpStatus> deleteBookmark(@PathVariable String id){
        try {
            bookmarkService.deleteBookmark(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
