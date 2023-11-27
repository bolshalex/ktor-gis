package com.bolshalex.dto

import kotlinx.serialization.Serializable

/**
 * Набор данных
 * @param id идентификатор набора
 * @param name имя набора
 * */
@Serializable
data class DataSet(
    val id: Long,
    val name: String
)