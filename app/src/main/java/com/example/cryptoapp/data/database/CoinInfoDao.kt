package com.example.cryptoapp.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.cryptoapp.data.database.models.CoinInfoDbModel

@Dao
interface CoinInfoDao {

    @Query("SELECT * FROM full_price_list ORDER BY price DESC")
    fun getPriceList(): LiveData<List<CoinInfoDbModel>>

    @Query("SELECT * FROM full_price_list WHERE fromSymbol == :fSyn LIMIT 1")
    fun getPriceInfoAboutCoin(fSyn: String): LiveData<CoinInfoDbModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPriceList(priceList: List<CoinInfoDbModel>)
}