package com.erns.sample1.foods.model

import android.content.Context
import android.util.Log
import java.io.BufferedReader
import java.io.InputStreamReader


class Datasource(val context: Context) {
    private val TAG = "Datasource"
    fun loadData(): List<FoodEntity>? {
        val file_name = "foods.csv"
        val input = InputStreamReader(context.assets.open(file_name), "UTF-8")
        val reader = BufferedReader(input)
        //val reader = context.assets.open(file_name).bufferedReader()
        val header = reader.readLine()
//        val data = context.assets.open(file_name).bufferedReader().use {
//            it.readText()
//        }


        Log.d(TAG, "reader")

        return reader.lineSequence()
            .filter { it.isNotBlank() }
            .map {
                //val (codigo,nombre,categoria,agua,proteina,grasa,carbo,energia) = it.split(';')
                val data = it.split(';')
                Log.d(TAG, it)
                FoodEntity(
                    Codigo = data[0],
                    Nombre = data[1],
                    Categoria = data[2],
                    Proteina = data[3],
                    Grasa = data[4],
                    Carbohidrato = data[5],
                    Energia = data[6]
                )
            }.toList()

        //return null

    }
}