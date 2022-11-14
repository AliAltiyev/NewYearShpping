package com.altyyev.shoplist.domain.model

import java.io.Serializable

data class ShopListNames(
    val id: Int?,
    val name: String,
    val time: String,
    val allItemCounter: Int,
    val checkedItemCounter: Int,
    val itemIds: String
) : Serializable
