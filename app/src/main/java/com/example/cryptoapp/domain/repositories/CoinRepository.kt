package com.example.cryptoapp.domain.repositories

import androidx.lifecycle.LiveData
import com.example.cryptoapp.domain.entities.CoinInfo

interface CoinRepository {

    fun getCoinInfoList(): LiveData<List<CoinInfo>>

    fun getCoinInfo(fromSymbol: String): LiveData<CoinInfo>

    fun loadData()
}