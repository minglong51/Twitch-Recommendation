package com.laioffer.jupiter.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FavoriteRequestBody {
    private final Item favoriteItem;

    //new a favorite request body
    //JsonCreator (for constructor) has similar meaning as JsonDeserialize(for builder pattern)
    //use @JsonProperty only convert json(favorite) to Item
    //if putting @JsonPoperty above favorite Item, we can still convert it back from object to jason
    @JsonCreator
    public FavoriteRequestBody(@JsonProperty("favorite") Item favoriteItem) {
        this.favoriteItem = favoriteItem;
    }

    public Item getFavoriteItem() {
        return favoriteItem;
    }
}

