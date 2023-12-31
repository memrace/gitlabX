package com.sozonov.gitlabx.auth.ui.sign_in

import androidx.compose.runtime.Immutable

@Immutable
data class UserState(
    val id: Int? = null,
    val fullName: String? = null,
    val errorMessage: String? = null
)