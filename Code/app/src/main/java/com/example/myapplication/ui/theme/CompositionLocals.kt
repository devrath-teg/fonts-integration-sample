package com.example.myapplication.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf

// FONT-GROUP: Serif
val LocalSerifOsfProvider = staticCompositionLocalOf { AppTopographyTwo.Serif.Osf.PrimarySerifOsf() }
val LocalSerifScProvider = staticCompositionLocalOf { AppTopographyTwo.Serif.Sc.PrimarySerifSc() }
val LocalSerifLfProvider = staticCompositionLocalOf { AppTopographyTwo.Serif.Lf.PrimarySerifLf() }
// FONT-GROUP: Serif
val LocalSansOsfProvider = staticCompositionLocalOf { AppTopographyTwo.Sans.Osf.PrimarySansOsf() }
val LocalSansScProvider = staticCompositionLocalOf { AppTopographyTwo.Sans.Sc.PrimarySansSc() }
val LocalSansLfProvider = staticCompositionLocalOf { AppTopographyTwo.Sans.Lf.PrimarySansLf() }
// FONT-GROUP: Sunday Clarendon
val LocalSundayClarendonOsfProvider = staticCompositionLocalOf { AppTopographyTwo.SundayClarendon.Osf.Secondary1843Osf() }
val LocalSundayClarendonLfProvider = staticCompositionLocalOf { AppTopographyTwo.SundayClarendon.Lf.Secondary1843Lf() }