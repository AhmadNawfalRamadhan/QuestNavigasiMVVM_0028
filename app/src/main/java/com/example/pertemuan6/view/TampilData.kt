package com.example.pertemuan6.view

import androidx.annotation.OptIn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.pertemuan6.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick:() ->Unit
){
    val items = listOf(
        Pair(stringResource(id = R.string.nama_lengkap),"Contoh Nama"),
        Pair(stringResource(id = R.string.jenis_kelamin),"Lainnya"),
        Pair(stringResource(id = R.string.alamat),"Yogyakarta")
    )
}