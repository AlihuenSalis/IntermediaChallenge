package com.intermediachallenge.data.model

data class DataModel(var offset: Int,
                     var limit: Int,
                     var total: Int,
                     var count: Int,
                     var results: List<CharacterModel>)