package com.aditya.RatingDataService.resource;

import com.aditya.RatingDataService.model.Rating;
import com.aditya.RatingDataService.model.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingDataResource {

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable String movieId){
        return new Rating(movieId,1);
    }

    @GetMapping("/user/{userId}")
    public UserRating getUserRating(@PathVariable String userId){
        UserRating userRating = new UserRating();
        userRating.initData(userId);
        return userRating;
    }



}
