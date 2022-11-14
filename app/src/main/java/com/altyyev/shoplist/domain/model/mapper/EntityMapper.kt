package com.altyyev.shoplist.domain.model.mapper


interface EntityMapper<NoteItem, NoteItemRoomModel, ShopListItem, ShopListItemRoomEntity,
        ShopListNames, ShopListNamesRoomEntity> {

    fun noteItemRoomEntityMapToDomain(noteItemRoomEntity: NoteItemRoomModel): NoteItem

    fun noteItemMapToRoomEntity(noteItem: NoteItem): NoteItemRoomModel

    fun shopListItemMapToRoomEntity(shopListItemRoomEntity: ShopListItemRoomEntity): ShopListItem

    fun shopListItemRoomModelMapToEntity(shopListItem: ShopListItem): ShopListItemRoomEntity

    fun shopListNamesMapToRoomEntity(shopListNamesRoomEntity: ShopListNamesRoomEntity): ShopListNames

    fun shopListNamesRoomEntityMapToEntity(shopListNames: ShopListNames): ShopListNamesRoomEntity


}