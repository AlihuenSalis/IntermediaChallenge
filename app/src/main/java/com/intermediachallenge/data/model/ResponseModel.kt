package com.intermediachallenge.data.model

data class ResponseModel(var code:Int,
                         var status:String,
                         var copyright:String,
                         var attributionText:String,
//                         var attributionHTML:String,
                         var etag:String,
                         var data:DataModel?)