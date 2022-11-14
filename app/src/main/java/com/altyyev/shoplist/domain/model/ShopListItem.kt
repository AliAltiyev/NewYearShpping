package com.altyyev.shoplist.domain.model

data class ShopListItem(
    val id: Int?,
    val name: String,
    val description: String,
    val itemChecked: Int = 0,
    val listId: Int,
    val itemType: String = "item"
)
