package com.intermediachallenge.data.model

import java.util.*

data class CharacterModel (var id: Int,
                           var name: String,
                           var description: String,
                           var modified: Date,
                           var resourceURI: String,
//                           var urls: List<String>,
                           var thumbnail: Thumbnail,
                           var events: EventModel)