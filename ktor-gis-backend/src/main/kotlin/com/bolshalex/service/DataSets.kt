package com.bolshalex.service

import com.bolshalex.dto.DataSet
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class DataSets {
    val client: HttpClient = HttpClient(CIO)

    suspend fun getDataSets(): List<DataSet> {
        val dataSets: List<DataSet> = mutableListOf()
        val response: HttpResponse = client.get("http://classif.gov.spb.ru/api/v2/datasets/?per_page=10") {
            header("Authorization","Token f0e5d8b455c22e1383e930f6110e07cbd137448e")
        }

        return TODO("Provide the return value")
    }
}