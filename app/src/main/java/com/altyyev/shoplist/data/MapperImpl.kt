package com.altyyev.shoplist.data

import com.altyyev.shoplist.data.entity.NoteItemRoomModel
import com.altyyev.shoplist.data.entity.ShopListItemRoomModel
import com.altyyev.shoplist.data.entity.ShopListNamesRoomModel
import com.altyyev.shoplist.domain.model.NoteItem
import com.altyyev.shoplist.domain.model.ShopListItem
import com.altyyev.shoplist.domain.model.ShopListNames
import com.altyyev.shoplist.domain.model.mapper.EntityMapper


class MapperImpl : EntityMapper<NoteItem, NoteItemRoomModel, ShopListItem,
            ShopListItemRoomModel, ShopListNames, ShopListNamesRoomModel> {

    override fun noteItemRoomEntityMapToDomain(noteItemRoomEntity: NoteItemRoomModel): NoteItem {
        return NoteItem(
            id = noteItemRoomEntity.id,
            title = noteItemRoomEntity.title,
            description = noteItemRoomEntity.description,
            time = noteItemRoomEntity.time,
            category = noteItemRoomEntity.category
        )
    }

    override fun noteItemMapToRoomEntity(noteItem: NoteItem): NoteItemRoomModel {
        return NoteItemRoomModel(
            id = noteItem.id,
            title = noteItem.title,
            description = noteItem.description,
            time = noteItem.time,
            category = noteItem.category
        )
    }

    override fun shopListItemMapToRoomEntity(shopListItemRoomEntity: ShopListItemRoomModel): ShopListItem {
        return ShopListItem(
            id = shopListItemRoomEntity.id,
            name = shopListItemRoomEntity.name,
            description = shopListItemRoomEntity.description,
            itemChecked = shopListItemRoomEntity.itemChecked,
            listId = shopListItemRoomEntity.listId,
            itemType = shopListItemRoomEntity.itemType
        )
    }

    override fun shopListItemRoomModelMapToEntity(shopListItem: ShopListItem): ShopListItemRoomModel {
        return ShopListItemRoomModel(
            id = shopListItem.id,
            name = shopListItem.name,
            description = shopListItem.description,
            itemChecked = shopListItem.itemChecked,
            listId = shopListItem.listId,
            itemType = shopListItem.itemType
        )
    }

    override fun shopListNamesMapToRoomEntity(shopListNamesRoomEntity: ShopListNamesRoomModel): ShopListNames {
        return ShopListNames(
            id = shopListNamesRoomEntity.id,
            name = shopListNamesRoomEntity.name,
            time = shopListNamesRoomEntity.time,
            allItemCounter = shopListNamesRoomEntity.allItemCounter,
            checkedItemCounter = shopListNamesRoomEntity.checkedItemCounter,
            itemIds = shopListNamesRoomEntity.itemIds
        )
    }

    override fun shopListNamesRoomEntityMapToEntity(shopListNames: ShopListNames): ShopListNamesRoomModel {
        return ShopListNamesRoomModel(
            id = shopListNames.id,
            name = shopListNames.name,
            time = shopListNames.time,
            allItemCounter = shopListNames.allItemCounter,
            checkedItemCounter = shopListNames.checkedItemCounter,
            itemIds = shopListNames.itemIds
        )
    }
}