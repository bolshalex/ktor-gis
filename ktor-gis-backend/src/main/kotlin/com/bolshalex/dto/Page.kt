package com.bolshalex.dto

import kotlinx.serialization.Serializable

/**
 * Страница с данными
 * @param count Общие количество элементов
 * @param next Ссылка на следующую страницу
 * @param previous  Ссылка на предыдущию страницу
 * @param result  Список элементов
 * @param T тип элементов в списке
 *
 * */
@Serializable
data class Page<T>(val count: Int, val next: String?, val previous: String?, val result: List<T>) {
}